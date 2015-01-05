declare i32 @read_i(i32)
declare i32 @print_i(i32)
declare i32 @print_f(double)
declare i32 @print_b(i1)
declare i32 @print_s(i8*)
declare i32 @iexp(i32, i32)
declare double @fexp(double, i32)
declare i8* @createArray_i (i32)
declare i32 @size_i (i8*)
declare void @set_i (i8*, i32, i32)
declare i32 @get_i (i8*, i32)
declare void @remove_i (i8*, i32)
declare void @deleteArray_i (i8*)
declare void @append_i (i8*, i32)
declare i8* @createArray_f (i32)
declare i32 @size_f (i8*)
declare void @set_f (i8*, i32, double)
declare double @get_f (i8*, i32)
declare void @remove_f (i8*, i32)
declare void @deleteArray_f (i8*)
declare void @append_f (i8*, double)
declare i8* @createArray_b (i32)
declare i32 @size_b (i8*)
declare void @set_b (i8*, i32, i1)
declare i1 @get_b (i8*, i32)
declare void @remove_b (i8*, i32)
declare void @deleteArray_b (i8*)
declare void @append_b (i8*, i1)
declare i8* @createArray_s (i32)
declare i32 @size_s (i8*)
declare void @set_s (i8*, i32, i8)
declare i8 @get_s (i8*, i32)
declare void @remove_s (i8*, i32)
declare void @deleteArray_s (i8*)
declare void @append_s (i8*, i8*)
define i32 @find(i8* %R0, i32 %R1) {
start:
%R2 = alloca i8*
store i8* %R0, i8** %R2
%R3 = alloca i32
store i32 %R1, i32* %R3
%R4 = load i32* %R3
%R5 = load i32* %R3
%R7 = load i8** %R2
%R6 = call i32 @get_i(i8* %R7, i32 %R5)
%R8 = icmp eq i32 %R4, %R6
%R15 = icmp ne i1 %R8, 0
br i1 %R15, label %L1, label %L2
L1:
%R9 = load i32* %R3
ret i32 %R9 
br label %L0
L2:
%R10 = load i8** %R2
%R11 = load i32* %R3
%R13 = load i8** %R2
%R12 = call i32 @get_i(i8* %R13, i32 %R11)
%R14 = call i32 @find(i8* %R10, i32 %R12)
ret i32 %R14 
br label %L0
L0:
%R16 = add i32 0, 0
%R17 = add i32 0, 0
ret i32 %R17 
}
define i32 @union(i8* %R18, i32 %R19, i32 %R20) {
start:
%R21 = alloca i8*
store i8* %R18, i8** %R21
%R22 = alloca i32
store i32 %R19, i32* %R22
%R23 = alloca i32
store i32 %R20, i32* %R23
%R24 = alloca i32
%R25 = load i8** %R21
%R26 = load i32* %R22
%R27 = call i32 @find(i8* %R25, i32 %R26)
store i32 %R27, i32* %R24
%R28 = alloca i32
%R29 = load i8** %R21
%R30 = load i32* %R23
%R31 = call i32 @find(i8* %R29, i32 %R30)
store i32 %R31, i32* %R28
%R32 = load i32* %R24
%R33 = load i32* %R28
%R34 = load i8** %R21
call void @set_i(i8* %R34, i32 %R32, i32 %R33)
%R35 = add i32 0, 0
ret i32 %R35 
}
define i32 @main() {
start:
%R36 = alloca i32
%R37 = alloca i32
%R39 = load i32* %R36
%R38 = call i32 @read_i(i32 %R39)
store i32 %R38, i32* %R36
%R41 = load i32* %R37
%R40 = call i32 @read_i(i32 %R41)
store i32 %R40, i32* %R37
%R42 = alloca i8*
%R43 = call i8* @createArray_i(i32 0)
store i8* %R43, i8** %R42
%R44 = alloca i8*
%R45 = call i8* @createArray_i(i32 0)
store i8* %R45, i8** %R44
br label %L3
L3:
%R46 = alloca i32
%R47 = add i32 0, 0
store i32 %R47, i32* %R46
br label %L4
L4:
%R48 = load i32* %R46
%R49 = load i32* %R37
%R50 = icmp slt i32 %R48, %R49
%R63 = icmp ne i1 %R50, 0
br i1 %R63, label %L5, label %L6
L5:
%R53 = alloca i32
%R54 = alloca i32
%R56 = load i32* %R53
%R55 = call i32 @read_i(i32 %R56)
store i32 %R55, i32* %R53
%R58 = load i32* %R54
%R57 = call i32 @read_i(i32 %R58)
store i32 %R57, i32* %R54
%R59 = load i32* %R53
%R60 = load i8** %R42
call void @append_i(i8* %R60, i32 %R59)
%R61 = load i32* %R54
%R62 = load i8** %R42
call void @append_i(i8* %R62, i32 %R61)
%R51 = load i32* %R46
%R52 = add i32 %R51, 1
store i32 %R52, i32* %R46
br label %L4
L6:
%R64 = add i32 0, 0
br label %L7
L7:
%R65 = alloca i32
%R66 = add i32 0, 0
store i32 %R66, i32* %R65
br label %L8
L8:
%R67 = load i32* %R65
%R68 = load i32* %R36
%R69 = icmp slt i32 %R67, %R68
%R74 = icmp ne i1 %R69, 0
br i1 %R74, label %L9, label %L10
L9:
%R72 = load i32* %R65
%R73 = load i8** %R44
call void @append_i(i8* %R73, i32 %R72)
%R70 = load i32* %R65
%R71 = add i32 %R70, 1
store i32 %R71, i32* %R65
br label %L8
L10:
%R75 = add i32 0, 0
br label %L11
L11:
%R76 = alloca i32
%R77 = add i32 0, 0
store i32 %R77, i32* %R76
br label %L12
L12:
%R78 = load i32* %R76
%R80 = load i8** %R42
%R79 = call i32 @size_i(i8* %R80)
%R81 = icmp slt i32 %R78, %R79
%R95 = icmp ne i1 %R81, 0
br i1 %R95, label %L13, label %L14
L13:
%R85 = load i8** %R44
%R86 = load i32* %R76
%R88 = load i8** %R42
%R87 = call i32 @get_i(i8* %R88, i32 %R86)
%R89 = load i32* %R76
%R90 = add i32 0, 1
%R91 = add i32 %R89, %R90
%R93 = load i8** %R42
%R92 = call i32 @get_i(i8* %R93, i32 %R91)
%R94 = call i32 @union(i8* %R85, i32 %R87, i32 %R92)
%R82 = load i32* %R76
%R83 = add i32 0, 2
%R84 = add i32 %R82, %R83
store i32 %R84, i32* %R76
br label %L12
L14:
%R96 = add i32 0, 0
%R97 = alloca i8*
%R98 = call i8* @createArray_s(i32 3)
call void @set_s(i8* %R98, i32 0, i8 65)
call void @set_s(i8* %R98, i32 1, i8 78)
call void @set_s(i8* %R98, i32 2, i8 79)
store i8* %R98, i8** %R97
%R99 = alloca i32
%R100 = load i32* %R36
%R101 = add i32 0, 0
%R102 = icmp sgt i32 %R100, %R101
%R107 = icmp ne i1 %R102, 0
br i1 %R107, label %L16, label %L17
L16:
%R103 = load i8** %R44
%R104 = add i32 0, 0
%R105 = call i32 @find(i8* %R103, i32 %R104)
store i32 %R105, i32* %R99
br label %L15
L17:
%R106 = call i8* @createArray_s(i32 3)
call void @set_s(i8* %R106, i32 0, i8 78)
call void @set_s(i8* %R106, i32 1, i8 73)
call void @set_s(i8* %R106, i32 2, i8 69)
store i8* %R106, i8** %R97
br label %L15
L15:
%R108 = add i32 0, 0
br label %L20
L20:
%R109 = alloca i32
%R110 = add i32 0, 1
store i32 %R110, i32* %R109
br label %L21
L21:
%R111 = load i32* %R109
%R112 = load i32* %R36
%R113 = icmp slt i32 %R111, %R112
%R124 = icmp ne i1 %R113, 0
br i1 %R124, label %L22, label %L23
L22:
%R116 = load i8** %R44
%R117 = load i32* %R109
%R118 = call i32 @find(i8* %R116, i32 %R117)
%R119 = load i32* %R99
%R120 = icmp ne i32 %R118, %R119
%R122 = icmp ne i1 %R120, 0
br i1 %R122, label %L19, label %L18
L19:
%R121 = call i8* @createArray_s(i32 3)
call void @set_s(i8* %R121, i32 0, i8 78)
call void @set_s(i8* %R121, i32 1, i8 73)
call void @set_s(i8* %R121, i32 2, i8 69)
store i8* %R121, i8** %R97
br label %L18
L18:
%R123 = add i32 0, 0
%R114 = load i32* %R109
%R115 = add i32 %R114, 1
store i32 %R115, i32* %R109
br label %L21
L23:
%R125 = add i32 0, 0
%R126 = load i8** %R97
call i32 @print_s(i8* %R126)
ret i32 0
}
