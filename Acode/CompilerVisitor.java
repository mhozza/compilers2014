import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.stringtemplate.v4.*;


public class CompilerVisitor extends AcodeBaseVisitor<CodeFragment> {
       
    private ArrayList< HashMap<String, Variable > > mem= new ArrayList< HashMap<String, Variable> >();
    private ArrayList<Function> functions = new ArrayList<Function>();
    private ArrayList<Function> extern_functions = new ArrayList<Function>();
    private int labelIndex = 0;
    private int registerIndex = 0;
    private int funcIndex = 0;
    private CodeFragment extern_def = new CodeFragment();
    private String ret_type="";
    private String cmp_type="i32";

    private String generateNewLabel() {
        return String.format("L%d", this.labelIndex++);
    }

    private String generateNewRegister() {
        return String.format("%%R%d", this.registerIndex++);
    }

    @Override
    public CodeFragment visitAssign(AcodeParser.AssignContext ctx) {
        CodeFragment value = new CodeFragment();
        String type = "";
        String mem_register= "";
        String lval_register= "";
        String code_stub = "";
        String size = "";
        String store_code= "";
        String id ="";
        String offset="";
        
        String identifier = ctx.lvalue().getText();

        int x=mem.size()-1;
        if(identifier.contains("[")){
            id=identifier.substring(0,identifier.indexOf("["));
        }else{
            id=identifier;
        }
        while ((x>=0) && !mem.get(x).containsKey(id)) x--;
        if (x>=0) {
            mem_register = mem.get(x).get(id).register;
            type = mem.get(x).get(id).type;
           
        }else{
            System.err.println(String.format("Error: idenifier '%s' does not exists", identifier));
        }


        
        if (identifier.contains("[")){
            size=array_size(identifier);
                 
                String val = ctx.expression().getText();
                if(val.contains("[")){
                    String val_register="";
                    String register = "";
     
                    String val_id=val.substring(0,val.indexOf("["));
                    int i=mem.size()-1;
                    while ((i>=0) && !mem.get(i).containsKey(val_id)) i--;
                    if (i>=0) {
                        val_register = mem.get(i).get(val_id).register;
                        type=mem.get(i).get(val_id).type;
                    }else{
                        System.err.println(String.format("Error: idenifier '%s' does not exists", val_id));
                    }
                    offset=array_size(val);
                    if(offset.contains("%")){
                        store_code="<load_reg>=load <type>* " +offset+"\n<register> = getelementptr <type>* "+val_register+", <type> <load_reg> \n<new_register2>= load <type>* <register>\nstore <type> <new_register2>, <type>* <new_register>\n";
                    }else{
                     store_code="<register> = getelementptr <type>* "+val_register+", <type> <offset> \n<new_register2>= load <type>* <register>\nstore <type> <new_register2>, <type>* <new_register>\n";
                    }

                }else{
                    value = visit(ctx.expression()); 
                    store_code="store <type> <value_register>, <type>* <new_register>\n";
                }  
                code_stub="<load_register>=load <type>* "+size+"\n<new_register> = getelementptr <type>* <mem_register>, <type> <load_register>\n";

        }else{
              String val = ctx.expression().getText();
                if(val.contains("[")){
                    String val_register="";
                    String register = "";
                    String val_id=val.substring(0,val.indexOf("["));
                    int i=mem.size()-1;
                    while ((i>=0) && !mem.get(i).containsKey(val_id)) i--;
                    if (i>=0) {
                        val_register = mem.get(i).get(val_id).register;
                //type = mem.get(i).get(identifier).type;
                    }else{
                        System.err.println(String.format("Error: idenifier '%s' does not exists", val_id));
                    }
                    offset=array_size(val);
                    if(offset.contains("%")){
                        store_code="<load_reg>=load <type>* " +offset+"\n<register> = getelementptr <type>* "+val_register+", <type> <load_reg> \n<new_register2>= load <type>* <register>\nstore <type> <new_register2>, <type>* <mem_register>\n";
                    }else{
                     store_code="<register> = getelementptr <type>* "+val_register+", <type> <offset> \n<new_register2>= load <type>* <register>\nstore <type> <new_register2>, <type>* <mem_register>\n";
                    }

                }else{
                    value = visit(ctx.expression()); 
                    store_code="store <type> <value_register>, <type>* <mem_register>\n";
                } 

        }
 
       
        CodeFragment ret = new CodeFragment();
        
        ST template = new ST(
            "<value_code>" + 
            code_stub + 
            store_code    
            );

        if(value!=null){          
            template.add("value_code", value);
            template.add("value_register", value.getRegister());
            ret.setRegister(value.getRegister());

        }

        template.add("type", Variable.getLLVMType(type));
        template.add("mem_register", mem_register);
        template.add("new_register",generateNewRegister());
        template.add("new_register2",generateNewRegister());
        template.add("load_reg",generateNewRegister());
        template.add("load_register",generateNewRegister());
        template.add("size", size);
        template.add("lval_register", lval_register);
        template.add("offset",offset);
        template.add("register",generateNewRegister());

        ret.addCode(template.render());
        //ret.setRegister(value.getRegister());
        
        return ret;
    }

