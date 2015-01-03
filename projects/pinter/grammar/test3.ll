; ModuleID = 'test3.c'
target datalayout = "e-m:e-p:32:32-f64:32:64-f80:32-n8:16:32-S128"
target triple = "i386-pc-linux-gnu"

@.str = private unnamed_addr constant [62 x i8] c"Bigint overflow (wow, you must have really tried). Exiting...\00", align 1
@.str1 = private unnamed_addr constant [5 x i8] c"TODO\00", align 1
@.str2 = private unnamed_addr constant [10 x i8] c"%d %d %d\0A\00", align 1

; Function Attrs: nounwind
define i8* @generate32(i32 %x, i32* %maxsize) #0 {
  %1 = alloca i32, align 4
  %2 = alloca i32*, align 4
  %poc = alloca i32, align 4
  %newaddress = alloca i8*, align 4
  %neweradress = alloca i8*, align 4
  store i32 %x, i32* %1, align 4
  store i32* %maxsize, i32** %2, align 4
  store i32 0, i32* %poc, align 4
  %3 = load i32** %2, align 4
  %4 = load i32* %3, align 4
  %5 = mul nsw i32 8, %4
  %6 = call noalias i8* @malloc(i32 %5) #1
  store i8* %6, i8** %newaddress, align 4
  br label %7

; <label>:7                                       ; preds = %46, %0
  %8 = load i32* %1, align 4
  %9 = icmp sgt i32 %8, 0
  br i1 %9, label %10, label %47

; <label>:10                                      ; preds = %7
  %11 = load i32* %poc, align 4
  %12 = load i32** %2, align 4
  %13 = load i32* %12, align 4
  %14 = icmp eq i32 %11, %13
  br i1 %14, label %15, label %30

; <label>:15                                      ; preds = %10
  %16 = load i32** %2, align 4
  %17 = load i32* %16, align 4
  %18 = add nsw i32 %17, 1
  %19 = mul nsw i32 8, %18
  %20 = call noalias i8* @malloc(i32 %19) #1
  store i8* %20, i8** %neweradress, align 4
  %21 = load i8** %neweradress, align 4
  %22 = load i8** %newaddress, align 4
  %23 = load i32** %2, align 4
  %24 = load i32* %23, align 4
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %21, i8* %22, i32 %24, i32 1, i1 false)
  %25 = load i8** %newaddress, align 4
  call void @free(i8* %25) #1
  %26 = load i8** %neweradress, align 4
  store i8* %26, i8** %newaddress, align 4
  %27 = load i32** %2, align 4
  %28 = load i32* %27, align 4
  %29 = add nsw i32 %28, 1
  store i32 %29, i32* %27, align 4
  br label %30

; <label>:30                                      ; preds = %15, %10
  %31 = load i32* %1, align 4
  %32 = srem i32 %31, 256
  %33 = trunc i32 %32 to i8
  %34 = load i32* %poc, align 4
  %35 = load i8** %newaddress, align 4
  %36 = getelementptr inbounds i8* %35, i32 %34
  store i8 %33, i8* %36, align 1
  %37 = load i32* %1, align 4
  %38 = sdiv i32 %37, 256
  store i32 %38, i32* %1, align 4
  %39 = load i32* %poc, align 4
  %40 = add nsw i32 %39, 1
  store i32 %40, i32* %poc, align 4
  %41 = load i32** %2, align 4
  %42 = load i32* %41, align 4
  %43 = icmp sge i32 %42, 8388608
  br i1 %43, label %44, label %46

; <label>:44                                      ; preds = %30
  %45 = call i32 (i8*, ...)* @printf(i8* getelementptr inbounds ([62 x i8]* @.str, i32 0, i32 0))
  call void @exit(i32 1) #4
  unreachable

; <label>:46                                      ; preds = %30
  br label %7

; <label>:47                                      ; preds = %7
  %48 = load i32* %poc, align 4
  %49 = load i8** %newaddress, align 4
  %50 = getelementptr inbounds i8* %49, i32 %48
  store i8 0, i8* %50, align 1
  %51 = load i32* %poc, align 4
  %52 = load i32** %2, align 4
  store i32 %51, i32* %52, align 4
  %53 = load i8** %newaddress, align 4
  ret i8* %53
}

; Function Attrs: nounwind
declare noalias i8* @malloc(i32) #0

; Function Attrs: nounwind
declare void @llvm.memcpy.p0i8.p0i8.i32(i8* nocapture, i8* nocapture readonly, i32, i32, i1) #1

; Function Attrs: nounwind
declare void @free(i8*) #0

