public class ArrayCodeFragment extends CodeFragment {
		private String identifier = "";
		private String arrayRegister = "";

		public void setIdentifier(String identifier) {
				this.identifier = identifier;
		}

		public String getIdentifier() {
				return this.identifier;
		}

        public void setArrayRegister(String register) {
        		this.arrayRegister = register;
        }

        public String getArrayRegister() {
        		return this.arrayRegister;
        }
}