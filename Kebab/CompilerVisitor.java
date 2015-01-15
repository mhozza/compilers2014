import java.util.HashMap;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Map;
import org.stringtemplate.v4.*;

class Variable {
	String register;
	String index_register;
        int type;
	int type_value;
	int size;
	int index;
	boolean is_array;
	boolean is_set;
	boolean is_hashmap;
	boolean is_foreach;

	public static final int BOOLEAN = kebabParser.TYPE_BOOLEAN;
	public static final int BYTE = kebabParser.TYPE_BYTE;
        public static final int SHORT = kebabParser.TYPE_SHORT;
	public static final int INT = kebabParser.TYPE_INT;
        public static final int LONG = kebabParser.TYPE_LONG;
        public static final int FLOAT = kebabParser.TYPE_FLOAT;
	public static final int DOUBLE = kebabParser.TYPE_DOUBLE;
	public static final int CHAR = kebabParser.TYPE_CHAR;
	public static final int STRING = kebabParser.TYPE_STRING;
	public static final int ARRAY = kebabParser.TYPE_ARRAY;
	public static final int SET = kebabParser.TYPE_SET;
	public static final int HASHMAP = kebabParser.TYPE_HASHMAP;

        public Variable(String register, int type, int type_value, int size, int index, boolean is_array, boolean is_set, boolean is_hashmap, boolean is_foreach, String index_register) 	 {
                this.register = register;
                this.type = type;
		this.type_value = type_value;
		this.size = size;
		this.index = index;
		this.is_array = is_array;
		this.is_set = is_set;
		this.is_hashmap = is_hashmap;
		this.is_foreach = is_foreach;
		this.index_register = index_register;

        }

        public static String getLLVMType(int type) {
		switch (type) {
			case Variable.BOOLEAN: 
				return "i1";
			case Variable.BYTE: 
				return "i8";
			case Variable.SHORT:
				return "i16";
			case Variable.INT:
				return "i32";
			case Variable.LONG: 
				return "i64";
			case Variable.FLOAT:
				return "float";
			case Variable.DOUBLE:
				return "double";
			case Variable.CHAR:
				return "i8";
			case Variable.STRING:
				return "i8*";
			case Variable.ARRAY:
				return "i8*";
			case Variable.SET:
				return "i32";
			case Variable.HASHMAP:
				return "i32";
			default:
				return null;
		}
        }

	public int getSize() {
		return this.size;	
	}

	public void setSize(int size) {
		this.size = size;	
	}

	public int getType() {
		return this.type;	
	}

	public String getRegister() {
		return this.register;	
	}
	
	public boolean getIsArray() {
		return this.is_array;	
	}

	public void setIsArray(boolean is_array) {
		this.is_array = is_array;
	}
}


public class CompilerVisitor extends kebabBaseVisitor<CodeFragment> {
        LinkedList<Map<String, Variable>> mem = new LinkedList<Map<String, Variable>>();
	private Map<String, String> functions = new HashMap<String, String>();


	private boolean stop = false;
        private int labelIndex = 0;
        private int registerIndex = 0;
	private int globalRegisterIndex = 0;
        private int arrayIndex = 0;
	private int functionIndex = 0;
	private int stringIndex = 0;
	private int setIndex = 0;
	private int setHashMap = 0;

	private String type = "-1";

	private int string_length  = 0;
	private int array_length  = 0;
	
	CodeFragment function_declarations = new CodeFragment();

	CodeFragment string_declarations = new CodeFragment();

        CodeFragment array_declarations = new CodeFragment();

        private String generateNewLabel() {
                return String.format("L%d", this.labelIndex++);
        }

        private String generateNewRegister() {
                return String.format("%%R%d", this.registerIndex++);
        }

        private String generateNewGlobalRegister() {
                return String.format("@GR%d", this.globalRegisterIndex++);
        }

        private String generateNewFunction() {
		return String.format("@F%d", this.functionIndex++);
	}

	private String generateNewString() {
		return String.format("@S%d", this.stringIndex++);
	}

	private String generateNewSet() {
		return String.format("@Set%d", this.setIndex++);
	}

	private String generateNewHashMap() {
		return String.format("@HM%d", this.setHashMap++);
	}

        private void addTable() {
                mem.addFirst(new HashMap<String, Variable>());
        }

        private void removeTable() {
                mem.removeFirst();
        }

        private String generateNewArray() {
                return String.format("@A%d", this.arrayIndex++);
        }

        private void printMem() {
            for (Map<String, Variable> table : mem) {
               for (Map.Entry<String, Variable> entry : table.entrySet()) {
		    String key = entry.getKey();
		    Variable variable = entry.getValue();    	
		}	 
            }
	}

        protected Map<String, Variable> findVarTable(String identifier) {
            for (Map<String, Variable> table : mem) {
                if (table.containsKey(identifier)) {
                    return table;
                }
            }
            return null;
        }

	@Override
	public CodeFragment visitPrimitive_assign(kebabParser.Primitive_assignContext ctx) {
		
		
		String mem_register = "!\"Unknown identifier\"";
		int type = 0;
		String identifier = ctx.lvalue().getText();
		Map<String, Variable> mem = findVarTable(identifier);
		if (mem == null) {
			System.err.println(String.format("Error: idenifier '%s' does not exists", identifier));
		} else {
			mem_register = mem.get(identifier).register;
			type = mem.get(identifier).type;
		}
		this.type = Variable.getLLVMType(type);

		CodeFragment value = visit(ctx.expression());
		this.type = "-1";
	
		ST template = new ST(
			"<value_code>" +
			"store <type> <value_register> , <type>* <mem_register>\n"
		);
		template.add("value_code", value);
		template.add("value_register", value.getRegister());
		template.add("mem_register", mem_register);
		template.add("type", Variable.getLLVMType(type));
		CodeFragment ret = new CodeFragment();
		ret.addCode(template.render());
		ret.setRegister(value.getRegister());
		ret.setType(type);
		return ret;
	}
	
	@Override
	public CodeFragment visitString_assign(kebabParser.String_assignContext ctx) {
                String identifier = ctx.lvalue().getText();
		String text = ctx.STRING().getText();
                Map<String, Variable> mem = findVarTable(identifier);
		String mem_register = "!\"Unknown identifier\"";
                int type = 0;
                if (mem == null) {
                        System.err.println(String.format("Error: idenifier '%s' does not exists", identifier));
                } else {
                        mem_register = mem.get(identifier).register;
                        type = mem.get(identifier).type;
			mem.get(identifier).setSize(text.length()+1);
                }

		ST template = new ST(
		        "<mem_register> = private unnamed_addr constant [<text_lenght> x i8] c\"<text>\\00\" \n"
		);
		template.add("mem_register", mem_register);
		template.add("text_lenght", text.length()+1);
		template.add("text", text);

		string_declarations.addCode(template.render());
		return  new CodeFragment();
	}

	@Override
	public CodeFragment visitSet_remove(kebabParser.Set_removeContext ctx) {

		String mem_register = "!\"Unknown identifier\"";
		String index_register = "!\"Unknown identifier\"";
	        int type = 0;
		int length = 0;
		int index = 0;
	        String identifier = ctx.lvalue().getText();
	        Map<String, Variable> mem = findVarTable(identifier);
	        if (mem == null) {
	                System.err.println(String.format("Error: idenifier '%s' does not exists", identifier));
	        } else {
	                mem_register = mem.get(identifier).register;
	                type = mem.get(identifier).type;
			length = mem.get(identifier).size;
			index = mem.get(identifier).index--;
			index_register = mem.get(identifier).index_register;
	        }

		CodeFragment value = visit(ctx.expression());

		String function_name1 = this.generateNewFunction();
		//@indexOfElement
		ST temp = new ST(
			"define i32 <function_name>([<array_length> x <array_type>]* %array, <array_type> %find, i32 %until) {\n" +
			"%cmp = icmp eq i32 0, %until\n" + 
			"br i1 %cmp, label %end, label %start\n" +
			"start:\n" +
			"  br label %loop\n" +
			"loop:\n" +
			"  %i = phi i32 [0, %start], [%j, %continue]\n" +
			"  %j = add i32 %i, 1\n" +
			"  %a = getelementptr [<array_length> x <array_type>]* %array, i32 0, i32 %i\n" +
			"  %a2 = load <array_type>* %a\n" +
			"  %cmp1 = <cmp_operator> <array_type> %a2, %find\n" +
			"  br i1 %cmp1, label %end_suc, label %continue\n" +
			"continue:\n" +
			"  %cmp2 = icmp slt i32 %j, %until\n" +
			"  br i1 %cmp2, label %loop, label %end\n" +
			"end_suc:\n" +
			"  ret i32 %i\n" +
			"end:\n" +
			"  ret i32 -1\n" +
			"}\n"
		);
		temp.add("function_name", function_name1);
		temp.add("array_length", length);
		temp.add("array_type", Variable.getLLVMType(type));
		if (Variable.getLLVMType(type) == "double" || Variable.getLLVMType(type) == "float") {
			temp.add("cmp_operator", "fcmp oeq");
		} else {
			temp.add("cmp_operator", "icmp eq");
		}
		function_declarations.addCode(temp.render());


		String function_name2 = this.generateNewFunction();
		//@removeElements
		temp = new ST(
			"define i32 <function_name>([<array_length> x <array_type>]* %array, i32 %find, i32 %until) {\n" +
			"%cmp = icmp eq i32 0, %until\n" + 
			"br i1 %cmp, label %end2, label %start\n" +
			"start:\n" +
			"  br label %loop\n" +
			"loop:\n" +
			"  %i = phi i32 [%find, %start], [%j, %loop]\n" +
			"  %j = add i32 %i, 1\n" +
			"  %a = getelementptr [<array_length> x <array_type>]* %array, i32 0, i32 %i\n" +
			"  %a2 = getelementptr [<array_length> x <array_type>]* %array, i32 0, i32 %j\n" +
			"  %a3 = load <array_type>* %a2\n" +
			"  store <array_type> %a3, <array_type>* %a\n" +
			"  %cmp2 = icmp ne i32 %j, %until\n" +
			"  br i1 %cmp2, label %loop, label %end\n" +
			"end:\n" +
			"  %a4 = getelementptr [<array_length> x <array_type>]* %array, i32 0, i32 %until\n" +
			"  %a5 = <add_operator> <array_type> <add_value>, <add_value>\n" +
			"  store <array_type> %a5, <array_type>* %a4\n" +
			"  ret i32 0\n" +
			"end2:\n" +
			"  ret i32 0\n" +
			"}\n"
		);
		temp.add("function_name", function_name2);
		temp.add("array_length", length);
		temp.add("array_type", Variable.getLLVMType(type));
		if (Variable.getLLVMType(type) == "double" || Variable.getLLVMType(type) == "float") {
			temp.add("cmp_operator", "fcmp oeq");
			temp.add("add_operator", "fadd");
			temp.add("add_value", "0.0");
		} else {
			temp.add("cmp_operator", "icmp eq");
			temp.add("add_operator", "add");
			temp.add("add_value", "0");
		}
		function_declarations.addCode(temp.render());
	
	        ST template = new ST(
		        "<value_code>" +
			"<tmp> = load i32* <index_register>\n" +
		        "<mem_register> = call i32 <function_name1>([<array_length> x <array_type>]*  <identifier>, <array_type> <search_value>, i32 <tmp>)\n" +
			"<tmp2> = icmp eq i32 <mem_register>, -1\n" + 
			"br i1 <tmp2>, label %<block_end>, label %<block_ok>\n" +
			"<block_ok>:\n" +
			"call i32 <function_name2>([<array_length> x <array_type>]*  <identifier>, i32 <mem_register>, i32 <tmp>)\n" +
			"<tmp3> = sub i32 <tmp>, 1\n" +
			"store i32 <tmp3>, i32* <index_register>\n" +
			"br label %<block_end>\n" +
			"<block_end>:\n" +
			"<ret> = add i1 0, 1\n"			
		);
		template.add("value_code", value);
		template.add("index_register", index_register);
		template.add("tmp", this.generateNewRegister());
		template.add("tmp2", this.generateNewRegister());
		template.add("tmp3", this.generateNewRegister());
		template.add("search_value", value.getRegister());
		template.add("identifier", mem_register);
		template.add("function_name1", function_name1);
		template.add("function_name2", function_name2);
		template.add("block_ok", this.generateNewLabel());
		template.add("block_end", this.generateNewLabel());
		template.add("mem_register", this.generateNewRegister());
		template.add("array_length", length);
		template.add("array_type", Variable.getLLVMType(type));
		template.add("ret", generateNewRegister());
		

		CodeFragment ret = new CodeFragment();
		ret.addCode(template.render());
		ret.setRegister(value.getRegister());
		ret.setType(type);
		return ret;
	}

