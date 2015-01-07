declare i32 @readInt()
declare void @readString(i32*,i32)
declare void @printInt(i32)
declare void @printString(i32*,i32)
declare void @printIntSep(i32,i32*,i32)
declare void @printStringSep(i32*,i32,i32*,i32)
declare void @printLine()
define i32 @main() {
start:
%R1 = alloca i32, i32 0
%R2 = alloca i32
store i32 0, i32* %R2
%R3 = alloca i32
store i32 1, i32* %R3
%R0 = alloca i32, i32 %R3
%R4 = call i32 @readInt()
ret i32 0
}
