import java.util.HashMap;
import java.util.Map;
import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;
import org.stringtemplate.v4.*;

public class CompilerVisitor extends siiiBaseVisitor<CodeFragment> {
    private LinkedList< HashMap<String, Variable>> variables = new LinkedList<>();
    private HashMap<String, Function> functions = new HashMap<>();
    private HashMap<String, Function> ex_functions = new HashMap<>();
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
    public CodeFragment visitParen(siiiParser.ParenContext ctx) { 
        return visit(ctx.expression()); 
    }

    @Override
    public CodeFragment visitRet(siiiParser.RetContext ctx) {
        CodeFragment code = new CodeFragment();
        if (ctx.expression() != null) 
        {
            code = visit(ctx.expression());
            code.addCode(String.format("ret %s %s\n", code.getType(), code.getRegister()));
        } else {
            code.addCode(String.format("ret i32 0\n"));
        }
        return code;
    }

    @Override 
    public CodeFragment visitArglist(siiiParser.ArglistContext ctx) { 
        ArgsCodeFragment code = new ArgsCodeFragment();
        for (int i = 0; i< ctx.ID().size(); i++) {
            String id = ctx.ID(i).getText();
            String type = visit(ctx.type(i)).getType();
            String subtype = visit(ctx.type(i)).getSubType();
            String argRegister = generateNewRegister();

            CodeFragment arg_code = new CodeFragment();

            Map<String, Variable> table = variables.getLast();
            if (!table.containsKey(id)) {
                String mem_register = generateNewRegister();
                Variable v = new Variable(mem_register, type, subtype);
                table.put(id, v);
                ST template = new ST("<mem_register> = alloca "+ type +"\n");
                template.add("mem_register", mem_register);
                arg_code.addCode(template.render());
                arg_code.setRegister(mem_register);
                arg_code.setType(type);
                arg_code.setSubType(subtype);
            } else {
                System.err.println(String.format("Error: idenifier '%s' already exists", id));
                System.exit(0);
            }
            code.appendCodeFragment(arg_code);
            CodeFragment val_code = new CodeFragment();
            val_code.setRegister(argRegister);
            Variable var = new Variable();
            int j = variables.size() - 1;
            while ((j>=0) && !variables.get(j).containsKey(id)) j--;
            if (j>=0) {
                var = variables.get(j).get(id);
            } else {
                System.err.println(String.format("Error: idenifier '%s' does not exist", id));
                System.exit(0);
            }
            CodeFragment assign = generateAssignCode(var, val_code);
            code.appendCodeFragment(assign);
            code.addArg(new Variable(argRegister, type, subtype));
        }
        return (CodeFragment)code;
    }

    @Override
    public CodeFragment visitValBool(siiiParser.ValBoolContext ctx) {
        String value = ctx.BOOL().getText();
        CodeFragment code = new CodeFragment();
        String register = generateNewRegister();
        code.setRegister(register);
        code.setType("i1");
        code.setSubType("i1");
        if (value.equals("pravda")) {
            code.addCode(String.format("%s = add i1 0, %s\n", register, "1"));
        }
        else
            code.addCode(String.format("%s = add i1 0, %s\n", register, "0"));
        return code;
    }

    @Override public CodeFragment visitRange(siiiParser.RangeContext ctx) { 
        CodeFragment start = visit(ctx.expression(0));
        CodeFragment end = visit(ctx.expression(1));
        CodeFragment jump = new CodeFragment();
        if (ctx.expression().size()>2) {
            jump = visit(ctx.expression(2));
        } else {
            jump.setType(start.getType());
            jump.setRegister(generateNewRegister());
            jump.addCode(String.format("%s = add %s 0, 1\n", jump.getRegister(), jump.getType()));
        }

        CodeFragment ret = new CodeFragment();
        String reg = generateNewRegister();
        ST template = new ST (
            "<start_code>" +
            "<end_code>" +
            "<jump_code>" +
            "<reg> = call i8* @createRange<stype>(<type> <start>, <type> <end>, <type> <jump>)\n"
        );
        if (start.getType().equals("i32"))
        {
            template.add("stype", "Int");
            template.add("type", "i32");
        } else {    
            template.add("stype", "Char");
            template.add("type", "i8");
        }

        template.add("reg", reg);
        template.add("start", start.getRegister());
        template.add("end", end.getRegister());
        template.add("jump", jump.getRegister());
        template.add("start_code", start);
        template.add("end_code", end);
        template.add("jump_code", jump);

        ret.addCode(template.render());
        ret.setType("i8*");
        ret.setList(true);
        ret.setRegister(reg);

        return ret;
    }

