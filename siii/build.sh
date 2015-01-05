cd src
#antlr4 siii.g4 -visitor
javac *.java
gcc -shared -fPIC library.cpp -o library.so
cd ..
