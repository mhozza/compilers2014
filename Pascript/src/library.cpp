#include <iostream>
#include <cmath>
#include <algorithm>
#include <string>
#include <vector>

#define TRUE_STR "true"
#define FALSE_STR "false"

typedef bool TBoolean;
typedef long TInteger;
typedef double TFloat;

typedef char TChar;
typedef TChar* TString;

typedef void* TArray;

// Helper String Functions

TString stdStringToTString(std::string value)
{
    TString newValue = new TChar[value.length() + 1];
    const char* originalValue = value.c_str();
    size_t valueLength = value.length();
    for (size_t i = 0; i < valueLength; i++)
    {
        newValue[i] = originalValue[i];
    }
    newValue[valueLength] = 0;
    return newValue;
}
TString allocateTString()
{
    return stdStringToTString(std::string());
}
void deallocateTString(TString variable)
{
    delete[] variable;
}
TString copyTString(TString variable)
{
    return stdStringToTString(std::string(variable));
}
TInteger compareTString(TString variableA, TString variableB)
{
    return (TInteger)std::string(variableA).compare(std::string(variableB));
}

// Helper Array Functions

template <typename Type> TArray allocateTArray(TInteger dimensionCount)
{
    if (dimensionCount > 1)
    {
        return (TArray)(new std::vector<TArray>());
    }
    return (TArray)(new std::vector<Type>());
}

template <typename Type> void deallocateTArray(TArray variable, TInteger dimensionCount)
{
    if (dimensionCount > 1)
    {
        std::vector<TArray>* arrayVector = (std::vector<TArray>*)variable;
        for (size_t i = 0; i < arrayVector->size(); i++)
        {
            deallocateTArray<Type>((*arrayVector)[i], dimensionCount - 1);
        }
        delete arrayVector;
        return;
    }
    std::vector<Type>* typeVector = (std::vector<Type>*)variable;
    delete typeVector;
}
void deallocateTArrayTString(TArray variable, TInteger dimensionCount)
{
    if (dimensionCount > 1)
    {
        std::vector<TArray>* arrayVector = (std::vector<TArray>*)variable;
        for (size_t i = 0; i < arrayVector->size(); i++)
        {
            deallocateTArrayTString((*arrayVector)[i], dimensionCount - 1);
        }
        delete arrayVector;
        return;
    }
    std::vector<TString>* stringVector = (std::vector<TString>*)variable;
    for (size_t i = 0; i < stringVector->size(); i++)
    {
        deallocateTString((*stringVector)[i]);
    }
    delete stringVector;
}

template <typename Type> TArray copyTArray(TArray variable, TInteger dimensionCount)
{
    if (dimensionCount > 1)
    {
        std::vector<TArray>* arrayVector = (std::vector<TArray>*)variable;

        std::vector<TArray>* newArrayVector = (std::vector<TArray>*)allocateTArray<Type>(dimensionCount);
        newArrayVector->resize(arrayVector->size());

        for (size_t i = 0; i < newArrayVector->size(); i++)
        {
            (*newArrayVector)[i] = copyTArray<Type>((*arrayVector)[i], dimensionCount - 1);
        }

        return (TArray)newArrayVector;
    }

    std::vector<Type>* typeVector = (std::vector<Type>*)variable;

    std::vector<Type>* newTypeVector = (std::vector<Type>*)allocateTArray<Type>(dimensionCount);
    newTypeVector->resize(typeVector->size());

    for (size_t i = 0; i < newTypeVector->size(); i++)
    {
        (*newTypeVector)[i] = (*typeVector)[i];
    }

    return (TArray)newTypeVector;
}
TArray copyTArrayTString(TArray variable, TInteger dimensionCount)
{
    if (dimensionCount > 1)
    {
        std::vector<TArray>* arrayVector = (std::vector<TArray>*)variable;

        std::vector<TArray>* newArrayVector = (std::vector<TArray>*)allocateTArray<TString>(dimensionCount);
        newArrayVector->resize(arrayVector->size());

        for (size_t i = 0; i < newArrayVector->size(); i++)
        {
            (*newArrayVector)[i] = copyTArrayTString((*arrayVector)[i], dimensionCount - 1);
        }

        return (TArray)newArrayVector;
    }

    std::vector<TString>* stringVector = (std::vector<TString>*)variable;

    std::vector<TString>* newStringVector = (std::vector<TString>*)allocateTArray<TString>(dimensionCount);
    newStringVector->resize(stringVector->size());

    for (size_t i = 0; i < newStringVector->size(); i++)
    {
        (*newStringVector)[i] = copyTString((*stringVector)[i]);
    }

    return (TArray)newStringVector;
}

