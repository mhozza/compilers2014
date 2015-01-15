package pascript;

import java.util.Objects;
import org.stringtemplate.v4.ST;
import pascript.grammar.PascriptBaseVisitor;
import pascript.grammar.PascriptParser;
import pascript.DataTypeVisitor.*;

/**
 *
 * @author Osama Hassanein
 */
public class DataTypeVisitor extends PascriptBaseVisitor<DataType>
{
    public static abstract class DataType
    {
        public abstract String getOutputType();
        
        @Override
        public boolean equals(Object obj)
        {
            return (obj instanceof DataType) && (super.equals(obj) || this.getClass().isInstance(obj));
        }

        @Override
        public int hashCode()
        {
            int hash = 5;
            return hash;
        }
    }
    
    public static class VoidDataType extends DataType
    {
        @Override
        public String getOutputType()
        {
            return "void";
        }
    }
    
    public static abstract class ValueDataType extends DataType
    {
        public abstract String getDefaultOutputValue();
    }
    
    public static interface PrimitiveDataType
    {
        public String getOutputPrintFunctionName();
        public String getOutputReadFunctionName();
    }
    
    public static class BooleanDataType extends ValueDataType implements PrimitiveDataType
    {
        @Override
        public String getOutputType()
        {
            return "i8";
        }
        
        @Override
        public String getDefaultOutputValue()
        {
            return "0";
        }

        @Override
        public String getOutputPrintFunctionName()
        {
            return "@__pascript__booleanPrint";
        }

        @Override
        public String getOutputReadFunctionName()
        {
            return "@__pascript__booleanRead";
        }
    }
    
    public static class IntegerDataType extends ValueDataType implements PrimitiveDataType
    {
        @Override
        public String getOutputType()
        {
            return "i32";
        }
        
        @Override
        public String getDefaultOutputValue()
        {
            return "0";
        }

        @Override
        public String getOutputPrintFunctionName()
        {
            return "@__pascript__integerPrint";
        }

        @Override
        public String getOutputReadFunctionName()
        {
            return "@__pascript__integerRead";
        }
    }
    
    public static class FloatDataType extends ValueDataType implements PrimitiveDataType
    {
        @Override
        public String getOutputType()
        {
            return "double";
        }

        @Override
        public String getDefaultOutputValue()
        {
            return "0.";
        }

        @Override
        public String getOutputPrintFunctionName()
        {
            return "@__pascript__floatPrint";
        }

        @Override
        public String getOutputReadFunctionName()
        {
            return "@__pascript__floatRead";
        }
    }
    
    public static abstract class DynamicDataType extends ValueDataType
    {
        public abstract String generateAllocationFunctionCall(String valueRegister);
        public abstract String generateDeallocationFunctionCall(String valueRegister);
        public abstract String generateCopyFunctionCall(String copyRegister, String valueRegister);
    }
    
    public static class StringDataType extends DynamicDataType implements PrimitiveDataType 
    {
        @Override
        public String getOutputType()
        {
            return "i8*";
        }

        @Override
        public String getDefaultOutputValue()
        {
            return "null";
        }

        @Override
        public String getOutputPrintFunctionName()
        {
            return "@__pascript__stringPrint";
        }

        @Override
        public String getOutputReadFunctionName()
        {
            return "@__pascript__stringRead";
        }
        
        @Override
        public String generateAllocationFunctionCall(String valueRegister)
        {
            ST template = new ST("<value_register> = call i8* @__pascript__stringAllocate()\n");
            template.add("value_register", valueRegister);
            return template.render();
        }
        
        @Override
        public String generateDeallocationFunctionCall(String valueRegister)
        {
            ST template = new ST("call void @__pascript__stringDeallocate(<data_type> <value_register>)\n");
            template.add("data_type", this.getOutputType());
            template.add("value_register", valueRegister);
            return template.render();
        }

        @Override
        public String generateCopyFunctionCall(String copyRegister, String valueRegister)
        {
            ST template = new ST("<copy_register> = call <data_type> @__pascript__stringCopy(<data_type> <value_register>)\n");
            template.add("copy_register", copyRegister);
            template.add("data_type", this.getOutputType());
            template.add("value_register", valueRegister);
            return template.render();
        }
    }
    
    public static class ArrayDataType extends DynamicDataType
    {
        protected PrimitiveDataType _primitiveDataType;
        protected int _dimensionCount;
        
        public ArrayDataType()
        {
            this(null, -1);
        }
        
        public ArrayDataType(PrimitiveDataType primitiveDataType, int dimensionCount)
        {
            this._primitiveDataType = primitiveDataType;
            this._dimensionCount = dimensionCount;
        }
        
