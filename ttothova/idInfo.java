public class idInfo {
	private String register;
	private Integer type;
	private Boolean arrayStatus;
	private String arrayType = "";

	public idInfo(String register, Integer type, Boolean arrayStatus) {
		this.register = register;
		this.type = type;
		this.arrayStatus = arrayStatus;
	}

	public String getRegister() {
		return this.register;
	}

	public void setRegister(String register) {
		this.register = register;
	}

	public Integer getType() {
		return this.type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public void setType(String type) {
		if (type.equals("float")) {
			this.type = 1;
		} else {
			this.type = 0;
		}
	}

	public Boolean isArray() {
		return this.arrayStatus;
	}

	public void setArrayStatus(Boolean arrayStatus) {
		this.arrayStatus = arrayStatus;
	}

	public void setArrayType(String arrayType) {
		this.arrayType = arrayType;
	}

	public String getArrayType() {
		return this.arrayType;
	}
}