template <typename Type> Type getValueTArray(TArray variable, TInteger position)
{
    std::vector<Type>* typeVector = (std::vector<Type>*)variable;
    return (*typeVector)[position];
}
TString getValueTArrayTString(TArray variable, TInteger position)
{
    std::vector<TString>* stringVector = (std::vector<TString>*)variable;
    return copyTString((*stringVector)[position]);
}

template <typename Type> TArray getArrayTArray(TArray variable, TInteger dimensionCount, TInteger position)
{
    std::vector<TArray>* arrayVector = (std::vector<TArray>*)variable;
    return copyTArray<Type>((*arrayVector)[position], dimensionCount - 1);
}
TArray getArrayTArrayTString(TArray variable, TInteger dimensionCount, TInteger position)
{
    std::vector<TArray>* arrayVector = (std::vector<TArray>*)variable;
    return copyTArrayTString((*arrayVector)[position], dimensionCount - 1);
}

template <typename Type> void setValueTArray(TArray variable, TInteger position, Type value)
{
    std::vector<Type>* typeVector = (std::vector<Type>*)variable;
    (*typeVector)[position] = value;
}
void setValueTArrayTString(TArray variable, TInteger position, TString value)
{
    std::vector<TString>* stringVector = (std::vector<TString>*)variable;
    deallocateTString((*stringVector)[position]);
    (*stringVector)[position] = copyTString(value);
}

template <typename Type> void setArrayTArray(TArray variable, TInteger dimensionCount, TInteger position, TArray value)
{
    std::vector<TArray>* arrayVector = (std::vector<TArray>*)variable;
    deallocateTArray<Type>((*arrayVector)[position], dimensionCount - 1);
    (*arrayVector)[position] = copyTArray<Type>(value, dimensionCount - 1);
}
void setArrayTArrayTString(TArray variable, TInteger dimensionCount, TInteger position, TArray value)
{
    std::vector<TArray>* arrayVector = (std::vector<TArray>*)variable;
    deallocateTArrayTString((*arrayVector)[position], dimensionCount - 1);
    (*arrayVector)[position] = copyTArrayTString(value, dimensionCount - 1);
}

template <typename Type> void insertValueTArray(TArray variable, TInteger position, Type value)
{
    std::vector<Type>* typeVector = (std::vector<Type>*)variable;
    typeVector->insert(typeVector->begin() + position, value);
}
void insertValueTArrayTString(TArray variable, TInteger position, TString value)
{
    std::vector<TString>* stringVector = (std::vector<TString>*)variable;
    stringVector->insert(stringVector->begin() + position, copyTString(value));
}
template <typename Type> void insertArrayTArray(TArray variable, TInteger dimensionCount, TInteger position, TArray value)
{
    std::vector<TArray>* arrayVector = (std::vector<TArray>*)variable;
    arrayVector->insert(arrayVector->begin() + position, copyTArray<Type>(value, dimensionCount - 1));
}
void insertArrayTArrayTString(TArray variable, TInteger dimensionCount, TInteger position, TArray value)
{
    std::vector<TArray>* arrayVector = (std::vector<TArray>*)variable;
    arrayVector->insert(arrayVector->begin() + position, copyTArrayTString(value, dimensionCount - 1));
}

