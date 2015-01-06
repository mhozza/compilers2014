import java.util.*;

import org.stringtemplate.v4.*;

public class CompilerVisitor extends scapyBaseVisitor<CodeFragment>{

        LinkedList<Map<String, Variable>> variables = new LinkedList<Map<String, Variable>>();
        HashMap<String, Function> functions = new HashMap<String, Function>();
        HashSet<Function> libfunctions = new HashSet<Function>();
        HashSet<Variable> constVariable = new HashSet<Variable>();

        private int labelIndex = 0;
        private int registerIndex = 0;
        private int functionIndex = 0;

        private String generateNewLabel() {
                return String.format("L%d", this.labelIndex++);
        }

        private String generateNewRegister() {
                return String.format("%%R%d", this.registerIndex++);
        }

        private String generateNewFunctionName() {
            return String.format("@F%d", this.functionIndex++);
        }

        @Override
        public CodeFragment visitInit(scapyParser.InitContext ctx) {

                addTable();

                CodeFragment body = new CodeFragment();
                for(scapyParser.Import_functionContext s : ctx.import_function()) {
                        CodeFragment f = visit(s);
                        body.appendCodeFragment(f);
                }

                generateLibFunctions();

                CodeFragment body2 = visit(ctx.statements());
                body.appendCodeFragment(body2);

                ST template = new ST(
                                "<libfunctions>" +
                                "<functions>" +
                                "define i32 @main() {\n" +
                                "start:\n" +
                                "<body_code>" +
                                "ret i32 0\n" +
                                "}\n"
                );

                template.add("body_code", body);
                template.add("functions", generateCodeFunctions());
                template.add("libfunctions", generateCodeLibFunctions());

                CodeFragment code = new CodeFragment();
                code.addCode(template.render());
                code.setRegister(body.getRegister());
                return code;
        }

        private void generateLibFunctions() {

                // PrintInt
                List<Variable> p = new ArrayList<Variable>();
                p.add(new Variable("x", "", Type.INT));
                Function f = new Function("printInt", "@printInt", Type.INT, p, null);
                libfunctions.add(f);
                declareFunc("printInt", f);

                // iexp
                p = new ArrayList<Variable>();
                p.add(new Variable("x", "", Type.INT));
                p.add(new Variable("y", "", Type.INT));
                f = new Function("iexp", "@iexp", Type.INT, p, null);
                libfunctions.add(f);
                declareFunc("iexp", f);

                // fexp
                p = new ArrayList<Variable>();
                p.add(new Variable("x", "", Type.FLOAT));
                p.add(new Variable("y", "", Type.FLOAT));
                f = new Function("fexp", "@fexp", Type.FLOAT, p, null);
                libfunctions.add(f);
                declareFunc("fexp", f);

                // PrintFloat
                p = new ArrayList<Variable>();
                p.add(new Variable("x", "", Type.FLOAT));
                f = new Function("printFloat", "@printFloat", Type.INT, p, null);
                libfunctions.add(f);
                declareFunc("printFloat", f);

                // ReadInt
                f = new Function("readInt", "@readInt", Type.INT, new ArrayList<Variable>(), null);
                libfunctions.add(f);
                declareFunc("readInt", f);

                // CreateArrayInt
                p = new ArrayList<Variable>();
                p.add(new Variable("length", "", Type.INT));
                f = new Function("createArrayInt", "@createArrayInt", Type.INT_POINTER, p, null);
                libfunctions.add(f);

                // GetElementArrayInt
                p = new ArrayList<Variable>();
                p.add(new Variable("pole", "", Type.INT_POINTER));
                p.add(new Variable("index", "", Type.INT));
                f = new Function("getElementArrayInt", "@getElementArrayInt", Type.INT_POINTER, p, null);
                libfunctions.add(f);

                // CreateArrayChar
                p = new ArrayList<Variable>();
                p.add(new Variable("length", "", Type.INT));
                f = new Function("createArrayChar", "@createArrayChar", Type.CHAR_POINTER, p, null);
                libfunctions.add(f);

                // GetElementArrayChar
                p = new ArrayList<Variable>();
                p.add(new Variable("pole", "", Type.CHAR_POINTER));
                p.add(new Variable("index", "", Type.INT));
                f = new Function("getElementArrayChar", "@getElementArrayChar", Type.CHAR_POINTER, p, null);
                libfunctions.add(f);

                // PrintString
                p = new ArrayList<Variable>();
                p.add(new Variable("pole", "", Type.CHAR_POINTER));
                f = new Function("printString", "@printString", Type.INT, p, null);
                libfunctions.add(f);
                declareFunc("printString", f);

                // PrintString2
                p = new ArrayList<Variable>();
                p.add(new Variable("pole", "", Type.CHAR_POINTER));
                p.add(new Variable("length", "", Type.INT));
                f = new Function("printString2", "@printString2", Type.INT, p, null);
                libfunctions.add(f);
                declareFunc("printString2", f);

                // ReadString
                f = new Function("readString", "@readString", Type.CHAR_POINTER, new ArrayList<Variable>(), null);
                libfunctions.add(f);
                declareFunc("readString", f);

                // GetLengthString
                p = new ArrayList<Variable>();
                p.add(new Variable("pole", "", Type.CHAR_POINTER));
                f = new Function("getLengthString", "@getLengthString", Type.INT, p, null);
                libfunctions.add(f);
                declareFunc("getLengthString", f);

                // CreateArrayFloat
                p = new ArrayList<Variable>();
                p.add(new Variable("length", "", Type.INT));
                f = new Function("createArrayFloat", "@createArrayFloat", Type.FLOAT_POINTER, p, null);
                libfunctions.add(f);

                // GetElementArrayFloat
                p = new ArrayList<Variable>();
                p.add(new Variable("pole", "", Type.FLOAT_POINTER));
                p.add(new Variable("index", "", Type.INT));
                f = new Function("getElementArrayFloat", "@getElementArrayFloat", Type.FLOAT_POINTER, p, null);
                libfunctions.add(f);

                // CreateArrayBool
                p = new ArrayList<Variable>();
                p.add(new Variable("length", "", Type.INT));
                f = new Function("createArrayBool", "@createArrayBool", Type.BOOL_POINTER, p, null);
                libfunctions.add(f);

                // GetElementArrayBool
                p = new ArrayList<Variable>();
                p.add(new Variable("pole", "", Type.BOOL_POINTER));
                p.add(new Variable("index", "", Type.INT));
                f = new Function("getElementArrayBool", "@getElementArrayBool", Type.BOOL_POINTER, p, null);
                libfunctions.add(f);

        }

        private CodeFragment generateCodeLibFunctions() {

                CodeFragment code = new CodeFragment();

                for(Function f : libfunctions) {
                        ST template = new ST(
                                "declare <type> <name>(<args>)\n"
                        );

                        template.add("type", f.getType().getCode());
                        template.add("name", f.getName());
                        template.add("args", getParamsString(f.getParams()));

                        code.addCode(template.render());
                        code.setType(f.getCode().getType());
                        code.setRegister(f.getCode().getRegister());

                }
                return code;
        }

        private String getParamsString(List<Variable> params) {
                StringBuilder s = new StringBuilder();
                boolean begin = true;
                for (Variable p : params) {
                        if (!begin) {
                            s.append(", ") ;
                        } else {
                            begin = false;
                        }
                        s.append(p.getType().getCode() + " " + p.getRegister());
                }
                return s.toString();
        }

        private CodeFragment generateCodeFunctions() {
                CodeFragment code = new CodeFragment();

                for (Map.Entry<String, Function> e : functions.entrySet()) {
                        Function f = e.getValue();

                        if (libfunctions.contains(f)) continue;

                        if (f.getType() != null) {

                                ST template = new ST(
                                        "define <type> <name>(<args>) {\n" +
                                        "start:\n" +
                                        "<body_code>" +
                                        "}\n"
                                );

                                template.add("type", f.getType().getCode());
                                template.add("name", f.getName());
                                template.add("body_code", f.getCode());
                                template.add("args", getParamsString(f.getParams()));

                                code.addCode(template.render());
                                code.setRegister(f.getCode().getRegister());
                                code.setType(f.getType());
                        }
                        else {

                                ST template = new ST(
                                        "define i32 <name>(<args>) {\n" +
                                        "start:\n" +
                                        "<body_code>" +
                                        "ret i32 0\n" +
                                        "}\n"
                                );

                                template.add("name", f.getName());
                                template.add("body_code", f.getCode());
                                template.add("args", getParamsString(f.getParams()));

                                code.addCode(template.render());
                                code.setRegister(f.getCode().getRegister());
                                code.setType(Type.INT);
                        }
                }

                return code;
        }

