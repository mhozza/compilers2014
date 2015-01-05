
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import org.stringtemplate.v4.*;

public class CompilerVisitor extends OmnomnomBaseVisitor<CodeFragment> {

    private LinkedList<HashMap<String, Variable>> variables = new LinkedList<>();
    private HashMap<String, Function> functions = new HashMap<>();
    private LinkedList<Function> extern = new LinkedList<>();
    private int labelIndex = 0;
    private int registerIndex = 0;

    /* Generate */
    private String generateNewLabel() {
        return String.format("L%d", this.labelIndex++);
    }

    private String generateNewRegister() {
        return String.format("%%R%d", this.registerIndex++);
    }
    
    private String generateFunctions() {
        LinkedList<Variable> a = new LinkedList<>();
        a.add(new Variable("", Type.convert("i"), null));
        Function f = new Function("@read_i", Type.convert("i"), a);
        addFunction(f);
        extern.add(f);
        
        a = new LinkedList<>();
        a.add(new Variable("", Type.convert("i"), null));
        f = new Function("@print_i", Type.convert("i"), a);
        addFunction(f);
        extern.add(f);
        
        a = new LinkedList<>();
        a.add(new Variable("", Type.convert("f"), null));
        f = new Function("@print_f", Type.convert("i"), a);
        addFunction(f);
        extern.add(f);
        
        a = new LinkedList<>();
        a.add(new Variable("", Type.convert("b"), null));
        f = new Function("@print_b", Type.convert("i"), a);
        addFunction(f);
        extern.add(f);
        
        a = new LinkedList<>();
        a.add(new Variable("", new ArrayType(Type.convert("s")), null));
        f = new Function("@print_s", Type.convert("i"), a);
        addFunction(f);
        extern.add(f);
        
        a = new LinkedList<>();
        a.add(new Variable("", Type.convert("i"), null));
        a.add(new Variable("", Type.convert("i"), null));
        f = new Function("@iexp", Type.convert("i"), a);
        addFunction(f);
        extern.add(f);
        
        a = new LinkedList<>();
        a.add(new Variable("", Type.convert("f"), null));
        a.add(new Variable("", Type.convert("i"), null));
        f = new Function("@fexp", Type.convert("f"), a);
        addFunction(f);
        extern.add(f);
        
        String arrayFunctions = "";
        arrayFunctions += generateArrayFunctions(Type.convert("i"));
        arrayFunctions += generateArrayFunctions(Type.convert("f"));
        arrayFunctions += generateArrayFunctions(Type.convert("b"));
        arrayFunctions += generateArrayFunctions(Type.convert("s"));
        return arrayFunctions;
    }
    
    private String generateArrayFunctions(Type type) {
        String s = "declare void @append_<name> (i8*, <type>)\n";
        if (type.toString().equals("s")) s = "declare void @append_<name> (i8*, <type>*)\n";
        ST template = new ST(
            "declare i8* @createArray_<name> (i32)\n" +
            "declare i32 @size_<name> (i8*)\n" +
            "declare void @set_<name> (i8*, i32, <type>)\n" +
            "declare <type> @get_<name> (i8*, i32)\n" +
            "declare void @remove_<name> (i8*, i32)\n" +
            "declare void @deleteArray_<name> (i8*)\n" +
            s
        );
        template.add("name", type.toString());
        template.add("type", type.getCode());
        return template.render();
    }

    private CodeFragment generateVal(Type t, String value) {
        CodeFragment code = new CodeFragment();
        String register = generateNewRegister();
        
        String op = "add";
        if (t.getCode().equals("double")) {
            op = "fadd";
        }
        code.setType(t);
        code.setRegister(register);
        code.addCode(String.format("%s = %s %s %s, %s\n", register, op, code.getType().getCode(), code.getType().getDefaultValue(), value));
        return code;
    }
    
    private CodeFragment generateStringVal(String value) {
        CodeFragment code = new CodeFragment();
        code.appendCode(createArray(new ArrayType(Type.convert("s")), value.length()));
        
        for (int i = 0; i < value.length(); i++) {  
                ST template = new ST("call void @set_s(i8* <list>, i32 <index>, i8 <item>)\n");
                template.add("list", code.getRegister());
                template.add("index", i);
                template.add("item", Integer.toString((int)value.charAt(i)));
                code.addCode(template.render());
        }
        return code;
    }   
    
    private CodeFragment generateArrayVal(List<OmnomnomParser.ExpressionContext> expression) {
        CodeFragment code = new CodeFragment();
        ArrayType type = null;
        
        for (int i = 0; i < expression.size(); i++) {  
                CodeFragment e = visit(expression.get(i));
                if(i == 0) {
                    type = new ArrayType(e.getType());
                    code.appendCode(createArray(type, expression.size()));
                }
                else if (!Type.compare(e.getType(), type)) {
                    System.err.println("Error: Incompatible type for array declaration");
                    break;
                }
                
                ST template = new ST(
                        "<value_code>\n" +
                        "call void @set_<typename>(i8* <list>, i32 <index>, <itemtype> <item>)\n"
                );
                template.add("value_code", e);
                template.add("item", e.getRegister());
                template.add("index", i);
                template.add("itemtype", type.getSubType().getCode());
                template.add("typename", type.getSubType().toString());
                template.add("list", code.getRegister());
                code.addCode(template.render());
        }  
        return code; 
    }
    