template <typename Type> void removeTArray(TArray variable, TInteger dimensionCount, TInteger position)
{
    if (dimensionCount > 1)
    {
        std::vector<TArray>* arrayVector = (std::vector<TArray>*)variable;
        deallocateTArray<Type>((*arrayVector)[position], dimensionCount - 1);
        arrayVector->erase(arrayVector->begin() + position);
        return;
    }
    std::vector<Type>* typeVector = (std::vector<Type>*)variable;
    typeVector->erase(typeVector->begin() + position);
}
void removeTArrayTString(TArray variable, TInteger dimensionCount, TInteger position)
{
    if (dimensionCount > 1)
    {
        std::vector<TArray>* arrayVector = (std::vector<TArray>*)variable;
        deallocateTArrayTString((*arrayVector)[position], dimensionCount - 1);
        arrayVector->erase(arrayVector->begin() + position);
        return;
    }
    std::vector<TString>* stringVector = (std::vector<TString>*)variable;
    deallocateTString((*stringVector)[position]);
    stringVector->erase(stringVector->begin() + position);
}

template <typename Type> TInteger sizeTArray(TArray variable)
{
    std::vector<Type>* typeVector = (std::vector<Type>*)variable;
    return (TInteger)typeVector->size();
}

template <typename Type> void resizeTArray(TArray variable, TInteger dimensionCount, size_t newSize)
{
    if (dimensionCount > 1)
    {
        std::vector<TArray>* arrayVector = (std::vector<TArray>*)variable;
        size_t oldSize = arrayVector->size();
        
        for (size_t i = newSize; i < oldSize; i++)
        {
            deallocateTArray<Type>((*arrayVector)[i], dimensionCount - 1);
        }
        arrayVector->resize(newSize);
        for (size_t i = oldSize; i < newSize; i++)
        {
            (*arrayVector)[i] = allocateTArray<Type>(dimensionCount - 1);
        }
        return;
    }
    std::vector<Type>* typeVector = (std::vector<Type>*)variable;
    typeVector->resize(newSize);
}
void resizeTArrayTString(TArray variable, TInteger dimensionCount, size_t newSize)
{
    if (dimensionCount > 1)
    {
        std::vector<TArray>* arrayVector = (std::vector<TArray>*)variable;
        size_t oldSize = arrayVector->size();
        
        for (size_t i = newSize; i < oldSize; i++)
        {
            deallocateTArrayTString((*arrayVector)[i], dimensionCount - 1);
        }
        arrayVector->resize(newSize);
        for (size_t i = oldSize; i < newSize; i++)
        {
            (*arrayVector)[i] = allocateTArray<TString>(dimensionCount - 1);
        }
        return;
    }
    std::vector<TString>* stringVector = (std::vector<TString>*)variable;
    size_t oldSize = stringVector->size();
    
    for (size_t i = newSize; i < oldSize; i++)
    {
        deallocateTString((*stringVector)[i]);
    }
    stringVector->resize(newSize);
    for (size_t i = oldSize; i < newSize; i++)
    {
        (*stringVector)[i] = allocateTString();
    }
}

