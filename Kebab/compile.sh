java Compiler < $1  > $1.ll
opt-3.5 -S -std-compile-opts $1.ll > $2
rm  $1.ll
