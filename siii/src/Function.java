import java.util.List;

public class Function {
	private String name;
	private List<Variable> params;
	private String returnType;
	private CodeFragment code;

	public CodeFragment getCode() {
		return this.code;
	}

	public void setCode(CodeFragment code) {
		if (code == null)
			code = new CodeFragment();
		this.code = code;
	}

	public List<Variable> getParams() {
		return this.params;
	}

	public void setParams(List<Variable> params) {
		this.params = params;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getReturnType() {
		return this.returnType;
	}

	public void setReturnType(String returnType) {
		this.returnType = returnType;
	}

	public Function(String name, List<Variable> params, List<String> params_type) {
		this(name, params, null, null);
	}

	public Function(String name, List<Variable> params, String returnType, CodeFragment code) {
		this.setName(name);
		this.setParams(params);
		this.setCode(code);
		this.setReturnType(returnType);
	}
}