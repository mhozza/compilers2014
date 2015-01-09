public interface Type {
    public String getDefaultValue();
    public String getCode();
    public String toString();
    public boolean isInteger();
    public boolean isNumeric();
    public boolean isIterable();
}
