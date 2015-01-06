public enum Type {

    BOOL("bool", "i32"),
    INT("int", "i32"),
    FLOAT("float", "double"),
    CHAR("char", "i32"),
    INT_POINTER("int*", "i32*"),
    CHAR_POINTER("char*", "i32*"),
    BOOL_POINTER("bool*", "i32*"),
    FLOAT_POINTER("float*", "double*");

    String name = "";
    String code = "";

    Type(String name, String code){
        this.name = name;
        this.code = code;
    }

    public String getCode(){
        return code;
    }

}