    private CodeFragment createArray(Type type, int size) {
        String register = this.generateNewRegister();  
        ST template = new ST("<register> = call <type> @createArray_<typename>(i32 <size>)\n");
        template.add("register", register);
        template.add("type", type.getCode());
        template.add("typename", type.getSubType().toString());
        template.add("size", size);
        
        CodeFragment code = new CodeFragment();
        code.addCode(template.render());
        code.setRegister(register);   
        code.setType(type);
        return code;
    }
    
    private CodeFragment allocVar(String name, Type type) {
        CodeFragment code = new CodeFragment();
        String mem_register;
        Variable v = getVarLast(name, type);

        if (v != null) {
            mem_register = v.getRegister();
            System.err.println(String.format("Warning: variable '%s' is already declared", name));
            code.addCode("");
        } else {
            mem_register = this.generateNewRegister();
            ST template = new ST("<mem_register> = alloca <type>\n");
            template.add("type", type.getCode());
            template.add("mem_register", mem_register);
            code.addCode(template.render());

            addVar(new Variable(name, type, mem_register));
        }
        code.setRegister(mem_register);
        code.setType(type);
        return code;
    }
    
    private CodeFragment storeVar(String value, String mem, Type type) {
        CodeFragment code = new CodeFragment();
        ST template = new ST("store <type> <value_register>, <type>* <mem_register>\n");
        template.add("type", type.getCode());
        template.add("value_register", value);
        template.add("mem_register", mem);
        code.addCode(template.render());
        return code;
    }
    
    private CodeFragment loadVar(String mem, Type type) {
        CodeFragment code = new CodeFragment();
        String register = generateNewRegister();
         
        ST template = new ST("<register> = load <type>* <mem>\n");
        template.add("register", register);
        template.add("type", type.getCode());
        template.add("mem", mem);
        code.addCode(template.render());
        code.setRegister(register);
        code.setType(type);
         
        return code;
    }

    public void addFunction(Function f) {
        if (!functions.containsKey(f.getName())) {
            functions.put(f.getName(), f);
        } else {
            System.err.println(String.format("Error: %s is already defined", f.getName()));
        }
    }

    public Function getFunction(String name) {
        if (functions.containsKey(name)) {
            return functions.get(name);
        }
        //System.err.println(String.format("Error: function %s is not declared", name));
        return null;
    }

    public Variable getVar(String identifier, Type type) {
        for (int i = variables.size() - 1; i >= 0; i--) {
            if (variables.get(i).containsKey(identifier)) {
                Variable v = variables.get(i).get(identifier);
                if (type == null) {
                    return v;
                }
                if (Type.compare(v.getType(), type)) {
                    return v;
                } else {
                    System.err.println("Error: Variable " + identifier + " is " + v.getType() + ", not " + type);
                }
            }
        }
        return null;
    }

    public Variable getVarLast(String identifier, Type type) {
        if (variables.getLast().containsKey(identifier)) {
            Variable v = variables.getLast().get(identifier);
            if (type == null) {
                return v;
            }
            if (Type.compare(v.getType(), type)) {
                return v;
            } else {
                System.err.println("Error: Variable " + identifier + " is " + v.getType() + ", not " + type);
            }
        }
        return null;
    }

    public void addVar(Variable var) {
        if (!variables.getLast().containsKey(var.getName())) {
            variables.getLast().put(var.getName(), var);
        } else {
            System.err.println(String.format("Error: %s is already defined", var.getName()));
        }
    }
    
    public void removeVar(String identifier) {
        for (int i = variables.size() - 1; i >= 0; i--) {
            if (variables.get(i).containsKey(identifier)) {
                variables.get(i).remove(identifier);
                break;
            }
        }
    }

    /* Blocks */
    @Override
    public CodeFragment visitInit(OmnomnomParser.InitContext ctx) {
        variables.add(new HashMap<String, Variable>());

        CodeFragment fcode = new CodeFragment();
        String fun = generateFunctions();     
           
        for (OmnomnomParser.ExternContext e : ctx.extern()) {
            visit(e);
        }
        
        for (OmnomnomParser.FunctionContext f : ctx.function()) {
            fcode.appendCode(visit(f));
        }
        
        CodeFragment body = visit(ctx.block());
        
        String lib = "";
        for (Function e : extern) {
            ST tmp = new ST("declare <type> <name>(<args>)\n");
            tmp.add("name", e.getName());
            tmp.add("type", e.getType().getCode());
            tmp.add("args", typelistToString(e.getArgs()));
            lib += tmp.render();
        }
        
        ST template = new ST(
                lib 
                + fun
                + "<functions_code>"
                + "define i32 @main() {\n"
                + "start:\n"
                + "<body_code>"
                + "ret i32 0\n"
                + "}\n"
        );
        template.add("functions_code", fcode);
        template.add("body_code", body);

        CodeFragment code = new CodeFragment();
        code.addCode(template.render());
        code.setRegister(body.getRegister());
        variables.removeLast();
        return code;
    }

