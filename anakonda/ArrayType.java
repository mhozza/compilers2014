public class ArrayType implements Type {
    public Type subtype;
    public String code = "i8*";
    public String name = "";

    public final boolean isIterable() {
        return true;
    }

    public String getName() {
        return this.name;
    }

    @Override public boolean equals(Object t) {
        return this.name.equals(t.toString());
    }

    public boolean isInteger() {
        return false;
    }

    public boolean isNumeric() {
        return false;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Type getSubtype() {
        return this.subtype;
    }

    public void setSubtype(Type subtype) {
        this.subtype = subtype;
    }


    public String getCode() {
        return this.code;
    }

    public String toString() {
        return this.name;
    }

    ArrayType(Type subtype) {
        this.subtype = subtype;
        this.setName(subtype.toString() + "[]");
    }


    public String getDefaultValue() {
        return "[]";
    }
}
