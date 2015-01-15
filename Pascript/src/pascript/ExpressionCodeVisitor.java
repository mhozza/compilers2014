package pascript;

import java.util.Arrays;
import java.util.ArrayList;
import org.antlr.v4.runtime.Token;
import org.stringtemplate.v4.ST;
import pascript.grammar.PascriptParser;
import pascript.grammar.PascriptBaseVisitor;
import pascript.SymbolTable.*;
import pascript.DataTypeVisitor.*;
import pascript.ExpressionCodeVisitor.ExpressionCodeFragment;

/**
 *
 * @author Osama Hassanein
 */
public class ExpressionCodeVisitor extends PascriptBaseVisitor<ExpressionCodeVisitor.ExpressionCodeFragment>
{
    public static class ExpressionCodeFragment extends CodeVisitor.CodeFragment
    {
        protected String _valueRegister;
        protected DataType _dataType;
        
        public ExpressionCodeFragment()
        {
            super();
        }

        public ExpressionCodeFragment(String codeString)
        {
            super();
            this._code.append(codeString);
        }

        public String getValueRegister()
        {
            return this._valueRegister;
        }

        public ExpressionCodeFragment setRegister(String valueRegister)
        {
            this._valueRegister = valueRegister;
            return this;
        }

        public DataType getDataType()
        {
            return this._dataType;
        }

        public ExpressionCodeFragment setDataType(DataType dataType)
        {
            this._dataType = dataType;
            return this;
        }
    }
    
    private static final VoidDataType voidDataType = new VoidDataType();
    private static final BooleanDataType booleanDataType = new BooleanDataType();
    private static final IntegerDataType integerDataType = new IntegerDataType();
    private static final FloatDataType floatDataType = new FloatDataType();
    private static final StringDataType stringDataType = new StringDataType();
    
    private final SymbolTable _symbolTable;
    
    public ExpressionCodeVisitor(SymbolTable symbolTable)
    {
        this._symbolTable = symbolTable;
    }
    
    public ExpressionCodeFragment getDefaultExpression(ValueDataType valueDataType)
    {
        ExpressionCodeFragment expressionCodeFragment = new ExpressionCodeFragment();
        String valueRegister = this._symbolTable.generateNewRegisterName();
        
        if (valueDataType instanceof BooleanDataType)
        {
            ST template = new ST(
                "<value_register> = zext i1 false to i8\n"
            );
            template.add("value_register", valueRegister);
            expressionCodeFragment.addCode(template.render());
        }
        else if (valueDataType instanceof IntegerDataType)
        {
            ST template = new ST(
                "<value_register> = add i32 0, 0\n"
            );
            template.add("value_register", valueRegister);
            expressionCodeFragment.addCode(template.render());
        }
        else if (valueDataType instanceof FloatDataType)
        {
            ST template = new ST(
                "<value_register> = fadd double 0., 0.\n"
            );
            template.add("value_register", valueRegister);
            expressionCodeFragment.addCode(template.render());
        }
        else if (valueDataType instanceof DynamicDataType)
        {
            expressionCodeFragment.addCode(((DynamicDataType)valueDataType).generateAllocationFunctionCall(valueRegister));
        }
        
        return expressionCodeFragment.setDataType(valueDataType).setRegister(valueRegister);
    }
    
    private ST processBooleanUnaryOperator(ExpressionCodeFragment resultCodeFragment, int operatorId)
    {
        String ouputDataType = booleanDataType.getOutputType();
        switch (operatorId)
        {
            case PascriptParser.NOT:
            {
                resultCodeFragment.setDataType(booleanDataType);
                ST template = new ST(
                    "<register_1> = icmp eq <data_type> 0, <operand_register>\n" +
                    "<value_register> = zext i1 <register_1> to <data_type>\n"
                );
                template.add("register_1", this._symbolTable.generateNewRegisterName());
                return template.add("data_type", ouputDataType);
            }
        }
        return null;
    }
    
    private ST processIntegerUnaryOperator(ExpressionCodeFragment resultCodeFragment, int operatorId)
    {
        String ouputDataType = integerDataType.getOutputType();
        switch (operatorId)
        {
            case PascriptParser.SUBTRACT:
            {
                resultCodeFragment.setDataType(integerDataType);
                ST template = new ST(
                    "<value_register> = sub <data_type> 0, <operand_register>\n"
                );
                return template.add("data_type", ouputDataType);
            }
        }
        return null;
    }
    
    private ST processFloatUnaryOperator(ExpressionCodeFragment resultCodeFragment, int operatorId)
    {
        String ouputDataType = floatDataType.getOutputType();
        switch (operatorId)
        {
            case PascriptParser.SUBTRACT:
            {
                resultCodeFragment.setDataType(floatDataType);
                ST template = new ST(
                    "<value_register> = fsub <data_type> 0., <operand_register>\n"
                );
                return template.add("data_type", ouputDataType);
            }
        }
        return null;
    }
    
    @Override
    public ExpressionCodeFragment visitUnaryOperation(PascriptParser.UnaryOperationContext ctx)
    {
        ExpressionCodeFragment operandCodeFragment = this.visit(ctx.expression());
        DataType dataType = operandCodeFragment.getDataType();
        
        ExpressionCodeFragment resultCodeFragment = new ExpressionCodeFragment(operandCodeFragment.toString());
        
        ST template = null;
        int operatorId = ctx.operator.getType();
        if (dataType instanceof BooleanDataType)
        {
            template = this.processBooleanUnaryOperator(resultCodeFragment, operatorId);
        }
        else if (dataType instanceof IntegerDataType)
        {
            template = this.processIntegerUnaryOperator(resultCodeFragment, operatorId);
        }
        else if (dataType instanceof FloatDataType)
        {
            template = this.processFloatUnaryOperator(resultCodeFragment, operatorId);
        }
        
        if (template == null)
        {
            Compiler.printCompilationError("Cannot apply this unary operation to an operand"
                + " of the given data type", ctx.expression().getStart());
            System.exit(-1);
        }
        
        String valueRegister = this._symbolTable.generateNewRegisterName();
        String operandRegister = operandCodeFragment.getValueRegister();
        template.add("operand_register", operandRegister);
        template.add("value_register", valueRegister);
        resultCodeFragment.addCode(template.render());
        
        if (dataType instanceof DynamicDataType)
        {
            resultCodeFragment.addCode(((DynamicDataType)dataType).generateDeallocationFunctionCall(operandRegister));
        }
        
        return resultCodeFragment.setRegister(valueRegister);
    }
    
