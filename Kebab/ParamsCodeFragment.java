import java.util.LinkedList;

public class ParamsCodeFragment extends CodeFragment {
	public class Param {
		public String register;
		public String identifier;

		public Param(String register, String identifier) {
			this.register = register;
			this.identifier = identifier;
		}
	}

	LinkedList<Param> params = new LinkedList<Param>();
	
	void addParam(String register, String identifier) {
		params.add(new Param(register, identifier));
	}

	LinkedList<Param> getParams() {
		return params;
	}
}
