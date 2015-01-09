//package com.kompilator;

import java.lang.System;
import java.util.HashMap;
import java.util.Map;
import java.util.LinkedList;
import java.util.ArrayList;

import org.stringtemplate.v4.*;


/**
 * Created by tranco on 12/18/14.
 */

public class CompilerVisitor extends anakondaBaseVisitor<CodeFragment> {
    private LinkedList<Map<String, Variable>> mem = new LinkedList<Map<String, Variable>>();
    private HashMap<String, Function> funs = new HashMap<String, Function>();
    private int labelIndex = 0;
    private int registerIndex = 0;
    private ArrayList<String> tempargs = new ArrayList<String>();

    private String generateNewLabel() {
        return String.format("L%d", this.labelIndex++);
    }

    private String generateNewRegister() {
        return String.format("%%R%d", this.registerIndex++);
    }

    private Variable findInMem(String varname) {
        int j = mem.size() - 1;
        for (int i = j; i >= 0; i--) {
            if (mem.get(i).containsKey(varname)) {
                return mem.get(i).get(varname);
            }
        }
        return null;
    }

    @Override
    public CodeFragment visitArgs(anakondaParser.ArgsContext ctx) {
        String mem_register;
        String argregister;
        String name;
        Type type;
        ST template;
        ST template2;

        CodeFragment code = new CodeFragment();
        int len = ctx.type().size();
        ArrayList<String> argnames = new ArrayList<String>();
        ArrayList<String> argnames2 = new ArrayList<String>();
        for (int i = 0; i < len; i++) {
            name = ctx.VARNAME(i).getText();
            type = visit(ctx.type(i)).type;
            System.err.println("muh type");
            System.err.println(type.getCode());
            if (argnames.contains(name)) {
                System.err.println(String.format("Error: Duplicate function arguments"));
                System.exit(0);
            }
            CodeFragment arg_code = new CodeFragment();
            argnames.add(name);

            mem_register = generateNewRegister();
            Variable memvar = new Variable(name, mem_register, type);
            mem.getLast().put(name, memvar);
            //System.err.println("muh memregistur");
            //System.err.println(name + mem.getLast().get(name));
            //System.err.println(findInMem(name));

            argnames2.add(mem_register);

            argregister = generateNewRegister();

            template = new ST("<mem_register> = alloca <type>\n");
            template.add("mem_register", mem_register);
            template.add("type", type.getCode());

            arg_code.addCode(template.render());
            arg_code.setRegister(mem_register);
            code.appendFragment(arg_code);

            CodeFragment val_code = new CodeFragment();
            val_code.setRegister(argregister);

            template2 = new ST(
                    "store <type> <value_register>, <type>* <mem_register>\n"
            );
            template2.add("value_register", argregister);
            template2.add("mem_register", mem_register);
            template2.add("type", type.getCode());

            //mem.getLast().put(name,argregister);
            CodeFragment tmpcode3 = new CodeFragment();
            tmpcode3.addCode(template2.render());
            tmpcode3.setRegister(val_code.getRegister());
            code.appendFragment(tmpcode3);
            //System.err.println(tmpregister);
            Variable argvar = new Variable(name, argregister, type);
            code.args.add(argvar);
        }
        tempargs = argnames2;
        code.type = PrimitiveType.INT;
        return code;
    }

    @Override
    public CodeFragment visitParams(anakondaParser.ParamsContext ctx) {
        CodeFragment paramInit = new CodeFragment();
        int len = ctx.expression().size();
        for (int i = 0; i < len; i++) {
            CodeFragment vizit = visit(ctx.expression(i));
            paramInit.appendFragment(vizit);
            Variable vizvar = new Variable(vizit.getRegister(), vizit.getRegister(), vizit.type);
            paramInit.args.add(vizvar);
        }
        //System.err.println("paramInit.args" );
        //System.err.println(paramInit.args );
        return paramInit;
                /*CodeFragment code = new CodeFragment();
                for (int i = 0; i < ctx.expression().size(); i++) {
                        CodeFragment expr_code = visit(ctx.expression(i));
                        code.appendFragment(expr_code);
                        code.args.add(expr_code.getRegister());
                }
                return code;
                */
    }

    @Override
    public CodeFragment visitDefine_fun(anakondaParser.Define_funContext ctx) {
        mem.addLast(new HashMap<String, Variable>());
        String name = ctx.VARNAME().getText();
        Type type = visit(ctx.type()).type;
        if (funs.get(name) == null) {
            Function fun1 = new Function(name, type, null, null);
            funs.put(name, fun1);
        } else {
            System.err.println(String.format("Error: Function already defined"));
            System.exit(0);
        }
        CodeFragment args = visit(ctx.arguments());
        CodeFragment body = visit(ctx.block());
        mem.removeLast();
        args.appendFragment(body);
        body = args;
        Function fun2 = funs.get(name);
        fun2.arguments = args.args;
        fun2.body = body;
        fun2.type = type;
        funs.put(name, fun2);
        CodeFragment code = new CodeFragment();
        code.setRegister(body.getRegister());
        code.type = type;
        return code;
    }


