#antlr4 anakonda.g4 -visitor
javac *.java
g++ -shared -fPIC library.c -o library.so
