package pascript;

import java.util.ArrayList;
import java.util.Map;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.stringtemplate.v4.ST;
import pascript.grammar.PascriptBaseVisitor;
import pascript.grammar.PascriptParser;
import pascript.DataTypeVisitor.*;
import pascript.ExpressionCodeVisitor.*;
import pascript.SymbolTable.*;

/**
 *
 * @author Osama Hassanein
 */
public class CodeVisitor extends PascriptBaseVisitor<CodeVisitor.CodeFragment>
{
    public static class CodeFragment
    {
        protected StringBuilder _code = new StringBuilder();

        public CodeFragment()
        {
            super();
        }

        public CodeFragment(String codeString)
        {
            super();
            this._code.append(codeString);
        }

        public CodeFragment addCode(String codeString)
        {
            this._code.append(codeString);
            return this;
        }

        @Override
        public String toString()
        {
            return this._code.toString();
        }
    }
    
    private final SymbolTable _symbolTable;
    private final DataTypeVisitor _dataTypeVisitor;
    private final ExpressionCodeVisitor _expressionCodeVisitor;
        
    public CodeVisitor()
    {
        super();
        this._symbolTable = new SymbolTable();
        this._dataTypeVisitor = new DataTypeVisitor();
        this._expressionCodeVisitor = new ExpressionCodeVisitor(this._symbolTable);
    }

    @Override
    public CodeFragment visit(ParseTree pt)
    {
        return ((pt == null) ? new CodeFragment() : super.visit(pt));
    }
    
    private String processExternalFunctions()
    {
        StringBuilder resultCode = new StringBuilder();
        String templateString = 
            "declare <return_data_type> <function_name>(<parameter_list_code>)\n";
        
        for (FunctionRecord externalFunctionRecord : this._symbolTable.getExternalFunctions())
        {
            StringBuilder parameterListCode = new StringBuilder();
            
            boolean firstParameter = true;
            for (DataType parameterDataType : externalFunctionRecord.getParameterDataTypes())
            {
                if (!firstParameter)
                {
                    parameterListCode.append(", ");
                }
                else
                {
                    firstParameter = false;
                }
                parameterListCode.append(parameterDataType.getOutputType());
            }
                        
            ST template = new ST(templateString);
            template.add("return_data_type", externalFunctionRecord.getReturnDataType().getOutputType());
            template.add("function_name", externalFunctionRecord.getOutputFunctionName());
            template.add("parameter_list_code", parameterListCode.toString());
            
            resultCode.append(template.render());
        }
        
        return resultCode.toString();
    }
    
    private String processStringConstants()
    {
        StringBuilder resultCode = new StringBuilder();
        String templateString =
            "<memory_register> = constant [<length> x i8] c\"<value>\\00\"\n";
        
        for (Map.Entry<String, String> stringConstant : this._symbolTable.getStringConstants().entrySet())
        {
            String value = stringConstant.getValue();
            
            ST template = new ST(templateString);
            template.add("memory_register", stringConstant.getKey());
            template.add("length", Integer.toString(value.length() + 1));
            template.add("value", value);
            
            resultCode.append(template.render());
        }
        
        return resultCode.toString();
    }
    
    private String processGlobalVariableInitializers()
    {
        StringBuilder resultCode = new StringBuilder();
        String templateString = 
            "<value_code>" +
            "store <data_type> <value_register>, <data_type>* <variable_register>\n";
        
        for (Map.Entry<String, ExpressionCodeFragment> globalVariableInitializer : this._symbolTable.getGlobalVariableInitializers().entrySet())
        {
            ExpressionCodeFragment expressionCodeFragment = globalVariableInitializer.getValue();
            
            ST template = new ST(templateString);
            template.add("value_code", expressionCodeFragment.toString());
            template.add("value_register", expressionCodeFragment.getValueRegister());
            template.add("data_type", expressionCodeFragment.getDataType().getOutputType());
            template.add("variable_register", globalVariableInitializer.getKey());
            
            resultCode.append(template.render());
        }
        
        return resultCode.toString();
    }
    
