antlr4 -visitor Acode.g4
javac *java
gcc -shared -fPIC -std=c99 library.c -o library.so

