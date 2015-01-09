import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import org.stringtemplate.v4.*;

class Variable {
        int type;
	int size;
        String register;
	boolean is_array;
	
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

        public Variable(String register, int type, int size, boolean is_array) {
                this.register = register;
                this.type = type;
		this.size = size;
		this.is_array = is_array;
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
				return "i8*";
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
	private Map<String, String> strings = new HashMap<String, String>();
	private Map<String, Integer> string_lengths = new HashMap<String, Integer>();
        private int labelIndex = 0;
        private int registerIndex = 0;
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
    		     
                    System.err.println("key: " + key + " type: " + variable.getType() + " size: " + variable.getSize() + " register: " + variable.getRegister());}
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
			mem.get(identifier).setSize(text.length());
                }

		ST template = new ST(
		        "<mem_register> = private unnamed_addr constant [<text_lenght> x i8] c\"<text>\" \n"
		);
		template.add("mem_register", mem_register);
		template.add("text_lenght", text.length());
		template.add("text", text);

		string_declarations.addCode(template.render());
		return  new CodeFragment();
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
		        "<tmp_register> = getelementptr [<length> x <type>]* <mem_register>, i32 <index_register>, i32 <index_register>\n" +
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
				
		
		} else if ( (left.getType() == Variable.BYTE) || 
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
                                                "\\<ret> = zext i1 <r3> to <type> \n"
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
                                                "\\<ret> = zext i1 <r1> to <type>\n"
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
                                                "\\<ret> = zext i1 <r1> to <type>\n"
                                        );
                                        temp3.add("r1", this.generateNewRegister());
					temp3.add("type", type);
                                        code_stub = temp3.render();

                                        break;
				case kebabParser.LRT:
					ST temp4 = new ST(
                                                "<r1> = icmp sle <type> \\<left_val>, \\<right_val>\n" +
                                                "\\<ret> = zext i1 <r1> to <type>\n"
                                        );
                                        temp4.add("r1", this.generateNewRegister());
					temp4.add("type", type);
                                        code_stub = temp4.render();

                                        break;
				case kebabParser.EQ:
					ST temp5 = new ST(
                                                "<r1> = icmp eq <type> \\<left_val>, \\<right_val>\n" +
                                                "\\<ret> = zext i1 <r1> to <type>\n"
                                        );
                                        temp5.add("r1", this.generateNewRegister());
					temp5.add("type", type);
                                        code_stub = temp5.render();

                                        break;
				case kebabParser.NEQ:
					ST temp6 = new ST(
                                                "<r1> = icmp ne <type> \\<left_val>, \\<right_val>\n" +
                                                "\\<ret> = zext i1 <r1> to <type>\n"
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

                                                "\\<ret> = uitofp i1 <r3> to float\n"
                                        );
                                        temp.add("r1", this.generateNewRegister());
                                        temp.add("r2", this.generateNewRegister());
                                        temp.add("r3", this.generateNewRegister());
					temp.add("type", type);
                                        code_stub = temp.render();
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
                return generateBinaryOperatorCodeFragment(
                        visit(ctx.expression(0)),
                        visit(ctx.expression(1)),
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
        public CodeFragment visitString(kebabParser.StringContext ctx) {
		String text = ctx.STRING().getText();
		this.string_length =  text.length();
                CodeFragment code = new CodeFragment();
                code.addCode(String.format(" = private unnamed_addr constant [%d x i8] c\"%s\" \n", this.string_length,  text));
                code.setType(Variable.STRING);
                return code;
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
		Map<String, Variable> mem = findVarTable(id);
		if (mem == null) {
			System.err.println(String.format("Error: idenifier '%s' does not exists", id));
		} else {
			pointer = mem.get(id).register;
			type = mem.get(id).type;
			size = mem.get(id).getSize();
			is_array = mem.get(id).getIsArray();
		
		}

		
		if (is_array) {
			this.type = "i32";
			CodeFragment indexValue = visit(ctx.expression());		
			this.type = "-1";
			ST template = new ST(
				"<indexValue>"+
                        	"<tmp_register> = getelementptr [<size> x <type>]* <pointer>, i32 <index_register>, i32 <index_register>\n" +
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
				 "call i32 @my_puts(i8* getelementptr inbounds ([<length> x i8]* <pointer>, i64 0, i64 0)) nounwind\n"
                	);
			template.add("length", size);
			template.add("pointer", pointer);
			CodeFragment ret = new CodeFragment();
                	ret.addCode(template.render());
			ret.setRegister(pointer);
			ret.setType(type);
                	return ret;
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
			}
		}
		this.array_length = Integer.parseInt(value);
                code.addCode(String.format("%s = add %s 0, %s\n", register, string_type, value));
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
        public CodeFragment visitDouble(kebabParser.DoubleContext ctx) {
                String value = ctx.DOUBLE().getText();
                CodeFragment code = new CodeFragment();
                String register = generateNewRegister();
                code.setRegister(register);

		String string_type = "";
		int int_type = 0;			
		if (this.type == "-1") {
			string_type = "float";
			int_type = Variable.FLOAT;
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
	public CodeFragment visitIf(kebabParser.IfContext ctx) {
		CodeFragment condition = visit(ctx.expression());
		CodeFragment statement_true = visit(ctx.statement(0));
		CodeFragment statement_false = visit(ctx.statement(1));
		ST template = new ST(
			"<condition_code>" +
			"<cmp_reg> = icmp ne i32 <con_reg>, 0\n" +
			"br i1 <cmp_reg>, label %<block_true>, label %<block_false>\n" +
			"<block_true>:\n" +
			"<statement_true_code>" +
			"br label %<block_end>\n" +
			"<block_false>:\n" +
			"<statement_false_code>" +
			"br label %<block_end>\n" +
			"<block_end>:\n" +
			"<ret> = add i32 0, 0\n"
		);
		template.add("condition_code", condition);
		template.add("statement_true_code", statement_true);
		template.add("statement_false_code", statement_false);
		template.add("cmp_reg", this.generateNewRegister());
		template.add("con_reg", condition.getRegister());
		template.add("block_true", this.generateNewLabel());
		template.add("block_false", this.generateNewLabel());
		template.add("block_end", this.generateNewLabel());
		String return_register = generateNewRegister();
		template.add("ret", return_register);
		CodeFragment ret = new CodeFragment();
		ret.setRegister(return_register);
		ret.addCode(template.render());
		return ret;
	}

        @Override
        public CodeFragment visitForCyclus(kebabParser.ForCyclusContext ctx) {
                CodeFragment condition = visit(ctx.expression());
                CodeFragment body = visit(ctx.statement());

                ST template = new ST(
                        "br label %<cmp_label>\n" +
                        "<cmp_label>:\n" +
                        "<condition_code>" +
                        "<cmp_register> = icmp eq i32 <condition_register>, 1\n" +
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
        public CodeFragment visitWhile(kebabParser.WhileContext ctx) {
                CodeFragment condition = visit(ctx.expression());
                CodeFragment body = visit(ctx.statement());

                ST template = new ST(
                        "br label %<cmp_label>\n" +
                        "<cmp_label>:\n" +
                        "<condition_code>" +
                        "<cmp_register> = icmp eq i32 <condition_register>, 1\n" +
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
			"declare i32 @printBoolean(i1)\n" +
                        "declare i32 @printByte(i8)\n" +
			"declare i32 @printShort(i16)\n" +
                        "declare i32 @printInt(i32)\n" +
			"declare i32 @printLong(i64)\n" +
			"declare i32 @printString(i8*)\n" +
                        "declare i32 @printFloat(float)\n" +
                        "declare i32 @printDouble(double)\n" +
                        "declare i32 @printChar(i8)\n" +
			"declare i32 @my_puts(i8*)\n" +
                        "declare i32 @iexp(i32, i32)\n" +
                        "declare float @fexp(float, float)\n" +
                        "declare float @IntToFloat(i32)\n" +
                        "declare i32 @FloatToInt(float)\n" +
			"declare i32 @readInt()\n" +
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
     		mem.put(identifier, new Variable(mem_register, type, 0, false));
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
	public CodeFragment visitString_declare(kebabParser.String_declareContext ctx) {
                String mem_register;
                String code_stub = "";
		
                String identifier = ctx.lvalue().getText();
                Map<String, Variable> mem = this.mem.getFirst();
		mem_register = this.generateNewString();
              	mem.put(identifier, new Variable(mem_register, Variable.STRING, 0, false));
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
     		mem.put(identifier, new Variable(mem_register, type, length,true));
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
		int length = 65536;
                int type =  ctx.type.getType();
                String identifier = ctx.lvalue().getText();
                Map<String, Variable> mem = this.mem.getFirst();

		ST template = new ST("");
		mem_register = this.generateNewSet();
     		mem.put(identifier, new Variable(mem_register, type, length,true));
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
	public CodeFragment visitHash_map_declare(kebabParser.Hash_map_declareContext ctx) {
		String mem_register;
                String code_stub = "";
		int length = 65536;
                int type1 =  ctx.type1.getType();
		int type2 =  ctx.type2.getType();
                String identifier = ctx.lvalue().getText();
                Map<String, Variable> mem = this.mem.getFirst();

		ST template = new ST("");
		mem_register = this.generateNewHashMap();
     		mem.put(identifier, new Variable(mem_register, type1, length, true));
		template = new ST(
			"<mem_register> = global [<length> x <type1>] zeroinitializer \n"
		);
		template.add("mem_register", mem_register);
		template.add("length", length);
      		template.add("type1", Variable.getLLVMType(type1));
		array_declarations.addCode(template.render());
	        return new CodeFragment();
     	}

	/*
        @Override public CodeFragment visitDeclare(kebabParser.DeclareContext ctx) {
                String mem_register;
                String code_stub = "";
		if (kebabParser.TYPE_POLE > 0) {
			CodeFragment value = visit(ctx.expression());		
		};
		
                int type = ctx.type.getType();
                String identifier = ctx.lvalue().getText();
                Map<String, Variable> mem = this.mem.getFirst();

                

		ST template = new ST("");
		if (type == kebabParser.TYPE_ARRAY) {
			mem_register = this.generateNewArray();
              		mem.put(identifier, new Variable(mem_register, type, 1));
			template = new ST(
		                "<mem_register> = global [100 x i32] zeroinitializer \n"
		        );	
			template.add("mem_register", mem_register);
			array_declarations.addCode(template.render());
	                return new CodeFragment();	
		} else if (type == kebabParser.TYPE_STRING) {
			mem_register = this.generateNewString();
              		mem.put(identifier, new Variable(mem_register, type, 1));
	                return new CodeFragment();
		} else {
			mem_register = this.generateNewRegister();
             		mem.put(identifier, new Variable(mem_register, type, 1));
		        template = new ST(
		                "<mem_register> = alloca <type>\n"
		        );
			template.add("mem_register", mem_register);
              		template.add("type", Variable.getLLVMType(type));
			CodeFragment ret = new CodeFragment();
                	ret.addCode(template.render());
                	return ret;
		}
        }
	*/

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
		boolean first = true;
		for (ParamsCodeFragment.Param p: params.getParams()) {
			String delimiter = "";
			if (!first) {
				delimiter = ", ";
			}
			first = false;
			param_list += delimiter + "i32 " + p.register;
			ST template = new ST(
			"<mem_register> = alloca i32\n" +
			"store i32 <value_register>, i32* <mem_register>\n"
			);
			String mem_register = generateNewRegister();
			template.add("mem_register", mem_register);
			template.add("value_register", p.register);
			params_code += template.render();
		      	mem.put(p.identifier, new Variable(mem_register,  Variable.INT, 1, false));
			}
			CodeFragment body_code = visit(ctx.statements());
			ST template = new ST(
			"define i32 <function_name>(<params>) {\n" +
			"start:\n" +
			"<params_code>" +
			"<body>" +
			"}\n"
		);
		mem.put(function_name, new Variable("", 0, 1, false));
		template.add("function_name", function_name);
		template.add("params", param_list);
		template.add("params_code", params+params_code);
		template.add("body", body_code);
		function_declarations.addCode(template.render());
		return new CodeFragment();
	}

	@Override public CodeFragment visitRet(kebabParser.RetContext ctx) {
		CodeFragment res = visit(ctx.expression());
		res.addCode(String.format("ret i32 %s\n", res.getRegister()));
		return res;
	}

	@Override public CodeFragment visitParam_decl(kebabParser.Param_declContext ctx) {
		ParamsCodeFragment code = new ParamsCodeFragment();
		for(kebabParser.LvalueContext p: ctx.lvalue()) {
			String identifier = p.getText();
			code.addParam(generateNewRegister(), identifier);
		}
		return (CodeFragment) code;
	}

	@Override public CodeFragment visitParam_call(kebabParser.Param_callContext ctx) {
		ParamsCodeFragment code = new ParamsCodeFragment();
		for(kebabParser.ExpressionContext p: ctx.expression()) {
		CodeFragment e = visit(p);
		code.addCode(e);
		code.addParam(e.getRegister(), "");
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
		ParamsCodeFragment params = (ParamsCodeFragment) visit(ctx.param_call());
		String param_list = "";
		boolean first = true;
		for (ParamsCodeFragment.Param p: params.getParams()) {
		String delimiter = "";
		if (!first) {
		delimiter = ", ";
		}
		first = false;
		param_list += delimiter + "i32 " + p.register;
		}
		CodeFragment code = new CodeFragment();
		ST template = new ST(
		"<params_code>" +
		"<value_register> = call i32 <function_name>(<params>)\n"
		);
		template.add("function_name", function_name);
		template.add("params_code", params);
		template.add("params", param_list);
		String value_register = generateNewRegister();
		template.add("value_register", value_register);
		code.addCode(template.render());
		code.setRegister(value_register);
		return code;
	}




}