    @Override
    public CodeFragment visitModule(PascriptParser.ModuleContext ctx)
    {
        this.visit(ctx.externalSection());
        CodeFragment globalVariablesCodeFragment = this.visit(ctx.variableSection());
        CodeFragment localFunctionsCodeFragment = this.visit(ctx.functionSection());
        CodeFragment mainCodeFragment = this.visit(ctx.mainSection());
        
        ST template = new ST(
            "<external_functions_code>\n" +
            "<global_variables_code>\n" +
            "<string_constants_code>\n" +
            "<local_functions_code>\n" +
            "define i32 @main() {\n" +
            "<global_variable_initializers_code>" +
            "<main_body_code>" +
            "ret i32 0\n" +
            "}"
        );
        
        template.add("external_functions_code", this.processExternalFunctions());
        template.add("global_variables_code", globalVariablesCodeFragment.toString());
        template.add("string_constants_code", this.processStringConstants());
        template.add("local_functions_code", localFunctionsCodeFragment.toString());
        template.add("global_variable_initializers_code", this.processGlobalVariableInitializers());
        template.add("main_body_code", mainCodeFragment.toString());
        
        return new CodeFragment(template.render());
    }
    
    @Override
    public CodeFragment visitExternalSection(PascriptParser.ExternalSectionContext ctx)
    {
        for (PascriptParser.ExternalFunctionDeclarationContext functionDeclarationCtx : ctx.externalFunctionDeclaration())
        {
            String functionName = functionDeclarationCtx.functionName.getText();
            DataType returnDataType = this._dataTypeVisitor.visit(functionDeclarationCtx.returnDataType());
            ArrayList<DataType> parameterDataTypes = new ArrayList<>();
            
            PascriptParser.ParameterListContext parameterListCtx = functionDeclarationCtx.parameterList();
            if (parameterListCtx != null)
            {
                for (PascriptParser.DataTypeContext dataTypeContext : parameterListCtx.dataType())
                {
                    parameterDataTypes.add(this._dataTypeVisitor.visit(dataTypeContext));
                }
            }
            
            FunctionRecord functionRecord = this._symbolTable.addExternalFunction(functionName, returnDataType, parameterDataTypes);
            if (functionRecord == null)
            {
                Compiler.printCompilationError("A function with the same name already exists", functionDeclarationCtx.functionName);
                System.exit(-1);
            }
        }
        
        return new CodeFragment();
    }
    
    @Override
    public CodeFragment visitVariableSection(PascriptParser.VariableSectionContext ctx)
    {
        CodeFragment codeFragment = new CodeFragment();
        for (PascriptParser.GlobalVariableDeclarationContext globalVariableDeclarationCtx : ctx.globalVariableDeclaration())
        {
            codeFragment.addCode(this.visit(globalVariableDeclarationCtx).toString());
        }
        return codeFragment;
    }

    @Override
    public CodeFragment visitGlobalVariableDeclaration(PascriptParser.GlobalVariableDeclarationContext ctx)
    {
        ValueDataType valueDataType = (ValueDataType)this._dataTypeVisitor.visit(ctx.dataType());
        ExpressionCodeFragment expressionCodeFragment = this._expressionCodeVisitor.getDefaultExpression(valueDataType);
        
        VariableRecord variableRecord = this._symbolTable.addGlobalVariable(ctx.IDENTIFIER().getSymbol().getText(), valueDataType);
        if (variableRecord == null)
        {
            Compiler.printCompilationError("A global variable with the same name already exists", ctx.IDENTIFIER().getSymbol());
            System.exit(-1);
        }
        
        this._symbolTable.addGlobalVariableInitializer(variableRecord.getMemoryRegister(), expressionCodeFragment);
        
        ST template = new ST(
            "<memory_register> = global <data_type> <default_value>\n"
        );
        template.add("memory_register", variableRecord.getMemoryRegister());
        template.add("data_type", valueDataType.getOutputType());
        template.add("default_value", valueDataType.getDefaultOutputValue());
        return new CodeFragment(template.render());
    }