        @Override
        public CodeFragment visitImport_function(scapyParser.Import_functionContext ctx){

                CodeFragment code = new CodeFragment();

                Type type = getType(ctx.type().getText());
                String id = ctx.id().getText();
                String name = "@" + id;

                ArgListCodeFragment arglist = (ArgListCodeFragment) visit(ctx.arglist());
                Function f = new Function(id, name, type, arglist.getArgs(), null);
                declareFunc(id, f);
                libfunctions.add(f);

                code.setType(arglist.getType());
                code.setRegister(arglist.getRegister());

                return code;
        }

        @Override
        public CodeFragment visitProc_def(scapyParser.Proc_defContext ctx){

                CodeFragment code = new CodeFragment();

                String name = generateNewFunctionName();
                String id = ctx.id().getText();

                CodeFragment body = new CodeFragment();

                Function f = new Function(id, name, null, null, body);
                declareFunc(id, f);

                addTable();

                ArgListCodeFragment arglist = (ArgListCodeFragment) visit(ctx.arglist());
                f.setParams(arglist.getArgs());
                body.appendCodeFragment(arglist);
                body.appendCodeFragment(visit(ctx.proc_statements()));

                removeTable();

                return code;
        }

        @Override
        public CodeFragment visitProc_statements(scapyParser.Proc_statementsContext ctx){

                CodeFragment code = new CodeFragment();

                for(scapyParser.Base_statementContext s: ctx.base_statement()) {
                        CodeFragment statement = visit(s);
                        code.addCode(statement);
                        code.setRegister(statement.getRegister());
                        code.setType(statement.getType());
                }
                return code;
        }

        @Override
        public CodeFragment visitSimple_assignment(scapyParser.Simple_assignmentContext ctx){

                CodeFragment ret = new CodeFragment();
                CodeFragment value = visit(ctx.expression());

                if (value.getType()==Type.CHAR_POINTER){
                        throw new Exception("Error: String variable is val");
                }

                if (value.getType()==Type.INT_POINTER || value.getType()==Type.BOOL_POINTER || value.getType()==Type.FLOAT_POINTER){
                        throw new Exception("Error: Array variable is val");
                }

                if (ctx.array_list() == null){

                        String id = ctx.id().getText();
                        Variable v = getVar(id);

                        if (v.getType() != value.getType()) {
                                throw new Exception("Error: incompatible types");
                        }

                        if (constVariable.contains(v)){
                                throw new Exception("Error: Reassingment to val");
                        }

                        ST template = new ST(
                                "<value_code>" +
                                "store <type> <value_register>, <type>* <mem_register>\n"
                        );
                        template.add("value_code", value);
                        template.add("value_register", value.getRegister());
                        template.add("mem_register", v.getRegister());
                        template.add("type", v.getType().getCode());

                        ret.addCode(template.render());
                        ret.setRegister(value.getRegister());
                        ret.setType(v.getType());
                }
                else{
                        CodeFragment code = visit(ctx.array_list());

                        String id = ctx.id().getText();
                        Variable v = getVar(id);

                        if (v.getType() == Type.INT_POINTER) {

                                String r1 = this.generateNewRegister();
                                ST template = new ST(
                                        "<value_code>" +
                                        "<index_code>" +
                                        "<r1> = call <type>* @getElementArrayInt(<type>* <array_reg>, <type> <index_reg>)\n" +
                                        "store <type> <value_reg>, <type>* <r1>\n"
                                );

                                template.add("value_code", value);
                                template.add("index_code", code);
                                template.add("r1", r1);
                                template.add("array_reg", v.getRegister());
                                template.add("index_reg", code.getRegister());
                                template.add("value_reg", value.getRegister());
                                template.add("type", Type.INT.getCode());

                                ret.addCode(template.render());
                                ret.setRegister(value.getRegister());
                                ret.setType(Type.INT_POINTER);
                        }

                        if (v.getType() == Type.CHAR_POINTER){

                                String r1 = this.generateNewRegister();
                                ST template = new ST(
                                        "<value_code>" +
                                        "<index_code>" +
                                        "<r1> = call <type>* @getElementArrayChar(<type>* <array_reg>, i32 <index_reg>)\n" +
                                        "store <type> <value_reg>, <type>* <r1>\n"
                                );

                                template.add("value_code", value);
                                template.add("index_code", code);
                                template.add("r1", r1);
                                template.add("array_reg", v.getRegister());
                                template.add("index_reg", code.getRegister());
                                template.add("value_reg", value.getRegister());
                                template.add("type", Type.CHAR.getCode());

                                ret.addCode(template.render());
                                ret.setRegister(value.getRegister());
                                ret.setType(Type.CHAR_POINTER);
                        }

                        if (v.getType() == Type.BOOL_POINTER){

                                String r1 = this.generateNewRegister();
                                ST template = new ST(
                                        "<value_code>" +
                                        "<index_code>" +
                                        "<r1> = call <type>* @getElementArrayInt(<type>* <array_reg>, i32 <index_reg>)\n" +
                                        "store <type> <value_reg>, <type>* <r1>\n"
                                );

                                template.add("value_code", value);
                                template.add("index_code", code);
                                template.add("r1", r1);
                                template.add("array_reg", v.getRegister());
                                template.add("index_reg", code.getRegister());
                                template.add("value_reg", value.getRegister());
                                template.add("type", Type.BOOL.getCode());

                                ret.addCode(template.render());
                                ret.setRegister(value.getRegister());
                                ret.setType(Type.BOOL_POINTER);
                        }

                        if (v.getType() == Type.FLOAT_POINTER){

                                String r1 = this.generateNewRegister();
                                ST template = new ST(
                                        "<value_code>" +
                                        "<index_code>" +
                                        "<r1> = call <type>* @getElementArrayFloat(<type>* <array_reg>, i32 <index_reg>)\n" +
                                        "store <type> <value_reg>, <type>* <r1>\n"
                                );

                                template.add("value_code", value);
                                template.add("index_code", code);
                                template.add("r1", r1);
                                template.add("array_reg", v.getRegister());
                                template.add("index_reg", code.getRegister());
                                template.add("value_reg", value.getRegister());
                                template.add("type", Type.FLOAT.getCode());

                                ret.addCode(template.render());
                                ret.setRegister(value.getRegister());
                                ret.setType(Type.FLOAT_POINTER);
                        }

                }

                return ret;
        }

