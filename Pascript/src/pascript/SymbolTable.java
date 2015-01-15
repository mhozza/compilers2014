package pascript;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.HashMap;
import java.util.Iterator;
import pascript.DataTypeVisitor.*;
import pascript.ExpressionCodeVisitor.ExpressionCodeFragment;

/**
 *
 * @author Osama Hassanein
 */
public final class SymbolTable
{
    public static class FunctionRecord
    {
        protected final String _outputFunctionName;
        protected final ArrayList<DataType> _parameterDataTypes;
        protected final DataType _returnDataType;

        public FunctionRecord(String outputFunctionName, DataType returnDataType, ArrayList<DataType> parameterDataTypes)
        {
            this._outputFunctionName = outputFunctionName;
            this._returnDataType = returnDataType;
            this._parameterDataTypes = parameterDataTypes;
        }
        
        public String getOutputFunctionName()
        {
            return this._outputFunctionName;
        }

        public DataType getReturnDataType()
        {
            return this._returnDataType;
        }

        public ArrayList<DataType> getParameterDataTypes()
        {
            return this._parameterDataTypes;
        }
    }
    
    public static class VariableRecord
    {        
        protected final String _memoryRegister;
        protected final DataType _dataType;

        public VariableRecord(String memoryRegister, DataType dataType)
        {
            this._memoryRegister = memoryRegister;
            this._dataType = dataType;
        }

        public String getMemoryRegister()
        {
            return this._memoryRegister;
        }

        public DataType getDataType()
        {
            return this._dataType;
        }
    }
    
    private static final VoidDataType voidDataType = new VoidDataType();
    private static final BooleanDataType booleanDataType = new BooleanDataType();
    private static final IntegerDataType integerDataType = new IntegerDataType();
    private static final FloatDataType floatDataType = new FloatDataType();
    private static final StringDataType stringDataType = new StringDataType();
    private static final ArrayDataType arrayDataType = new ArrayDataType();
    
    private int _lableCounter = 0;
    private int _registerCounter = 0;
    
    private int _localFunctionCounter = 0;
    private int _stringConstantCounter = 0;
    private int _globalVariableCounter = 0;
    
    private DataType _currentFunctionReturnDataType;
    private boolean _currentFunctionIsMain;
    
    private final HashMap<String, VariableRecord> _globalVariableTable = new HashMap<>();
    private final HashMap<String, ExpressionCodeFragment> _globalVariableInitializer = new HashMap<>();
    private final LinkedList<HashMap<String, VariableRecord>> _variableTables = new LinkedList<>();
    private final HashMap<String, FunctionRecord> _externalFunctionTable = new HashMap<>();
    private final HashMap<String, FunctionRecord> _functionTable = new HashMap<>();
    private final HashMap<String, String> _stringConstants = new HashMap<>();
    
