; ModuleID = 'test3.c'
target datalayout = "e-m:e-p:32:32-f64:32:64-f80:32-n8:16:32-S128"
target triple = "i386-pc-linux-gnu"

@.str = private unnamed_addr constant [62 x i8] c"Bigint overflow (wow, you must have really tried). Exiting...\00", align 1
@.str1 = private unnamed_addr constant [7 x i8] c"%s %d\0A\00", align 1

; Function Attrs: nounwind
define i8* @generate(i32 %x, i32* %maxsize) #0 {
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

; <label>:7                                       ; preds = %47, %0
  %8 = load i32* %1, align 4
  %9 = sdiv i32 %8, 8
  %10 = icmp sgt i32 %9, 0
  br i1 %10, label %11, label %48

; <label>:11                                      ; preds = %7
  %12 = load i32* %1, align 4
  %13 = srem i32 %12, 8
  %14 = trunc i32 %13 to i8
  %15 = load i32* %poc, align 4
  %16 = load i8** %newaddress, align 4
  %17 = getelementptr inbounds i8* %16, i32 %15
  store i8 %14, i8* %17, align 1
  %18 = load i32* %1, align 4
  %19 = sdiv i32 %18, 8
  store i32 %19, i32* %1, align 4
  %20 = load i32* %poc, align 4
  %21 = add nsw i32 %20, 1
  store i32 %21, i32* %poc, align 4
  %22 = load i32* %poc, align 4
  %23 = load i32** %2, align 4
  %24 = load i32* %23, align 4
  %25 = sub nsw i32 %24, 1
  %26 = icmp eq i32 %22, %25
  br i1 %26, label %27, label %41

; <label>:27                                      ; preds = %11
  %28 = load i32** %2, align 4
  %29 = load i32* %28, align 4
  %30 = mul nsw i32 16, %29
  %31 = call noalias i8* @malloc(i32 %30) #1
  store i8* %31, i8** %neweradress, align 4
  %32 = load i8** %neweradress, align 4
  %33 = load i8** %newaddress, align 4
  %34 = load i32** %2, align 4
  %35 = load i32* %34, align 4
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %32, i8* %33, i32 %35, i32 1, i1 false)
  %36 = load i8** %newaddress, align 4
  call void @free(i8* %36) #1
  %37 = load i8** %neweradress, align 4
  store i8* %37, i8** %newaddress, align 4
  %38 = load i32** %2, align 4
  %39 = load i32* %38, align 4
  %40 = mul nsw i32 %39, 2
  store i32 %40, i32* %38, align 4
  br label %41

; <label>:41                                      ; preds = %27, %11
  %42 = load i32** %2, align 4
  %43 = load i32* %42, align 4
  %44 = icmp sge i32 %43, 8388608
  br i1 %44, label %45, label %47

; <label>:45                                      ; preds = %41
  %46 = call i32 (i8*, ...)* @printf(i8* getelementptr inbounds ([62 x i8]* @.str, i32 0, i32 0))
  call void @exit(i32 1) #4
  unreachable

; <label>:47                                      ; preds = %41
  br label %7

; <label>:48                                      ; preds = %7
  %49 = load i32* %poc, align 4
  %50 = load i8** %newaddress, align 4
  %51 = getelementptr inbounds i8* %50, i32 %49
  store i8 0, i8* %51, align 1
  %52 = load i32* %poc, align 4
  %53 = load i32** %2, align 4
  store i32 %52, i32* %53, align 4
  %54 = load i8** %newaddress, align 4
  ret i8* %54
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
define i32 @main() #0 {
  %1 = alloca i32, align 4
  %mem_size1 = alloca i32, align 4
  %mem_size2 = alloca i32, align 4
  %data1 = alloca i32, align 4
  %data2 = alloca i32, align 4
  %mem_size_bigger = alloca i32, align 4
  %res_size = alloca i32*, align 4
  %res = alloca i8*, align 4
  store i32 0, i32* %1
  store i32 32, i32* %mem_size1, align 4
  store i32 48, i32* %mem_size2, align 4
  store i32 8888888, i32* %data1, align 4
  store i32 7777777, i32* %data2, align 4
  %2 = call noalias i8* @malloc(i32 4) #1
  %3 = bitcast i8* %2 to i32*
  store i32* %3, i32** %res_size, align 4
  %4 = load i32* %mem_size1, align 4
  %5 = load i32* %mem_size2, align 4
  %6 = icmp sgt i32 %4, %5
  br i1 %6, label %7, label %9