    @Override
    public CodeFragment visitDefine_var(anakondaParser.Define_varContext ctx) {
        CodeFragment value = visit(ctx.expression());
        Type type = visit(ctx.type()).type;
        String mem_register;
        String code_stub = "";

        String varname = ctx.VARNAME().getText();
        if (!mem.getLast().containsKey(varname)) {
            mem_register = this.generateNewRegister();
            code_stub = "<mem_register> = alloca <type>\n";
            Variable memvar = new Variable(varname, mem_register, type);
            mem.getLast().put(varname, memvar);
        } else {
            mem_register = mem.getLast().get(varname).register;
        }
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
        ret.type = type;
        if (ctx.expression() == null) {
            Variable tmpvar = findInMem(varname);
            if (tmpvar.getType() instanceof ArrayType) {
                value = giveList(((ArrayType) tmpvar.getType()).getSubtype(), new CodeFragment());
            } else {
                value = generateConstant(tmpvar.getType(), tmpvar.getType().getDefaultValue());
            }
            CodeFragment assign = normAssCode(tmpvar, value);
            ret.appendFragment(assign);
        }

        //System.err.println("define code:");
        //System.err.println(template.render());
        //System.err.println("end define code");
        return ret;
    }


    @Override
    public CodeFragment visitValList(anakondaParser.ValListContext ctx) {
        CodeFragment value = (CodeFragment) visit(ctx.list().parameters());
        Type subtype = value.type;
        return giveList(subtype, value);
    }


    @Override
    public CodeFragment visitNormal_assign(anakondaParser.Normal_assignContext ctx) {
        CodeFragment codement = new CodeFragment();
        CodeFragment asspression = visit(ctx.expression());
        CodeFragment fragvalment;
        fragvalment = visit(ctx.var());
        codement.addCode(fragvalment);
        if ((fragvalment.type instanceof ArrayType) && (fragvalment.itype != null)) {
            codement.appendFragment(assCode(fragvalment, asspression));
        } else {
            Variable tempv = new Variable(fragvalment.info, fragvalment.getRegister(), fragvalment.type);
            codement.appendFragment(normAssCode(tempv, asspression));
        }
        return codement;
        /*CodeFragment value = visit(ctx.expression());
        String mem_register = "";
        String code_stub = "";

        String varname = ctx.var().getText();
        Variable varFromMem = findInMem(varname);
        if (varFromMem == null) {
            System.err.println(String.format("Error: Undefined variablassign"));
            System.exit(0);
        } else {
            mem_register = varFromMem.register;
        }

        ST template = new ST(
                "<value_code>" +
                        code_stub +
                        "store i32 <value_register>, i32* <mem_register>\n"
        );
        template.add("value_code", value);
        template.add("value_register", value.getRegister());
        template.add("mem_register", mem_register);
        CodeFragment ret = new CodeFragment();
        ret.addCode(template.render());
        System.err.println("assign code:");
        System.err.println(template.render());
        System.err.println("end code");
        ret.setRegister(value.getRegister());
        ret.type = PrimitiveType.INT;
        return ret;*/


    }

    @Override
    public CodeFragment visitValVar(anakondaParser.ValVarContext ctx) {
        CodeFragment varfrag = visit(ctx.var());
        CodeFragment codement = new CodeFragment();
        if ((varfrag.type instanceof ArrayType) && (varfrag.itype != null)) {
            codement.appendFragment(getFromArray(varfrag));
        } else {
            codement.addCode(varfrag);
            codement.appendFragment(getVar(varfrag.getRegister(), varfrag.type));
        }
        return codement;
        /*String vname = ctx.VARNAME().getText();
        CodeFragment code = new CodeFragment();
        String register = generateNewRegister();
        //System.err.println("register" + register);
        String pointer = "!\"Unknown varname\"";
        Variable varFromMem = findInMem(vname);
       if (varFromMem.type instanceof ArrayType) {
            CodeFragment v = visit(ctx.VARNAME());
            CodeFragment code = new CodeFragment();
            if (v.itype != null) {
                code.appendFragment(getFromArray((CodeFragment) v));
            } else {
                code.addCode(v);
                code.appendFragment(getVar(v.getRegister(), v.type));
            }
            return code;
        }

        if (varFromMem == null) {
            System.err.println(String.format("Error: Undefined variable"));
            System.exit(0);
        } else {
            pointer = varFromMem.register;
        }
        code.addCode(String.format("%s = load %s* %s\n", register, varFromMem.getType().getCode(), pointer));
        code.setRegister(register);
        code.info = vname;
        //System.err.println("pointer" + pointer);
        //System.err.println("codegister" + code.register);
        code.type = varFromMem.type;
        return code;*/
    }