    private ST processBooleanBinaryOperator(ExpressionCodeFragment resultCodeFragment, int operatorId)
    {
        String ouputDataType = booleanDataType.getOutputType();
        resultCodeFragment.setDataType(booleanDataType);
        
        if (Arrays.asList(PascriptParser.AND, PascriptParser.OR, PascriptParser.XOR).indexOf(operatorId) != -1)
        {
            ST template = new ST(
                "<register_1> = trunc <data_type> <operand_a_register> to i1\n" +
                "<register_2> = trunc <data_type> <operand_b_register> to i1\n" +
                "<register_3> = <instruction> i1 <register_1>, <register_2>\n" +
                "<value_register> = zext i1 <register_3> to <data_type>\n"
            );
            
            switch (operatorId)
            {
                case PascriptParser.AND:
                    template.add("instruction", "and");
                    break;
                case PascriptParser.OR:
                    template.add("instruction", "or");
                    break;
                case PascriptParser.XOR:
                    template.add("instruction", "xor");
                    break;
            }
            
            template.add("register_1", this._symbolTable.generateNewRegisterName());
            template.add("register_2", this._symbolTable.generateNewRegisterName());
            template.add("register_3", this._symbolTable.generateNewRegisterName());
            return template.add("data_type", ouputDataType);
        }
        else if (Arrays.asList(PascriptParser.EQUAL, PascriptParser.NOT_EQUAL).indexOf(operatorId) != -1)
        {
            ST template = new ST(
                "<register_1> = icmp <comparison_type> <data_type> <operand_a_register>, <operand_b_register>\n" +
                "<value_register> = zext i1 <register_1> to <data_type>\n"
            );
            
            switch (operatorId)
            {
                case PascriptParser.EQUAL:
                    template.add("comparison_type", "eq");
                    break;
                case PascriptParser.NOT_EQUAL:
                    template.add("comparison_type", "ne");
                    break;
            }
            
            template.add("register_1", this._symbolTable.generateNewRegisterName());
            return template.add("data_type", ouputDataType);
        }
        return null;
    }
    
    private ST processIntegerBinaryOperator(ExpressionCodeFragment resultCodeFragment, int operatorId)
    {
        String ouputDataType = integerDataType.getOutputType();
        
        if (Arrays.asList(PascriptParser.MULTIPLY, PascriptParser.DIVIDE, PascriptParser.MODULO,
            PascriptParser.ADD, PascriptParser.SUBTRACT).indexOf(operatorId) != -1)
        {
            resultCodeFragment.setDataType(integerDataType);
            ST template = new ST(
                "<value_register> = <instruction> <data_type> <operand_a_register>, <operand_b_register>\n"
            );
            
            switch (operatorId)
            {
                case PascriptParser.MULTIPLY:
                    template.add("instruction", "mul");
                    break;
                case PascriptParser.DIVIDE:
                    template.add("instruction", "sdiv");
                    break;
                case PascriptParser.MODULO:
                    template.add("instruction", "srem");
                    break;
                case PascriptParser.ADD:
                    template.add("instruction", "add");
                    break;
                case PascriptParser.SUBTRACT:
                    template.add("instruction", "sub");
                    break;
            }
            
            return template.add("data_type", integerDataType.getOutputType());
        }
        else if (Arrays.asList(PascriptParser.LESS, PascriptParser.GREATER, PascriptParser.LESS_OR_EQUAL,
            PascriptParser.GREATER_OR_EQUAL, PascriptParser.EQUAL, PascriptParser.NOT_EQUAL).indexOf(operatorId) != -1)
        {
            resultCodeFragment.setDataType(booleanDataType);
            ST template = new ST(
                "<register_1> = icmp <comparison_type> <data_type> <operand_a_register>, <operand_b_register>\n" +
                "<value_register> = zext i1 <register_1> to <boolean_data_type>\n"
            );
            
            switch (operatorId)
            {
                case PascriptParser.LESS:
                    template.add("comparison_type", "slt");
                    break;
                case PascriptParser.GREATER:
                    template.add("comparison_type", "sgt");
                    break;
                case PascriptParser.LESS_OR_EQUAL:
                    template.add("comparison_type", "sle");
                    break;
                case PascriptParser.GREATER_OR_EQUAL:
                    template.add("comparison_type", "sge");
                    break;
                case PascriptParser.EQUAL:
                    template.add("comparison_type", "eq");
                    break;
                case PascriptParser.NOT_EQUAL:
                    template.add("comparison_type", "ne");
                    break;
            }
            
            template.add("register_1", this._symbolTable.generateNewRegisterName());
            template.add("boolean_data_type", booleanDataType.getOutputType());
            return template.add("data_type", ouputDataType);
        }
        return null;
    }
    