    public SymbolTable()
    {
        ////// Boolean functions //////
        
        // Boolean IO
        this.addExternalFunction("__pascript__booleanRead", booleanDataType,
            new ArrayList<DataType>());
        this.addExternalFunction("__pascript__booleanPrint", voidDataType,
            new ArrayList<DataType>(Arrays.asList(booleanDataType)));

        // Boolean Conversion
        this.addExternalFunction("__pascript__booleanToInteger", integerDataType,
            new ArrayList<DataType>(Arrays.asList(booleanDataType)));
        this.addExternalFunction("__pascript__booleanToFloat", floatDataType,
            new ArrayList<DataType>(Arrays.asList(booleanDataType)));
        this.addExternalFunction("__pascript__booleanToString", stringDataType,
            new ArrayList<DataType>(Arrays.asList(booleanDataType)));
        
        ////// Integer functions //////
            
        // Integer IO
        this.addExternalFunction("__pascript__integerRead", integerDataType,
            new ArrayList<DataType>());
        this.addExternalFunction("__pascript__integerPrint", voidDataType,
            new ArrayList<DataType>(Arrays.asList(integerDataType)));

        // Integer Conversions
        this.addExternalFunction("__pascript__integerToBoolean", booleanDataType,
            new ArrayList<DataType>(Arrays.asList(integerDataType)));
        this.addExternalFunction("__pascript__integerToFloat", floatDataType,
            new ArrayList<DataType>(Arrays.asList(integerDataType)));
        this.addExternalFunction("__pascript__integerToString", stringDataType,
            new ArrayList<DataType>(Arrays.asList(integerDataType)));
        
        ////// Float functions //////
        
        // Float IO
        this.addExternalFunction("__pascript__floatRead", floatDataType,
            new ArrayList<DataType>());
        this.addExternalFunction("__pascript__floatPrint", voidDataType,
            new ArrayList<DataType>(Arrays.asList(floatDataType)));

        // Float Conversion
        this.addExternalFunction("__pascript__floatToBoolean", booleanDataType,
            new ArrayList<DataType>(Arrays.asList(floatDataType)));
        this.addExternalFunction("__pascript__floatToInteger", integerDataType,
            new ArrayList<DataType>(Arrays.asList(floatDataType)));
        this.addExternalFunction("__pascript__floatToString", stringDataType,
            new ArrayList<DataType>(Arrays.asList(floatDataType)));
        
        ////// String functions //////
        
        // String Memory Management
        this.addExternalFunction("__pascript__stringAllocate", stringDataType,
            new ArrayList<DataType>());
        this.addExternalFunction("__pascript__stringDeallocate", voidDataType,
            new ArrayList<DataType>(Arrays.asList(stringDataType)));
        this.addExternalFunction("__pascript__stringCopy", stringDataType,
            new ArrayList<DataType>(Arrays.asList(stringDataType)));
        
        // String IO
        this.addExternalFunction("__pascript__stringRead", stringDataType,
            new ArrayList<DataType>());
        this.addExternalFunction("__pascript__stringPrint", voidDataType,
            new ArrayList<DataType>(Arrays.asList(stringDataType)));
        
        // String Conversions
        this.addExternalFunction("__pascript__stringToBoolean", booleanDataType,
            new ArrayList<DataType>(Arrays.asList(stringDataType)));
        this.addExternalFunction("__pascript__stringToInteger", integerDataType,
            new ArrayList<DataType>(Arrays.asList(stringDataType)));
        this.addExternalFunction("__pascript__stringToFloat", floatDataType,
            new ArrayList<DataType>(Arrays.asList(stringDataType)));
        
        // String Operations
        this.addExternalFunction("__pascript__stringAt", stringDataType,
            new ArrayList<DataType>(Arrays.asList(stringDataType, integerDataType)));
        this.addExternalFunction("__pascript__stringLength", integerDataType,
            new ArrayList<DataType>(Arrays.asList(stringDataType)));
        this.addExternalFunction("__pascript__stringConcatenate", stringDataType,
            new ArrayList<DataType>(Arrays.asList(stringDataType, stringDataType)));
        this.addExternalFunction("__pascript__stringCompare", integerDataType,
            new ArrayList<DataType>(Arrays.asList(stringDataType, stringDataType)));
        this.addExternalFunction("__pascript__stringFind", integerDataType,
            new ArrayList<DataType>(Arrays.asList(stringDataType, stringDataType)));
        this.addExternalFunction("__pascript__stringSubstring", stringDataType,
            new ArrayList<DataType>(Arrays.asList(stringDataType, integerDataType, integerDataType)));
        
        ////// Array functions //////
        
        // Array Allocate Operation
        this.addExternalFunction("__pascript__booleanArrayAllocate", arrayDataType,
            new ArrayList<DataType>(Arrays.asList(integerDataType)));
        this.addExternalFunction("__pascript__integerArrayAllocate", arrayDataType,
            new ArrayList<DataType>(Arrays.asList(integerDataType)));
        this.addExternalFunction("__pascript__floatArrayAllocate", arrayDataType,
            new ArrayList<DataType>(Arrays.asList(integerDataType)));
        this.addExternalFunction("__pascript__stringArrayAllocate", arrayDataType,
            new ArrayList<DataType>(Arrays.asList(integerDataType)));
        
        // Array Deallocate Operation
        this.addExternalFunction("__pascript__booleanArrayDeallocate", voidDataType,
            new ArrayList<DataType>(Arrays.asList(arrayDataType, integerDataType)));
        this.addExternalFunction("__pascript__integerArrayDeallocate", voidDataType,
            new ArrayList<DataType>(Arrays.asList(arrayDataType, integerDataType)));
        this.addExternalFunction("__pascript__floatArrayDeallocate", voidDataType,
            new ArrayList<DataType>(Arrays.asList(arrayDataType, integerDataType)));
        this.addExternalFunction("__pascript__stringArrayDeallocate", voidDataType,
            new ArrayList<DataType>(Arrays.asList(arrayDataType, integerDataType)));
        
        // Array Copy Operation
        this.addExternalFunction("__pascript__booleanArrayCopy", arrayDataType,
            new ArrayList<DataType>(Arrays.asList(arrayDataType, integerDataType)));
        this.addExternalFunction("__pascript__integerArrayCopy", arrayDataType,
            new ArrayList<DataType>(Arrays.asList(arrayDataType, integerDataType)));
        this.addExternalFunction("__pascript__floatArrayCopy", arrayDataType,
            new ArrayList<DataType>(Arrays.asList(arrayDataType, integerDataType)));
        this.addExternalFunction("__pascript__stringArrayCopy", arrayDataType,
            new ArrayList<DataType>(Arrays.asList(arrayDataType, integerDataType)));
        
        // Array Get Operation
        this.addExternalFunction("__pascript__booleanArrayGetValue", booleanDataType,
            new ArrayList<DataType>(Arrays.asList(arrayDataType, integerDataType)));
        this.addExternalFunction("__pascript__integerArrayGetValue", integerDataType,
            new ArrayList<DataType>(Arrays.asList(arrayDataType, integerDataType)));
        this.addExternalFunction("__pascript__floatArrayGetValue", floatDataType,
            new ArrayList<DataType>(Arrays.asList(arrayDataType, integerDataType)));
        this.addExternalFunction("__pascript__stringArrayGetValue", stringDataType,
            new ArrayList<DataType>(Arrays.asList(arrayDataType, integerDataType)));
        this.addExternalFunction("__pascript__booleanArrayGetArray", arrayDataType,
            new ArrayList<DataType>(Arrays.asList(arrayDataType, integerDataType, integerDataType)));
        this.addExternalFunction("__pascript__integerArrayGetArray", arrayDataType,
            new ArrayList<DataType>(Arrays.asList(arrayDataType, integerDataType, integerDataType)));
        this.addExternalFunction("__pascript__floatArrayGetArray", arrayDataType,
            new ArrayList<DataType>(Arrays.asList(arrayDataType, integerDataType, integerDataType)));
        this.addExternalFunction("__pascript__stringArrayGetArray", arrayDataType,
            new ArrayList<DataType>(Arrays.asList(arrayDataType, integerDataType, integerDataType)));
        
        // Array Set Operation
        this.addExternalFunction("__pascript__booleanArraySetValue", voidDataType,
            new ArrayList<DataType>(Arrays.asList(arrayDataType, integerDataType, booleanDataType)));
        this.addExternalFunction("__pascript__integerArraySetValue", voidDataType,
            new ArrayList<DataType>(Arrays.asList(arrayDataType, integerDataType, integerDataType)));
        this.addExternalFunction("__pascript__floatArraySetValue", voidDataType,
            new ArrayList<DataType>(Arrays.asList(arrayDataType, integerDataType, floatDataType)));
        this.addExternalFunction("__pascript__stringArraySetValue", voidDataType,
            new ArrayList<DataType>(Arrays.asList(arrayDataType, integerDataType, stringDataType)));
        this.addExternalFunction("__pascript__booleanArraySetArray", voidDataType,
            new ArrayList<DataType>(Arrays.asList(arrayDataType, integerDataType, integerDataType, arrayDataType)));
        this.addExternalFunction("__pascript__integerArraySetArray", voidDataType,
            new ArrayList<DataType>(Arrays.asList(arrayDataType, integerDataType, integerDataType, arrayDataType)));
        this.addExternalFunction("__pascript__floatArraySetArray", voidDataType,
            new ArrayList<DataType>(Arrays.asList(arrayDataType, integerDataType, integerDataType, arrayDataType)));
        this.addExternalFunction("__pascript__stringArraySetArray", voidDataType,
            new ArrayList<DataType>(Arrays.asList(arrayDataType, integerDataType, integerDataType, arrayDataType)));
        
        // Array Insert Operation
        this.addExternalFunction("__pascript__booleanArrayInsertValue", voidDataType,
            new ArrayList<DataType>(Arrays.asList(arrayDataType, integerDataType, booleanDataType)));
        this.addExternalFunction("__pascript__integerArrayInsertValue", voidDataType,
            new ArrayList<DataType>(Arrays.asList(arrayDataType, integerDataType, integerDataType)));
        this.addExternalFunction("__pascript__floatArrayInsertValue", voidDataType,
            new ArrayList<DataType>(Arrays.asList(arrayDataType, integerDataType, floatDataType)));
        this.addExternalFunction("__pascript__stringArrayInsertValue", voidDataType,
            new ArrayList<DataType>(Arrays.asList(arrayDataType, integerDataType, stringDataType)));
        this.addExternalFunction("__pascript__booleanArrayInsertArray", voidDataType,
            new ArrayList<DataType>(Arrays.asList(arrayDataType, integerDataType, integerDataType, arrayDataType)));
        this.addExternalFunction("__pascript__integerArrayInsertArray", voidDataType,
            new ArrayList<DataType>(Arrays.asList(arrayDataType, integerDataType, integerDataType, arrayDataType)));
        this.addExternalFunction("__pascript__floatArrayInsertArray", voidDataType,
            new ArrayList<DataType>(Arrays.asList(arrayDataType, integerDataType, integerDataType, arrayDataType)));
        this.addExternalFunction("__pascript__stringArrayInsertArray", voidDataType,
            new ArrayList<DataType>(Arrays.asList(arrayDataType, integerDataType, integerDataType, arrayDataType)));
        
        // Array Remove Operation
        this.addExternalFunction("__pascript__booleanArrayRemove", voidDataType,
            new ArrayList<DataType>(Arrays.asList(arrayDataType, integerDataType, integerDataType)));
        this.addExternalFunction("__pascript__integerArrayRemove", voidDataType,
            new ArrayList<DataType>(Arrays.asList(arrayDataType, integerDataType, integerDataType)));
        this.addExternalFunction("__pascript__floatArrayRemove", voidDataType,
            new ArrayList<DataType>(Arrays.asList(arrayDataType, integerDataType, integerDataType)));
        this.addExternalFunction("__pascript__stringArrayRemove", voidDataType,
            new ArrayList<DataType>(Arrays.asList(arrayDataType, integerDataType, integerDataType)));
        
        // Array Size Operation
        this.addExternalFunction("__pascript__booleanArraySize", integerDataType,
            new ArrayList<DataType>(Arrays.asList(arrayDataType)));
        this.addExternalFunction("__pascript__integerArraySize", integerDataType,
            new ArrayList<DataType>(Arrays.asList(arrayDataType)));
        this.addExternalFunction("__pascript__floatArraySize", integerDataType,
            new ArrayList<DataType>(Arrays.asList(arrayDataType)));
        this.addExternalFunction("__pascript__stringArraySize", integerDataType,
            new ArrayList<DataType>(Arrays.asList(arrayDataType)));
        this.addExternalFunction("__pascript__arrayArraySize", integerDataType,
            new ArrayList<DataType>(Arrays.asList(arrayDataType)));
        
        // Array Resize Operation
        this.addExternalFunction("__pascript__booleanArrayResize", voidDataType,
            new ArrayList<DataType>(Arrays.asList(arrayDataType, integerDataType, integerDataType)));
        this.addExternalFunction("__pascript__integerArrayResize", voidDataType,
            new ArrayList<DataType>(Arrays.asList(arrayDataType, integerDataType, integerDataType)));
        this.addExternalFunction("__pascript__floatArrayResize", voidDataType,
            new ArrayList<DataType>(Arrays.asList(arrayDataType, integerDataType, integerDataType)));
        this.addExternalFunction("__pascript__stringArrayResize", voidDataType,
            new ArrayList<DataType>(Arrays.asList(arrayDataType, integerDataType, integerDataType)));
        
        // Array Merge Operation
        this.addExternalFunction("__pascript__booleanArrayMerge", arrayDataType,
            new ArrayList<DataType>(Arrays.asList(arrayDataType, arrayDataType, integerDataType)));
        this.addExternalFunction("__pascript__integerArrayMerge", arrayDataType,
            new ArrayList<DataType>(Arrays.asList(arrayDataType, arrayDataType, integerDataType)));
        this.addExternalFunction("__pascript__floatArrayMerge", arrayDataType,
            new ArrayList<DataType>(Arrays.asList(arrayDataType, arrayDataType, integerDataType)));
        this.addExternalFunction("__pascript__stringArrayMerge", arrayDataType,
            new ArrayList<DataType>(Arrays.asList(arrayDataType, arrayDataType, integerDataType)));
        
        // Array Equals Operation
        this.addExternalFunction("__pascript__booleanArrayEquals", booleanDataType,
            new ArrayList<DataType>(Arrays.asList(arrayDataType, arrayDataType, integerDataType)));
        this.addExternalFunction("__pascript__integerArrayEquals", booleanDataType,
            new ArrayList<DataType>(Arrays.asList(arrayDataType, arrayDataType, integerDataType)));
        this.addExternalFunction("__pascript__floatArrayEquals", booleanDataType,
            new ArrayList<DataType>(Arrays.asList(arrayDataType, arrayDataType, integerDataType)));
        this.addExternalFunction("__pascript__stringArrayEquals", booleanDataType,
            new ArrayList<DataType>(Arrays.asList(arrayDataType, arrayDataType, integerDataType)));
    }
    
