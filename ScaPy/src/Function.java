import java.util.List;

/**
 * Created by tony on 12/14/14.
 */
public class Function {

    private String name;
    private List<Variable> params;
    private CodeFragment code;
    private Type type;
    private String id;

    public void setId(String id) {
        this.id = id;
    }

    public String getId(){
        return this.id;
    }

    public CodeFragment getCode() {
        return this.code;
    }

    public void setCode(CodeFragment code) {
        if (code == null) {
            code = new CodeFragment();
        }
        this.code = code;
    }

    public List<Variable> getParams() {
        return this.params;
    }

    public void setParams(List<Variable> params) {
        this.params = params;
    }

    public String getName() {
        return this.name;
    }

    public Type getType(){
        return this.type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(Type type){
        this.type = type;
    }

    public Function(String id, String name, Type type, List<Variable> params, CodeFragment code) {
        this.setId(id);
        this.setName(name);
        this.setType(type);
        this.setParams(params);
        this.setCode(code);
    }

}