        public int getDimensionCount()
        {
            return this._dimensionCount;
        }
        
        public PrimitiveDataType getPrimitiveDataType()
        {
            return this._primitiveDataType;
        }
        
        @Override
        public String getOutputType()
        {
            return "i32*";
        }
        
        @Override
        public String getDefaultOutputValue()
        {
            return "null";
        }
        
        public String getPrimitiveDataTypeName()
        {
            if (this._primitiveDataType instanceof BooleanDataType)
            {
                return "boolean";
            }
            else if (this._primitiveDataType instanceof IntegerDataType)
            {
                return "integer";
            }
            else if (this._primitiveDataType instanceof FloatDataType)
            {
                return "float";
            }
            else if (this._primitiveDataType instanceof StringDataType)
            {
                return "string";
            }
            return null;
        }
        
        @Override
        public String generateAllocationFunctionCall(String valueRegister)
        {
            ST template = new ST(
                "<value_register> = call <data_type> @__pascript__<primitive_data_type_name>ArrayAllocate"
                    + "(<dimension_data_type> <dimension_count>)\n"
            );
            
            template.add("value_register", valueRegister);
            template.add("data_type", this.getOutputType());
            template.add("primitive_data_type_name", this.getPrimitiveDataTypeName());
            template.add("dimension_data_type", (new IntegerDataType()).getOutputType());
            template.add("dimension_count", Integer.toString(this.getDimensionCount()));
            return template.render();
        }
        
        @Override
        public String generateDeallocationFunctionCall(String valueRegister)
        {
            ST template = new ST(
                "call void @__pascript__<primitive_data_type_name>ArrayDeallocate"
                    + "(<data_type> <value_register>, <dimension_data_type> <dimension_count>)\n"
            );
            
            template.add("primitive_data_type_name", this.getPrimitiveDataTypeName());
            template.add("data_type", this.getOutputType());
            template.add("value_register", valueRegister);
            template.add("dimension_data_type", (new IntegerDataType()).getOutputType());
            template.add("dimension_count", Integer.toString(this.getDimensionCount()));
            return template.render();
        }
        
        @Override
        public String generateCopyFunctionCall(String copyRegister, String valueRegister)
        {
            ST template = new ST(
                "<copy_register> = call <data_type> @__pascript__<primitive_data_type_name>ArrayCopy"
                    + "(<data_type> <value_register>, <integer_data_type> <dimension_count>)\n"
            );
            
            template.add("copy_register", copyRegister);
            template.add("data_type", this.getOutputType());
            template.add("primitive_data_type_name", this.getPrimitiveDataTypeName());
            template.add("value_register", valueRegister);
            template.add("integer_data_type", (new IntegerDataType()).getOutputType());
            template.add("dimension_count", Integer.toString(this.getDimensionCount()));
            return template.render();
        }
        
        @Override
        public boolean equals(Object obj)
        {
            if (!(obj instanceof ArrayDataType))
            {
                return false;
            }
            ArrayDataType arrayDataType = (ArrayDataType)obj;
            
            if ((this.getPrimitiveDataType() == null) || (arrayDataType.getPrimitiveDataType() == null))
            {
                return true;
            }
            
            return (this.getDimensionCount() == arrayDataType.getDimensionCount())
                && this.getPrimitiveDataType().equals(arrayDataType.getPrimitiveDataType());
        }

        @Override
        public int hashCode()
        {
            int hash = 5;
            hash = 37 * hash + Objects.hashCode(this._primitiveDataType);
            hash = 37 * hash + this._dimensionCount;
            return hash;
        }
    }

    @Override
    public DataType visitReturnVoidDataType(PascriptParser.ReturnVoidDataTypeContext ctx)
    {
        return new VoidDataType();
    }
    
    @Override
    public DataType visitBooleanDataType(PascriptParser.BooleanDataTypeContext ctx)
    {
        return new BooleanDataType();
    }

    @Override
    public DataType visitIntegerDataType(PascriptParser.IntegerDataTypeContext ctx)
    {
        return new IntegerDataType();
    }

    @Override
    public DataType visitFloatDataType(PascriptParser.FloatDataTypeContext ctx)
    {
        return new FloatDataType();
    }

    @Override
    public DataType visitStringDataType(PascriptParser.StringDataTypeContext ctx)
    {
        return new StringDataType();
    }

    @Override
    public DataType visitArrayDataType(PascriptParser.ArrayDataTypeContext ctx)
    {
        PrimitiveDataType primitiveDataType = (PrimitiveDataType)this.visit(ctx.primitiveDataType());
        return new ArrayDataType(primitiveDataType, ctx.SQUARE_OPEN().size());
    }
}
