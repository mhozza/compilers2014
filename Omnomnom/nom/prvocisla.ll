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
define i32 @main() {
start:
%R0 = alloca i32
%R2 = load i32* %R0
%R1 = call i32 @read_i(i32 %R2)
store i32 %R1, i32* %R0
%R3 = alloca i8*
%R4 = call i8* @createArray_b(i32 0)
store i8* %R4, i8** %R3
br label %L0
L0:
%R5 = alloca i32
%R6 = add i32 0, 0
store i32 %R6, i32* %R5
br label %L1
L1:
%R7 = load i32* %R5
%R8 = load i32* %R0
%R9 = icmp sle i32 %R7, %R8
%R14 = icmp ne i1 %R9, 0
br i1 %R14, label %L2, label %L3
L2:
%R12 = add i1 0, 1
%R13 = load i8** %R3
call void @append_b(i8* %R13, i1 %R12)
%R10 = load i32* %R5
%R11 = add i32 %R10, 1
store i32 %R11, i32* %R5
br label %L1
L3:
%R15 = add i32 0, 0
br label %L10
L10:
%R16 = alloca i32
%R17 = add i32 0, 2
store i32 %R17, i32* %R16
br label %L11
L11:
%R18 = load i32* %R16
%R19 = load i32* %R16
%R20 = mul i32 %R18, %R19
%R21 = load i32* %R0
%R22 = icmp sle i32 %R20, %R21
%R47 = icmp ne i1 %R22, 0
br i1 %R47, label %L12, label %L13
L12:
%R25 = load i32* %R16
%R27 = load i8** %R3
%R26 = call i1 @get_b(i8* %R27, i32 %R25)
%R28 = add i1 0, 1
%R29 = icmp eq i1 %R26, %R28
%R45 = icmp ne i1 %R29, 0
br i1 %R45, label %L9, label %L8
L9:
br label %L4
L4:
%R30 = alloca i32
%R31 = load i32* %R16
%R32 = load i32* %R16
%R33 = mul i32 %R31, %R32
store i32 %R33, i32* %R30
br label %L5
L5:
%R34 = load i32* %R30
%R35 = load i32* %R0
%R36 = icmp slt i32 %R34, %R35
%R43 = icmp ne i1 %R36, 0
br i1 %R43, label %L6, label %L7
L6:
%R40 = load i32* %R30
%R41 = add i1 0, 0
%R42 = load i8** %R3
call void @set_b(i8* %R42, i32 %R40, i1 %R41)
%R37 = load i32* %R30
%R38 = load i32* %R16
%R39 = add i32 %R37, %R38
store i32 %R39, i32* %R30
br label %L5
L7:
%R44 = add i32 0, 0
br label %L8
L8:
%R46 = add i32 0, 0
%R23 = load i32* %R16
%R24 = add i32 %R23, 1
store i32 %R24, i32* %R16
br label %L11
L13:
%R48 = add i32 0, 0
br label %L16
L16:
%R49 = alloca i32
%R50 = add i32 0, 2
store i32 %R50, i32* %R49
br label %L17
L17:
%R51 = load i32* %R49
%R52 = load i32* %R0
%R53 = icmp sle i32 %R51, %R52
%R64 = icmp ne i1 %R53, 0
br i1 %R64, label %L18, label %L19
L18:
%R56 = load i32* %R49
%R58 = load i8** %R3
%R57 = call i1 @get_b(i8* %R58, i32 %R56)
%R59 = add i1 0, 1
%R60 = icmp eq i1 %R57, %R59
%R62 = icmp ne i1 %R60, 0
br i1 %R62, label %L15, label %L14
L15:
%R61 = load i32* %R49
call i32 @print_i(i32 %R61)
br label %L14
L14:
%R63 = add i32 0, 0
%R54 = load i32* %R49
%R55 = add i32 %R54, 1
store i32 %R55, i32* %R49
br label %L17
L19:
%R65 = add i32 0, 0
ret i32 0
}