    private ST processFloatBinaryOperator(ExpressionCodeFragment resultCodeFragment, int operatorId)
    {
        String ouputDataType = floatDataType.getOutputType();
        
        if (Arrays.asList(PascriptParser.MULTIPLY, PascriptParser.DIVIDE, PascriptParser.MODULO,
            PascriptParser.ADD, PascriptParser.SUBTRACT).indexOf(operatorId) != -1)
        {
            resultCodeFragment.setDataType(floatDataType);
            ST template = new ST(
                "<value_register> = <instruction> <data_type> <operand_a_register>, <operand_b_register>\n"
            );
            
            switch (operatorId)
            {
                case PascriptParser.MULTIPLY:
                    template.add("instruction", "fmul");
                    break;
                case PascriptParser.DIVIDE:
                    template.add("instruction", "fdiv");
                    break;
                case PascriptParser.MODULO:
                    template.add("instruction", "frem");
                    break;
                case PascriptParser.ADD:
                    template.add("instruction", "fadd");
                    break;
                case PascriptParser.SUBTRACT:
                    template.add("instruction", "fsub");
                    break;
            }
            
            return template.add("data_type", ouputDataType);
        }
        else if (Arrays.asList(PascriptParser.LESS, PascriptParser.GREATER, PascriptParser.LESS_OR_EQUAL,
            PascriptParser.GREATER_OR_EQUAL, PascriptParser.EQUAL, PascriptParser.NOT_EQUAL).indexOf(operatorId) != -1)
        {
            resultCodeFragment.setDataType(booleanDataType);
            ST template = new ST(
                "<register_1> = fcmp <comparison_type> <data_type> <operand_a_register>, <operand_b_register>\n" +
                "<value_register> = zext i1 <register_1> to <boolean_data_type>\n"
            );
            
            switch (operatorId)
            {
                case PascriptParser.LESS:
                    template.add("comparison_type", "ult");
                    break;
                case PascriptParser.GREATER:
                    template.add("comparison_type", "ugt");
                    break;
                case PascriptParser.LESS_OR_EQUAL:
                    template.add("comparison_type", "ule");
                    break;
                case PascriptParser.GREATER_OR_EQUAL:
                    template.add("comparison_type", "uge");
                    break;
                case PascriptParser.EQUAL:
                    template.add("comparison_type", "ueq");
                    break;
                case PascriptParser.NOT_EQUAL:
                    template.add("comparison_type", "une");
                    break;
            }
            
            template.add("register_1", this._symbolTable.generateNewRegisterName());
            template.add("boolean_data_type", booleanDataType.getOutputType());
            return template.add("data_type", ouputDataType);
        }
        return null;
    }
        
    private ST processStringBinaryOperator(ExpressionCodeFragment resultCodeFragment, int operatorId)
    {
        String ouputDataType = stringDataType.getOutputType();
        
        if (operatorId == PascriptParser.ADD)
        {
            resultCodeFragment.setDataType(stringDataType);
            ST template = new ST(
                "<value_register> = call <data_type> @__pascript__stringConcatenate" +
                    "(<data_type> <operand_a_register>, <data_type> <operand_b_register>)\n"
            );
            return template.add("data_type", ouputDataType);
        }
        else if (Arrays.asList(PascriptParser.LESS, PascriptParser.GREATER, PascriptParser.LESS_OR_EQUAL,
            PascriptParser.GREATER_OR_EQUAL, PascriptParser.EQUAL, PascriptParser.NOT_EQUAL).indexOf(operatorId) != -1)
        {
            resultCodeFragment.setDataType(booleanDataType);
            ST template = new ST(
                "<register_1> = call <integer_data_type> @__pascript__stringCompare" +
                    "(<data_type> <operand_a_register>, <data_type> <operand_b_register>)\n" +
                "<register_2> = icmp <comparison_type> <integer_data_type> <register_1>, 0\n" +
                "<value_register> = zext i1 <register_2> to <boolean_data_type>\n"
            );
            
            switch (operatorId)
            {
                case PascriptParser.LESS:
                    template.add("comparison_type", "slt");
                    break;
                case PascriptParser.GREATER:
                    template.add("comparison_type", "sgt");
                    break;
                case PascriptParser.LESS_OR_EQUAL:
                    template.add("comparison_type", "sle");
                    break;
                case PascriptParser.GREATER_OR_EQUAL:
                    template.add("comparison_type", "sge");
                    break;
                case PascriptParser.EQUAL:
                    template.add("comparison_type", "eq");
                    break;
                case PascriptParser.NOT_EQUAL:
                    template.add("comparison_type", "ne");
                    break;
            }
            
            template.add("register_1", this._symbolTable.generateNewRegisterName());
            template.add("register_2", this._symbolTable.generateNewRegisterName());
            template.add("boolean_data_type", booleanDataType.getOutputType());
            template.add("integer_data_type", (new IntegerDataType()).getOutputType());
            return template.add("data_type", ouputDataType);
        }
        return null;
    }
    
    private ST processArrayBinaryOperator(ExpressionCodeFragment resultCodeFragment, int operatorId, ArrayDataType operandDataType)
    {
        String ouputDataType = operandDataType.getOutputType();
        
        if (operatorId == PascriptParser.ADD)
        {
            resultCodeFragment.setDataType(operandDataType);
            ST template = new ST(
                "<value_register> = call <data_type> @__pascript__<primitive_data_type_name>ArrayMerge" +
                    "(<data_type> <operand_a_register>, <data_type> <operand_b_register>, <integer_data_type> <dimension_count>)\n"
            );
            template.add("primitive_data_type_name", operandDataType.getPrimitiveDataTypeName());
            template.add("integer_data_type", integerDataType.getOutputType());
            template.add("dimension_count", Integer.toString(operandDataType.getDimensionCount()));
            return template.add("data_type", ouputDataType);
        }
        else if (Arrays.asList(PascriptParser.EQUAL, PascriptParser.NOT_EQUAL).indexOf(operatorId) != -1)
        {
            resultCodeFragment.setDataType(booleanDataType);
            
            ST template = new ST(
                "<register_1> = call <boolean_data_type> @__pascript__<primitive_data_type_name>ArrayEquals" +
                    "(<data_type> <operand_a_register>, <data_type> <operand_b_register>, <integer_data_type> <dimension_count>)\n" +
                "<register_2> = icmp <comparison_type> <boolean_data_type> <register_1>, 0\n" +
                "<value_register> = zext i1 <register_2> to <boolean_data_type>\n"
            );
            
            switch (operatorId)
            {
                case PascriptParser.EQUAL:
                    template.add("comparison_type", "ne");
                    break;
                case PascriptParser.NOT_EQUAL:
                    template.add("comparison_type", "eq");
                    break;
            }
            
            template.add("register_1", this._symbolTable.generateNewRegisterName());
            template.add("register_2", this._symbolTable.generateNewRegisterName());
            template.add("boolean_data_type", booleanDataType.getOutputType());
            template.add("primitive_data_type_name", operandDataType.getPrimitiveDataTypeName());
            template.add("integer_data_type", integerDataType.getOutputType());
            template.add("dimension_count", Integer.toString(operandDataType.getDimensionCount()));
            return template.add("data_type", ouputDataType);
        }
        return null;
    }
    