        @Override
        public CodeFragment visitCreate_array_assignment(scapyParser.Create_array_assignmentContext ctx){
                CodeFragment codeLength = visit(ctx.expression());
                if (codeLength.getType() != Type.INT) throw new Exception("Error: Length of array must be Int");

                Type type = getType(ctx.type().getText());

                if (type == Type.INT){
                        String id = ctx.id().getText();
                        Variable v = getVar(id);
                        String mem_reg = this.generateNewRegister();
                        v.setRegister(mem_reg);

                        ST template = new ST(
                                "<length_code>" +
                                "<mem_reg> = call <type>* @createArrayInt(<type> <length_reg>)\n"
                        );

                        template.add("length_code", codeLength);
                        template.add("mem_reg", mem_reg);
                        template.add("length_reg", codeLength.getRegister());
                        template.add("type", type.getCode());

                        CodeFragment ret = new CodeFragment();
                        ret.addCode(template.render());
                        ret.setRegister(mem_reg);
                        ret.setType(Type.INT_POINTER);
                        return ret;
                }

                if (type == Type.CHAR){
                        String id = ctx.id().getText();
                        Variable v = getVar(id);
                        String mem_reg = this.generateNewRegister();
                        v.setRegister(mem_reg);

                        ST template = new ST(
                                "<length_code>" +
                                "<mem_reg> = call <type>* @createArrayChar(<type> <length_reg>)\n"
                        );

                        template.add("length_code", codeLength);
                        template.add("mem_reg", mem_reg);
                        template.add("length_reg", codeLength.getRegister());
                        template.add("type", type.getCode());

                        CodeFragment ret = new CodeFragment();
                        ret.addCode(template.render());
                        ret.setRegister(mem_reg);
                        ret.setType(Type.CHAR_POINTER);
                        return ret;
                }

                if (type == Type.BOOL){
                        String id = ctx.id().getText();
                        Variable v = getVar(id);
                        String mem_reg = this.generateNewRegister();
                        v.setRegister(mem_reg);

                        ST template = new ST(
                                "<length_code>" +
                                "<mem_reg> = call <type>* @createArrayInt(<type> <length_reg>)\n"
                        );

                        template.add("length_code", codeLength);
                        template.add("mem_reg", mem_reg);
                        template.add("length_reg", codeLength.getRegister());
                        template.add("type", type.getCode());

                        CodeFragment ret = new CodeFragment();
                        ret.addCode(template.render());
                        ret.setRegister(mem_reg);
                        ret.setType(Type.BOOL_POINTER);
                        return ret;
                }

                if (type == Type.FLOAT){
                        String id = ctx.id().getText();
                        Variable v = getVar(id);
                        String mem_reg = this.generateNewRegister();
                        v.setRegister(mem_reg);

                        ST template = new ST(
                                "<length_code>" +
                                "<mem_reg> = call <type>* @createArrayFloat(<type> <length_reg>)\n"
                        );

                        template.add("length_code", codeLength);
                        template.add("mem_reg", mem_reg);
                        template.add("length_reg", codeLength.getRegister());
                        template.add("type", type.getCode());

                        CodeFragment ret = new CodeFragment();
                        ret.addCode(template.render());
                        ret.setRegister(mem_reg);
                        ret.setType(Type.FLOAT_POINTER);
                        return ret;
                }

                return null;
        }

        @Override
        public CodeFragment visitSuper_assignment(scapyParser.Super_assignmentContext ctx){

                CodeFragment ret = new CodeFragment();
                CodeFragment value = visit(ctx.expression());
                int operator = ctx.op.getType();

                if (ctx.array_list() == null){

                        String id = ctx.id().getText();
                        Variable v = getVar(id);

                        if (v.getType() != value.getType()) {
                                throw new Exception("Error: incompatible types");
                        }

                        if (constVariable.contains(v)){
                                throw new Exception("Error: Reassingment to val");
                        }

                        String instruction = "";
                        switch (operator) {
                                case scapyParser.ADD_ASS:
                                        if (v.getType() == Type.INT) instruction = "add";
                                        if (v.getType() == Type.FLOAT) instruction = "fadd";
                                        break;
                                case scapyParser.SUB_ASS:
                                        if (v.getType() == Type.INT) instruction = "sub";
                                        if (v.getType() == Type.FLOAT) instruction = "fsub";
                                        break;
                                case scapyParser.MUL_ASS:
                                        if (v.getType() == Type.INT) instruction = "mul";
                                        if (v.getType() == Type.FLOAT) instruction = "fmul";
                                        break;
                                case scapyParser.DIV_ASS:
                                        if (v.getType() == Type.INT) instruction = "sdiv";
                                        if (v.getType() == Type.FLOAT) instruction = "fdiv";
                                        break;
                                case scapyParser.MOD_ASS:
                                        if (v.getType() == Type.INT) instruction = "srem";
                                        if (v.getType() == Type.FLOAT) instruction = "frem";
                                        break;
                        }

                        ST template = new ST(
                                "<value_code>" +
                                "<r1> = load <type>* <mem_reg>\n" +
                                "<r2> = <instruction> <type> <r1>, <value_reg>\n" +
                                "store <type> <r2>, <type>* <mem_reg>\n"
                        );

                        template.add("value_code", value);
                        template.add("value_reg", value.getRegister());
                        template.add("mem_reg", v.getRegister());
                        template.add("r1", this.generateNewRegister());
                        template.add("r2", this.generateNewRegister());
                        template.add("instruction", instruction);
                        template.add("type", v.getType().getCode());

                        ret.addCode(template.render());
                        ret.setRegister(value.getRegister());
                        ret.setType(v.getType());
                }
                else{
                        CodeFragment code = visit(ctx.array_list());

                        String id = ctx.id().getText();
                        Variable v = getVar(id);

                        String instruction = "";
                        switch (operator) {
                                case scapyParser.ADD_ASS:
                                        if (v.getType() == Type.INT_POINTER || v.getType() == Type.CHAR_POINTER || v.getType() == Type.BOOL_POINTER) instruction = "add";
                                        if (v.getType() == Type.FLOAT_POINTER) instruction = "fadd";
                                        break;
                                case scapyParser.SUB_ASS:
                                        if (v.getType() == Type.INT_POINTER || v.getType() == Type.CHAR_POINTER || v.getType() == Type.BOOL_POINTER) instruction = "sub";
                                        if (v.getType() == Type.FLOAT_POINTER) instruction = "fsub";
                                        break;
                                case scapyParser.MUL_ASS:
                                        if (v.getType() == Type.INT_POINTER || v.getType() == Type.CHAR_POINTER || v.getType() == Type.BOOL_POINTER)instruction = "mul";
                                        if (v.getType() == Type.FLOAT_POINTER) instruction = "fmul";
                                        break;
                                case scapyParser.DIV_ASS:
                                        if (v.getType() == Type.INT_POINTER || v.getType() == Type.CHAR_POINTER || v.getType() == Type.BOOL_POINTER) instruction = "sdiv";
                                        if (v.getType() == Type.FLOAT_POINTER) instruction = "fdiv";
                                        break;
                                case scapyParser.MOD_ASS:
                                        if (v.getType() == Type.INT_POINTER || v.getType() == Type.CHAR_POINTER || v.getType() == Type.BOOL_POINTER) instruction = "srem";
                                        if (v.getType() == Type.FLOAT_POINTER) instruction = "frem";
                                        break;
                        }

                        String r1 = this.generateNewRegister();

                        String getString = "";
                        if (v.getType() == Type.INT_POINTER) getString = String.format("%s = call i32* @getElementArrayInt(i32* %s, i32 %s)\n", r1, v.getRegister(), code.getRegister());
                        if (v.getType() == Type.CHAR_POINTER) getString = String.format("%s = call i32* @getElementArrayChar(i32* %s, i32 %s)\n", r1, v.getRegister(), code.getRegister());
                        if (v.getType() == Type.BOOL_POINTER) getString = String.format("%s = call i32* @getElementArrayInt(i32* %s, i32 %s)\n", r1, v.getRegister(), code.getRegister());
                        if (v.getType() == Type.FLOAT_POINTER) getString = String.format("%s = call double* @getElementArrayFloat(double* %s, i32 %s)\n", r1, v.getRegister(), code.getRegister());

                        ST template = new ST(
                                "<value_code>" +
                                "<index_code>" +
                                "<get_code>" +
                                "<r> = load <type>* <r1>\n"+
                                "<r2> = <instruction> <type> <r>, <value_reg>\n" +
                                "store <type> <r2>, <type>* <r1>\n"
                        );

                        template.add("value_code", value);
                        template.add("index_code", code);
                        template.add("get_code", getString);
                        template.add("value_reg", value.getRegister());
                        template.add("mem_reg", v.getRegister());
                        template.add("r1", r1);
                        template.add("r", this.generateNewRegister());
                        template.add("r2", this.generateNewRegister());
                        template.add("instruction", instruction);

                        String c = "";
                        if (v.getType()==Type.FLOAT_POINTER){
                                c = "double";
                        }
                        else{
                                c = "i32";
                        }

                        template.add("type", c);

                        ret.addCode(template.render());
                        ret.setRegister(value.getRegister());
                        ret.setType(v.getType());
                }

                return ret;

        }