declare i32 @printf(i8*, ...) #2

; Function Attrs: noreturn nounwind
declare void @exit(i32) #3

; Function Attrs: nounwind
define i32 @getSize32(i32 %z) #0 {
  %1 = alloca i32, align 4
  %p = alloca i32, align 4
  store i32 %z, i32* %1, align 4
  store i32 0, i32* %p, align 4
  br label %2

; <label>:2                                       ; preds = %6, %0
  %3 = load i32* %1, align 4
  %4 = sdiv i32 %3, 256
  %5 = icmp sgt i32 %4, 0
  br i1 %5, label %6, label %11

; <label>:6                                       ; preds = %2
  %7 = load i32* %1, align 4
  %8 = sdiv i32 %7, 256
  store i32 %8, i32* %1, align 4
  %9 = load i32* %p, align 4
  %10 = add nsw i32 %9, 1
  store i32 %10, i32* %p, align 4
  br label %2

; <label>:11                                      ; preds = %2
  %12 = load i32* %p, align 4
  ret i32 %12
}

; Function Attrs: nounwind
define i8* @binMul(i8* %data1, i8* %data2, i32 %size1, i32 %size2, i32* %res_size) #0 {
  %1 = alloca i8*, align 4
  %2 = alloca i8*, align 4
  %3 = alloca i8*, align 4
  %4 = alloca i32, align 4
  %5 = alloca i32, align 4
  %6 = alloca i32*, align 4
  %size_bigger = alloca i32, align 4
  %i = alloca i32, align 4
  %mul = alloca i32, align 4
  %a = alloca i32, align 4
  %b = alloca i32, align 4
  %r = alloca i32, align 4
  store i8* %data1, i8** %2, align 4
  store i8* %data2, i8** %3, align 4
  store i32 %size1, i32* %4, align 4
  store i32 %size2, i32* %5, align 4
  store i32* %res_size, i32** %6, align 4
  store i32 1, i32* %mul, align 4
  store i32 0, i32* %a, align 4
  store i32 0, i32* %b, align 4
  %7 = load i32* %4, align 4
  %8 = load i32* %5, align 4
  %9 = icmp sgt i32 %7, %8
  br i1 %9, label %10, label %12

; <label>:10                                      ; preds = %0
  %11 = load i32* %4, align 4
  store i32 %11, i32* %size_bigger, align 4
  br label %14

; <label>:12                                      ; preds = %0
  %13 = load i32* %5, align 4
  store i32 %13, i32* %size_bigger, align 4
  br label %14

; <label>:14                                      ; preds = %12, %10
  %15 = load i32* %size_bigger, align 4
  %16 = icmp slt i32 %15, 4
  br i1 %16, label %17, label %54

; <label>:17                                      ; preds = %14
  store i32 0, i32* %i, align 4
  br label %18

; <label>:18                                      ; preds = %43, %17
  %19 = load i32* %i, align 4
  %20 = load i32* %4, align 4
  %21 = icmp slt i32 %19, %20
  br i1 %21, label %22, label %46

; <label>:22                                      ; preds = %18
  %23 = load i32* %i, align 4
  %24 = load i8** %2, align 4
  %25 = getelementptr inbounds i8* %24, i32 %23
  %26 = load i8* %25, align 1
  %27 = sext i8 %26 to i32
  %28 = load i32* %mul, align 4
  %29 = mul nsw i32 %27, %28
  %30 = load i32* %a, align 4
  %31 = add nsw i32 %30, %29
  store i32 %31, i32* %a, align 4
  %32 = load i32* %i, align 4
  %33 = load i8** %3, align 4
  %34 = getelementptr inbounds i8* %33, i32 %32
  %35 = load i8* %34, align 1
  %36 = sext i8 %35 to i32
  %37 = load i32* %mul, align 4
  %38 = mul nsw i32 %36, %37
  %39 = load i32* %b, align 4
  %40 = add nsw i32 %39, %38
  store i32 %40, i32* %b, align 4
  %41 = load i32* %mul, align 4
  %42 = mul nsw i32 %41, 8
  store i32 %42, i32* %mul, align 4
  br label %43

; <label>:43                                      ; preds = %22
  %44 = load i32* %i, align 4
  %45 = add nsw i32 %44, 1
  store i32 %45, i32* %i, align 4
  br label %18