    @Override
    public CodeFragment visitIf_statement(siiiParser.If_statementContext ctx) {
        ArrayList<CodeFragment> condition = new ArrayList<CodeFragment>();
        ArrayList<CodeFragment> blocks = new ArrayList<CodeFragment>();
        StringBuilder sb = new StringBuilder();
        for (int i=0; i < ctx.expression().size(); i++)
        {
            condition.add(visit(ctx.expression(i)));
            blocks.add(visit(ctx.block(i)));
            sb.append("<condition"+ i +"_code>");
            if (condition.get(i).getType() == "i1")
                sb.append("<conn"+ i +"_reg> = zext i1 <con"+ i +"_reg> to i32\n");
                //sb.append("br i1 <con"+ i +"_reg>, label %<block"+ i +"_true>, label %<block"+ i +"_false>\n");
            sb.append("<cmp"+ i +"_reg> = icmp ne i32 <conn"+ i +"_reg>, 0\n");
            sb.append("br i1 <cmp"+ i +"_reg>, label %<block"+ i +"_true>, label %<block"+ i +"_false>\n");
            sb.append("<block"+ i +"_true>:\n");
            sb.append("<block"+ i +"_code>");
            sb.append("br label %<block_end>\n");
            sb.append("<block"+ i +"_false>:\n");    
        }
        if (ctx.expression().size() < ctx.block().size()) 
        {
            blocks.add(visit(ctx.block(ctx.block().size()-1)));
            sb.append("<block_else>");
        }
        sb.append("br label %<block_end>\n");
        sb.append("<block_end>:\n");
        sb.append("<ret> = add i32 0, 0\n");

        ST template = new ST(sb.toString());
        for (int i = 0; i < condition.size(); i++) 
        {
            template.add("condition"+ i +"_code", condition.get(i));
            template.add("block"+ i +"_code", blocks.get(i));
            template.add("con"+ i +"_reg", condition.get(i).getRegister());
            template.add("conn"+ i +"_reg", generateNewRegister());
            //if (condition.get(i).getType() != "i1") 
            template.add("cmp"+ i +"_reg", generateNewRegister());
            template.add("block"+ i +"_true", generateNewLabel());
            template.add("block"+ i +"_false", generateNewLabel());
        }
        if (ctx.expression().size() < ctx.block().size()) 
        {
            template.add("block_else", blocks.get(blocks.size()-1));
        }
        template.add("block_end", this.generateNewLabel());
        String return_register = generateNewRegister();
        template.add("ret", return_register);
        
        CodeFragment ret = new CodeFragment();
        ret.setRegister(return_register);
        ret.addCode(template.render());
        ret.setType("i32");
        return ret;
    }

    @Override
    public CodeFragment visitSimple_assignment(siiiParser.Simple_assignmentContext ctx) {
        CodeFragment value = visit(ctx.expression());
        CodeFragment mem_register = visit(ctx.var());
        String reg = generateNewRegister();
        
        StringBuilder sb = new StringBuilder("<value_code>");
        if (!mem_register.getList())
            sb.append("store <value_type> <value_register>, <value_type>* <mem_register>\n");
        else {
            if (value.getType() == "i8*") {
                sb.append("store <value_type> <value_register>, <value_type>* <mem_register>\n");
            } else {
                sb.append(String.format("%s = load %s* %s\n", reg, mem_register.getType(), mem_register.getRegister()));
                if (mem_register.getType().equals("i32") || mem_register.getSubType().equals("i32"))
                    sb.append("call void @setListItemInt(i8* <mem_register>, i32 <index_register>, <value_type> <value_register>)\n");    
                else
                    sb.append("call void @setListItemChar(i8* <mem_register>, i32 <index_register>, <value_type> <value_register>)\n");    
            }
        }
        ST template = new ST(sb.toString());
        template.add("value_code", value);
        template.add("value_type", value.getType());
        template.add("value_register", value.getRegister());
        if (mem_register.getList()){
            if (value.getType() == "i8*") {
                template.add("mem_register", mem_register.getRegister());
            } else {
                template.add("mem_register", reg);
                template.add("index_register", mem_register.getIndex());
            }
        } else {
            template.add("mem_register", mem_register.getRegister());
        }
        CodeFragment ret = new CodeFragment();
        if (mem_register.getList()) ret.addCode(mem_register);
        ret.addCode(template.render());
        ret.setRegister(value.getRegister());
        ret.setType(value.getType());
        return ret;
    }

    @Override
    public CodeFragment visitBlock(siiiParser.BlockContext ctx) {
        variables.addLast(new HashMap<String, Variable>());
        CodeFragment code = new CodeFragment();
        for(int i = 0; i < ctx.statement().size(); i++) {
                CodeFragment statement = visit(ctx.statement(i));
                code.addCode(statement);
                code.setRegister(statement.getRegister());
                code.setType(statement.getType());
        }
        variables.removeLast();
        return code;
    }

    @Override public CodeFragment visitWhile_statement(siiiParser.While_statementContext ctx) { 
        CodeFragment condition = visit(ctx.expression());
        CodeFragment body = visit(ctx.block());
        
        StringBuilder sb = new StringBuilder();
        sb.append("br label %<cmp_label>\n"); 
        sb.append("<cmp_label>:\n");
        sb.append("<condition_code>");
        if (condition.getType() == "i1") {
            sb.append("<conndition_register> = zext i1 <condition_register> to i32\n");
        }
        sb.append("<cmp_register> = icmp ne i32 <conndition_register>, 0\n");
        sb.append("br i1 <cmp_register>, label %<body_label>, label %<end_label>\n");
        sb.append("<body_label>:\n");
        sb.append("<body_code>");
        sb.append("br label %<cmp_label>\n");
        sb.append("<end_label>:\n");
        sb.append("<ret> = add i32 0, 0\n");

        ST template = new ST(sb.toString());
        template.add("cmp_label", generateNewLabel());
        template.add("condition_code", condition);
        template.add("cmp_register", generateNewRegister());
        if (condition.getType() == "i1") {
           template.add("conndition_register", generateNewRegister());
        } else {
           template.add("conndition_register", condition.getRegister());
        }
        template.add("condition_register", condition.getRegister());
        template.add("body_label", generateNewLabel());
        template.add("end_label", generateNewLabel());
        template.add("body_code", body);
        String end_register = generateNewRegister();
        template.add("ret", end_register);
        
        CodeFragment ret = new CodeFragment();
        ret.addCode(template.render());
        ret.setRegister(end_register);
        ret.setType("i32");
        return ret;
    }