    public String generateNewLabelName()
    {
        return String.format("L%d", this._lableCounter++);
    }

    public String generateNewRegisterName()
    {
        return String.format("%%R%d", this._registerCounter++);
    }
    
    public FunctionRecord addExternalFunction(String name, DataType returnDataType, ArrayList<DataType> parameterDataTypes)
    {
        if (this._functionTable.containsKey(name))
        {
            return null;
        }
        
        String outputName = "@" + name;
        FunctionRecord functionRecord = new FunctionRecord(outputName, returnDataType, parameterDataTypes);
        this._externalFunctionTable.put(outputName, functionRecord);
        this._functionTable.put(name, functionRecord);
        return functionRecord;
    }
    
    public Collection<FunctionRecord> getExternalFunctions()
    {
        return this._externalFunctionTable.values();
    }
    
    public FunctionRecord addLocalFunction(String name, DataType returnDataType, ArrayList<DataType> parameterDataTypes)
    {
        if (this._functionTable.containsKey(name))
        {
            return null;
        }
        
        String outputName;
        do
        {
            outputName = String.format("@F%d", this._localFunctionCounter++);
        }
        while (this._externalFunctionTable.containsKey(outputName));
        
        FunctionRecord functionRecord = new FunctionRecord(outputName, returnDataType, parameterDataTypes);
        this._functionTable.put(name, functionRecord);
        return functionRecord;
    }
    
