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

	public void put(String key, String var, String type) {
		this.variable_mem.put(key, new idInfo(var,type));
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
		Integer type = getType(key);
		if (type == 0) {
			return true;
		}
		return false;
	}

	public Boolean isFloat(String key) {
		Integer type = getType(key);
		if (type == 1) {
			return true;
		}
		return false;
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
}