	@Override
	public CodeFragment visitSetSize(kebabParser.SetSizeContext ctx) {
		String mem_register = "!\"Unknown identifier\"";
		String index_register = "!\"Unknown identifier\"";
	        int type = 0;
		int length = 0;
		int index = 0;
	        String identifier = ctx.lvalue().getText();
	        Map<String, Variable> mem = findVarTable(identifier);
	        if (mem == null) {
	                System.err.println(String.format("Error: idenifier '%s' does not exists", identifier));
	        } else {
	                mem_register = mem.get(identifier).register;
	                type = mem.get(identifier).type;
			length = mem.get(identifier).size;
			index_register = mem.get(identifier).index_register;

	        }
				
	
		ST template = new ST(
			"<tmp> = load i32* <index_register>\n" +
		        "<ret> = add i32 <tmp>, 0\n" 
		);

		template.add("index_register", index_register);
		template.add("tmp", this.generateNewRegister());
		String ret_register = generateNewRegister();
		template.add("ret", ret_register);
		

		CodeFragment ret = new CodeFragment();
		ret.addCode(template.render());
		ret.setRegister(ret_register);
		ret.setType(Variable.SET);
		return ret;
	}

	@Override
	public CodeFragment visitSetContains(kebabParser.SetContainsContext ctx) {
		String mem_register = "!\"Unknown identifier\"";
		String index_register = "!\"Unknown identifier\"";
	        int type = 0;
		int length = 0;
		int index = 0;
	        String identifier = ctx.lvalue().getText();
	        Map<String, Variable> mem = findVarTable(identifier);
	        if (mem == null) {
	                System.err.println(String.format("Error: idenifier '%s' does not exists", identifier));
	        } else {
	                mem_register = mem.get(identifier).register;
	                type = mem.get(identifier).type;
			length = mem.get(identifier).size;
			index_register = mem.get(identifier).index_register;

	        }
				
		this.type = "i32";
		CodeFragment value = visit(ctx.expression());


		String function_name1 = this.generateNewFunction();
		//@indexOfElement
		ST temp = new ST(
			"define i1 <function_name>([<array_length> x <array_type>]* %array, <array_type> %find, i32 %until) {\n" +
			"start:\n" +
			"  br label %loop\n" +
			"loop:\n" +
			"  %i = phi i32 [0, %start], [%j, %continue]\n" +
			"  %j = add i32 %i, 1\n" +
			"  %a = getelementptr [<array_length> x <array_type>]* %array, i32 0, i32 %i\n" +
			"  %a2 = load <array_type>* %a\n" +
			"  %cmp1 = <cmp_operator> eq <array_type> %a2, %find\n" +
			"  br i1 %cmp1, label %end_suc, label %continue\n" +
			"continue:\n" +
			"  %cmp2 = icmp slt i32 %j, %until\n" +
			"  br i1 %cmp2, label %loop, label %end\n" +
			"end_suc:\n" +
			"  ret i1 1\n" +
			"end:\n" +
			"  ret i1 0\n" +
			"}\n"
		);
		temp.add("function_name", function_name1);
		temp.add("array_length", length);
		temp.add("array_type", Variable.getLLVMType(type));
		temp.add("cmp_operator", "icmp");
		function_declarations.addCode(temp.render());
		

		ST template = new ST(
		        "<value_code>" +
			"<tmp> = load i32* <index_register>\n" + 
		        "<ret> = call i1 <function_name1>([<array_length> x <array_type>]*  <identifier>, <array_type> <search_value>, i32 <tmp>)\n" 
		);
		template.add("value_code", value);
		template.add("index_register", index_register);
		template.add("search_value", value.getRegister());
		template.add("identifier", mem_register);
		template.add("function_name1", function_name1);
		template.add("block_ok", this.generateNewLabel());
		template.add("block_end", this.generateNewLabel());
		template.add("mem_register", this.generateNewRegister());
		template.add("tmp", this.generateNewRegister());
		template.add("array_length", length);
		template.add("array_type", Variable.getLLVMType(type));
		String ret_register = generateNewRegister();
		template.add("ret", ret_register);
		

		CodeFragment ret = new CodeFragment();
		ret.addCode(template.render());
		ret.setRegister(ret_register);
		ret.setType(type);
		return ret;
	}