    public FunctionRecord getFunctionRecord(String name)
    {
        return this._functionTable.get(name);
    }
    
    public String addStringConstant(String value)
    {
        String name;
        do
        {
            name = String.format("@S%d", this._stringConstantCounter++);
        }
        while (this._externalFunctionTable.containsKey(name));
        this._stringConstants.put(name, value);
        return name;
    }
    
    public HashMap<String, String> getStringConstants()
    {
        return new HashMap<>(this._stringConstants);
    }
    
    public VariableRecord addGlobalVariable(String name, DataType dataType)
    {
        if (this._globalVariableTable.containsKey(name))
        {
            return null;
        }
        
        String memoryRegister;
        do
        {
            memoryRegister = String.format("@V%d", this._globalVariableCounter++);
        }
        while (this._externalFunctionTable.containsKey(memoryRegister));

        VariableRecord variableRecord = new VariableRecord(memoryRegister, dataType);
        this._globalVariableTable.put(name, variableRecord);
        return variableRecord;
    }
    
    public HashMap<String, ExpressionCodeFragment> getGlobalVariableInitializers()
    {
        return new HashMap<>(this._globalVariableInitializer);
    }
    
    public void addGlobalVariableInitializer(String globalRegister, ExpressionCodeFragment expressionCodeFragment)
    {
        this._globalVariableInitializer.put(globalRegister, expressionCodeFragment);
    }
    
