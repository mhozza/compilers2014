import java.util.LinkedList;

public class ParamsCodeFragment extends CodeFragment {
	public class Param {
		public String register;
		public String identifier;
		public int type;

		public Param(String register, String identifier, int type) {
			this.register = register;
			this.identifier = identifier;
			this.type = type;
		}
	}

	LinkedList<Param> params = new LinkedList<Param>();
	
	void addParam(String register, String identifier, int type) {
		params.add(new Param(register, identifier, type));
	}

	LinkedList<Param> getParams() {
		return params;
	}
}
