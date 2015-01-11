declare void @arrcopy(i32*,i32*,i32)
declare i32 @readInt()
declare void @readString(i32*,i32)
declare void @printInt(i32)
declare void @printString(i32*,i32)
declare void @printIntSep(i32,i32*,i32)
declare void @printStringSep(i32*,i32,i32*,i32)
declare void @printLine()
define i32 @main() {
start:
%R1 = alloca i32
store i32 0, i32* %R1
%R0 = load i32* %R1
%R2 = call i32 @readInt()
store i32 %R2, i32* %R1
%R4 = load i32* %R1
%R5 = add i32 0, 1
%R6 = add i32 %R4, %R5
store i32 %R6, i32* %R1
%R9 = alloca i32, i32 1
%R10 = alloca i32
store i32 0, i32* %R10
%R11 = alloca i32
store i32 1, i32* %R11
%R12 = load i32* %R1
%R13 = getelementptr i32* %R9, i32 0
store i32 %R12, i32* %R13
%R14 = load i32* %R11
%R15 = mul i32 %R14, %R12
store i32 %R15, i32* %R11
%R16 = load i32* %R11
%R8 = alloca i32, i32 %R16
%R35 = add i32 0, 0
%R36 = load i32* %R1
%R18 = alloca i32
store i32 0, i32* %R18
%R17 = load i32* %R18
store i32 %R35, i32* %R18
br label %L0
L0:
%R37 = load i32* %R18
%R38 = icmp ne i32 %R36, %R37
br i1 %R38, label %L1, label %L2
L1:
%R19 = alloca i32
%R20 = load i32* %R11
store i32 %R20, i32* %R19
%R21 = alloca i32
store i32 0, i32* %R21
%R22 = load i32* %R18
%R23 = getelementptr i32* %R9, i32 0
%R27 = load i32* %R23
%R24 = add i32 0, %R22
%R25 = load i32* %R21
%R26 = add i32 %R25, %R24
store i32 %R26, i32* %R21
%R28 = load i32* %R19
%R29 = sdiv i32 %R28, %R27
store i32 %R29, i32* %R19
%R30 = add i32 0, 0
%R34 = load i32* %R21
%R33 = getelementptr i32* %R8, i32 %R34
store i32 %R30, i32* %R33
%R40 = load i32* %R18
%R39 = add i32 %R40, 1
store i32 %R39, i32* %R18
br label %L0
L2:
%R42 = add i32 0, 0
%R94 = add i32 0, 2
%R95 = load i32* %R1
%R43 = load i32* %R18
store i32 %R94, i32* %R18
br label %L8
L8:
%R96 = load i32* %R18
%R97 = icmp ne i32 %R95, %R96
br i1 %R97, label %L9, label %L10
L9:
%R44 = alloca i32
%R45 = load i32* %R11
store i32 %R45, i32* %R44
%R46 = alloca i32
store i32 0, i32* %R46
%R47 = load i32* %R18
%R48 = getelementptr i32* %R9, i32 0
%R52 = load i32* %R48
%R49 = add i32 0, %R47
%R50 = load i32* %R46
%R51 = add i32 %R50, %R49
store i32 %R51, i32* %R46
%R53 = load i32* %R44
%R54 = sdiv i32 %R53, %R52
store i32 %R54, i32* %R44
%R57 = load i32* %R46
%R56 = getelementptr i32* %R8, i32 %R57
%R58 = load i32* %R56
%R55 = add i32 0, 0
%R59 = icmp eq i32 %R58, %R55
%R60 = sext i1 %R59 to i32
%R93 = icmp ne i32 %R60, 0
br i1 %R93, label %L6, label %L7
L6:
%R61 = load i32* %R18
call void @printInt(i32 %R61)
call void @printLine()
%R63 = alloca i32
store i32 0, i32* %R63
%R62 = load i32* %R63
%R64 = load i32* %R18
store i32 %R64, i32* %R63
br label %L3
L3:
%R67 = load i32* %R63
%R68 = load i32* %R1
%R69 = icmp slt i32 %R67, %R68
%R70 = sext i1 %R69 to i32
%R90 = icmp ne i32 %R70, 0
br i1 %R90, label %L4, label %L5
L4:
%R72 = load i32* %R63
%R71 = load i32* %R18
%R73 = add i32 %R72, %R71
%R75 = alloca i32
%R76 = load i32* %R11
store i32 %R76, i32* %R75
%R77 = alloca i32
store i32 0, i32* %R77
%R78 = load i32* %R63
%R79 = getelementptr i32* %R9, i32 0
%R83 = load i32* %R79
%R80 = add i32 0, %R78
%R81 = load i32* %R77
%R82 = add i32 %R81, %R80
store i32 %R82, i32* %R77
%R84 = load i32* %R75
%R85 = sdiv i32 %R84, %R83
store i32 %R85, i32* %R75
store i32 %R73, i32* %R63
%R89 = load i32* %R77
%R88 = getelementptr i32* %R8, i32 %R89
store i32 %R73, i32* %R88
br label %L3
L5:
%R91 = add i32 0, 0
br label %L7
L7:
%R92 = add i32 0, 0
%R99 = load i32* %R18
%R98 = add i32 %R99, 1
store i32 %R98, i32* %R18
br label %L8
L10:
%R101 = add i32 0, 0
ret i32 0
}