    @Override
    public ExpressionCodeFragment visitBinaryOperation(PascriptParser.BinaryOperationContext ctx)
    {
        ExpressionCodeFragment operandACodeFragment = this.visit(ctx.expression(0));
        DataType dataType = operandACodeFragment.getDataType();
        ExpressionCodeFragment operandBCodeFragment = this.visit(ctx.expression(1));
        if (!dataType.equals(operandBCodeFragment.getDataType()))
        {
            Compiler.printCompilationError("Both operands of a binary operation must have"
                + " matching data types", ctx.expression(0).getStart());
            System.exit(-1);
        }
        
        ExpressionCodeFragment resultCodeFragment = new ExpressionCodeFragment();
        resultCodeFragment.addCode(operandACodeFragment.toString());
        resultCodeFragment.addCode(operandBCodeFragment.toString());
        
        ST template = null;
        int operatorId = ctx.operator.getType();
        if (dataType instanceof BooleanDataType)
        {
            template = this.processBooleanBinaryOperator(resultCodeFragment, operatorId);
        }
        else if (dataType instanceof IntegerDataType)
        {
            template = this.processIntegerBinaryOperator(resultCodeFragment, operatorId);
        }
        else if (dataType instanceof FloatDataType)
        {
            template = this.processFloatBinaryOperator(resultCodeFragment, operatorId);
        }
        else if (dataType instanceof StringDataType)
        {
            template = this.processStringBinaryOperator(resultCodeFragment, operatorId);
        }
        else if (dataType instanceof ArrayDataType)
        {
            template = this.processArrayBinaryOperator(resultCodeFragment, operatorId, (ArrayDataType)dataType);
        }
        
        if (template == null)
        {
            Compiler.printCompilationError("Cannot apply this binary operation to operands"
                + " of the given data type", ctx.expression(0).getStart());
            System.exit(-1);
        }
        
        String valueRegister = this._symbolTable.generateNewRegisterName();
        String operandARegister = operandACodeFragment.getValueRegister();
        String operandBRegister = operandBCodeFragment.getValueRegister();
        template.add("operand_a_register", operandARegister);
        template.add("operand_b_register", operandBRegister);
        template.add("value_register", valueRegister);
        resultCodeFragment.addCode(template.render());
        
        if (dataType instanceof DynamicDataType)
        {
            DynamicDataType dynamicDataType = (DynamicDataType)dataType;
            resultCodeFragment.addCode(dynamicDataType.generateDeallocationFunctionCall(operandARegister));
            resultCodeFragment.addCode(dynamicDataType.generateDeallocationFunctionCall(operandBRegister));
        }
        
        return resultCodeFragment.setRegister(valueRegister);
    }
    
    @Override
    public ExpressionCodeFragment visitParenthesis(PascriptParser.ParenthesisContext ctx)
    {
        return this.visit(ctx.expression());
    }
    
    private String processArgumentList(PascriptParser.ArgumentListContext argumentListCtx, Token parenthesisOpenToken,
        ArrayList<DataType> parameterDataTypes, StringBuilder argumentValuesCode, StringBuilder argumentValuesDeallocationCode)
    {
        StringBuilder resultCode = new StringBuilder();
        int argumentCount = parameterDataTypes.size();
        
        if (argumentListCtx == null)
        {
            if (argumentCount > 0)
            {
                Compiler.printCompilationError("The function should be called without any arguments", parenthesisOpenToken);
                System.exit(-1);
            }
        }
        else if (argumentListCtx.expression().size() != argumentCount)
        {
            Compiler.printCompilationError("The function is being called with an incorrect number of arguments", argumentListCtx.getStart());
            System.exit(-1);
        }
        else
        {
            for (int i = 0; i < argumentCount; i++)
            {
                ExpressionCodeFragment argumentCodeFragment = this.visit(argumentListCtx.expression(i));
                String argumentValueRegister = argumentCodeFragment.getValueRegister();
                DataType argumentDataType = argumentCodeFragment.getDataType();

                if (!argumentDataType.equals(parameterDataTypes.get(i)))
                {
                    Compiler.printCompilationError("The argument evaluates to a data type that does not match" +
                        " the data type of the called function's parameter", argumentListCtx.expression(i).getStart());
                    System.exit(-1);
                }

                argumentValuesCode.append(argumentCodeFragment.toString());

                if (i > 0)
                {
                    resultCode.append(", ");
                }
                resultCode.append(argumentDataType.getOutputType()).append(" ").append(argumentValueRegister);

                if (argumentDataType instanceof DynamicDataType)
                {
                    argumentValuesDeallocationCode.append(
                        ((DynamicDataType)argumentDataType).generateDeallocationFunctionCall(argumentValueRegister)
                    );
                }
            }
        }
        
        return resultCode.toString();
    }
    