template <typename Type> TArray mergeTArray(TArray variableA, TArray variableB, TInteger dimensionCount)
{
    if (dimensionCount > 1)
    {
        std::vector<TArray>* arrayVectorA = (std::vector<TArray>*)variableA;
        TInteger sizeA = arrayVectorA->size();
        std::vector<TArray>* arrayVectorB = (std::vector<TArray>*)variableB;
        TInteger sizeB = arrayVectorB->size();
        
        std::vector<TArray>* newArrayVector = (std::vector<TArray>*)allocateTArray<Type>(dimensionCount);
        newArrayVector->resize(sizeA + sizeB);
        
        for (int i = 0; i < sizeA; i++)
        {
            (*newArrayVector)[i] = copyTArray<Type>((*arrayVectorA)[i], dimensionCount - 1);
        }
        for (int i = 0; i < sizeB; i++)
        {
            (*newArrayVector)[i + sizeA] = copyTArray<Type>((*arrayVectorB)[i], dimensionCount - 1);
        }
        return (TArray)newArrayVector;
    }
    std::vector<Type>* typeVectorA = (std::vector<Type>*)variableA;
    TInteger sizeA = typeVectorA->size();
    std::vector<Type>* typeVectorB = (std::vector<Type>*)variableB;
    TInteger sizeB = typeVectorB->size();

    std::vector<Type>* newTypeVector = (std::vector<Type>*)allocateTArray<Type>(dimensionCount);
    newTypeVector->resize(sizeA + sizeB);

    for (int i = 0; i < sizeA; i++)
    {
        (*newTypeVector)[i] = (*typeVectorA)[i];
    }
    for (int i = 0; i < sizeB; i++)
    {
        (*newTypeVector)[i + sizeA] = (*typeVectorB)[i];
    }
    return (TArray)newTypeVector;
}
TArray mergeTArrayTString(TArray variableA, TArray variableB, TInteger dimensionCount)
{
    if (dimensionCount > 1)
    {
        std::vector<TArray>* arrayVectorA = (std::vector<TArray>*)variableA;
        TInteger sizeA = arrayVectorA->size();
        std::vector<TArray>* arrayVectorB = (std::vector<TArray>*)variableB;
        TInteger sizeB = arrayVectorB->size();
        
        std::vector<TArray>* newArrayVector = (std::vector<TArray>*)allocateTArray<TString>(dimensionCount);
        newArrayVector->resize(sizeA + sizeB);
        
        for (int i = 0; i < sizeA; i++)
        {
            (*newArrayVector)[i] = copyTArrayTString((*arrayVectorA)[i], dimensionCount - 1);
        }
        for (int i = 0; i < sizeB; i++)
        {
            (*newArrayVector)[i + sizeA] = copyTArrayTString((*arrayVectorB)[i], dimensionCount - 1);
        }
        return (TArray)newArrayVector;
    }
    std::vector<TString>* stringVectorA = (std::vector<TString>*)variableA;
    TInteger sizeA = stringVectorA->size();
    std::vector<TString>* stringVectorB = (std::vector<TString>*)variableB;
    TInteger sizeB = stringVectorB->size();

    std::vector<TString>* newStringVector = (std::vector<TString>*)allocateTArray<TString>(dimensionCount);
    newStringVector->resize(sizeA + sizeB);

    for (int i = 0; i < sizeA; i++)
    {
        (*newStringVector)[i] = copyTString((*stringVectorA)[i]);
    }
    for (int i = 0; i < sizeB; i++)
    {
        (*newStringVector)[i + sizeA] = copyTString((*stringVectorB)[i]);
    }
    return (TArray)newStringVector;
}