    private String processVariableDeallocation(ArrayList<VariableRecord> dynamicVariableRecords)
    {
        StringBuilder resultCode = new StringBuilder();
        String templateString =
            "<value_register> = load <data_type>* <memory_register>\n" +
            "<value_deallocation_code>";
        
        for (VariableRecord variableRecord : dynamicVariableRecords)
        {
            DynamicDataType dynamicDataType = (DynamicDataType)variableRecord.getDataType();
            String valueRegister = this._symbolTable.generateNewRegisterName();
            
            ST template = new ST(templateString);
            template.add("value_register", valueRegister);
            template.add("data_type", dynamicDataType.getOutputType());
            template.add("memory_register", variableRecord.getMemoryRegister());
            template.add("value_deallocation_code", dynamicDataType.generateDeallocationFunctionCall(valueRegister));
            
            resultCode.append(template.render());
        }
        
        return resultCode.toString();
    }
    
    private String processFunctionDefinition(FunctionRecord functionRecord, ArrayList<String> parameterNames, 
        PascriptParser.FunctionDeclarationContext functionDeclarationCtx, PascriptParser.FunctionDefinitionContext functionDefinitionCtx)
    {
        ST template = new ST(
            "define <return_data_type> <function_name>(<named_parameter_list_code>) {\n" +
            "<argument_to_variable_code>" +
            "<function_body_code>" +
            "<variable_deallocation_code>" +
            "<return_value_code>" +
            "ret <return_value>\n" +
            "}\n"
        );
        
        DataType returnDataType = functionRecord.getReturnDataType();
        ArrayList<DataType> parameterDataTypes = functionRecord.getParameterDataTypes();
        
        this._symbolTable.enterFunction(returnDataType, false);

        StringBuilder namedParameterListCode = new StringBuilder();
        
        StringBuilder argumentToVariableCode = new StringBuilder();
        String argumentToVariableTemplateString =
            "<memory_register> = alloca <data_type>\n" +
            "<copy_allocation_code>" +
            "store <data_type> <value_register>, <data_type>* <memory_register>\n";

        for (int i = 0; i < parameterDataTypes.size(); i++)
        {
            DataType parameterDataType = parameterDataTypes.get(i);
            String parameterRegister = this._symbolTable.generateNewRegisterName();
            
            VariableRecord parameterVariableRecord = this._symbolTable.addLocalVariable(parameterNames.get(i), parameterDataType);
            if (parameterVariableRecord == null)
            {
                Token identifierToken = functionDeclarationCtx.namedParameterList().IDENTIFIER(i).getSymbol();
                Compiler.printCompilationError("A parameter with the same name already exists", identifierToken);
                System.exit(-1);
            }
            
            if (i > 0)
            {
                namedParameterListCode.append(", ");
            }
            namedParameterListCode.append(parameterDataType.getOutputType()).append(" ").append(parameterRegister);

            ST argumentToVariableTemplate = new ST(argumentToVariableTemplateString);
            argumentToVariableTemplate.add("memory_register", parameterVariableRecord.getMemoryRegister());
            argumentToVariableTemplate.add("data_type", parameterDataType.getOutputType());

            if (parameterDataType instanceof DynamicDataType)
            {
                String valueRegister = this._symbolTable.generateNewRegisterName();
                argumentToVariableTemplate.add("copy_allocation_code",
                    ((DynamicDataType)parameterDataType).generateCopyFunctionCall(valueRegister, parameterRegister)
                );
                argumentToVariableTemplate.add("value_register", valueRegister);
            }
            else
            {
                argumentToVariableTemplate.add("copy_allocation_code", "");
                argumentToVariableTemplate.add("value_register", parameterRegister);
            }

            argumentToVariableCode.append(argumentToVariableTemplate.render());
        }
        
        template.add("return_data_type", returnDataType.getOutputType());
        template.add("function_name", functionRecord.getOutputFunctionName());
        template.add("named_parameter_list_code", namedParameterListCode.toString());
        
        template.add("argument_to_variable_code", argumentToVariableCode.toString());
        template.add("function_body_code", this.visit(functionDefinitionCtx.blockStatement()));
        template.add("variable_deallocation_code", 
            this.processVariableDeallocation(this._symbolTable.getLocalDynamicVariableRecords()));

        if (returnDataType.equals(new VoidDataType()))
        {
            template.add("return_value_code", "");
            template.add("return_value", returnDataType.getOutputType());
        }
        else
        {
            ExpressionCodeFragment expressionCodeFragment = this._expressionCodeVisitor.getDefaultExpression((ValueDataType)returnDataType);
            template.add("return_value_code", expressionCodeFragment.toString());
            template.add("return_value", returnDataType.getOutputType() + " " + expressionCodeFragment.getValueRegister());
        }
        return template.render();
    }
    
