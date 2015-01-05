antlr4 src/siii.g4 -visitor
javac src/*.java
gcc -shared -fPIC -std=c99 src/library.c -o src/library.so