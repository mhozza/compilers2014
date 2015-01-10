// Generated from ./Arrows.g4 by ANTLR 4.1
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
import java.util.*;
import java.io.*;
import java.nio.charset.*;
import org.stringtemplate.v4.*;

/**
 * This class provides an empty implementation of {@link ArrowsVisitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public class ArrowsExtendedVisitor extends ArrowsBaseVisitor<Container> {

	private LinkedList< LinkedList< Map<String, MemoryRecord> > > mem = new LinkedList<>();
    private Map<String, Function> func = new HashMap<String, Function>();
    private int labelIndex = 0;
    private int registerIndex = 0;

    CharsetEncoder charEncoder = Charset.forName("ISO-8859-1").newEncoder();

    public enum Openum {
		NONE,ASSIGN,ADDSIGN,SUBSIGN,MULSIGN,DIVSIGN,STRING,ADD,SUB,MUL,DIV,AND,OR,NOT,EQUAL,NEQUAL,GEQUAL,SEQUAL,SMALLER,GREATER
	}

	public enum Typeenum {
		NONE,INT,ARRAY,RANGE
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
        for (int i = 0; i< ctx.fun().size(); i++) {
        	visit(ctx.fun(i));
        }
    	body.appendCode(visit(ctx.statements()));

        ST template = new ST(
    		"declare void @arrcopy(i32*,i32*,i32)\n" +
            "declare i32 @readInt()\n" +  
            "declare void @readString(i32*,i32)\n" +
            "declare void @printInt(i32)\n" +
            "declare void @printString(i32*,i32)\n" +
            "declare void @printIntSep(i32,i32*,i32)\n" +
            "declare void @printStringSep(i32*,i32,i32*,i32)\n" +
            "declare void @printLine()\n" +  
            "<functions>" +
            "define i32 @main() {\n" + 
            "start:\n" + 
            "<body_code>" + 
            "ret i32 0\n" +
            "}\n"
        );
        template.add("body_code", body);
        template.add("functions", generateFunctionCode());

        Container ret=new Container(Typeenum.NONE);
        ret.appendCode(template.render());
        return ret;
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


    private Container assign(Container left,Container right) {
    	Container ret=new Container(left.getType());
    	ret.inheritFromContainer(left);
    	String targetPointer;
		String fromPointer=generateNewRegister();
		if (left.getMemoryRecord()==null) {
			System.err.println("Assignemt to a non-variable expression.");
			//System.exit(1);
		}
		if (left.getType()==Typeenum.INT) {
			targetPointer=left.getMemoryRecord().register;
		} else {
			targetPointer=generateNewRegister();
			String offsetReg=generateNewRegister();
			ret.appendCode(String.format("%s = load i32* %s\n",offsetReg,left.getArrayOffsetRegister()));
			ret.appendCode(String.format("%s = getelementptr i32* %s, i32 %s\n",targetPointer,left.getRegister(),offsetReg));
		}
		if (right.getType()!=Typeenum.INT) {
			String offsetReg=generateNewRegister();
			ret.appendCode(String.format("%s = load i32* %s\n",offsetReg,right.getArrayOffsetRegister()));
			ret.appendCode(String.format("%s = getelementptr i32* %s, i32 %s\n",fromPointer,right.getRegister(),offsetReg));
		}
		if (right.getType()==Typeenum.INT) {
			ret.appendCode(String.format("store i32 %s, i32* %s\n",right.getRegister(),targetPointer));
			ret.setRegister(right.getRegister());
		} else {
			String size=generateNewRegister();
			ret.appendCode(String.format("%s = load i32* %s\n",size,right.getArrayMemSizeRegister()));
			ret.appendCode(String.format("call void @arrcopy(i32* %s, i32* %s, i32 %s)\n",targetPointer,fromPointer,size));
		}
		return ret;
    }


	@Override 
	public Container visitArw(ArrowsParser.ArwContext ctx) {
		Container left=visit(ctx.expression(0));
		Container ret = new Container();
		Container right,op;
		for (int i=0;i<ctx.arrow().size();i++) {		
			right=visit(ctx.expression(i+1));
			op=visit(ctx.arrow(i));
			//after this, left is the target, right is what is assigned to it
			if (op.getSwap()) {
				Container halp=left;
				left=right;
				right=halp;
			}
			if (left.getMemoryRecord()==null) {
				System.err.println("Assigning to expression which does not return variable");
				//System.exit(1);
			}
			//execute left & right code, assign value from right to left
			Container opRes = generateBinaryOperatorContainer(left,right,op.getOpType());
			left = assign(left,opRes); 
			ret.appendCode(opRes);
			//ret.inheritFromContainer(ass);
		}
		ret.appendCode(left);
		ret.inheritFromContainer(left);
        return ret;
	}


    public Container generateBinaryOperatorContainer(Container left, Container right, Openum operator) {
        String code_stub = "<ret> = <instruction> i32 <left_val>, <right_val>\n";
        String instruction = "or";
        Container ret = new Container();
        boolean cmp=false;
        boolean log=false;
        if (left.getType()==Typeenum.ARRAY) {
        	if (left.getDimensionShift()==0) {
        		if (operator!=Openum.ASSIGN) {
        			Container c=convertToInt(left);
        			if (c==null) {
        				System.err.println("Invalid operation on arrays");
        				//System.exit(1);
        			} else {
        				left=c;
        			}
        		}
        	}
        }
        if (right.getType()==Typeenum.ARRAY) {
        	if (right.getDimensionShift()==0) {
        		if ((operator!=Openum.ASSIGN)||(left.getType()==Typeenum.INT)) {
        			Container c=convertToInt(right);
        			if (c==null) {
        				System.err.println("Invalid operation on arrays");
        				//System.exit(1);
        			} else {
        				right=c;
        			}
        		}
        	}
        }
        switch (operator) {
    		case ASSIGN:
				code_stub="";
				break;
            case ADD:
            case ADDSIGN:
                instruction = "add";
                break;
            case SUB:
            case SUBSIGN:
                instruction = "sub";
                break;
            case MUL:
            case MULSIGN:
                instruction = "mul";
                break;
            case DIV:
            case DIVSIGN:
                instruction = "sdiv";
                break;
            case EQUAL:
        		instruction="icmp eq";
        		cmp=true;
        		break;
            case NEQUAL:
        		instruction="icmp ne";
        		cmp=true;
        		break;
            case GEQUAL:
        		instruction="icmp sge";
        		cmp=true;
        		break;
            case SEQUAL:
        		instruction="icmp sle";
        		cmp=true;
        		break;
            case GREATER:
        		instruction="icmp sgt";
        		cmp=true;
        		break;
            case SMALLER:
        		instruction="icmp slt";
        		cmp=true;
        		break;
            case AND:
                instruction = "and";
            case OR:
                cmp=true;
                instruction="or";
                String bitleft=generateNewRegister();
                String bitright=generateNewRegister();
                code_stub = String.format("%s = icmp ne i32 <left_val>, 0\n%s = icmp ne i32 <right_val>, 0\n<ret> = <instruction> i1 %s, %s\n",
                    bitleft,bitright,bitleft,bitright);
                break;
            default:
            	System.err.println("Invalid binary operator (wrong use of I/O string arrow?)");
            	//System.exit(1);
            	break;
        }
        
        //System.err.println("wat");
        ST template = new ST(
            "<left_code>" + 
            "<right_code>" + 
            code_stub
        );
        template.add("left_code", left);
        template.add("right_code", right);
        //set types & everything to the same as were 
        ret.inheritFromContainer(right);
        String ret_register=generateNewRegister();
        if (!code_stub.isEmpty()) {
            template.add("instruction", instruction);
            template.add("left_val", left.getRegister());
            template.add("right_val", right.getRegister());
            template.add("ret", ret_register);
            ret.setRegister(ret_register);
        }             
        ret.appendCode(template.render());
        if (cmp) {
        	String reg=generateNewRegister();
        	ret.appendCode(String.format("%s = sext i1 %s to i32\n",reg,ret_register));
        	ret.setRegister(reg);
        	ret.setType(Typeenum.INT);
        	ret.setMemoryRecord(null);
        }
        //System.err.println(ret.getRegister());
        return ret;
    
    }
    

    public Container generateUnaryOperatorContainer(Container code, Integer operator) {
            if (code.getType()!=Typeenum.INT) {
            	System.err.println("Invalid unary operation on a non-integer type.");
            	//System.exit(1);
            }
            if (operator == ArrowsParser.ADD) {
                    return code;
            }
            String code_stub = "";
            switch(operator) {
                    case ArrowsParser.SUB:
                            code_stub = "<ret> = sub i32 0, <input>\n";
                            break;
                    case ArrowsParser.NOT:
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
            ret.appendCode(template.render());
            ret.setType(Typeenum.INT);
            return ret;
    }


    @Override 
    public Container visitInputArrow(ArrowsParser.InputArrowContext ctx) { 
    	if (ctx.op.getType()==ArrowsParser.LA) return new Container(Openum.ASSIGN,true);
    	return new Container(Openum.STRING,true);
    }

    @Override 
    public Container visitOutputArrow(ArrowsParser.OutputArrowContext ctx) { 
    	if (ctx.op.getType()==ArrowsParser.RA) return new Container(Openum.ASSIGN,false);
    	return new Container(Openum.STRING,false);
    }

    @Override 
    public Container visitOtherArrow(ArrowsParser.OtherArrowContext ctx) { 
    	Integer op=ctx.op.getType();
    	switch (op) {
    		case ArrowsParser.LPA:
    			return new Container(Openum.ADDSIGN,true);
    		case ArrowsParser.RPA:
    			return new Container(Openum.ADDSIGN,false);
    		case ArrowsParser.LSA:
    			return new Container(Openum.SUBSIGN,true);
    		case ArrowsParser.RSA:
    			return new Container(Openum.SUBSIGN,false);
    		case ArrowsParser.LDA:
    			return new Container(Openum.DIVSIGN,true);
    		case ArrowsParser.RDA:
    			return new Container(Openum.DIVSIGN,false);
    		case ArrowsParser.LMA:
    			return new Container(Openum.MULSIGN,true);
    		case ArrowsParser.RMA:
    			return new Container(Openum.MULSIGN,false);
    		default:
    			System.err.println("Unsuported operation.");
    			//System.exit(1);
    	}
    	return null;
    }

    @Override
    public Container visitInt(ArrowsParser.IntContext ctx) {
        String value = ctx.INT().getText();
        Container ret = new Container(Typeenum.INT);
        ret.setRegister(generateNewRegister());
        ret.appendCode(String.format("%s = add i32 0, %s\n", ret.getRegister(), value));
        return ret;
    }


    @Override 
    public Container visitVariable(ArrowsParser.VariableContext ctx) {
    	Container ret;
		MemoryRecord mr=stackContainsKey(ctx.lvalue().getText());
		if (mr==null) {
			if (ctx.range().size()==0) {
				ret=new Container(Typeenum.INT);
				ret.setRegister(generateNewRegister());
				ret.setIdentifier(ctx.lvalue().getText());
				ret.setMemoryRecord(new MemoryRecord(ret.getIdentifier(), generateNewRegister(), Typeenum.INT));
				mem.getLast().getLast().put(ret.getIdentifier(),ret.getMemoryRecord());
				//allocate memory, store value in container register
				ret.appendCode(String.format("%s = alloca i32\n",ret.getMemoryRecord().register));
				ret.appendCode(String.format("store i32 0, i32* %s\n",ret.getMemoryRecord().register)); //init to 0, which is nice for 'for' syntax
				ret.appendCode(String.format("%s = load i32* %s\n", ret.getRegister(), ret.getMemoryRecord().register));
			} else {
				//allocation , creates array in memory and returns it whole
				ret=new Container(Typeenum.ARRAY);
				//ret.appendCode("start arr\n");
				ret.setRegister(generateNewRegister());
				ret.setIdentifier(ctx.lvalue().getText());
				ret.setDimensionShift(ctx.range().size()); //number of "active", or unsorted dimensions, which is all of them on a newly created array
				//a register for array dimension sizes
				String arrSizesRegister=generateNewRegister();
				ret.appendCode(String.format("%s = alloca i32, i32 %d\n",arrSizesRegister,ctx.range().size()));
				//offset register, set to 0 for new array
				String offsetRegister=generateNewRegister();
				ret.appendCode(String.format("%s = alloca i32\n",offsetRegister));
				ret.appendCode(String.format("store i32 0, i32* %s\n",offsetRegister));
				//and a register for total array size (will be multiplied by every dimension, therefore initial 1)
				String memSizeRegister=generateNewRegister();
				ret.appendCode(String.format("%s = alloca i32\n",memSizeRegister));
				ret.appendCode(String.format("store i32 1, i32* %s\n",memSizeRegister));
				for (int i=0;i<ctx.range().size();i++) {
					Container range=visit(ctx.range(i));
					if (range.getRegister()==null) {
						System.err.println("Expression between [] does not return value");
						//System.exit(1);
					} else if (range.getSecondRegister()!=null) {
						System.err.println("Invalid indexing of an array - can't use bounded ([x..y]) ranges in this context.");
						//System.exit(1);
					}
					ret.appendCode(range.getCode());
					String reg=generateNewRegister();
					//store current dimension size in an array with the rest
					ret.appendCode(String.format("%s = getelementptr i32* %s, i32 %s\n",reg,arrSizesRegister,i));
					ret.appendCode(String.format("store i32 %s, i32* %s\n",range.getRegister(),reg));
					//multiply size by current dimension size
					String partial=generateNewRegister();
					String partialMul=generateNewRegister();
					ret.appendCode(String.format("%s = load i32* %s\n",partial,memSizeRegister));
					ret.appendCode(String.format("%s = mul i32 %s, %s\n",partialMul,partial,range.getRegister()));
					ret.appendCode(String.format("store i32 %s, i32* %s\n",partialMul,memSizeRegister));
				}
				ret.setArrayMemSizeRegister(memSizeRegister);
				ret.setArrayOffsetRegister(offsetRegister);
				ret.setMemoryRecord(new MemoryRecord(ret.getIdentifier(), ret.getRegister(), Typeenum.ARRAY, memSizeRegister, arrSizesRegister, ctx.range().size()));
				mem.getLast().getLast().put(ret.getIdentifier(),ret.getMemoryRecord());
				String size=generateNewRegister();
				ret.appendCode(String.format("%s = load i32* %s\n",size,memSizeRegister));
				ret.appendCode(String.format("%s = alloca i32, i32 %s\n",ret.getRegister(),size));
			}
            mem.getLast().getLast().put(ret.getMemoryRecord().identifier,ret.getMemoryRecord());
		} else {
			if (mr.type==Typeenum.INT) {
				ret=new Container(Typeenum.INT);
				//ret.appendCode("start get int\n");
				ret.setRegister(generateNewRegister());
				ret.setIdentifier(mr.identifier);
				ret.setMemoryRecord(mr);
				ret.appendCode(String.format("%s = load i32* %s\n", ret.getRegister(), mr.register));
			} else {
				//access, returns either an array or an integer at the position given by ranges
				int dimensionShift=mr.numberOfDimensions-ctx.range().size();
				if (dimensionShift<0) {
					System.err.println(String.format("Invalid number of dimensions - specified %s where %s has only %s",ctx.range().size(),mr.identifier,mr.numberOfDimensions));
					//System.exit(1);
				}
				ret=new Container(Typeenum.ARRAY);
				//ret.appendCode("start get arr\n");
				//size of the offsetted array
				String retSize=generateNewRegister();
				String calc=generateNewRegister();
				ret.appendCode(String.format("%s = alloca i32\n",retSize));
				ret.appendCode(String.format("%s = load i32* %s\n", calc, mr.arrayMemSizeRegister));
				ret.appendCode(String.format("store i32 %s, i32* %s\n",calc,retSize));
				//offset in the whole array	
				String offset=generateNewRegister();
				ret.appendCode(String.format("%s = alloca i32\n",offset));
				ret.appendCode(String.format("store i32 0, i32* %s\n",offset));
				for (int i=0;i<ctx.range().size();i++) {
					Container range=visit(ctx.range(i));
                    ret.appendCode(range.getCode());
					if (range.getRegister()==null) {
						System.err.println("Expression between [] does not return value");
						//System.exit(1);
					} else if (range.getSecondRegister()!=null) {
						System.err.println("Invalid indexing of an array - can't use bounded ([x..y]) ranges in this context.");
						//System.exit(1);
					}
					//move accross the current dimension
					String dimSize=generateNewRegister();
					String currentOffset=generateNewRegister();
					String partial=generateNewRegister();
					String partialAdd=generateNewRegister();
                    String dimValue=generateNewRegister();
					//calculating dimension offset
                    ret.appendCode(String.format("%s = getelementptr i32* %s, i32 %s\n",dimSize,mr.dimensionSizesRegister,i)); //get dimension size
                    ret.appendCode(String.format("%s = load i32* %s\n", dimValue,dimSize));
                    if (i<ctx.range().size()-1) {
					    ret.appendCode(String.format("%s = mul i32 %s, %s\n",currentOffset,dimValue,range.getRegister())); //calculate current dim. offset
                    } else {
                        ret.appendCode(String.format("%s = add i32 0, %s\n",currentOffset,range.getRegister())); //calculate new partial offset
                    }
					ret.appendCode(String.format("%s = load i32* %s\n", partial, offset)); 
					ret.appendCode(String.format("%s = add i32 %s, %s\n",partialAdd,partial,currentOffset)); //calculate new partial offset
					ret.appendCode(String.format("store i32 %s, i32* %s\n",partialAdd,offset)); //useless in last iteration
					//calculating return size
					String getRet=generateNewRegister();
					String divRet=generateNewRegister();
					ret.appendCode(String.format("%s = load i32* %s\n", getRet, retSize)); 
					ret.appendCode(String.format("%s = sdiv i32 %s, %s\n",divRet,getRet,dimValue)); 
					ret.appendCode(String.format("store i32 %s, i32* %s\n",divRet,retSize)); //useless in last iteration, but whatever
				}
				ret.setArrayMemSizeRegister(retSize);
				ret.setArrayOffsetRegister(offset);
				ret.setMemoryRecord(mr);
				ret.setRegister(mr.register);
				ret.setIdentifier(mr.identifier);
				ret.setDimensionShift(dimensionShift);
			}
		}
		return ret;
    }


    @Override
    public Container visitSingleRange(ArrowsParser.SingleRangeContext ctx) {
    	Container ret=convertToInt(visit(ctx.expression()));
    	if (ret==null) {
    		System.err.println("Invalid data type (non-integer) inside range");
    		//System.exit(1);
    	}
    	ret.setType(Typeenum.RANGE);
    	return ret;
    }

    @Override
    public Container visitBoundedRange(ArrowsParser.BoundedRangeContext ctx) {
    	Container ret=convertToInt(visit(ctx.expression(0)));
    	if (ret==null) {
    		System.err.println("Invalid data type (non-integer) inside range");
    		//System.exit(1);
    	}
    	ret.setType(Typeenum.RANGE);
		Container second=convertToInt(visit(ctx.expression(1)));
		if (second==null) {
    		System.err.println("Invalid data type (non-integer) inside range");
    		//System.exit(1);
    	}
		ret.appendCode(second.getCode());
		ret.setSecondRegister(second.getRegister());
    	return ret;
    }


    @Override 
    public Container visitQuotedString(ArrowsParser.QuotedStringContext ctx) { 
    	try {
    		String str;
    		if (ctx.content!=null) {
		    	str= ctx.content.getText();
    		} else {
    			str=" "; //dirty fix for skiping whitespaces - also, zero length strings are converted to this
    		}
    		byte[] stringBytes=str.getBytes("ISO-8859-1");
	    	Container ret= new Container(Typeenum.ARRAY);
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
			ret.appendCode(String.format("store i32 %d, i32* %s\n",str.length()+1,memSize));
	    	ret.setArrayMemSizeRegister(memSize);
	    	memSize=generateNewRegister();
	    	ret.appendCode(String.format("%s = load i32* %s\n",memSize,ret.getArrayMemSizeRegister()));
	    	ret.appendCode(String.format("%s = alloca i32, i32 %s\n",ret.getRegister(),memSize)); //this thwors exception
			for (int i=0;i<str.length();i++) {
				String reg=generateNewRegister();
				ret.appendCode(String.format("%s = getelementptr i32* %s, i32 %d\n",reg,ret.getRegister(),i));
				ret.appendCode(String.format("store i32 %d, i32* %s\n",stringBytes[i],reg));
			}
			//trailing 0 character
			String reg=generateNewRegister();
			ret.appendCode(String.format("%s = getelementptr i32* %s, i32 %d\n",reg,ret.getRegister(),str.length()));
			ret.appendCode(String.format("store i32 0, i32* %s\n",reg));
			return ret;
		} catch (UnsupportedEncodingException e) {
    		System.err.println("Your PC sux m8");
    		//System.exit(1);
    	}
    	return null;
    }


    @Override
    public Container visitInput(ArrowsParser.InputContext ctx) {
    	Container ret=new Container(Typeenum.NONE);
    	for (int i=0;i<ctx.singleInput().size();i++) {
    		ret.appendCode(visit(ctx.singleInput(i)));
    	}
    	return ret;
    }


    @Override 
    public Container visitSingleInput(ArrowsParser.SingleInputContext ctx) {
    	Container arw=visit(ctx.inputArrow());
    	Container ret=new Container(Typeenum.NONE);
    	for (int i=0;i<ctx.variable().size();i++) {
	    	Container var=visit(ctx.variable(i));
	    	Container input;
	    	switch (arw.getOpType()) {
	    		case ASSIGN:
	    			input = new Container(Typeenum.INT);
			        input.setRegister(generateNewRegister());
			        input.appendCode(String.format("%s = call i32 @readInt()\n", input.getRegister()));
			        ret.appendCode(var);
			        ret.appendCode(input);
			        ret.inheritFromContainer(var);
			        ret.appendCode(assign(var,input));
	    			break;
	    		case STRING:
	    			arw.setOpType(Openum.ASSIGN); //for purposes of generateBinOp, we're just assigning
	    			input = new Container(Typeenum.ARRAY);
	    			input.inheritFromContainer(var);
			        input.setRegister(generateNewRegister());
			        input.setMemoryRecord(null);
			        String size=generateNewRegister();
			        input.appendCode(String.format("%s = load i32* %s\n",size,var.getArrayMemSizeRegister()));
			        input.appendCode(String.format("call void @readString(i32* %s, i32 %s)\n", input.getRegister(),size));
			        ret.appendCode(var);
			        ret.appendCode(input);
			        ret.inheritFromContainer(var);
			        ret.appendCode(assign(var,input));
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
    	ret.appendCode("call void @printLine()\n");
    	return ret;
    }


	@Override 
    public Container visitSingleOutput(ArrowsParser.SingleOutputContext ctx) {
	    Container arw=visit(ctx.outputArrow());
    	Container ret=new Container(Typeenum.NONE);
    	Container separator=null;
    	if (ctx.quotedString()!=null) {
    		separator=visit(ctx.quotedString());
            ret.appendCode(separator.getCode());
        }
        for (int i=0;i<ctx.expression().size();i++) {
            Container exp=visit(ctx.expression(i));
	    	switch (arw.getOpType()) {
	    		case ASSIGN:
                    exp=convertToInt(exp);
                    ret.appendCode(exp.getCode());
		    		if (exp==null) {
		    			System.err.println("Non-int expression supplied to int-printing statement");
		    			//System.exit(1);
		    		}
		    		if ((separator==null)||(i==ctx.expression().size()-1)) {
		    			ret.appendCode(String.format("call void @printInt(i32 %s)\n", exp.getRegister()));
		    		} else {
				        String size=generateNewRegister();
				        ret.appendCode(String.format("%s = load i32* %s\n",size,separator.getArrayMemSizeRegister()));
				        ret.appendCode(String.format("call void @printIntSep(i32 %s, i32* %s, i32 %s)\n", exp.getRegister(), separator.getRegister(), size));
		    		}
	    			break;
	    		case STRING:
                    ret.appendCode(exp.getCode());
	    			if (exp.getType()!=Typeenum.ARRAY) {
		    			System.err.println("Non-array expression supplied to string-printing statement");
		    			//System.exit(1);
		    		}
		    		if (exp.getDimensionShift()>1) {
		    			System.err.println("An array of up to 1 dimension may be supplied to the printing statement");	
		    			//System.exit(1);
		    		}
		    		//load size, load offset, if no memrecord just subtract, if there is one get given dimension and length reaches to it's limits
		    		String size=generateNewRegister();
                    String offset=generateNewRegister();
                    String ptr=generateNewRegister();
                    ret.appendCode(String.format("%s = load i32* %s\n",size,exp.getArrayMemSizeRegister()));
                    ret.appendCode(String.format("%s = load i32* %s\n",offset,exp.getArrayOffsetRegister()));
                    ret.appendCode(String.format("%s = getelementptr i32* %s, i32 %s\n",ptr,exp.getRegister(),offset));
		    		if ((separator==null)||(i==ctx.expression().size()-1)) {
				        ret.appendCode(String.format("call void @printString(i32* %s, i32 %s)\n", ptr, size));
		    		} else {
		    			String ssize=generateNewRegister();
                        ret.appendCode(String.format("%s = load i32* %s\n",ssize,separator.getArrayMemSizeRegister()));
                        ret.appendCode(String.format("call void @printStringSep(i32* %s, i32 %s,i32* %s, i32 %s)\n", ptr, size,separator.getRegister(),ssize));
		    			
		    		}
	    			break;
	    	}
    	}
    	return ret;
 	}    


    @Override
    public Container visitAdd(ArrowsParser.AddContext ctx) {
        Container c=new Container(ctx.op.getType());
        return generateBinaryOperatorContainer(
                visit(ctx.expression(0)),
                visit(ctx.expression(1)),
                c.getOpType()
        );
    }

    @Override 
    public Container visitMul(ArrowsParser.MulContext ctx) {
    	Container c=new Container(ctx.op.getType());	
        return generateBinaryOperatorContainer(
                visit(ctx.expression(0)),
                visit(ctx.expression(1)),
                c.getOpType()
        );
    }

    @Override 
    public Container visitEq(ArrowsParser.EqContext ctx) {
        Container c=new Container(ctx.op.getType());
        return generateBinaryOperatorContainer(
                visit(ctx.expression(0)),
                visit(ctx.expression(1)),
                c.getOpType()
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
                    ctx.op.getType()
            );
    }

    @Override 
    public Container visitNot(ArrowsParser.NotContext ctx) {
            return generateUnaryOperatorContainer(
                    visit(ctx.expression()),
                    ctx.op.getType()
            );
    }

    @Override
    public Container visitAnd(ArrowsParser.AndContext ctx) {
	    	Container c=new Container(ctx.op.getType());
            return generateBinaryOperatorContainer(
                    visit(ctx.expression(0)),
                    visit(ctx.expression(1)),
                    c.getOpType()
            );
    }

    @Override
    public Container visitOr(ArrowsParser.OrContext ctx) {
	    	Container c=new Container(ctx.op.getType());
            return generateBinaryOperatorContainer(
                    visit(ctx.expression(0)),
                    visit(ctx.expression(1)),
                    c.getOpType()
            );
    }


    @Override 
    public Container visitBlock(ArrowsParser.BlockContext ctx) {
            mem.getLast().addLast(new HashMap<String,MemoryRecord>());
            Container cf=visit(ctx.statements());
            mem.getLast().removeLast();
            return cf;
    }


    @Override 
        public Container visitIf(ArrowsParser.IfContext ctx) {
                Container condition = visit(ctx.expression());
                Container statement_true = visit(ctx.statement(0));
                String return_register = generateNewRegister();
                ST template;
                if (ctx.statement().size()==1) {
                	template = new ST(
                        "<condition_code>" + 
                        "<cmp_reg> = icmp ne i32 <con_reg>, 0\n" + 
                        "br i1 <cmp_reg>, label %<block_true>, label %<block_end>\n" +
                        "<block_true>:\n" +
                        "<statement_true_code>" +
                        "br label %<block_end>\n" + 
                        "<block_end>:\n" +
                        "<ret> = add i32 0, 0\n"
	                );
	                
                    template.add("condition_code", condition);
	                template.add("statement_true_code", statement_true);
	                template.add("cmp_reg", this.generateNewRegister());
                    
	                template.add("con_reg", condition.getRegister());
                    //System.err.println("wat");
	                template.add("block_true", this.generateNewLabel());
	                template.add("block_end", this.generateNewLabel());
	                template.add("ret", return_register);
                } else {
                	Container statement_false = visit(ctx.statement(1));
                	template = new ST(
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
	                template.add("ret", return_register);
                }
            
                Container ret = new Container(Typeenum.NONE);
                ret.setRegister(return_register);
                ret.appendCode(template.render());
                return ret;
        }


    @Override
    public Container visitWhile(ArrowsParser.WhileContext ctx) {
        Container condition = visit(ctx.expression());
        Container body = visit(ctx.statement());
        ST template = new ST(
            "br label %<cmp_label>\n" + 
            "<cmp_label>:\n" + 
            "<condition_code>" +
            "<cmp_register> = icmp ne i32 <condition_register>, 0\n" + 
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
        template.add("body_code", body.getCode());
        String end_register = generateNewRegister();
        template.add("ret", end_register);
        
        Container ret = new Container(Typeenum.NONE);
        ret.appendCode(template.render());
        ret.setRegister(end_register);
        return ret;
    }

    @Override
    public Container visitFor(ArrowsParser.ForContext ctx) {
        Container exp = visit(ctx.expression());
        Container body = visit(ctx.statement());
        Container range = visit(ctx.range());
        if (range.getSecondRegister()==null) {
        	System.err.println("Invalid use of range in for");
        	//System.exit(1);
        }
        if (exp.getMemoryRecord()==null) {
        	System.err.println("You must supply a variable to for");
        	//System.exit(1);
        }
        String it=exp.getMemoryRecord().register;
        String step;
        String bound=range.getSecondRegister();
        String start=range.getRegister();
        if (ctx.op.getType()==ArrowsParser.LA) {
        	step="add";
        } else {
        	step="sub";
        }
        //initialize the iterator
        String init_code=String.format("store i32 %s, i32* %s\n",start,it);
        exp.setRegister(start);
        //condition code
        String loadIt=generateNewRegister();
        String compare=generateNewRegister();
        String cond_code=String.format("%s = load i32* %s\n%s = icmp ne i32 %s, %s\n",loadIt,it,compare,bound,loadIt);
        //increment/decrement code
        String load=generateNewRegister();
        loadIt=generateNewRegister();
        String inc_compare=generateNewRegister();
        String inc_code=String.format("%s = load i32* %s\n%s = %s i32 %s, 1\nstore i32 %s, i32* %s\n",loadIt,it,load,step,loadIt,load,it);
        ST template = new ST(
            "<range_code>" +
            "<expr_code>" +
        	"<init_code>" +
            "br label %<cmp_label>\n" + 
            "<cmp_label>:\n" + 
            "<condition_code>" +
            "br i1 <cmp_register>, label %<body_label>, label %<end_label>\n" + 
            "<body_label>:\n" + 
            "<body_code>" +
            "<increment>" + 
            "br label %<cmp_label>\n" + 
            "<end_label>:\n" + 
            "<ret> = add i32 0, 0\n"
        );
        template.add("range_code",range.getCode());
        template.add("expr_code",exp.getCode());
        template.add("init_code",init_code);
        template.add("cmp_label", generateNewLabel());
        template.add("condition_code", cond_code);
        template.add("cmp_register", compare);
        template.add("body_label", generateNewLabel());
        template.add("end_label", generateNewLabel());
        template.add("body_code", body);
        template.add("increment",inc_code);
        String end_register = generateNewRegister();
        template.add("ret", end_register);
        
        Container ret = new Container(Typeenum.NONE);
        ret.appendCode(template.render());
        ret.setRegister(end_register);
        return ret;
    }


	@Override
        public Container visitFun(ArrowsParser.FunContext ctx) {
                Container code = new Container(Typeenum.NONE);
                String name = ctx.lvalue().getText();

                Function f = new Function(name, new Container(Typeenum.NONE),null);
                if (!func.containsKey(name)) {
                        func.put(name, f);
                } else {
                        System.err.println(String.format("Error: function '%s' already declared", name));
                        //System.exit(1);
                }

                mem.addLast(new LinkedList<Map<String,MemoryRecord> >());
                mem.getLast().addLast(new HashMap<String, MemoryRecord>());
                Container args = visit(ctx.args());
                f.args=args.getArgs();
                f.code.appendCode(args);
                f.code.appendCode(visit(ctx.statement()));
                mem.removeLast();
                return code;
        }

        @Override
        public Container visitCall(ArrowsParser.CallContext ctx) {
                Container code = new Container();
                String name = ctx.lvalue().getText();
                Function f = null;
                if (func.containsKey(name)){
                    f = func.get(name);
                } else {
                    System.err.println(String.format("Error: function '%s' is not declared", name));
                    //System.exit(1);
                }
                Container params = visit(ctx.params());
                String register = generateNewRegister();
                ST template = new ST(
                    "<args_code>" +
                    "<reg> = call i32 @<name>(<args>)\n"
                );
                template.add("args_code", params);
                template.add("name", f.name);
                template.add("args", argsToString(params.getArgs()));
                template.add("reg", register);
                code.appendCode(template.render());
                code.setType(Typeenum.INT);
                code.setRegister(register);
                return code;
        }

        //for extracting single elements from arrays as ints - if not possible, returns null 
        private Container convertToInt(Container c) {
        	if (c.getType()==Typeenum.INT) {
        		return c;
        	} else {
        		if (c.getDimensionShift()==0) {
        			String elem=generateNewRegister();
        			String offset=generateNewRegister();
        			String result=generateNewRegister();
        			c.appendCode(String.format("%s = load i32* %s\n",offset,c.getArrayOffsetRegister()));
        			c.appendCode(String.format("%s = getelementptr i32* %s, i32 %s\n",elem,c.getRegister(),offset));
            		c.appendCode(String.format("%s = load i32* %s\n",result,elem));
            		c.setRegister(result);
            		c.setType(Typeenum.INT);
            		c.setMemoryRecord(null);
            		return c;
        		} else {
        			return null;
        		}
        	}
        }

        @Override
        public Container visitReturn(ArrowsParser.ReturnContext ctx) {
                Container code;
                code = convertToInt(visit(ctx.expression()));
                if (code==null) {
                	System.err.println("Invalid return value");
                	//System.exit(1);
                }
                code.appendCode(String.format("ret i32 %s\n", code.getRegister()));
                return code;
        }

        @Override public Container visitArgs(ArrowsParser.ArgsContext ctx) {
                Container code = new Container(Typeenum.NONE);
                for (int i = 0; i< ctx.variable().size(); i++) {
                		Container var=visit(ctx.variable(i)); //allocates some extra memory we won't use , TODO match the line in code and delete it
                		if (var.getMemoryRecord()==null) {
                			System.err.println("Invalid function argument");
                			//System.exit(1);
                		}
                        String argRegister = generateNewRegister(); //this goes into parentheses along with type
                        var.setRegister(argRegister);
                        if (var.getType()==Typeenum.INT) {
                        	String ptrreg=generateNewRegister();
                            String valreg=generateNewRegister();
                            var.appendCode("store i32 "+argRegister+", i32* "+var.getMemoryRecord().register+"\n");
                        } else {
                        	//arrays already pass pointers
	                        var.getMemoryRecord().register=argRegister;
                        }
                		code.appendCode(var);
                		//for the sake of arg, modify the memory record in case of INT (the code does nothing in case of ARRAYS, that already use argRegister  as pointer)
                		MemoryRecord mr=new MemoryRecord(var.getMemoryRecord());
                        mr.register=argRegister;
                        code.getArgs().add(mr);
                }
                return code;
        }

        @Override 
        public Container visitParams(ArrowsParser.ParamsContext ctx) {
                Container code = new Container();
                for (int i = 0; i < ctx.expression().size(); i++) {
                    Container expr_code = visit(ctx.expression(i));
                    //turn 1 element array into int if possible
                    Container converted=convertToInt(expr_code);
                    if (converted!=null) expr_code=converted;
                    code.appendCode(expr_code);
                    if (expr_code.getType()==Typeenum.INT) {
                    	code.getArgs().add(new MemoryRecord(expr_code.getIdentifier(),expr_code.getRegister(),Typeenum.INT)); 
                    } else {
                        code.getArgs().add(expr_code.getMemoryRecord());
                    }
                }
                return code;
        }

        private Container generateFunctionCode() {
                Container code = new Container();
                for(Map.Entry<String,Function> e : func.entrySet()) {
                        Function f=e.getValue();
                        ST template = new ST(
                                "define i32 @<name>(<args>) {\n" +
                                "start:\n" +
                                "<body_code>" +
                                "ret i32 0\n" + 
                                "}\n"
                        );
                        template.add("name", f.name);
                        template.add("body_code", f.code);
                        template.add("args", argsToString(f.getArgs()));

                        code.appendCode(template.render());
                        code.setRegister(f.code.getRegister());
                }
                return code;
        }

        private String argsToString(List<MemoryRecord> records) {
                String s = "";
                boolean begin = true;
                for (MemoryRecord m : records) {
                        if (!begin) {
                                s += ", ";
                        } else {
                                begin = false;
                        }
                        if (m.type==Typeenum.ARRAY) {
                        	s += "i32* " + m.register;
                        } else {
                        	s += "i32 " + m.register;
                    	}
                }
                return s;
            }

}