template <typename Type> TBoolean equalsTArray(TArray variableA, TArray variableB, TInteger dimensionCount)
{
    if (dimensionCount > 1)
    {
        std::vector<TArray>* arrayVectorA = (std::vector<TArray>*)variableA;
        TInteger sizeA = arrayVectorA->size();
        std::vector<TArray>* arrayVectorB = (std::vector<TArray>*)variableB;
        TInteger sizeB = arrayVectorB->size();
        
        if (sizeA != sizeB)
        {
            return (TBoolean)false;
        }
        
        for (TInteger i = 0; i < sizeA; i++)
        {
            if (equalsTArray<Type>((*arrayVectorA)[i], (*arrayVectorB)[i], dimensionCount - 1) == (TBoolean)false)
            {
                return (TBoolean)false;
            }
        }
        return (TBoolean)true;
    }
    
    std::vector<Type>* typeVectorA = (std::vector<Type>*)variableA;
    TInteger sizeA = typeVectorA->size();
    std::vector<Type>* typeVectorB = (std::vector<Type>*)variableB;
    TInteger sizeB = typeVectorB->size();
    
    if (sizeA != sizeB)
    {
        return (TBoolean)false;
    }
    
    for (TInteger i = 0; i < sizeA; i++)
    {
        if ((*typeVectorA)[i] != (*typeVectorB)[i])
        {
            return (TBoolean)false;
        }
    }
    return (TBoolean)true;
}
TBoolean equalsTArrayTString(TArray variableA, TArray variableB, TInteger dimensionCount)
{
    if (dimensionCount > 1)
    {
        std::vector<TArray>* arrayVectorA = (std::vector<TArray>*)variableA;
        TInteger sizeA = arrayVectorA->size();
        std::vector<TArray>* arrayVectorB = (std::vector<TArray>*)variableB;
        TInteger sizeB = arrayVectorB->size();
        
        if (sizeA != sizeB)
        {
            return (TBoolean)false;
        }
        
        for (TInteger i = 0; i < sizeA; i++)
        {
            if (equalsTArrayTString((*arrayVectorA)[i], (*arrayVectorB)[i], dimensionCount - 1) == (TBoolean)false)
            {
                return (TBoolean)false;
            }
        }
        return (TBoolean)true;
    }
    
    std::vector<TString>* stringVectorA = (std::vector<TString>*)variableA;
    TInteger sizeA = stringVectorA->size();
    std::vector<TString>* stringVectorB = (std::vector<TString>*)variableB;
    TInteger sizeB = stringVectorB->size();
    
    if (sizeA != sizeB)
    {
        return (TBoolean)false;
    }
    
    for (TInteger i = 0; i < sizeA; i++)
    {
        if (compareTString((*stringVectorA)[i], (*stringVectorB)[i]) != (TInteger)0)
        {
            return (TBoolean)false;
        }
    }
    return (TBoolean)true;
}