    @Override
    public CodeFragment visitStatement(OmnomnomParser.StatementContext ctx) {
        CodeFragment ret;
        if (ctx.inline_statement() == null) {
            ret = visit(ctx.block_statement());
        } else {
            ret = visit(ctx.inline_statement());
        }
        return ret;
    }

    @Override
    public CodeFragment visitBlock(OmnomnomParser.BlockContext ctx) {
        variables.addLast(new HashMap<String, Variable>());
        CodeFragment code = new CodeFragment();
        for (OmnomnomParser.StatementContext s : ctx.statement()) {
            code.appendCode(visit(s));
        }
        variables.removeLast();
        return code;
    }

    @Override
    public CodeFragment visitIf(OmnomnomParser.IfContext ctx) {
        variables.add(new HashMap<String, Variable>());
        LinkedList<CodeFragment> conditions = new LinkedList<>();
        for (OmnomnomParser.ExpressionContext e : ctx.expression()) {
            conditions.add(visit(e));
        }

        LinkedList<CodeFragment> bodies = new LinkedList<>();
        for (OmnomnomParser.BlockContext e : ctx.block()) {
            bodies.add(visit(e));
        }

        String block_end = generateNewLabel();
        ST temp = new ST("");

        for (int i = 0; i < conditions.size(); i++) {
            temp = new ST(
                    temp.render()
                    + "<condition_code>"
                    + "<cmp_reg> = icmp ne <type> <con_reg>, 0\n"
                    + "br i1 <cmp_reg>, label %<block_true>, label %<block_false>\n"
                    + "<block_true>:\n"
                    + "<statement_true_code>"
                    + "br label %<block_end>\n"
            );

            temp.add("condition_code", conditions.get(i));
            temp.add("type", conditions.get(i).getType().getCode());
            temp.add("cmp_reg", generateNewRegister());
            temp.add("con_reg", conditions.get(i).getRegister());
            temp.add("statement_true_code", bodies.get(i));

            temp.add("block_true", generateNewLabel());
            temp.add("block_end", block_end);

            if ((i + 1) == conditions.size()) { // nemame dalsi elif
                if ((i + 1) == bodies.size() - 1) { //mame else
                    String block_false = generateNewLabel();
                    temp.add("block_false", block_false);
                    temp = new ST(
                            temp.render()
                            + "<block_false>:\n"
                            + "<statement_false_code>"
                            + "br label %<block_end>\n"
                    );
                    temp.add("statement_false_code", bodies.get(i + 1));
                    temp.add("block_end", block_end);
                    temp.add("block_false", block_false);
                } else {
                    temp.add("block_false", block_end);    
                }   
            } else {
                String block_false = generateNewLabel();
                temp.add("block_false", block_false);
                temp = new ST( temp.render() + "<block_false>:\n");
                temp.add("block_false", block_false);      
            }
        }

        String return_register = generateNewRegister();

        temp = new ST(
                temp.render()
                + "<block_end>:\n"
                + "<ret> = add i32 0, 0\n"
        );
        temp.add("block_end", block_end);
        temp.add("ret", return_register);

        CodeFragment ret = new CodeFragment();
        ret.setRegister(return_register);
        ret.addCode(temp.render());
        variables.removeLast();
        return ret;
    }

    @Override
    public CodeFragment visitWhile(OmnomnomParser.WhileContext ctx) {
        variables.add(new HashMap<String, Variable>());
        CodeFragment condition = visit(ctx.expression());
        CodeFragment body = visit(ctx.block());

        ST template = new ST(
                "br label %<cmp_label>\n"
                + "<cmp_label>:\n"
                + "<condition_code>"
                + "<cmp_register> = icmp ne <type> <condition_register>, 0\n"
                + "br i1 <cmp_register>, label %<body_label>, label %<end_label>\n"
                + "<body_label>:\n"
                + "<body_code>"
                + "br label %<cmp_label>\n"
                + "<end_label>:\n"
                + "<ret> = add i32 0, 0\n"
        );
        template.add("cmp_label", generateNewLabel());
        template.add("condition_code", condition);
        template.add("cmp_register", generateNewRegister());
        template.add("condition_register", condition.getRegister());
        template.add("body_label", generateNewLabel());
        template.add("end_label", generateNewLabel());
        template.add("type", condition.getType().getCode());
        template.add("body_code", body);
        String end_register = generateNewRegister();
        template.add("ret", end_register);

        CodeFragment ret = new CodeFragment();
        ret.addCode(template.render());
        ret.setRegister(end_register);
        variables.removeLast();
        return ret;
    }