    @Override
    public CodeFragment visitPrimitiveType(anakondaParser.PrimitiveTypeContext ctx) {
        CodeFragment code = new CodeFragment();
        code.type = PrimitiveType.fromString(ctx.getText());
        return code;
    }

    @Override
    public CodeFragment visitTypeList(anakondaParser.TypeListContext ctx) {
        CodeFragment code = new CodeFragment();
        Type subtype = visit(ctx.type()).type;
        System.err.println("visitTypeList: " + subtype);
        code.type = new ArrayType(subtype);
        return code;
    }


    private CodeFragment getFromArray(CodeFragment var) {
        ArrayType t = (ArrayType) var.type;
        String register = generateNewRegister();
        CodeFragment code = new CodeFragment();
        code.addCode(var);
        ST template = new ST(
                "<ret> = call <type> @getArrayItemInt(<subtype> <subval>, <itype> <ival>)\n"
        );
        template.add("ret", register);
        template.add("type", t.getSubtype().getCode());
        template.add("subtype", var.type.getCode());
        template.add("subval", var.getRegister());
        template.add("itype", var.itype.getCode());
        template.add("ival", var.ireg);
        code.addCode(template.render());


        code.setRegister(register);
        code.type = t.getSubtype();

        return code;
    }

    private CodeFragment giveList(Type subtype, CodeFragment value) {
        String register = generateNewRegister();
        CodeFragment code = new CodeFragment();
        code.addCode(value);
        code.type = new ArrayType(subtype);
        code.setRegister(register);
        code.addCode(String.format("%s = call %s @createArrayInt(%s %s)\n", register, code.type.getCode(), PrimitiveType.INT.getCode(), Integer.toString(value.args.size())));
        for (int i = 0; i < value.args.size(); i++) {
            code.addCode(String.format("call %s @setArrayItemInt(%s %s, %s %s, %s %s)\n","void", code.type.getCode(), register, PrimitiveType.INT.getCode(), Integer.toString(i), value.args.get(i).type.getCode(), value.args.get(i).getRegister()));
        }
        return code;
    }

    private CodeFragment generateConstant(Type t, String value) {
        CodeFragment code = new CodeFragment();
        String register = generateNewRegister();
        code.type = t;
        code.setRegister(register);
        code.addCode(String.format("%s = add %s 0, %s\n", register, code.type.getCode(), value));
        return code;
    }

    @Override
    public CodeFragment visitCallFun(anakondaParser.CallFunContext ctx) {
        String mem_register = generateNewRegister();
        String strong = "";
        Function fun = new Function(null, null, null, null);
        String name = ctx.call_fun().VARNAME().getText();
        if (funs.get(name) != null) {
            fun = funs.get(name);
        } else {
            System.err.println(String.format("Error: Undefined function"));
            System.exit(0);
        }
        CodeFragment pars = visit(ctx.call_fun().parameters());
        //System.err.println("Parameters: " + pars.code);
        //System.err.print("Parargs: ");
        //System.err.println(pars.args);
        CodeFragment parStrings = getParamList(pars);
        for (int i = 0; i < parStrings.args.size(); i++) {
            if (i > 0) strong += ", ";
            strong += parStrings.args.get(i).type.getCode() + " " + parStrings.args.get(i).register;

        }
        //System.err.println("Strong: " + strong);
        ST template = new ST(
                "<pars>" +
                        "<mem_register> = call <funtype> @<name>(<args>)\n"
        );
        template.add("pars", pars);
        template.add("mem_register", mem_register);
        template.add("funtype", fun.type.getCode());
        template.add("name", name);
        template.add("args", strong);
        CodeFragment ret = new CodeFragment();
        ret.addCode(template.render());
        ret.setRegister(mem_register);
        ret.type = fun.type;
        return ret;
    }

    private CodeFragment getParamList(CodeFragment paramList) {
        CodeFragment code = new CodeFragment();
        code.appendFragment(paramList);
        for (int i = 0; i < paramList.args.size(); i++) {
            Variable v = paramList.args.get(i);
            code.args.add(v);
        }
        return code;
    }


