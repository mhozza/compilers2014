cd src
java Compiler < $1.siii > vystup_$1.ll
opt -S -std-compile-opts vystup_$1.ll > $2.ll
rm -f vystup_$1.ll
cd ..
