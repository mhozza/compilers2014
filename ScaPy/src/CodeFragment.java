public class CodeFragment {
        private String code;
        private String register;
        private Type type;

        private String var;

        public CodeFragment() {
                this.code = "";
                this.register = null;
        }

        public String getVar() {
            return this.var;
        }

        public void setVar(String var) {
            this.var = var;
        }

        public void appendCodeFragment(CodeFragment fragment) {
                this.addCode(fragment);
                this.setRegister(fragment.getRegister());
                this.setType(fragment.getType());
        }

        public void addCode(String code) {
                this.code += code;
        }

        public void addCode(CodeFragment fragment) {
                this.code += fragment.toString();
        }

        public String toString() {
                return this.code;
        }

        public void setRegister(String register) {
                this.register = register;
        }

        public String getRegister() {
                return this.register;
        }

        public Type getType(){
                return this.type;
        }

        public void setType(Type type){
                this.type = type;
        }
}
