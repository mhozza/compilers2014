public class Type {     
    public String code = "";
    private String name = "";
    private String def = "";

    public Type(String n, String c, String d) {
        name = n;
        code = c;
        def = d;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String c) {
        this.code = c;
    }

    public void setName(String c) {
        this.name = c;
    }  

    public static Type convert(String t) {       
        switch (t) {
            case "i": 
                return new Type(t, "i32", "0");
            case "f": 
                return new Type(t, "double", "0.0");
            case "b": 
                return new Type(t, "i1", "0");
            case "s": 
                return new Type(t, "i8", "");
        }
        return null;
    }

    @Override
    public String toString() {
        return this.name;
    }

    public String getDefaultValue() {
        return this.def;
    } 
    
    public String[] getOperations() {
        if ("f".equals(this.name)) return new String[] 
            {"fadd", "fsub", "fmul", "fdiv", "frem", "@fexp", 
            "fcmp eq", "fcmp ne", "fcmp sle", "fcmp sge", "fcmp sgt", "fcmp slt"};
        return new String[]  
            {"add", "sub", "mul", "sdiv", "srem", "@iexp",
            "icmp eq", "icmp ne", "icmp sle", "icmp sge", "icmp sgt", "icmp slt"}; 
    } 
    
    public static boolean compare(Type a, Type b) {
        return a.getSubType().getCode().equals(b.getSubType().getCode());
    }  
    
    public Type getSubType() {
        return this;
    } 
}