    @Override
    public CodeFragment visitFor(OmnomnomParser.ForContext ctx) {
        variables.add(new HashMap<String, Variable>());
        CodeFragment initialization = visit(ctx.initialization());
        CodeFragment condition = visit(ctx.expression());
        CodeFragment assignment = visit(ctx.assignment());
        CodeFragment body = visit(ctx.block());

        ST template = new ST(
                "br label %<init_label>\n"
                + "<init_label>:\n"
                + "<init_code>"
                + "br label %<cmp_label>\n"
                + "<cmp_label>:\n"
                + "<condition_code>"
                + "<cmp_register> = icmp ne <type> <condition_register>, 0\n"
                + "br i1 <cmp_register>, label %<body_label>, label %<end_label>\n"
                + "<body_label>:\n"
                + "<body_code>"
                + "<assignment_code>"
                + "br label %<cmp_label>\n"
                + "<end_label>:\n"
                + "<ret> = add i32 0, 0\n"
        );
        template.add("init_label", generateNewLabel());
        template.add("init_code", initialization);
        template.add("cmp_label", generateNewLabel());
        template.add("condition_code", condition);
        template.add("type", condition.getType().getCode());
        template.add("cmp_register", generateNewRegister());
        template.add("condition_register", condition.getRegister());
        template.add("body_label", generateNewLabel());
        template.add("end_label", generateNewLabel());
        template.add("body_code", body);
        template.add("assignment_code", assignment);
        String end_register = generateNewRegister();
        template.add("ret", end_register);

        CodeFragment ret = new CodeFragment();
        ret.addCode(template.render());
        ret.setRegister(end_register);
        variables.removeLast();
        return ret;
    }

    /* Functions */
    @Override
    public CodeFragment visitExtern(OmnomnomParser.ExternContext ctx) {
        String name = "@" + ctx.var().id().getText();
        Type type = visit(ctx.var().type()).getType();
        CodeFragment list = visit(ctx.typelist());
        Function f = new Function(name, type, list.getVar());
        addFunction(f);
        extern.add(f);
        return new CodeFragment();
    }

    @Override
    public CodeFragment visitFunction(OmnomnomParser.FunctionContext ctx) {
        variables.addLast(new HashMap<String, Variable>());
        CodeFragment code = new CodeFragment();

        String name = "@" + ctx.var().id().getText();
        Type type = visit(ctx.var().type()).getType();
        
        CodeFragment args = new CodeFragment();
        CodeFragment args_code = new CodeFragment();
        if (ctx.arglist() != null) {
            args = visit(ctx.arglist());
            for (Variable v : args.getVar()) {
                CodeFragment tmp = allocVar(v.getName(), v.getType());
                tmp.addCode(storeVar(v.getRegister(), tmp.getRegister(), v.getType()));
                args_code.addCode(tmp);
            }
        }
        addFunction(new Function(name, type, args.getVar()));
        CodeFragment body = (visit(ctx.fblock()));

        ST template = new ST(
                "define <type> <name>(<args>) {\n"
                + "start:\n"
                + "<args_code>"
                + "<body>"
                + "}\n"
        );
        template.add("name", name);
        template.add("type", type.getCode());
        template.add("args", listToString(args.getVar()));
        template.add("args_code", args_code);
        template.add("body", body);

        code.addCode(template.render());
        code.setType(body.getType());
        code.setRegister(body.getRegister());
        variables.removeLast();
        return code;
    }

    @Override
    public CodeFragment visitFCall(OmnomnomParser.FCallContext ctx) {
        String name = "@" + ctx.id().getText();
        Function f = getFunction(name);
        
        CodeFragment params = new CodeFragment();
        if (ctx.paramlist() != null) {
            params = getParams(visit(ctx.paramlist()), f);
        }
        
        String register = generateNewRegister();

        ST template = new ST(
                "<params_code>"
                + "<reg> = call <type> <name>(<params>)\n"
        );
        template.add("name", f.getName());
        template.add("type", f.getType().getCode());
        template.add("params", listToString(params.getVar()));
        template.add("params_code", params);
        template.add("reg", register);

        CodeFragment code = new CodeFragment();
        code.addCode(template.render());
        code.setRegister(register);
        code.setType(f.getType());
        return code;
    }

    private CodeFragment getParams(CodeFragment paramList, Function f) {
        CodeFragment code = new CodeFragment();
        if (paramList.getVar().size() != f.getArgs().size()) {
            System.err.println(String.format("Error: Wrong number of args in %s ", f.getName()));
            return code;
        }
        for (int i = 0; i < paramList.getVar().size(); i++) {
            Variable v = paramList.getVar().get(i);
            Type t = f.getArgs().get(i).getType();
            if (!Type.compare(t, v.getType())) {
                System.err.println(String.format("Error: Wrong types of args in %s ", f.getName()));
                return new CodeFragment();
            }
            code.addVar(v);
        }
        code.appendCode(paramList);
        return code;
    }

    private String listToString(LinkedList<Variable> params) {
        if (!params.isEmpty()) {
            Variable v = params.get(0);
            String s = v.getType().getCode() + " " + v.getRegister();
            for (int i = 1; i < params.size(); i++) {
                v = params.get(i);
                s += ", " + v.getType().getCode() + " " + v.getRegister();
            }
            return s;
        }
        return "";
    }
    