    @Override public CodeFragment visitExtern_func_def(siiiParser.Extern_func_defContext ctx) { 
        CodeFragment code = new CodeFragment();

        String ret_type = visit(ctx.type()).getType();
        String id = ctx.ID().getText();
        String name = "@" + id;

        ArgsCodeFragment arglist = (ArgsCodeFragment) visit(ctx.typelist());
        Function f = new Function(name, arglist.getArgs(), ret_type, null);
        if (!ex_functions.containsKey(id)) {
            ex_functions.put(id, f);
        } else {
            System.err.println(String.format("Error: function '%s' already declared", id));
            System.exit(0);
        }

        code.setType(arglist.getType());
        code.setRegister(arglist.getRegister());
        return code;
    }

    @Override
    public CodeFragment visitCompare(siiiParser.CompareContext ctx) {
        return generateCompareOperatorCodeFragment(
                visit(ctx.expression(0)),
                visit(ctx.expression(1)),
                ctx.op.getType()
        );
    }

    @Override
    public CodeFragment visitUnaryMinus(siiiParser.UnaryMinusContext ctx) { 
        return generateUnaryOperatorCodeFragment(
            visit(ctx.expression()),
            ctx.op.getType()
        );
    }

    @Override public CodeFragment visitFunc_def(siiiParser.Func_defContext ctx) { 
        CodeFragment code = new CodeFragment();
        String id = ctx.ID().getText();
        String ret_type = visit(ctx.type()).getType();
        CodeFragment body = new CodeFragment();
        ArgsCodeFragment arglist;
        Function f = new Function("@"+id, null, ret_type, body);
        if (!functions.containsKey(id)) {
            functions.put(id, f);
        } else {
            System.err.println(String.format("Error: function '%s' already declared", id));
            System.exit(0);
        }

        variables.addLast(new HashMap<String, Variable>());
        arglist = (ArgsCodeFragment) visit(ctx.arglist());
        f.setParams(arglist.getArgs());

        body.appendCodeFragment(arglist);
        body.appendCodeFragment(visit(ctx.block()));
        variables.removeLast();

        code.setRegister(body.getRegister());
        code.setType(body.getType());
        return code;
    }

    @Override public CodeFragment visitBitAnd(siiiParser.BitAndContext ctx) { return visitChildren(ctx); }

    @Override
    public CodeFragment visitValChar(siiiParser.ValCharContext ctx) {
        String value = Integer.toString((int)ctx.CHAR().getText().charAt(1));
        CodeFragment code = new CodeFragment();
        String register = generateNewRegister();
        code.setRegister(register);
        code.addCode(String.format("%s = add i8 0, %s\n", register, value));
        code.setType("i8");
        code.setSubType("i8");
        return code;
    }

    @Override
    public CodeFragment visitBoolNot(siiiParser.BoolNotContext ctx) {
        return generateUnaryOperatorCodeFragment(
            visit(ctx.expression()),
            ctx.op.getType()
        );
    }

    @Override
    public CodeFragment visitMul(siiiParser.MulContext ctx) {
        return generateBinaryOperatorCodeFragment(
                visit(ctx.expression(0)),
                visit(ctx.expression(1)),
                ctx.op.getType()
        );
    }

    @Override
    public CodeFragment visitAdd(siiiParser.AddContext ctx) { 
        return generateBinaryOperatorCodeFragment(
                visit(ctx.expression(0)),
                visit(ctx.expression(1)),
                ctx.op.getType()
        );
    }

    @Override
    public CodeFragment visitTypeBasic(siiiParser.TypeBasicContext ctx) { 
        CodeFragment code = new CodeFragment();
        String tmp = "i32";
        switch (ctx.getText()){
            case "int":
                tmp = "i32";
                break;
            case "char":
                tmp = "i8";
                break;
            case "bool":
                tmp = "i1";
                break;
            case "string":
                tmp = "i8*";
                break;
        }
        code.setType(tmp);
        return code;
    }

    @Override public CodeFragment visitTypelist(siiiParser.TypelistContext ctx) {
        ArgsCodeFragment code = new ArgsCodeFragment();
        for (int i = 0; i< ctx.type().size(); i++) {
            code.addArg(new Variable("", visit(ctx.type(i)).getType(), ""));
        }

        return (CodeFragment)code;
    }

