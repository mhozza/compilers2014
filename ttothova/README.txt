Projekt skompilujeme nasledovne:
  * antlr4 teetee.g4 -visitor
  * javac *.java
  * g++ -shared -fPIC library.cpp -o librarycpp.so

Spustenie kompilatora: 
  * java Compiler < vstup.c > vystup.ll

Spustenie llvm kodu:
  * lli-3.4 -load=./library.so vystup.ll
