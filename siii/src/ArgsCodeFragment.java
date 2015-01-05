import java.util.List;
import java.util.ArrayList;

public class ArgsCodeFragment extends CodeFragment {
	private List<Variable> args = new ArrayList<Variable>();

	public List<Variable> getArgs() {
		return this.args;
	}

	public void setArgs(List<Variable> args) {
		this.args = args;
	}

	public void addArg(Variable v) {
		this.args.add(v);
	}
}