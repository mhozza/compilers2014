import java.util.ArrayList;
import java.util.List;

/**
 * Created by tony on 1/3/15.
 */
public class ArrayParamCodeFragment extends CodeFragment{

    private List<String> args = new ArrayList<String>();

    public List<String> getArgs() {
        return this.args;
    }

    public void addArg(String v) {
        this.args.add(v);
    }
}