	@Override
	public CodeFragment visitSet_assign(kebabParser.Set_assignContext ctx) {

		String mem_register = "!\"Unknown identifier\"";
		String index_register = "";
	        int type = 0;
		int length = 0;
		int index = 0;
	        String identifier = ctx.lvalue().getText();
	        Map<String, Variable> mem = findVarTable(identifier);
	        if (mem == null) {
	                System.err.println(String.format("Error: idenifier '%s' does not exists", identifier));
	        } else {
	                mem_register = mem.get(identifier).register;
	                type = mem.get(identifier).type;
			length = mem.get(identifier).size;
			index = mem.get(identifier).index++;
			index_register = mem.get(identifier).index_register;
	        }

		CodeFragment value = visit(ctx.expression());
		
	
	        ST template = new ST(
		        "<value_code>" +
			"<tmp> = load i32* <index_register>\n" +
                        "<tmp2> = add i32 <tmp>, 1\n" +
			"store i32 <tmp2>, i32* <index_register>\n" +
		        "<tmp_register> = getelementptr [<length> x <type>]* <mem_register>, i32 0, i32 <tmp>\n" +
			"store <type> <value_register>, <type>* <tmp_register>\n"
		);
		template.add("tmp", this.generateNewRegister());
		template.add("tmp2", this.generateNewRegister());
		template.add("tmp3", this.generateNewRegister());
		template.add("value_code", value);
		template.add("length", length);
		template.add("value_register", value.getRegister());
		template.add("tmp_register", this.generateNewRegister());
		template.add("mem_register", mem_register);
		template.add("type", Variable.getLLVMType(type));
		template.add("index_register", index_register);

		CodeFragment ret = new CodeFragment();
		ret.addCode(template.render());
		ret.setRegister(value.getRegister());
		ret.setType(type);
		return ret;
	}
/*
	@Override
	public CodeFragment visitHash_map_assign(kebabParser.Hash_map_assignContext ctx) {
		String mem_register = "!\"Unknown identifier\"";
		String index_register = "";
	        int type_key = 0;
	        int type_value = 0;
		int length = 0;
		int index = 0;
	        String identifier = ctx.lvalue().getText();
	        Map<String, Variable> mem = findVarTable(identifier);
	        if (mem == null) {
	                System.err.println(String.format("Error: idenifier '%s' does not exists", identifier));
	        } else {
	                mem_register = mem.get(identifier).register;
	                type_key = mem.get(identifier).type;
			type_value = mem.get(identifier).type_value;
			length = mem.get(identifier).size;
			index = mem.get(identifier).index++;
			index_register = mem.get(identifier).index_register;
	        }

		CodeFragment value_key = visit(ctx.expression(0));
		CodeFragment value_value = visit(ctx.expression(1));
	
	        ST template = new ST(
		        "<value_key>" +
			"<value_value>" +
			"<tmp> = load i32* <index_register>\n" +
                        "<tmp2> = add i32 <tmp>, 1\n" +
			"store i32 <tmp2>, i32* <index_register>\n" +
		        "<tmp_key> = getelementptr [<length> x %HM<type_key>_<type_value>]* <mem_register>, i32 0, i32 <tmp>, <type_key> 0\n" +
			"<tmp_value> = getelementptr [<length> x %HM<type_key>_<type_value>]* <mem_register>, i32 0, i32 <tmp>, <type_value> 1\n" +
			"store <type_key> <value_value_register>, <type_key>* <tmp_key>\n" +
			"store <type_value> <value_value_register>, <type_value>* <tmp_value>\n" 
		);
		template.add("tmp", this.generateNewRegister());
		template.add("tmp2", this.generateNewRegister());
		template.add("tmp3", this.generateNewRegister());
		template.add("value_key", value_key);
		template.add("value_value", value_value);
		template.add("length", length);
		template.add("value_value_register", value_value.getRegister());
		template.add("value_key_register", value_key.getRegister());
		template.add("tmp_key", this.generateNewRegister());
		template.add("tmp_value", this.generateNewRegister());
		template.add("mem_register", mem_register);
		template.add("type_key", Variable.getLLVMType(type_key));
		template.add("type_value", Variable.getLLVMType(type_value));
		template.add("index_register", index_register);

		CodeFragment ret = new CodeFragment();
		ret.addCode(template.render());
		ret.setRegister(value_value.getRegister());
		ret.setType(type_key);
		return ret;
	}
*/
	@Override
	public CodeFragment visitSet_assign_unique(kebabParser.Set_assign_uniqueContext ctx) {
		String mem_register = "!\"Unknown identifier\"";
		String index_register = "";
	        int type = 0;
		int length = 0;
		int index = 0;
	        String identifier = ctx.lvalue().getText();
	        Map<String, Variable> mem = findVarTable(identifier);
	        if (mem == null) {
	                System.err.println(String.format("Error: idenifier '%s' does not exists", identifier));
	        } else {
	                mem_register = mem.get(identifier).register;
	                type = mem.get(identifier).type;
			length = mem.get(identifier).size;
			index = mem.get(identifier).index++;
			index_register = mem.get(identifier).index_register;
	        }

		CodeFragment value = visit(ctx.expression());
		

		String function_name1 = this.generateNewFunction();
		//@indexOfElement
		ST temp = new ST(
			"define i32 <function_name>([<array_length> x <array_type>]* %array, <array_type> %find, i32 %until) {\n" +
			"%cmp = icmp eq i32 0, %until\n" + 
			"br i1 %cmp, label %end, label %start\n" +
			"start:\n" +
			"  br label %loop\n" +
			"loop:\n" +
			"  %i = phi i32 [0, %start], [%j, %continue]\n" +
			"  %j = add i32 %i, 1\n" +
			"  %a = getelementptr [<array_length> x <array_type>]* %array, i32 0, i32 %i\n" +
			"  %a2 = load <array_type>* %a\n" +
			"  %cmp1 = <cmp_operator> <array_type> %a2, %find\n" +
			"  br i1 %cmp1, label %end_suc, label %continue\n" +
			"continue:\n" +
			"  %cmp2 = icmp slt i32 %j, %until\n" +
			"  br i1 %cmp2, label %loop, label %end\n" +
			"end_suc:\n" +
			"  ret i32 %i\n" +
			"end:\n" +
			"  ret i32 -1\n" +
			"}\n"
		);
		temp.add("function_name", function_name1);
		temp.add("array_length", length);
		temp.add("array_type", Variable.getLLVMType(type));
		if (Variable.getLLVMType(type) == "double" || Variable.getLLVMType(type) == "float") {
			temp.add("cmp_operator", "fcmp oeq");
			temp.add("add_operator", "fadd");
			temp.add("add_value", "0.0");
		} else {
			temp.add("cmp_operator", "icmp eq");
			temp.add("add_operator", "add");
			temp.add("add_value", "0");
		}

		function_declarations.addCode(temp.render());




	
	        ST template = new ST(
		        "<value_code>" +
			"<tmp> = load i32* <index_register>\n" +
			"<tmp4> = call i32 <function_name>([<length> x <type>]* <mem_register>, <type> <value_register>, i32 <tmp>)\n" +
			"<tmp5> = icmp eq i32 <tmp4>, -1\n" +
			"br i1 <tmp5>, label %<label_add>, label %<label_end>\n" +
			"<label_add>:\n" +  
                        "  <tmp2> = add i32 <tmp>, 1\n" +
			"  store i32 <tmp2>, i32* <index_register>\n" +
		        "  <tmp_register> = getelementptr [<length> x <type>]* <mem_register>, i32 0, i32 <tmp>\n" +
			"  store <type> <value_register>, <type>* <tmp_register>\n" + 
			"  br label %<label_end>\n" +
			"<label_end>:\n" +
			"  <ret> = add i32 <tmp4>, 0 \n" 
		);
		template.add("tmp", this.generateNewRegister());
		template.add("tmp2", this.generateNewRegister());
		template.add("tmp3", this.generateNewRegister());
		template.add("tmp4", this.generateNewRegister());
		template.add("tmp5", this.generateNewRegister());
		template.add("value_code", value);
		template.add("length", length);
		template.add("value_register", value.getRegister());
		template.add("tmp_register", this.generateNewRegister());
		template.add("mem_register", mem_register);
		template.add("type", Variable.getLLVMType(type));
		template.add("index_register", index_register);
		template.add("label_add", this.generateNewLabel());
		template.add("function_name", function_name1);
		template.add("label_end", this.generateNewLabel());
		String ret_register = this.generateNewRegister();
		template.add("ret", ret_register);

		CodeFragment ret = new CodeFragment();
		ret.addCode(template.render());
		ret.setRegister(ret_register);
		ret.setType(type);
		return ret;
	}

	@Override
	public CodeFragment visitArray_assign(kebabParser.Array_assignContext ctx) {
		String mem_register = "!\"Unknown identifier\"";
	        int type = 0;
		int length = 0;
	        String identifier = ctx.lvalue().getText();
	        Map<String, Variable> mem = findVarTable(identifier);
	        if (mem == null) {
	                System.err.println(String.format("Error: idenifier '%s' does not exists", identifier));
	        } else {
	                mem_register = mem.get(identifier).register;
	                type = mem.get(identifier).type;
			length = mem.get(identifier).getSize();
	        }



		this.type = "i32";
		CodeFragment valueIndex = visit(ctx.expression(0));
		this.type = Variable.getLLVMType(type);
		CodeFragment value = visit(ctx.expression(1));
		this.type = "-1";

	
		
	
	        ST template = new ST(
		        "<value_code>" +
			"<value_index_code>" +
		        "<tmp_register> = getelementptr [<length> x <type>]* <mem_register>, i32 0, i32 <index_register>\n" +
			"store <type> <value_register>, <type>* <tmp_register>\n"
		);
		template.add("value_code", value);
		template.add("value_index_code", valueIndex);
		template.add("length", length);
		template.add("index_register", valueIndex.getRegister());
		template.add("value_register", value.getRegister());
		template.add("tmp_register", this.generateNewRegister());
		template.add("mem_register", mem_register);
		template.add("type", Variable.getLLVMType(type));

		CodeFragment ret = new CodeFragment();
		ret.addCode(template.render());
		ret.setRegister(value.getRegister());
		ret.setType(type);
		return ret;
	}


        @Override
        public CodeFragment visitPrint(kebabParser.PrintContext ctx) {
                CodeFragment code = visit(ctx.expression());
		
		String func = "";
		
		switch (code.getType()) {
				case Variable.BOOLEAN:
                                        func = "printBoolean";
                                        break;
				case Variable.BYTE:
                                        func = "printByte";
					break;
				case Variable.SHORT:
                                        func = "printShort";
                                        break;
				case Variable.INT:
                                        func = "printInt";
                                        break;
                                case Variable.LONG:
                                        func = "printLong";
                                        break;
                                case Variable.FLOAT:
                                        func = "printFloat";
                                        break;
                                case Variable.DOUBLE:
                                        func = "printDouble";
                                        break;
				case Variable.CHAR:
                                        func = "printChar";
                                        break;
				case Variable.STRING:	
					func = "my_puts";
					ST template_string = new ST(
						"<value_code>"
					);
					template_string.add("value_code", code);
					CodeFragment ret = new CodeFragment();
					ret.addCode(template_string.render());
					return ret;
				default:
					func = "printInt";
                                        break;
		}	
		
             
                String type = Variable.getLLVMType(code.getType());
                ST template = new ST(
                        "<value_code>" +
                        "call i32 @<func> (<type> <value>)\n"
                );
                template.add("value_code", code);
                template.add("func", func);
                template.add("type", type);
                template.add("value", code.getRegister());

                CodeFragment ret = new CodeFragment();
                ret.addCode(template.render());
                return ret;
        }