    private String typelistToString(LinkedList<Variable> params) {
        Variable v = params.get(0);
        String s = v.getType().getCode();
        for (int i = 1; i < params.size(); i++) {
            v = params.get(i);
            s += ", " + v.getType().getCode();
        }
        return s;
    }

    @Override
    public CodeFragment visitTypelist(OmnomnomParser.TypelistContext ctx) {
        CodeFragment code = new CodeFragment();
        for (int i = 0; i < ctx.type().size(); i++) {
            code.addVar(new Variable("", visit(ctx.type(i)).getType(), ""));
        }
        return code;
    }

    @Override
    public CodeFragment visitParamlist(OmnomnomParser.ParamlistContext ctx) {
        CodeFragment code = new CodeFragment();
        for (int i = 0; i < ctx.expression().size(); i++) {
            CodeFragment exp = visit(ctx.expression(i));
            code.addVar(new Variable("", exp.getType(), exp.getRegister()));
            code.appendCode(exp);
        }
        return code;
    }

    @Override
    public CodeFragment visitArglist(OmnomnomParser.ArglistContext ctx) {
        CodeFragment code = new CodeFragment();
        for (int i = 0; i < ctx.var().size(); i++) {
            String name = ctx.var(i).id().getText();
            Type type = visit(ctx.var(i).type()).getType();
            String mem_register = this.generateNewRegister();
            Variable v = new Variable(name, type, mem_register);
            code.addVar(v);
            //addVar(v);
            code.setRegister(mem_register);
        }
        return code;
    }

    @Override
    public CodeFragment visitRet(OmnomnomParser.RetContext ctx) {
        CodeFragment code = visit(ctx.expression());
        if (code != null) {
            code.addCode(String.format("ret %s %s \n", code.getType().getCode(), code.getRegister()));
        } else {
            code = new CodeFragment();
            code.addCode("ret void\n");
        }
        return code;
    }

    @Override
    public CodeFragment visitRead(OmnomnomParser.ReadContext ctx) {
        CodeFragment code = new CodeFragment();
        Variable v = getVar(ctx.id().getText(), Type.convert("i"));
        if (v == null) {
            System.err.println(String.format("Error: idenifier '%s' does not exists", ctx.id().getText()));
        } else {
            String register = generateNewRegister();
            CodeFragment load = loadVar(v.getRegister(), v.getType());     
            code.addCode(load);
            ST template = new ST(
                "<register> = call <type> @read_<function>(<type> <value>)\n"
            );
            template.add("function", v.getType().toString());
            template.add("type", v.getType().getCode());
            template.add("value", load.getRegister());
            template.add("register", register);
            code.addCode(template.render());
            code.addCode(storeVar(register, v.getRegister(), v.getType())); 
        }
        return code;
    }

    @Override
    public CodeFragment visitWrite(OmnomnomParser.WriteContext ctx) {
        CodeFragment code = visit(ctx.expression());
        ST template = new ST(
                "<value_code>"
                + "call i32 @print_<function>(<type> <value>)\n"
        );
        template.add("value_code", code);
        template.add("function", code.getType().getSubType().toString());
        template.add("type", code.getType().getCode());
        template.add("value", code.getRegister());

        CodeFragment ret = new CodeFragment();
        ret.addCode(template.render());
        return ret;
    }

    /* Vars */
    @Override
    public CodeFragment visitVarDef(OmnomnomParser.VarDefContext ctx) {
        CodeFragment code = new CodeFragment();
        String name = ctx.var().id().getText();
        Type type = visit(ctx.var().type()).getType();

        CodeFragment mem = allocVar(name, type);
        code.addCode(mem);
   
        if (ctx.expression() != null) {
            code.appendCode(visit(ctx.expression()));
            code.appendCode(storeVar(code.getRegister(), mem.getRegister(), type)); 
        } else if (type instanceof ArrayType) {
            code.appendCode(createArray(type, 0));
            code.appendCode(storeVar(code.getRegister(), mem.getRegister(), type)); 
        }
        
        code.setType(type);
        return code;
    }

    @Override
    public CodeFragment visitSimpleAssign(OmnomnomParser.SimpleAssignContext ctx) {
        CodeFragment code = new CodeFragment();
        CodeFragment value = visit(ctx.expression());
        String mem_register;

        Variable v = getVar(ctx.id().getText(), value.getType());
        if (v == null) {
            System.err.println(String.format("Error: idenifier '%s' does not exists", ctx.id().getText()));
        } else {
            mem_register = v.getRegister();
            if (Type.compare(value.getType(), v.getType())) {
                code.addCode(value);
                if (v.getType().toString().equals("s")) {
                    CodeFragment load = loadVar(mem_register, v.getType());        
                    code.addCode("call void @deleteArray_s(i8* " + load.getRegister() + ")\n");           
                } 
                code.addCode(storeVar(value.getRegister(), mem_register, value.getType())); 
            } else {
                System.err.println("Error: incompatible types");
            }
        }
        code.setType(value.getType());
        code.setRegister(value.getRegister());
        return code;
    }

