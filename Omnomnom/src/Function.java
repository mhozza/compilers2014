
import java.util.LinkedList;

public class Function {

    private String name;
    private Type type;
    private LinkedList<Variable> args;

    public Function(String n, Type t, LinkedList<Variable> a) {
        this.name = n;
        this.type = t;
        this.args = a;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String n) {
        this.name = n;
    }

    public Type getType() {
        return this.type;
    }

    public void setType(Type t) {
        this.type = t;
    }

    public LinkedList<Variable> getArgs() {
        return this.args;
    }

    public void setArgs(LinkedList<Variable> a) {
        this.args = a;
    }
}
