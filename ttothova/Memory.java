import java.util.HashMap;
import java.util.Map;

public class Memory {
	private Memory parent;
	private Map<String,idInfo> variable_mem;

	public Memory() {
		this.parent = null;
		this.variable_mem = new HashMap<String,idInfo>();
	}

	public Memory(Memory parent) {
		this.parent = parent;
		this.variable_mem = new HashMap<String,idInfo>();
	}

	public Boolean IsRoot() {
		if (this.parent == null) {
			return true;
		}
		return false;
	}

	public Memory getParent() {
		return this.parent;
	}

	public void setParent(Memory parent) {
		this.parent = parent;
	}

	public void put(String key, String var, Integer type) {
		this.variable_mem.put(key, new idInfo(var,type,false));
	}

	public void put(String key, String var, String type) {
		this.variable_mem.put(key, new idInfo(var,Type.getType(type),false));
	}

	public void put(String key, String var, Integer type, Boolean array) {
		this.variable_mem.put(key, new idInfo(var,type,array));
	}

	public void put(String key, String var, String type, Boolean array) {
		this.variable_mem.put(key, new idInfo(var,Type.getType(type),array));
	}

	public String get(String key) {
		if (this.variable_mem.containsKey(key)) {
			return this.variable_mem.get(key).getRegister();
		}
		if (this.parent != null) {
			return this.parent.get(key);
		}
		return null;
	}

	public Integer getType(String key) {
		if (this.variable_mem.containsKey(key)) {
			return this.variable_mem.get(key).getType();
		}
		if (this.parent != null) {
			return this.parent.getType(key);
		}
		return null;
	}

	public Boolean isInt(String key) {
		return Type.isInt(getType(key));
	}

	public Boolean isFloat(String key) {
		return Type.isFloat(getType(key));
	}	

	public Boolean containsKey(String key) {
		if (this.variable_mem.containsKey(key)) {
			return true;
		}
		if (this.parent != null) {
			return this.parent.containsKey(key);
		}
		return false;
	}

	public Boolean thisContainsKey(String key) {
		return this.variable_mem.containsKey(key);
	}

	public  Boolean isArray(String key) {
		if (this.variable_mem.containsKey(key)) {
			return this.variable_mem.get(key).isArray();
		}
		if (this.parent != null) {
			return this.parent.isArray(key);
		}
		return null;		
	}

	public void setArrayStatus(String key, Boolean array) {
		if (this.variable_mem.containsKey(key)) {
			this.variable_mem.get(key).setArrayStatus(array);
		}
		if (this.parent != null) {
			this.parent.setArrayStatus(key, array);
		}
	}

	public void changeRegister(String key, String register) {
		if (this.variable_mem.containsKey(key)) {
			this.variable_mem.get(key).setRegister(register);
		}
		if (this.parent != null) {
			this.parent.changeRegister(key, register);
		}
	}

	public void setArrayType(String key, String arrayType) {
		if (this.variable_mem.containsKey(key)) {
			this.variable_mem.get(key).setArrayType(arrayType);
		}
		if (this.parent != null) {
			this.parent.setArrayType(key, arrayType);
		}		
	}

	public String getArrayType(String key) {
		if (this.variable_mem.containsKey(key)) {
			return this.variable_mem.get(key).getArrayType();
		}
		if (this.parent != null) {
			return this.parent.getArrayType(key);
		}		
		return null;
	}
}