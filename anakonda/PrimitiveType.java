import java.util.HashMap;

public enum PrimitiveType implements Type {
    BOOL("bool", "i1", "0", true, true, false),
    CHAR("char", "i8", "0", true, true, false),
    INT("int", "i32", "0", true, true, false),
    NOTYPE("NOTYPE", "", "", false, false, false);

    private String code = "";
    private String name = "";
    private String def = "";

    boolean integer = false;
    boolean numeric = false;
    boolean iterable = false;

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public static Type fromString(String t) {
        if (t.equals("int")) {
            return INT;
        }
        if (t.equals("bool")) {
            return BOOL;
        }
        if (t.equals("string")) {
            return new ArrayType(PrimitiveType.CHAR);
        }

        // if (t.equals("void")) {
        //     return VOID;
        // }

        return NOTYPE;
    }

    public String toString() {
        return this.name;
    }

    private PrimitiveType(String name, String code, String def, boolean integer, boolean numeric, boolean iterable) {
        this.name = name;
        this.code = code;
        this.def = def;
        this.integer = integer;
        this.numeric = numeric;
        this.iterable = iterable;
    }

    public boolean isInteger() {
        return integer;
    }

    public boolean isNumeric() {
        return numeric;
    }

    public boolean isIterable() {
        return iterable;
    }

    public String getDefaultValue() {
        return this.def;
    }
}