    @Override
    public CodeFragment visitInc(OmnomnomParser.IncContext ctx) {
        CodeFragment code = new CodeFragment();
        String variables_register = "";
        String instruction = "add";
        Type type = Type.convert("i");

        if (ctx.op.getType() == OmnomnomParser.DEC) {
            instruction = "sub";
        }

        Variable v = getVar(ctx.id().getText(), null);
        if (v != null) {
            if (Type.compare(type, v.getType())) {
                variables_register = v.getRegister();
                ST template = new ST(
                        "<r1> = load i32* <variables_register>\n"
                        + "<r2> = <instruction> i32 <r1>, 1\n"
                        + "store i32 <r2>, i32* <variables_register>\n"
                );
                template.add("variables_register", variables_register);
                template.add("r1", generateNewRegister());
                template.add("r2", generateNewRegister());
                template.add("instruction", instruction);
                code.addCode(template.render());

            } else {
                System.err.println("Variable " + v.getName() + " must be integer for increment/decrement operations");
            }
        }
        code.setRegister(variables_register);
        code.setType(type);
        return code;
    }
    
     /* Ops */
    @Override
    public CodeFragment visitUna(OmnomnomParser.UnaContext ctx) {
        return generateUnaryOperatorCodeFragment(
                visit(ctx.expression()),
                ctx.op.getType()
        );
    }

    @Override
    public CodeFragment visitBin(OmnomnomParser.BinContext ctx) {
        return generateBinaryOperatorCodeFragment(
                visit(ctx.expression(0)),
                visit(ctx.expression(1)),
                ctx.op.getType()
        );
    }

    @Override
    public CodeFragment visitExpon(OmnomnomParser.ExponContext ctx) {
        return generateBinaryOperatorCodeFragment(
                visit(ctx.expression(0)),
                visit(ctx.expression(1)),
                ctx.op.getType()
        );
    }

    @Override
    public CodeFragment visitLength(OmnomnomParser.LengthContext ctx) {
        CodeFragment code = new CodeFragment();
        String name = ctx.id().getText();  
        String register = generateNewRegister();
        Variable v = getVar(name, null);

        if (v != null && v.getType() instanceof ArrayType) {
            code.appendCode(loadVar(v.getRegister(),v.getType()));
            ST template = new ST("<ret> = call i32 @size_<typename>(<type> <reg>)\n");
            template.add("type", v.getType().getCode());
            template.add("typename", v.getType().getSubType().toString());
            template.add("reg", code.getRegister());
            template.add("ret", register);
            code.addCode(template.render());             
        } else {
            System.err.println("Error: Wrong function call - size");
        }
        code.setRegister(register);
        code.setType(Type.convert("i"));
        return code;
    }
    
    @Override
    public CodeFragment visitGet(OmnomnomParser.GetContext ctx) {
        CodeFragment code = new CodeFragment();
        String name = ctx.id().getText();   
        CodeFragment index = visit(ctx.expression());
        String register = generateNewRegister();
        
        Variable v = getVar(name, null);
        
        if (v != null && v.getType() instanceof ArrayType && Type.compare(index.getType(), Type.convert("i"))) {
            code.addCode(index);
            code.appendCode(loadVar(v.getRegister(),v.getType()));
            ST template = new ST(
                    "<ret> = call <itype> @get_<typename>(<type> <reg>, i32 <index>)\n"
                );
                template.add("index", index.getRegister());
                template.add("type", v.getType().getCode());
                template.add("itype", v.getType().getSubType().getCode());
                template.add("typename", v.getType().getSubType().toString());
                template.add("reg", code.getRegister());
                template.add("ret", register);
                code.addCode(template.render());
                code.setType(v.getType().getSubType());
        } else {
            System.err.println("Error: Wrong function call - get");
        }
        code.setRegister(register);
        return code;
    }
    
    @Override
    public CodeFragment visitSet(OmnomnomParser.SetContext ctx) {
        CodeFragment code = new CodeFragment();
        String name = ctx.id().getText();  
        CodeFragment index = visit(ctx.expression(0));
        CodeFragment item = visit(ctx.expression(1));
           
        Variable v = getVar(name, null);
        
        if (v != null && v.getType() instanceof ArrayType 
                && Type.compare(index.getType(), Type.convert("i"))
                && Type.compare(item.getType(), v.getType())) {
            
            code.addCode(index);
            code.addCode(item);
            code.appendCode(loadVar(v.getRegister(),v.getType()));
            ST template = new ST(
                    "call void @set_<typename>(<type> <reg>, i32 <index>, <itype> <item>)\n"
                );
                template.add("index", index.getRegister());
                template.add("item", item.getRegister());
                template.add("type", v.getType().getCode());
                template.add("itype", item.getType().getCode());
                template.add("typename", v.getType().getSubType().toString());
                template.add("reg", code.getRegister());
                code.addCode(template.render());
                code.setType(v.getType().getSubType());
        } else {
            System.err.println("Error: Wrong function call - get");
        }
        return code;       
    }

