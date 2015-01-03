declare i32 @mr()
 
declare void @mw(i32)

define i32 @main() {
start:
	%R1= alloca i32
	store i32 47, i32* %R1
	%R2= load i32* %R1
	%R3 = sext i32 %R2 to i47
	ret i32 0
}