declare void @llvm.memcpy.p0i32.p0i32.i32(i32*,i32*,i32,i32,i1)
declare i32 @readInt()
declare void @readString(i32*,i32)
declare void @printInt(i32)
declare void @printString(i32*,i32)
declare void @printIntSep(i32,i32*,i32)
declare void @printStringSep(i32*,i32,i32*,i32)
declare void @printLine()
define i32 @bleh(i32 %R1) {
start:
0wot
%R1 = alloca i32
store i32 0, i32* %R1
%R0 = load i32* %R1
%R1wut = alloca i32
store i32 %R2, i32* %R1
0wot
%R3 = load i32* %R1
call void @printInt(i32 %R3)
call void @printLine()
ret i32 0
}
define i32 @main() {
start:
%R5 = alloca i32
store i32 0, i32* %R5
%R4 = load i32* %R5
%R6 = add i32 0, 8
store i32 %R6, i32* %R5
%R9 = load i32* %R5
%R10 = call i32 @bleh(i32 %R9)
ret i32 0
}