    @Override
    public CodeFragment visitFunctionSection(PascriptParser.FunctionSectionContext ctx)
    {
        ArrayList<FunctionRecord> functionRecords = new ArrayList<>();
        ArrayList<ArrayList<String>> functionsParameterNames = new ArrayList<>();
        
        for (PascriptParser.FunctionDeclarationContext functionDeclarationCtx : ctx.functionDeclaration())
        {
            String functionName = functionDeclarationCtx.functionName.getText();
            DataType returnDataType = this._dataTypeVisitor.visit(functionDeclarationCtx.returnDataType());
            ArrayList<DataType> parameterDataTypes = new ArrayList<>();
            ArrayList<String> parameterNames = new ArrayList<>();

            PascriptParser.NamedParameterListContext namedParameterListCtx = functionDeclarationCtx.namedParameterList();
            if (namedParameterListCtx != null)
            {
                int parameterCount = namedParameterListCtx.dataType().size();
                for (int i = 0; i < parameterCount; i++)
                {
                    parameterDataTypes.add(this._dataTypeVisitor.visit(namedParameterListCtx.dataType(i)));
                    parameterNames.add(namedParameterListCtx.IDENTIFIER(i).toString());
                }
            }
            
            FunctionRecord functionRecord = this._symbolTable.addLocalFunction(functionName, returnDataType, parameterDataTypes);
            if (functionRecord == null)
            {
                Compiler.printCompilationError("A function with the same name already exists", functionDeclarationCtx.functionName);
                System.exit(-1);
            }
           
            functionRecords.add(functionRecord);
            functionsParameterNames.add(parameterNames);
        }
        
        CodeFragment codeFragment = new CodeFragment();
        for (int i = 0; i < functionRecords.size(); i++)
        {
            codeFragment.addCode(this.processFunctionDefinition(
                functionRecords.get(i), functionsParameterNames.get(i),
                ctx.functionDeclaration(i), ctx.functionDefinition(i)
            ));
        }
        return codeFragment;
    }

    @Override
    public CodeFragment visitMainSection(PascriptParser.MainSectionContext ctx)
    {
        this._symbolTable.enterFunction(new IntegerDataType(), true);
        
        CodeFragment codeFragment = new CodeFragment();
        for (PascriptParser.StatementContext statement : ctx.statement())
        {
            codeFragment.addCode(this.visit(statement).toString());
        }
        codeFragment.addCode(this.processVariableDeallocation(this._symbolTable.getLocalDynamicVariableRecords()));
        codeFragment.addCode(this.processVariableDeallocation(this._symbolTable.getGlobalDynamicVariableRecords()));
        
        return codeFragment;
    }

    @Override
    public CodeFragment visitBlockStatement(PascriptParser.BlockStatementContext ctx)
    {
        this._symbolTable.enterBlock();
        
        CodeFragment codeFragment = new CodeFragment();
        for (PascriptParser.StatementContext statement : ctx.statement())
        {
            codeFragment.addCode(this.visit(statement).toString());
        }
        codeFragment.addCode(this.processVariableDeallocation(this._symbolTable.getBlockDynamicVariableRecords()));
        
        this._symbolTable.exitBlock();
        return codeFragment;
    }

