public class Variable {
    public Type type;
    public String register;
    public String name;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Type getType() {
        return this.type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getRegister() {
        return this.register;
    }

    public void setRegister(String register) {
        this.register = register;
    }

    public Variable(String name, String reg, Type t) {
        this.setRegister(reg);
        this.setType(t);
        this.setName(name);
    }

}