        public CodeFragment generateBinaryOperatorCodeFragment(CodeFragment left, CodeFragment right, Integer operator) {
                if (left.getType() != right.getType()) {
                        System.err.println("Error: incompatible types");
                        return new CodeFragment();
                }

                String code_stub = "<ret> = <instruction> <type> <left_val>, <right_val>\n";
                String instruction = "or";
		String type = Variable.getLLVMType(left.getType());
                if (left.getType() == Variable.BOOLEAN) {
			switch (operator) {
                                case kebabParser.ADD:
                                        instruction = "add";
                                        break;
                                case kebabParser.SUB:
                                        instruction = "sub";
                                        break;
                                case kebabParser.MUL:
                                        instruction = "mul";
                                        break;
                                case kebabParser.DIV:
                                        instruction = "sdiv";
                                        break;
                                case kebabParser.EXP:
                                        instruction = "@iexp";
                                        code_stub = "<ret> = call i1 <instruction>(i1  <left_val>, i1  <right_val>)\n";
                                        break;
                                case kebabParser.AND:
                                        instruction = "and";
					break;
                                case kebabParser.OR:
                                        ST temp = new ST(
                                                "<r1> = icmp ne i1  \\<left_val>, 0\n" +
                                                "<r2> = icmp ne i1  \\<right_val>, 0\n" +
                                                "\\ret = \\<instruction> i1 <r1>, <r2>\n"
                                        );
                                        temp.add("r1", this.generateNewRegister());
                                        temp.add("r2", this.generateNewRegister());
                                        code_stub = temp.render();
                                        break;
				case kebabParser.GR:
					ST temp1 = new ST(
                                                "\\<ret>= icmp sgt i1 \\<left_val>, \\<right_val>\n"
                                        );
                                        code_stub = temp1.render();

                                        break;
				case kebabParser.GRT:
					ST temp2 = new ST(
                                                "\\<ret>= icmp sge i1 \\<left_val>, \\<right_val>\n"
                                        );
                                        code_stub = temp2.render();

                                        break;
				case kebabParser.LR:
					ST temp3 = new ST(
                                                "\\<ret>  = icmp slt i1  \\<left_val>, \\<right_val>\n"
                                        );
                                        code_stub = temp3.render();

                                        break;
				case kebabParser.LRT:
					ST temp4 = new ST(
                                                "\\<ret>  = icmp sle i1 \\<left_val>, \\<right_val>\n"
                                        );
                                        code_stub = temp4.render();

                                        break;
				case kebabParser.EQ:
					ST temp5 = new ST(
                                                "\\<ret> = icmp eq i1 \\<left_val>, \\<right_val>\n"
                                        );
                                        code_stub = temp5.render();

                                        break;
				case kebabParser.NEQ:
					ST temp6 = new ST(
                                                "\\<ret> = icmp ne i1 \\<left_val>, \\<right_val>\n"
                                        );
                                        code_stub = temp6.render();

                                        break;
                        }
				
		
		} else if ( (left.getType() == Variable.CHAR) || 
			(left.getType() == Variable.BYTE) || 
		     (left.getType() == Variable.SHORT) || 
		     (left.getType() == Variable.INT) || 
		     (left.getType() == Variable.LONG) ) 

		{				
                        switch (operator) {

                                case kebabParser.ADD:
                                        instruction = "add";
                                        break;
                                case kebabParser.SUB:
                                        instruction = "sub";
                                        break;
                                case kebabParser.MUL:
                                        instruction = "mul";
                                        break;
                                case kebabParser.DIV:
                                        instruction = "sdiv";
                                        break;
                                case kebabParser.EXP:
                                        instruction = "@iexp";
                                        code_stub = "<ret> = call <type> <instruction>(<type>  <left_val>, <type>  <right_val>)\n";
                                        break;
                                case kebabParser.AND:
                                        instruction = "and";
					break;
				case kebabParser.MOD:
                                        instruction = "srem";
					break;
                                case kebabParser.OR:
                                        ST temp = new ST(
                                                "<r1> = icmp ne <type>  \\<left_val>, 0\n" +
                                                "<r2> = icmp ne <type>  \\<right_val>, 0\n" +
                                                "<r3> = \\<instruction> i1 <r1>, <r2>\n" +
                                                "\\<ret> = zext i1 <r3> to i32 \n"
                                        );
                                        temp.add("r1", this.generateNewRegister());
                                        temp.add("r2", this.generateNewRegister());
                                        temp.add("r3", this.generateNewRegister());
					temp.add("type", type);
                                        code_stub = temp.render();
                                        break;
				case kebabParser.GR:
					ST temp1 = new ST(
                                                "<r1> = icmp sgt <type> \\<left_val>, \\<right_val>\n" +
                                                "\\<ret> = zext i1 <r1> to i32\n"
                                        );
                                        temp1.add("r1", this.generateNewRegister());
					temp1.add("type", type);
                                        code_stub = temp1.render();

                                        break;
				case kebabParser.GRT:
					ST temp2 = new ST(
                                                "<r1> = icmp sge <type> \\<left_val>, \\<right_val>\n" +
                                                "\\<ret> = zext i1 <r1> to i32\n"
                                        );
                                        temp2.add("r1", this.generateNewRegister());
					temp2.add("type", type);
                                        code_stub = temp2.render();

                                        break;
				case kebabParser.LR:
					ST temp3 = new ST(
                                                "<r1> = icmp slt <type> \\<left_val>, \\<right_val>\n" +
                                                "\\<ret> = zext i1 <r1> to i32\n"
                                        );
                                        temp3.add("r1", this.generateNewRegister());
					temp3.add("type", type);
                                        code_stub = temp3.render();

                                        break;
				case kebabParser.LRT:
					ST temp4 = new ST(
                                                "<r1> = icmp sle <type> \\<left_val>, \\<right_val>\n" +
                                                "\\<ret> = zext i1 <r1> to i32\n"
                                        );
                                        temp4.add("r1", this.generateNewRegister());
					temp4.add("type", type);
                                        code_stub = temp4.render();

                                        break;
				case kebabParser.EQ:
					ST temp5 = new ST(
                                                "<r1> = icmp eq <type> \\<left_val>, \\<right_val>\n" +
                                                "\\<ret> = zext i1 <r1> to i32\n"
                                        );
                                        temp5.add("r1", this.generateNewRegister());
					temp5.add("type", type);
                                        code_stub = temp5.render();

                                        break;
				case kebabParser.NEQ:
					ST temp6 = new ST(
                                                "<r1> = icmp ne <type> \\<left_val>, \\<right_val>\n" +
                                                "\\<ret> = zext i1 <r1> to i32\n"
                                        );
                                        temp6.add("r1", this.generateNewRegister());
					temp6.add("type", type);
                                        code_stub = temp6.render();

                                        break;
                        }
                } else {
                        switch (operator) {
                                case kebabParser.ADD:
                                        instruction = "fadd";
                                        break;
                                case kebabParser.SUB:
                                        instruction = "fsub";
                                        break;
                                case kebabParser.MUL:
                                        instruction = "fmul";
                                        break;
                                case kebabParser.DIV:
                                        instruction = "fdiv";
                                        break;
                                case kebabParser.EXP:
                                        instruction = "@fexp";
                                        code_stub = "<ret> = call <type> <instruction>(<type> <left_val>, <type> <right_val>)\n";
                                        break;
                                case kebabParser.AND:
                                        instruction = "and";
					break;
                                case kebabParser.OR:
                                        ST temp = new ST(
                                                "<r1> = fcmp une <type> \\<left_val>, 0.0\n" +
                                                "<r2> = fcmp une <type> \\<right_val>, 0.0\n" +
                                                "<r3> = \\<instruction> i1 <r1>, <r2>\n" +

                                                "\\<ret> = zext i1 <r3> to i32\n"
                                        );
                                        temp.add("r1", this.generateNewRegister());
                                        temp.add("r2", this.generateNewRegister());
                                        temp.add("r3", this.generateNewRegister());
					temp.add("type", type);
                                        code_stub = temp.render();
                                        break;
				case kebabParser.GR:
					ST temp1 = new ST(
                                                "<r1> = fcmp ogt <type> \\<left_val>, \\<right_val>\n" +
                                                "\\<ret> = zext i1 <r1> to i32\n"
                                        );
                                        temp1.add("r1", this.generateNewRegister());
					temp1.add("type", type);
                                        code_stub = temp1.render();

                                        break;
				case kebabParser.GRT:
					ST temp2 = new ST(
                                                "<r1> = fcmp oge <type> \\<left_val>, \\<right_val>\n" +
                                                "\\<ret> = zext i1 <r1> to i32\n"
                                        );
                                        temp2.add("r1", this.generateNewRegister());
					temp2.add("type", type);
                                        code_stub = temp2.render();

                                        break;
				case kebabParser.LR:
					ST temp3 = new ST(
                                                "<r1> = fcmp olt <type> \\<left_val>, \\<right_val>\n" +
                                                "\\<ret> = zext i1 <r1> to i32\n"
                                        );
                                        temp3.add("r1", this.generateNewRegister());
					temp3.add("type", type);
                                        code_stub = temp3.render();

                                        break;
				case kebabParser.LRT:
					ST temp4 = new ST(
                                                "<r1> = fcmp ole <type> \\<left_val>, \\<right_val>\n" +
                                                "\\<ret> = zext i1 <r1> to i32\n"
                                        );
                                        temp4.add("r1", this.generateNewRegister());
					temp4.add("type", type);
                                        code_stub = temp4.render();

                                        break;
				case kebabParser.EQ:
					ST temp5 = new ST(
                                                "<r1> = fcmp oeq <type> \\<left_val>, \\<right_val>\n" +
                                                "\\<ret> = zext i1 <r1> to i32\n"
                                        );
                                        temp5.add("r1", this.generateNewRegister());
					temp5.add("type", type);
                                        code_stub = temp5.render();

                                        break;
				case kebabParser.NEQ:
					ST temp6 = new ST(
                                                "<r1> = fcmp one <type> \\<left_val>, \\<right_val>\n" +
                                                "\\<ret> = zext i1 <r1> to i32\n"
                                        );
                                        temp6.add("r1", this.generateNewRegister());
					temp6.add("type", type);
                                        code_stub = temp6.render();

                                        break;
                        }
                }



                ST template = new ST(
                        "<left_code>" +
                        "<right_code>" +
                        code_stub
                );
                template.add("left_code", left);
                template.add("right_code", right);
                template.add("instruction", instruction);
                template.add("type", type);
                template.add("left_val", left.getRegister());
                template.add("right_val", right.getRegister());
                String ret_register = this.generateNewRegister();
                template.add("ret", ret_register);

                CodeFragment ret = new CodeFragment();
                ret.setRegister(ret_register);
                ret.addCode(template.render());
                ret.setType(left.getType());
                return ret;

        }