        @Override
        public CodeFragment visitDeclare_array_var(scapyParser.Declare_array_varContext ctx){

                CodeFragment codeLength = visit(ctx.expression());
                if (codeLength.getType() != Type.INT) throw new Exception("Error: Length of array must be Int");

                Type type;
                if (ctx.type().size() == 2){
                        type = getType(ctx.type(0).getText());
                        Type type2 = getType(ctx.type(1).getText());
                        if (type != type2) throw new Exception("Error: Declaration types incompatible");
                }
                else{
                        type = getType(ctx.type(0).getText());
                }

                if (type == Type.INT){
                        String id = ctx.id().getText();

                        Map<String, Variable> table = variables.getFirst();
                        String mem_register = this.generateNewRegister();

                        Variable v = new Variable(id, mem_register, Type.INT_POINTER);
                        table.put(id, v);

                        ST template = new ST(
                                "<length_code>" +
                                "<mem_reg> = call <type>* @createArrayInt(<type> <length_reg>)\n"
                        );

                        template.add("length_code", codeLength);
                        template.add("mem_reg", mem_register);
                        template.add("length_reg", codeLength.getRegister());
                        template.add("type", type.getCode());

                        CodeFragment ret = new CodeFragment();
                        ret.addCode(template.render());
                        ret.setRegister(mem_register);
                        ret.setType(Type.INT_POINTER);
                        return ret;

                }

                if (type == Type.CHAR) {
                        String id = ctx.id().getText();

                        Map<String, Variable> table = variables.getFirst();
                        String mem_register = this.generateNewRegister();

                        Variable v = new Variable(id, mem_register, Type.CHAR_POINTER);
                        table.put(id, v);

                        ST template = new ST(
                                "<length_code>" +
                                "<mem_reg> = call <type>* @createArrayChar(i32 <length_reg>)\n"
                        );

                        template.add("length_code", codeLength);
                        template.add("mem_reg", mem_register);
                        template.add("length_reg", codeLength.getRegister());
                        template.add("type", type.getCode());

                        CodeFragment ret = new CodeFragment();
                        ret.addCode(template.render());
                        ret.setRegister(mem_register);
                        ret.setType(Type.CHAR_POINTER);
                        return ret;
                }

                if (type == Type.BOOL) {
                        String id = ctx.id().getText();

                        Map<String, Variable> table = variables.getFirst();
                        String mem_register = this.generateNewRegister();

                        Variable v = new Variable(id, mem_register, Type.BOOL_POINTER);
                        table.put(id, v);

                        ST template = new ST(
                                "<length_code>" +
                                "<mem_reg> = call <type>* @createArrayInt(i32 <length_reg>)\n"
                        );

                        template.add("length_code", codeLength);
                        template.add("mem_reg", mem_register);
                        template.add("length_reg", codeLength.getRegister());
                        template.add("type", type.getCode());

                        CodeFragment ret = new CodeFragment();
                        ret.addCode(template.render());
                        ret.setRegister(mem_register);
                        ret.setType(Type.BOOL_POINTER);
                        return ret;
                }

                if (type == Type.FLOAT) {
                        String id = ctx.id().getText();

                        Map<String, Variable> table = variables.getFirst();
                        String mem_register = this.generateNewRegister();

                        Variable v = new Variable(id, mem_register, Type.FLOAT_POINTER);
                        table.put(id, v);

                        ST template = new ST(
                                "<length_code>" +
                                "<mem_reg> = call <type>* @createArrayFloat(i32 <length_reg>)\n"
                        );

                        template.add("length_code", codeLength);
                        template.add("mem_reg", mem_register);
                        template.add("length_reg", codeLength.getRegister());
                        template.add("type", type.getCode());

                        CodeFragment ret = new CodeFragment();
                        ret.addCode(template.render());
                        ret.setRegister(mem_register);
                        ret.setType(Type.FLOAT_POINTER);
                        return ret;
                }

                return null;
        }

        @Override
        public CodeFragment visitArraylist(scapyParser.ArraylistContext ctx){

                ArrayParamCodeFragment code = new ArrayParamCodeFragment();

                for (scapyParser.ExpressionContext e: ctx.expression()) {

                        CodeFragment expr_code = visit(e);
                        code.appendCodeFragment(expr_code);
                        code.addArg(expr_code.getRegister());
                }

                return code;
        }

        @Override
        public CodeFragment visitDeclare_simple_var(scapyParser.Declare_simple_varContext ctx){

                CodeFragment value = visit(ctx.expression());
                String id = ctx.id().getText();
                Type type = value.getType();

                if (ctx.type() != null) {
                        if (value.getType() != getType(ctx.type().getText())) {
                                throw new Exception("Error: Declaration types incompatible");
                        }
                }

                Map<String, Variable> table = variables.getFirst();
                String mem_register = this.generateNewRegister();
                String code_stub = "<mem_reg> = alloca <type>\n";
                table.put(id, new Variable(id, mem_register, type));

                if (type == Type.CHAR_POINTER || type == Type.INT_POINTER ||
                        type == Type.BOOL_POINTER ||type == Type.FLOAT_POINTER){

                        String r = this.generateNewRegister();

                        ST template = new ST(
                                "<value_code>" +
                                code_stub +
                                "store <type> <value_register>, <type>* <mem_reg>\n"+
                                "<r> = load <type>* <mem_reg>\n"
                        );

                        template.add("value_code", value);
                        template.add("value_register", value.getRegister());
                        template.add("mem_reg", mem_register);
                        template.add("type", type.getCode());
                        template.add("r", r);

                        Variable v = getVar(id);
                        v.setRegister(r);

                        CodeFragment ret = new CodeFragment();
                        ret.addCode(template.render());
                        ret.setRegister(r);
                        ret.setType(type);
                        return ret;
                }
                else{
                        ST template = new ST(
                                "<value_code>" +
                                code_stub +
                                "store <type> <value_register>, <type>* <mem_reg>\n"
                        );

                        template.add("value_code", value);
                        template.add("value_register", value.getRegister());
                        template.add("mem_reg", mem_register);
                        template.add("type", type.getCode());
                        CodeFragment ret = new CodeFragment();
                        ret.addCode(template.render());
                        ret.setRegister(value.getRegister());
                        ret.setType(type);
                        return ret;
                }

        }

        @Override
        public CodeFragment visitFor(scapyParser.ForContext ctx){

                addTable();

                CodeFragment start = visit(ctx.expression(0));
                CodeFragment end = visit(ctx.expression(1));

                String id = ctx.id().getText();
                Type type = start.getType();

                if (type != Type.INT) throw new Exception("For statement expression accept only Int type");

                Map<String, Variable> table = variables.getFirst();
                String mem_register = this.generateNewRegister();

                Variable v = new Variable(id, mem_register, type);
                table.put(id, v);

                CodeFragment body = visit(ctx.statement());

                ST template = new ST(
                        "br label %<init_l>\n" +
                        "<init_l>:\n" +
                        "<it> = alloca <type>\n" +
                        "store <type> <start>, <type>* <it>\n" +
                        "br label %<cmp_l>\n" +
                        "<cmp_l>:\n" +
                        "<r0> = load <type>* <it>\n" +
                        "<cmp> = icmp slt i32 <r0>, <end>\n" +
                        "br i1 <cmp>, label %<body_l>, label %<end_l>\n" +
                        "<body_l>:\n" +
                        "<body_c>" +
                        "<r1> = load <type>* <it>\n" +
                        "<r2> = add <type> <r1>, 1\n" +
                        "store <type> <r2>, <type>* <it>\n" +
                        "br label %<cmp_l>\n" +
                        "<end_l>:\n" +
                        "<ret> = add i32 0, 0\n"
                );

                template.add("init_l", generateNewLabel());
                template.add("cmp_l", generateNewLabel());
                template.add("body_l", generateNewLabel());
                template.add("end_l", generateNewLabel());
                template.add("it", v.getRegister());
                template.add("type", v.getType().getCode());
                template.add("cmp", generateNewRegister());
                template.add("r0", generateNewRegister());
                template.add("r1", generateNewRegister());
                template.add("r2", generateNewRegister());
                template.add("ret", generateNewRegister());
                template.add("start", start.getRegister());
                template.add("end", end.getRegister());
                template.add("body_c", body);

                CodeFragment ret = new CodeFragment();
                ret.appendCodeFragment(start);
                ret.appendCodeFragment(end);
                ret.addCode(template.render());
                ret.setRegister(end.getRegister());
                ret.setType(Type.INT);

                removeTable();
                return ret;
        }