    public CodeFragment generateBinaryOperatorCodeFragment(CodeFragment left, CodeFragment right, Integer operator) {
        String code_stub = "<ret> = <instruction> i32 <left_val>, <right_val>\n";
        String instruction = "or";
        switch (operator) {
            case anakondaParser.ADD:
                instruction = "add";
                break;
            case anakondaParser.SUBTRACT:
                instruction = "sub";
                break;
            case anakondaParser.MULTIPLY:
                instruction = "mul";
                break;
            case anakondaParser.DIVIDE:
                instruction = "sdiv";
                break;
            case anakondaParser.MODULO:
                instruction = "srem";
                break;
            case anakondaParser.AND:
                instruction = "and";
            case anakondaParser.OR:
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
        String ret_register = this.generateNewRegister();
        template.add("ret", ret_register);

        CodeFragment ret = new CodeFragment();
        ret.setRegister(ret_register);
        ret.addCode(template.render());
        ret.type = PrimitiveType.INT;
        //System.err.println(template.render());
        return ret;

    }

    public CodeFragment generateUnaryOperatorCodeFragment(CodeFragment code, Integer operator) {
        if (operator == anakondaParser.ADD) {
            return code;
        }

        String code_stub = "";
        switch (operator) {
            case anakondaParser.SUBTRACT:
                code_stub = "<ret> = sub i32 0, <input>\n";
                break;
            case anakondaParser.NOT:
                ST temp = new ST(
                        "<r> = icmp eq i32 \\<input>, 0\n" +
                                "\\<ret> = zext i1 <r> to i32\n"
                );
                temp.add("r", this.generateNewRegister());
                code_stub = temp.render();
                break;
        }
        ST template = new ST("<code>" + code_stub);
        String ret_register = this.generateNewRegister();
        template.add("code", code);
        template.add("ret", ret_register);
        template.add("input", code.getRegister());

        CodeFragment ret = new CodeFragment();
        ret.setRegister(ret_register);
        ret.addCode(template.render());
        ret.type = PrimitiveType.INT;
        return ret;

    }

    @Override
    public CodeFragment visitAddpression(anakondaParser.AddpressionContext ctx) {
        return generateBinaryOperatorCodeFragment(
                visit(ctx.expression(0)),
                visit(ctx.expression(1)),
                ctx.op.getType()
        );
    }

    @Override
    public CodeFragment visitMultipression(anakondaParser.MultipressionContext ctx) {
        return generateBinaryOperatorCodeFragment(
                visit(ctx.expression(0)),
                visit(ctx.expression(1)),
                ctx.op.getType()
        );
    }

    @Override
    public CodeFragment visitCombined_assign(anakondaParser.Combined_assignContext ctx) {
        CodeFragment codement = new CodeFragment();
        CodeFragment expression = visit(ctx.expression());
        CodeFragment fragvalment;
        fragvalment = visit(ctx.var());
        Map<Integer, Integer> operators = new HashMap<Integer, Integer>();
        operators.put(anakondaParser.ADDASS, anakondaParser.ADD);
        operators.put(anakondaParser.SUBASS, anakondaParser.SUBTRACT);
        operators.put(anakondaParser.MULASS, anakondaParser.MULTIPLY);
        operators.put(anakondaParser.DIVASS, anakondaParser.DIVIDE);
        operators.put(anakondaParser.MODASS, anakondaParser.MODULO);
        int op = ctx.op.getType();
        CodeFragment tmp = new CodeFragment();
        String register = generateNewRegister();
        tmp.addCode(String.format("%s = load %s* %s\n", register, fragvalment.type.getCode(), fragvalment.getRegister()));
        tmp.setRegister(register);
        tmp.type = fragvalment.type;
        CodeFragment rval = generateBinaryOperatorCodeFragment(tmp, expression, operators.get(op));
        Variable tempv = new Variable(fragvalment.info, fragvalment.getRegister(), fragvalment.type);
        codement.appendFragment(normAssCode(tempv, rval));
        return codement;
    }

        /*@Override
        public CodeFragment visitExp(anakondaParser.ExpContext ctx) {
                return generateBinaryOperatorCodeFragment(
                        visit(ctx.expression(0)),
                        visit(ctx.expression(1)),
                        ctx.op.getType()
                );
        }*/

    @Override
    public CodeFragment visitPrecedence(anakondaParser.PrecedenceContext ctx) {
        return visit(ctx.expression());
    }


    @Override
    public CodeFragment visitUnary(anakondaParser.UnaryContext ctx) {
        return generateUnaryOperatorCodeFragment(
                visit(ctx.expression()),
                ctx.op.getType()
        );
    }

    @Override
    public CodeFragment visitVarName(anakondaParser.VarNameContext ctx) {
        CodeFragment codement = new CodeFragment();
        String name = ctx.VARNAME().getText();
        Variable memvar = findInMem(name);
        codement.info = memvar.getName();
        codement.setRegister(memvar.getRegister());
        codement.type = memvar.type;
        return codement;
        /*String vname = ctx.VARNAME().getText();
        CodeFragment code = new CodeFragment();
        String register = generateNewRegister();
        //System.err.println("register" + register);
        String pointer = "!\"Unknown varname\"";
        Variable varFromMem = findInMem(vname);
       if (varFromMem.type instanceof ArrayType) {
            CodeFragment v = visit(ctx.VARNAME());
            CodeFragment code = new CodeFragment();
            if (v.itype != null) {
                code.appendFragment(getFromArray((CodeFragment) v));
            } else {
                code.addCode(v);
                code.appendFragment(getVar(v.getRegister(), v.type));
            }
            return code;
        }

        if (varFromMem == null) {
            System.err.println(String.format("Error: Undefined variable"));
            System.exit(0);
        } else {
            pointer = varFromMem.register;
        }
        code.addCode(String.format("%s = load %s* %s\n", register, varFromMem.getType().getCode(), pointer));
        code.setRegister(register);
        code.info = vname;
        //System.err.println("pointer" + pointer);
        //System.err.println("codegister" + code.register);
        code.type = varFromMem.type;
        return code;*/
    }


    public CodeFragment normAssCode(Variable var, CodeFragment value) {
        CodeFragment rekt = new CodeFragment();
        String mem_register = var.getRegister();
        Type type = var.getType();
        ST template = new ST(
                "<value_code>" +
                        "store <type> <value_register>, <type>* <mem_register>\n"
        );
        template.add("value_code", value);
        template.add("type", value.type.getCode());
        template.add("value_register", value.getRegister());
        template.add("mem_register", mem_register);
        rekt.addCode(template.render());
        rekt.setRegister(value.getRegister());
        rekt.type = value.type;
        return rekt;
    }

    //
    //
    //DOKODIT
    //
    //
    @Override
    public CodeFragment visitVarList(anakondaParser.VarListContext ctx) {
        /*String vname = ctx.var().getText();
        CodeFragment code = new CodeFragment();
        String register = generateNewRegister();
        String pointer = "!\"Unknown varname\"";
        Variable varFromMem = findInMem(vname);
        if (varFromMem == null) {
            System.err.println(String.format("Error: Undefined variable"));
            System.exit(0);
        } else {
            pointer = varFromMem.register;
        }
        code.addCode(String.format("%s = load i32* %s\n", register, pointer));
        code.setRegister(register);
        code.type = varFromMem.type;
        return code;*/
        CodeFragment var;
        var = visit(ctx.var());
        CodeFragment code = new CodeFragment();
        CodeFragment index = visit(ctx.expression());
        code.addCode(index);
        code.itype = PrimitiveType.INT;
        code.ireg = index.getRegister();
        var.appendFragment(getVar(var.getRegister(), var.type));
        code.appendFragment(var);
        //System.err.println("Visitvarlist: "+ code.type + code.itype.getCode() + code.ireg);
        return code;
    }

    private CodeFragment getVar(String mem_register, Type t) {
        CodeFragment code = new CodeFragment();
        String register = generateNewRegister();
        code.addCode(String.format("%s = load %s* %s\n", register, t.getCode(), mem_register));
        code.setRegister(register);
        code.type = t;
        return code;
    }

    @Override
    public CodeFragment visitValInt(anakondaParser.ValIntContext ctx) {
        String value = ctx.CISLO().getText();
        CodeFragment code = new CodeFragment();
        String register = generateNewRegister();
        code.setRegister(register);
        code.addCode(String.format("%s = add i32 0, %s\n", register, value));
        code.type = PrimitiveType.INT;
        return code;
    }

    @Override
    public CodeFragment visitBlock(anakondaParser.BlockContext ctx) {
        mem.addLast(new HashMap<String, Variable>());
        int len = ctx.statement().size();
        CodeFragment cf = visit(ctx.statement(0));
        for (int i = 1; i < len; i++) {
            cf.appendFragment(visit(ctx.statement(i)));
        }
        mem.removeLast();
        //System.err.println("hami hami");
        //System.err.println(cf.code);
        return cf;
    }

    private CodeFragment VtB(Variable v) {
        CodeFragment code = new CodeFragment();
        if (v.getType() == PrimitiveType.BOOL) {
            code.type = PrimitiveType.BOOL;
            code.setRegister(v.getRegister());
            return code;
        }
        String register = this.generateNewRegister();
        ST temp = new ST(
                "<register> = <instruction> ne <type> <value>, 0\n"
        );
        //System.err.println("habababa");
        Type t = v.getType();
        String instruction = "no_instruction";
        if (t == PrimitiveType.INT) {
            instruction = "icmp";
        }
        temp.add("register", register);
        temp.add("type", t.getCode());
        temp.add("value", v.getRegister());
        temp.add("instruction", instruction);
        code.addCode(temp.render());
        code.type = PrimitiveType.BOOL;
        code.setRegister(register);
        return code;
    }

    @Override
    public CodeFragment visitCompression(anakondaParser.CompressionContext ctx) {
        return generateCompareOperatorCodeFragment(
                visit(ctx.expression(0)),
                visit(ctx.expression(1)),
                ctx.op.getType()
        );
    }

    @Override
    public CodeFragment visitIfblock(anakondaParser.IfblockContext ctx) {
        CodeFragment code = new CodeFragment();
        String endBlockLabel = this.generateNewLabel();
        for (int i = 0; i < ctx.expression().size(); i++) {
            CodeFragment expression = visit(ctx.expression(i));
            Variable v = new Variable(expression.info, expression.getRegister(), expression.type);
            expression.appendFragment(VtB(v));
            CodeFragment block = visit(ctx.block(i));
            ST template = new ST(
                    "<condition_code>" +
                            "<comparison_register> = icmp ne <type> <condition_register>, 0\n" +
                            "br i1 <comparison_register>, label %<block_true>, label %<block_next>\n" +
                            "<block_true>:\n" +
                            "<statement_true_code>" +
                            "br label %<block_end>\n" +
                            "<block_next>:\n"
            );
            template.add("condition_code", expression);
            template.add("statement_true_code", block);
            template.add("comparison_register", this.generateNewRegister());
            template.add("condition_register", expression.getRegister());
            template.add("type", expression.type.getCode());
            template.add("block_true", this.generateNewLabel());
            template.add("block_next", this.generateNewLabel());
            template.add("block_end", endBlockLabel);
            code.addCode(template.render());
        }
        if (ctx.block().size() > ctx.expression().size()) {
            CodeFragment block = visit(ctx.block(ctx.block().size() - 1));
            ST template = new ST(
                    "<statement_true_code>" +
                            "br label %<block_next>\n" +
                            "<block_next>:\n"
            );
            template.add("statement_true_code", block);
            template.add("block_next", this.generateNewLabel());
            code.addCode(template.render());
        }
        ST template = new ST(
                "br label %<block_end>\n" +
                        "<block_end>:\n" +
                        "<ret> = add <type> 0, 0\n"
        );
        template.add("block_end", endBlockLabel);
        template.add("type", PrimitiveType.INT.getCode());
        String return_register = generateNewRegister();
        template.add("ret", return_register);
        code.addCode(template.render());
        code.type = PrimitiveType.INT;
        code.setRegister(return_register);
        return code;
    }


    protected CodeFragment declVar(String varname, Type t) {
        CodeFragment ret = new CodeFragment();
        if (t == PrimitiveType.NOTYPE) {
            System.err.println("Error: Bad type in var declaration");
        }

        Map<String, Variable> table = mem.getLast();
        if (!table.containsKey(varname)) {
            String mem_register = this.generateNewRegister();
            table.put(varname, new Variable(varname, mem_register, t));
            ST template = new ST("<mem_register> = alloca <type>\n");
            template.add("mem_register", mem_register);
            template.add("type", t.getCode());
            ret.addCode(template.render());
            ret.setRegister(mem_register);
            ret.type = t;
        } else {
            System.err.println("Error: Var already defined");
        }
        return ret;
    }

    public CodeFragment visitPrint(anakondaParser.PrintContext ctx) {

        CodeFragment code = visit(ctx.expression());
        //System.err.println("Printaaaaah: " + code);
        ST template = new ST(
                "<value_code>" +
                        "call i32 @printInt (i32 <value>)\n"
        );
        template.add("value_code", code);
        template.add("value", code.getRegister());
        CodeFragment rekt = new CodeFragment();
        rekt.addCode(template.render());
        rekt.setRegister(code.getRegister());
        rekt.type = code.type;
        return rekt;
    }

    @Override
    public CodeFragment visitReadpression(anakondaParser.ReadpressionContext ctx) {
        String val_register = generateNewRegister();
        ST template = new ST(
                "<val_register> = call i32 @readInt ()\n"
        );
        template.add("val_register", val_register);
        CodeFragment ret = new CodeFragment();
        ret.addCode(template.render());
        ret.setRegister(val_register);
        ret.type = PrimitiveType.INT;
        return ret;
    }


    private CodeFragment varVert(Variable v, Type t) {
        CodeFragment code = new CodeFragment();
        if (v.type == t) {
            code.type = t;
            code.setRegister(v.getRegister());
            return code;
        }
        String instruction = "";
        String register = this.generateNewRegister();
        if (t instanceof ArrayType) {
            ArrayType lt = (ArrayType) t;
            if (lt.getSubtype().equals(v.getType())) {
                code.addCode(String.format("%s = call %s @createArrayInt(%s %s)\n",register,t.getCode(),PrimitiveType.INT.getCode(),"1"));
                code.addCode(String.format("call %s @setArrayItemInt(%s %s, %s %s, %s %s)\n","void",t.getCode(),register,PrimitiveType.INT.getCode(),"0",v.getType().getCode(),v.getRegister()));
            }
        } else {
            if (v.getType().isInteger() && t.isInteger()) {
                if (Integer.parseInt(v.getType().getCode().substring(1)) <= Integer.parseInt(t.getCode().substring(1))) {
                    instruction = "zext";
                } else {
                    instruction = "trunc";
                }
            } else if (v.getType().isInteger()) {
                instruction = "sitofp";
            } else {
                System.err.println("ggnetusim");
            }
            ST temp = new ST(
                    "<ret> = <instruction> <t1> <r> to <t2>\n"
            );
            temp.add("r", v.getRegister());
            temp.add("t1", v.getType().getCode());
            temp.add("t2", t.getCode());
            temp.add("instruction", instruction);
            temp.add("ret", register);
            code.addCode(temp.render());
        }
        code.type = t;
        code.setRegister(register);
        return code;
    }

    @Override
    public CodeFragment visitForcycle(anakondaParser.ForcycleContext ctx) {
        ST template = new ST(
                "<initializer_code>" +
                        "br label %<condition_label>\n" +
                        "<condition_label>:\n" +
                        "<condition_code>" +
                        "br i1 <condition_register>, label %<body_label>, label %<end_label>\n" +
                        "<body_label>:\n" +
                        "<body_code>" +
                        "<step_code>" +
                        "br label %<condition_label>\n" +
                        "<end_label>:\n"
        );
        template.add("initializer_code", visit(ctx.define_var()).code);
        CodeFragment conditionCodeFragment = visit(ctx.expression());
        template.add("condition_label", generateNewLabel());
        template.add("condition_code", conditionCodeFragment.code);
        template.add("condition_register", conditionCodeFragment.getRegister());
        template.add("body_label", generateNewLabel());
        template.add("body_code", visit(ctx.block()).code);
        template.add("step_code", visit(ctx.assign()).code);
        template.add("end_label", generateNewLabel());
        CodeFragment ret = new CodeFragment();
        ret.addCode(template.render());
        return ret;
    }


    @Override
    public CodeFragment visitWhilecycle(anakondaParser.WhilecycleContext ctx) {
        CodeFragment condition = visit(ctx.expression());
        CodeFragment body = visit(ctx.block());
        ST template = new ST(
                "br label %<comparison_label>\n" +
                        "<comparison_label>:\n" +
                        "<condition_code>" +
                        "<comparison_register> = icmp ne i32 <condition_register>, 0\n" +
                        "br i1 <comparison_register>, label %<body_label>, label %<end_label>\n" +
                        "<body_label>:\n" +
                        "<body_code>" +
                        "br label %<comparison_label>\n" +
                        "<end_label>:\n" +
                        "<ret> = add i32 0, 0\n"
        );
        template.add("comparison_label", generateNewLabel());
        template.add("condition_code", condition);
        template.add("comparison_register", generateNewRegister());
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
    public CodeFragment visitNotpression(anakondaParser.NotpressionContext ctx) {
        return generateUnaryOperatorCodeFragment(
                visit(ctx.expression()),
                ctx.op.getType()
        );
    }

    @Override
    public CodeFragment visitAndpression(anakondaParser.AndpressionContext ctx) {
        return generateBinaryOperatorCodeFragment(
                visit(ctx.expression(0)),
                visit(ctx.expression(1)),
                ctx.op.getType()
        );
    }

    @Override
    public CodeFragment visitOrpression(anakondaParser.OrpressionContext ctx) {
        return generateBinaryOperatorCodeFragment(
                visit(ctx.expression(0)),
                visit(ctx.expression(1)),
                ctx.op.getType()
        );
    }

    @Override
    public CodeFragment visitStatement(anakondaParser.StatementContext ctx) {
        if (ctx.oneline_statement() != null) {
            System.err.println("oneline");
            return visit(ctx.oneline_statement());
        }
        System.err.println("Block");
        return visit(ctx.block_statement());
    }

    public CodeFragment generateCompareOperatorCodeFragment(CodeFragment left, CodeFragment right, Integer operator) {
        String code_stub = "<ret> = icmp <instruction> <left_type> <left_val>, <right_val>\n";
        String instruction = "eq";
        switch (operator) {
            case anakondaParser.NOTEEQUAL:
                instruction = "ne";
                break;
            case anakondaParser.GREATERTHAN:
                instruction = "sgt";
                break;
            case anakondaParser.GREATEREQUAL:
                instruction = "sge";
                break;
            case anakondaParser.LESSTHAN:
                instruction = "slt";
                break;
            case anakondaParser.LESSEQUAL:
                instruction = "sle";
                break;
        }
        ST template = new ST(
                "<left_code>" +
                        "<right_code>" +
                        code_stub
        );
        template.add("left_code", left);
        template.add("left_type", left.type.getCode());
        template.add("right_code", right);
        template.add("instruction", instruction);
        template.add("left_val", left.getRegister());
        template.add("right_val", right.getRegister());
        String ret_register = generateNewRegister();
        template.add("ret", ret_register);
        CodeFragment ret = new CodeFragment();
        ret.setRegister(ret_register);
        ret.addCode(template.render());
        ret.type = PrimitiveType.BOOL;
        return ret;

    }

    @Override
    public CodeFragment visitInit(anakondaParser.InitContext ctx) {
        mem.addLast(new HashMap<String, Variable>());
        CodeFragment body = new CodeFragment();
        int len = ctx.statement().size();
        System.err.println(len);
        for (int i = 0; i < len; i++) {
            body.appendFragment(visit(ctx.statement(i)));
        }
        CodeFragment tempfuns = new CodeFragment();
        for (Map.Entry<String, Function> entry : funs.entrySet()) {
            Function funval = entry.getValue();
            String strong = "";
            ArrayList<Variable> parStrings = funval.arguments;
            for (int i = 0; i < parStrings.size(); i++) {
                if (i > 0) strong += ", ";
                strong += parStrings.get(i).type.getCode() + " " + parStrings.get(i).register;
            }
            ST template = new ST(
                    "define <type> @<name>(<args>) {\n" +
                            "start:\n" +
                            "<body_code>" +
                            "}\n"
            );
            template.add("args", strong);
            template.add("type", funval.type.getCode());
            template.add("name", funval.name);
            template.add("body_code", funval.body);
            tempfuns.addCode(template.render());
            tempfuns.setRegister(funval.body.getRegister());
        }
        ST template = new ST(
                "declare i32 @printInt(i32)\n" +
                        "declare i32 @readInt()\n" +
                        "declare i8* @createArrayInt (i32)\n" +
                        "declare void @setArrayItemInt (i8*, i32, i32)\n" +
                        "declare i32 @getArrayItemInt (i8*, i32)\n" +
                        "declare i8* @mergeArraysInt (i8*, i8*)\n" +
                        "declare i8* @multiplyArrayInt (i8*, i32)\n" +
                        "declare i32 @sizeArrayInt (i8*)\n" +
                        "declare i32 @iexp(i32, i32)\n" +
                        "<funs>" +
                        "define i32 @main() {\n" +
                        "start:\n" +
                        "<body_code>" +
                        "ret i32 0\n" +
                        "}\n"
        );
        template.add("funs", tempfuns);
        template.add("body_code", body);
        CodeFragment code = new CodeFragment();
        code.addCode(template.render());
        code.setRegister(body.getRegister());
        return code;
    }

    public CodeFragment assCode(CodeFragment var, CodeFragment value) {
        CodeFragment rekt = new CodeFragment();
        rekt.addCode(value);
        Type type = ((ArrayType) var.type).getSubtype();
        if (!(value.type == type)) {
            Variable valvar = new Variable(value.info, value.getRegister(), value.type);
            value.appendFragment(varVert(valvar, type));
        }
        ST template = new ST(
                "call void @setArrayItemInt(<list_type> <list>, <itype> <ival>, <item_type> <item>)\n"
        );
        template.add("list_type", var.type.getCode());
        template.add("list", var.getRegister());
        template.add("itype", var.itype.getCode());
        template.add("ival", var.ireg);
        template.add("item_type", value.type.getCode());
        template.add("item", value.getRegister());
        rekt.addCode(template.render());
        rekt.setRegister(value.getRegister());
        rekt.type = value.type;
        return rekt;
    }
        /*@Override
        public CodeFragment visitStatements(anakondaParser.StatementsContext ctx) {
                CodeFragment code = new CodeFragment();
                for(anakondaParser.StatementContext s: ctx.statement()) {
                        CodeFragment statement = visit(s);
                        code.addCode(statement);
                        code.setRegister(statement.getRegister());
                }
                return code;
        }*/
//    @Override
//    public CodeFragment visitEmp(anakondaParser.EmpContext ctx) {
//        return new CodeFragment();
//    }

    @Override
    public CodeFragment visitRet(anakondaParser.RetContext ctx) {
        CodeFragment code = visit(ctx.expression());
        code.addCode(String.format("ret i32 %s\n", code.getRegister()));
        return code;
    }
}