; <label>:46                                      ; preds = %18
  %47 = load i32* %a, align 4
  %48 = load i32* %b, align 4
  %49 = mul nsw i32 %47, %48
  store i32 %49, i32* %r, align 4
  %50 = load i32** %6, align 4
  store i32 1, i32* %50, align 4
  %51 = load i32* %r, align 4
  %52 = load i32** %6, align 4
  %53 = call i8* @generate32(i32 %51, i32* %52)
  store i8* %53, i8** %1
  br label %57

; <label>:54                                      ; preds = %14
  %55 = call i32 (i8*, ...)* @printf(i8* getelementptr inbounds ([5 x i8]* @.str1, i32 0, i32 0))
  br label %56

; <label>:56                                      ; preds = %54
  store i8* null, i8** %1
  br label %57

; <label>:57                                      ; preds = %56, %46
  %58 = load i8** %1
  ret i8* %58
}

; Function Attrs: nounwind
define i32 @main() #0 {
  %1 = alloca i32, align 4
  %d1 = alloca [3 x i8], align 1
  %d2 = alloca [3 x i8], align 1
  %s1 = alloca i32, align 4
  %s2 = alloca i32, align 4
  %res_size = alloca i32*, align 4
  %res = alloca i8*, align 4
  store i32 0, i32* %1
  %2 = getelementptr inbounds [3 x i8]* %d1, i32 0, i32 0
  store i8 10, i8* %2, align 1
  %3 = getelementptr inbounds [3 x i8]* %d1, i32 0, i32 1
  store i8 0, i8* %3, align 1
  %4 = getelementptr inbounds [3 x i8]* %d1, i32 0, i32 2
  store i8 0, i8* %4, align 1
  %5 = getelementptr inbounds [3 x i8]* %d2, i32 0, i32 0
  store i8 2, i8* %5, align 1
  %6 = getelementptr inbounds [3 x i8]* %d2, i32 0, i32 1
  store i8 0, i8* %6, align 1
  %7 = getelementptr inbounds [3 x i8]* %d2, i32 0, i32 2
  store i8 0, i8* %7, align 1
  store i32 3, i32* %s1, align 4
  store i32 3, i32* %s2, align 4
  %8 = call noalias i8* @malloc(i32 4) #1
  %9 = bitcast i8* %8 to i32*
  store i32* %9, i32** %res_size, align 4
  %10 = getelementptr inbounds [3 x i8]* %d1, i32 0, i32 0
  %11 = getelementptr inbounds [3 x i8]* %d2, i32 0, i32 0
  %12 = load i32* %s1, align 4
  %13 = load i32* %s2, align 4
  %14 = load i32** %res_size, align 4
  %15 = call i8* @binMul(i8* %10, i8* %11, i32 %12, i32 %13, i32* %14)
  store i8* %15, i8** %res, align 4
  %16 = load i8** %res, align 4
  %17 = getelementptr inbounds i8* %16, i32 0
  %18 = load i8* %17, align 1
  %19 = sext i8 %18 to i32
  %20 = load i8** %res, align 4
  %21 = getelementptr inbounds i8* %20, i32 2
  %22 = load i8* %21, align 1
  %23 = sext i8 %22 to i32
  %24 = load i32** %res_size, align 4
  %25 = load i32* %24, align 4
  %26 = call i32 (i8*, ...)* @printf(i8* getelementptr inbounds ([10 x i8]* @.str2, i32 0, i32 0), i32 %19, i32 %23, i32 %25)
  ret i32 0
}

attributes #0 = { nounwind "less-precise-fpmad"="false" "no-frame-pointer-elim"="true" "no-frame-pointer-elim-non-leaf" "no-infs-fp-math"="false" "no-nans-fp-math"="false" "stack-protector-buffer-size"="8" "unsafe-fp-math"="false" "use-soft-float"="false" }
attributes #1 = { nounwind }
attributes #2 = { "less-precise-fpmad"="false" "no-frame-pointer-elim"="true" "no-frame-pointer-elim-non-leaf" "no-infs-fp-math"="false" "no-nans-fp-math"="false" "stack-protector-buffer-size"="8" "unsafe-fp-math"="false" "use-soft-float"="false" }
attributes #3 = { noreturn nounwind "less-precise-fpmad"="false" "no-frame-pointer-elim"="true" "no-frame-pointer-elim-non-leaf" "no-infs-fp-math"="false" "no-nans-fp-math"="false" "stack-protector-buffer-size"="8" "unsafe-fp-math"="false" "use-soft-float"="false" }
attributes #4 = { noreturn nounwind }

!llvm.ident = !{!0}

!0 = metadata !{metadata !"Ubuntu clang version 3.5-1ubuntu1 (trunk) (based on LLVM 3.5)"}
