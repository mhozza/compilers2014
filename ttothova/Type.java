public class Type {
	public static final int INT    = 0;
	public static final int FLOAT  = 1;
	public static final int VOID   = 2;
	public static final int BOOL   = 3;
	public static final int STRING = 4;

	public static int getType(String type) {
			if (type.equals("int") || type.equals("i32")) { return INT; }
			if (type.equals("float" )) { return FLOAT; }
			if (type.equals("void"  )) { return VOID;  }
			if (type.equals("bool"  )) { return BOOL;  }
			if (type.equals("string")) { return STRING;}
			return INT;
	}

	public static String getLLVMtype(String type) {
			if (type.equals("int")) {return "i32";}
			return type;
	}

	public static String getLLVMtype(int t) {
			switch (t) {
					case 0: return "i32";
					case 1: return "float";
					case 2: return "void";
					case 3: return "i1";
					case 4: return "string";			
			}
			return "i32";
	}

	public static String getStringType(int t) {
			switch (t) {
					case 0: return "int";
					case 1: return "float";
					case 2: return "void";
					case 3: return "bool";
					case 4: return "string";			
			}
			return "int";
	}

	public static boolean isVoid(String type) {
			if (type.equals("void")) { return true; }
			return false;
	}

	public static boolean isVoid(int type) {
			if (type == VOID) { return true; }
			return false;
	}

	public static boolean isFloat(String type) {
			if (type.equals("float")) { return true; }
			return false;
	}

	public static boolean isFloat(int type) {
			if (type == FLOAT) { return true; }
			return false;
	}

	private Type() { }
}