        public CodeFragment generateUnaryOperatorCodeFragment(CodeFragment code, Integer operator) {
                if (operator == kebabParser.ADD) {
                        return code;
                }

                String code_stub = "";

                if (code.getType() == Variable.INT) {
                        switch(operator) {
                                case kebabParser.SUB:
                                        code_stub = "<ret> = sub i32 0, <input>\n";
                                        break;
                                case kebabParser.NOT:
                                        ST temp = new ST(
                                                "<r> = icmp eq i32 \\<input>, 0\n" +
                                                "\\<ret> = zext i1 <r> to i32\n"
                                        );
                                        temp.add("r", this.generateNewRegister());
                                        code_stub = temp.render();
                                        break;
                        }
                } else {
                        switch(operator) {
                                case kebabParser.SUB:
                                        code_stub = "<ret> = fsub float 0.0, <input>\n";
                                        break;
                                case kebabParser.NOT:
                                        ST temp = new ST(
                                                "<r> = fcmp ueq float \\<input>, 0.0\n" +
                                                "\\<ret> = uitofp i1 <r> to float\n"
                                        );
                                        temp.add("r", this.generateNewRegister());
                                        code_stub = temp.render();
                                        break;
                        }
                }
                ST template = new ST("<code>" + code_stub);
                String ret_register = this.generateNewRegister();
                template.add("code", code);
                template.add("ret", ret_register);
                template.add("input", code.getRegister());

                CodeFragment ret = new CodeFragment();
                ret.setRegister(ret_register);
                ret.addCode(template.render());
                ret.setType(code.getType());
                return ret;

        }

        @Override
        public CodeFragment visitCmp(kebabParser.CmpContext ctx) {
		CodeFragment left = visit(ctx.expression(0));
		this.type = Variable.getLLVMType(left.getType());
		CodeFragment right = visit(ctx.expression(1));
                return generateBinaryOperatorCodeFragment(
                        left,
                        right,
                        ctx.op.getType()
                );
        }

        @Override
        public CodeFragment visitMod(kebabParser.ModContext ctx) {
                return generateBinaryOperatorCodeFragment(
                        visit(ctx.expression(0)),
                        visit(ctx.expression(1)),
                        ctx.op.getType()
                );
        }


        @Override
        public CodeFragment visitAdd(kebabParser.AddContext ctx) {
                return generateBinaryOperatorCodeFragment(
                        visit(ctx.expression(0)),
                        visit(ctx.expression(1)),
                        ctx.op.getType()
                );
        }

        @Override
        public CodeFragment visitMul(kebabParser.MulContext ctx) {
                return generateBinaryOperatorCodeFragment(
                        visit(ctx.expression(0)),
                        visit(ctx.expression(1)),
                        ctx.op.getType()
                );
        }

        @Override
        public CodeFragment visitExp(kebabParser.ExpContext ctx) {
                return generateBinaryOperatorCodeFragment(
                        visit(ctx.expression(0)),
                        visit(ctx.expression(1)),
                        ctx.op.getType()
                );
        }

        @Override
        public CodeFragment visitPar(kebabParser.ParContext ctx) {
                return visit(ctx.expression());
        }


        @Override
        public CodeFragment visitUna(kebabParser.UnaContext ctx) {
                return generateUnaryOperatorCodeFragment(
                        visit(ctx.expression()),
                        ctx.op.getType()
                );
        }
	

	@Override
	public CodeFragment visitVar(kebabParser.VarContext ctx) {
		String id = ctx.STRING().getText();
		CodeFragment code = new CodeFragment();
		String register = generateNewRegister();
		String pointer = "!\"Unknown identifier\"";
		int size = 0;
		int type = 0;
		boolean is_array = false;
		boolean is_foreach = false;
		Map<String, Variable> mem = findVarTable(id);
		if (mem == null) {
			System.err.println(String.format("Error: idenifier '%s' does not exists", id));
		} else {
			pointer = mem.get(id).register;
			type = mem.get(id).type;
			size = mem.get(id).getSize();
			is_array = mem.get(id).getIsArray();
			is_foreach = mem.get(id).is_foreach;
		
		}

		
		if (is_array) {
			this.type = "i32";
			CodeFragment indexValue = visit(ctx.expression());		
			this.type = "-1";
			ST template = new ST(
				"<indexValue>"+
                        	"<tmp_register> = getelementptr [<size> x <type>]* <pointer>, i32 0, i32 <index_register>\n" +
				"<register> = load <type>* <tmp_register>\n"
                	);
			template.add("indexValue", indexValue);
			template.add("tmp_register", this.generateNewRegister());
			template.add("index_register", indexValue.getRegister());
			template.add("pointer", pointer);
			template.add("register", register);
			template.add("type", Variable.getLLVMType(type));
			template.add("size", size);
			CodeFragment ret = new CodeFragment();
                	ret.addCode(template.render());
			ret.setRegister(register);
			ret.setType(type);
                	return ret;
		} 

		 if (type == kebabParser.TYPE_STRING) {
			ST template = new ST(
				 "call i32 @my_puts(i8* getelementptr inbounds ([<length> x i8]* <pointer>, i32 0, i32 0)) nounwind\n"
                	);
			template.add("length", size);
			template.add("pointer", pointer);
			CodeFragment ret = new CodeFragment();
                	ret.addCode(template.render());
			ret.setRegister(pointer);
			ret.setType(type);
                	return ret;
		}
		
				 
		if ( type == kebabParser.TYPE_HASHMAP || type == kebabParser.TYPE_SET) {
                	return new CodeFragment();
		}
    
		code.addCode(String.format("%s = load %s* %s\n", register, Variable.getLLVMType(type), pointer));
		code.setRegister(register);
		code.setType(type);
		return code;
	}


	@Override
        public CodeFragment visitBool(kebabParser.BoolContext ctx) {
                String value = ctx.getText();
                CodeFragment code = new CodeFragment();
                String register = generateNewRegister();
                code.setRegister(register);
                code.addCode(String.format("%s = add i1 0, %s\n", register, value));
                code.setType(Variable.BOOLEAN);
                return code;
        }

        @Override
        public CodeFragment visitLong(kebabParser.LongContext ctx) {
                String value = ctx.LONG().getText();
                CodeFragment code = new CodeFragment();
                String register = generateNewRegister();
                code.setRegister(register);
		String string_type = "";
		int int_type = 0;			
		if (this.type == "-1") {
			string_type = "i32";
			int_type = Variable.INT;
		} else {
			string_type = this.type;
			switch (this.type) {
				case ("i1") :
					int_type = Variable.BOOLEAN;
					break; 
				case ("i8") :
					int_type = Variable.BYTE;
					break; 
				case ("i16") :
					int_type = Variable.SHORT;
					break; 
				case ("i32") :
					int_type = Variable.INT;
					break; 
				case ("i64") :
					int_type = Variable.LONG;
					break; 
				default :
					int_type = Variable.INT;
					break;
			}
		}
		this.array_length = Integer.parseInt(value);
                code.addCode(String.format("%s = add %s 0, %s\n", register, Variable.getLLVMType(int_type), value));
                code.setType(int_type);
                return code;
        }

	@Override
        public CodeFragment visitChar(kebabParser.CharContext ctx) {
		String value_string = ctx.CHAR().getText();
                char value_char = value_string.charAt(1);;
		int value_ascii = (int) value_char;
                CodeFragment code = new CodeFragment();
                String register = generateNewRegister();
                code.setRegister(register);			
                code.addCode(String.format("%s = add i8 0, %s\n", register, value_ascii));
                code.setType(Variable.CHAR);
                return code;
        }

	@Override
        public CodeFragment visitString(kebabParser.StringContext ctx) {
		String text = ctx.STRING().getText();
		this.string_length =  text.length();
                CodeFragment code = new CodeFragment();
                code.addCode(String.format(" = private unnamed_addr constant [%d x i8] c\"%s\" \n", this.string_length,  text));
                code.setType(Variable.STRING);
                return code;
	}


        @Override
        public CodeFragment visitDouble(kebabParser.DoubleContext ctx) {
                String value = ctx.DOUBLE().getText();
                CodeFragment code = new CodeFragment();
                String register = generateNewRegister();
                code.setRegister(register);

		String string_type = "";
		int int_type = 0;			
		if (this.type == "-1" || this.type == "i32") {
			string_type = "double";
			int_type = Variable.DOUBLE;
		} else {
			string_type = this.type;
			switch (this.type) {
				case ("float") :
					int_type = Variable.FLOAT;
					break; 
				case ("double") :
					int_type = Variable.DOUBLE;
					break; 
			}
		}
                code.addCode(String.format("%s = fadd %s 0.0, %s\n", register, string_type, value));
                code.setType(int_type);
                return code;
        }

        @Override
        public CodeFragment visitBlock(kebabParser.BlockContext ctx) {
                addTable();
                CodeFragment res = visit(ctx.statements());
                removeTable();
                return res;
        }



	@Override
	public CodeFragment visitSwitch(kebabParser.SwitchContext ctx) {
		ArrayList<CodeFragment> conditions = new ArrayList<CodeFragment>();
		ArrayList<CodeFragment> statements = new ArrayList<CodeFragment>();
		for(kebabParser.ExpressionContext s: ctx.expression()) {
			conditions.add(visit(s));
                }
                for(kebabParser.StatementContext s: ctx.statement()) {
			statements.add(visit(s));
                }
		String block_end = this.generateNewLabel();
		ST template = new ST("<condition_code>");
		template.add("condition_code", conditions.get(0));
		String block_default = this.generateNewLabel();


		for(int i=1;i<conditions.size();i++) {

			String type = Variable.getLLVMType(conditions.get(i).getType());
			String cv = "";
			if (type == "float" || type == "double") {
				cv = "fcmp oeq";
			} else {
				cv = "icmp eq";	
			}
		
			template = new ST(
				template.render() + 
				"<case_code>" +
				"<cmp_reg> = <cv> <type> <con_reg>, <case_reg>\n" +
				"br i1 <cmp_reg>, label %<block_true>, label %<block_false>\n" +
				"<block_true>:\n" +
				"<statement_true_code>" +
				"br label %<block_end>\n" + 
				"<block_false>:\n"
			);
			String block_false = this.generateNewLabel();
			template.add("block_false", block_false);  	
			template.add("cv", cv);  
			template.add("type",  type);
			template.add("case_code", conditions.get(i));
			template.add("statement_true_code", statements.get(i-1));
			template.add("cmp_reg", this.generateNewRegister());
			template.add("con_reg", conditions.get(0).getRegister());
			template.add("case_reg", conditions.get(i).getRegister());
			template.add("block_true", this.generateNewLabel());
			template.add("block_end", block_end);		
			if (i + 1 == conditions.size()  ) {  
					template = new ST( 
						template.render() + 
						"<statement_false_code>" +
						"br label %<block_end>\n" 
					);
					template.add("block_false", block_false);
					template.add("statement_false_code", statements.get(i));
					template.add("block_end", block_end);

			}
		}
		String return_register = generateNewRegister();


		template = new ST( 
			template.render() + 
			"<block_end>:\n" +
			"<ret> = add i32 0, 0\n"
		);
		template.add("block_end", block_end);
		template.add("ret", return_register);
		CodeFragment ret = new CodeFragment();
		ret.setRegister(return_register);
		ret.addCode(template.render());
		return ret;
	
	}