extern "C"
{
    ////// Boolean functions //////

    // Boolean IO
    TBoolean __pascript__booleanRead()
    {
        TBoolean value;
        std::cin >> value;
        return value;
    }
    void __pascript__booleanPrint(TBoolean value)
    {
        std::cout << (value ? TRUE_STR : FALSE_STR) << std::endl;
    }
    
    // Boolean Conversions
    TInteger __pascript__booleanToInteger(TBoolean value)
    {
        return (TInteger)value;
    }
    TFloat __pascript__booleanToFloat(TBoolean value)
    {
        return (TFloat)value;
    }
    TString __pascript__booleanToString(TBoolean value)
    {
        return stdStringToTString(std::string(value ? TRUE_STR : FALSE_STR));
    }
    
    ////// Integer functions //////
    
    // Integer IO
    TInteger __pascript__integerRead()
    {
        TInteger value;
        std::cin >> value;
        return value;
    }
    void __pascript__integerPrint(TInteger value)
    {
        std::cout << value << std::endl;
    }
    
    // Integer Conversions
    TBoolean __pascript__integerToBoolean(TInteger value)
    {
        return (TBoolean)(value != 0);
    }
    TFloat __pascript__integerToFloat(TInteger value)
    {
        return (TFloat)value;
    }
    TString __pascript__integerToString(TInteger value)
    {
        return stdStringToTString(std::to_string(value));
    }
    
    ////// Float functions //////
        
    // Float IO
    TFloat __pascript__floatRead()
    {
        TFloat value;
        std::cin >> value;
        return value;
    }
    void __pascript__floatPrint(TFloat value)
    {
        std::cout << value << std::endl;
    }
    
    // Float Conversions
    TBoolean __pascript__floatToBoolean(TFloat value)
    {
        return (TBoolean)(value != 0.0);
    }
    TInteger __pascript__floatToInteger(TFloat value)
    {
        return (TInteger)value;
    }
    TString __pascript__floatToString(TFloat value)
    {
        return stdStringToTString(std::to_string(value));
    }
    
    ////// String functions //////
    
    // String Memory Management
    TString __pascript__stringAllocate()
    {
        return allocateTString();
    }
    void __pascript__stringDeallocate(TString variable)
    {
        deallocateTString(variable);
    }
    TString __pascript__stringCopy(TString variable)
    {
        return copyTString(variable);
    }
    
    // String IO
    TString __pascript__stringRead()
    {
        std::string value;
        std::cin >> value;
        return stdStringToTString(value);
    }
    void __pascript__stringPrint(TString variable)
    {
        std::cout << std::string(variable) << std::endl;
    }

    // String Conversions
    TBoolean __pascript__stringToBoolean(TString variable)
    {
        std::string stringValue = std::string(variable);
        std::transform(stringValue.begin(), stringValue.end(), stringValue.begin(), ::tolower);
        return stringValue.compare(std::string(TRUE_STR)) == 0;
    }
    TInteger __pascript__stringToInteger(TString variable)
    {
        return std::stol(std::string(variable));
    }
    TFloat __pascript__stringToFloat(TString variable)
    {
        return std::stod(std::string(variable));
    }

    // String Operations
    TString __pascript__stringAt(TString variable, TInteger position)
    {
        return stdStringToTString(std::string(1, std::string(variable)[position]));
    }
    TInteger __pascript__stringLength(TString variable)
    {
        return (TInteger)std::string(variable).length();
    }
    TString __pascript__stringConcatenate(TString variableA, TString variableB)
    {
        return stdStringToTString(std::string(variableA) + std::string(variableB));
    }
    TInteger __pascript__stringCompare(TString variableA, TString variableB)
    {
        return (TInteger)compareTString(variableA, variableB);
    }
    TInteger __pascript__stringFind(TString variable, TString subject)
    {
        return (TInteger)std::string(variable).find(std::string(subject));
    }
    TString __pascript__stringSubstring(TString variable, TInteger position, TInteger length)
    {
        return stdStringToTString(std::string(variable).substr(position, length));
    }

    ////// Array functions //////
    
    // Array Allocate Operation
    TArray __pascript__booleanArrayAllocate(TInteger dimensionCount)
    {
        return allocateTArray<TBoolean>(dimensionCount);
    }
    TArray __pascript__integerArrayAllocate(TInteger dimensionCount)
    {
        return allocateTArray<TInteger>(dimensionCount);
    }
    TArray __pascript__floatArrayAllocate(TInteger dimensionCount)
    {
        return allocateTArray<TFloat>(dimensionCount);
    }
    TArray __pascript__stringArrayAllocate(TInteger dimensionCount)
    {
        return allocateTArray<TString>(dimensionCount);
    }
    
    // Array Deallocate Operation
    void __pascript__booleanArrayDeallocate(TArray variable, TInteger dimensionCount)
    {
        deallocateTArray<TBoolean>(variable, dimensionCount);
    }
    void __pascript__integerArrayDeallocate(TArray variable, TInteger dimensionCount)
    {
        deallocateTArray<TInteger>(variable, dimensionCount);
    }
    void __pascript__floatArrayDeallocate(TArray variable, TInteger dimensionCount)
    {
        deallocateTArray<TFloat>(variable, dimensionCount);
    }
    void __pascript__stringArrayDeallocate(TArray variable, TInteger dimensionCount)
    {
        deallocateTArrayTString(variable, dimensionCount);
    }
    
    // Array Copy Operation
    TArray __pascript__booleanArrayCopy(TArray variable, TInteger dimensionCount)
    {
        return copyTArray<TBoolean>(variable, dimensionCount);
    }
    TArray __pascript__integerArrayCopy(TArray variable, TInteger dimensionCount)
    {
        return copyTArray<TInteger>(variable, dimensionCount);
    }
    TArray __pascript__floatArrayCopy(TArray variable, TInteger dimensionCount)
    {
        return copyTArray<TFloat>(variable, dimensionCount);
    }
    TArray __pascript__stringArrayCopy(TArray variable, TInteger dimensionCount)
    {
        return copyTArrayTString(variable, dimensionCount);
    }
    
    // Array Get Operation
    TBoolean __pascript__booleanArrayGetValue(TArray variable, TInteger position)
    {
        return getValueTArray<TBoolean>(variable, position);
    }
    TInteger __pascript__integerArrayGetValue(TArray variable, TInteger position)
    {
        return getValueTArray<TInteger>(variable, position);
    }
    TFloat __pascript__floatArrayGetValue(TArray variable, TInteger position)
    {
        return getValueTArray<TFloat>(variable, position);
    }
    TString __pascript__stringArrayGetValue(TArray variable, TInteger position)
    {
        return getValueTArrayTString(variable, position);
    }
    TArray __pascript__booleanArrayGetArray(TArray variable, TInteger dimensionCount, TInteger position)
    {
        return getArrayTArray<TBoolean>(variable, dimensionCount, position);
    }
    TArray __pascript__integerArrayGetArray(TArray variable, TInteger dimensionCount, TInteger position)
    {
        return getArrayTArray<TInteger>(variable, dimensionCount, position);
    }
    TArray __pascript__floatArrayGetArray(TArray variable, TInteger dimensionCount, TInteger position)
    {
        return getArrayTArray<TFloat>(variable, dimensionCount, position);
    }
    TArray __pascript__stringArrayGetArray(TArray variable, TInteger dimensionCount, TInteger position)
    {
        return getArrayTArrayTString(variable, dimensionCount, position);
    }
    
    // Array Set Operation
    void __pascript__booleanArraySetValue(TArray variable, TInteger position, TBoolean value)
    {
        setValueTArray<TBoolean>(variable, position, value);
    }
    void __pascript__integerArraySetValue(TArray variable, TInteger position, TInteger value)
    {
        setValueTArray<TInteger>(variable, position, value);
    }
    void __pascript__floatArraySetValue(TArray variable, TInteger position, TFloat value)
    {
        setValueTArray<TFloat>(variable, position, value);
    }
    void __pascript__stringArraySetValue(TArray variable, TInteger position, TString value)
    {
        setValueTArrayTString(variable, position, value);
    }
    void __pascript__booleanArraySetArray(TArray variable, TInteger dimensionCount, TInteger position, TArray value)
    {
        setArrayTArray<TBoolean>(variable, dimensionCount, position, value);
    }
    void __pascript__integerArraySetArray(TArray variable, TInteger dimensionCount, TInteger position, TArray value)
    {
        setArrayTArray<TInteger>(variable, dimensionCount, position, value);
    }
    void __pascript__floatArraySetArray(TArray variable, TInteger dimensionCount, TInteger position, TArray value)
    {
        setArrayTArray<TFloat>(variable, dimensionCount, position, value);
    }
    void __pascript__stringArraySetArray(TArray variable, TInteger dimensionCount, TInteger position, TArray value)
    {
        setArrayTArrayTString(variable, dimensionCount, position, value);
    }
    
    // Array Insert Operation
    void __pascript__booleanArrayInsertValue(TArray variable, TInteger position, TBoolean value)
    {
        insertValueTArray<TBoolean>(variable, position, value);
    }
    void __pascript__integerArrayInsertValue(TArray variable, TInteger position, TInteger value)
    {
        insertValueTArray<TInteger>(variable, position, value);
    }
    void __pascript__floatArrayInsertValue(TArray variable, TInteger position, TFloat value)
    {
        insertValueTArray<TFloat>(variable, position, value);
    }
    void __pascript__stringArrayInsertValue(TArray variable, TInteger position, TString value)
    {
        insertValueTArrayTString(variable, position, value);
    }
    void __pascript__booleanArrayInsertArray(TArray variable, TInteger dimensionCount, TInteger position, TArray value)
    {
        insertArrayTArray<TBoolean>(variable, dimensionCount, position, value);
    }
    void __pascript__integerArrayInsertArray(TArray variable, TInteger dimensionCount, TInteger position, TArray value)
    {
        insertArrayTArray<TInteger>(variable, dimensionCount, position, value);
    }
    void __pascript__floatArrayInsertArray(TArray variable, TInteger dimensionCount, TInteger position, TArray value)
    {
        insertArrayTArray<TFloat>(variable, dimensionCount, position, value);
    }
    void __pascript__stringArrayInsertArray(TArray variable, TInteger dimensionCount, TInteger position, TArray value)
    {
        insertArrayTArrayTString(variable, dimensionCount, position, value);
    }
    
    // Array Remove Operation
    void __pascript__booleanArrayRemove(TArray variable, TInteger dimensionCount, TInteger position)
    {
        removeTArray<TBoolean>(variable, dimensionCount, position);
    }
    void __pascript__integerArrayRemove(TArray variable, TInteger dimensionCount, TInteger position)
    {
        removeTArray<TInteger>(variable, dimensionCount, position);
    }
    void __pascript__floatArrayRemove(TArray variable, TInteger dimensionCount, TInteger position)
    {
        removeTArray<TFloat>(variable, dimensionCount, position);
    }
    void __pascript__stringArrayRemove(TArray variable, TInteger dimensionCount, TInteger position)
    {
        removeTArrayTString(variable, dimensionCount, position);
    }
    
    // Array Size Operation
    TInteger __pascript__booleanArraySize(TArray variable)
    {
        return sizeTArray<TBoolean>(variable);
    }
    TInteger __pascript__integerArraySize(TArray variable)
    {
        return sizeTArray<TInteger>(variable);
    }
    TInteger __pascript__floatArraySize(TArray variable)
    {
        return sizeTArray<TFloat>(variable);
    }
    TInteger __pascript__stringArraySize(TArray variable)
    {
        return sizeTArray<TString>(variable);
    }
    TInteger __pascript__arrayArraySize(TArray variable)
    {
        return sizeTArray<TArray>(variable);
    }
    
    // Array Resize Operation
    void __pascript__booleanArrayResize(TArray variable, TInteger dimensionCount, TInteger newSize)
    {
        resizeTArray<TBoolean>(variable, dimensionCount, (size_t)newSize);
    }
    void __pascript__integerArrayResize(TArray variable, TInteger dimensionCount, TInteger newSize)
    {
        resizeTArray<TInteger>(variable, dimensionCount, (size_t)newSize);
    }
    void __pascript__floatArrayResize(TArray variable, TInteger dimensionCount, TInteger newSize)
    {
        resizeTArray<TFloat>(variable, dimensionCount, (size_t)newSize);
    }
    void __pascript__stringArrayResize(TArray variable, TInteger dimensionCount, TInteger newSize)
    {
        resizeTArrayTString(variable, dimensionCount, (size_t)newSize);
    }
    
    // Array Merge Operation
    TArray __pascript__booleanArrayMerge(TArray variableA, TArray variableB, TInteger dimensionCount)
    {
        return mergeTArray<TBoolean>(variableA, variableB, dimensionCount);
    }
    TArray __pascript__integerArrayMerge(TArray variableA, TArray variableB, TInteger dimensionCount)
    {
        return mergeTArray<TInteger>(variableA, variableB, dimensionCount);
    }
    TArray __pascript__floatArrayMerge(TArray variableA, TArray variableB, TInteger dimensionCount)
    {
        return mergeTArray<TFloat>(variableA, variableB, dimensionCount);
    }
    TArray __pascript__stringArrayMerge(TArray variableA, TArray variableB, TInteger dimensionCount)
    {
        return mergeTArrayTString(variableA, variableB, dimensionCount);
    }
    
    // Array Equals Operation
    TBoolean __pascript__booleanArrayEquals(TArray variableA, TArray variableB, TInteger dimensionCount)
    {
        return equalsTArray<TBoolean>(variableA, variableB, dimensionCount);
    }
    TBoolean __pascript__integerArrayEquals(TArray variableA, TArray variableB, TInteger dimensionCount)
    {
        return equalsTArray<TInteger>(variableA, variableB, dimensionCount);
    }
    TBoolean __pascript__floatArrayEquals(TArray variableA, TArray variableB, TInteger dimensionCount)
    {
        return equalsTArray<TFloat>(variableA, variableB, dimensionCount);
    }
    TBoolean __pascript__stringArrayEquals(TArray variableA, TArray variableB, TInteger dimensionCount)
    {
        return equalsTArrayTString(variableA, variableB, dimensionCount);
    }
}