    @Override
    public CodeFragment visitAssVar(AcodeParser.AssVarContext ctx) {
        CodeFragment code = visit(ctx.assign_var());
        return code;
    }

    public String array_size(String t){
        String ret = "";
        int from = t.indexOf("[")+1;
        int to = t.indexOf("]");
        ret = t.substring(from,to);

        int i=mem.size()-1;
            while ((i>=0) && !mem.get(i).containsKey(ret)) i--;
            if (i>=0) {
                ret = mem.get(i).get(ret).register;
            }
        return ret;
    }

    @Override
    public CodeFragment visitAssign_var(AcodeParser.Assign_varContext ctx) {
        String type = ctx.type().getText();
        CodeFragment value = new CodeFragment();
        String mem_register;
        String code_stub = "";
        String store_code ="";
        String size = "";
        String identifier = ctx.lvalue().getText();
        CodeFragment ret = new CodeFragment();
        
        String offset="";
        if (ctx.expression()!=null){
           /* System.err.println("not_nulllExpr");
            value = visit(ctx.expression());*/
            String val = ctx.expression().getText();
            if(val.contains("[")){
                String val_register="";
                String register = "";
                String val_id=val.substring(0,val.indexOf("["));
                int i=mem.size()-1;
                while ((i>=0) && !mem.get(i).containsKey(val_id)) i--;
                if (i>=0) {
                    val_register = mem.get(i).get(val_id).register;
                    type = mem.get(i).get(val_id).type;
                }else{
                    System.err.println(String.format("Error: idenifier '%s' does not exists", val_id));
                }
                offset=array_size(val);
                if(offset.contains("%")){
                    store_code="<load_reg>=load <type>* " +offset+"\n<register> = getelementptr <type>* "+val_register+", <type> <load_reg> \n<new_register>= load <type>* <register>\nstore <type> <new_register>, <type>* <mem_register>\n";
                }else{
                   store_code="<register> = getelementptr <type>* "+val_register+", <type> <offset> \n<new_register>= load <type>* <register>\nstore <type> <new_register>, <type>* <mem_register>\n";
                }
                
            }else{
                value = visit(ctx.expression());
                store_code= "store <type> <value_register>, <type>* <mem_register>\n";
            }
            
            
        }

        if (!mem.get(mem.size()-1).containsKey(identifier)) {
            mem_register = this.generateNewRegister();
            code_stub = "<mem_register> = alloca <type>\n";
            if(type.contains("[")){
                code_stub = "<r>=load <type>* <size>\n<mem_register> = alloca <type>, <type> <r>\n";
                size = array_size(type);
            }
            mem.get(mem.size()-1).put(identifier, new Variable(mem_register, type));
        } else {
            mem_register = mem.get(mem.size()-1).get(identifier).register;
            type = mem.get(mem.size()-1).get(identifier).type;

        }
        
        ST template = new ST(
            "<value_code>" + 
            code_stub + 
            store_code
            );

        if(value!=null){
            
            template.add("value_code", value);
            template.add("value_register", value.getRegister());
            ret.setRegister(value.getRegister());

        }
        template.add("type", Variable.getLLVMType(type));
        template.add("offset",offset);
        template.add("mem_register", mem_register);
        template.add("size", size);
        template.add("register",generateNewRegister());
        template.add("new_register",generateNewRegister());
        template.add("load_reg",generateNewRegister());
        template.add("r",generateNewRegister());
        
        ret.addCode(template.render());       
        return ret;
    }

