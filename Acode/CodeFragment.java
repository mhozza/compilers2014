import java.util.ArrayList;
public class CodeFragment {
        private String code;
        private String register;
        private String type;
		private ArrayList<Variable> args;
		//private ArrayList<String> params;

        public CodeFragment() {
                this.code = "";
                this.register = null;
		this.args=new ArrayList<Variable>();
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

	public ArrayList<Variable> args_list(){
		//System.err.println(this.args.get(0));
		return this.args;
	}
	public void addArg(Variable x){
		this.args.add(x);
	}
	public String args_code(){
		String code="";
		if(args.size()>0){
			code=code.concat(Variable.getLLVMType(args.get(0).type)+" ");
			code=code.concat(args.get(0).register);
			for(int i=1;i<args.size();i++){
				code=code.concat(","+"i32 "+args.get(i).register);		
			}
		}
		//System.err.println(arguments.size());
		return code;
		
	}
	public String extern_args_code(){
		String code="";
		if(args.size()>0){
			code=code.concat("i32");
			for(int i=1;i<args.size();i++){
				code=code.concat(","+"i32 ");		
			}
		}
		//System.err.println(arguments.size());
		return code;
		
	}

	/*public ArrayList<String> param_list(){
		return this.params;

	public void addParam(String x){
		this.params.add(x);
	}*/
	public void appendCodeFragment(CodeFragment fragment) {
                this.addCode(fragment);
                this.setRegister(fragment.getRegister());
        }	

   	public void setType(String type) {
			this.type = type;
	}

	public String getType() {
 		return this.type;
 	}
}
