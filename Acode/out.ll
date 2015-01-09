declare void @print(i32)
declare i32 @read()
define i32 @main() {
start:
%R4 = call i32 @read()
%R5 = alloca i32
store i32 %R4, i32* %R5
%R14=load i32* %R5
%R10 = alloca i32, i32 %R14
%R15 = add i32 0, 0
%R16 = alloca i32
store i32 %R15, i32* %R16
br label %L0
L0:
%R21 = load i32* %R16
%R22 = load i32* %R5
%R23 = icmp slt i32 %R21, %R22
br i1 %R23, label %L1, label %L2
L1:
%R28 = call i32 @read()
%R32=load i32* %R16
%R29 = getelementptr i32* %R10, i32 %R32
store i32 %R28, i32* %R29
%R25 = load i32* %R16
%R26 = add i32 0, 1
%R27 = add i32 %R25, %R26
store i32 %R27, i32* %R16
br label %L0
L2:
%R34 = add i32 0, 0
%R35 = add i32 0, 0
store i32 %R35, i32* %R16
br label %L9
L9:
%R40 = load i32* %R16
%R41 = load i32* %R5
%R42 = icmp slt i32 %R40, %R41
br i1 %R42, label %L10, label %L11
L10:
%R47 = load i32* %R16
%R48 = add i32 0, 1
%R49 = add i32 %R47, %R48
%R50 = alloca i32
store i32 %R49, i32* %R50
br label %L6
L6:
%R55 = load i32* %R50
%R56 = load i32* %R5
%R57 = icmp slt i32 %R55, %R56
br i1 %R57, label %L7, label %L8
L7:
%R66=load i32* %R5
%R62 = alloca i32, i32 %R66
%R65=load i32* %R16
%R63 = getelementptr i32* %R10, i32 %R65 
%R64= load i32* %R63
store i32 %R64, i32* %R62
%R71=load i32* %R5
%R67 = alloca i32, i32 %R71
%R70=load i32* %R50
%R68 = getelementptr i32* %R10, i32 %R70 
%R69= load i32* %R68
store i32 %R69, i32* %R67
%R72 = load i32* %R62
%R73 = load i32* %R67
%R74 = icmp sgt i32 %R72, %R73
%R91 = icmp ne i1 %R74, 0
br i1 %R91, label %L3, label %L4
L3:
%R79=load i32* %R5
%R75 = alloca i32, i32 %R79
%R78=load i32* %R16
%R76 = getelementptr i32* %R10, i32 %R78 
%R77= load i32* %R76
store i32 %R77, i32* %R75
%R83=load i32* %R16
%R80 = getelementptr i32* %R10, i32 %R83
%R82=load i32* %R50
%R84 = getelementptr i32* %R10, i32 %R82 
%R81= load i32* %R84
store i32 %R81, i32* %R80
%R85 = load i32* %R75
%R89=load i32* %R50
%R86 = getelementptr i32* %R10, i32 %R89
store i32 %R85, i32* %R86
br label %L5
L4:
br label %L5
L5:
%R92 = add i32 0, 0
%R59 = load i32* %R50
%R60 = add i32 0, 1
%R61 = add i32 %R59, %R60
store i32 %R61, i32* %R50
br label %L6
L8:
%R93 = add i32 0, 0
%R44 = load i32* %R16
%R45 = add i32 0, 1
%R46 = add i32 %R44, %R45
store i32 %R46, i32* %R16
br label %L9
L11:
%R94 = add i32 0, 0
%R95 = add i32 0, 0
store i32 %R95, i32* %R16
br label %L12
L12:
%R100 = load i32* %R16
%R101 = load i32* %R5
%R102 = icmp slt i32 %R100, %R101
br i1 %R102, label %L13, label %L14
L13:
%R111=load i32* %R5
%R107 = alloca i32, i32 %R111
%R110=load i32* %R16
%R108 = getelementptr i32* %R10, i32 %R110 
%R109= load i32* %R108
store i32 %R109, i32* %R107
%R112 = load i32* %R107
call void @print(i32 %R112)
%R104 = load i32* %R16
%R105 = add i32 0, 1
%R106 = add i32 %R104, %R105
store i32 %R106, i32* %R16
br label %L12
L14:
%R114 = add i32 0, 0
ret i32 0
}
