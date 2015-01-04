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
        // type: 0..int, 1..float, 2..void, 3..bool, 4..string 

        public CompilerVisitor() {
            super();
            function_mem.put("intToFloat", Type.FLOAT);
            function_mem.put("floatToInt", Type.INT);
            function_mem.put("iexp", Type.INT);
            function_mem.put("fexp", Type.FLOAT);
            function_mem.put("printInt", Type.VOID);
            function_mem.put("printFloat", Type.VOID);
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
                        "declare i32 @printInt(i32)\n" + 
                        "declare i32 @printFloat(float)\n" +
                        "declare i32 @iexp(i32, i32)\n" + 
                        "declare float @fexp(float, float)\n" +
                        "declare i32 @floatToInt(float)\n" +
                        "declare float @intToFloat(i32)\n" +
						"<body_code>"					
				);
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
                        "declare i32 @printInt(i32)\n" + 
                        "declare i32 @printFloat(float)\n" +
                        "declare i32 @iexp(i32, i32)\n" + 
                        "declare float @fexp(float, float)\n" +
                        "declare i32 @floatToInt(float)\n" +
                        "declare float @intToFloat(i32)\n" +
                        "define i32 @main() {\n" + 
                        "start:\n" + 
                        "<body_code>" + 
                        "ret i32 0\n" +
                        "}\n"
                );
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
        public CodeFragment visitAssignment(teeteeParser.AssignmentContext ctx) {
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
                }
                template.add("instruction", instruction);
                
                CodeFragment ret = new CodeFragment();
                ret.addCode(template.render());
                ret.setType(code.getType());
                return ret;
        }

        public CodeFragment generateBinaryOperatorCodeFragment(CodeFragment left, CodeFragment right, Integer operator) {
                Integer type = left.getType();;
                if (left.getType() != right.getType()) {
                    System.err.println(String.format("Error: type mismatch in binary operation"));
                } 

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
                template.add("type", left.getTypeString()); 
                String ret_register = this.generateNewRegister();
                template.add("ret", ret_register);
                
                CodeFragment ret = new CodeFragment();
                ret.setRegister(ret_register);
                ret.addCode(template.render());
                ret.setType(type);
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
        public CodeFragment visitVariable(teeteeParser.VariableContext ctx) {
                String id = ctx.ID().getText();
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
        		code.addCode(String.format("%s = add i1 0, %s", register, value));
        		code.setType("bool");
        		return code;
        }

        @Override
        public CodeFragment visitDeclaration(teeteeParser.DeclarationContext ctx) {
                String identifier = ctx.id().getText();
                String type = ctx.type().getText();

                if (mem.thisContainsKey(identifier)) {
                        System.err.println(String.format("Error: identifier '%s' is already defined", identifier));
                }
                
                String register = generateNewRegister();
                mem.put(identifier, register, Type.getType(type));
                
                CodeFragment code = new CodeFragment();
                code.addCode(String.format("%s = alloca %s\n", register, Type.getLLVMtype(type)));
                code.setType(type);

                if (ctx.expression().size() > 0) {
                		CodeFragment expression = visit(ctx.expression(0));
                		if (expression.getType() != Type.getType(type)) {
                			System.err.println(String.format("Error: type mismatch in declaration %s", identifier));
                		}
						ST template = new ST(
								"<expression_code>" +
								"store <type> <expression_register>, <type>* <variable_register>\n"
						);               		
						template.add("expression_code", expression);
						template.add("expression_register", expression.getRegister());
						template.add("type", Type.getLLVMtype(type));
						template.add("variable_register", register);

						code.addCode(template.render());
                }

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

		private String genereateComparingInstruction(int type, String cmp_register, String value_register) {
			if (type == 0) {
				return String.format("%s = icmp ne i32 %s, 0\n", cmp_register, value_register);
			} else {
				return String.format("%s = fcmp one float %s, 0.0\n", cmp_register, value_register);
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
									genereateComparingInstruction(condition.getType(), cmp_register, condition.getRegister()));							
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
                template.add("cmp_label", generateNewLabel());
                template.add("condition_code", condition);
                String cmp_register = generateNewRegister();
                template.add("cmp_register", cmp_register);
                template.add("cmp_instruction",
                	genereateComparingInstruction(condition.getType(), cmp_register, condition.getRegister()));
                template.add("body_label", generateNewLabel());
                template.add("end_label", generateNewLabel());
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
                CodeFragment condition = visit(ctx.expression());
                CodeFragment body = visit(ctx.block());
                String jump_instruction = "br label %<cmp_label>\n";

                return WhileDoStatement(condition, body, jump_instruction);                
        }

        @Override
        public CodeFragment visitDoWhile(teeteeParser.DoWhileContext ctx) {
        	CodeFragment condition = visit(ctx.expression());
        	CodeFragment body = visit(ctx.block());
        	String jump_instruction = "br label %<body_label>\n";

        	return WhileDoStatement(condition, body, jump_instruction);
        }

        @Override
        public CodeFragment visitFor_statement(teeteeParser.For_statementContext ctx) {
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
	        	template.add("end_label", generateNewLabel());
	        	template.add("body_code", body);
	        	template.add("iterate_label", generateNewLabel());
	        	template.add("operation_code", operation);
	        	template.add("new_i", generateNewRegister());
	        	template.add("operation_register", operation.getRegister());
	        	String ret = generateNewRegister();
	        	template.add("ret", ret);

	        	CodeFragment code = new CodeFragment();
	        	code.addCode(template.render());
	        	code.setRegister(ret);
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
