import java.util.ArrayList;
public class Function{
        public String name;
        public ArrayList<Variable> arguments;
        public CodeFragment body;
        public Type type;

        Function(String _name, Type _type, ArrayList<Variable> _arguments,CodeFragment _body){
                name = _name;
                type = _type;
                arguments = _arguments;
                body = _body;

        }
}