    @Override public CodeFragment visitFor_statement(siiiParser.For_statementContext ctx) { 
        CodeFragment range = visit(ctx.range());
        Variable var = new Variable();
        CodeFragment var_code = new CodeFragment();
        String identifier = ctx.ID().getText();
        if (!variables.getLast().containsKey(identifier)) {
            var.setRegister(generateNewRegister());
            var.setType("i32");
            variables.getLast().put(identifier, var);
            ST temp = new ST(
                "<mem_register> = alloca i32\n"
                );
            temp.add("mem_register", var.getRegister());
            var_code.addCode(temp.render());
            var_code.setRegister(var.getRegister());
            var_code.setType("i32");
        } else {
            var = variables.getLast().get(identifier);
        }
        CodeFragment block = visit(ctx.block());


        ST template = new ST(
            "<range_code>" +
            "<var_code>" +
            "<init_size> = call i32 @sizeRangeInt(i8* <range>)\n" +
            "<init_cmp_register> = icmp slt i32 0, <init_size>\n" +
            "br i1 <init_cmp_register>, label %<init_label>, label %<end_label>\n" +
            "<init_label>:\n" +
            "<iptr> = alloca i32\n" +
            "<init_ni> = add i32 0, 0\n" +
            "store i32 <init_ni>, i32* <iptr>\n" +
            "<init_v> = call i32 @getRangeItemInt(i8* <range>, i32 <init_ni>)\n" +
            "store i32 <init_v>, i32* <varptr>\n" +

            "br label %<cmp_label>\n" +
            "<cmp_label>:\n" +
            "<size> = call i32 @sizeRangeInt(i8* <range>)\n" +
            "<cmp_i> = load i32* <iptr>\n" +
            "<cmp_register> = icmp slt i32 <cmp_i>, <size>\n" +

            "br i1 <cmp_register>, label %<body_label>, label %<end_label>\n" +
            "<body_label>:\n" +
            "<body_code>" +

            "<iter_i> = load i32* <iptr>\n" +
            "<iter_ni> = add i32 <iter_i>, 1\n" +
            "store i32 <iter_ni>, i32* <iptr>\n" +
            "<iter_v> = call i32 @getRangeItemInt(i8* <range>, i32 <iter_ni>)\n" +
            "store i32 <iter_v>, i32* <varptr>\n" +

            "br label %<cmp_label>\n" +
            "<end_label>:\n" +
            "<ret> = add <rtype> 0, 0\n"
        );

        template.add("range_code", range);
        template.add("var_code", var_code);

        template.add("init_ni", generateNewRegister());
        template.add("init_size", generateNewRegister());
        template.add("init_cmp_register", generateNewRegister());
        template.add("init_v", generateNewRegister());
        template.add("size", generateNewRegister());
        template.add("cmp_i", generateNewRegister());
        template.add("iter_i", generateNewRegister());
        template.add("iter_ni", generateNewRegister());
        template.add("iter_v", generateNewRegister());

        template.add("iptr", generateNewRegister());
        template.add("varptr", var.getRegister());
        template.add("range", range.getRegister());

        template.add("cmp_register", generateNewRegister());

        template.add("init_label", generateNewLabel());
        template.add("cmp_label", generateNewLabel());
        template.add("body_label", generateNewLabel());
        template.add("end_label", generateNewLabel());
        template.add("body_code", block);

        String end_register = generateNewRegister();
        template.add("ret", end_register);
        template.add("rtype", "i32");

        CodeFragment ret = new CodeFragment();
        ret.addCode(template.render());
        ret.setRegister(end_register);
        ret.setType("i32");
        return ret;
    }

    @Override
    public CodeFragment visitBoolOr(siiiParser.BoolOrContext ctx) { 
        return generateBinaryOperatorCodeFragment(
            visit(ctx.expression(0)),
            visit(ctx.expression(1)),
            ctx.op.getType()
        );
    }

    @Override public CodeFragment visitVarID(siiiParser.VarIDContext ctx) {

        CodeFragment code = new CodeFragment();
        String identifier = ctx.ID().getText();
        Variable var = new Variable();
        int i = variables.size() - 1;
        while ((i>=0) && !variables.get(i).containsKey(identifier)) i--;
        if (i>=0) {
                var = variables.get(i).get(identifier);
        }
        //System.err.println(String.format("VARID %s %s", identifier, var.getType()));
        code.setRegister(var.getRegister());
        code.setType(var.getType());
        code.setSubType(var.getSubType());
        if (var.getType() == "i8*") code.setList(true);
        return code;
    }

    @Override
    public CodeFragment visitRead(siiiParser.ReadContext ctx) { 
        CodeFragment var = visit(ctx.var());
        String val_register = generateNewRegister();
        ST template = new ST(
                "<val_register> = call i32 @readInt ()\n" +
                "store i32 <val_register>, i32* <mem_register>\n"
        );
        template.add("mem_register", var.getRegister());
        template.add("val_register", val_register);
        CodeFragment ret = new CodeFragment();
        ret.addCode(template.render());
        ret.setRegister(var.getRegister());
        ret.setType("i32");
        return ret;
    }

