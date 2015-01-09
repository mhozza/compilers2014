; ModuleID = 'vystup.ll'

declare i32 @printInt(i32)

; Function Attrs: nounwind readnone
define i32 @sub(i32 %R4, i32 %R6) #0 {
start:
  %R10 = sub i32 %R4, %R6
  ret i32 %R10
}

; Function Attrs: nounwind readnone
define i32 @add(i32 %R20, i32 %R22) #0 {
start:
  %R26 = add i32 %R22, %R20
  ret i32 %R26
}

define i32 @main() {
start:
  %0 = tail call i32 @printInt(i32 1)
  %1 = tail call i32 @printInt(i32 9)
  ret i32 0
}

attributes #0 = { nounwind readnone }
