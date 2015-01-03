import java.util.*;
import org.stringtemplate.v4.*;

public class Container {
	
	private StringBuilder code;
	private String register;
	private String identifier;
	private boolean swap;
	private int dimensionShift;
	private ArrayList<Integer> arraySizes;
	private ArrowsExtendedVisitor.Openum opType;
	private ArrowsExtendedVisitor.Typeenum type;

	public Container() {
		code=new StringBuilder();
		register=null;
		identifier=null;
		swap=false;
		dimensionShift=0;
		opType=NONE;
	}

	public Container(ArrowsExtendedVisitor.Typeenum _t) {
		type=_t;
		this();
	}

	public Container(Openum _opt) {
		opType=_opt;
		this.super();
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

	public String getIdentifier

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

	public ArrayList<Integer> getArray() {
		return arraySizes;
	}

	public void setArray(ArrayList<Integer> arr) {
		//arrayDimensions=arr.size();
		arraySizes=arr;
	}

	public 

	public String toString() {
		code.toString();
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