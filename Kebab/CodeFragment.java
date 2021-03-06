public class CodeFragment {
        private String code;
        private String register;
	private String size_register;
        private int type;
	private int length;

        public CodeFragment() {
                this.code = "";
		this.size_register = "";
                this.register = null;
		this.length = 0;
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

	public int getLenght() {
                return this.length;
        }

	public void setLength(int length) {
                this.length = length;
        }

        public void setType(int type) {
                this.type = type;
        }

        public int getType() {
                return this.type;
        }
}