    @Override
    public CodeFragment visitPrint(siiiParser.PrintContext ctx) { 
        CodeFragment code = visit(ctx.expression());
        ST template = new ST(
                "<value_code>" + 
                "call i32 @print<stype> (<type> <value>)\n"
        );
        template.add("value_code", code);
        template.add("value", code.getRegister());
        if (code.getType().equals("i8*"))
        {
            template.add("type", "i8*");
            template.add("stype", "String");
        } else {
            switch(code.getType())
            {
                case "i8":
                    template.add("stype", "Char");
                    template.add("type", "i8");
                    break;
                case "i1":
                    template.add("stype", "Bool");
                    template.add("type", "i1");
                    break;
                default:
                    template.add("stype", "Int");
                    template.add("type", "i32");
                    break;
            }
        }
        // if (code.getSubType() != "") {
        //     template.add("type", code.getSubType());
        //     switch(code.getSubType())
        //     {
        //         case "i8":
        //             template.add("stype", "Char");
        //             break;
        //         case "i1":
        //             template.add("stype", "Bool");
        //             break;
        //         default:
        //             template.add("stype", "Int");
        //             break;
        //     }
        // }
        // else {
        //     template.add("type", code.getType());
        //     switch(code.getSubType())
        //     {
        //         case "i8":
        //             template.add("stype", "Char");
        //             break;
        //         case "i1":
        //             template.add("stype", "Bool");
        //             break;
        //         default:
        //             template.add("stype", "Int");
        //             break;
        //     }
        // }
        
        
        CodeFragment ret = new CodeFragment();
        ret.addCode(template.render());
        ret.setRegister(code.getRegister());
        ret.setType(code.getType());
        return ret;
    }

    @Override public CodeFragment visitVarList(siiiParser.VarListContext ctx) {
        CodeFragment var = visit(ctx.var());
        CodeFragment index = visit(ctx.expression());
        CodeFragment code = new CodeFragment();
        code.addCode(var);
        code.addCode(index);
        code.setRegister(var.getRegister());
        code.setType(var.getType());
        code.setSubType(var.getSubType());
        code.setIndex(index.getRegister());
        code.setList(true);
        return code;
    }

