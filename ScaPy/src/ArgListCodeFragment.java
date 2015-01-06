import java.util.ArrayList;
import java.util.List;

public class ArgListCodeFragment extends CodeFragment {

    private List<Variable> args = new ArrayList<Variable>();

    public List<Variable> getArgs() {
        return this.args;
    }

    public void addArg(Variable v) {
        this.args.add(v);
    }
}
