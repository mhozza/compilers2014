; ModuleID = 'test2.c'
target datalayout = "e-m:e-p:32:32-f64:32:64-f80:32-n8:16:32-S128"
target triple = "i386-pc-linux-gnu"

@.str = private unnamed_addr constant [6 x i8] c"%d %d\00", align 1

; Function Attrs: nounwind
define i32 @func(i32 %z) #0 {
  %1 = alloca i32, align 4
  store i32 %z, i32* %1, align 4
  %2 = load i32* %1, align 4
  ret i32 %2
}

; Function Attrs: nounwind
define i32 @main() #0 {
  %1 = alloca i32, align 4
  %x = alloca i32, align 4
  %bitx = alloca i32, align 4
  %poc1 = alloca i32, align 4
  %err = alloca i32, align 4
  %y = alloca i32, align 4
  store i32 0, i32* %1
  store i32 47, i32* %x, align 4
  store i32 42, i32* %bitx, align 4
  store i32 0, i32* %poc1, align 4
  store i32 0, i32* %err, align 4
  store i32 0, i32* %y, align 4
  br label %2

; <label>:2                                       ; preds = %6, %0
  %3 = load i32* %x, align 4
  %4 = sdiv i32 %3, 2
  %5 = icmp sgt i32 %4, 0
  br i1 %5, label %6, label %11

; <label>:6                                       ; preds = %2
  %7 = load i32* %x, align 4
  %8 = sdiv i32 %7, 2
  store i32 %8, i32* %x, align 4
  %9 = load i32* %poc1, align 4
  %10 = add nsw i32 %9, 1
  store i32 %10, i32* %poc1, align 4
  br label %2

; <label>:11                                      ; preds = %2
  %12 = load i32* %poc1, align 4
  %13 = load i32* %bitx, align 4
  %14 = sub nsw i32 %13, 1
  %15 = icmp sgt i32 %12, %14
  br i1 %15, label %16, label %21

; <label>:16                                      ; preds = %11
  %17 = load i32* %bitx, align 4
  %18 = mul nsw i32 %17, 2
  store i32 %18, i32* %bitx, align 4
  %19 = load i32* %x, align 4
  %20 = call i32 @func(i32 %19)
  store i32 %20, i32* %y, align 4
  br label %24

; <label>:21                                      ; preds = %11
  store i32 46, i32* %y, align 4
  %22 = load i32* %bitx, align 4
  %23 = mul nsw i32 %22, 1
  store i32 %23, i32* %bitx, align 4
  br label %24

; <label>:24                                      ; preds = %21, %16
  %25 = load i32* %y, align 4
  %26 = load i32* %bitx, align 4
  %27 = call i32 (i8*, ...)* @printf(i8* getelementptr inbounds ([6 x i8]* @.str, i32 0, i32 0), i32 %25, i32 %26)
  %28 = load i32* %1
  ret i32 %28
}

declare i32 @printf(i8*, ...) #1

attributes #0 = { nounwind "less-precise-fpmad"="false" "no-frame-pointer-elim"="true" "no-frame-pointer-elim-non-leaf" "no-infs-fp-math"="false" "no-nans-fp-math"="false" "stack-protector-buffer-size"="8" "unsafe-fp-math"="false" "use-soft-float"="false" }
attributes #1 = { "less-precise-fpmad"="false" "no-frame-pointer-elim"="true" "no-frame-pointer-elim-non-leaf" "no-infs-fp-math"="false" "no-nans-fp-math"="false" "stack-protector-buffer-size"="8" "unsafe-fp-math"="false" "use-soft-float"="false" }

!llvm.ident = !{!0}

!0 = metadata !{metadata !"Ubuntu clang version 3.5-1ubuntu1 (trunk) (based on LLVM 3.5)"}
