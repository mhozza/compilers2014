declare void @llvm.memcpy.p0i32.p0i32.i32(i32*,i32*,i32,i32,i1)
declare i32 @readInt()
declare void @readString(i32*,i32)
declare void @printInt(i32)
declare void @printString(i32*,i32)
declare void @printIntSep(i32,i32*,i32)
declare void @printStringSep(i32*,i32,i32*,i32)
declare void @printLine()
define i32 @p(i32* %R9) {
start:
%R1 = alloca i32, i32 1
%R2 = alloca i32
store i32 0, i32* %R2
%R3 = alloca i32
store i32 1, i32* %R3
%R4 = add i32 0, 10
%R5 = getelementptr i32* %R1, i32 0
store i32 %R4, i32* %R5
%R6 = load i32* %R3
%R7 = mul i32 %R6, %R4
store i32 %R7, i32* %R3
%R8 = load i32* %R3
%R0 = alloca i32, i32 %R8
%R26 = add i32 0, 9
%R27 = add i32 0, 1
%R28 = sub i32 0, %R27
%R11 = alloca i32
store i32 0, i32* %R11
%R10 = load i32* %R11
store i32 %R26, i32* %R11
br label %L0
L0:
%R29 = load i32* %R11
%R30 = icmp ne i32 %R28, %R29
br i1 %R30, label %L1, label %L2
L1:
%R12 = alloca i32
%R13 = load i32* %R3
store i32 %R13, i32* %R12
%R14 = alloca i32
store i32 0, i32* %R14
%R15 = load i32* %R11
%R16 = getelementptr i32* %R1, i32 0
%R20 = load i32* %R16
%R17 = add i32 0, %R15
%R18 = load i32* %R14
%R19 = add i32 %R18, %R17
store i32 %R19, i32* %R14
%R21 = load i32* %R12
%R22 = sdiv i32 %R21, %R20
store i32 %R22, i32* %R12
%R24 = load i32* %R14
%R23 = getelementptr i32* %R0, i32 %R24
%R25 = load i32* %R23
call void @printInt(i32 %R25)
call void @printLine()
%R32 = load i32* %R11
%R31 = sub i32 %R32, 1
store i32 %R31, i32* %R11
br label %L0
L2:
%R34 = add i32 0, 0
ret i32 0
}
define i32 @main() {
start:
%R36 = alloca i32, i32 1
%R37 = alloca i32
store i32 0, i32* %R37
%R38 = alloca i32
store i32 1, i32* %R38
%R39 = add i32 0, 10
%R40 = getelementptr i32* %R36, i32 0
store i32 %R39, i32* %R40
%R41 = load i32* %R38
%R42 = mul i32 %R41, %R39
store i32 %R42, i32* %R38
%R43 = load i32* %R38
%R35 = alloca i32, i32 %R43
%R62 = add i32 0, 0
%R63 = add i32 0, 10
%R45 = alloca i32
store i32 0, i32* %R45
%R44 = load i32* %R45
store i32 %R62, i32* %R45
br label %L3
L3:
%R64 = load i32* %R45
%R65 = icmp ne i32 %R63, %R64
br i1 %R65, label %L4, label %L5
L4:
%R46 = alloca i32
%R47 = load i32* %R38
store i32 %R47, i32* %R46
%R48 = alloca i32
store i32 0, i32* %R48
%R49 = load i32* %R45
%R50 = getelementptr i32* %R36, i32 0
%R54 = load i32* %R50
%R51 = add i32 0, %R49
%R52 = load i32* %R48
%R53 = add i32 %R52, %R51
store i32 %R53, i32* %R48
%R55 = load i32* %R46
%R56 = sdiv i32 %R55, %R54
store i32 %R56, i32* %R46
%R57 = load i32* %R45
%R61 = load i32* %R48
%R60 = getelementptr i32* %R35, i32 %R61
store i32 %R57, i32* %R60
%R67 = load i32* %R45
%R66 = add i32 %R67, 1
store i32 %R66, i32* %R45
br label %L3
L5:
%R69 = add i32 0, 0
%R70 = alloca i32
%R71 = load i32* %R38
store i32 %R71, i32* %R70
%R72 = alloca i32
store i32 0, i32* %R72
%R73 = call i32 @p(i32* %R35)
ret i32 0
}
