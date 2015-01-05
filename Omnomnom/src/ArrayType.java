public class ArrayType extends Type {
    private Type type;

    public ArrayType(Type t) {
        super("{"+ t.toString() + "}", "i8*", "");
        this.type = t;
    } 
    
    @Override
    public Type getSubType() {
        return type;
    }    
}