        @Override
        public CodeFragment visitVarFloat(scapyParser.VarFloatContext ctx){

                String value = ctx.FLOAT().getText();
                CodeFragment code = new CodeFragment();
                String register = generateNewRegister();
                code.setRegister(register);
                code.setType(Type.FLOAT);
                code.addCode(String.format("%s = fadd %s 0.0, %s\n", register, Type.FLOAT.getCode(), value));
                return code;
        }

        @Override
        public CodeFragment	visitVarBool(scapyParser.VarBoolContext ctx){

                String value = ctx.BOOL().getText();
                String val = "";
                if (value.equals("false")){
                        val = "0";
                }
                if (value.equals("true")){
                        val = "1";
                }

                CodeFragment code = new CodeFragment();
                String register = generateNewRegister();
                code.setRegister(register);
                code.setType(Type.BOOL);
                code.addCode(String.format("%s = add %s 0, %s\n", register, Type.BOOL.getCode(), val));
                return code;
        }

        @Override
        public CodeFragment visitVarChar(scapyParser.VarCharContext ctx){

                String value = Integer.toString((int)ctx.CHAR().getText().charAt(1));

                CodeFragment code = new CodeFragment();
                String register = generateNewRegister();
                code.setRegister(register);
                code.setType(Type.CHAR);
                code.addCode(String.format("%s = add %s 0, %s\n", register, Type.CHAR.getCode(), value));
                return code;
        }

        @Override
        public CodeFragment visitVarString(scapyParser.VarStringContext ctx){
                String s = ctx.STRING().getText();
                s = s.substring(1, s.length()-1);
                String mem_reg = this.generateNewRegister();
                String declare = String.format("%s = call %s* @createArrayChar(i32 %s)\n",
                        mem_reg, Type.CHAR.getCode(), s.length());

                CodeFragment ret = new CodeFragment();
                ret.addCode(declare);

                for(int i=0; i<s.length(); i++){
                        String r = this.generateNewRegister();
                        String mem = String.format("%s = call %s* @getElementArrayChar(%s* %s, i32 %s )\n",
                                r, Type.CHAR.getCode(), Type.CHAR.getCode(), mem_reg, i);
                        ret.addCode(mem);

                        String r2 = this.generateNewRegister();
                        String ch = String.format("%s = add %s 0, %s\n", r2, Type.CHAR.getCode(), Integer.toString((int)s.charAt(i)));
                        ret.addCode(ch);

                        String store = String.format("store %s %s, %s* %s\n", Type.CHAR.getCode(), r2, Type.CHAR.getCode(), r);
                        ret.addCode(store);
                }

                ret.setRegister(mem_reg);
                ret.setType(Type.CHAR_POINTER);
                return ret;
        }

        @Override
        public CodeFragment visitStatements(scapyParser.StatementsContext ctx) {
                CodeFragment code = new CodeFragment();
                for(scapyParser.StatementContext s: ctx.statement()) {
                        CodeFragment statement = visit(s);
                        code.addCode(statement);
                        code.setRegister(statement.getRegister());
                        code.setType(statement.getType());
                }
                return code;
        }

        private Type getType(String name){
                Type res = null;
                if (name.equals("Int")) res = Type.INT;
                if (name.equals("Float")) res = Type.FLOAT;
                if (name.equals("Boolean")) res = Type.BOOL;
                if (name.equals("Char")) res = Type.CHAR;
                if (name.equals("Array[Int]")) res = Type.INT_POINTER;
                if (name.equals("Array[Char]")) res = Type.CHAR_POINTER;
                if (name.equals("Array[Float]")) res = Type.FLOAT_POINTER;
                if (name.equals("Array[Boolean]")) res = Type.BOOL_POINTER;

                return res;
        }

        @Override
        public CodeFragment visitDeclare_simple_const(scapyParser.Declare_simple_constContext ctx) {

                CodeFragment value = visit(ctx.expression());

                if (value.getType() == Type.INT_POINTER || value.getType() == Type.CHAR_POINTER ||
                        value.getType() == Type.FLOAT_POINTER || value.getType() == Type.BOOL_POINTER){

                        throw new Exception("Error: Array cannot be const");
                }

                String id = ctx.id().getText();
                Type type = value.getType();

                if (ctx.type() != null) {
                        if (value.getType() != getType(ctx.type().getText())) {
                                throw new Exception("Error: Declaration types incompatible");
                        }
                }

                Map<String, Variable> table = variables.getFirst();
                String mem_register = this.generateNewRegister();
                String code_stub = "<mem_register> = alloca <type>\n";

                Variable v = new Variable(id, mem_register, type);
                table.put(id, v);
                constVariable.add(v);

                ST template = new ST(
                        "<value_code>" +
                        code_stub +
                        "store <type> <value_register>, <type>* <mem_register>\n"
                );

                template.add("value_code", value);
                template.add("value_register", value.getRegister());
                template.add("mem_register", mem_register);
                template.add("type", type.getCode());

                CodeFragment ret = new CodeFragment();
                ret.addCode(template.render());
                ret.setRegister(value.getRegister());
                ret.setType(type);
                return ret;
        }

        private void addTable() {
                variables.addFirst(new HashMap<String, Variable>());
        }

        private void removeTable() {

                variables.removeFirst();
        }

        private Variable getVar(String id) {
                    Map<String, Variable> table = findVarTable(id);
                    if (table == null) {
                            throw new Exception(String.format("Error: identifier '%s' does not exists", id));
                    }

                    return table.get(id);
        }

        private Map<String, Variable> findVarTable(String id) {
            for (Map<String, Variable> table : variables) {
                if (table.containsKey(id)) return table;
            }
            return null;
        }

        @Override
        public CodeFragment visitVarVar(scapyParser.VarVarContext ctx) {

                String id = ctx.id().getText();
                CodeFragment code = new CodeFragment();

                String r = generateNewRegister();
                Variable v = getVar(id);
                String c = v.getType().getCode();

                if (v.getType() == Type.INT_POINTER || v.getType() == Type.CHAR_POINTER ||
                        v.getType() == Type.BOOL_POINTER || v.getType() == Type.FLOAT_POINTER) {

                        code.setRegister(v.getRegister());
                        code.setType(v.getType());
                        code.setVar(v.getName());

                        return code;
                }
                else{
                        code.addCode(String.format("%s = load %s* %s\n", r, c, v.getRegister()));
                        code.setRegister(r);
                        code.setVar(v.getName());
                        code.setType(v.getType());

                        return code;
                }
        }

        @Override
        public CodeFragment visitEmp(scapyParser.EmpContext ctx) {
                return new CodeFragment();
        }

        @Override
        public CodeFragment visitVarInt(scapyParser.VarIntContext ctx) {
                String value = ctx.INT().getText();
                CodeFragment code = new CodeFragment();
                String register = generateNewRegister();
                code.setRegister(register);
                code.setType(Type.INT);
                code.addCode(String.format("%s = add %s 0, %s\n", register, Type.INT.getCode(), value));
                return code;
        }

        private ArrayParamCodeFragment convertArrayParams(ArrayParamCodeFragment arrayParam) {

                ArrayParamCodeFragment code = new ArrayParamCodeFragment();
                code.appendCodeFragment(arrayParam);
                for (int i = 0; i<arrayParam.getArgs().size();i++) {

                        String v = arrayParam.getArgs().get(i);
                        code.setRegister(v);
                        code.setType(Type.INT);
                        code.addArg(v);
                }

                return code;
        }

