public class idInfo {
	private String register;
	private Integer type;

	public idInfo(String register, Integer type) {
		this.register = register;
		this.type = type;
	}

	public String getRegister() {
		return this.register;
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
}