    @Override
    public ExpressionCodeFragment visitFunctionCall(PascriptParser.FunctionCallContext ctx)
    {
        String functionName = ctx.functionName.getText();
        
        FunctionRecord functionRecord = this._symbolTable.getFunctionRecord(functionName);
        if (functionRecord == null)
        {
            Compiler.printCompilationError("A function with the given name does not exist", ctx.functionName);
            System.exit(-1);
        }
        
        StringBuilder argumentValuesCode = new StringBuilder();
        StringBuilder argumentValuesDeallocationCode = new StringBuilder();
        String argumentListCode = this.processArgumentList(
            ctx.argumentList(), ctx.PAREN_OPEN().getSymbol(), functionRecord.getParameterDataTypes(),
            argumentValuesCode, argumentValuesDeallocationCode
        );

        DataType returnDataType = functionRecord.getReturnDataType();
        ExpressionCodeFragment resultCodeFragment = new ExpressionCodeFragment();
        
        ST functionCallTemplate;
        String functionCallTemplateString = "call <return_data_type> <function_name>(<argument_list_code>)\n";
        if (returnDataType instanceof ValueDataType)
        {
            functionCallTemplate = new ST("<value_register> = " + functionCallTemplateString);
            String valueRegister = this._symbolTable.generateNewRegisterName();
            functionCallTemplate.add("value_register", valueRegister);
            resultCodeFragment.setRegister(valueRegister);
        }
        else
        {
            functionCallTemplate = new ST(functionCallTemplateString);
        }
        functionCallTemplate.add("return_data_type", returnDataType.getOutputType());
        functionCallTemplate.add("function_name", functionRecord.getOutputFunctionName());
        functionCallTemplate.add("argument_list_code", argumentListCode);
        
        resultCodeFragment
            .addCode(argumentValuesCode.toString())
            .addCode(functionCallTemplate.render())
            .addCode(argumentValuesDeallocationCode.toString());
        return resultCodeFragment.setDataType(returnDataType);
    }
    
    private ST processBooleanMethod(ExpressionCodeFragment resultCodeFragment, String methodName)
    {
        String ouputDataType = booleanDataType.getOutputType();
        DataType returnDataType = booleanDataType;
        
        if (Arrays.asList("toInteger", "toFloat", "toString").indexOf(methodName) != -1)
        {
            ST template = new ST(
                "<value_register> = call <return_data_type> @__pascript__boolean<method_name>"
                    + "(<data_type> <variable_value_register>)\n"
            );
            
            switch (methodName)
            {
                case "toInteger":
                    returnDataType = integerDataType;
                    template.add("method_name", "ToInteger");
                    break;
                case "toFloat":
                    returnDataType = floatDataType;
                    template.add("method_name", "ToFloat");
                    break;
                case "toString":
                    returnDataType = stringDataType;
                    template.add("method_name", "ToString");
                    break;  
            }
            
            resultCodeFragment.setDataType(returnDataType);
            template.add("return_data_type", returnDataType.getOutputType());
            return template.add("data_type", ouputDataType);
        }
        return null;
    }
    
    private ST processIntegerMethod(ExpressionCodeFragment resultCodeFragment, String methodName)
    {
        String ouputDataType = integerDataType.getOutputType();
        DataType returnDataType = integerDataType;
        
        if (Arrays.asList("toBoolean", "toFloat", "toString").indexOf(methodName) != -1)
        {
            ST template = new ST(
                "<value_register> = call <return_data_type> @__pascript__integer<method_name>"
                    + "(<data_type> <variable_value_register>)\n"
            );
            
            switch (methodName)
            {
                case "toBoolean":
                    returnDataType = booleanDataType;
                    template.add("method_name", "ToBoolean");
                    break;
                case "toFloat":
                    returnDataType = floatDataType;
                    template.add("method_name", "ToFloat");
                    break;
                case "toString":
                    returnDataType = stringDataType;
                    template.add("method_name", "ToString");
                    break;
            }
            
            resultCodeFragment.setDataType(returnDataType);
            template.add("return_data_type", returnDataType.getOutputType());
            return template.add("data_type", ouputDataType);
        }
        return null;
    }
    
    private ST processFloatMethod(ExpressionCodeFragment resultCodeFragment, String methodName)
    {
        String ouputDataType = floatDataType.getOutputType();
        DataType returnDataType = floatDataType;
        
        if (Arrays.asList("toBoolean", "toInteger", "toString").indexOf(methodName) != -1)
        {
            ST template = new ST(
                "<value_register> = call <return_data_type> @__pascript__float<method_name>"
                    + "(<data_type> <variable_value_register>)\n"
            );
            
            switch (methodName)
            {
                case "toBoolean":
                    returnDataType = booleanDataType;
                    template.add("method_name", "ToBoolean");
                    break;
                case "toInteger":
                    returnDataType = integerDataType;
                    template.add("method_name", "ToInteger");
                    break;
                case "toString":
                    returnDataType = stringDataType;
                    template.add("method_name", "ToString");
                    break;
            }
            
            resultCodeFragment.setDataType(returnDataType);
            template.add("return_data_type", returnDataType.getOutputType());
            return template.add("data_type", ouputDataType);
        }
        return null;
    }
    