        @Override
        public CodeFragment visitVarArray(scapyParser.VarArrayContext ctx){

                CodeFragment ret = new CodeFragment();
                ArrayParamCodeFragment code = convertArrayParams((ArrayParamCodeFragment)visit(ctx.array_list()));
                List<String> params = code.getArgs();

                String id = ctx.id().getText();
                Variable v = getVar(id);

                Type type = getVar(id).getType();

                if (type == Type.INT || type == Type.INT_POINTER) {

                        String r = this.generateNewRegister();

//                        System.out.println(params);

//                        StringBuilder c = new StringBuilder();
//                        for (int i=0; i < params.size(); i++){
//
//                        }

                        ST template = new ST(
                                "<index_code>" +
                                "<r1> = call i32* @getElementArrayInt(i32* <array_reg>, i32 <index_reg>)\n" +
                                "<r2> = load i32*<r1>\n"
                        );

                        template.add("index_code", code);
                        template.add("r1", this.generateNewRegister());
                        template.add("r2", r);
                        template.add("array_reg", v.getRegister());
                        template.add("index_reg", code.getRegister());

                        ret.addCode(template.render());
                        ret.setRegister(r);
                        ret.setType(Type.INT);
                }

                if (type == Type.CHAR || type == Type.CHAR_POINTER) {

                        String r = this.generateNewRegister();

                        ST template = new ST(
                                "<index_code>" +
                                "<r1> = call <type>* @getElementArrayChar(<type>* <array_reg>, i32 <index_reg>)\n" +
                                "<r2> = load <type>*<r1>\n"
                        );

                        template.add("index_code", code);
                        template.add("r1", this.generateNewRegister());
                        template.add("r2", r);
                        template.add("array_reg", v.getRegister());
                        template.add("index_reg", code.getRegister());
                        template.add("type", Type.CHAR.getCode());

                        ret.addCode(template.render());
                        ret.setRegister(r);
                        ret.setType(Type.CHAR);
                }

                if (type == Type.FLOAT || type == Type.FLOAT_POINTER) {

                        String r = this.generateNewRegister();

                        ST template = new ST(
                                "<index_code>" +
                                "<r1> = call <type>* @getElementArrayFloat(<type>* <array_reg>, i32 <index_reg>)\n" +
                                "<r2> = load <type>*<r1>\n"
                        );

                        template.add("index_code", code);
                        template.add("r1", this.generateNewRegister());
                        template.add("r2", r);
                        template.add("array_reg", v.getRegister());
                        template.add("index_reg", code.getRegister());
                        template.add("type", Type.FLOAT.getCode());

                        ret.addCode(template.render());
                        ret.setRegister(r);
                        ret.setType(Type.FLOAT);
                }

                if (type == Type.BOOL || type == Type.BOOL_POINTER) {

                        String r = this.generateNewRegister();

                        ST template = new ST(
                                "<index_code>" +
                                "<r1> = call <type>* @getElementArrayInt(<type>* <array_reg>, i32 <index_reg>)\n" +
                                "<r2> = load <type>*<r1>\n"
                        );

                        template.add("index_code", code);
                        template.add("r1", this.generateNewRegister());
                        template.add("r2", r);
                        template.add("array_reg", v.getRegister());
                        template.add("index_reg", code.getRegister());
                        template.add("type", Type.BOOL.getCode());

                        ret.addCode(template.render());
                        ret.setRegister(r);
                        ret.setType(Type.BOOL);
                }

                return ret;
        }

        private void declareFunc(String id, Function func){
                if (!functions.containsKey(id)) functions.put(id, func);
                else throw new Exception(String.format("Error: function/procedure '%s' was declared", id));
        }

        @Override
        public CodeFragment visitFunc_def(scapyParser.Func_defContext ctx) {
                CodeFragment code = new CodeFragment();

                String name = generateNewFunctionName();
                String id = ctx.id().getText();
                Type type = getType(ctx.type().getText());

                CodeFragment body = new CodeFragment();

                Function f = new Function(id, name, type, null, body);
                declareFunc(id, f);

                addTable();

                ArgListCodeFragment arglist = (ArgListCodeFragment) visit(ctx.arglist());
                f.setParams(arglist.getArgs());
                body.appendCodeFragment(arglist);
                body.appendCodeFragment(visit(ctx.func_statements()));

                removeTable();

                return code;
        }

        private CodeFragment generateAssignCode(Variable var, CodeFragment value) {

                CodeFragment code = new CodeFragment();

                if (var.getType() == Type.INT_POINTER || var.getType() == Type.CHAR_POINTER ||
                        var.getType() == Type.FLOAT_POINTER || var.getType() == Type.BOOL_POINTER ) {

                        String mem_register = var.getRegister();

                        ST template = new ST(
                                "<value_code>" +
                                "store <type> <value_register>, <type>* <mem_register>\n"+
                                "<r> = load <type>* <mem_register>\n"
                        );

                        String r = this.generateNewRegister();
                        template.add("value_code", value);
                        template.add("value_register", value.getRegister());
                        template.add("mem_register", mem_register);
                        template.add("type", value.getType().getCode());
                        template.add("r", r);

                        var.setRegister(r);

                        code.addCode(template.render());
                        code.setRegister(r);
                        if (var.getType() == Type.INT_POINTER) code.setType(Type.INT_POINTER);
                        if (var.getType() == Type.CHAR_POINTER) code.setType(Type.CHAR_POINTER);
                        if (var.getType() == Type.BOOL_POINTER) code.setType(Type.BOOL_POINTER);
                        if (var.getType() == Type.FLOAT_POINTER) code.setType(Type.FLOAT_POINTER);

                }
                else{
                        String mem_register = var.getRegister();

                        ST template = new ST(
                                "<value_code>" +
                                "store <type> <value_register>, <type>* <mem_register>\n"
                        );

                        template.add("value_code", value);
                        template.add("value_register", value.getRegister());
                        template.add("mem_register", mem_register);
                        template.add("type", value.getType().getCode());

                        code.addCode(template.render());
                        code.setRegister(value.getRegister());
                        code.setType(value.getType());


                }
                return code;
        }

        @Override
        public CodeFragment visitArglist(scapyParser.ArglistContext ctx){

                ArgListCodeFragment code = new ArgListCodeFragment();

                for (int i = 0; i<ctx.id().size(); i++) {

                        String id = ctx.id(i).getText();
                        Type type = getType(ctx.type(i).getText());
                        String argRegister = this.generateNewRegister();
                        String mem_register;

                        Map<String, Variable> table = variables.getFirst();
                        mem_register = this.generateNewRegister();
                        table.put(id, new Variable(id, mem_register, type));

                        ST template = new ST(
                                "<mem_register> = alloca <type>\n"
                        );

                        template.add("mem_register", mem_register);
                        template.add("type", type.getCode());

                        code.addCode(template.render());

                        CodeFragment val_code = new CodeFragment();
                        val_code.setRegister(argRegister);
                        val_code.setType(type);

                        Variable var = getVar(id);
                        CodeFragment assign = generateAssignCode(var, val_code);

                        code.appendCodeFragment(assign);
                        code.addArg(new Variable(id, argRegister, type));
                }

                return code;
        }

        @Override
        public CodeFragment visitF_Return(scapyParser.F_ReturnContext ctx){
                CodeFragment code;
                try {
                        code = visit(ctx.expression());
                        code.addCode(String.format("ret %s %s\n", code.getType().getCode(), code.getRegister()));
                } catch(NullPointerException e) {
                        code = new CodeFragment();
                        code.addCode("ret\n");
                }
                return code;
        }

        @Override
        public CodeFragment visitBReturn(scapyParser.BReturnContext ctx){
                CodeFragment code;
                try {
                        code = visit(ctx.expression());
                        code.addCode(String.format("ret %s %s\n", code.getType().getCode(), code.getRegister()));
                } catch(NullPointerException e) {
                        code = new CodeFragment();
                        code.addCode("ret\n");
                }
                return code;
        }

        private ArgListCodeFragment convertParamList(ArgListCodeFragment paramList) {

                ArgListCodeFragment code = new ArgListCodeFragment();
                code.appendCodeFragment(paramList);
                for (int i = 0; i<paramList.getArgs().size();i++) {

                        Variable v = paramList.getArgs().get(i);
                        code.setRegister(v.getRegister());
                        code.setType(v.getType());
                        code.addArg(new Variable(code.getVar(), code.getRegister(), code.getType()));
                }

                return code;
        }