	@Override
	public CodeFragment visitIf(kebabParser.IfContext ctx) {

		ArrayList<CodeFragment> conditions = new ArrayList<CodeFragment>();
		ArrayList<CodeFragment> statements = new ArrayList<CodeFragment>();
		for(kebabParser.ExpressionContext s: ctx.expression()) {
			conditions.add(visit(s));
                }
                for(kebabParser.StatementContext s: ctx.statement()) {
			statements.add(visit(s));
                }
	

		ST template = new ST("");

		String block_end = this.generateNewLabel();


		for (int i=0;i<conditions.size();i++) {
			template = new ST(
				template.render() + 
				"<condition_code>" +
				"<cmp_reg> = icmp ne i32 <con_reg>, 0\n" +
				"br i1 <cmp_reg>, label %<block_true>, label %<block_false>\n" +
				"<block_true>:\n" +
				"<statement_true_code>" +
				"br label %<block_end>\n"
			);
			template.add("condition_code", conditions.get(i));
			template.add("type",  Variable.getLLVMType(conditions.get(i).getType()));
			template.add("statement_true_code", statements.get(i));
			template.add("cmp_reg", this.generateNewRegister());
			template.add("con_reg", conditions.get(i).getRegister());
			template.add("block_true", this.generateNewLabel());
			template.add("block_end", block_end);

			 if (i + 1 < conditions.size()) {
				String block_false = this.generateNewLabel();
				template.add("block_false",  block_false);    
				template = new ST( 
					template.render() + 
					"<block_false>:\n"
				);
				template.add("block_false",  block_false);    
			}
		}
		
		if ( conditions.size() == statements.size() -1 ) {
			String block_false = this.generateNewLabel();
			template.add("block_false", block_false);    
			template = new ST( 
				template.render() + 
				"<block_false>:\n" +
				"<statement_false_code>" +
				"br label %<block_end>\n" 
			);
			template.add("block_false", block_false);
			template.add("statement_false_code", statements.get(conditions.size()));
			template.add("block_end", block_end);
		} else {
			template.add("block_false", block_end);    
		}



	
		
		String return_register = generateNewRegister();

		template = new ST( 
			template.render() + 
			"<block_end>:\n" +
			"<ret> = add i32 0, 0\n"
		);
		template.add("block_end", block_end);
		template.add("ret", return_register);
		CodeFragment ret = new CodeFragment();
		ret.setRegister(return_register);
		ret.addCode(template.render());
		return ret;
	
	}

        @Override
        public CodeFragment visitForeach(kebabParser.ForeachContext ctx) {

                String identifier1 = ctx.lvalue(0).getText();
		String identifier2 = ctx.lvalue(1).getText();


		String pointer = "";
		String index_register = "";
		int type = 0;
		int size = 0;
		int index = 0;
		Map<String, Variable> mem = findVarTable(identifier1);
		if (mem == null) {
			System.err.println(String.format("Error: idenifier '%s' does not exists", identifier1));
		} else {
			pointer = mem.get(identifier1).register;
			type = mem.get(identifier1).type;
			size = mem.get(identifier1).getSize();
			index = mem.get(identifier1).index;
			index_register = mem.get(identifier1).index_register;
		
		}
		this.addTable();

		String mem_register = this.generateNewRegister();
		mem.put(identifier2, new Variable(mem_register, type, 0,  0, 0, false, false, false, true, ""));
                CodeFragment body = visit(ctx.statement());
		ST template = new ST(
			"<tmp3> = load i32* <index_register>\n" +
			"<tmp4> = icmp eq i32 <tmp3>, 0\n" +
			"br i1 <tmp4>, label %<block_end>, label %<block_start>\n" +
			"<block_start>:\n" +
			"  br label %<block_loop>\n" +
			"<block_loop>:\n" +
			"  <reg_i> = phi i32 [0, %<block_start>], [<reg_j>, %<block_loop>]\n" +
			"  <reg_j> = add i32 <reg_i>, 1\n" +
			"  <mem_register> = getelementptr [<array_length> x <array_type>]* <set_name>, i32 0, i32 <reg_i>\n" +
			"  <body>" +
			"  <cmp_reg> = icmp ne i32 <reg_j>, <tmp3>\n" +
			"  br i1 <cmp_reg>, label %<block_loop>, label %<block_end>\n" +
			"<block_end>:\n" +
			"<ret> = add i32 0, 0\n"
                );
		template.add("block_start", generateNewLabel());
		template.add("set_name", pointer);
                template.add("block_loop", generateNewLabel());
                template.add("mem_register", mem_register);
		template.add("block_end", generateNewLabel());
                template.add("array_length", size);
                template.add("array_type", Variable.getLLVMType(type));
		template.add("tmp1", generateNewRegister());
		template.add("tmp2", generateNewRegister());
		template.add("tmp3", generateNewRegister());
		template.add("tmp4", generateNewRegister());
                template.add("reg_i", generateNewRegister());
                template.add("reg_j", generateNewRegister());
		template.add("body",  body);
                template.add("cmp_reg", generateNewRegister());
                template.add("index_register", index_register);
                String end_register = generateNewRegister();
                template.add("ret", end_register);

                CodeFragment ret = new CodeFragment();
                ret.addCode(template.render());
                ret.setRegister(end_register);
		this.removeTable();
                return ret;
        }

        @Override
        public CodeFragment visitForCyclus(kebabParser.ForCyclusContext ctx) {
                CodeFragment assign0	 = visit(ctx.primitive_assign(0));
		             CodeFragment condition	 = visit(ctx.expression());
	             CodeFragment assign1	 = visit(ctx.primitive_assign(1));
                CodeFragment body = visit(ctx.statement());

                ST template = new ST(
			"<assign0\n>" +
                        "br label %<cmp_label>\n" +
                        "<cmp_label>:\n" +
                        "<condition_code>" +
                        "<cmp_register> = icmp eq <type> <condition_register>, 1\n" +
                        "br i1 <cmp_register>, label %<body_label>, label %<end_label>\n" +
                        "<body_label>:\n" +
                        "<body_code>" +
			"<assign1\n>" + 
                        "br label %<cmp_label>\n" +
                        "<end_label>:\n" +
                        "<ret> = add i32 0, 0\n"
                );
		template.add("assign0", assign0);
                template.add("cmp_label", generateNewLabel());
                template.add("condition_code", condition);
                template.add("cmp_register", generateNewRegister());
		template.add("type",  Variable.getLLVMType(condition.getType()));
                template.add("condition_register", condition.getRegister());
                template.add("body_label", generateNewLabel());
                template.add("end_label", generateNewLabel());
                template.add("body_code", body);
		template.add("assign1", assign1);
                String end_register = generateNewRegister();
                template.add("ret", end_register);

                CodeFragment ret = new CodeFragment();
                ret.addCode(template.render());
                ret.setRegister(end_register);
                return ret;
        }

        @Override
        public CodeFragment visitDoWhile(kebabParser.DoWhileContext ctx) {
                CodeFragment condition = visit(ctx.expression());
                CodeFragment body = visit(ctx.statement());

                ST template = new ST(
                        "br label %<cmp_label>\n" +
                        "<cmp_label>:\n" +
                        "<condition_code>" +
                        "<cmp_register> = icmp eq <type> <condition_register>, 1\n" +
                        "br i1 <cmp_register>, label %<body_label>, label %<end_label>\n" +
                        "<body_label>:\n" +
                        "<body_code>" +
                        "br label %<cmp_label>\n" +
                        "<end_label>:\n" +
                        "<ret> = add i32 0, 0\n"
                );
                template.add("cmp_label", generateNewLabel());
                template.add("condition_code", condition);
                template.add("cmp_register", generateNewRegister());
                template.add("condition_register", condition.getRegister());
		template.add("type", Variable.getLLVMType(condition.getType()));
                template.add("body_label", generateNewLabel());
                template.add("end_label", generateNewLabel());
                template.add("body_code", body);
                String end_register = generateNewRegister();
                template.add("ret", end_register);

                CodeFragment ret = new CodeFragment();
                ret.addCode(template.render());
                ret.setRegister(end_register);
 		return ret;
        }

        @Override
        public CodeFragment visitWhileDo(kebabParser.WhileDoContext ctx) {
                CodeFragment condition = visit(ctx.expression());
                CodeFragment body = visit(ctx.statement());

                ST template = new ST(
                        "br label %<cmp_label>\n" +
                        "<cmp_label>:\n" +
                        "<condition_code>" +
                        "<cmp_register> = icmp eq <type> <condition_register>, 1\n" +
                        "br i1 <cmp_register>, label %<body_label>, label %<end_label>\n" +
                        "<body_label>:\n" +
                        "<body_code>" +
                        "br label %<cmp_label>\n" +
                        "<end_label>:\n" +
                        "<ret> = add i32 0, 0\n"
                );
                template.add("cmp_label", generateNewLabel());
                template.add("condition_code", condition);
                template.add("cmp_register", generateNewRegister());
                template.add("condition_register", condition.getRegister());
		template.add("type",  Variable.getLLVMType(condition.getType()));
                template.add("body_label", generateNewLabel());
                template.add("end_label", generateNewLabel());
                template.add("body_code", body);
                String end_register = generateNewRegister();
                template.add("ret", end_register);

                CodeFragment ret = new CodeFragment();
                ret.addCode(template.render());
                ret.setRegister(end_register);
                return ret;
        }

