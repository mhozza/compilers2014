import java.util.*;
import org.stringtemplate.v4.*;

public class Container {
	
	//LLVM code fragment
	private StringBuilder code;
	//variable info
	private String register;
	private String identifier;
	private MemoreRecord record;
	//operator info
	private boolean swap;
	//array info
	private Integer dimensionShift;
	private String arrayMemSizeRegister;
	private String arrayOffsetRegister;
	//private ArrayList<Integer> arraySizes;
	//range info
	private String secondRegister; //for bounded range
	//container type info
	private ArrowsExtendedVisitor.Openum opType;
	private ArrowsExtendedVisitor.Typeenum type;

	public Container() {
		code=new StringBuilder();
		register=null;
		identifier=null;
		memory_map=null;
		swap=false;
		dimensionShift=0;
		arraySizes=new ArrayList<Integer>();
	}

	public Container(ArrowsExtendedVisitor.Typeenum _t) {
		type=_t;
		//if we're setting an unknown type, make both enums euqall
		if (type==ArrowsExtendedVisitor.Typeenum.NONE) opType=ArrowsExtendedVisitor.Openum.NONE;
		this();
	}

	public Container(Openum _opt) {
		opType=_opt;
		if (opType==ArrowsExtendedVisitor.Openum.NONE) type=ArrowsExtendedVisitor.Typeenum.NONE;
		this();
	}

	public String getCode() {
		return code.toString();
	}

	public void setCode(String _c) {
		code=new StringBuilder();
		code.append(_c);
	}

	public void setCode(ST _temp) {
		code=_temp.render();
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

	public Map<String,String> getMemoryMap() {
		return memory_map;
	}

	public void setMemoryMap(Map<String,String> _m) {
		memory_map=_m;
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

	public Integer getActiveDimensions() {
		return arraySizes.size()-dimensionShift;
	}

	public ArrayList<Integer> getArraySizes() {
		return arraySizes;
	}

	public void setArraySizes(ArrayList<Integer> arr) {
		//arrayDimensions=arr.size();
		arraySizes=arr;
	}

	public Integer getArrayMemSize() {
		return arrayMemSize;
	}

	public void setArrayMemSize(int _s) {
		arrayMemSize=_s;
	}

	public String toString() {
		code.toString();
	}

	public void inheritFromContainer(Container c) {
		//sets everything except for the code
		register=c.getRegister();
		identifier=c.getIdentifier();
		memory_map=c.getMemoryMap();
		swap=c.getSwap();
		dimensionShift=c.getDimensionShift();
		arrayMemSize=c.getArrayMemSize();
		arraySizes=c.getArrySizes();
		opType=c.getOpType();
		type=c.getType();
	}

	public Container operateBinary(Container left,Container right) throws {
		if (swap) {
			Container halp=left;
			left=right;
			right=halp;
		}

		switch (opType) {
			case ASSIGN:
				break;
			case ADDSIGN:
				break;
			case SUBSIGN:
				break;
			case MULSIGN:
				break;
			case DIVSIGN:
				break;
			case POSIGN:
				break;
			case SWAP:
				break;
			default:
				//error
				break;
		}
	}

	public Container operateUnary(Container right) {
		switch(opType) {
			case PRINTINT:
				break;
			case PRINTCHAR:
				break;
			case PRINTCHARLINE:
				break;
			case PRINTINTLINE:
				break;
			case READINT:
				break;
			case READCHAR:
				break;
			case READCHARLINE:
				break;
			case READINTLINE:
				break;
		}
	}

	//saving ryan's privates
	
	
}