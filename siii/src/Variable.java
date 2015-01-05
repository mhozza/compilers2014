import java.util.List;

public class Variable {
	private String register = "";
	private String type = "";
	private String subType = "";

	Variable() {
		this.register = "";
		this.type = "";
		this.subType = "";
	}

	Variable(String register, String type, String subtype) {
		this.register = register;
		this.type = type;
		this.subType = subtype;
	}

	public void setRegister(String register) {
		this.register = register;
	}

	public String getRegister() {
		return this.register;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getType() {
		return this.type;
	}

	public void setSubType(String type) {
		this.subType = type;
	}

	public String getSubType() {
		return this.subType;
	}
}