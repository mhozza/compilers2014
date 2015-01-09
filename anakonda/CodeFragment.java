import java.lang.Boolean;
import java.util.ArrayList;
public class CodeFragment {
        public String code;
        public String register;
        public ArrayList<Variable> args;
        public String info;
        public Type type;
        public String ireg;
        public Type itype;
        public Boolean isArray = false;
        public Type subtype;

        public CodeFragment() {
                this.code = "";
                this.register = null;
                this.ireg = null;
                this.itype = null;
                this.subtype = null;
                this.args = new ArrayList<Variable>();
                this.info = "";
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

        public void appendFragment(CodeFragment fragment) {
                this.addCode(fragment);
                this.setRegister(fragment.getRegister());
                this.type = fragment.type;
                if (fragment.ireg != null){
                        this.ireg = fragment.ireg;
                }
                if (fragment.itype != null){
                        this.itype = fragment.itype;
                }
        }

        public String getRegister() {
                return this.register;
        }
}