    @Override
    public CodeFragment visitVar_def(siiiParser.Var_defContext ctx) { 
        String mem_register = generateNewRegister();
        CodeFragment value = new CodeFragment();
        if (ctx.expression() != null) value = visit(ctx.expression());
        Variable var = new Variable();
        String code_stub = "";
        String value_reg = "";

        String identifier = ctx.ID().getText();
        CodeFragment cft = visit(ctx.type());
        if (!variables.getLast().containsKey(identifier)) {
            var.setRegister(mem_register);
            code_stub = "<mem_register> = alloca <value_type>\n";
            var.setType(cft.getType());
            var.setSubType(cft.getSubType());
            variables.getLast().put(identifier, var);
        } else {
            var = variables.getLast().get(identifier);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(code_stub);
        if (ctx.expression() != null) sb.append("<value_code>");
        if (ctx.expression() != null) {
            if (value.getType() == "i8*") {
                if (var.getSubType().equals("i32")){
                    if (ctx.expression() != null) {
                        value.code = value.code.replaceAll("Char", "Int");
                        value.code = value.code.replaceAll("i8", "i32");
                        value.code = value.code.replaceAll("call i32", "call i8");
                    }
                    sb.append(String.format("<value_register> = call i8* @createListFromRangeInt(i8* %s)\n", value.getRegister()));
                }
                else {
                    if (ctx.expression() != null) {
                        value.code = value.code.replaceAll("Int", "Char");
                        value.code = value.code.replaceAll("i32", "i8");
                    } 
                    sb.append(String.format("<value_register> = call i8* @createListFromRangeChar(i8* %s)\n", value.getRegister()));
                }
                value_reg = generateNewRegister();
            } else {
                value_reg = value.getRegister();
            }
            sb.append("store <value_type> <value_register>, <value_type>* <mem_register>\n");
        }
        ST template = new ST(sb.toString());
        if (ctx.expression() != null) {
            template.add("value_code", value);
            template.add("value_register", value_reg);
        }
        template.add("value_type", cft.getType());
        template.add("mem_register", var.getRegister());
        CodeFragment ret = new CodeFragment();
        ret.addCode(template.render());
        if (ctx.expression() != null) ret.setRegister(value_reg);
        ret.setType(cft.getType());
        return ret;
    }

    @Override
    public CodeFragment visitValVar(siiiParser.ValVarContext ctx) { 
        CodeFragment val = visit(ctx.var());
        CodeFragment code = new CodeFragment();
        String register = generateNewRegister();
        code.addCode(val);
        //if (val.getType() != "i8*")
        //{
            code.addCode(String.format("%s = load %s* %s\n", register, val.getType(), val.getRegister()));
            code.setRegister(register);
        //} else {
        //    code.setRegister(val.getRegister());
        //}
        code.setType(val.getType());
        code.setSubType(val.getSubType());
        return code;
    }

    @Override
    public CodeFragment visitValInt(siiiParser.ValIntContext ctx) { 
        String value = ctx.INT().getText();
        CodeFragment code = new CodeFragment();
        String register = generateNewRegister();
        code.setRegister(register);
        code.setType("i32");
        code.setSubType("i32");
        code.addCode(String.format("%s = add i32 0, %s\n", register, value));
        return code;
    }

    @Override
    public CodeFragment visitStatement(siiiParser.StatementContext ctx) { 
        if (ctx.simple_statement() != null) {
            return visit(ctx.simple_statement());
        }        
        return visit(ctx.block_statement());
    }

    @Override 
    public CodeFragment visitInit(siiiParser.InitContext ctx) { 
        variables.addLast(new HashMap<String, Variable>());
        CodeFragment body = new CodeFragment();
        for(int i = 0; i < ctx.statement().size(); i++) {
            CodeFragment st = visit(ctx.statement(i));
            body.appendCodeFragment(st);
        }

        ST template = new ST(
            "declare i32 @printInt(i32)\n" + 
            "declare i32 @printChar(i8)\n" +
            "declare i32 @printString(i8*)\n" +
            "declare i32 @readInt()\n" + 
            "declare i8* @createRangeInt(i32, i32, i32)\n" + 
            "declare i32 @sizeRangeInt(i8*)\n" +  
            "declare i32 @getRangeItemInt(i8*, i32)\n" + 
            "declare i8* @createListInt(i32)\n" + 
            "declare i32 @sizeListInt(i8*)\n" +  
            "declare i32 @getListItemInt(i8*, i32)\n" + 
            "declare void @setListItemInt(i8*, i32, i32)\n" +
            "declare i8* @createListFromRangeInt(i8*)\n" +
            "declare i8* @createListChar(i32)\n" + 
            "declare i32 @sizeListChar(i8*)\n" +  
            "declare i8 @getListItemChar(i8*, i32)\n" + 
            "declare void @setListItemChar(i8*, i32, i8)\n" +
            "declare i8* @createRangeChar(i8, i8, i8)\n" + 
            "declare i8* @createListFromRangeChar(i8*)\n" +
            "<ex_functions>" +
            "<functions>" +
            "define i32 @main() {\n" + 
            "start:\n" + 
            "<body_code>" + 
            "ret i32 0\n" +
            "}\n"
        );
        template.add("body_code", body);
        template.add("ex_functions", generateExternFunctions());
        template.add("functions", generateFunctions());

        CodeFragment code = new CodeFragment();
        code.addCode(template.render());
        code.setRegister(body.getRegister());
        return code;
    }

    @Override public CodeFragment visitList(siiiParser.ListContext ctx) { 
        ArgsCodeFragment value = (ArgsCodeFragment) visit(ctx.param_list());
        CodeFragment ret = new CodeFragment();
        String type = "Int";
        ret.setSubType("i32");
        if (value.getType() == "i8"){
            type = "Char";
            ret.setSubType("i8");
        } 
        String register = generateNewRegister();
        ret.addCode(value);
        ret.setType("i8*");
        ret.setList(true);
        ret.setRegister(register);
        ret.addCode(String.format(
                "%s = call i8* @createList%s(i32 %s)\n",
                register,
                type,
                Integer.toString(value.getArgs().size())
            )
        );

        for (int i = 0; i<value.getArgs().size(); i++) {
            ret.addCode(
                String.format(
                    "call %s @setListItem%s(%s %s, i32 %s, %s %s)\n",
                    "void",
                    type,
                    ret.getType(),
                    register,
                    Integer.toString(i),
                    value.getArgs().get(i).getType(),
                    value.getArgs().get(i).getRegister()
                )
            );
        }

        return ret;
    }

    @Override public CodeFragment visitBoolAnd(siiiParser.BoolAndContext ctx) { 
        return generateBinaryOperatorCodeFragment(
            visit(ctx.expression(0)),
            visit(ctx.expression(1)),
            ctx.op.getType()
        );
    }

    @Override public CodeFragment visitParam_list(siiiParser.Param_listContext ctx) { 
        ArgsCodeFragment code = new ArgsCodeFragment();
        for (int i = 0; i < ctx.expression().size(); i++) {
            CodeFragment expr_code = visit(ctx.expression(i));
            code.appendCodeFragment(expr_code);
            code.addArg(new Variable(expr_code.getRegister(), expr_code.getType(), expr_code.getSubType()));
            code.setType(expr_code.getType());
        }
        return (CodeFragment)code;
    }

    @Override 
    public CodeFragment visitComplex_assignment(siiiParser.Complex_assignmentContext ctx) { 
        return generateComplexOperatorCodeFragment(
            visit(ctx.var()),
            visit(ctx.expression()),
            ctx.op.getType()
        );
    }

    @Override public CodeFragment visitIndex(siiiParser.IndexContext ctx) {
        CodeFragment expr = visit(ctx.expression(0));
        CodeFragment index = visit(ctx.expression(1));
        String ret_register = generateNewRegister();
        //System.err.println(String.format("INDEX %s %s", expr.getType(), expr.getSubType()));

        ST template = new ST(
            "<ret> = call <type> @getListItem<type_word>(i8* <iterable>, i32 <index>)\n"
        );
        template.add("ret", ret_register);
        template.add("type", expr.getSubType());
        if (expr.getSubType() == "i8") template.add("type_word", "Char");
        else template.add("type_word", "Int");
        template.add("iterable", expr.getRegister());
        template.add("index", index.getRegister());
        CodeFragment code = new CodeFragment();
        code.addCode(expr);
        code.addCode(index);
        code.addCode(template.render());
        code.setRegister(ret_register);
        code.setType(expr.getSubType());
        code.setSubType(expr.getSubType());
        return code;
    }

    @Override public CodeFragment visitFunc_call(siiiParser.Func_callContext ctx) { 
        CodeFragment code = new CodeFragment();
        String id = ctx.ID().getText();
        Function f = new Function(null, null, null);
        if (functions.containsKey(id)){
            f = functions.get(id);
        } else if (ex_functions.containsKey(id)) {
            f = ex_functions.get(id);
        } else {
            System.err.println(String.format("Error: function '%s' is not declared", id));
            System.exit(0);
        }
        ArgsCodeFragment params = (ArgsCodeFragment)visit(ctx.param_list());

        String register = generateNewRegister();
        ST template = new ST(
            "<args_code>" +
            "<reg> = call <ret_type> <name>(<args>)\n"
        );
        template.add("args_code", params);
        template.add("name", f.getName());
        template.add("ret_type", f.getReturnType());
        template.add("args", paramsToString(params.getArgs()));
        template.add("reg", register);
        code.addCode(template.render());
        code.setRegister(register);
        code.setType(f.getReturnType());
        return code;
    }

    @Override public CodeFragment visitValList(siiiParser.ValListContext ctx) { return visitChildren(ctx); }

    @Override 
    public CodeFragment visitValString(siiiParser.ValStringContext ctx) { 
        String value = ctx.STRING().getText();
        CodeFragment code = new CodeFragment();
        String register = generateNewRegister();
        code.setRegister(register);
        code.addCode(String.format("%s = c\"%s\"\n", register, value));
        //code.setType("i8*");
        return code;
    }

    @Override 
    public CodeFragment visitBlock_statement(siiiParser.Block_statementContext ctx) { 
        variables.addLast(new HashMap<String, Variable>());
        CodeFragment code = new CodeFragment();
        code = visitChildren(ctx);
        variables.removeLast();
        return code;
    }

    @Override public CodeFragment visitTypeList(siiiParser.TypeListContext ctx) { 
        CodeFragment code = visit(ctx.type());
        code.setSubType(code.getType());
        code.setType("i8*");
        code.setList(true);
        return code; 
    }

    public CodeFragment generateBinaryOperatorCodeFragment(CodeFragment left, CodeFragment right, Integer operator) {
            String code_stub = "<ret> = <instruction> i32 <left_val>, <right_val>\n";
            String instruction = "or";
            switch (operator) {
                    case siiiParser.ADD:
                            instruction = "add";
                            break;
                    case siiiParser.SUB:
                            instruction = "sub";
                            break;
                    case siiiParser.MUL:
                            instruction = "mul";
                            break;
                    case siiiParser.DIV:
                            instruction = "sdiv";
                            break;
                    case siiiParser.AND:
                            instruction = "and";
                    case siiiParser.OR:
                            ST temp = new ST(
                                    "<r1> = icmp ne <left_type> \\<left_val>, 0\n" +
                                    "<r2> = icmp ne <right_type> \\<right_val>, 0\n" +
                                    "<r3> = \\<instruction> i1 <r1>, <r2>\n" +
                                    "\\<ret> = zext i1 <r3> to i32\n"
                            );
                            temp.add("r1", generateNewRegister());
                            temp.add("r2", generateNewRegister());
                            temp.add("r3", generateNewRegister());
                            temp.add("left_type", left.getType());
                            temp.add("right_type", right.getType());
                            code_stub = temp.render();
                            break;
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
            String ret_register = generateNewRegister();
            template.add("ret", ret_register);
            
            CodeFragment ret = new CodeFragment();
            ret.setRegister(ret_register);
            ret.addCode(template.render());
            ret.setType("i32");
            return ret;
    }

    public CodeFragment generateComplexOperatorCodeFragment(CodeFragment left, CodeFragment right, Integer operator) {
            String code_stub = "<ret> = <instruction> i32 <left_val>, <right_val>\n";
            String instruction = "or";
            switch (operator) {
                    case siiiParser.ADD_ASSIGN:
                            instruction = "add";
                            break;
                    case siiiParser.SUB_ASSIGN:
                            instruction = "sub";
                            break;
                    case siiiParser.MUL_ASSIGN:
                            instruction = "mul";
                            break;
                    case siiiParser.DIV_ASSIGN:
                            instruction = "sdiv";
                            break;
                    case siiiParser.AND_ASSIGN:
                            instruction = "and";
                    case siiiParser.OR_ASSIGN:
                            ST temp = new ST(
                                    "<r1> = icmp ne <left_type> \\<left_val>, 0\n" +
                                    "<r2> = icmp ne <right_type> \\<right_val>, 0\n" +
                                    "<r3> = \\<instruction> i1 <r1>, <r2>\n" +
                                    "\\<ret> = zext i1 <r3> to i32\n"
                            );
                            temp.add("r1", generateNewRegister());
                            temp.add("r2", generateNewRegister());
                            temp.add("r3", generateNewRegister());
                            temp.add("left_type", left.getType());
                            temp.add("right_type", right.getType());
                            code_stub = temp.render();
                            break;
            }
            ST template = new ST(
                    "<left_code>" + 
                    "<loadit>" + 
                    "<right_code>" + 
                    code_stub +
                    "<storeit>"
            );
            String mem_reg = generateNewRegister();
            template.add("left_code", left);
            template.add("right_code", right);
            template.add("loadit", String.format("%s = load %s* %s", mem_reg, left.getType(), left.getRegister()));
            template.add("instruction", instruction);
            template.add("left_val", mem_reg);
            template.add("right_val", right.getRegister());
            String ret_register = generateNewRegister();
            template.add("ret", ret_register);
            template.add("storeit", String.format("store %s %s, %s* %s\n", left.getType(), ret_register, left.getType(), left.getRegister()));
            
            CodeFragment ret = new CodeFragment();
            ret.setRegister(ret_register);
            ret.addCode(template.render());
            ret.setType("i32");
            return ret;
    }

    public CodeFragment generateCompareOperatorCodeFragment(CodeFragment left, CodeFragment right, Integer operator) {
            String code_stub = "<ret> = icmp <instruction> <left_type> <left_val>, <right_val>\n";
            String instruction = "eq";
            switch (operator) {
                    case siiiParser.NE:
                            instruction = "ne";
                            break;
                    case siiiParser.GT:
                            instruction = "sgt";
                            break;
                    case siiiParser.GE:
                            instruction = "sge";
                            break;
                    case siiiParser.LT:
                            instruction = "slt";
                            break;
                    case siiiParser.LE:
                            instruction = "sle";
                            break;
            }
            ST template = new ST(
                    "<left_code>" + 
                    "<right_code>" + 
                    code_stub
            );
            template.add("left_code", left);
            template.add("left_type", left.getType());
            template.add("right_code", right);
            template.add("instruction", instruction);
            template.add("left_val", left.getRegister());
            template.add("right_val", right.getRegister());
            String ret_register = generateNewRegister();
            template.add("ret", ret_register);
            
            CodeFragment ret = new CodeFragment();
            ret.setRegister(ret_register);
            ret.addCode(template.render());
            ret.setType("i1");
            return ret;
    
    }
    
    public CodeFragment generateUnaryOperatorCodeFragment(CodeFragment code, Integer operator) {
            if (operator == siiiParser.ADD) {
                    return code;
            }

            String code_stub = "";
            switch(operator) {
                    case siiiParser.SUB:
                            code_stub = "<ret> = sub i32 0, <input>\n";
                            break;
                    case siiiParser.NOT:
                            ST temp = new ST(
                                    "<r> = icmp eq i32 \\<input>, 0\n" + 
                                    "\\<ret> = zext i1 <r> to i32\n"
                            );
                            temp.add("r", generateNewRegister());
                            code_stub = temp.render();
                            break;
            }
            ST template = new ST("<code>" + code_stub);
            String ret_register = generateNewRegister();
            template.add("code", code);
            template.add("ret", ret_register);
            template.add("input", code.getRegister());

            CodeFragment ret = new CodeFragment();        
            ret.setRegister(ret_register);
            ret.addCode(template.render());
            ret.setType("i32");
            return ret;
            
    }

    private CodeFragment generateFunctions() {
        CodeFragment code = new CodeFragment();
        for(Map.Entry<String, Function> e : functions.entrySet()) {
                Function f = e.getValue();

                ST template = new ST(
                    "define <ret_type> <name>(<args>) {\n" +
                    "start:\n" +
                    "<body_code>" +
                    "<return>" +
                    "}\n"
                );

                template.add("ret_type", f.getReturnType());
                template.add("name", f.getName());
                template.add("body_code", f.getCode());
                template.add("args", paramsToString(f.getParams()));
                if (f.getReturnType().equals("i32"))
                    template.add("return", "ret i32 0\n");
                else
                    template.add("return", "");
                code.addCode(template.render());
                code.setRegister(f.getCode().getRegister());
        }
        return code;
    }

    private CodeFragment generateExternFunctions() {
        CodeFragment code = new CodeFragment();
        for(Map.Entry<String, Function> e : ex_functions.entrySet()) {
                Function f = e.getValue();

                ST template = new ST(
                    "declare <ret_type> <name>(<args>)\n"
                );

                template.add("ret_type", f.getReturnType());
                template.add("name", f.getName());
                template.add("args", paramsToString(f.getParams()));

                code.addCode(template.render());
                code.setRegister(f.getCode().getRegister());
        }
        return code;
    }

    private String paramsToString(List<Variable> params) {
        String s = "";
        boolean begin = true;
        for (int i = 0; i < params.size(); i++) {
                if (!begin) {
                        s += ", ";
                } else {
                        begin = false;
                }
                s += params.get(i).getType();
                s += " "; 
                s += params.get(i).getRegister();
        }
        return s;
    }

    public CodeFragment generateAssignCode(Variable var, CodeFragment value) {
        CodeFragment ret = new CodeFragment();
        String mem_register = var.getRegister();
        ST template = new ST(
            "<value_code>" +
            "store <type> <value_register>, <type>* <mem_register>\n"
        );

        template.add("value_code", value);
        template.add("value_register", value.getRegister());
        template.add("mem_register", mem_register);
        template.add("type", var.getType());

        ret.addCode(template.render());
        ret.setRegister(value.getRegister());
        return ret;
    }
}
