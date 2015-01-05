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
define i8* @merge(i8* %R0, i8* %R1) {
start:
%R2 = alloca i8*
store i8* %R0, i8** %R2
%R3 = alloca i8*
store i8* %R1, i8** %R3
%R4 = alloca i8*
%R5 = call i8* @createArray_i(i32 0)
store i8* %R5, i8** %R4
br label %L9
L9:
%R7 = load i8** %R2
%R6 = call i32 @size_i(i8* %R7)
%R8 = add i32 0, 0
%R9 = icmp sgt i32 %R6, %R8
%R11 = load i8** %R3
%R10 = call i32 @size_i(i8* %R11)
%R12 = add i32 0, 0
%R13 = icmp sgt i32 %R10, %R12
%R14 = icmp ne i1 %R9, 0
%R15 = icmp ne i1 %R13, 0
%R16 = or i1 %R14, %R15
%R73 = icmp ne i1 %R16, 0
br i1 %R73, label %L10, label %L11
L10:
%R18 = load i8** %R2
%R17 = call i32 @size_i(i8* %R18)
%R19 = add i32 0, 0
%R20 = icmp sgt i32 %R17, %R19
%R22 = load i8** %R3
%R21 = call i32 @size_i(i8* %R22)
%R23 = add i32 0, 0
%R24 = icmp sgt i32 %R21, %R23
%R25 = icmp eq i1 %R20, 1
%R26 = icmp eq i1 %R24, 1
%R27 = and i1 %R25, %R26
%R69 = icmp ne i1 %R27, 0
br i1 %R69, label %L4, label %L5
L4:
%R36 = add i32 0, 0
%R38 = load i8** %R2
%R37 = call i32 @get_i(i8* %R38, i32 %R36)
%R39 = add i32 0, 0
%R41 = load i8** %R3
%R40 = call i32 @get_i(i8* %R41, i32 %R39)
%R42 = icmp sle i32 %R37, %R40
%R55 = icmp ne i1 %R42, 0
br i1 %R55, label %L1, label %L2
L1:
%R43 = add i32 0, 0
%R45 = load i8** %R2
%R44 = call i32 @get_i(i8* %R45, i32 %R43)
%R46 = load i8** %R4
call void @append_i(i8* %R46, i32 %R44)
%R47 = add i32 0, 0
%R48 = load i8** %R2
call void @remove_i(i8* %R48, i32 %R47)
br label %L0
L2:
%R49 = add i32 0, 0
%R51 = load i8** %R3
%R50 = call i32 @get_i(i8* %R51, i32 %R49)
%R52 = load i8** %R4
call void @append_i(i8* %R52, i32 %R50)
%R53 = add i32 0, 0
%R54 = load i8** %R3
call void @remove_i(i8* %R54, i32 %R53)
br label %L0
L0:
%R56 = add i32 0, 0
br label %L3
L5:
%R29 = load i8** %R2
%R28 = call i32 @size_i(i8* %R29)
%R30 = add i32 0, 0
%R31 = icmp sgt i32 %R28, %R30
%R70 = icmp ne i1 %R31, 0
br i1 %R70, label %L6, label %L7
L6:
%R57 = add i32 0, 0
%R59 = load i8** %R2
%R58 = call i32 @get_i(i8* %R59, i32 %R57)
%R60 = load i8** %R4
call void @append_i(i8* %R60, i32 %R58)
%R61 = add i32 0, 0
%R62 = load i8** %R2
call void @remove_i(i8* %R62, i32 %R61)
br label %L3
L7:
%R33 = load i8** %R3
%R32 = call i32 @size_i(i8* %R33)
%R34 = add i32 0, 0
%R35 = icmp sgt i32 %R32, %R34
%R71 = icmp ne i1 %R35, 0
br i1 %R71, label %L8, label %L3
L8:
%R63 = add i32 0, 0
%R65 = load i8** %R3
%R64 = call i32 @get_i(i8* %R65, i32 %R63)
%R66 = load i8** %R4
call void @append_i(i8* %R66, i32 %R64)
%R67 = add i32 0, 0
%R68 = load i8** %R3
call void @remove_i(i8* %R68, i32 %R67)
br label %L3
L3:
%R72 = add i32 0, 0
br label %L9
L11:
%R74 = add i32 0, 0
%R75 = load i8** %R4
ret i8* %R75 
}
define i8* @mergesort(i8* %R76) {
start:
%R77 = alloca i8*
store i8* %R76, i8** %R77
%R78 = alloca i8*
%R79 = call i8* @createArray_i(i32 0)
store i8* %R79, i8** %R78
%R80 = alloca i8*
%R81 = call i8* @createArray_i(i32 0)
store i8* %R81, i8** %R80
%R83 = load i8** %R77
%R82 = call i32 @size_i(i8* %R83)
%R84 = add i32 0, 1
%R85 = icmp sle i32 %R82, %R84
%R126 = icmp ne i1 %R85, 0
br i1 %R126, label %L21, label %L22
L21:
%R86 = load i8** %R77
ret i8* %R86 
br label %L20
L22:
%R87 = alloca i32
%R89 = load i8** %R77
%R88 = call i32 @size_i(i8* %R89)
%R90 = add i32 0, 2
%R91 = sdiv i32 %R88, %R90
store i32 %R91, i32* %R87
br label %L12
L12:
%R92 = alloca i32
%R93 = add i32 0, 0
store i32 %R93, i32* %R92
br label %L13
L13:
%R94 = load i32* %R92
%R95 = load i32* %R87
%R96 = icmp slt i32 %R94, %R95
%R103 = icmp ne i1 %R96, 0
br i1 %R103, label %L14, label %L15
L14:
%R99 = load i32* %R92
%R101 = load i8** %R77
%R100 = call i32 @get_i(i8* %R101, i32 %R99)
%R102 = load i8** %R78
call void @append_i(i8* %R102, i32 %R100)
%R97 = load i32* %R92
%R98 = add i32 %R97, 1
store i32 %R98, i32* %R92
br label %L13
L15:
%R104 = add i32 0, 0
br label %L16
L16:
%R105 = alloca i32
%R106 = load i32* %R87
store i32 %R106, i32* %R105
br label %L17
L17:
%R107 = load i32* %R105
%R109 = load i8** %R77
%R108 = call i32 @size_i(i8* %R109)
%R110 = icmp slt i32 %R107, %R108
%R117 = icmp ne i1 %R110, 0
br i1 %R117, label %L18, label %L19
L18:
%R113 = load i32* %R105
%R115 = load i8** %R77
%R114 = call i32 @get_i(i8* %R115, i32 %R113)
%R116 = load i8** %R80
call void @append_i(i8* %R116, i32 %R114)
%R111 = load i32* %R105
%R112 = add i32 %R111, 1
store i32 %R112, i32* %R105
br label %L17
L19:
%R118 = add i32 0, 0
%R119 = load i8** %R78
%R120 = call i8* @mergesort(i8* %R119)
store i8* %R120, i8** %R78
%R121 = load i8** %R80
%R122 = call i8* @mergesort(i8* %R121)
store i8* %R122, i8** %R80
%R123 = load i8** %R78
%R124 = load i8** %R80
%R125 = call i8* @merge(i8* %R123, i8* %R124)
ret i8* %R125 
br label %L20
L20:
%R127 = add i32 0, 0
%R128 = load i8** %R77
ret i8* %R128 
}
define i32 @main() {
start:
%R129 = alloca i32
%R130 = alloca i8*
%R131 = call i8* @createArray_i(i32 0)
store i8* %R131, i8** %R130
%R133 = load i32* %R129
%R132 = call i32 @read_i(i32 %R133)
store i32 %R132, i32* %R129
br label %L23
L23:
%R134 = alloca i32
%R135 = add i32 0, 0
store i32 %R135, i32* %R134
br label %L24
L24:
%R136 = load i32* %R134
%R137 = load i32* %R129
%R138 = icmp slt i32 %R136, %R137
%R146 = icmp ne i1 %R138, 0
br i1 %R146, label %L25, label %L26
L25:
%R141 = alloca i32
%R143 = load i32* %R141
%R142 = call i32 @read_i(i32 %R143)
store i32 %R142, i32* %R141
%R144 = load i32* %R141
%R145 = load i8** %R130
call void @append_i(i8* %R145, i32 %R144)
%R139 = load i32* %R134
%R140 = add i32 %R139, 1
store i32 %R140, i32* %R134
br label %L24
L26:
%R147 = add i32 0, 0
%R148 = alloca i8*
%R149 = load i8** %R130
%R150 = call i8* @mergesort(i8* %R149)
store i8* %R150, i8** %R148
br label %L27
L27:
%R151 = alloca i32
%R152 = add i32 0, 0
store i32 %R152, i32* %R151
br label %L28
L28:
%R153 = load i32* %R151
%R155 = load i8** %R148
%R154 = call i32 @size_i(i8* %R155)
%R156 = icmp slt i32 %R153, %R154
%R162 = icmp ne i1 %R156, 0
br i1 %R162, label %L29, label %L30
L29:
%R159 = load i32* %R151
%R161 = load i8** %R148
%R160 = call i32 @get_i(i8* %R161, i32 %R159)
call i32 @print_i(i32 %R160)
%R157 = load i32* %R151
%R158 = add i32 %R157, 1
store i32 %R158, i32* %R151
br label %L28
L30:
%R163 = add i32 0, 0
ret i32 0
}