        @Override
        public CodeFragment visitNot(kebabParser.NotContext ctx) {
                return generateUnaryOperatorCodeFragment(
                        visit(ctx.expression()),
                        ctx.op.getType()
                );
        }

        @Override
        public CodeFragment visitAnd(kebabParser.AndContext ctx) {
                return generateBinaryOperatorCodeFragment(
                        visit(ctx.expression(0)),
                        visit(ctx.expression(1)),
                        ctx.op.getType()
                );
        }

        @Override
        public CodeFragment visitOr(kebabParser.OrContext ctx) {
                return generateBinaryOperatorCodeFragment(
                        visit(ctx.expression(0)),
                        visit(ctx.expression(1)),
                        ctx.op.getType()
                );
        }

        @Override
        public CodeFragment visitInit(kebabParser.InitContext ctx) {
                addTable();
                CodeFragment body = visit(ctx.statements());

                ST template = new ST(
			"%HMi1_i1 = type { i1, i1 }\n" +
			"%HMi1_i8 = type { i1, i8 }\n" +
			"%HMi1_i16 = type { i1, i16 }\n" +
			"%HMi1_i32 = type { i1, i32 }\n" +
			"%HMi1_i64 = type { i1, i64 }\n" +
			"%HMi1_float = type { i1, float }\n" +
			"%HMi1_double = type { i1, double }\n" +

			"%HMi8_i1 = type { i8, i1 }\n" +
			"%HMi8_i8 = type { i8, i8 }\n" +
			"%HMi8_i16 = type { i8, i16 }\n" +
			"%HMi8_i32 = type { i8, i32 }\n" +
			"%HMi8_i64 = type { i8, i64 }\n" +
			"%HMi8_float = type { i8, float }\n" +
			"%HMi8_double = type { i8, double }\n" +

			"%HMi16_i1 = type { i16, i1 }\n" +
			"%HMi16_i8 = type { i16, i8 }\n" +
			"%HMi16_i16 = type { i16, i16 }\n" +
			"%HMi16_i32 = type { i16, i32 }\n" +
			"%HMi16_i64 = type { i16, i64 }\n" +
			"%HMi16_float = type { i16, float }\n" +
			"%HMi16_double = type { i16, double }\n" +

			"%HMi32_i1 = type { i32, i1 }\n" +
			"%HMi32_i8 = type { i32, i8 }\n" +
			"%HMi32_i16 = type { i32, i16 }\n" +
			"%HMi32_i32 = type { i32, i32 }\n" +
			"%HMi32_i64 = type { i32, i64 }\n" +
			"%HMi32_float = type { i32, float }\n" +
			"%HMi32_double = type { i32, double }\n" +

			"%HMi64_i1 = type { i64, i1 }\n" +
			"%HMi64_i8 = type { i64, i8 }\n" +
			"%HMi64_i16 = type { i64, i16 }\n" +
			"%HMi64_i32 = type { i64, i32 }\n" +
			"%HMi64_i64 = type { i64, i64 }\n" +
			"%HMi64_float = type { i64, float }\n" +
			"%HMi64_double = type { i64, double }\n" +

			"%HMfloat_i1 = type { float, i1 }\n" +
			"%HMfloat_i8 = type { float, i8 }\n" +
			"%HMfloat_i16 = type { float, i16 }\n" +
			"%HMfloat_i32 = type { float, i32 }\n" +
			"%HMfloat_i64 = type { float, i64 }\n" +
			"%HMfloat_float = type { float, float }\n" +
			"%HMfloat_double = type { float, double }\n" +

			"%HMdouble_i1 = type {double, i1 }\n" +
			"%HMdouble_i8 = type {double, i8 }\n" +
			"%HMdouble_i16 = type {double, i16 }\n" +
			"%HMdouble_i32 = type {double, i32 }\n" +
			"%HMdouble_i64 = type {double, i64 }\n" +
			"%HMdouble_float = type {double, float }\n" +
			"%HMdouble_double = type {double, double }\n" +

			"declare i32 @printBoolean(i1)\n" +
                        "declare i32 @printByte(i8)\n" +
			"declare i32 @printShort(i16)\n" +
                        "declare i32 @printInt(i32)\n" +
			"declare i32 @printLong(i64)\n" +
			"declare i32 @printString(i8*)\n" +
                        "declare i32 @printFloat(float)\n" +
			"declare i8* @readString()\n" +
                        "declare i32 @printDouble(double)\n" +
                        "declare i32 @printChar(i8)\n" +
			"declare i32 @my_puts(i8*)\n" +
                        "declare i32 @iexp(i32, i32)\n" +
                        "declare float @fexp(float, float)\n" +
                        "declare float @IntToFloat(i32)\n" +
                        "declare i32 @FloatToInt(float)\n" +
			"declare i32 @readInt()\n" +
			"declare i8 @readChar()\n" +
			"<function_declarations>" +
			"<string_declarations>" +
			"<array_declarations>" +
                        "define i32 @main() {\n" +
                        "start:\n" +
                        "<body_code>" +
                        "ret i32 0\n" +
                        "}\n"
                );
                template.add("body_code", body);
		template.add("function_declarations", function_declarations);
		template.add("string_declarations", string_declarations);
	        template.add("array_declarations", array_declarations);
                CodeFragment code = new CodeFragment();
                code.addCode(template.render());
                code.setRegister(body.getRegister());
                return code;
        }

	

        @Override
        public CodeFragment visitStatements(kebabParser.StatementsContext ctx) {
                CodeFragment code = new CodeFragment();
                for(kebabParser.StatementContext s: ctx.statement()) {
                        CodeFragment statement = visit(s);
                        code.addCode(statement);
                        code.setRegister(statement.getRegister());
                }
                return code;
        }

        @Override
        public CodeFragment visitEmp(kebabParser.EmpContext ctx) {
                return new CodeFragment();
        }



        @Override 
	public CodeFragment visitPrimitive_declare(kebabParser.Primitive_declareContext ctx) {
                String mem_register;
                String code_stub = "";
		
                int type = ctx.type.getType();
                String identifier = ctx.lvalue().getText();
                Map<String, Variable> mem = this.mem.getFirst();

                

		ST template = new ST("");
		mem_register = this.generateNewRegister();
     		mem.put(identifier, new Variable(mem_register, type, 0, 0, 0, false, false, false, false, ""));
		template = new ST(
		        "<mem_register> = alloca <type>\n"
		);
		template.add("mem_register", mem_register);
      		template.add("type", Variable.getLLVMType(type));
		CodeFragment ret = new CodeFragment();
        	ret.addCode(template.render());
        	return ret;	
     	}

        @Override 
	public CodeFragment visitPrimitive_declare_and_assign(kebabParser.Primitive_declare_and_assignContext ctx) {
                String mem_register;
                String code_stub = "";
		
                int type = ctx.type.getType();
                String identifier = ctx.lvalue().getText();
		this.type = Variable.getLLVMType(type); 
		CodeFragment value = visit(ctx.expression());
		this.type = "-1";
                Map<String, Variable> mem = this.mem.getFirst();

                

		ST template = new ST("");
		mem_register = this.generateNewRegister();
     		mem.put(identifier, new Variable(mem_register, type, 0, 0, 0, false, false, false, false, ""));
		template = new ST(
		        "<mem_register> = alloca <type>\n" +
			"<value_code>" +
			"store <type> <value_register> , <type>* <mem_register>\n"
		);
		template.add("value_code", value);
		template.add("value_register", value.getRegister());
		template.add("mem_register", mem_register);
		template.add("type", Variable.getLLVMType(type));
		CodeFragment ret = new CodeFragment();
		ret.addCode(template.render());
		ret.setRegister(value.getRegister());
		ret.setType(type);
		return ret;
     	}

	@Override 
	public CodeFragment visitString_declare_and_assign(kebabParser.String_declare_and_assignContext ctx) {
                String mem_register;
                String code_stub = "";
		
                String identifier = ctx.lvalue().getText();
		String text = ctx.STRING().getText();
                Map<String, Variable> mem = this.mem.getFirst();
		mem_register = this.generateNewString();
              	mem.put(identifier, new Variable(mem_register, Variable.STRING, text.length()+1, 0,  0, false, false, false, false, ""));
		int type = mem.get(identifier).type;
		mem.get(identifier).setSize(text.length()+1);

		ST template = new ST(
		        "<mem_register> = private unnamed_addr constant [<text_lenght> x i8] c\"<text>\\00\" \n"
		);
		template.add("mem_register", mem_register);
		template.add("text_lenght", text.length()+1);
		template.add("text", text);

		string_declarations.addCode(template.render());
		return  new CodeFragment();
     	}

	@Override 
	public CodeFragment visitString_declare(kebabParser.String_declareContext ctx) {
                String mem_register;
                String code_stub = "";
		
                String identifier = ctx.lvalue().getText();
                Map<String, Variable> mem = this.mem.getFirst();
		mem_register = this.generateNewString();
              	mem.put(identifier, new Variable(mem_register, Variable.STRING, 0, 0, 0, false, false, false, false, ""));
	        return new CodeFragment();
     	}