; <label>:7                                       ; preds = %0
  %8 = load i32* %mem_size1, align 4
  store i32 %8, i32* %mem_size_bigger, align 4
  br label %11

; <label>:9                                       ; preds = %0
  %10 = load i32* %mem_size2, align 4
  store i32 %10, i32* %mem_size_bigger, align 4
  br label %11

; <label>:11                                      ; preds = %9, %7
  %12 = load i32* %mem_size_bigger, align 4
  %13 = icmp slt i32 %12, 32
  br i1 %13, label %14, label %19

; <label>:14                                      ; preds = %11
  %15 = load i32** %res_size, align 4
  store i32 32, i32* %15, align 4
  %16 = load i32* %data1, align 4
  %17 = load i32** %res_size, align 4
  %18 = call i8* @generate(i32 %16, i32* %17)
  %R1 = 
  store i8* %18, i8** %res, align 4
  br label %33

; <label>:19                                      ; preds = %11
  %20 = load i32* %mem_size_bigger, align 4
  %21 = icmp slt i32 %20, 64
  br i1 %21, label %22, label %27

; <label>:22                                      ; preds = %19
  %23 = load i32** %res_size, align 4
  store i32 64, i32* %23, align 4
  %24 = load i32* %data2, align 4
  %25 = load i32** %res_size, align 4
  %26 = call i8* @generate(i32 %24, i32* %25)
  store i8* %26, i8** %res, align 4
  br label %32

; <label>:27                                      ; preds = %19
  %28 = load i32** %res_size, align 4
  store i32 128, i32* %28, align 4
  %29 = load i32* %data1, align 4
  %30 = load i32** %res_size, align 4
  %31 = call i8* @generate(i32 %29, i32* %30)
  store i8* %31, i8** %res, align 4
  br label %32

; <label>:32                                      ; preds = %27, %22
  br label %33

; <label>:33                                      ; preds = %32, %14
  %34 = load i8** %res, align 4
  %35 = load i32** %res_size, align 4
  %36 = load i32* %35, align 4
  %37 = call i32 (i8*, ...)* @printf(i8* getelementptr inbounds ([7 x i8]* @.str1, i32 0, i32 0), i8* %34, i32 %36)
  ret i32 0
}

attributes #0 = { nounwind "less-precise-fpmad"="false" "no-frame-pointer-elim"="true" "no-frame-pointer-elim-non-leaf" "no-infs-fp-math"="false" "no-nans-fp-math"="false" "stack-protector-buffer-size"="8" "unsafe-fp-math"="false" "use-soft-float"="false" }
attributes #1 = { nounwind }
attributes #2 = { "less-precise-fpmad"="false" "no-frame-pointer-elim"="true" "no-frame-pointer-elim-non-leaf" "no-infs-fp-math"="false" "no-nans-fp-math"="false" "stack-protector-buffer-size"="8" "unsafe-fp-math"="false" "use-soft-float"="false" }
attributes #3 = { noreturn nounwind "less-precise-fpmad"="false" "no-frame-pointer-elim"="true" "no-frame-pointer-elim-non-leaf" "no-infs-fp-math"="false" "no-nans-fp-math"="false" "stack-protector-buffer-size"="8" "unsafe-fp-math"="false" "use-soft-float"="false" }
attributes #4 = { noreturn nounwind }

!llvm.ident = !{!0}

!0 = metadata !{metadata !"Ubuntu clang version 3.5-1ubuntu1 (trunk) (based on LLVM 3.5)"}
