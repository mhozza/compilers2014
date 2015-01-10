import java.util.*;

public class Function {
        public String name;
        public Container code;
        public ArrayList<MemoryRecord> args;// = new ArrayList<MemoryRecord>();

        Function(String _n, Container _c, ArrayList<MemoryRecord> _a) {
                name=_n;
                code=_c;
                args=_a;
        }


        public String getName() {
                return name;
        }

        public void setName(String _n) {
                name=_n;
        }

        public Container getContainer() {
                return code;
        }

        public void setContainer(Container _c) {
                code = _c;
        }

        public ArrayList<MemoryRecord> getArgs() {
                return args;
        }

        public void setArgs(ArrayList<MemoryRecord> _a) {
                args=_a;
        }
}