    @Override
    public CodeFragment visitAppend(OmnomnomParser.AppendContext ctx) {
        CodeFragment code = new CodeFragment();
        String name = ctx.id().getText();  
        CodeFragment item = visit(ctx.expression());
           
        Variable v = getVar(name, null);       
        if (v != null && v.getType() instanceof ArrayType 
                && Type.compare(item.getType(), v.getType())) {
            code.addCode(item);
            code.appendCode(loadVar(v.getRegister(),v.getType()));
            ST template = new ST(
                    "call void @append_<typename>(<type> <reg>, <itype> <item>)\n"
                );
                template.add("item", item.getRegister());
                template.add("type", v.getType().getCode());
                template.add("itype", item.getType().getCode());
                template.add("typename", v.getType().getSubType().toString());
                template.add("reg", code.getRegister());
                code.addCode(template.render());
        } else {
            System.err.println("Error: Wrong function call - get");
        }
        return code;       
    }
    
    @Override
    public CodeFragment visitRemove(OmnomnomParser.RemoveContext ctx) {
        CodeFragment code = new CodeFragment();
        String name = ctx.id().getText();   
        CodeFragment index = visit(ctx.expression());
        
        Variable v = getVar(name, null);
        if (v != null && v.getType() instanceof ArrayType && Type.compare(index.getType(), Type.convert("i"))) {
            code.addCode(index);
            code.appendCode(loadVar(v.getRegister(),v.getType()));
            ST template = new ST(
                    "call void @remove_<typename>(<type> <reg>, i32 <index>)\n"
                );
                template.add("index", index.getRegister());
                template.add("type", v.getType().getCode());
                template.add("typename", v.getType().getSubType().toString());
                template.add("reg", code.getRegister());
                code.addCode(template.render());
        } else {
            System.err.println("Error: Wrong function call - get");
        }
        return code;
    }
    
    @Override
    public CodeFragment visitDelete(OmnomnomParser.DeleteContext ctx) {
        CodeFragment code = new CodeFragment();
        String name = ctx.id().getText();   
        
        Variable v = getVar(name, null);
        if (v != null && v.getType() instanceof ArrayType) {
            code.appendCode(loadVar(v.getRegister(),v.getType()));
            ST template = new ST(
                    "call void @deleteArray_<typename>(<type> <reg>)\n"
                );
                template.add("type", v.getType().getCode());
                template.add("typename", v.getType().getSubType().toString());
                template.add("reg", code.getRegister());
                code.addCode(template.render());
                removeVar(name);               
        } else {
            System.err.println("Error: Wrong function call - delete");
        }
        return code;
    }

    /*
     @Override
     public CodeFragment visitGetTuple(OmnomnomParser.GetTupleContext ctx) {

     }
     */

    /* Types */
    @Override
    public CodeFragment visitTypeBasic(OmnomnomParser.TypeBasicContext ctx) {
        CodeFragment code = new CodeFragment();
        if (ctx.getText().equals("s")) {
            code.setType(new ArrayType(Type.convert(ctx.getText())));
        }
        else {
            code.setType(Type.convert(ctx.getText()));
        }
        
        return code;
    } 
    
    @Override     
    public CodeFragment visitTypeArray(OmnomnomParser.TypeArrayContext ctx) {
        CodeFragment code = new CodeFragment();
        code.setType(new ArrayType((visit(ctx.type())).getType()));
        return code;
    }
     
    /*
     @Override
     public CodeFragment visitTypeTuple(OmnomnomParser.TypeTupleContext ctx) {
       
     }
     */

    /* Vals */
    @Override
    public CodeFragment visitValId(OmnomnomParser.ValIdContext ctx) {
        CodeFragment code = new CodeFragment();

        String name = ctx.getText();
        String register = generateNewRegister();
        Variable v = getVar(name, null);
        
        if (v != null) {
            String pointer = v.getRegister();
            Type type = v.getType();
            code.addCode(String.format("%s = load %s* %s\n", register, type.getCode(), pointer));
            code.setType(type);
        } else {
            System.err.println("Variable " + name + " does not exists");
        }
        code.setRegister(register);
        return code;
    }

    @Override
    public CodeFragment visitValInt(OmnomnomParser.ValIntContext ctx) {
        return generateVal(Type.convert("i"), ctx.INT().getText());
    }

    @Override
    public CodeFragment visitValFloat(OmnomnomParser.ValFloatContext ctx) {
        return generateVal(Type.convert("f"), "0x" + Long.toHexString(Double.doubleToRawLongBits(Double.parseDouble(ctx.FLOAT().getText()))));
    }
    
    @Override
    public CodeFragment visitValBool(OmnomnomParser.ValBoolContext ctx) {
        String value = "0";
        if (ctx.BOOL().getText().equals("true")) {
            value = "1";
        }
        return generateVal(Type.convert("b"), value);
    }  
    
    @Override
    public CodeFragment visitValString(OmnomnomParser.ValStringContext ctx) {
        String s = ctx.STRING().getText();
        return generateStringVal(s.substring(1,s.length() - 1));
    }
    