	@Override 
	public CodeFragment visitArray_declare(kebabParser.Array_declareContext ctx) {
		CodeFragment value = visit(ctx.expression());		

		String mem_register;
                String code_stub = "";
		int length = this.array_length;
                int type =  ctx.type.getType();
                String identifier = ctx.lvalue().getText();
                Map<String, Variable> mem = this.mem.getFirst();
		ST template = new ST("");
		mem_register = this.generateNewArray();
     		mem.put(identifier, new Variable(mem_register, type, 0, length, 0, true, false, false, false, ""));
		template = new ST(
			"<mem_register> = global [<length> x <type>] zeroinitializer \n"
		);
		template.add("mem_register", mem_register);
		template.add("length", length);
      		template.add("type", Variable.getLLVMType(type));
		array_declarations.addCode(template.render());
	        return new CodeFragment();
     	}

	@Override 
	public CodeFragment visitSet_declare(kebabParser.Set_declareContext ctx) {
		String mem_register;
                String code_stub = "";
		int length = 32768;
                int type =  ctx.type.getType();
                String identifier = ctx.lvalue().getText();
                Map<String, Variable> mem = this.mem.getFirst();
		String index_register = this.generateNewGlobalRegister();
		ST template = new ST("");
		mem_register = this.generateNewSet();
     		mem.put(identifier, new Variable(mem_register, type, 0, length, 0, false, true, false, false, index_register));
		template = new ST(
			"<index_register> = global i32 0\n" +
			"<mem_register> = global [<length> x <type>] zeroinitializer \n"
		);
		template.add("index_register", index_register);
		template.add("mem_register", mem_register);
		template.add("length", length);
      		template.add("type", Variable.getLLVMType(type));
		array_declarations.addCode(template.render());
	        return new CodeFragment();
     	}

	@Override 
	public CodeFragment visitHash_map_declare(kebabParser.Hash_map_declareContext ctx) {
		String mem_register;
                String code_stub = "";
		int length = 32768;
                int type_key =  ctx.type_key.getType();
                int type_value =  ctx.type_value.getType();
                String identifier = ctx.lvalue().getText();
                Map<String, Variable> mem = this.mem.getFirst();
		String index_register = this.generateNewGlobalRegister();
		ST template = new ST("");
		mem_register = this.generateNewSet();
     		mem.put(identifier, new Variable(mem_register, type_key, type_value, length, 0, false, true, false, false, index_register));
		template = new ST(
			"<index_register> = global i32 0\n" +
			"<mem_register> = global [<length> x %HM<type_key>_<type_value>] zeroinitializer \n"
		);
		template.add("index_register", index_register);
		template.add("mem_register", mem_register);
		template.add("length", length);
		template.add("type_key", Variable.getLLVMType(type_key));
      		template.add("type_value", Variable.getLLVMType(type_value));
		array_declarations.addCode(template.render());
	        return new CodeFragment();
     	}


        @Override public CodeFragment visitIntToFloat(kebabParser.IntToFloatContext ctx) {
                CodeFragment value = visit(ctx.expression());
                CodeFragment code = new CodeFragment();

                ST template = new ST(
                        "<value>" +
                        "<reg> = call float @IntToFloat(i32 <value_register>)"
                );
                template.add("value", value);
                template.add("value_register", value.getRegister());
                String reg = generateNewRegister();
                template.add("reg", reg);

                code.addCode(template.render());
                code.setRegister(reg);
                code.setType(Variable.FLOAT);
                return code;
        }

        @Override public CodeFragment visitFloatToInt(kebabParser.FloatToIntContext ctx) {
                CodeFragment value = visit(ctx.expression());
                CodeFragment code = new CodeFragment();

                ST template = new ST(
                        "<value>" +
                        "<reg> = call i32 @FloatToInt(float <value_register>)"
                );
                template.add("value", value);
                template.add("value_register", value.getRegister());
                String reg = generateNewRegister();
                template.add("reg", reg);

                code.addCode(template.render());
                code.setRegister(reg);
                code.setType(Variable.INT);
                return code;
        }

	@Override public CodeFragment visitReadString(kebabParser.ReadStringContext ctx) {
                CodeFragment code = new CodeFragment();

                ST template = new ST(
                       "<mem_register> = call i8* @readString()\n"
			
                );
		String reg = generateNewRegister();
		template.add("mem_register", reg);
              
                code.addCode(template.render());
                code.setRegister(reg);
                code.setType(Variable.CHAR);
                return code;
        }

	@Override public CodeFragment visitReadChar(kebabParser.ReadCharContext ctx) {
                CodeFragment code = new CodeFragment();

                ST template = new ST(
                       "<mem_register> = call i8 @readChar()\n"
                );
		String reg = generateNewRegister();
		template.add("mem_register", reg);
              	template.add("tmp", generateNewRegister());
                code.addCode(template.render());
                code.setRegister(reg);
                code.setType(Variable.CHAR);
                return code;
        }

        @Override public CodeFragment visitReadInt(kebabParser.ReadIntContext ctx) {
                  CodeFragment code = new CodeFragment();

                ST template = new ST(
                       "<mem_register> = call i32 @readInt()\n"
                );
		String reg = generateNewRegister();
;		template.add("mem_register", reg);
              
                code.addCode(template.render());
                code.setRegister(reg);
                code.setType(Variable.INT);
                return code;
        }

	@Override public CodeFragment visitFunc_decl(kebabParser.Func_declContext ctx) {
		addTable();
		Map<String, Variable> mem = this.mem.getFirst();
		String identifier = ctx.lvalue().getText();
		String function_name = this.generateNewFunction();
		functions.put(identifier, function_name);
		ParamsCodeFragment params = (ParamsCodeFragment) visit(ctx.param_decl());
		String param_list = "";
		String params_code = "";
		String type = Variable.getLLVMType(ctx.type.getType());
		boolean first = true;
		for (ParamsCodeFragment.Param p: params.getParams()) {
			String delimiter = "";
			if (!first) {
				delimiter = ", ";
			}
			first = false;
			String type_variable = Variable.getLLVMType(p.type);

			param_list += delimiter + type_variable + " " + p.register;

			ST template = new ST(
				"<mem_register> = alloca <type>\n" +
				"store <type> <value_register>, <type>* <mem_register>\n"
			);
			String mem_register = generateNewRegister();
			template.add("mem_register", mem_register);
			template.add("value_register", p.register);
			template.add("type", type_variable);
			params_code += template.render();
		      	mem.put(p.identifier, new Variable(mem_register, p.type, 0, 0, 0, false, false, false, false, ""));
		}
		CodeFragment body_code = visit(ctx.statements());
		ST template = new ST(
			"define <type> <function_name>(<params>) {\n" +
			"start:\n" +
			"<params_code>" +
			"<body>" +
			"}\n"
		);
		mem.put(function_name, new Variable("", ctx.type.getType(), 0, 0, 0, false, false, false, false, ""));
		template.add("type", type);
		template.add("function_name", function_name);
		template.add("params", param_list);
		template.add("params_code", params+params_code);
		template.add("body", body_code);
		function_declarations.addCode(template.render());
		return new CodeFragment();
	}

	@Override public CodeFragment visitRet(kebabParser.RetContext ctx) {
		CodeFragment res = visit(ctx.expression());
		String type = Variable.getLLVMType(res.getType());
		res.addCode(String.format("ret %s %s\n", type, res.getRegister()));
		return res;
	}


	@Override public CodeFragment visitParam_decl(kebabParser.Param_declContext ctx) {
		ParamsCodeFragment code = new ParamsCodeFragment();
		int i = 0;
		for(kebabParser.LvalueContext p: ctx.lvalue()) {
			String identifier = p.getText();
			String type = ctx.primitive_types(i).getText();
			int llvm_type = 0;
			switch (type) {
				case "boolean" : llvm_type = kebabParser.TYPE_BOOLEAN; 
								break;
				case "byte" : llvm_type = Variable.BYTE; 
								break;
				case "short" : llvm_type = Variable.SHORT; 
								break;
				case "int" : llvm_type = Variable.INT; 
								break;
				case "long" : llvm_type = Variable.LONG; 
								break;
				case "float" : llvm_type = Variable.FLOAT; 
								break;
				case "double" : llvm_type = Variable.DOUBLE; 
								break;
				case "char": llvm_type = Variable.CHAR; 
								break;
				default: llvm_type = Variable.INT; 
							

			}

			code.addParam(generateNewRegister(), identifier, llvm_type);
			i++;
		}

		return (CodeFragment) code;
	}

	@Override public CodeFragment visitParam_call(kebabParser.Param_callContext ctx) {
		ParamsCodeFragment code = new ParamsCodeFragment();
		for(kebabParser.ExpressionContext p: ctx.expression()) {
			CodeFragment e = visit(p);
			code.addCode(e);
			code.addParam(e.getRegister(), "", e.getType());
		}
		return (CodeFragment) code;
	}

	@Override public CodeFragment visitFunc_call(kebabParser.Func_callContext ctx) {
		String identifier = ctx.lvalue().getText();
		String function_name = "!\"Unknown identifier\"";

		if (!functions.containsKey(identifier)) {
			System.err.println(String.format("Error: idenifier '%s' does not exists", identifier));
		} else {
			function_name = functions.get(identifier);
		}
		

	        Map<String, Variable> mem = findVarTable(function_name);
		String type = Variable.getLLVMType(mem.get(function_name).type);

		ParamsCodeFragment params = (ParamsCodeFragment) visit(ctx.param_call());
		String param_list = "";
		boolean first = true;
		for (ParamsCodeFragment.Param p: params.getParams()) {
			String delimiter = "";
			if (!first) {
				delimiter = ", ";
			}
			first = false;
			param_list += delimiter + " " + Variable.getLLVMType(p.type) + " " + p.register;
		}
		CodeFragment code = new CodeFragment();
		ST template = new ST(
			"<params_code>" +
			"<value_register> = call <type> <function_name>(<params>)\n"
		);
		template.add("function_name", function_name);
		template.add("params_code", params);
		template.add("params", param_list);
		template.add("type", type);
		String value_register = generateNewRegister();
		template.add("value_register", value_register);
		code.addCode(template.render());
		code.setRegister(value_register);
		return code;
	}




}
