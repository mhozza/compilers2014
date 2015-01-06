/**
 * Created by tony on 12/14/14.
 */
public class Variable {

    private String register;
    private String name;
    private Type type;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegister() {
        return this.register;
    }

    public void setRegister(String register) {
        this.register = register;
    }

    public Type getType(){
        return this.type;
    }

    public void setType(Type type){
        this.type = type;
    }

    public Variable(String name, String reg, Type type) {
        this.setRegister(reg);
        this.setName(name);
        this.setType(type);
    }
}