     @Override
    public CodeFragment visitBool(AcodeParser.BoolContext ctx) {
        String value = "0";
        if (ctx.BOOL().getText().equals("true")) {
            value = "1";
        }
        CodeFragment code = new CodeFragment();
        String register = generateNewRegister();
        code.addCode(String.format("%s = add i1 0, %s\n", register, value));
        code.setRegister(register);
        return code;
    }



    @Override
    public CodeFragment visitArgs(AcodeParser.ArgsContext ctx) {
        CodeFragment ret = new CodeFragment();  
       // System.err.println("*"+ctx.type().size());    

        for(int i =0;i<ctx.lvalue().size();i++){
            String mem_register=generateNewRegister();
            String new_register=generateNewRegister();  
            String type= ctx.type(i).getText();        
            mem.get(mem.size()-1).put(ctx.lvalue(i).getText(), new Variable(new_register,type));
            
            String code_stub="";
            if(type.contains("[")){
               // code_stub="<new_register> = alloca i32, i32 5\nbr label %loop\nloop:\n%i = phi i32 [0, %start], [%j, %loop]\n%l = sub i32 %j,1\n%id1= getelementptr i32* <mem_register>, i32 %l\n%id2= getelementptr i32* <new_register>, i32 %l\n%val=load i32* %id1\nstore i32 %val, i32* %id2\n%j = add i32 %i, 1\n%cmp = icmp ne i32 %j, 5\n br i1 %cmp, label %loop, label %end\nend:\n";
               code_stub="<new_register> = getelementptr <type>* <mem_register>\n";   
          

            }else{
                code_stub="<new_register> = alloca <type>\nstore <type> <mem_register>, <type>* <new_register>\n";               
            }

            ST template = new ST(
            code_stub
            );

            ret.addArg(new Variable(mem_register,type));
            template.add("mem_register", mem_register);
            template.add("new_register", new_register);
            template.add("type", Variable.getLLVMType(type));
           // template.add("size", array_size(type));
            
            ret.addCode(template.render());
            ret.setRegister(mem_register);
        }
        return ret;
    }


   @Override
        public CodeFragment visitExtern(AcodeParser.ExternContext ctx) {
            String type = ctx.type().getText();     
            String name = ctx.name().getText(); 
            CodeFragment args = visit(ctx.args());
          
            Function f = new Function(type,name,args.args_list(),null);
            extern_functions.add(f);  

        ST template = new ST(       
        "declare <type> @<name>(<args>)\n"
        );
        
        template.add("type", Variable.getLLVMType(type));
        template.add("name", name);
        template.add("args",args.extern_args_code());
        String register=generateNewRegister();
        template.add("register", register);

        extern_def.addCode(template.render());
      //  extern_def.setRegister(register);
        CodeFragment ret = new CodeFragment();
        return ret;
    }



    @Override
    public CodeFragment visitFunctionDef(AcodeParser.FunctionDefContext ctx) {
        String name = ctx.name().getText(); 
        String type = ctx.type().getText(); 
        ret_type=type;
        CodeFragment args = visit(ctx.args());
        CodeFragment body = new CodeFragment();
        
        CodeFragment ret = new CodeFragment();
        Function f = new Function(type,name,args.args_list(),ret);
        functions.add(f);   

        ret.appendCodeFragment(args);
        body=visit(ctx.block());
        ret.appendCodeFragment(body);

        CodeFragment code = new CodeFragment();
        //code.setType(ret.getType());
        return code;
    }