    public VariableRecord addLocalVariable(String name, DataType dataType)
    {
        HashMap<String, VariableRecord> currentVarTable = this._variableTables.peekLast();

        if (currentVarTable.containsKey(name))
        {
            return null;
        }

        VariableRecord variableRecord = new VariableRecord(this.generateNewRegisterName(), dataType);
        currentVarTable.put(name, variableRecord);
        return variableRecord;
    }
    
    public VariableRecord getVariableRecord(String name)
    {
        Iterator<HashMap<String, VariableRecord>> varTableIterator = this._variableTables.descendingIterator();

        while (varTableIterator.hasNext())
        {
            HashMap<String, VariableRecord> currentVarTable = varTableIterator.next();

            VariableRecord variableRecord = currentVarTable.get(name);
            if (variableRecord != null)
            {
                return variableRecord;
            }
        }

        return null;
    }
    
    public void enterFunction(DataType returnDataType, boolean isMain)
    {
        this._currentFunctionIsMain = isMain;
        this._variableTables.clear();
        this._variableTables.addLast(this._globalVariableTable);
        this._variableTables.addLast(new HashMap<String, VariableRecord>());
        this._currentFunctionReturnDataType = returnDataType;
    }
    
    public boolean isCurrentFunctionMain()
    {
        return this._currentFunctionIsMain;
    }
    
