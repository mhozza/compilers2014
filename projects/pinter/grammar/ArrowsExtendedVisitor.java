// Generated from ./Arrows.g4 by ANTLR 4.1
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
import java.util.*;
import org.stringtemplate.v4.*;

/**
 * This class provides an empty implementation of {@link ArrowsVisitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public class ArrowsVisitor extends ArrowsBaseVisitor<Container> {

	private LinkedList< LinkedList< Map<String, String> > > mem = new LinkedList<>();
    private Map<String, Function> func = new HashMap<String, Function>();
    private int labelIndex = 0;
    private int registerIndex = 0;

    public enum Openum {
		ASSIGN,ADDSIGN,SUBSIGN,MULSIGN,DIVSIGN,POSIGN,SWAP,PRINTINT,PRINTCHAR,PRINTCHARLINE,PRINTINTLINE,READINT,READCHAR,READCHARLINE,READINTLINE,ADD,SUB,MUL,DIV,AND,OR,NOT,NONE
	}

	public enum Typenum {
		INT,STRING,ARRAY,NONE
	}

    private Map<String,String> stackContainsKey(String identifier) {
            int i=mem.getLast().size()-1;
            while ((i>=0)&&(!mem.getLast().get(i).containsKey(identifier))) i--;
            if (i>=0) return mem.getLast().get(i);
            return null;
    }


    private String generateNewLabel() {
            return String.format("L%d", this.labelIndex++);
    }


    private String generateNewRegister() {
            return String.format("%%R%d", this.registerIndex++);
    }


	@Override public Container visitInit(ArrowsParser.InitContext ctx) { 
		mem.addLast(new LinkedList<Map<String,String> >());
        mem.getLast().addLast(new HashMap<String,String>());
        Container body=new Container(); 
        for (int i = 0; i< ctx.statements().size(); i++) {
        	body.append(visit(ctx.statements()[i]));
        }

        ST template = new ST(
                "declare i32 @printInt(i32)\n" +  
                "<functions>" +
                "define i32 @main() {\n" + 
                "start:\n" + 
                "<body_code>" + 
                "ret i32 0\n" +
                "}\n"
        );
        template.add("body_code", body);
        template.add("functions", generateFunctionCode());

        return new Container(template.render());
	}


	@Override public Container visitArw(ArrowsParser.ArwContext ctx) {

		Container left=visit(ctx.expression()[0]);
		Container ret = new Container();
		Container right,op;

		for (int i=0;i<ctx.arrow().size();i++) {		
			
			right=visit(ctx.expression()[i*2+1]);
			op=visit(ctx.arrow()[i]);
			
			if (op.getSwap()) {
				Container halp=left;
				left=right;
				right=halp;
			}

			//check validity of left & right
			if (left.getIdentifier()==null)||(((op.opType==Openum.SWAP)||(op.opType==Openum.POSIGN))&&(right.getIdentifier()==null)) {
				//swap back to get nice error message
				if (op.getSwap()) {
					Container halp=left;
					left=right;
					right=halp;
				}				
				throw new CompilerException("Assignment to expression which does not return variable: "+ctx.expression()[i*2].getText()+" "+ctx.op()[i].getText()+" "+ctx.expression()[i*2+1].getText());
			}
			if (left.type==Typeenum.NONE) {
				if ((op.opType!=Openum.ASSIGN)||(right.type==Typeenum.NONE)) {
					//swap back to get nice error message
					if (op.getSwap()) {
						Container halp=left;
						left=right;
						right=halp;
					}	
					throw new CompilerException("Invalid operation on an uninitialized variable: "+ctx.expression()[i*2].getText()+" "+ctx.op()[i].getText()+" "+ctx.expression()[i*2+1].getText());		
				}
			}
			if ((left.type!=Typeenum.INT)||(right.type!=Typeenum.INT)) {
				if ((op.opType!=Openum.ASSIGN)||(op.opType!=Openum.POSIGN)||(op.opType!=Openum.SWAP)) {
					//swap back to get nice error message
					if (op.getSwap()) {
						Container halp=left;
						left=right;
						right=halp;
					}	
					throw new CompilerException("Arithmetic operation between unsupported types: "+ctx.expression()[i*2].getText()+" "+ctx.op()[i].getText()+" "+ctx.expression()[i*2+1].getText());		
				}
			}
			if ((left.type==Typeenum.ARRAY)&&(right.type==Typeenum.ARRAY)) {
				//TODO check when assigning partial array for existence				
				if (left.getActiveDimensions()!=right.getActiveDimensions()) {
					//swap back to get nice error message
					if (op.getSwap()) {
						Container halp=left;
						left=right;
						right=halp;
					}	
					throw new CompilerException("Array dimensions does not match: "+ctx.expression()[i*2].getText()+" "+ctx.op()[i].getText()+" "+ctx.expression()[i*2+1].getText());			
				}
				if (((op.opType==Openum.POSIGN)||(op.opType==Openum.SWAP))&&((left.getDimensionShift()!=0)||(right.getDimensionShift()!=0))) {
					//swap back to get nice error message
					if (op.getSwap()) {
						Container halp=left;
						left=right;
						right=halp;
					}	
					throw new CompilerException("Can't point to only a part of an array: "+ctx.expression()[i*2].getText()+" "+ctx.op()[i].getText()+" "+ctx.expression()[i*2+1].getText());				
				}
			}

			//execute left & right code, assign value from right to left
			Container temp = generateBinaryOperatorContainer(left,right,op.opType);
			switch(op.opType) {
				case Openum.SWAP:
					//swap the registers in memory
					Map<String,String> left_map=stackContainsKey(left.getIdentifier());
					Map<String,String> right_map=stackContainsKey(right.getIdentifier());
					if ((left_map==null)||(right_map==null)) {
						//swap back to get nice error message
						if (op.getSwap()) {
							Container halp=left;
							left=right;
							right=halp;
						}
						throw new CompilerException("Swap into an uninitialized variable: "+ctx.expression()[i*2].getText()+" "+ctx.op()[i].getText()+" "+ctx.expression()[i*2+1].getText());		
					}
					break;
				case Openum.POSIGN:
					Map<String,String> left_map=stackContainsKey(left.getIdentifier());
					Map<String,String> right_map=stackContainsKey(right.getIdentifier());
					if (right_map==null) {
						//swap back to get nice error message
						if (op.getSwap()) {
							Container halp=left;
							left=right;
							right=halp;
						}
						throw new CompilerException("Assignment of a pointer to an unknown variable: "+ctx.expression()[i*2].getText()+" "+ctx.op()[i].getText()+" "+ctx.expression()[i*2+1].getText());		
					}
					if (left_map==null) {
						//create new entry
					} else {
						//assing to existing entry
					}
					break;
				case Openum.ASSIGN:
					Map<String,String> left_map=stackContainsKey(left.getIdentifier());
					//check arrays!!
					if (left_map==null) {
						//create new entry
					} else {
						//assing to existing entry
					}
					break;
				case TODOFROMHERE:
					break;
			}

		}
//GET RID OF TRASH CODE FROM HERE
		Container value = visit(ctx.expression());
        String mem_register;
        String code_stub = "";

        String identifier = ctx.lvalue().getText();
        Map<String,String> m=stackContainsKey(identifier);
        if (m==null) {
                mem_register = this.generateNewRegister();
                code_stub = "<mem_register> = alloca i32\n";
                mem.getLast().put(identifier, mem_register);
        } else {
                mem_register = m.get(identifier);
        }
        ST template = new ST(
                "<value_code>" + 
                code_stub + 
                "store i32 <value_register>, i32* <mem_register>\n"
        );
        template.add("value_code", value);
        template.add("value_register", value.getRegister());
        template.add("mem_register", mem_register);
        Container ret = new Container();
        ret.addCode(template.render());
        ret.setRegister(value.getRegister());
        return ret;
	}

	private Container generateAssignCode() {

	}

	private Container generateFunctionCode() {
                Container code = new Container();
                for(Map.Entry<String,Function> e : func.entrySet()) {
                        Function f=e.getValue();
                        ST template = new ST(
                                "define i32 @<name>(<args>) {\n" +
                                "start:\n" +
                                "<body_code>" +
                                "ret i32 0" + 
                                "}\n"
                        );
                        template.add("name", f.name);
                        template.add("body_code", f.code);
                        template.add("args", paramsToString(f.args));

                        code.addCode(template.render());
                        code.setRegister(f.code.getRegister());
                }
                return code;
        }


    private String paramsToString(List<String> params) {
            String s = "";
            boolean begin = true;
            for (String p : params) {
                    if (!begin) {
                            s += ", ";
                    } else {
                            begin = false;
                    }
                    s += "i32 " + p;
            }
            return s;
    }


    public Container generateBinaryOperatorContainer(Container left, Container right, Openum operator) {
            String code_stub = "<ret> = <instruction> <type> <left_val>, <right_val>\n";
            String instruction = "or";
            Container ret = new Container();
            switch (operator) {
            		case Openum.ASSIGN:
					case Openum.POSIGN:
					case Openum.SWAP:
						code_stub="";
						break;
						//throw new CompilerException("Swap was processed as a standard binary operation, which shouldn't have happened - something went horribly wrong...");		
                    case Openum.ADD:
                    case Openum.ADDSIGN:
                            instruction = "add";
                            break;
                    case Openum.SUBSIGN:
                    case Openum.SUB:
                            instruction = "sub";
                            break;
                    case Openum.MULSIGN:
                    case Openum.MUL:
                            instruction = "mul";
                            break;
                    case Openum.DIVSIGN:
                    case Openum.DIV:
                            instruction = "sdiv";
                            break;
                    case Openum.AND:
                            instruction = "and";
                    case Openum.OR:
                            ST temp = new ST(
                                    "<r1> = icmp ne i32 \\<left_val>, 0\n" +
                                    "<r2> = icmp ne i32 \\<right_val>, 0\n" +
                                    "<r3> = \\<instruction> i1 <r1>, <r2>\n" +
                                    "\\<ret> = zext i1 <r3> to i32\n"
                            );
                            temp.add("r1", this.generateNewRegister());
                            temp.add("r2", this.generateNewRegister());
                            temp.add("r3", this.generateNewRegister());
                            code_stub = temp.render();
                            break;
            }
            ST template = new ST(
                    "<left_code>" + 
                    "<right_code>" + 
                    code_stub
            );
            template.add("left_code", left);
            template.add("right_code", right);
            String ret_register;
            if (!code_stub.isEmpty()) {
	            template.add("instruction", instruction);
	            template.add("left_val", left.getRegister());
	            template.add("right_val", right.getRegister());
	            ret.setRegister(this.generateNewRegister());
	            template.add("ret", ret_register);
	        } else {
	        	ret.setRegister(right.getRegister());
	        }
            
            ret.setRegister(ret_register);
            ret.appendCode(template.render());
            return ret;
    
    }
    

    public Container generateUnaryOperatorContainer(Container code, Integer operator) {
            if (operator == calculatorParser.ADD) {
                    return code;
            }

            String code_stub = "";
            switch(operator) {
                    case calculatorParser.SUB:
                            code_stub = "<ret> = sub i32 0, <input>\n";
                            break;
                    case calculatorParser.NOT:
                            ST temp = new ST(
                                    "<r> = icmp eq i32 \\<input>, 0\n" + 
                                    "\\<ret> = zext i1 <r> to i32\n"
                            );
                            temp.add("r", this.generateNewRegister());
                            code_stub = temp.render();
                            break;
            }
            ST template = new ST("<code>" + code_stub);
            String ret_register = this.generateNewRegister();
            template.add("code", code);
            template.add("ret", ret_register);
            template.add("input", code.getRegister());

            Container ret = new Container();        
            ret.setRegister(ret_register);
            ret.addCode(template.render());
            return ret;
            
    }


    @Override
    public Container visitInt(calculatorParser.IntContext ctx) {
            String value = ctx.INT().getText();
            return generateIntContainer(value);
    }

    private Container generateIntContainer(String value) {
			int size=Math.ceil(Math.log(value.size())/Math.log(2))+1;
            if ((size<0)||(size>8388607)||(value.size()>888888)) { 
            	
            	//should cover overflows, the last 'or' is just in case it would overflow back to positive numbers,
            	//the number is arbitrary but should be both large and small enough to do the job
            	
            	throw new CompilerException("The value "+value+" is too large");
            }
            CodeFragment code = new CodeFragment();
            String register = generateNewRegister();
            code.setRegister(register);
            code.addCode(String.format("%s = add i%s 0, %s\n", register, size, value));
            return code;
    }
	/*

	@Override public Container visitIo(ArrowsParser.IoContext ctx) 
	{ return visitChildren(ctx); }

	@Override public T visitRange(@NotNull ArrowsParser.RangeContext ctx) { return visitChildren(ctx); }

	
	@Override public T visitArgs(@NotNull ArrowsParser.ArgsContext ctx) { return visitChildren(ctx); }

	
	@Override public T visitUna(@NotNull ArrowsParser.UnaContext ctx) { return visitChildren(ctx); }

	
	@Override public T visitBlock(@NotNull ArrowsParser.BlockContext ctx) { return visitChildren(ctx); }

	
	@Override public T visitFunction(@NotNull ArrowsParser.FunctionContext ctx) { return visitChildren(ctx); }

	
	@Override public T visitEq(@NotNull ArrowsParser.EqContext ctx) { return visitChildren(ctx); }

	
	@Override public T visitMul(@NotNull ArrowsParser.MulContext ctx) { return visitChildren(ctx); }

	
	@Override public T visitBlck(@NotNull ArrowsParser.BlckContext ctx) { return visitChildren(ctx); }

	
	@Override public T visitWhile(@NotNull ArrowsParser.WhileContext ctx) { return visitChildren(ctx); }

	
	@Override public T visitStatements(@NotNull ArrowsParser.StatementsContext ctx) { return visitChildren(ctx); }

	
	@Override public T visitAdd(@NotNull ArrowsParser.AddContext ctx) { return visitChildren(ctx); }

	
	@Override public T visitFor(@NotNull ArrowsParser.ForContext ctx) { return visitChildren(ctx); }

	
	@Override public T visitInt(@NotNull ArrowsParser.IntContext ctx) { return visitChildren(ctx); }

	
	@Override public T visitPreInc(@NotNull ArrowsParser.PreIncContext ctx) { return visitChildren(ctx); }

	
	@Override public T visitFunctions(@NotNull ArrowsParser.FunctionsContext ctx) { return visitChildren(ctx); }

	
	@Override public T visitCall(@NotNull ArrowsParser.CallContext ctx) { return visitChildren(ctx); }

	
	@Override public T visitPar(@NotNull ArrowsParser.ParContext ctx) { return visitChildren(ctx); }

	
	@Override public T visitParams(@NotNull ArrowsParser.ParamsContext ctx) { return visitChildren(ctx); }

	
	@Override public T visitPostInc(@NotNull ArrowsParser.PostIncContext ctx) { return visitChildren(ctx); }

	
	@Override public T visitNot(@NotNull ArrowsParser.NotContext ctx) { return visitChildren(ctx); }

	
	@Override public T visitLvalue(@NotNull ArrowsParser.LvalueContext ctx) { return visitChildren(ctx); }

	
	@Override public T visitString(@NotNull ArrowsParser.StringContext ctx) { return visitChildren(ctx); }

	
	@Override public T visitOr(@NotNull ArrowsParser.OrContext ctx) { return visitChildren(ctx); }

	
	@Override public Container visitArrow(ArrowsParser.ArrowContext ctx) { 


	@Override public T visitReturn(@NotNull ArrowsParser.ReturnContext ctx) { return visitChildren(ctx); }


	@Override public T visitIf(@NotNull ArrowsParser.IfContext ctx) { return visitChildren(ctx); }


	@Override public T visitPass(@NotNull ArrowsParser.PassContext ctx) { return visitChildren(ctx); }


	@Override public T visitVar(@NotNull ArrowsParser.VarContext ctx) { return visitChildren(ctx); }


	@Override public T visitAnd(@NotNull ArrowsParser.AndContext ctx) { return visitChildren(ctx); }
	*/

	public static boolean willAdditionOverflow(int left, int right) {
	    if (right < 0 && right != Integer.MIN_VALUE) {
	        return willSubtractionOverflow(left, -right);
	    } else {
	        return (~(left ^ right) & (left ^ (left + right))) < 0;
	    }
	}

	public static boolean willSubtractionOverflow(int left, int right) {
	    if (right < 0) {
	        return willAdditionOverflow(left, -right);
	    } else {
	        return ((left ^ right) & (left ^ (left - right))) < 0;
	    }
	}
}