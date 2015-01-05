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

	private LinkedList< LinkedList< Map<String, MemoryRecord> > > mem = new LinkedList<>();
    private Map<String, Function> func = new HashMap<String, Function>();
    private int labelIndex = 0;
    private int registerIndex = 0;

    CharsetEncoder charEncoder = Charset.forName("ISO-8859-1").newEncoder();

    public enum Openum {
		NONE,ASSIGN,ADDSIGN,SUBSIGN,MULSIGN,DIVSIGN,POSIGN,SWAP,STRING,PRINTINT,PRINTCHAR,PRINTCHARLINE,PRINTINTLINE,READINT,READCHAR,READCHARLINE,READINTLINE,ADD,SUB,MUL,DIV,AND,OR,NOT
	}

	public enum Typenum {
		NONE,INT,ARRAY,STRING,RANGE
	}

    private MemoryRecord stackContainsKey(String identifier) {
            int i=mem.getLast().size()-1;
            while ((i>=0)&&(!mem.getLast().get(i).containsKey(identifier))) i--;
            if (i>=0) return mem.getLast().get(i).get(identifier);
            return null;
    }


    private String generateNewLabel() {
            return String.format("L%d", this.labelIndex++);
    }


    private String generateNewRegister() {
            return String.format("%%R%d", this.registerIndex++);
    }


	@Override public Container visitInit(ArrowsParser.InitContext ctx) { 
		mem.addLast(new LinkedList<Map<String,MemoryRecord> >());
        mem.getLast().addLast(new HashMap<String,MemoryRecord>());
        Container body=new Container(); 
        for (int i = 0; i< ctx.statements().size(); i++) {
        	body.append(visit(ctx.statements(i)));
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


    @Override
    public Container visitStatements(ArrowsParser.StatementsContext ctx) {
            Container code = new Container();
            for(ArrowsParser.StatementContext s: ctx.statement()) {
                    Container statement = visit(s);
                    code.appendCode(statement);
                    code.setRegister(statement.getRegister());
            }
            return code;
    }


	@Override public Container visitArw(ArrowsParser.ArwContext ctx) {
		Container left=visit(ctx.expression(0));
		Container ret = new Container();
		Container right,op;
		for (int i=0;i<ctx.arrow().size();i++) {		
			right=visit(ctx.expression(i*2+1));
			op=visit(ctx.arrow(i));
			if (left.getMemoryRecord()==null) {
				throw new CompilerException("Assigning to expression which does not return variable");
			}
			//after this, left is the target, right is what is assigned to it
			if (op.getSwap()) {
				Container halp=left;
				left=right;
				right=halp;
			}
			//TODO error checks
			//execute left & right code, assign value from right to left
			Container opRes = generateBinaryOperatorContainer(left,right,op.opType);
			ret.appendCode(opRes);
			ret.inheritFromContainer(opRes);
			String targetPointer;
			if (left.getType==Typeenum.INT) {
				targetPointer=left.getRegister();
			} else {
				targetPointer=generateNewRegister();
				String offsetReg=generateNewRegister();
				ret.appendCode(String.format("%s = load i32* %s\n",offsetReg,left.getArrayOffsetRegister()));
				ret.appendCode(String.format("%s = getelementptr i32* %s, i32 %s\n",targetPointer,left.getRegister(),offsetReg));
			}
			if (right.getType==Typeenum.INT) {
				ret.appendCode(String.format("store i32 %s, i32* %s\n",right.getRegister(),targetPointer));
			} else {
				//TODO MEMCOPY
			}
			//TODO 3 riadky
		}
        return ret;
	}


    public Container generateBinaryOperatorContainer(Container left, Container right, Openum operator) {
            String code_stub = "<ret> = <instruction> <type> <left_val>, <right_val>\n";
            String instruction = "or";
            Container ret = new Container();
            if (left.type==Typeenum.ARRAY) {
            	if (left.getDimensionShift()==0) {
            		String reg=generateNewRegister();
            		ret.appendCode(String.format("%s = getelementptr i32* %s, i32 %s\n",reg,,left.getArrayOffsetRegister(),i));
            		ret.appendCode(String.format("%s = load i32* %s\n",partial,memSizeRegister));
            	} else {
            		if (operator!=Openum.ASSIGN) {
            			throw new CompilerException("Invalid operation on arrays");
            		}
            	}
            }
            if (right.type==Typeenum.ARRAY) {
            	if (right.getDimensionShift()==0) {
            		ret.appendCode(String.format("%s = getelementptr i32* %s, i32 %s\n",reg,arrSizesRegister,i));
            		ret.appendCode(String.format("%s = load i32* %s\n",partial,memSizeRegister));
            	} else {
            		if (operator!=Openum.ASSIGN) {
            			throw new CompilerException("Invalid operation on arrays");
            		}
            	}
            }
            if ((left.type==STRING)||((right.type==STRING)&&(operator!=Openum.ASSIGN))) {
            	throw new CompilerException("Invalid operation on strings");
            }
            switch (operator) {
            		case Openum.ASSIGN:
					case Openum.SWAP:
						code_stub="";
						break;
						//throw new CompilerException("Swap was processed as a standard binary operation, which shouldn't have happened - something went horribly wrong...");		
                    case Openum.ADD:
                    case Openum.ADDSIGN:
                    		if ((left.type==Typeenum.ARRAY)||(right.type==Typeenum.ARRAY)) {
                    			throw new CompilerException("Invalid operation on arrays");
                    		}
                            instruction = "add";
                            break;
                    case Openum.SUB:
                    case Openum.SUBSIGN:
                    		if ((left.type==Typeenum.ARRAY)||(right.type==Typeenum.ARRAY)) {
                    			throw new CompilerException("Invalid operation on arrays");
                    		}
                            instruction = "sub";
                            break;
                    case Openum.MUL:
                    case Openum.MULSIGN:
                    		if ((left.type==Typeenum.ARRAY)||(right.type==Typeenum.ARRAY)) {
                    			throw new CompilerException("Invalid operation on arrays");
                    		}
                            instruction = "mul";
                            break;
                    case Openum.DIV:
                    case Openum.DIVSIGN:
                    		if ((left.type==Typeenum.ARRAY)||(right.type==Typeenum.ARRAY)) {
                    			throw new CompilerException("Invalid operation on arrays");
                    		}
                            instruction = "sdiv";
                            break;
                    case Openum.AND:
                    		if ((left.type==Typeenum.ARRAY)||(right.type==Typeenum.ARRAY)) {
                    			throw new CompilerException("Invalid operation on arrays");
                    		}
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
                    default:
                    	throw new CompilerException("Invalid binary operator (wrong use of I/O arrows?)");
                    	break;
            }
            ST template = new ST(
                    "<left_code>" + 
                    "<right_code>" + 
                    code_stub
            );
            template.add("left_code", left);
            template.add("right_code", right);
	        //set types & everything to the same as were 
	        ret.inheritFromContainer(right);
            String ret_register;
            if (!code_stub.isEmpty()) {
	            template.add("instruction", instruction);
	            template.add("left_val", left.getRegister());
	            template.add("right_val", right.getRegister());
	            ret.setRegister(this.generateNewRegister());
	            template.add("ret", ret_register);
	            ret.setRegister(ret_register);
	        }             
            ret.appendCode(template.render());
            return ret;
    
    }
    

    public Container generateUnaryOperatorContainer(Container code, Integer operator) {
            if (code.type!=Typeenum.INT) {
            	throw new CompilerException("Invalid unary operation on a non-integer type.");
            }
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
    public Container visitInt(ArrowsParser.IntContext ctx) {
        String value = ctx.INT().getText();
        Container ret = new Container(Typeenum.INT);
        ret.setRegister(generateNewRegister());
        ret.appendCode(String.format("%s = add i32 0, %s\n", register, value));
        return code;
    }


    @Override 
    public Container visitVar(ArrowsParser.VarContext ctx) {
    	Container ret;
		MemoryRecord mr=stackContainsKey(ctx.lvalue().getText());
		if (mr==null) {
			if (ctx.range()==null) {
				ret=new Container(Typeenum.INT);
				ret.setRegister(generateNewRegister());
				ret.setIdentifier(ctx.lvalue().getText());
				ret.setMemoryRecord(new MemoryRecord(ret.getIdentifier(), generateNewRegister(), Typeenum.INT));
				mem.getLast().getLast().put(ret.getMemoryRecord());
				//allocate memory, store value in container register
				ret.appendCode(String.format("%s = alloca i32\n",ret.getMemoryRecord.register));
				ret.appendCode(String.format("store i32 0, i32* %s\n",ret.getMemoryRecord.register)); //init to 0, which is nice for 'for' syntax
				ret.appendCode(String.format("%s = load i32* %s\n", ret.getRegister(), ret.getMemoryRecord.register));
			} else {
				//allocation , creates array in memory and returns it whole
				ret=new Container(Typeenum.ARRAY);
				ret.setRegister(generateNewRegister());
				ret.setIdentifier(ctx.lvalue().getText());
				ret.setDimensionShift(0);
				//a register for array dimension sizes
				String arrSizesRegister=generateNewRegister();
				ret.appendCode(String.format("%s = alloca i32, i32 %d\n",arrSizesRegister,ctx.range().size()));
				//offset register, set to 0 for new array
				String offsetRegister=generateNewRegister();
				ret.appendCode(String.format("%s = alloca i32",offsetRegister);
				ret.appendCode(String.format("store i32 0, i32* %s\n",offsetRegister));
				//and a register for total array size (will be multiplied by every dimension, therefore initial 1)
				String memSizeRegister=generateNewRegister();
				ret.appendCode(String.format("%s = alloca i32",memSizeRegister);
				ret.appendCode(String.format("store i32 1, i32* %s\n",memSizeRegister));
				for (int i=0;i<ctx.range().size();i++) {
					Container range=visit(ctx.range(i));
					if (range.getRegister()==null) {
						throw new CompilerException("Expression between [] does not return value");
					} else if (range.getSecondRegister()!=null) {
						throw new CompilerException("Invalid indexing of an array - can't use bounded ([x..y]) ranges in this context.");
					}
					String reg=generateNewRegister();
					//store current dimension size in an array with the rest
					ret.appendCode(String.format("%s = getelementptr i32* %s, i32 %s\n",reg,arrSizesRegister,i));
					ret.appendCode(String.format("store i32 %d, i32* %s\n",range.getRegister(),reg));
					//multiply size by current dimension size
					String partial=generateNewRegister();
					String partialMul=generateNewRegister();
					ret.appendCode(String.format("%s = load i32* %s\n",partial,memSizeRegister));
					ret.appendCode(String.format("%s = mul i32 %s, %s\n",partialMul,partial,range.getRegister()));
					ret.appendCode(String.format("store i32 %s, i32* %s\n",partialMul,memSizeRegister));
				}
				ret.setArrayMemSizeRegister(memSizeRegister);
				ret.setArrayOffsetRegister(offsetRegister);
				ret.setMemoryRecord(new MemoryRecord(ret.getIdentifier(), ret.getRegister(), Typeenum.ARRAY, memSizeRegister, arrSizesRegister, numberOfDimensions));
				mem.getLast().getLast().put(ret.getMemoryRecord());
				ret.appendCode(String.format("%s = alloca i32, i32 %s \n",ret.getRegister(),memSizeRegister));
			}
		} else {
			if (mr.type==Typeenum.INT) {
				ret=new Container(Typeenum.INT);
				ret.setRegister(generateNewRegister());
				ret.setIdentifier(mr.identifier);
				ret.setMemoryRecord(mr);
				ret.appendCode(String.format("%s = load i32* %s\n", ret.getRegister(), mr.register));
			} else {
				//access, returns either an array or an integer at the position given by ranges
				int dimensionShift=mr.arraySizes.size()-ctx.range().size();
				if (dimensionShift<0) {
					throw new CompilerException(String.format("Invalid number of dimensions - specified %d where %s has only %d",ctx.range().size(),mr.identifier,mr.arraySizes.size()));
				}
				ret=new Container(Typeenum.ARRAY);
				//size of the offsetted array
				String retSize=generateNewRegister();
				String calc=generateNewRegister();
				ret.appendCode(String.format("%s = alloca i32\n",retSize));
				ret.appendCode(String.format("%s = load i32* %s\n", calc, mr.memSizeRegister));
				ret.appendCode(String.format("store i32 %s, i32* %s\n",calc,retSize));
				//offset in the whole array	
				String offset=generateNewRegister();
				ret.appendCode(String.format("%s = alloca i32\n",offset));
				ret.appendCode(String.format("store i32 0, i32* %s\n",offset));
				for (int i=0;i<ctx.range().size();i++) {
					Container range=visit(ctx.range(i));
					if (range.getRegister()==null) {
						throw new CompilerException("Expression between [] does not return value");
					} else if (range.getSecondRegister()!=null) {
						throw new CompilerException("Invalid indexing of an array - can't use bounded ([x..y]) ranges in this context.");
					}
					//move accross the current dimension
					String dimSize=generateNewRegister();
					String currentOffset=generateNewRegister();
					String partial=generateNewRegister();
					String partialAdd=generateNewRegister();
					//calculating dimension offset
					ret.appendCode(String.format("%s = getelementptr i32* %s, i32 %s\n",dimSize,mr.arrSizesRegister,i)); //get dimension size
					ret.appendCode(String.format("%s = mul i32 %s, %s\n",currentOffset,dimSize,range.getRegister())); //calculate current dim. offset
					ret.appendCode(String.format("%s = load i32* %s\n", partial, offset)); 
					ret.appendCode(String.format("%s = add i32 %s, %s\n",partialAdd,partial,currentOffset)); //calculate new partial offset
					ret.appendCode(String.format("store i32 %d, i32* %s\n",partialAdd,offset)); //useless in last iteration
					//calculating return size
					String getRet=generateNewRegister();
					String divRet=generateNewRegister();
					ret.appendCode(String.format("%s = load i32* %s\n", getRet, retSize)); 
					ret.appendCode(String.format("%s = div i32 %s, %s\n",divRet,getRet,range.getRegister())); 
					ret.appendCode(String.format("store i32 %d, i32* %s\n",divRet,retSize)); //useless in last iteration, but whatever
				}
				ret.setArrayMemSizeRegister(divRet);
				ret.setArrayOffsetRegister(partialAdd);
				ret.setMemoryRecord(mr);
				ret.setRegister(mr.register);
				ret.setIdentifier(mr.identifier);
				ret.setDimensionShift(dimensionShift);
			}
		}
		return ret;
    }


    @Override
    public Container visitRange(ArrowsParser.RangeContext ctx) {
    	Container ret=visit(ctx.expression(0));
    	ret.setType(Typeenum.RANGE);
    	if (ctx.expression().size()>1) {
    		Container second=visit(ctx.expression(1));
    		ret.appendCode(second.getCode());
    		ret.setSecondRegister(second.getRegister());
    	}
    	return ret;
    }


    @Override 
    public Container visitQuotedString(ArrowsParser.QuotedStringContext ctx) { 
    	//TODO check and fix
    	String str= ctx.content().getText();
    	byte[] stringBytes=str.getBytes("ISO-8859-1");
    	Container ret(Typeenum.STRING);		//string differs from ARRAY in that it has no 
    	ret.setRegister(generateNewRegister());
    	ret.setDimensionShift(1);
    	//store 0 offset in register
    	String offset=generateNewRegister();
		ret.appendCode(String.format("%s = alloca i32\n",offset));
		ret.appendCode(String.format("store i32 0, i32* %s\n",offset));
		ret.setArrayOffsetRegister(offset);
		//store length in register
		String memSize=generateNewRegister();
		ret.appendCode(String.format("%s = alloca i32\n",memSize));
		ret.appendCode(String.format("store i32 %d, i32* %s\n",str.length,memSize));
    	ret.setArrayMemSize(memSize);
    	ret.appendCode(String.format("%d = alloca i32, i32 %s\n",ret.getRegister(),ret.getArrayMemSize()));
		for (int i=0;i<ret.getArrayMemSize();i++) {
			String reg=generateNewRegister();
			ret.appendCode(String.format("%s = getelementptr i32* %s, i32 %s\n",reg,ret.getRegister(),i));
			ret.appendCode(String.format("store i32 %d, i32* %s\n",Integer(stringBytes[i]),reg));
		}
		return ret;
    }


    @Override
    public Container visitInput(ArrowsParser.InputContext ctx) {
    	Container ret=new Container(Typeenum.NONE);
    	for (int i=0;i<ctx.singleInput().size();i++) {
    		//TODO? inherit from container ?
    		ret.appendCode(visit(ctx.singleInput(i)));
    	}
    	return ret;
    }


    @Override 
    public Container visitSingleInput(ArrowsParser.SingleInputContext ctx) {
    	Container arw=visit(ctx.inputArrow());
    	Container ret=new Container(Typeenum.NONE);
    	for (int i=0;i<ctx.variable.size();i++) {
	    	Container var=visit(ctx.variable(i));
	    	Container input;
	    	switch (arw.Optype) {
	    		case Optype.ASSIGN:
	    			input = new Container(Typeenum.INT);
			        input.setRegister(generateNewRegister());
			        input.appendCode(String.format("%s = callTODO\n", register, value));
			        Container assign=generateBinaryOperatorContainer(Container left, Container right, Openum arw.getOptype());
			        ret.inheritFromContainer(assign);
			        ret.appendCode(assign);
	    			break;
	    		case Optype.STRING:
	    			arw.setOptype(Openum.ASSIGN); //for purposes of generateBinOp, we're just assigning
	    			input = new Container(Typeenum.ARRAY);
			        input.setRegister(generateNewRegister());
			        input.appendCode(String.format("%s = callTODO\n", register, value));
			        Container assign=generateBinaryOperatorContainer(Container left, Container right, Openum arw.getOptype());
			        ret.inheritFromContainer(assign);
			        ret.appendCode(assign);
	    			break;
	    	}
    	}
    	return ret;
 	}


 	@Override
    public Container visitOutput(ArrowsParser.OutputContext ctx) {
    	Container ret=new Container(Typeenum.NONE);
    	for (int i=0;i<ctx.singleOutput().size();i++) {
    		ret.appendCode(visit(ctx.singleOutput(i)));
    	}
    	//TODO newline
    	return ret;
    }


	@Override 
    public Container visitSingleOutput(ArrowsParser.SingleOutputContext ctx) {
	    Container arw=visit(ctx.inputArrow());
    	Container ret=new Container(Typeenum.NONE);
    	String separator="";
    	if (ctx.quotedString()!=null) {
    		separator=ctx.quotedString().toText();
    		separator=separator.replaceAll("\"","");
    	}
    	for (int i=0;i<ctx.expression.size();i++) {
	    	Container exp=visit(ctx.expression(i));
	    	ret.appendCode(var.getCode());
	    	//TODO inherit ?
	    	switch (arw.Optype) {
	    		case Optype.ASSIGN:
		    		if (exp.getType()!=Typeenum.INT) {
		    			throw new CompilerException("Non-int expression supplied to int-printing statement");
		    		}
			        ret.appendCode(String.format("%s = callTODO\n", register, value));
	    			break;
	    		case Optype.STRING:
	    			if (exp.getType()!=Typeenum.ARRAY) {
		    			throw new CompilerException("Non-array expression supplied to string-printing statement");
		    		}
		    		ret.appendCode(String.format("%s = callTODO\n", register, value));
	    			break;
	    	}
	    	//TODO call 
    	}
    	return ret;
 	}    


    @Override
    public Container visitAdd(ArrowsParser.AddContext ctx) {
            return generateBinaryOperatorContainer(
                    visit(ctx.expression(0)),
                    visit(ctx.expression(1)),
                    ctx.op.getOptype()
            );
    }

    @Override 
    public Container visitMul(ArrowsParser.MulContext ctx) {
            return generateBinaryOperatorContainer(
                    visit(ctx.expression(0)),
                    visit(ctx.expression(1)),
                    ctx.op.getOptype()
            );
    }

    @Override 
    public Container visitExp(ArrowsParser.ExpContext ctx) {
            return generateBinaryOperatorContainer(
                    visit(ctx.expression(0)),
                    visit(ctx.expression(1)),
                    ctx.op.getOptype()
            );
    }

    @Override
    public Container visitPar(ArrowsParser.ParContext ctx) {
            return visit(ctx.expression());
    }


    @Override
    public Container visitUna(ArrowsParser.UnaContext ctx) {
            return generateUnaryOperatorContainer(
                    visit(ctx.expression()),
                    ctx.op.getOptype()
            );
    }

    @Override 
    public Container visitNot(ArrowsParser.NotContext ctx) {
            return generateUnaryOperatorContainer(
                    visit(ctx.expression()),
                    ctx.op.getOptype()
            );
    }

    @Override
    public Container visitAnd(ArrowsParser.AndContext ctx) {
            return generateBinaryOperatorContainer(
                    visit(ctx.expression(0)),
                    visit(ctx.expression(1)),
                    ctx.op.getOptype()
            );
    }

    @Override
    public Container visitOr(ArrowsParser.OrContext ctx) {
            return generateBinaryOperatorCodeFragment(
                    visit(ctx.expression(0)),
                    visit(ctx.expression(1)),
                    ctx.op.getOptype()
            );
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


    @Override
    public CodeFragment visitEmp(calculatorParser.EmpContext ctx) {
            return new CodeFragment();
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


	
}

//STANDARTNA KOPA BORDELU, keby sa nieco z neho chcelo revivnut

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



/*case Openum.POSIGN:
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
						mem.getLast().getLast().put(left.getIdentifier(), right_map.get(right.getIdentifier()));
					} else {
						//assing to existing entry
						left_map.get(left.getIdentifier())=right_map.get(right.getIdentifier());
					}
					break;
*/

/*
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
*/

	/*
    private Container generateIntContainer(String value) {
			int size=Math.ceil(Math.log(value.size())/Math.log(2))+1;
            if ((size<0)||(size>8388607)||(value.size()>888888)) { 
            	
            	//should cover overflows, the last 'or' is just in case it would overflow back to positive numbers,
            	//the number is arbitrary but should be both large and small enough to do the job
            	
            	throw new CompilerException("The value "+value+" is too large");
            }
            Container code = new CodeFragment();
            String register = generateNewRegister();
            code.setRegister(register);
            code.addCode(String.format("%s = add i%s 0, %s\n", register, size, value));
            return code;
    }*/

    //(CONSIDER, but prob. is wrong)and now switch the references on our memory stac
					/*
					String halp=left_map.get(left.getIdentifier());
					left_map.get(left.getIdentifier())=right_map.get(right.getIdentifier());
					right_map.get(right.getIdentifier())=halp;*/

	/*
			//check validity of left & right
			if (left.getIdentifier()==null)||(((op.opType==Openum.SWAP)||(op.opType==Openum.POSIGN))&&(right.getMemoryMap()==null)) {
				//swap back to get nice error message
				if (op.getSwap()) {
					Container halp=left;
					left=right;
					right=halp;
				}				
				throw new CompilerException("Assignment to/from nonexisting variable: "+ctx.expression(i*2).getText()+" "+ctx.op(i).getText()+" "+ctx.expression(i*2+1).getText());
			}
			if (left.type==Typeenum.NONE) {
				if ((op.opType!=Openum.ASSIGN)||(right.type==Typeenum.NONE)) {
					//swap back to get nice error message
					if (op.getSwap()) {
						Container halp=left;
						left=right;
						right=halp;
					}	
					throw new CompilerException("Invalid operation on an uninitialized variable: "+ctx.expression(i*2).getText()+" "+ctx.op(i).getText()+" "+ctx.expression(i*2+1).getText());		
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
					throw new CompilerException("Arithmetic operation between unsupported types: "+ctx.expression(i*2).getText()+" "+ctx.op(i).getText()+" "+ctx.expression(i*2+1).getText());		
				}
			}
			if ((left.type==Typeenum.ARRAY)&&(right.type==Typeenum.ARRAY)) {
				//for now, lets forbid all the weird stuff with array addition and multiplication
				if (!((op.opType==Openum.POSIGN)||(op.opType==Openum.SWAP)||(op.opType==Openum.ASSIGN))) {
					//swap back to get nice error message
					if (op.getSwap()) {
						Container halp=left;
						left=right;
						right=halp;
					}				
					throw new CompilerException("Arithmetic between arrays forbidenn : "+ctx.expression()[i*2].getText()+" "+ctx.op()[i].getText()+" "+ctx.expression()[i*2+1].getText());
				}
				if (right.getMemoryMap()==null) {
					//swap back to get nice error message
					if (op.getSwap()) {
						Container halp=left;
						left=right;
						right=halp;
					}				
					throw new CompilerException("Assignment from an nonexisting array: "+ctx.expression()[i*2].getText()+" "+ctx.op()[i].getText()+" "+ctx.expression()[i*2+1].getText());
				}			
				if (left.getActiveDimensions()!=right.getActiveDimensions()) {
					//swap back to get nice error message
					if (op.getSwap()) {
						Container halp=left;
						left=right;
						right=halp;
					}	
					throw new CompilerException("Array dimensions does not match: "+ctx.expression()[i*2].getText()+" "+ctx.op()[i].getText()+" "+ctx.expression()[i*2+1].getText());			
				}
				//this could theoretically work with standard assign, but for now lets forbid it too
				if (((op.opType==Openum.POSIGN)||(op.opType==Openum.SWAP)||(op.opType==Openum.ASSIGN))&&((left.getDimensionShift()!=0)||(right.getDimensionShift()!=0))) {
					//swap back to get nice error message
					if (op.getSwap()) {
						Container halp=left;
						left=right;
						right=halp;
					}	
					throw new CompilerException("Can't point to only a part of an array: "+ctx.expression()[i*2].getText()+" "+ctx.op()[i].getText()+" "+ctx.expression()[i*2+1].getText());				
				}
			}
			*/
			/*
			case Openum.SWAP:
					//swap pointers
					Map<String,MemoryRecord> left_map=stackContainsKey(left.getIdentifier());
					Map<String,MemoryRecord> right_map=stackContainsKey(right.getIdentifier());
					if ((left_map==null)||(right_map==null)) {
						//swap back to get nice error message
						if (op.getSwap()) {
							Container halp=left;
							left=right;
							right=halp;
						}
						throw new CompilerException("Swap into an uninitialized variable: "+ctx.expression()[i*2].getText()+" "+ctx.op()[i].getText()+" "+ctx.expression()[i*2+1].getText());		
					}
					String code_stub="TODO SEM DAT CALL NA FUNKCIU CO SWAPUJE";
					ret.appendCode(opRes);
					ret.appendCode(code_stub);
					break;
					*/
					/*

			String mem_register="";
			String code_stup="";
			switch(op.opType) {
				case Openum.ASSIGN:
				case Openum.ADDSIGN:
				case Openum.SUBSIGN:
				case Openum.MULSIGN:
				case Openum.DIVSIGN:
				//REWORK TODO
					Map<String,MemoryRecord> left_map=stackContainsKey(left.getIdentifier());
					if (left.getMemoryRecord()==null) {
						//create new entry
						mem_register = this.generateNewRegister();
						if (right.getType()==Typeenum.INT) {
			                code_stub = "<mem_register> = alloca i32\n";
			                left.setMemoryRecord(new MemoryRecord(left.getIdentifier, mem_register, Typeenum.INT));
			                mem.getLast().getLast().put(left.getIdentifier(), left.getMemoryRecord());
						} else {
							code_stub = "<mem_register> = alloca i32, i32 "+right.getArrayMemSize()+"\n";
							left.setMemoryRecord(new MemoryRecord(left.getIdentifier, mem_register, Typeenum.ARRAY, right.getArrayMemSize(), right.getArraySizes()));
							mem.getLast().getLast().put(left.getIdentifier(), left.getMemoryRecord()); 
						}
					} else {
						//assigning to existing entry
						mem_register = left_map.get(getIdentifier());
					}
					ST template = new ST(
		                code_stub + 
		                "store i32 <value_register>, i32* <mem_register>\n"
			        );
			        template.add("value_register", opRes.getRegister());
			        template.add("mem_register", mem_register);
			        ret.appendCode(opRes);
			        ret.appendCode(template.render());
			        ret.inheritFromContainer(left);
					break;
				default:
					//swap back to get nice error message
					if (op.getSwap()) {
						Container halp=left;
						left=right;
						right=halp;
					}	
					throw new CompilerException("Unexpected operator: "+ctx.expression()[i*2].getText()+" "+ctx.op()[i].getText()+" "+ctx.expression()[i*2+1].getText());
					break;
					*/