    @Override
    public CodeFragment visitParam_call(AcodeParser.Param_callContext ctx) {
        CodeFragment code = new CodeFragment(); 
        String type="";
        String val_register="";
        for(AcodeParser.ExpressionContext p: ctx.expression()){
            CodeFragment e =new CodeFragment();
            e = visit(p);
            code.addCode(e);
                              
            String id= p.getText();
            int i=mem.size()-1;
            while ((i>=0) && !mem.get(i).containsKey(id)) i--;
            if (i>=0) {
                type = mem.get(i).get(id).type;
                val_register=mem.get(i).get(id).register;
            }else{
                System.err.println(String.format("Error: idenifier '%s' does not exists", id));
            }

            Variable v= new Variable(e.getRegister(),type);
               // Variable v= new Variable(val_register,type);
            code.addArg(v);

        }
        return code;
    }
    
    @Override 
    public CodeFragment visitFuncCall(AcodeParser.FuncCallContext ctx) {
        String name = ctx.name().getText(); 
        CodeFragment param = visit(ctx.param_call());
        Function f= null;
        for(int i =0;i<extern_functions.size();i++){
            if(name.equals(extern_functions.get(i).name)){
                f=extern_functions.get(i); 
            }
        }

        for(int i =0;i<functions.size();i++){
            if(name.equals(functions.get(i).name)){
                f=functions.get(i); 
            }
        }

        CodeFragment code = new CodeFragment();
        String register=generateNewRegister();
        ST template =null;
        if(f.type().equals("void")){
            template = new ST(       
                "<params_code>"+    
                "call void @<name>(<args>)\n"
                );
            template.add("params_code", param);
            template.add("name", f.name);
            template.add("args",param.args_code());

        }
        else
        {
            template = new ST(      
                "<params_code>"+    
                "<register> = call <type> @<name>(<args>)\n"
                );
            
            template.add("params_code", param);
            template.add("name", f.name);
            template.add("type",f.type());
            template.add("args",param.args_code());
            template.add("register", register);

        }

        
        
        code.addCode(template.render());
        code.setRegister(register);
        return code;
    }
/*
        @Override
        public CodeFragment visitPrint(AcodeParser.PrintContext ctx) {
                CodeFragment code = visit(ctx.expression());
                ST template = new ST(
                        "<value_code>" + 
                       "call i32 @printInt (i32 <value>)\n"
                );
                template.add("value_code", code);
                template.add("value", code.getRegister());
        //System.err.println(code.getRegister());
                
                CodeFragment ret = new CodeFragment();
                ret.addCode(template.render());
                return ret;
        }*/

