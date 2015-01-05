Skompilujeme to nasledovne:
  * antlr4 teetee.g4 -visitor
  * javac *.java
  * gcc -shared -fPIC -std=c99 library.c -o library.so
  * g++ -shared -fPIC library.cpp -o librarycpp.so
Spustenie kompilatora: 
  * java Compiler < vstup.c  > vystup.ll
Optimalizacia vygenerovaneho kodu: 
  * opt-3.2 -S -std-compile-opts vystup.ll > vystup.optimized.ll 
Spustenie llvm kodu:
  * lli-3.4 -load=./library.so vystup.ll
Spustenie interpretera: 
  * java Teetee < vstup.c
Spustenie GUI pre zobrazenie stromu sparsovaneho zo vstupu:
  * grun teetee init -gui < kod.c
