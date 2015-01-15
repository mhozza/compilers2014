declare i32 @printInt(i32)
declare i32 @printFloat(float)
declare i32 @printChar(i8)
declare i32 @printString(i32*)
declare i32 @readInt()
declare float @readFloat()
declare i8 @readChar()
declare i32 @iexp(i32, i32)
declare float @fexp(float, float)
declare i32 @floatToInt(float)
declare float @intToFloat(i32)
declare i32* @createIntArray(i32)
declare void @setArrayItemInt(i32*, i32, i32)
declare i32 @getArrayItemInt(i32*, i32)
declare i32* @createFloatArray(i32)
declare void @setArrayItemFloat(i32*, i32, float)
declare float @getArrayItemFloat(i32*, i32)
declare i32* @createCharArray(i32)
declare void @setArrayItemChar(i32*, i32, i8)
declare i8 @getArrayItemChar(i32*, i32)
declare i32* @createArrayType(i32)
declare void @setArrayItemType(i32*, i32, i32*)
declare i32* @getArrayItemType(i32*, i32)
declare i32 @sizeArrayInt(i32*)
declare i32 @sizeArrayFloat(i32*)
declare i32 @sizeArrayChar(i32*)
declare i32 @sizeArrayType(i32*)
define i32 @main() {
start:
%R0 = alloca i32
%R1 = call i32 @readInt()
store i32 %R1, i32* %R0
%R3 = alloca i32*
%R4 = load i32* %R0
%R5 = add i32 0, 1
%R6 = add i32 %R4, %R5
%R7 = call i32* @createIntArray(i32 %R6)
store i32* %R7, i32** %R3
%R9 = add i32 0, 0
%R8 = alloca i32
store i32 %R9, i32* %R8
br label %L2
L2:
%R10 = load i32* %R0
%R11 = add i32 0, 1
%R12 = add i32 %R10, %R11
%R19 = load i32* %R8
%R20 = icmp slt i32 %R19, %R12
br i1 %R20, label %L3, label %L1
L3:
%R13 = load i32** %R3
%R15 = load i32* %R8
%R16 = load i32* %R8
call void @setArrayItemInt(i32* %R13, i32 %R16, i32 %R15)
br label %L0
L0:
%R17 = load i32* %R8
%R18 = add i32 %R17, 1
%R21 = add i32 %R18, 0
store i32 %R21, i32* %R8
br label %L2
L1:
%R22 = add i32 0, 0
%R24 = add i32 0, 2
%R23 = alloca i32
store i32 %R24, i32* %R23
br label %L16
L16:
%R25 = load i32* %R0
%R26 = add i32 0, 1
%R27 = add i32 %R25, %R26
%R70 = load i32* %R23
%R71 = icmp slt i32 %R70, %R27
br i1 %R71, label %L17, label %L5
L17:
%R28 = load i32** %R3
%R30 = load i32* %R23
%R29 = call i32 @getArrayItemInt(i32* %R28, i32 %R30)
%R32 = add i32 0, 0
%R33 = icmp slt i32 %R29, %R32
br i1 %R33, label %L7, label %L8
L7:
br label %L4
br label %L6
L8:
br label %L6
L6:
%R35 = add i32 0, 0
%R36 = load i32* %R23
%R37 = call i32 @printInt(i32 %R36)
%R39 = load i32* %R23
%R38 = alloca i32
store i32 %R39, i32* %R38
br label %L14
L14:
%R40 = load i32* %R0
%R41 = add i32 0, 1
%R42 = add i32 %R40, %R41
%R64 = load i32* %R38
%R65 = icmp slt i32 %R64, %R42
br i1 %R65, label %L15, label %L10
L15:
%R43 = load i32** %R3
%R45 = load i32* %R38
%R44 = call i32 @getArrayItemInt(i32* %R43, i32 %R45)
%R47 = add i32 0, 0
%R48 = icmp sgt i32 %R44, %R47
br i1 %R48, label %L12, label %L13
L12:
%R49 = load i32** %R3
%R51 = load i32** %R3
%R53 = load i32* %R38
%R52 = call i32 @getArrayItemInt(i32* %R51, i32 %R53)
%R55 = add i32 0, 1
%R56 = sub i32 0, %R55
%R57 = mul i32 %R52, %R56
%R58 = load i32* %R38
call void @setArrayItemInt(i32* %R49, i32 %R58, i32 %R57)
br label %L11
L13:
br label %L11
L11:
%R60 = add i32 0, 0
br label %L9
L9:
%R61 = load i32* %R38
%R62 = load i32* %R23
%R63 = add i32 %R61, %R62
%R66 = add i32 %R63, 0
store i32 %R66, i32* %R38
br label %L14
L10:
%R67 = add i32 0, 0
br label %L4
L4:
%R68 = load i32* %R23
%R69 = add i32 %R68, 1
%R72 = add i32 %R69, 0
store i32 %R72, i32* %R23
br label %L16
L5:
%R73 = add i32 0, 0
ret i32 0
}