    @Override
    public CodeFragment visitIfStatement(PascriptParser.IfStatementContext ctx)
    {
        String templateCommonPrefix = 
            "<condition_code>" +
            "<break_register> = trunc <boolean_data_type> <condition_register> to i1\n" +
            "br i1 <break_register>, label %<true_label>, label %<false_label>\n" +
            "<true_label>:\n" +
            "<statement_true_code>" +
            "br label %<end_label>\n";
        String templateElseBody =
            "<false_label>:\n" +
            "<statement_false_code>" +
            "br label %<end_label>\n";
        String templateCommonSuffix = 
            "<end_label>:\n";
        
        BooleanDataType booleanDataType = new BooleanDataType();
        ExpressionCodeFragment conditionCodeFragment = this._expressionCodeVisitor.visit(ctx.condition);
        if (!conditionCodeFragment.getDataType().equals(booleanDataType))
        {
            Compiler.printCompilationError("The condition expression must evaluate to a boolean data type", ctx.condition.getStart());
            System.exit(-1);
        }
        
        ST template;
        if (ctx.falseStatement == null)
        {
            template = new ST(templateCommonPrefix + templateCommonSuffix);
            
            String endLabel = this._symbolTable.generateNewLabelName();
            template.add("false_label", endLabel);
            template.add("end_label", endLabel);
        }
        else
        {
            template = new ST(templateCommonPrefix + templateElseBody + templateCommonSuffix);

            template.add("statement_false_code", this.visit(ctx.falseStatement).toString());
            template.add("false_label", this._symbolTable.generateNewLabelName());
            template.add("end_label", this._symbolTable.generateNewLabelName());
        }
        
        template.add("break_register", this._symbolTable.generateNewRegisterName());
        template.add("boolean_data_type", booleanDataType.getOutputType());
        template.add("condition_code", conditionCodeFragment.toString());
        template.add("condition_register", conditionCodeFragment.getValueRegister());
        template.add("true_label", this._symbolTable.generateNewLabelName());
        template.add("statement_true_code", this.visit(ctx.trueStatement).toString());
        
        return new CodeFragment(template.render());
    }

    @Override
    public CodeFragment visitWhileLoop(PascriptParser.WhileLoopContext ctx)
    {
        ST template = new ST(
            "br label %<condition_label>\n" +
            "<condition_label>:\n" +
            "<condition_code>" +
            "<break_register> = trunc <boolean_data_type> <condition_register> to i1\n" +
            "br i1 <break_register>, label %<body_label>, label %<end_label>\n" +
            "<body_label>:\n" +
            "<body_code>" +
            "br label %<condition_label>\n" +
            "<end_label>:\n"
        );
        
        BooleanDataType booleanDataType = new BooleanDataType();
        ExpressionCodeFragment conditionCodeFragment = this._expressionCodeVisitor.visit(ctx.condition);
        if (!conditionCodeFragment.getDataType().equals(booleanDataType))
        {
            Compiler.printCompilationError("The condition expression must evaluate to a boolean data type", ctx.condition.getStart());
            System.exit(-1);
        }
        
        template.add("condition_label", this._symbolTable.generateNewLabelName());
        template.add("break_register", this._symbolTable.generateNewRegisterName());
        template.add("boolean_data_type", booleanDataType.getOutputType());
        template.add("condition_code", conditionCodeFragment.toString());
        template.add("condition_register", conditionCodeFragment.getValueRegister());
        template.add("body_label", this._symbolTable.generateNewLabelName());
        template.add("body_code", this.visit(ctx.statement()).toString());
        template.add("end_label", this._symbolTable.generateNewLabelName());
                
        return new CodeFragment(template.render());
    }

    @Override
    public CodeFragment visitDoWhileLoop(PascriptParser.DoWhileLoopContext ctx)
    {
        ST template = new ST(
            "br label %<body_label>\n" +
            "<body_label>:\n" +
            "<body_code>" +
            "br label %<condition_label>\n" +
            "<condition_label>:\n" +
            "<condition_code>" +
            "<break_register> = trunc <boolean_data_type> <condition_register> to i1\n" +
            "br i1 <break_register>, label %<body_label>, label %<end_label>\n" +
            "<end_label>:\n"
        );
        
        BooleanDataType booleanDataType = new BooleanDataType();
        ExpressionCodeFragment conditionCodeFragment = this._expressionCodeVisitor.visit(ctx.condition);
        if (!conditionCodeFragment.getDataType().equals(booleanDataType))
        {
            Compiler.printCompilationError("The condition expression must evaluate to a boolean data type", ctx.condition.getStart());
            System.exit(-1);
        }
        
        template.add("condition_label", this._symbolTable.generateNewLabelName());
        template.add("break_register", this._symbolTable.generateNewRegisterName());
        template.add("boolean_data_type", booleanDataType.getOutputType());
        template.add("condition_code", conditionCodeFragment.toString());
        template.add("condition_register", conditionCodeFragment.getValueRegister());
        template.add("body_label", this._symbolTable.generateNewLabelName());
        template.add("body_code", this.visit(ctx.statement()).toString());
        template.add("end_label", this._symbolTable.generateNewLabelName());
                
        return new CodeFragment(template.render());
    }