    @Override
    public CodeFragment visitValArray(OmnomnomParser.ValArrayContext ctx) {
        return generateArrayVal(ctx.expression());
    }
    
    /*@Override
    public CodeFragment visitValTuple(OmnomnomParser.ValTupleContext ctx) {
    }*/

    @Override
    public CodeFragment visitPar(OmnomnomParser.ParContext ctx) {
        return visit(ctx.expression());
    }

    @Override
    public CodeFragment visitEmp(OmnomnomParser.EmpContext ctx) {
        return new CodeFragment();
    }

    public CodeFragment generateBinaryOperatorCodeFragment(CodeFragment left, CodeFragment right, Integer operator) {
        if (!Type.compare(left.getType(), right.getType())) {
            System.err.println("Error: incompatible types");
            return new CodeFragment();
        }

        String code_stub = "<ret> = <instruction> <type> <left_val>, <right_val>\n";
        String[] instructions = left.getType().getOperations();
        String instruction = "or";
        boolean isBoolean = false;

        switch (operator) {
            case OmnomnomParser.ADD:
                instruction = instructions[0];
                break;
            case OmnomnomParser.SUB:
                instruction = instructions[1];
                break;
            case OmnomnomParser.MUL:
                instruction = instructions[2];
                break;
            case OmnomnomParser.DIV:
                instruction = instructions[3];
                break;
            case OmnomnomParser.REM:
                instruction = instructions[4];
                break;
            case OmnomnomParser.EXP:
                instruction = instructions[5];
                code_stub = "<ret> = call <type> <instruction>(<type> <left_val>, <type> <right_val>)\n";
                break;
            case OmnomnomParser.AND:
                instruction = "and";
                ST temp = new ST(
                        "<r1> = <i1> \\<type> \\<left_val>, 1\n"
                        + "<r2> = <i1> \\<type> \\<right_val>, 1\n"
                        + "\\<ret> = \\<instruction> i1 <r1>, <r2>\n"
                );
                temp.add("r1", this.generateNewRegister());
                temp.add("r2", this.generateNewRegister());
                temp.add("i1", instructions[6]);
                code_stub = temp.render();
                isBoolean = true;
                break;
            case OmnomnomParser.OR:
                instruction = "or";
                ST tmp = new ST(
                        "<r1> = <i1> \\<type> \\<left_val>, 0\n"
                        + "<r2> = <i1> \\<type> \\<right_val>, 0\n"
                        + "\\<ret> = \\<instruction> i1 <r1>, <r2>\n"
                );
                tmp.add("r1", this.generateNewRegister());
                tmp.add("r2", this.generateNewRegister());
                tmp.add("i1", instructions[7]);
                code_stub = tmp.render();
                isBoolean = true;
                break;
            case OmnomnomParser.EQ:
                instruction = instructions[6];
                isBoolean = true;
                break;
            case OmnomnomParser.NE:
                instruction = instructions[7];
                isBoolean = true;
                break;
            case OmnomnomParser.LE:
                instruction = instructions[8];
                isBoolean = true;
                break;
            case OmnomnomParser.GE:
                instruction = instructions[9];
                isBoolean = true;
                break;
            case OmnomnomParser.GT:
                instruction = instructions[10];
                isBoolean = true;
                break;
            case OmnomnomParser.LT:
                instruction = instructions[11];
                isBoolean = true;
                break;
        }
        ST template = new ST(
                "<left_code>"
                + "<right_code>"
                + code_stub
        );
        template.add("left_code", left);
        template.add("right_code", right);
        template.add("type", left.getType().getCode());
        template.add("instruction", instruction);
        template.add("left_val", left.getRegister());
        template.add("right_val", right.getRegister());
        String ret_register = this.generateNewRegister();
        template.add("ret", ret_register);

        CodeFragment ret = new CodeFragment();
        ret.setRegister(ret_register);
        ret.addCode(template.render());
        if (isBoolean) ret.setType(Type.convert("b"));
        else ret.setType(left.getType());
        return ret;
    }
     
    public CodeFragment generateUnaryOperatorCodeFragment(CodeFragment code, Integer operator) {
        if (operator == OmnomnomParser.ADD) {
            return code;
        }
        String[] instructions = code.getType().getOperations();
        Type type = code.getType();
        String code_stub = "";
        switch (operator) {
            case OmnomnomParser.SUB:
                code_stub = "<ret> = sub <type> 0, <input>\n";
                break;
            case OmnomnomParser.NOT:
                String r = generateNewRegister();
                code_stub = "<ret> = " + instructions[6] + " <type> <input>, 0\n";
                type = Type.convert("b");
                break;
        }
        ST template = new ST("<code>" + code_stub);
        String ret_register = this.generateNewRegister();
        template.add("code", code);
        template.add("type", type.getCode());
        template.add("ret", ret_register);
        template.add("input", code.getRegister());

        CodeFragment ret = new CodeFragment();
        ret.setRegister(ret_register);
        ret.addCode(template.render());
        ret.setType(type);
        return ret;

    }
}