        @Override
        public CodeFragment visitFunc_call(scapyParser.Func_callContext ctx){

                CodeFragment code = new CodeFragment();
                String id = ctx.id().getText();

                if (functions.containsKey(id)) {
                        Function f = functions.get(id);

                        ArgListCodeFragment params = convertParamList((ArgListCodeFragment)visit(ctx.paramlist()));
                        String register = generateNewRegister();

                        if (f.getType() != null){

                                ST template = new ST(
                                        "<args_code>" +
                                        "<reg> = call <type> <name>(<args>)\n"
                                );

                                template.add("args_code", params);
                                template.add("name", f.getName());
                                template.add("args", getParamsString(params.getArgs()));
                                template.add("reg", register);
                                template.add("type", f.getType().getCode());

                                code.addCode(template.render());
                                code.setRegister(register);
                                code.setType(f.getType());
                        }
                        else {
                                ST template = new ST(
                                        "<args_code>" +
                                        "<reg> = call i32 <name>(<args>)\n"
                                );

                                template.add("args_code", params);
                                template.add("name", f.getName());
                                template.add("args", getParamsString(params.getArgs()));
                                template.add("reg", register);

                                code.addCode(template.render());
                                code.setRegister(register);
                                code.setType(Type.INT);

                        }

                }
                else{
                        throw new Exception(String.format("Error: function/procedure '%s' does not exists", id));
                }

                return code;

        }

        @Override
        public CodeFragment visitParamlist(scapyParser.ParamlistContext ctx){

                ArgListCodeFragment code = new ArgListCodeFragment();

                for (scapyParser.ExpressionContext e: ctx.expression()) {

                        CodeFragment expr_code = visit(e);
                        code.appendCodeFragment(expr_code);
                        code.addArg(new Variable(expr_code.getVar(), expr_code.getRegister(), expr_code.getType()));
                }

                return code;
        }

        @Override
        public CodeFragment visitF_Base(scapyParser.F_BaseContext ctx){
                return visit(ctx.base_statement());
        }

        @Override
        public CodeFragment visitFunc_statements(scapyParser.Func_statementsContext ctx){
                CodeFragment code = new CodeFragment();

                for(scapyParser.Func_statementContext s: ctx.func_statement()) {
                        CodeFragment statement = visit(s);
                        code.addCode(statement);
                        code.setRegister(statement.getRegister());
                        code.setType(statement.getType());
                }
                return code;
        }

        @Override
        public CodeFragment visitBlock(scapyParser.BlockContext ctx) {

                addTable();
                CodeFragment statement = visit(ctx.statements());
                removeTable();

                return statement;
        }

        @Override
        public CodeFragment visitCompare(scapyParser.CompareContext ctx) {
            return generateBinaryOperatorCodeFragment(
                    visit(ctx.expression(0)),
                    visit(ctx.expression(1)),
                    ctx.op.getType()
            );
        }


        private String generateTemplate(String type){
                ST temp = new ST(
                        "<r1> = \\<instruction> <type> \\<left_val>, \\<right_val>\n" +
                        "\\<ret> = zext i1 <r1> to i32\n"
                );
                temp.add("r1", this.generateNewRegister());
                temp.add("type", type);

                return temp.render();
        }

        public CodeFragment generateBinaryOperatorCodeFragment(CodeFragment left, CodeFragment right, Integer operator) {

                if (left.getType() != right.getType()) {
                        throw new Exception("Error: incompatible types");
                }

                String code_stub = "<ret> = <instruction> <type> <left_val>, <right_val>\n";

                String instruction = "or";

                if (left.getType() == Type.INT || left.getType() == Type.CHAR || left.getType() == Type.BOOL) {
                        switch (operator) {
                                case scapyParser.ADD:
                                        instruction = "add";
                                        break;
                                case scapyParser.SUB:
                                        instruction = "sub";
                                        break;
                                case scapyParser.MUL:
                                        instruction = "mul";
                                        break;
                                case scapyParser.DIV:
                                        instruction = "sdiv";
                                        break;
                                case scapyParser.MOD:
                                        instruction = "srem";
                                        break;
                                case scapyParser.EXP:
                                        instruction = "@iexp";
                                        code_stub = "<ret> = call i32 <instruction>(i32 <left_val>, i32 <right_val>)\n";
                                        break;

                                case scapyParser.EQ:
                                        instruction = "icmp eq";
                                        code_stub = generateTemplate(Type.INT.getCode());
                                        break;
                                case scapyParser.NE:
                                        instruction = "icmp ne";
                                        code_stub = generateTemplate(Type.INT.getCode());
                                        break;
                                case scapyParser.LE:
                                        instruction = "icmp sle";
                                        code_stub = generateTemplate(Type.INT.getCode());
                                        break;
                                case scapyParser.GE:
                                        instruction = "icmp sge";
                                        code_stub = generateTemplate(Type.INT.getCode());
                                        break;
                                case scapyParser.GT:
                                        instruction = "icmp sgt";
                                        code_stub = generateTemplate(Type.INT.getCode());
                                        break;
                                case scapyParser.LT:
                                        instruction = "icmp slt";
                                        code_stub = generateTemplate(Type.INT.getCode());
                                        break;

                                case scapyParser.AND:
                                        instruction = "and";
                                case scapyParser.OR:
                                        ST temp = new ST(
                                                "<r1> = icmp ne i32 \\<left_val>, 0\n" +
                                                        "<r2> = icmp ne i32 \\<right_val>, 0\n" +
                                                        "<r3> = \\<instruction> i1 <r1>, <r2>\n" +
                                                        "\\<ret> = zext i1 <r3> to i32\n"
                                        );
                                        temp.add("r1", this.generateNewRegister());
                                        temp.add("r2", this.generateNewRegister());
                                        temp.add("r3", this.generateNewRegister());
                                        code_stub = temp.render();
                                        break;
                        }
                }

                if (left.getType() == Type.FLOAT){

                        switch (operator) {
                                case scapyParser.ADD:
                                        instruction = "fadd";
                                        break;
                                case scapyParser.SUB:
                                        instruction = "fsub";
                                        break;
                                case scapyParser.MUL:
                                        instruction = "fmul";
                                        break;
                                case scapyParser.DIV:
                                        instruction = "fdiv";
                                        break;
                                case scapyParser.MOD:
                                        instruction = "frem";
                                        break;
                                case scapyParser.EXP:
                                        instruction = "@fexp";
                                        code_stub = "<ret> = call double <instruction>(double <left_val>, double <right_val>)\n";
                                        break;
                                case scapyParser.EQ:
                                        instruction = "fcmp ueq";
                                        code_stub = generateTemplate(Type.FLOAT.getCode());
                                        break;
                                case scapyParser.NE:
                                        instruction = "fcmp une";
                                        code_stub = generateTemplate(Type.FLOAT.getCode());
                                        break;
                                case scapyParser.LE:
                                        instruction = "fcmp ule";
                                        code_stub = generateTemplate(Type.FLOAT.getCode());
                                        break;
                                case scapyParser.GE:
                                        instruction = "fcmp uge";
                                        code_stub = generateTemplate(Type.FLOAT.getCode());
                                        break;
                                case scapyParser.GT:
                                        instruction = "fcmp ugt";
                                        code_stub = generateTemplate(Type.FLOAT.getCode());
                                        break;
                                case scapyParser.LT:
                                        instruction = "fcmp ult";
                                        code_stub = generateTemplate(Type.FLOAT.getCode());
                                        break;

                                case scapyParser.AND:
                                        instruction = "and";
                                case scapyParser.OR:
                                        ST temp = new ST(
                                                "<r1> = fcmp une double \\<left_val>, 0.0\n" +
                                                        "<r2> = fcmp une double \\<right_val>, 0.0\n" +
                                                        "<r3> = \\<instruction> i1 <r1>, <r2>\n" +
                                                        "\\<ret> = uitofp i1 <r3> to double\n"
                                        );
                                        temp.add("r1", this.generateNewRegister());
                                        temp.add("r2", this.generateNewRegister());
                                        temp.add("r3", this.generateNewRegister());
                                        code_stub = temp.render();
                                        break;
                        }
                }

                ST template = new ST(
                        "<left_code>" +
                        "<right_code>" +
                        code_stub
                );
                template.add("left_code", left);
                template.add("right_code", right);
                template.add("instruction", instruction);
                template.add("left_val", left.getRegister());
                template.add("right_val", right.getRegister());
                template.add("type", left.getType().getCode());
                String ret_register = this.generateNewRegister();
                template.add("ret", ret_register);

                CodeFragment ret = new CodeFragment();
                ret.setRegister(ret_register);
                ret.addCode(template.render());
                ret.setType(left.getType());
                return ret;

        }

