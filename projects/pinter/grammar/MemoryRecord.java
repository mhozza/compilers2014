public class MemoryRecord {
	public String register;
	public String identificator;
	public ArrowsExtendedVisitor.Typeenum type;

	//info for array types
	public Integer arrayMemSize;
	public ArrayList<Integer> arraySizes;

	public MemoryRecord(String _id,String _reg, ArrowsExtendedVisitor.Typeenum _t) {
		register=_reg;
		identificator=_id;
		type=_t;
	}

	public MemoryRecord(String _id,String _reg, ArrowsExtendedVisitor.Typeenum _t, Integer _size, ArrayList<Integer> _arrSizes) {
		register=_reg;
		identificator=_id;
		type=_t;
		arrayMemSize=_size;
		arraySizes=_arrSizes;
	}

}