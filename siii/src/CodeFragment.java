public class CodeFragment {
        public String code;
        private String register;
        private String type;
        private String subType;
        private boolean list = false;
        private String index = "";

        public CodeFragment() {
                this.code = "";
                this.register = null;
                this.type = "";
                this.subType = "";
        }

        public void addCode(String code) {
                this.code += code;
        }

        public void addCode(CodeFragment fragment) {
                this.code += fragment.toString();
        }

        public String getCode() {
                return this.code;
        }

        public void appendCodeFragment(CodeFragment fragment) {
                this.addCode(fragment);
                this.setRegister(fragment.getRegister());
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
                this.type = type;
        }

        public String getType() {
                return this.type;
        }

        public void setSubType(String type) {
                this.subType = type;
        }

        public String getSubType() {
                return this.subType;
        }

        public void setList(boolean list) {
                this.list = list;
        }

        public boolean getList(){
                return this.list;
        }

        public void setIndex(String index) {
                this.index = index;
        }

        public String getIndex(){
                return this.index;
        }
}