    @Override
    public CodeFragment visitForLoop(PascriptParser.ForLoopContext ctx)
    {
        ST template = new ST(
            "<initializer_code>" +
            "br label %<condition_label>\n" +
            "<condition_label>:\n" +
            "<condition_code>" +
            "<break_register> = trunc <boolean_data_type> <condition_register> to i1\n" +
            "br i1 <break_register>, label %<body_label>, label %<end_label>\n" +
            "<body_label>:\n" +
            "<body_code>" +
            "<step_code>" +
            "<step_value_deallocation_code>" +
            "br label %<condition_label>\n" +
            "<end_label>:\n"
        );
        
        this._symbolTable.enterBlock();
        
        CodeFragment initializerCodeFragment = this.visit(ctx.initializer);
        
        BooleanDataType booleanDataType = new BooleanDataType();
        ExpressionCodeFragment conditionCodeFragment = this._expressionCodeVisitor.visit(ctx.condition);
        if (!conditionCodeFragment.getDataType().equals(booleanDataType))
        {
            Compiler.printCompilationError("The condition expression must evaluate to a boolean data type", ctx.condition.getStart());
            System.exit(-1);
        }
        
        ExpressionCodeFragment stepCodeFragment = this._expressionCodeVisitor.visit(ctx.step);
        
        template.add("initializer_code", initializerCodeFragment.toString());
        template.add("condition_label", this._symbolTable.generateNewLabelName());
        template.add("condition_code", conditionCodeFragment.toString());
        template.add("break_register", this._symbolTable.generateNewRegisterName());
        template.add("boolean_data_type", booleanDataType.getOutputType());
        template.add("condition_register", conditionCodeFragment.getValueRegister());
        template.add("body_label", this._symbolTable.generateNewLabelName());
        template.add("body_code", this.visit(ctx.statement()).toString());
        template.add("step_code", stepCodeFragment.toString());
        template.add("end_label", this._symbolTable.generateNewLabelName());
        
        DataType stepDataType = stepCodeFragment.getDataType();
        if (stepDataType instanceof DynamicDataType)
        {
            template.add("step_value_deallocation_code",
                ((DynamicDataType)stepDataType).generateDeallocationFunctionCall(stepCodeFragment.getValueRegister())
            );
        }
        else
        {
            template.add("step_value_deallocation_code", "");
        }
        
        this._symbolTable.exitBlock();
                
        return new CodeFragment(template.render());
    }
    
    @Override
    public CodeFragment visitSimpleStatement(PascriptParser.SimpleStatementContext ctx)
    {
        return this.visit(ctx.basicStatement());
    }
    
    private CodeFragment processVariableDeclaration(Token nameToken, ValueDataType dataType, ExpressionCodeFragment expressionCodeFragment)
    {
        VariableRecord variableRecord = this._symbolTable.addLocalVariable(nameToken.getText(), dataType);
        if (variableRecord == null)
        {
            Compiler.printCompilationError("A local variable with the same name already exists in the current block", nameToken);
            System.exit(-1);
        }
        
        ST template = new ST(
            "<value_code>" +
            "<memory_register> = alloca <data_type>\n" +
            "store <data_type> <value_register>, <data_type>* <memory_register>\n"
        );
        template.add("value_code", expressionCodeFragment.toString());
        template.add("memory_register", variableRecord.getMemoryRegister());
        template.add("data_type", dataType.getOutputType());
        template.add("value_register", expressionCodeFragment.getValueRegister());
        return new CodeFragment(template.render());
    }

