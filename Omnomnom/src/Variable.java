public class Variable {
    private String name;
    private String register;
    private Type type;

    public Variable(String n, Type t, String r) {
        this.register = r;
        this.type = t;
        this.name = n;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    }

    public void setRegister(String register) {
        this.register = register;
    }
        
    public String getRegister() {
        return this.register;
    }

    public void setType(Type type) {
        this.type = type;
    }
    
    public Type getType() {
        return this.type;
    } 
}