        public CodeFragment generateUnaryOperatorCodeFragment(CodeFragment code, Integer operator) {

                if (operator == scapyParser.ADD) {
                        return code;
                }
                String code_stub = "";
                if (code.getType() == Type.INT || code.getType() == Type.BOOL || code.getType() == Type.CHAR) {
                        switch (operator) {
                                case scapyParser.SUB:
                                        code_stub = "<ret> = sub i32 0, <input>\n";
                                        break;
                                case scapyParser.NOT:
                                        ST temp = new ST(
                                                "<r> = icmp eq i32 \\<input>, 0\n" +
                                                "\\<ret> = zext i1 <r> to i32\n"
                                        );
                                        temp.add("r", this.generateNewRegister());
                                        code_stub = temp.render();
                                        break;
                        }
                }
                if (code.getType() == Type.FLOAT) {
                        switch(operator) {
                                case scapyParser.SUB:
                                        code_stub = "<ret> = fsub double 0.0, <input>\n";
                                        break;
                                case scapyParser.NOT:
                                        ST temp = new ST(
                                                "<r> = fcmp ueq double \\<input>, 0.0\n" +
                                                "\\<ret> = uitofp i1 <r> to double\n"
                                        );
                                        temp.add("r", this.generateNewRegister());
                                        code_stub = temp.render();
                                        break;
                        }
                }

                ST template = new ST("<code>" + code_stub);
                String ret_register = this.generateNewRegister();
                template.add("code", code);
                template.add("ret", ret_register);
                template.add("input", code.getRegister());

                CodeFragment ret = new CodeFragment();
                ret.setRegister(ret_register);
                ret.addCode(template.render());
                ret.setType(code.getType());
                return ret;

        }

        @Override
        public CodeFragment visitAdd(scapyParser.AddContext ctx) {
                return generateBinaryOperatorCodeFragment(
                        visit(ctx.expression(0)),
                        visit(ctx.expression(1)),
                        ctx.op.getType()
                );
        }

        @Override
        public CodeFragment visitMul(scapyParser.MulContext ctx) {
                return generateBinaryOperatorCodeFragment(
                        visit(ctx.expression(0)),
                        visit(ctx.expression(1)),
                        ctx.op.getType()
                );
        }

        @Override
        public CodeFragment visitExp(scapyParser.ExpContext ctx) {
                return generateBinaryOperatorCodeFragment(
                        visit(ctx.expression(0)),
                        visit(ctx.expression(1)),
                        ctx.op.getType()
                );
        }

        @Override
        public CodeFragment visitPar(scapyParser.ParContext ctx) {
                return visit(ctx.expression());
        }

        @Override
        public CodeFragment visitUna(scapyParser.UnaContext ctx) {
                return generateUnaryOperatorCodeFragment(
                        visit(ctx.expression()),
                        ctx.op.getType()
                );
        }

        @Override
        public CodeFragment visitIf(scapyParser.IfContext ctx) {

                CodeFragment condition = visit(ctx.expression());
                CodeFragment ret = new CodeFragment();
                if (ctx.statement(1) != null) {
                    CodeFragment statement_true = visit(ctx.statement(0));
                    CodeFragment statement_false = visit(ctx.statement(1));

                    ST template = new ST(
                            "<condition_code>" +
                            "<cmp_reg> = icmp ne i32 <con_reg>, 0\n" +
                            "br i1 <cmp_reg>, label %<block_true>, label %<block_false>\n" +
                            "<block_true>:\n" +
                            "<statement_true_code>" +
                            "br label %<block_end>\n" +
                            "<block_false>:\n" +
                            "<statement_false_code>" +
                            "br label %<block_end>\n" +
                            "<block_end>:\n" +
                            "<ret> = add i32 0, 0\n"
                    );
                    template.add("condition_code", condition);
                    template.add("statement_true_code", statement_true);
                    template.add("statement_false_code", statement_false);
                    template.add("cmp_reg", this.generateNewRegister());
                    template.add("con_reg", condition.getRegister());
                    template.add("block_true", this.generateNewLabel());
                    template.add("block_false", this.generateNewLabel());
                    template.add("block_end", this.generateNewLabel());
                    String return_register = generateNewRegister();
                    template.add("ret", return_register);

                    ret.setRegister(return_register);
                    ret.addCode(template.render());
                }
                else{
                    CodeFragment statement_true = visit(ctx.statement(0));

                    ST template = new ST(
                            "<condition_code>" +
                            "<cmp_reg> = icmp ne i32 <con_reg>, 0\n" +
                            "br i1 <cmp_reg>, label %<block_true>, label %<block_end>\n" +
                            "<block_true>:\n" +
                            "<statement_true_code>" +
                            "br label %<block_end>\n" +
                            "br label %<block_end>\n" +
                            "<block_end>:\n" +
                            "<ret> = add i32 0, 0\n"
                    );
                    template.add("condition_code", condition);
                    template.add("statement_true_code", statement_true);
                    template.add("cmp_reg", this.generateNewRegister());
                    template.add("con_reg", condition.getRegister());
                    template.add("block_true", this.generateNewLabel());
                    template.add("block_end", this.generateNewLabel());
                    String return_register = generateNewRegister();
                    template.add("ret", return_register);

                    ret.setRegister(return_register);
                    ret.addCode(template.render());
                }

                return ret;
        }

        @Override
        public CodeFragment visitWhile(scapyParser.WhileContext ctx) {
                CodeFragment condition = visit(ctx.expression());
                CodeFragment body = visit(ctx.statement());

                ST template = new ST(
                        "br label %<cmp_label>\n" +
                        "<cmp_label>:\n" +
                        "<condition_code>" +
                        "<cmp_register> = icmp ne i32 <condition_register>, 0\n" +
                        "br i1 <cmp_register>, label %<body_label>, label %<end_label>\n" +
                        "<body_label>:\n" +
                        "<body_code>" +
                        "br label %<cmp_label>\n" +
                        "<end_label>:\n" +
                        "<ret> = add i32 0, 0\n"
                );
                template.add("cmp_label", generateNewLabel());
                template.add("condition_code", condition);
                template.add("cmp_register", generateNewRegister());
                template.add("condition_register", condition.getRegister());
                template.add("body_label", generateNewLabel());
                template.add("end_label", generateNewLabel());
                template.add("body_code", body);
                String end_register = generateNewRegister();
                template.add("ret", end_register);

                CodeFragment ret = new CodeFragment();
                ret.addCode(template.render());
                ret.setRegister(end_register);
                return ret;
        }

        @Override
        public CodeFragment visitNot(scapyParser.NotContext ctx) {
                return generateUnaryOperatorCodeFragment(
                        visit(ctx.expression()),
                        ctx.op.getType()
                );
        }

        @Override
        public CodeFragment visitAnd(scapyParser.AndContext ctx) {
                return generateBinaryOperatorCodeFragment(
                        visit(ctx.expression(0)),
                        visit(ctx.expression(1)),
                        ctx.op.getType()
                );
        }

        @Override
        public CodeFragment visitOr(scapyParser.OrContext ctx) {
                return generateBinaryOperatorCodeFragment(
                        visit(ctx.expression(0)),
                        visit(ctx.expression(1)),
                        ctx.op.getType()
                );
        }

}
