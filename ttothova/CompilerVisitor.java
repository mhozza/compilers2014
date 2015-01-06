import java.util.HashMap;
import java.util.Map;
import org.stringtemplate.v4.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class CompilerVisitor extends teeteeBaseVisitor<CodeFragment> {
        private Memory mem = new Memory();
        private Memory root_mem = mem;
        private Map<String,Integer> function_mem = new HashMap<String,Integer>(); // <name, type>
        private int labelIndex = 0;
        private int registerIndex = 0;
        private CodeFragment functionCode = new CodeFragment();
        private int currentFunctionType = Type.INT;
        private String currentContinueLabel = "";
        private String currentBreakLabel = "";
        private String initial_functions = "declare i32 @printInt(i32)\n" +
                        "declare i32 @printFloat(float)\n" +
                        "declare i32 @printChar(i8)\n" +
                        "declare i32 @printString(i32*)\n" +
                        "declare i32 @readInt()\n" +
                        "declare float @readFloat()\n" +
                        "declare i8 @readChar()\n" +
                        "declare i32 @iexp(i32, i32)\n" + 
                        "declare float @fexp(float, float)\n" +
                        "declare i32 @floatToInt(float)\n" +
                        "declare float @intToFloat(i32)\n" +
                        "declare i32* @createIntArray(i32)\n" +
                        "declare void @setArrayItemInt(i32*, i32, i32)\n" +
                        "declare i32 @getArrayItemInt(i32*, i32)\n" +
                        "declare i32* @createFloatArray(i32)\n" +
                        "declare void @setArrayItemFloat(i32*, i32, float)\n" +
                        "declare float @getArrayItemFloat(i32*, i32)\n" +
                        "declare i32* @createCharArray(i32)\n" +
                        "declare void @setArrayItemChar(i32*, i32, i8)\n" +
                        "declare i8 @getArrayItemChar(i32*, i32)\n" +
                        "declare i32* @createArrayType(i32)\n" +
                        "declare void @setArrayItemType(i32*, i32, i32*)\n" +
                        "declare i32* @getArrayItemType(i32*, i32)\n";

        // type: 0..int, 1..float, 2..void, 3..bool, 4..string, 5..char 

        public CompilerVisitor() {
            super();
            function_mem.put("intToFloat", Type.FLOAT);
            function_mem.put("floatToInt", Type.INT);
            function_mem.put("iexp", Type.INT);
            function_mem.put("fexp", Type.FLOAT);
            function_mem.put("printInt", Type.INT);
            function_mem.put("printFloat", Type.INT);
            function_mem.put("printChar", Type.INT);
            function_mem.put("printString", Type.INT);
            function_mem.put("readInt", Type.INT);
            function_mem.put("readFloat", Type.FLOAT);
            function_mem.put("readChar", Type.CHAR);
            function_mem.put("createIntArray", Type.INT);
            function_mem.put("createFloatArray", Type.INT);
            function_mem.put("createCharArray", Type.INT);
            function_mem.put("createArrayType", Type.INT);
            function_mem.put("setArrayItemInt", Type.VOID);
            function_mem.put("setArrayItemFloat", Type.VOID);
            function_mem.put("setArrayItemChar", Type.VOID);
            function_mem.put("setArrayItemType", Type.INT);
            function_mem.put("getArrayItemInt", Type.INT);
            function_mem.put("getArrayItemFloat", Type.FLOAT);
            function_mem.put("getArrayItemChar", Type.CHAR);
            function_mem.put("getArrayItemType", Type.CHAR);
        }

        private String generateNewLabel() {
                return String.format("L%d", this.labelIndex++);
        }

        private String generateNewRegister() {
                return String.format("%%R%d", this.registerIndex++);
        }

		@Override
		public CodeFragment visitInitFunctions(teeteeParser.InitFunctionsContext ctx) {
				CodeFragment body = visit(ctx.functions());

				ST template = new ST(
                        "<initial_functions>" +
						"<body_code>"					
				);
				template.add("initial_functions", initial_functions);
				template.add("body_code", body);

				CodeFragment code = new CodeFragment();
				code.addCode(template.render());
				code.setRegister(body.getRegister());
				return code;
		}

        @Override
        public CodeFragment visitFunctions(teeteeParser.FunctionsContext ctx) {
                CodeFragment code = new CodeFragment();
                for(teeteeParser.FunctionContext s: ctx.function()) {
                        CodeFragment function = visit(s);
                        code.addCode(function);
                        code.setRegister(function.getRegister());
                        code.setType(function.getType());
                }
                return code;
        }

        @Override
        public CodeFragment visitFunction(teeteeParser.FunctionContext ctx) {
        		String identifier = ctx.fname().getText();
        		if (function_mem.containsKey(identifier)) {
        				System.err.println(String.format("Error: function '%s' is already defined", identifier));
        		}
        		String type = ctx.ftype().getText();

        		currentFunctionType = Type.getType(type);
        		function_mem.put(identifier, currentFunctionType);

        		Memory new_mem = new Memory(mem);
        		mem = new_mem;

        		ParametersCodeFragment parameters = (ParametersCodeFragment) visit(ctx.fparameters());
        		CodeFragment body = visit(ctx.block());
        		
                mem = mem.getParent();

                String return_statement = "";
                if (Type.isVoid(type)) {
                		return_statement = "ret void\n";
                } else {
                		String body_register = "0";
                		if (body.getRegister() != null) {
                				body_register = body.getRegister();
                		} else {
                			if (Type.isFloat(type)) {
                				body_register = "0.0";
                			}
                		}
                		return_statement = String.format("ret %s %s\n", Type.getLLVMtype(type), body_register);
                }

                ST template = new ST(
                        "define <type> @<identifier>(<parameters>) {\n" +
                        "start: \n" +
                        "<init_parameters>" +
                        "<body_code>" +
                        "<return_statement>" +
                        "}\n"
                );
                template.add("type", Type.getLLVMtype(type));
                template.add("identifier", identifier);
                template.add("parameters", parameters.getParameters());
                template.add("init_parameters", parameters.getInitParameters());
                template.add("body_code", body);
                template.add("return_statement", return_statement);

                CodeFragment code = new CodeFragment();
                code.addCode(template.render());
                return code;
        }

        @Override
        public CodeFragment visitFparameters(teeteeParser.FparametersContext ctx) {  // nami definovanym funkciam povolime
                ParametersCodeFragment code = new ParametersCodeFragment();            // iba integery
                for(int i = 0; i < ctx.id().size(); i++) {
                		String identifier = ctx.id(i).getText();
                		String type = ctx.type(i).getText();

                        String register = generateNewRegister();
                        String reference_register = generateNewRegister();
                        String llvm_type = Type.getLLVMtype(type);
                        code.addParameter(llvm_type + " " + register);
                        code.addInitParametersCode( String.format("%s = alloca %s\n store %s %s, %s* %s\n",
                        											reference_register, llvm_type,
                            										llvm_type, register, llvm_type, reference_register));
                        mem.put(identifier, reference_register, type);
                }

                return code;
        }

        @Override
        public CodeFragment visitInitStatements(teeteeParser.InitStatementsContext ctx) {
                CodeFragment body = visit(ctx.statements());

                ST template = new ST(
                        "<initial_functions>" +
                        "define i32 @main() {\n" + 
                        "start:\n" + 
                        "<body_code>" + 
                        "ret i32 0\n" +
                        "}\n"
                );
                template.add("initial_functions", initial_functions);
                template.add("body_code", body);

                function_mem.put("main", Type.INT);

                CodeFragment code = new CodeFragment();
                code.addCode(template.render());
                code.setRegister(body.getRegister());
                code.setType("int");
                return code;
        }

        @Override
        public CodeFragment visitStatements(teeteeParser.StatementsContext ctx) {
                CodeFragment code = new CodeFragment();
                for(teeteeParser.StatementContext s: ctx.statement()) {
                        CodeFragment statement = visit(s);
                        code.addCode(statement);
                        code.setRegister(statement.getRegister());
                        code.setType(statement.getType());
                }
                return code;
        }

        @Override 
        public CodeFragment visitBlock(teeteeParser.BlockContext ctx) {
                Memory new_block = new Memory(mem);
                mem = new_block;

                CodeFragment body = visit(ctx.statements());

                mem = new_block.getParent();

                return body;
        }

        @Override
        public CodeFragment visitAssignVar(teeteeParser.AssignVarContext ctx) {
                CodeFragment value = visit(ctx.expression());
                String identifier = ctx.id().getText();

                if (value.getType() != mem.getType(identifier)) {
                    	System.err.println(String.format("Error: identifier %s: type mismatch", identifier));
                }

                String mem_register = "!\"Unknown identifier\"";
                if (!mem.containsKey(identifier)) {
                        System.err.println(String.format("Error: identifier '%s' does not exist", identifier));
                } else {
                        mem_register = mem.get(identifier);
                }

                ST template = new ST(
                        "<value_code>" + 
                        "store <type> <value_register>, <type>* <mem_register>\n"
                );
                template.add("value_code", value);
                template.add("value_register", value.getRegister());
                template.add("mem_register", mem_register);
                template.add("type", value.getTypeString());


                CodeFragment ret = new CodeFragment();
                ret.addCode(template.render());
                ret.setRegister(value.getRegister());
                ret.setType(value.getType());
                return ret;
        }

        @Override
        public CodeFragment visitAssignArray(teeteeParser.AssignArrayContext ctx) {
                String identifier = ctx.id().getText();
                if (!mem.containsKey(identifier)) {
                        System.err.println(String.format("Error: invalid identifier '%s'", identifier));
                }
                String register = mem.get(identifier);

                CodeFragment code = new CodeFragment();
                String old_array_register = generateNewRegister();
                String new_array_register = generateNewRegister();

                CodeFragment exp = visit(ctx.expression(ctx.expression().size()-1));
                if (exp.getType() != mem.getType(identifier)) {
                        System.err.println(String.format("Error: type mismatch durig assignment %s", identifier));                    
                }
                ST start_temp = new ST(
                        "<array> = load i32** <register>\n" +
                        "<expression_code>"
                );
                start_temp.add("array", old_array_register);
                start_temp.add("register", register);
                start_temp.add("expression_code", exp);

                code.addCode(start_temp.render());

                CodeFragment expression;
                for(int i = ctx.expression().size()-2; i > 0; i--) {
                        expression = visit(ctx.expression(i));
                        if (expression.getType() != Type.INT) {
                                System.err.println("Error: excepted type INT for method resize");
                        }

                        ST template = new ST(
                                "<expression_code>" +
                                "<ret> = call i32* @getArrayItemType(i32* <array>, i32 <expression_register>)\n"
                        );
                        template.add("expression_code", expression);
                        template.add("expression_register", expression.getRegister());
                        template.add("array", old_array_register);
                        template.add("ret", new_array_register);

                        code.addCode(template.render());

                        old_array_register = new_array_register;
                        new_array_register = generateNewRegister();
                }

                expression = visit(ctx.expression(0));
                if (expression.getType() != Type.INT) {
                        System.err.println("Error: excepted type INT for method resize");
                }

                ST template = new ST(
                        "<expression_code>" +
                        "call void @setArrayItem<method_type>(i32* <array>, i32 <expression_register>, <type> <exp_reg>)\n"
                );
                template.add("expression_code", expression);
                template.add("expression_register", expression.getRegister());
                template.add("array", old_array_register);
                template.add("method_type", Type.getMethodType(mem.getType(identifier)));
                template.add("type", Type.getLLVMtype(exp.getType()));
                template.add("exp_reg", exp.getRegister());

                code.addCode(template.render());
                code.setRegister(exp.getRegister());
                code.setType(exp.getType());
                return code;
        }
/*
        @Override
        public CodeFragment visitPrint(teeteeParser.PrintContext ctx) {
                CodeFragment code = visit(ctx.expression());
        		if (Type.isVoid(code.getType()) || Type.isBool(code.getType())) {
        				return code;
        		}
                ST template = new ST(
                        "<value_code>" + 
                        "call i32 @<instruction> (<type> <value>)\n"
                );
                template.add("value_code", code);
                template.add("value", code.getRegister());
                template.add("type", code.getTypeString());
                String instruction = "";
                switch (code.getType()) {
                	case 0: instruction = "printInt"; break;
                	case 1: instruction = "printFloat"; break;
                    case 4: instruction = "printString"; break;
                	case 5: instruction = "printChar"; break;
                }
                template.add("instruction", instruction);
                
                CodeFragment ret = new CodeFragment();
                ret.addCode(template.render());
                ret.setType(code.getType());
                return new;
        }
*/
        public CodeFragment generateBinaryOperatorCodeFragment(CodeFragment left, CodeFragment right, Integer operator) {
                Integer type = left.getType();;
                if (left.getType() != right.getType()) {
                    System.err.println(String.format("Error: type mismatch in binary operation"));
                } 

                Integer finalType = type;
                String code_stub = "<ret> = <instruction> <type> <left_val>, <right_val>\n";
                String instruction = "or";
                switch (operator) {
                        case teeteeParser.ADD:
                                if (type == Type.INT || type == Type.BOOL) {
                                        instruction = "add";
                                } else {
                                        instruction = "fadd";
                                }
                                break;
                        case teeteeParser.SUB:
                                if (type == Type.INT || type == Type.BOOL) {
                                        instruction = "sub";
                                } else {
                                        instruction = "fsub";
                                }
                                break;
                        case teeteeParser.MUL:
                                if (type == Type.INT || type == Type.BOOL) {
                                        instruction = "mul";
                                } else {
                                        instruction = "fmul";
                                }
                                break;
                        case teeteeParser.DIV:
                                if (type == Type.INT || type == Type.BOOL) {
                                        instruction = "sdiv";
                                } else {
                                        instruction = "fdiv";
                                }
                                break;
                        case teeteeParser.MOD:
                        		if (type == Type.INT || type == Type.BOOL) {
                        				instruction = "srem";
                        		} else {
                        				instruction = "frem";
                        		}
                        		break;
                        case teeteeParser.EXP:
                        		if (type == Type.BOOL) {
                                        System.err.println(String.format("Error: type mismatch: EXP bool"));
                        		}
                                if (type == Type.INT) {
                                        instruction = "@iexp";
                                } else {
                                        instruction = "@fexp";
                                }
                                code_stub = "<ret> = call <type> <instruction>(<type> <left_val>, <type> <right_val>)\n";
                                break;
                        case teeteeParser.AND:
                                if (type == Type.FLOAT) {
                                        System.err.println(String.format("Error: type mismatch: AND float"));
                                }
                                instruction = "and";
                                finalType = Type.BOOL;
                                break;
                        case teeteeParser.OR:
                                if (type == Type.FLOAT) {
                                        System.err.println(String.format("Error: type mismatch: OR float"));
                                }
                                if (type == Type.BOOL) {
                                		ST template = new ST(
                                				"<r1> = \\<instruction> i1 \\<left_val>, \\<right_val>\n" +
		                                        "\\<ret> = zext i1 <r1> to i32\n"
                                		);
                                		template.add("r1", generateNewRegister());
                                } else {
		                                ST template = new ST(
		                                        "<r1> = icmp ne i32 \\<left_val>, 0\n" +
		                                        "<r2> = icmp ne i32 \\<right_val>, 0\n" +
		                                        "<r3> = \\<instruction> i1 <r1>, <r2>\n" +
		                                        "\\<ret> = zext i1 <r3> to i32\n"
		                                );
		                                template.add("r1", generateNewRegister());
		                                template.add("r2", generateNewRegister());
		                                template.add("r3", generateNewRegister());
		                                code_stub = template.render();                                	
                                }
                                finalType = Type.BOOL;
                                break;
                        case teeteeParser.EQ:
                                switch (type) {
                                        case Type.BOOL:
                                        case Type.INT: instruction = "icmp eq"; break;
                                        case Type.FLOAT: instruction = "fcmp oeq"; break;
                                }
                                finalType = Type.BOOL;
                                break;
                        case teeteeParser.NE:
                                switch (type) {
                                        case Type.BOOL:
                                        case Type.INT: instruction = "icmp ne"; break;
                                        case Type.FLOAT: instruction = "fcmp one"; break;
                                }
                                finalType = Type.BOOL;
                                break;
                        case teeteeParser.LT:
                                switch (type) {
                                        case Type.BOOL:
                                        case Type.INT: instruction = "icmp slt"; break;
                                        case Type.FLOAT: instruction = "fcmp olt"; break;
                                }
                                finalType = Type.BOOL;
                                break;
                        case teeteeParser.LE:
                                switch (type) {
                                        case Type.BOOL:
                                        case Type.INT: instruction = "icmp sle"; break;
                                        case Type.FLOAT: instruction = "fcmp ole"; break;
                                }
                                finalType = Type.BOOL;
                                break;
                        case teeteeParser.GT:
                                switch (type) {
                                        case Type.BOOL:
                                        case Type.INT: instruction = "icmp sgt"; break;
                                        case Type.FLOAT: instruction = "fcmp ogt"; break;
                                }
                                finalType = Type.BOOL;
                                break;
                        case teeteeParser.GE:
                                switch (type) {
                                        case Type.BOOL:
                                        case Type.INT: instruction = "icmp sge"; break;
                                        case Type.FLOAT: instruction = "fcmp oge"; break;
                                }
                                finalType = Type.BOOL;
                                break;

                }
                ST template = new ST(
                        "<left_code>" + 
                        "<right_code>" + 
                        code_stub
                );
                template.add("left_code", left);
                template.add("right_code", right);
                template.add("instruction", instruction);
                template.add("left_val", left.getRegister());
                template.add("right_val", right.getRegister());
                template.add("type", Type.getLLVMtype(left.getType())); 
                String ret_register = this.generateNewRegister();
                template.add("ret", ret_register);
                
                CodeFragment ret = new CodeFragment();
                ret.setRegister(ret_register);
                ret.addCode(template.render());
                ret.setType(finalType);
                return ret;
        
        }
        
        public CodeFragment generateUnaryOperatorCodeFragment(CodeFragment code, Integer operator) {
                if (operator == teeteeParser.ADD) {
                        return code;
                }

                Integer type = code.getType();

                String code_stub = "";
                switch(operator) {
                        case teeteeParser.SUB:
                        		switch (type) {
                        				case Type.INT:   code_stub = "<ret> = sub i32 0, <input>\n"; break;
                        				case Type.BOOL:  code_stub = "<ret> = sub i1  0, <input>\n"; break;
                        				case Type.FLOAT: code_stub = "<ret> = fsub float 0.0, <input>\n"; break;
                        		}
                                break;
                        case teeteeParser.NOT:
                                if (type == Type.FLOAT) {
                                        System.err.println(String.format("Error: type mismatch: NOT float"));
                                }
                                if (type == Type.BOOL) {
                                		code_stub = "<ret> = icmp eq i1 <input>, 0\n";
                                }
                                if (type == Type.INT) {
		                                ST temp = new ST(
		                                        "<r> = icmp eq i32 \\<input>, 0\n" + 
		                                        "\\<ret> = zext i1 <r> to i32\n"
		                                );
		                                temp.add("r", this.generateNewRegister());
		                                code_stub = temp.render();                                	
                                }
                                break;
                }
                ST template = new ST("<code>" + code_stub);
                String ret_register = this.generateNewRegister();
                template.add("code", code);
                template.add("ret", ret_register);
                template.add("input", code.getRegister());

                CodeFragment ret = new CodeFragment();        
                ret.setRegister(ret_register);
                ret.addCode(template.render());
                ret.setType(type);
                return ret;
                
        }

        @Override
        public CodeFragment visitAdd(teeteeParser.AddContext ctx) {
                return generateBinaryOperatorCodeFragment(
                        visit(ctx.expression(0)),
                        visit(ctx.expression(1)),
                        ctx.op.getType()
                );
        }

        @Override 
        public CodeFragment visitMul(teeteeParser.MulContext ctx) {
                return generateBinaryOperatorCodeFragment(
                        visit(ctx.expression(0)),
                        visit(ctx.expression(1)),
                        ctx.op.getType()
                );
        }

        @Override 
        public CodeFragment visitExp(teeteeParser.ExpContext ctx) {
                return generateBinaryOperatorCodeFragment(
                        visit(ctx.expression(0)),
                        visit(ctx.expression(1)),
                        ctx.op.getType()
                );
        }

        @Override
        public CodeFragment visitOr(teeteeParser.OrContext ctx) {
                return generateBinaryOperatorCodeFragment(
                        visit(ctx.expression(0)),
                        visit(ctx.expression(1)),
                        ctx.op.getType()
                );
        }

        @Override 
        public CodeFragment visitNot(teeteeParser.NotContext ctx) {
                return generateUnaryOperatorCodeFragment(
                        visit(ctx.expression()),
                        ctx.op.getType()
                );
        }

        @Override
        public CodeFragment visitAnd(teeteeParser.AndContext ctx) {
                return generateBinaryOperatorCodeFragment(
                        visit(ctx.expression(0)),
                        visit(ctx.expression(1)),
                        ctx.op.getType()
                );
        }

        @Override
        public CodeFragment visitCom(teeteeParser.ComContext ctx) {
                return generateBinaryOperatorCodeFragment(
                        visit(ctx.expression(0)),
                        visit(ctx.expression(1)),
                        ctx.op.getType()
                );
        }

        @Override
        public CodeFragment visitPar(teeteeParser.ParContext ctx) {
                return visit(ctx.expression());
        }


        @Override
        public CodeFragment visitUna(teeteeParser.UnaContext ctx) {
                return generateUnaryOperatorCodeFragment(
                        visit(ctx.expression()),
                        ctx.op.getType()
                );
        }

        @Override
        public CodeFragment visitSimpleVar(teeteeParser.SimpleVarContext ctx) {
                String id = ctx.id().getText();
                CodeFragment code = new CodeFragment();
                String register = generateNewRegister();
                String pointer = "!\"Unknown identifier\"";
                Integer type = 0;
                String typeString = "";
                if (!mem.containsKey(id)) {
                        System.err.println(String.format("Error: identifier '%s' does not exist", id));
                } else {
                        pointer = mem.get(id);
                        type = mem.getType(id);
                        typeString = Type.getLLVMtype(type);
                }
                code.addCode(String.format("%s = load %s* %s\n", register, typeString, pointer));
                code.setRegister(register);
                code.setType(type);
                return code;
        }

        @Override
        public CodeFragment visitInt(teeteeParser.IntContext ctx) {
                String value = ctx.INT().getText();
                CodeFragment code = new CodeFragment();
                String register = generateNewRegister();
                code.setRegister(register);
                code.addCode(String.format("%s = add i32 0, %s\n", register, value));
                code.setType("int");
                return code;
        }

        @Override
        public CodeFragment visitFloat(teeteeParser.FloatContext ctx) {
	            String value = ctx.FLOAT().getText();
	            float f = Float.parseFloat(value);
	            CodeFragment code = new CodeFragment();
	            String register = generateNewRegister();
	            code.setRegister(register);
	            code.addCode(String.format("%s = fadd float 0.0, %s\n", register, Float.toString(f)));
	            code.setType("float");
	            return code;
        }

        @Override
        public CodeFragment visitBool(teeteeParser.BoolContext ctx) {
        		String value = ctx.BOOL().getText();
        		if (value.equals("true")) {
	        			value = "1";
        		} else {
    	    			value = "0";
        		}
        		CodeFragment code = new CodeFragment();
        		String register = generateNewRegister();
        		code.setRegister(register);
        		code.addCode(String.format("%s = add i1 0, %s\n", register, value));
        		code.setType("bool");
        		return code;
        }

        @Override
        public CodeFragment visitChar(teeteeParser.CharContext ctx) {
        		String value = ctx.CHAR().getText();
        		CodeFragment code = new CodeFragment();
        		String register = generateNewRegister();
        		code.setRegister(register);
        		code.addCode(String.format("%s = add i8 0, %d\n", register, (int) value.charAt(1)));
        		code.setType("char");
        		return code;
        }

        @Override 
        public CodeFragment visitString(teeteeParser.StringContext ctx) {
        		String str = ctx.STRING().getText();

        		ST template = new ST(
        				"<size> = add i32 0, <int>\n" +
        				"<string> = call i32* @createCharArray(i32 <size>)\n"
        		);
                template.add("size", generateNewRegister());
                template.add("int", String.valueOf(str.length()-1));
        		String ret = generateNewRegister();
        		template.add("string", ret);

        		CodeFragment code = new CodeFragment();
        		code.addCode(template.render());
        		code.setRegister(ret);
        		code.setType("string");

        		String index = generateNewRegister();
        		code.addCode(String.format("%s = add i32 0, 0\n", index));
        		for(int i = 1; i < str.length(); i++) {
        				ST template_i = new ST(
        						"<index> = add i32 1, <old_index>\n" +
        						"<char> = add i8 0, <chvalue>\n" +
        						"call void @setArrayItemChar(i32* <string>, i32 <index>, i8 <char>)\n"
        				);
        				String old_index = index;
        				index = generateNewRegister();
        				template_i.add("index", index);
        				template_i.add("old_index", old_index);
        				template_i.add("string", ret);
        				template_i.add("char", generateNewRegister());
        				template_i.add("chvalue", String.valueOf((int) str.charAt(i)));

        				code.addCode(template_i.render());
        		}

        		return code;
        }

        @Override
        public CodeFragment visitDeclaration(teeteeParser.DeclarationContext ctx) {
                CodeFragment var = visit(ctx.decl_var());
                if (ctx.expression() == null) {
                        return var;
                }

        		CodeFragment expression = visit(ctx.expression());
        		if (expression.getType() != var.getType()) {
        			System.err.println(String.format("Error: type mismatch in declaration"));
        		}
				ST template = new ST(
                        "<var_code>" +
						"<expression_code>" +
						"store <type> <expression_register>, <type>* <variable_register>\n"
				);               		
                template.add("var_code", var);
				template.add("expression_code", expression);
				template.add("expression_register", expression.getRegister());
				template.add("type", Type.getLLVMtype(var.getType()));
				template.add("variable_register", var.getRegister());

                CodeFragment code = new CodeFragment();
				code.addCode(template.render());
                code.setRegister(var.getRegister());
                code.setType(var.getType());
                return code;            
        }

        @Override
        public CodeFragment visitVarDecl(teeteeParser.VarDeclContext ctx) {
                String identifier = ctx.id().getText();
                String type = ctx.type().getText();

                if (mem.thisContainsKey(identifier)) {
                        System.err.println(String.format("Error: identifier '%s' is already defined", identifier));
                }
                
                String register = generateNewRegister();
                mem.put(identifier, register, Type.getType(type));
                
                ArrayCodeFragment code = new ArrayCodeFragment();
                code.setIdentifier(identifier);
                code.addCode(String.format("%s = alloca %s\n", register, Type.getLLVMtype(type)));
                code.setRegister(register);
                code.setType(type);
                return code;
        }

        @Override
        public CodeFragment visitArrayDecl(teeteeParser.ArrayDeclContext ctx) {
                ArrayCodeFragment var = (ArrayCodeFragment) visit(ctx.decl_var());
                String identifier = var.getIdentifier();
                String register = mem.get(identifier);
                int type = mem.getType(identifier);

                ArrayCodeFragment code = new ArrayCodeFragment();
                
                if (mem.isArray(identifier)) {
                        //code.addCode(String.format("%s = alloca i32*\n", register));
                        code.setType(type);
                        code.setIdentifier(identifier);

                        if (ctx.expression() != null) {
                                CodeFragment expression = visit(ctx.expression());

                                ST template = new ST(
                                        "<expression_code>" +
                                        "<ret> = call i32* @createArrayType(i32 <expression_register>)\n" +
                                        "<iterator> = alloca i32\n" +
                                        "store i32 0, i32* <iterator>\n" +
                                        "br label %<cmp_label>\n" +
                                        "<cmp_label>:\n" +
                                        "<cmp_iter> = load i32* <iterator>\n" +
                                        "<cmp_register> = icmp slt i32 <cmp_iter>, <expression_register>\n" +
                                        "br i1 <cmp_register>, label %<body_label>, label %<end_label>\n" +
                                        "<body_label>:\n" +
                                        "<var_code>" +
                                        "<index> = load i32* <iterator>\n" +
                                        "call void @setArrayItemType(i32* <ret>, i32 <index>, i32* <var_register>)\n" +
                                        "br label %<iterate_label>\n" +
                                        "<iterate_label>:\n" +
                                        "<old_i> = load i32* <iterator>\n" +
                                        "<new_i> = add i32 <old_i>, 1\n" +
                                        "store i32 <new_i>, i32* <iterator>\n" +
                                        "br label %<cmp_label>\n" +
                                        "<end_label>:\n" +
                                        "store i32* <ret>, i32** <register>\n" 
                                );
                                template.add("expression_code", expression);
                                String ret = generateNewRegister();
                                template.add("ret", ret);
                                template.add("expression_register", expression.getRegister());
                                template.add("register", register);
                                template.add("iterator", generateNewRegister());
                                template.add("cmp_label", generateNewLabel());
                                template.add("cmp_iter", generateNewRegister());
                                template.add("cmp_register", generateNewRegister());
                                template.add("body_label", generateNewLabel());
                                template.add("end_label", generateNewLabel());
                                template.add("var_code", var);
                                template.add("index", generateNewRegister());
                                template.add("var_register", var.getRegister());
                                template.add("iterate_label", generateNewLabel());
                                template.add("old_i", generateNewRegister());
                                template.add("new_i", generateNewRegister());
                                template.add("return", generateNewRegister());

                                code.addCode(template.render());
                                code.setRegister(ret);
                        }
                } else {
                        mem.setArrayStatus(identifier, true);

                        register = generateNewRegister();
                        code.addCode(String.format("%s = alloca i32*\n", register));
                        mem.changeRegister(identifier, register);
                        code.setType(type);
                        code.setIdentifier(identifier);

                        if (ctx.expression() != null) {
                                CodeFragment expression = visit(ctx.expression());

                                ST template = new ST(
                                        "<expression_code>" +
                                        "<ret> = call i32* @create<method_type>Array(i32 <expression_register>)\n" +
                                        "store i32* <ret>, i32** <register>\n"
                                );
                                String ret = generateNewRegister();
                                template.add("expression_code", expression);
                                template.add("ret", ret);
                                template.add("method_type", Type.getMethodType(mem.getType(identifier)));
                                template.add("expression_register", expression.getRegister());
                                template.add("register", register);

                                code.addCode(template.render());
                                code.setRegister(ret);
                        }
                }

                return code;
        }

        @Override
        public CodeFragment visitArray_resize(teeteeParser.Array_resizeContext ctx) {
        		String identifier = ctx.id().getText();
       			if (!mem.containsKey(identifier)) {
       					System.err.println(String.format("Error: unknown identifier '%s'", identifier));
       			}
       			String register = mem.get(identifier);
        		CodeFragment expression = visit(ctx.expression());

        		ST template = new ST(
        				"<expression_code>" +
        				"<array> = load i32** <register>\n" +
        				"<ret> = call i32* @createIntArray(i32 <expression_register>)\n" +
        				"store i32* <ret>, i32** <register>\n"
        		);
        		template.add("expression_code", expression);
        		template.add("expression_register", expression.getRegister());
        		template.add("register", register);
        		template.add("array", generateNewRegister());
        		String ret = generateNewRegister();
        		template.add("ret", ret);

        		CodeFragment code = new CodeFragment();
        		code.addCode(template.render());
        		code.setRegister(ret);
        		code.setType(mem.getType(identifier));

        		return code;
        }

        @Override
        public CodeFragment visitArrayVar(teeteeParser.ArrayVarContext ctx) {
        		String identifier = ctx.id().getText();
        		if (!mem.containsKey(identifier)) {
        				System.err.println(String.format("Error: invalid identifier '%s'", identifier));
        		}
        		String register = mem.get(identifier);

                CodeFragment code = new CodeFragment();
                String old_array_register = generateNewRegister();
                String new_array_register = generateNewRegister();
                code.addCode(String.format("%s = load i32** %s\n", old_array_register, register));
                for(int i = ctx.expression().size() - 1; i > -1; i--) {
                        CodeFragment expression = visit(ctx.expression(i));
                        if (expression.getType() != Type.INT) {
                                System.err.println("Error: excepted type INT for method resize");
                        }

                        ST template = new ST(
                                "<expression_code>" +
                                "<ret> = call <type> @getArrayItem<method_type>(i32* <array>, i32 <expression_register>)\n"
                        );
                        template.add("expression_code", expression);
                        template.add("expression_register", expression.getRegister());
                        template.add("array", old_array_register);
                        template.add("ret", new_array_register);

                        if (i > 0) {
                                template.add("method_type", "Type");
                                template.add("type", "i32*");
                        } else {
                                template.add("method_type", Type.getMethodType(mem.getType(identifier)));
                                template.add("type", Type.getLLVMtype(mem.getType(identifier)));
                        }

                        code.addCode(template.render());

                        old_array_register = new_array_register;
                        new_array_register = generateNewRegister();
                }

        		code.setRegister(old_array_register);
        		code.setType(mem.getType(identifier));
        		return code;
        }

        @Override
        public CodeFragment visitReturn_statement(teeteeParser.Return_statementContext ctx) {
        		CodeFragment ret = new CodeFragment();
        
        		if (ctx.expression() != null) {
		                CodeFragment expression = visit(ctx.expression());
		                if (currentFunctionType == Type.VOID || currentFunctionType != expression.getType()) {
		                		System.err.println("Error: invalid return type");
		                }
		
		                ST template = new ST(
		                        "<expression_code>" +
		                        "ret <type> <expression_register>\n"
		                );

		                template.add("expression_code", expression);
		                template.add("expression_register", expression.getRegister());
		                template.add("type", expression.getTypeString());

		                ret.addCode(template.render());
		                ret.setRegister(expression.getRegister());
		                ret.setType(expression.getType());
		                return ret;
        		}

        		ret.addCode("ret void\n");
        		ret.setType("void");
        		return ret;
        }

		private String generateComparingInstruction(int type, String cmp_register, String value_register) {
			if (type == Type.FLOAT) {
				return String.format("%s = fcmp one float %s, 0.0\n", cmp_register, value_register);
            } else {
                return String.format("%s = icmp ne %s %s, 0\n", cmp_register, Type.getLLVMtype(type), value_register);
			}
		}

		@Override
		public CodeFragment visitIf_statement(teeteeParser.If_statementContext ctx) { 
				CodeFragment code = new CodeFragment();
				String end_label = generateNewLabel();

				for (int i = 0; i < ctx.expression().size(); i++) {
						CodeFragment condition = visit(ctx.expression(i));
						CodeFragment statement_true = visit(ctx.if_form(i));

						ST template = new ST(
								"<condition_code>" +
								"<cmp_instruction>" +
								"br i1 <cmp_register>, label %<true_label>, label %<false_label>\n" +
								"<true_label>:\n" +
								"<statement_true_code>" +
								"br label %<end_label>\n" +
								"<false_label>:\n"
						);
						template.add("condition_code", condition);
						String cmp_register = generateNewRegister();
						if (Type.isBool(condition.getType())) {
								template.add("cmp_register", condition.getRegister());
								template.add("cmp_instruction", "");
						} else {
								template.add("cmp_register", cmp_register);
								template.add("cmp_instruction", 
								generateComparingInstruction(condition.getType(), cmp_register, condition.getRegister()));							
						}
						template.add("true_label", generateNewLabel());
						template.add("false_label", generateNewLabel());
						template.add("statement_true_code", statement_true);
						template.add("end_label", end_label);

						code.addCode(template.render());
				}

				if (ctx.expression().size() < ctx.if_form().size()) { // ak existuje vetva ELSE
						CodeFragment statement_false = visit(ctx.if_form(ctx.if_form().size() - 1));

						ST template = new ST(
								"<statement_false_code>" +
								"br label %<end_label>\n"
						);
						template.add("statement_false_code", statement_false);
						template.add("end_label", end_label);

						code.addCode(template.render());
				}

				ST template = new ST(
						"br label %<end_label>\n" +
						"<end_label>:\n" +
						"<ret> = add i32 0, 0\n"
				);
				template.add("end_label", end_label);
				String return_register = generateNewRegister();
				template.add("ret", return_register);

				code.addCode(template.render());
				code.setRegister(return_register);

				return code;
		}

		private CodeFragment WhileDoStatement(CodeFragment condition, CodeFragment body, String jump_instruction) {
                ST template = new ST(
                        jump_instruction + 
                        "<cmp_label>:\n" + 
                        "<condition_code>" +
                        "<cmp_instruction>" + // musi byt integer
                        "br i1 <cmp_register>, label %<body_label>, label %<end_label>\n" + 
                        "<body_label>:\n" + 
                        "<body_code>" + 
                        "br label %<cmp_label>\n" + 
                        "<end_label>:\n" + 
                        "<ret> = add i32 0, 0\n"
                );
                template.add("cmp_label", currentContinueLabel);
                template.add("condition_code", condition);
                String cmp_register = generateNewRegister();
                template.add("cmp_register", cmp_register);
                template.add("cmp_instruction",
                	generateComparingInstruction(condition.getType(), cmp_register, condition.getRegister()));
                template.add("body_label", generateNewLabel());
                template.add("end_label", currentBreakLabel);
                template.add("body_code", body);
                String end_register = generateNewRegister();
                template.add("ret", end_register);
                
                CodeFragment ret = new CodeFragment();
                ret.addCode(template.render());
                ret.setRegister(end_register);
                ret.setType(body.getType());
                return ret;			
		}

        @Override
        public CodeFragment visitWhile(teeteeParser.WhileContext ctx) {
        		String oldContinueLabel = currentContinueLabel;
        		currentContinueLabel = generateNewLabel();
        		String oldBreakLabel = currentBreakLabel;
        		currentBreakLabel = generateNewLabel();

                CodeFragment condition = visit(ctx.expression());
                CodeFragment body = visit(ctx.block());
                String jump_instruction = "br label %<cmp_label>\n";

                CodeFragment code = WhileDoStatement(condition, body, jump_instruction);                

                currentContinueLabel = oldContinueLabel;
                currentBreakLabel = oldBreakLabel;

                return code;
        }

        @Override
        public CodeFragment visitDoWhile(teeteeParser.DoWhileContext ctx) {
        		String oldContinueLabel = currentContinueLabel;
        		currentContinueLabel = generateNewLabel();
        		String oldBreakLabel = currentBreakLabel;
        		currentBreakLabel = generateNewLabel();

	        	CodeFragment condition = visit(ctx.expression());
    	    	CodeFragment body = visit(ctx.block());
        		String jump_instruction = "br label %<body_label>\n";

        		CodeFragment code = WhileDoStatement(condition, body, jump_instruction);

                currentContinueLabel = oldContinueLabel;
                currentBreakLabel = oldBreakLabel;

                return code;
        }

        @Override
        public CodeFragment visitFor_statement(teeteeParser.For_statementContext ctx) {
        		String oldContinueLabel = currentContinueLabel;
        		currentContinueLabel = generateNewLabel();
        		String oldBreakLabel = currentBreakLabel;
        		currentBreakLabel = generateNewLabel();

	        	String identifier = ctx.id().getText();
	        	String register = generateNewRegister();
	        	mem.put(identifier, register, "int");
	        	CodeFragment start = visit(ctx.expression(0));
	        	CodeFragment end = visit(ctx.expression(1));
	        	CodeFragment body = visit(ctx.block());
	        	CodeFragment operation;

	        	if (ctx.expression().size() > 2) {
		        		operation = visit(ctx.expression(2));
	        	} else {
		        		ST template = new ST(
		        				"<operation_i> = load i32* <iterator>\n" +
		        				"<ret_i> = add i32 <operation_i>, 1\n"
		        		);
		        		template.add("operation_i", generateNewRegister());
		        		template.add("iterator", register);
		        		String ret_i = generateNewRegister();
		        		template.add("ret_i", ret_i);

		        		operation = new CodeFragment();
		        		operation.addCode(template.render());
		        		operation.setRegister(ret_i);
	        	}

	        	ST template = new ST(
	        			"<start_exp_code>" +
	        			"<iterator> = alloca i32\n" +
	        			"store i32 <start_exp_register>, i32* <iterator>\n" +
	        			"br label %<cmp_label>\n" +
	        			"<cmp_label>:\n" +
	        			"<end_exp_code>" +
	        			"<cmp_iter> = load i32* <iterator>\n" +
	        			"<cmp_register> = icmp slt i32 <cmp_iter>, <end_exp_register>\n" +
	        			"br i1 <cmp_register>, label %<body_label>, label %<end_label>\n" +
	        			"<body_label>:\n" +
	        			"<body_code>" +
	        			"br label %<iterate_label>\n" +
	        			"<iterate_label>:\n" +
	        			"<operation_code>" +
	        			"<new_i> = add i32 <operation_register>, 0\n" +
	        			"store i32 <new_i>, i32* <iterator>\n" +
	        			"br label %<cmp_label>\n" +
	        			"<end_label>:\n" +
	        			"<ret> = add i32 0, 0\n"
	        	);
	        	template.add("start_exp_code", start);
	        	template.add("iterator", register);
	        	template.add("start_exp_register", start.getRegister());
	        	template.add("cmp_label", generateNewLabel());
	        	template.add("end_exp_code", end);
	        	template.add("cmp_iter", generateNewRegister());
	        	template.add("cmp_register", generateNewRegister());
	        	template.add("end_exp_register", end.getRegister());
	        	template.add("body_label", generateNewLabel());
	        	template.add("end_label", currentBreakLabel);
	        	template.add("body_code", body);
	        	template.add("iterate_label", currentContinueLabel);
	        	template.add("operation_code", operation);
	        	template.add("new_i", generateNewRegister());
	        	template.add("operation_register", operation.getRegister());
	        	String ret = generateNewRegister();
	        	template.add("ret", ret);

                currentContinueLabel = oldContinueLabel;
                currentBreakLabel = oldBreakLabel;

	        	CodeFragment code = new CodeFragment();
	        	code.addCode(template.render());
	        	code.setRegister(ret);
	        	return code;
        }

        @Override
        public CodeFragment visitBreak(teeteeParser.BreakContext ctx) {
        		CodeFragment code = new CodeFragment();
        		if (currentBreakLabel.equals("")) {
        				System.err.println("Error: invalid use of break\n");
        		}
        		code.addCode(String.format("br label %%%s\n", currentBreakLabel));
        		return code;
        }

        @Override
        public CodeFragment visitContinue(teeteeParser.ContinueContext ctx) {
        		CodeFragment code = new CodeFragment();
        		if (currentContinueLabel.equals("")) {
        				System.err.println("Error: invalid use of continue\n");
        		}
        		code.addCode(String.format("br label %%%s\n", currentContinueLabel));
        		return code;
        }

        @Override
        public CodeFragment visitCallfunction(teeteeParser.CallfunctionContext ctx) {
				String identifier = ctx.fname().getText();
				if (!function_mem.containsKey(identifier)) {
						System.err.println(String.format("Error: function '%s' does not exist", identifier));
				}

				int type = function_mem.get(identifier);

                CodeFragment code = new CodeFragment();
                String parameters = "";

                for(teeteeParser.ExpressionContext v: ctx.expression()) {
                        CodeFragment expression = visit(v);
                        String instruction = "add";
                        String instr_type = "i32";
                        String zero = "0";
                        if (Type.isFloat(expression.getType())) {
                            instruction = "fadd";
                            instr_type = "float";
                            zero = "0.0";
                        }

                        ST template = new ST(
                                "<expression_code>" +
                                "<param_register> = <instruction> <type> <expression_register>, <zero>\n"
                        );

                        template.add("expression_code", expression);
                        template.add("expression_register", expression.getRegister());
                        String param_register = generateNewRegister();
                        template.add("param_register", param_register);
                        template.add("instruction", instruction);
                        template.add("type", instr_type);
                        template.add("zero", zero);

                        code.addCode(template.render());
                        if (parameters.equals("")) {
                        		parameters = String.format("%s %s", Type.getLLVMtype(instr_type), param_register);
                        } else {
                        		parameters += String.format(",%s %s", Type.getLLVMtype(instr_type), param_register);
                        }
                }

                if (Type.isVoid(type)) {
	            	    code.addCode(String.format("call %s @%s(%s)\n", Type.getLLVMtype(type), identifier, parameters));
                } else {
	    	            String ret = generateNewRegister();
    	    	        code.addCode(String.format("%s = call %s @%s(%s)\n", 
    	    	        							ret, Type.getLLVMtype(type), identifier, parameters));
                		code.setRegister(ret);
    	    	}
                code.setType(type);

                return code;


        }

        @Override
        public CodeFragment visitEmpty(teeteeParser.EmptyContext ctx) {
                return new CodeFragment();
        }

}
