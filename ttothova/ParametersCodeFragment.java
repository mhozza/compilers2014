import java.util.ArrayList;
import java.util.ListIterator;

public class ParametersCodeFragment extends CodeFragment {
	private String parameters;
	private String init_parameters;

	public ParametersCodeFragment() {
		super();
		this.parameters = "";
		this.init_parameters = "";
	}

	public void addParameter(String param) {
		if (this.parameters.equals("")) {
			this.parameters = param;
		} else {
			this.parameters += ", " + param;
		}
	}

	public String getParameters() {
		return this.parameters;
	}

	public void addInitParametersCode(String code) {
		this.init_parameters += code;
	}

	public String getInitParameters() {
		return this.init_parameters;
	}
}