    @Override
    public CodeFragment visitSimpleDeclaration(PascriptParser.SimpleDeclarationContext ctx)
    {
        ValueDataType variableDataType = (ValueDataType)this._dataTypeVisitor.visit(ctx.dataType());
        ExpressionCodeFragment expressionCodeFragment = this._expressionCodeVisitor.getDefaultExpression(variableDataType);                
        return this.processVariableDeclaration(ctx.IDENTIFIER().getSymbol(), variableDataType, expressionCodeFragment);
    }

    @Override
    public CodeFragment visitAssignDeclaration(PascriptParser.AssignDeclarationContext ctx)
    {
        ValueDataType variableDataType = (ValueDataType)this._dataTypeVisitor.visit(ctx.dataType());
        ExpressionCodeFragment expressionCodeFragment = this._expressionCodeVisitor.visit(ctx.expression());
        if (!variableDataType.equals(expressionCodeFragment.getDataType()))
        {
            Compiler.printCompilationError("Attempting to assign an expression that evaluates to a non-matching data type", ctx.expression().getStart());
            System.exit(-1);
        }
                
        return this.processVariableDeclaration(ctx.IDENTIFIER().getSymbol(), variableDataType, expressionCodeFragment);
    }

    @Override
    public CodeFragment visitPrintStatement(PascriptParser.PrintStatementContext ctx)
    {
        ExpressionCodeFragment expressionCodeFragment = this._expressionCodeVisitor.visit(ctx.expression());
        DataType dataType = expressionCodeFragment.getDataType();
        if (!(dataType instanceof PrimitiveDataType))
        {
            Compiler.printCompilationError("Can only print an expression that evaluates to a primitive data type", ctx.expression().getStart());
            System.exit(-1);
        }
        PrimitiveDataType primitiveDataType = (PrimitiveDataType)dataType;
        
        ST template = new ST(
            "<value_code>" + 
            "call void <function_name>(<data_type> <value_register>)\n" +
            "<value_deallocation_code>"
        );
        
        String valueRegister = expressionCodeFragment.getValueRegister();
        template.add("value_code", expressionCodeFragment.toString());
        template.add("value_register", valueRegister);
        template.add("function_name", primitiveDataType.getOutputPrintFunctionName());
        template.add("data_type", dataType.getOutputType());
        
        if (dataType instanceof DynamicDataType)
        {
            template.add("value_deallocation_code", 
                ((DynamicDataType)dataType).generateDeallocationFunctionCall(valueRegister)
            );
        }
        else
        {
            template.add("value_deallocation_code", "");
        }
        
        return new CodeFragment(template.render());
    }

    @Override
    public CodeFragment visitReadStatement(PascriptParser.ReadStatementContext ctx)
    {
        VariableRecord variableRecord = this._symbolTable.getVariableRecord(ctx.IDENTIFIER().getText());
        if (variableRecord == null)
        {
            Compiler.printCompilationError("A variable with this name does not exist", ctx.IDENTIFIER().getSymbol());
            System.exit(-1);
        }
        
        DataType dataType = variableRecord.getDataType();
        if (!(dataType instanceof PrimitiveDataType))
        {
            Compiler.printCompilationError("Can only read to a variable with a primitive data type", ctx.IDENTIFIER().getSymbol());
            System.exit(-1);
        }
        PrimitiveDataType primitiveDataType = (PrimitiveDataType)dataType;
        
        ST template = new ST(
            "<value_deallocation_code>" +
            "<value_register> = call <data_type> <function_name>()\n" +
            "store <data_type> <value_register>, <data_type>* <memory_register>\n"
        );
        template.add("value_register", this._symbolTable.generateNewRegisterName());
        template.add("data_type", dataType.getOutputType());
        template.add("function_name", primitiveDataType.getOutputReadFunctionName());
        template.add("memory_register", variableRecord.getMemoryRegister());
        
        if (dataType instanceof DynamicDataType)
        {
            ST valueDeallocationtemplate = new ST(
                "<value_register> = load <data_type>* <memory_register>\n" +
                "<value_deallocation_call>"
            );
            String valueRegister = this._symbolTable.generateNewRegisterName();
            valueDeallocationtemplate.add("value_register", valueRegister);
            valueDeallocationtemplate.add("data_type", dataType.getOutputType());
            valueDeallocationtemplate.add("memory_register", variableRecord.getMemoryRegister());
            valueDeallocationtemplate.add("value_deallocation_call", 
                ((DynamicDataType)dataType).generateDeallocationFunctionCall(valueRegister)
            );
            
            template.add("value_deallocation_code", valueDeallocationtemplate.render());
        }
        else
        {
            template.add("value_deallocation_code", "");
        }
        
        return new CodeFragment(template.render());
    }

