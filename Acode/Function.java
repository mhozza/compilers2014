import java.util.ArrayList;
public class Function{
	private String type;
 	public String name;
	public ArrayList<Variable> arguments=new ArrayList<Variable>(); 
	public CodeFragment body;

	Function(String type, String name, ArrayList args, CodeFragment body){
		this.type=type;
		this.name=name;
		this.arguments=args;
		this.body=body;
	}
	public String args(){
		String code="";
		String type="";
		
		if(arguments.size()>0){

			code=code.concat(Variable.getLLVMType(arguments.get(0).type)+" ");
				code=code.concat(arguments.get(0).register);
			for(int i=1;i<arguments.size();i++){
				code=code.concat(","+Variable.getLLVMType(arguments.get(i).type)+" ");
				code=code.concat(arguments.get(i).register);		
			}
		}
		
		return code;
		
	}
	public String type(){
		 String t = "";
         switch (type) {
            case "int":
                t="i32";
                break;
            case "void":
                t = "void";
                break;
            case "bool":
                t = "i1";
                break;    
        }
        return t;
	}

}