    private ST processStringMethod(ExpressionCodeFragment resultCodeFragment, 
        ArrayList<DataType> parameterDataTypes, String methodName)
    {
        String ouputDataType = stringDataType.getOutputType();
        DataType returnDataType = stringDataType;
        
        if (Arrays.asList("toBoolean", "toInteger", "toFloat", "length").indexOf(methodName) != -1)
        {
            ST template = new ST(
                "<value_register> = call <return_data_type> @__pascript__string<method_name>"
                    + "(<data_type> <variable_value_register>)\n"
            );
            
            switch (methodName)
            {
                case "toBoolean":
                    returnDataType =  booleanDataType;
                    template.add("method_name", "ToBoolean");
                    break;
                case "toInteger":
                    returnDataType = integerDataType;
                    template.add("method_name", "ToInteger");
                    break;
                case "toFloat":
                    returnDataType = floatDataType;
                    template.add("method_name", "ToFloat");
                    break;
                case "length":
                    returnDataType = integerDataType;
                    template.add("method_name", "Length");
                    break;
            }
            
            resultCodeFragment.setDataType(returnDataType);
            template.add("return_data_type", returnDataType.getOutputType());
            return template.add("data_type", ouputDataType);
        }
        else if (Arrays.asList("at", "find", "substring").indexOf(methodName) != -1)
        {
            ST template = new ST(
                "<value_register> = call <return_data_type> @__pascript__string<method_name>"
                    + "(<data_type> <variable_value_register>, <argument_list_code>)\n"
            );
            
            switch (methodName)
            {
                case "at":
                    parameterDataTypes.add(integerDataType);
                    template.add("method_name", "At");
                    break;
                case "find":
                    returnDataType = integerDataType;
                    parameterDataTypes.add(stringDataType);
                    template.add("method_name", "Find");
                    break;
                case "substring":
                    parameterDataTypes.add(integerDataType);
                    parameterDataTypes.add(integerDataType);
                    template.add("method_name", "Substring");
                    break;
            }
            
            resultCodeFragment.setDataType(returnDataType);
            template.add("return_data_type", returnDataType.getOutputType());
            return template.add("data_type", ouputDataType);
        }
        return null;
    }
    
    private ST processArrayMethod(ExpressionCodeFragment resultCodeFragment,
        ArrayList<DataType> parameterDataTypes, String methodName, ArrayDataType variableDataType)
    {
        String outputDataType = variableDataType.getOutputType();
        int variableDimensionCount = variableDataType.getDimensionCount();
        DataType returnDataType = voidDataType;
        
        if (Arrays.asList("get", "set", "insert").indexOf(methodName) != -1)
        {
            String methodType = "Value";
            String variableParameterCode = "<data_type> <variable_value_register>";
            ValueDataType valueDataType = (ValueDataType)variableDataType.getPrimitiveDataType();
            if (variableDimensionCount > 1)
            {
                methodType = "Array";
                variableParameterCode += ", " + integerDataType.getOutputType() + " " + Integer.toString(variableDimensionCount);
                valueDataType = new ArrayDataType((PrimitiveDataType)valueDataType, variableDimensionCount - 1);
            }
            
            ST template;
            if (methodName.equals("get"))
            {
                template = new ST(
                    "<value_register> = call <return_data_type> @__pascript__<primitive_data_type_name>Array<method_name>"
                        + "<method_type>(" + variableParameterCode + ", <argument_list_code>)\n"
                );
            }
            else
            {
                template = new ST(
                    "call <return_data_type> @__pascript__<primitive_data_type_name>Array<method_name>"
                        + "<method_type>(" + variableParameterCode + ", <argument_list_code>)\n"
                );
            }
            template.add("method_type", methodType);
            
            
            switch (methodName)
            {
                case "get":
                    returnDataType = valueDataType;
                    template.add("method_name", "Get");
                    parameterDataTypes.add(integerDataType);
                    break;
                case "set":
                    template.add("method_name", "Set");
                    parameterDataTypes.add(integerDataType);
                    parameterDataTypes.add(valueDataType);
                    break;
                case "insert":
                    template.add("method_name", "Insert");
                    parameterDataTypes.add(integerDataType);
                    parameterDataTypes.add(valueDataType);                   
                    break;
            }
            
            resultCodeFragment.setDataType(returnDataType);
            template.add("primitive_data_type_name", variableDataType.getPrimitiveDataTypeName());
            template.add("data_type", outputDataType);
            return template.add("return_data_type", returnDataType.getOutputType());
        }
        else if (Arrays.asList("remove", "resize").indexOf(methodName) != -1)
        {
            ST template = new ST(
                "call <return_data_type> @__pascript__<primitive_data_type_name>Array<method_name>"
                    + "(<data_type> <variable_value_register>, <integer_data_type> <dimension_count>, <argument_list_code>)\n"
            );
            template.add("integer_data_type", integerDataType.getOutputType());
            template.add("dimension_count", Integer.toString(variableDimensionCount));
            
            parameterDataTypes.add(integerDataType);
            switch (methodName)
            {
                case "remove":
                    template.add("method_name", "Remove");
                    break;
                case "resize":
                    template.add("method_name", "Resize");
                    break;
            }
            
            resultCodeFragment.setDataType(returnDataType);
            template.add("primitive_data_type_name", variableDataType.getPrimitiveDataTypeName());
            template.add("data_type", outputDataType);
            return template.add("return_data_type", returnDataType.getOutputType());
        }
        else if (methodName.equals("size"))
        {
            ST template = new ST(
                "<value_register> = call <return_data_type> @__pascript__<data_type_name>ArraySize"
                    + "(<data_type> <variable_value_register>)\n"
            );
            
            returnDataType = integerDataType;
            if (variableDimensionCount > 1)
            {
                template.add("data_type_name", "array");
            }
            else
            {
                template.add("data_type_name", variableDataType.getPrimitiveDataTypeName());
            }
            
            resultCodeFragment.setDataType(returnDataType);
            template.add("data_type", outputDataType);
            return template.add("return_data_type", returnDataType.getOutputType());
        }
        
        return null;
    }
    
