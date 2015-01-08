import java.util.*;
import org.stringtemplate.v4.*;

public class Container {
	
	//LLVM code fragment
	private StringBuilder code;
	//variable info
	private String register;
	private String identifier;
	private MemoryRecord record;
	//operator info
	private boolean swap;
	//array info
	private Integer dimensionShift;
	private String arrayMemSizeRegister;
	private String arrayOffsetRegister;
	//range info
	private String secondRegister; //for bounded range
	//container type info
	private ArrowsExtendedVisitor.Openum opType;
	private ArrowsExtendedVisitor.Typeenum type;
	//functions info - for params, we need only registers, for arguments also types (array vs int)
	private ArrayList<MemoryRecord> args;

	public Container() {
		args=new ArrayList<MemoryRecord>();
		code=new StringBuilder();
		register=null;
		identifier=null;
		secondRegister=null;
		swap=false;
		dimensionShift=0;
	}

	public Container(ArrowsExtendedVisitor.Typeenum _t) {
		this();
		type=_t;
		//if we're setting an unknown type, make both enums euqall
		if (type==ArrowsExtendedVisitor.Typeenum.NONE) opType=ArrowsExtendedVisitor.Openum.NONE;
	}

	public Container(int _t) {
		this();
		switch(_t) {
			case ArrowsParser.MUL: 
				opType=ArrowsExtendedVisitor.Openum.MUL;
				break;
			case ArrowsParser.DIV:
				opType=ArrowsExtendedVisitor.Openum.DIV;
				break;
			case ArrowsParser.ADD:
				opType=ArrowsExtendedVisitor.Openum.ADD;
				break;
			case ArrowsParser.SUB:
				opType=ArrowsExtendedVisitor.Openum.SUB;
				break;
			case ArrowsParser.EQ:
				opType=ArrowsExtendedVisitor.Openum.EQUAL;
				break;
			case ArrowsParser.NEQ:
				opType=ArrowsExtendedVisitor.Openum.NEQUAL;
				break;
			case ArrowsParser.SEQ:
				opType=ArrowsExtendedVisitor.Openum.SEQUAL;
				break;
			case ArrowsParser.GEQ:
				opType=ArrowsExtendedVisitor.Openum.GEQUAL;
				break;
			case ArrowsParser.GT:
				opType=ArrowsExtendedVisitor.Openum.GREATER;
				break;
			case ArrowsParser.ST:
				opType=ArrowsExtendedVisitor.Openum.SMALLER;
				break;
		}
	}

	public Container(ArrowsExtendedVisitor.Openum _opt,boolean _s) {
		this();
		swap=_s;
		opType=_opt;
		if (opType==ArrowsExtendedVisitor.Openum.NONE) type=ArrowsExtendedVisitor.Typeenum.NONE;
	}

	public String getCode() {
		return code.toString();
	}

	public void setCode(String _c) {
		code=new StringBuilder();
		code.append(_c);
	}

	public void setCode(ST _temp) {
		code=new StringBuilder();
		code.append(_temp.render());
	}

	public void appendCode(String _c) {
		code.append(_c);
	}
	
	public void appendCode(ST _c) {
		code.append(_c.render());
	}

	public void appendCode(Container _c) {
		code.append(_c.getCode());
	}

	public String getRegister() {
		return register;
	}

	public void setRegister(String _r) {
		register=_r;
	}

	public String getIdentifier() {
		return identifier;
	}

	public void setIdentifier(String _id) {
		identifier=_id;
	}

	public MemoryRecord getMemoryRecord() {
		return record;
	}

	public void setMemoryRecord(MemoryRecord mr) {
		record=mr;
	}

	public void swap() {
		swap=!swap;
	}

	public boolean getSwap() {
		return swap;
	}

	public ArrowsExtendedVisitor.Typeenum getType() {
		return type;
	}

	public void setType(ArrowsExtendedVisitor.Typeenum _t) {
		type=_t;
	}

	public ArrowsExtendedVisitor.Openum getOpType() {
		return opType;
	}

	public void setOpType(ArrowsExtendedVisitor.Openum _t) {
		opType=_t;
	}

	public Integer getDimensionShift() {
		return dimensionShift;
	}

	public void setDimensionShift(int _ds) {
		dimensionShift=_ds;
	}

	public String getArrayMemSizeRegister() {
		return arrayMemSizeRegister;
	}

	public void setArrayMemSizeRegister(String _s) {
		arrayMemSizeRegister=_s;
	}

	public String getArrayOffsetRegister() {
		return arrayOffsetRegister;
	}

	public void setArrayOffsetRegister(String _o) {
		arrayOffsetRegister=_o;
	}

	public String getSecondRegister() {
		return secondRegister;
	}

	public void setSecondRegister(String _sr) {
		secondRegister=_sr;
	}

	public ArrayList<MemoryRecord> getArgs() {
		return args;
	}

	public void setArgs(ArrayList<MemoryRecord> _a) {
		args=_a;
	}

	public String toString() {
		return code.toString();
	}

	public void inheritFromContainer(Container c) {
		//sets everything except for the code
		register=c.getRegister();
		identifier=c.getIdentifier();
		swap=c.getSwap();
		dimensionShift=c.getDimensionShift();
		arrayMemSizeRegister=c.getArrayMemSizeRegister();
		arrayOffsetRegister=c.getArrayOffsetRegister();
		opType=c.getOpType();
		type=c.getType();
		secondRegister=c.getSecondRegister();
		args=c.getArgs();
	}

}