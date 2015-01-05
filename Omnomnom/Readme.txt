antlr4 Omnomnom.g4 -visitor
javac *.java
g++ -shared -fPIC library.cpp -o library.so

java Compiler subor.nom subor.ll

lli -load=./library.so subor.ll