    @Override
    public ExpressionCodeFragment visitMethodCall(PascriptParser.MethodCallContext ctx)
    {
        VariableRecord variableRecord = this._symbolTable.getVariableRecord(ctx.variableValue().IDENTIFIER().getText());
        if (variableRecord == null)
        {
            Compiler.printCompilationError(
                "A variable with the given name does not exist in the current scope", ctx.IDENTIFIER().getSymbol()
            );
            System.exit(-1);
        }
        
        ST variableValueTemplate = new ST(
            "<variable_value_register> = load <data_type>* <variable_memory_register>\n"
        );
        DataType variableDataType = variableRecord.getDataType();
        String variableValueRegister = this._symbolTable.generateNewRegisterName();
        variableValueTemplate.add("variable_value_register", variableValueRegister);
        variableValueTemplate.add("data_type", variableDataType.getOutputType());
        variableValueTemplate.add("variable_memory_register", variableRecord.getMemoryRegister());
        
        ExpressionCodeFragment resultCodeFragment = new ExpressionCodeFragment();
        
        ST methodCallTemplate = null;
        ArrayList<DataType> parameterDataTypes = new ArrayList<>();
        String methodName = ctx.methodName.getText();
        if (variableDataType instanceof BooleanDataType)
        {
            methodCallTemplate = this.processBooleanMethod(resultCodeFragment, methodName);
        }
        else if (variableDataType instanceof IntegerDataType)
        {
            methodCallTemplate = this.processIntegerMethod(resultCodeFragment, methodName);
        }
        else if (variableDataType instanceof FloatDataType)
        {
            methodCallTemplate = this.processFloatMethod(resultCodeFragment, methodName);
        }
        else if (variableDataType instanceof StringDataType)
        {
            methodCallTemplate = this.processStringMethod(resultCodeFragment, parameterDataTypes, methodName);
        }
        else if (variableDataType instanceof ArrayDataType)
        {
            methodCallTemplate = this.processArrayMethod(resultCodeFragment, parameterDataTypes, methodName, (ArrayDataType)variableDataType);
        }
        
        if (methodCallTemplate == null)
        {
            Compiler.printCompilationError("The called method is not a member of the variable's data type", ctx.methodName);
            System.exit(-1);
        }
        
        StringBuilder argumentValuesCode = new StringBuilder();
        StringBuilder argumentValuesDeallocationCode = new StringBuilder();
        String argumentListCode = this.processArgumentList(
            ctx.argumentList(), ctx.PAREN_OPEN().getSymbol(), parameterDataTypes,
            argumentValuesCode, argumentValuesDeallocationCode
        );
        if (parameterDataTypes.size() > 0)
        {
            methodCallTemplate.add("argument_list_code", argumentListCode);
        }
        
        methodCallTemplate.add("variable_value_register", variableValueRegister);
        if (!(resultCodeFragment.getDataType() instanceof VoidDataType))
        {
            String valueRegister = this._symbolTable.generateNewRegisterName();
            methodCallTemplate.add("value_register", valueRegister);
            resultCodeFragment.setRegister(valueRegister);
        }
        
        resultCodeFragment
            .addCode(variableValueTemplate.render())
            .addCode(argumentValuesCode.toString())
            .addCode(methodCallTemplate.render())
            .addCode(argumentValuesDeallocationCode.toString());
        return resultCodeFragment;
    }
    
    @Override
    public ExpressionCodeFragment visitAssignment(PascriptParser.AssignmentContext ctx)
    {
        String variableName = ctx.IDENTIFIER().getText();
        VariableRecord variableRecord = this._symbolTable.getVariableRecord(variableName);
        if (variableRecord == null)
        {
            Compiler.printCompilationError(
                "A variable with the given name does not exist in the current scope", ctx.IDENTIFIER().getSymbol()
            );
            System.exit(-1);
        }
        
        ExpressionCodeFragment expressionCodeFragment = this.visit(ctx.expression());
        DataType variableDataType = variableRecord.getDataType();
        if (!variableDataType.equals(expressionCodeFragment.getDataType()))
        {
            Compiler.printCompilationError(
                "The assigned expression does not match the variable's datatype", ctx.expression().getStart()
            );
            System.exit(-1);
        }
        
        String valueRegister = expressionCodeFragment.getValueRegister();
        String memoryRegister = variableRecord.getMemoryRegister();
        String variableOutputDataType = variableDataType.getOutputType();
        
        ST template = new ST(
            "<value_code>" + 
            "<variable_value_deallocation_code>" + 
            "store <data_type> <value_register>, <data_type>* <memory_register>\n" + 
            "<copy_allocation_code>"
        );
        template.add("value_code", expressionCodeFragment.toString());
        template.add("data_type", variableOutputDataType);
        template.add("value_register", valueRegister);
        template.add("memory_register", memoryRegister);
        
        ExpressionCodeFragment resultCodeFragment = new ExpressionCodeFragment();        
        if (variableDataType instanceof DynamicDataType)
        {
            DynamicDataType dynamicVariableDataType = (DynamicDataType)variableDataType;
            
            ST variableValueDeallocationCodeTemplate = new ST(
                "<variable_value> = load <data_type>* <memory_register>\n" +
                "<variable_value_deallocation_code>"
            );
            String variableValue = this._symbolTable.generateNewRegisterName();
            variableValueDeallocationCodeTemplate.add("variable_value", variableValue);
            variableValueDeallocationCodeTemplate.add("data_type", variableOutputDataType);
            variableValueDeallocationCodeTemplate.add("memory_register", memoryRegister);
            variableValueDeallocationCodeTemplate.add("variable_value_deallocation_code", 
                dynamicVariableDataType.generateDeallocationFunctionCall(variableValue)
            );
            template.add("variable_value_deallocation_code", variableValueDeallocationCodeTemplate.render());
            
            String copyRegister = this._symbolTable.generateNewRegisterName();
            template.add("copy_allocation_code", 
                dynamicVariableDataType.generateCopyFunctionCall(copyRegister, valueRegister)
            );
            resultCodeFragment.setRegister(copyRegister);
        }
        else
        {
            template.add("variable_value_deallocation_code", "");
            template.add("copy_allocation_code", "");
            resultCodeFragment.setRegister(valueRegister);
        }
        
        resultCodeFragment.addCode(template.render());
        return resultCodeFragment.setDataType(variableDataType);
    }  

