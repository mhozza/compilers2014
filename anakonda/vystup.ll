declare i32 @printInt(i32)
declare i32 @readInt()
declare i8* @createArrayInt (i32)
declare void @setArrayItemInt (i8*, i32, i32)
declare i32 @getArrayItemInt (i8*, i32)
declare i8* @mergeArraysInt (i8*, i8*)
declare i8* @multiplyArrayInt (i8*, i32)
declare i32 @sizeArrayInt (i8*)
declare i32 @iexp(i32, i32)
define i32 @Check(i8* %R38, i32 %R40) {
start:
%R37 = alloca i8*
store i8* %R38, i8** %R37
%R39 = alloca i32
store i32 %R40, i32* %R39
%R42 = load i8** %R37
%R43 = add i32 0, 0
%R41 = call i32 @Find(i8* %R42, i32 %R43)
%R44 = alloca i32
store i32 %R41, i32* %R44
%R45 = add i32 0, 1
%R46 = alloca i32
store i32 %R45, i32* %R46
br label %L3
L3:
%R47 = load i32* %R46
%R48 = load i32* %R39
%R49 = icmp sle i32 %R47, %R48
br i1 %R49, label %L4, label %L8
L4:
%R51 = load i8** %R37
%R52 = load i32* %R46
%R50 = call i32 @Find(i8* %R51, i32 %R52)
%R53 = alloca i32
store i32 %R50, i32* %R53
%R54 = load i32* %R53
%R55 = load i32* %R44
%R56 = icmp ne i32 %R54, %R55
%R58 = icmp ne i1 %R56, 0
br i1 %R58, label %L6, label %L7
L6:
%R57 = add i32 0, 0
ret i32 %R57
br label %L5
L7:
br label %L5
L5:
%R59 = add i32 0, 0
%R60 = load i32* %R46
%R61 = add i32 0, 1
%R62 = add i32 %R60, %R61
store i32 %R62, i32* %R46
br label %L3
L8:
%R63 = add i32 0, 1
ret i32 %R63
}
define i32 @Find(i8* %R1, i32 %R3) {
start:
%R0 = alloca i8*
store i8* %R1, i8** %R0
%R2 = alloca i32
store i32 %R3, i32* %R2
%R4 = load i32* %R2
%R5 = load i8** %R0
%R6 = call i32 @getArrayItemInt(i8* %R5, i32 %R4)
%R7 = load i32* %R2
%R8 = icmp eq i32 %R6, %R7
%R10 = icmp ne i1 %R8, 0
br i1 %R10, label %L1, label %L2
L1:
%R9 = load i32* %R2
ret i32 %R9
br label %L0
L2:
br label %L0
L0:
%R11 = add i32 0, 0
%R13 = load i8** %R0
%R14 = load i32* %R2
%R15 = load i8** %R0
%R16 = call i32 @getArrayItemInt(i8* %R15, i32 %R14)
%R12 = call i32 @Find(i8* %R13, i32 %R16)
%R17 = alloca i32
store i32 %R12, i32* %R17
%R18 = load i32* %R17
ret i32 %R18
}
define i32 @Union(i8* %R20, i32 %R22, i32 %R24) {
start:
%R19 = alloca i8*
store i8* %R20, i8** %R19
%R21 = alloca i32
store i32 %R22, i32* %R21
%R23 = alloca i32
store i32 %R24, i32* %R23
%R26 = load i8** %R19
%R27 = load i32* %R21
%R25 = call i32 @Find(i8* %R26, i32 %R27)
%R28 = alloca i32
store i32 %R25, i32* %R28
%R30 = load i8** %R19
%R31 = load i32* %R23
%R29 = call i32 @Find(i8* %R30, i32 %R31)
%R32 = alloca i32
store i32 %R29, i32* %R32
%R34 = load i32* %R28
%R35 = load i8** %R19
%R33 = load i32* %R32
call void @setArrayItemInt(i8* %R35, i32 %R34, i32 %R33)
%R36 = add i32 0, 0
ret i32 %R36
}
define i32 @main() {
start:
%R64 = call i32 @readInt ()
%R65 = alloca i32
store i32 %R64, i32* %R65
%R66 = load i32* %R65
%R67 = add i32 0, 1
%R68 = sub i32 %R66, %R67
store i32 %R68, i32* %R65
%R69 = call i32 @readInt ()
%R70 = alloca i32
store i32 %R69, i32* %R70
%R71 = add i32 0, 0
%R72 = call i8* @createArrayInt(i32 1)
call void @setArrayItemInt(i8* %R72, i32 0, i32 %R71)
%R73 = alloca i8*
store i8* %R72, i8** %R73
%R74 = add i32 0, 1
%R75 = alloca i32
store i32 %R74, i32* %R75
br label %L9
L9:
%R76 = load i32* %R75
%R77 = load i32* %R65
%R78 = icmp sle i32 %R76, %R77
br i1 %R78, label %L10, label %L11
L10:
%R80 = load i32* %R75
%R81 = load i8** %R73
%R79 = load i32* %R75
call void @setArrayItemInt(i8* %R81, i32 %R80, i32 %R79)
%R82 = load i32* %R75
%R83 = add i32 0, 1
%R84 = add i32 %R82, %R83
store i32 %R84, i32* %R75
br label %L9
L11:
%R85 = add i32 0, 1
%R86 = alloca i32
store i32 %R85, i32* %R86
br label %L12
L12:
%R87 = load i32* %R86
%R88 = load i32* %R70
%R89 = icmp sle i32 %R87, %R88
br i1 %R89, label %L13, label %L14
L13:
%R90 = call i32 @readInt ()
%R91 = alloca i32
store i32 %R90, i32* %R91
%R92 = call i32 @readInt ()
%R93 = alloca i32
store i32 %R92, i32* %R93
%R95 = load i8** %R73
%R96 = load i32* %R91
%R97 = load i32* %R93
%R94 = call i32 @Union(i8* %R95, i32 %R96, i32 %R97)
%R98 = load i32* %R86
%R99 = add i32 0, 1
%R100 = add i32 %R98, %R99
store i32 %R100, i32* %R86
br label %L12
L14:
%R102 = load i8** %R73
%R103 = load i32* %R65
%R101 = call i32 @Check(i8* %R102, i32 %R103)
%R104 = alloca i32
store i32 %R101, i32* %R104
%R105 = load i32* %R104
%R106 = add i32 0, 1
%R107 = icmp eq i32 %R105, %R106
%R109 = icmp ne i1 %R107, 0
br i1 %R109, label %L16, label %L17
L16:
%R108 = add i32 0, 1
call i32 @printInt (i32 %R108)
br label %L15
L17:
%R110 = add i32 0, 0
call i32 @printInt (i32 %R110)
br label %L18
L18:
br label %L15
L15:
%R111 = add i32 0, 0
ret i32 0
}