    @Override
    public CodeFragment visitReturnValueStatement(PascriptParser.ReturnValueStatementContext ctx)
    {
        ExpressionCodeFragment expressionCodeFragment = this._expressionCodeVisitor.visit(ctx.expression());
        DataType functionReturnDataType = this._symbolTable.getCurrentFunctionReturnDataType();
        
        if (!functionReturnDataType.equals(expressionCodeFragment.getDataType()))
        {
            Compiler.printCompilationError("Returned expression evaluates to a data type"
                + " that doesn't match the function's return data type", ctx.expression().getStart());
            System.exit(-1);
        }
        
        ST template = new ST(
            "<value_code>" +
            "<variable_deallocation_code>" +
            "ret <data_type> <value_register>\n"
        );
        template.add("value_code", expressionCodeFragment.toString());
        template.add("data_type", functionReturnDataType.getOutputType());
        template.add("value_register", expressionCodeFragment.getValueRegister());
        
        StringBuilder variableDeallocationCode = new StringBuilder(
            this.processVariableDeallocation(this._symbolTable.getLocalDynamicVariableRecords())
        );
        if (this._symbolTable.isCurrentFunctionMain())
        {
            variableDeallocationCode.append(
                this.processVariableDeallocation(this._symbolTable.getGlobalDynamicVariableRecords())
            );
        }
        template.add("variable_deallocation_code", variableDeallocationCode.toString());
        
        return new CodeFragment(template.render());
    }

    @Override
    public CodeFragment visitReturnVoidStatement(PascriptParser.ReturnVoidStatementContext ctx)
    {
        VoidDataType voidDataType = new VoidDataType();
        if (!voidDataType.equals(this._symbolTable.getCurrentFunctionReturnDataType()))
        {
            Compiler.printCompilationError("The function has a non-void return data type", ctx.getStart());
            System.exit(-1);
        }
        
        ST template = new ST(
            "<variable_deallocation_code>" +
            "ret <data_type>\n"
        );
        template.add("data_type", voidDataType.getOutputType());
        
        StringBuilder variableDeallocationCode = new StringBuilder(
            this.processVariableDeallocation(this._symbolTable.getLocalDynamicVariableRecords())
        );
        if (this._symbolTable.isCurrentFunctionMain())
        {
            variableDeallocationCode.append(
                this.processVariableDeallocation(this._symbolTable.getGlobalDynamicVariableRecords())
            );
        }
        template.add("variable_deallocation_code", variableDeallocationCode.toString());
        
        return new CodeFragment(template.render());
    }

    @Override
    public CodeFragment visitExpressionStatement(PascriptParser.ExpressionStatementContext ctx)
    {
        ExpressionCodeFragment expressionCodeFragment = this._expressionCodeVisitor.visit(ctx.expression());
        
        ST template = new ST(
            "<value_code>" +
            "<value_deallocation_code>"
        );
        template.add("value_code", expressionCodeFragment.toString());
        
        DataType dataType = expressionCodeFragment.getDataType();        
        if (dataType instanceof DynamicDataType)
        {
            template.add("value_deallocation_code",
                ((DynamicDataType)dataType).generateDeallocationFunctionCall(expressionCodeFragment.getValueRegister())
            );
        }
        else
        {
            template.add("value_deallocation_code", "");
        }
        
        return new CodeFragment(template.render());
    }
}