    public DataType getCurrentFunctionReturnDataType()
    {
        return this._currentFunctionReturnDataType;
    }
    
    public ArrayList<VariableRecord> getBlockDynamicVariableRecords()
    {
        ArrayList<VariableRecord> dynamicVariableRecords = new ArrayList<>();
        
        for (VariableRecord variableRecord : this._variableTables.peekLast().values())
        {
            if (variableRecord.getDataType() instanceof DynamicDataType)
            {
                dynamicVariableRecords.add(variableRecord);
            }
        }
        
        return dynamicVariableRecords;
    }
    
    public ArrayList<VariableRecord> getLocalDynamicVariableRecords()
    {
        ArrayList<VariableRecord> dynamicVariableRecords = new ArrayList<>();
        
        Iterator<HashMap<String, VariableRecord>> varTableIterator = this._variableTables.iterator();
        varTableIterator.next();
        
        while (varTableIterator.hasNext())
        {
            for (VariableRecord variableRecord : varTableIterator.next().values())
            {
                if (variableRecord.getDataType() instanceof DynamicDataType)
                {
                    dynamicVariableRecords.add(variableRecord);
                }
            }
        }
        
        return dynamicVariableRecords;
    }
    
    public ArrayList<VariableRecord> getGlobalDynamicVariableRecords()
    {
        ArrayList<VariableRecord> dynamicVariableRecords = new ArrayList<>();
        
        for (VariableRecord variableRecord : this._globalVariableTable.values())
        {
            if (variableRecord.getDataType() instanceof DynamicDataType)
            {
                dynamicVariableRecords.add(variableRecord);
            }
        }
        
        return dynamicVariableRecords;
    }
    
    public void enterBlock()
    {
        this._variableTables.addLast(new HashMap<String, VariableRecord>());
    }
    
    public void exitBlock()
    {
        this._variableTables.removeLast();
    }
}