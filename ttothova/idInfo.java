public class idInfo {
	private String register;
	private Integer type;
	private Boolean array;

	public idInfo(String register, Integer type, Boolean array) {
		this.register = register;
		this.type = type;
		this.array = array;
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
		return this.array;
	}

	public void setArrayStatus(Boolean array) {
		this.array = array;
	}
}