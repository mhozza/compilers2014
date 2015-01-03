public class Function {
        public String name;
        public CodeFragment code;
        public ArrayList<String> args = new ArrayList<String>();

        Function(String _n, CodeFragment _c, ArrayList<String> _a) {
                name=_n;
                code=_c;
                args=_a;
        }

/*
        public String getName() {
                return name;
        }

        public void setName(String _n) {
                name=_n
        }

        public Container getContain() {
                return name;
        }

        public void setName(String _n) {
                name=_n
        }*/
}