import java.util.LinkedList;

public class CodeFragment {
        private String code;
        private String register;
        private Type type;
        private LinkedList<Variable> variables;

        public CodeFragment() {
                this.code = "";
                this.register = null;
                this.variables = new LinkedList<>();
                this.type = null;
        }
        
        @Override
        public String toString() {
                return this.code;
        }

        public void setCode(String code) {
                this.code = code;
        }
        
        public void addCode(String code) {
                this.code += code;
        }

        public void addCode(CodeFragment fragment) {
                this.code += fragment.toString();
        }
        
        public void appendCode(CodeFragment fragment) {
                this.addCode(fragment);
                this.setType(fragment.getType());
                this.setRegister(fragment.getRegister());
        }
        
        public void setRegister(String register) {
                this.register = register;
        }

        public String getRegister() {
                return this.register;
        }
        
        public void setType(Type type) {
                this.type = type;
        }
        
        public Type getType() {
                return this.type;
        }
        
        public void addVar(Variable var) {
                this.variables.add(var);
        }
        
        public LinkedList<Variable> getVar() {
                return this.variables;
        }
}