        public CodeFragment generateBinaryOperatorCodeFragment(CodeFragment left, CodeFragment right, Integer operator,String cmp_type) {
                    
                String code_stub = "<ret> = <instruction> i32 <left_val>, <right_val>\n";
                String instruction = "or";
                switch (operator) {
                        case AcodeParser.EQ:
                                instruction = "eq";
                                code_stub = "<ret> = icmp <instruction> <cmp_type> <left_val>, <right_val>\n";
                                break;
                        case AcodeParser.NE:
                                instruction = "ne";
                                code_stub = "<ret> = icmp <instruction> <cmp_type> <left_val>, <right_val>\n";
                                break;
                                
                        case AcodeParser.LE:
                                instruction = "sle";
                                code_stub = "<ret> = icmp <instruction> i32 <left_val>, <right_val>\n";
                                break;
                                
                        case AcodeParser.LT:
                                instruction = "slt";
                                code_stub = "<ret> = icmp <instruction> i32 <left_val>, <right_val>\n";
                                break;
                        case AcodeParser.GE:
                                instruction = "sge";
                                code_stub = "<ret> = icmp <instruction> i32 <left_val>, <right_val>\n";
                                break;
                                
                        case AcodeParser.GT:
                                instruction = "sgt";
                                code_stub = "<ret> = icmp <instruction> i32 <left_val>, <right_val>\n";
                                break;        
                                                        
                        case AcodeParser.ADD:
                                instruction = "add";
                                break;
                        case AcodeParser.ADD_A:
                                instruction = "add";
                                break;        

                        case AcodeParser.SUB:
                                instruction = "sub";
                                break;
                        case AcodeParser.SUB_A:
                                instruction = "sub";
                                break;        
                        case AcodeParser.MUL:
                                instruction = "mul";
                                break;
                        case AcodeParser.MUL_A:
                                instruction = "mul";
                                break;        
                        case AcodeParser.DIV:
                                instruction = "sdiv";
                                break;
                        case AcodeParser.DIV_A:
                                instruction = "sdiv";
                                break;    
                        case AcodeParser.MOD:
                                instruction = "srem";
                                break;
                        case AcodeParser.MOD_A:
                                instruction = "srem";
                                break;               
                        case AcodeParser.EXP:
                                instruction = "@iexp";
                                code_stub = "<ret> = call i32 <instruction>(i32 <left_val>, i32 <right_val>)\n";
                                break;
                        case AcodeParser.EXP_A:
                                instruction = "@iexp";
                                code_stub = "<ret> = call i32 <instruction>(i32 <left_val>, i32 <right_val>)\n";
                                break;        
                        case AcodeParser.AND:
                                instruction = "and";
                        case AcodeParser.OR:
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
                template.add("cmp_type", cmp_type);
                template.add("instruction", instruction);
                template.add("left_val", left.getRegister());
                template.add("right_val", right.getRegister());
                String ret_register = this.generateNewRegister();
                template.add("ret", ret_register);
                
                CodeFragment ret = new CodeFragment();
                ret.setRegister(ret_register);
                ret.addCode(template.render());
                return ret;
        
        }
        
        public CodeFragment generateUnaryOperatorCodeFragment(CodeFragment code, Integer operator) {
                if (operator == AcodeParser.ADD) {
                        return code;
                }

                String code_stub = "";
                switch(operator) {
                        case AcodeParser.SUB:
                                code_stub = "<ret> = sub i32 0, <input>\n";
                                break;
                        case AcodeParser.NOT:
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
                return ret;
                
        }

        @Override
        public CodeFragment visitOwn_ass(AcodeParser.Own_assContext ctx) {
               CodeFragment code = visit(ctx.own_assign());
                return code;
        }

        @Override
        public CodeFragment visitOwn_assign(AcodeParser.Own_assignContext ctx) {
            CodeFragment value = new CodeFragment();
            String type= "";
            String mem_register="";
            CodeFragment exp= new CodeFragment();
            exp=visit(ctx.expression(0));
            String identifier=ctx.expression(0).getText();
            value=generateBinaryOperatorCodeFragment(
                visit(ctx.expression(0)),
                visit(ctx.expression(1)),
                ctx.op.getType(),cmp_type
                );

            int i=mem.size()-1;
            while ((i>=0) && !mem.get(i).containsKey(identifier)) i--;
            if (i>=0) {
                mem_register = mem.get(i).get(identifier).register;
                type = mem.get(i).get(identifier).type;
            }else{
                System.err.println(String.format("Error: idenifier '%s' does not exists", identifier));
            }

            ST template = new ST(
                "<value_code>" + 
                "store <type> <value_register>, <type>* <mem_register>\n"
                );
            template.add("value_code", value);
            template.add("value_register", value.getRegister());
            template.add("type", Variable.getLLVMType(type));
            template.add("mem_register",mem_register);

            CodeFragment ret = new CodeFragment();
            ret.addCode(template.render());
            ret.setRegister(value.getRegister());
            return ret;


        }

      

        @Override
        public CodeFragment visitCmp(AcodeParser.CmpContext ctx) {
                return generateBinaryOperatorCodeFragment(
                        visit(ctx.expression(0)),
                        visit(ctx.expression(1)),
                        ctx.op.getType(),cmp_type
                );
        }

        @Override
        public CodeFragment visitAdd(AcodeParser.AddContext ctx) {
                return generateBinaryOperatorCodeFragment(
                        visit(ctx.expression(0)),
            visit(ctx.expression(1)),
                        ctx.op.getType(),cmp_type
                );
        }

        @Override 
        public CodeFragment visitMul(AcodeParser.MulContext ctx) {
                return generateBinaryOperatorCodeFragment(
                        visit(ctx.expression(0)),
                        visit(ctx.expression(1)),
                        ctx.op.getType(),cmp_type
                );
        }

        @Override 
        public CodeFragment visitExp(AcodeParser.ExpContext ctx) {
                return generateBinaryOperatorCodeFragment(
                        visit(ctx.expression(0)),
                        visit(ctx.expression(1)),
                        ctx.op.getType(),cmp_type
                );
        }

        @Override
        public CodeFragment visitPar(AcodeParser.ParContext ctx) {
                return visit(ctx.expression());
        }


        @Override
        public CodeFragment visitUna(AcodeParser.UnaContext ctx) {
                return generateUnaryOperatorCodeFragment(
                        visit(ctx.expression()),
                        ctx.op.getType()
                );
        }

        @Override
        public CodeFragment visitVar(AcodeParser.VarContext ctx) {
                String id = ctx.STRING().getText();
                String size = "";
                String identifier="";
                CodeFragment code = new CodeFragment();
                String register = generateNewRegister();
                String pointer = "!\"Unknown identifier\"";
                String type = "";
                int i=mem.size()-1;

                if(id.contains("[")){
                    size=array_size(id);
                    identifier=id.substring(0,id.indexOf("["));
                  
                }else{
                    identifier=id;
                }

                while ((i>=0) && !mem.get(i).containsKey(identifier)) i--;
                if (i>=0) {
                        pointer = mem.get(i).get(identifier).register;
                        type = mem.get(i).get(identifier).type;
                }

               

              
                String t="i32"; 
                if(!type.equals("")){
                  t=Variable.getLLVMType(type);   
                }

                if(id.contains("[")){
                    String mem_register=generateNewRegister();
                    code.addCode(String.format("%s = getelementptr i32* %s, i32 %s\n",mem_register,pointer,size));
                    pointer=mem_register;
                    t="i32";
                }

                code.addCode(String.format("%s = load %s* %s\n",register,t, pointer));
              
                code.setRegister(register);
                return code;
        }

        @Override
        public CodeFragment visitInt(AcodeParser.IntContext ctx) {
            String value = ctx.INT().getText();
            CodeFragment code = new CodeFragment();
            String register = generateNewRegister();
            code.setRegister(register);
            code.addCode(String.format("%s = add i32 0, %s\n", register, value));
            return code;
        }

        @Override
        public CodeFragment visitRet(AcodeParser.RetContext ctx) {
            CodeFragment code = new CodeFragment();

            if(ret_type.equals("void")){
                code.addCode(String.format("ret void\n"));
            }   else{
                code=visit(ctx.expression()); 
                code.addCode(String.format("ret %s %s\n",Variable.getLLVMType(ret_type),code.getRegister()));
            }      

            return code;
        }

        @Override 
        public CodeFragment visitBlock(AcodeParser.BlockContext ctx) {
            mem.add(new HashMap<String,Variable>());
            CodeFragment cf=visit(ctx.statements());
            mem.remove(mem.size()-1);
            return cf;
        }

        @Override
        public CodeFragment visitBlock_st(AcodeParser.Block_stContext ctx) {
            CodeFragment code = visit(ctx.block());
            return code;
        }

        @Override 
        public CodeFragment visitIf(AcodeParser.IfContext ctx) {
                String id = ctx.expression(0).getText();
                
                int i=mem.size()-1;
                while ((i>=0) && !mem.get(i).containsKey(id)) i--;
                if (i>=0) {
                        cmp_type = Variable.getLLVMType(mem.get(i).get(id).type);
                }
                CodeFragment condition = generateBinaryOperatorCodeFragment(
                        visit(ctx.expression(0)),
                        visit(ctx.expression(1)),
                        ctx.op.getType(),cmp_type
                );

                CodeFragment statement_true = visit(ctx.block(0));
                CodeFragment statement_false=new CodeFragment();
                if(ctx.block().size()>1){
                    statement_false = visit(ctx.block(1));  
                }

                ST template = new ST(
                        "<condition_code>" + 
                        "<cmp_reg> = icmp ne i1 <con_reg>, 0\n" + 
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
                cmp_type="i32";
                CodeFragment ret = new CodeFragment();
                ret.setRegister(return_register);
                ret.addCode(template.render());

                return ret;
        }

        @Override
        public CodeFragment visitWhile(AcodeParser.WhileContext ctx) {
                CodeFragment condition = visit(ctx.expression());
                CodeFragment body = visit(ctx.block());
                
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
        public CodeFragment visitFor(AcodeParser.ForContext ctx) { 
            CodeFragment ass_var=visit(ctx.assign_var()); 
            CodeFragment cmp=generateBinaryOperatorCodeFragment(
                visit(ctx.expression(0)),
                visit(ctx.expression(1)),
                ctx.op.getType(),cmp_type
                );
            CodeFragment own_assign =visit(ctx.own_assign());
            CodeFragment body =visit(ctx.block());
            ST template = new ST(
                "<assign_var>"+
                "br label %<cmp_label>\n" + 
                "<cmp_label>:\n" + 
                "<cmp>" +
                      
                "br i1 <cmp_register>, label %<body_label>, label %<end_label>\n" + 
                "<body_label>:\n" + 
                "<body_code>" + 
                "<own_assign_code>"+
                "br label %<cmp_label>\n" + 
                "<end_label>:\n" + 
                "<ret> = add i32 0, 0\n"
                );
            template.add("assign_var", ass_var);
            template.add("cmp_label", generateNewLabel());
            template.add("cmp", cmp);
            template.add("cmp_register", cmp.getRegister());
            template.add("body_label", generateNewLabel());
            template.add("end_label", generateNewLabel());
            template.add("body_code", body);
            template.add("own_assign_code", own_assign);
            String end_register = generateNewRegister();
            template.add("ret", end_register);



            CodeFragment ret = new CodeFragment();
            ret.addCode(template.render());
            ret.setRegister(end_register);
            return ret;
        }
        

        @Override 
        public CodeFragment visitNot(AcodeParser.NotContext ctx) {
                return generateUnaryOperatorCodeFragment(
                        visit(ctx.expression()),
                        ctx.op.getType()
                );
        }

        @Override
        public CodeFragment visitAnd(AcodeParser.AndContext ctx) {
                return generateBinaryOperatorCodeFragment(
                        visit(ctx.expression(0)),
                        visit(ctx.expression(1)),
                        ctx.op.getType(),cmp_type
                );
        }

        @Override
        public CodeFragment visitOr(AcodeParser.OrContext ctx) {
            return generateBinaryOperatorCodeFragment(
                visit(ctx.expression(0)),
                visit(ctx.expression(1)),
                ctx.op.getType(),cmp_type
                );
        }

        @Override
        public CodeFragment visitInit(AcodeParser.InitContext ctx) {
            mem.add(new HashMap<String, Variable>());
            CodeFragment body = visit(ctx.statements());

            ST template = new ST(
                "<extern_def>"+    
                "<functions>" +
                "define i32 @main() {\n" + 
                "start:\n" + 
                "<body_code>" + 
                "ret i32 0\n" +
                "}\n"
                );
            template.add("functions", allFunctions());
            template.add("body_code", body);
            template.add("extern_def", extern_def);

            CodeFragment code = new CodeFragment();
            code.addCode(template.render());
            code.setRegister(body.getRegister());
            return code;
        }


        public CodeFragment allFunctions(){
            CodeFragment code = new CodeFragment();
            for(Function f: functions){
                ST template = new ST(
                    "define <type> @<name>(<args>) {\n" +
                    "start:\n" + 
                    "<body_code>" + 
                    "}\n"
                    );

                template.add("type", f.type());    
                template.add("name", f.name);
                template.add("args", f.args());
                template.add("body_code", f.body);  

                code.addCode(template.render());

            }
            return code;
        }

        
        @Override
        public CodeFragment visitStatements(AcodeParser.StatementsContext ctx) {
            CodeFragment code = new CodeFragment();
            for(AcodeParser.StatementContext s: ctx.statement()) {
                CodeFragment statement = visit(s);
                code.addCode(statement);
                code.setRegister(statement.getRegister());
            }
            return code;
        }

        @Override
        public CodeFragment visitEmp(AcodeParser.EmpContext ctx) {
            return new CodeFragment();
        }

}