    @Override
    public ExpressionCodeFragment visitReAssignment(PascriptParser.ReAssignmentContext ctx)
    {
        VariableRecord variableRecord = this._symbolTable.getVariableRecord(ctx.IDENTIFIER().getText());
        if (variableRecord == null)
        {
            Compiler.printCompilationError(
                "A variable with the given name does not exist in the current scope", ctx.IDENTIFIER().getSymbol()
            );
            System.exit(-1);
        }
        
        DataType variableDataType = variableRecord.getDataType();        
        if (!(variableDataType instanceof IntegerDataType))
        {
            Compiler.printCompilationError("Variable incrementaion and decrementation is possible only for variables"
                + " with the integer data type", ctx.IDENTIFIER().getSymbol());
            System.exit(-1);
        }
        
        ST template = new ST(
            "<register_1> = load <data_type>* <memory_register>\n" +
            "<value_register> = <instruction> <data_type> <register_1>, 1\n" +
            "store <data_type> <value_register>, <data_type>* <memory_register>\n"
        );
        
        String valueRegister = this._symbolTable.generateNewRegisterName();
        template.add("register_1", this._symbolTable.generateNewRegisterName());
        template.add("data_type", variableDataType.getOutputType());
        template.add("memory_register", variableRecord.getMemoryRegister());
        template.add("value_register", valueRegister);
        
        switch (ctx.operator.getType())
        {
            case PascriptParser.INCREMENT:
                template.add("instruction", "add");
                break;
            case PascriptParser.DECREMENT:
                template.add("instruction", "sub");
                break;
        }
        
        return (new ExpressionCodeFragment(template.render())).setDataType(variableDataType).setRegister(valueRegister);
    }
    
    @Override
    public ExpressionCodeFragment visitVariableValue(PascriptParser.VariableValueContext ctx)
    {
        String variableName = ctx.IDENTIFIER().getText();
        VariableRecord variableRecord = this._symbolTable.getVariableRecord(variableName);
        if (variableRecord == null)
        {
            Compiler.printCompilationError(
                "A variable with the given name does not exist in the current scope", ctx.IDENTIFIER().getSymbol()
            );
            System.exit(-1);
        }
        
        ST template = new ST(
            "<value_register> = load <data_type>* <memory_register>\n" +
            "<copy_allocation_code>"
        );
        DataType variableDataType = variableRecord.getDataType();
        String valueRegister = this._symbolTable.generateNewRegisterName();
        template.add("value_register", valueRegister);
        template.add("data_type", variableDataType.getOutputType());
        template.add("memory_register", variableRecord.getMemoryRegister());

        ExpressionCodeFragment resultCodeFragment = new ExpressionCodeFragment();        
        if (variableDataType instanceof DynamicDataType)
        {
            String copyRegister = this._symbolTable.generateNewRegisterName();
            template.add("copy_allocation_code", 
                ((DynamicDataType)variableDataType).generateCopyFunctionCall(copyRegister, valueRegister)
            );
            resultCodeFragment.setRegister(copyRegister);
        }
        else
        {
            template.add("copy_allocation_code", "");
            resultCodeFragment.setRegister(valueRegister);
        }
        
        resultCodeFragment.addCode(template.render());
        return resultCodeFragment.setDataType(variableDataType);
    }

    @Override
    public ExpressionCodeFragment visitBooleanLiteral(PascriptParser.BooleanLiteralContext ctx)
    {
        ST template = new ST(
            "<register_1> = icmp eq i1 true, <literal_value>\n" +
            "<value_register> = zext i1 <register_1> to <data_type>\n"
        );
        String valueRegister = this._symbolTable.generateNewRegisterName();
        template.add("register_1", this._symbolTable.generateNewRegisterName());
        template.add("value_register", valueRegister);
        template.add("data_type", booleanDataType.getOutputType());
        template.add("literal_value", ctx.value.getText());
        
        return (new ExpressionCodeFragment(template.render())).setDataType(booleanDataType).setRegister(valueRegister);
    }
    
    @Override
    public ExpressionCodeFragment visitIntegerLiteral(PascriptParser.IntegerLiteralContext ctx)
    {
        ST template = new ST(
            "<value_register> = add <data_type> 0, <literal_value>\n"
        );
        String valueRegister = this._symbolTable.generateNewRegisterName();
        template.add("value_register", valueRegister);
        template.add("data_type", integerDataType.getOutputType());
        template.add("literal_value", ctx.value.getText());
        
        return (new ExpressionCodeFragment(template.render())).setDataType(integerDataType).setRegister(valueRegister);
    }

    @Override
    public ExpressionCodeFragment visitFloatLiteral(PascriptParser.FloatLiteralContext ctx)
    {
        ST template = new ST(
            "<value_register> = fadd <data_type> 0., <literal_value>\n"
        );
        String valueRegister = this._symbolTable.generateNewRegisterName();
        template.add("value_register", valueRegister);
        template.add("data_type", floatDataType.getOutputType());
        template.add("literal_value", "0x" + Long.toHexString(Double.doubleToRawLongBits(Double.parseDouble(ctx.value.getText()))));
        
        return (new ExpressionCodeFragment(template.render())).setDataType(floatDataType).setRegister(valueRegister);
    }
    
    @Override
    public ExpressionCodeFragment visitStringLiteral(PascriptParser.StringLiteralContext ctx)
    {
        String literalValue = ctx.value.getText();
        literalValue = literalValue.substring(1, literalValue.length() - 1);
        
        ST template = new ST(
            "<register_1> = getelementptr [<length> x i8]* <constant_register>, i8 0, i8 0\n" + 
            "<copy_allocation_code>"
        );
        String tempRegister = this._symbolTable.generateNewRegisterName();
        String valueRegister = this._symbolTable.generateNewRegisterName();
        template.add("register_1", tempRegister);
        template.add("length", Integer.toString(literalValue.length() + 1));
        template.add("constant_register", this._symbolTable.addStringConstant(literalValue));
        template.add("copy_allocation_code", stringDataType.generateCopyFunctionCall(valueRegister, tempRegister));
        
        return (new ExpressionCodeFragment(template.render())).setDataType(stringDataType).setRegister(valueRegister);
    }
}