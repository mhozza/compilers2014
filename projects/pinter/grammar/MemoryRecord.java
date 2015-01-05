public class MemoryRecord {
	public String register;
	public String identificator;
	public ArrowsExtendedVisitor.Typeenum type;

	//info for array types
	public Integer numberOfDimensions;
	public String arrayMemSizeRegister;
	public String dimensionSizesRegister;

	public MemoryRecord(String _id,String _reg, ArrowsExtendedVisitor.Typeenum _t) {
		register=_reg;
		identificator=_id;
		type=_t;
	}

	public MemoryRecord(String _id,String _reg, ArrowsExtendedVisitor.Typeenum _t, String _size, String _arrSizes, Integer _dim) {
		register=_reg;
		identificator=_id;
		type=_t;
		arrayMemSizeRegister=_size;
		dimensionSizesRegister=_arrSizes;
		numberOfDimensions=_dim;
	}

}