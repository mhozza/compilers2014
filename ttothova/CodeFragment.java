public class CodeFragment {
        private String code;
        private String register;
        private Integer type;   // 0..int 1..float 2..void

        public CodeFragment() {
                this.code = "";
                this.register = null;
                this.type = 0;
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

        public void setType(String type) {
                this.type = Type.getType(type);
        }

        public void setType(Integer type) {
                this.type = type;
        }

        public Integer getType() {
                return this.type;
        }

        public String getTypeString() {
                return Type.getLLVMtype(this.type);
        }

        public Boolean isInt() {
                if (this.type == Type.INT) {
                        return true;
                }
                return false;
        }

        public Boolean isFloat() {
                return Type.isFloat(this.type);
        }
}
