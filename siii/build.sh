#!/bin/bash
cd src
java -jar /opt/antlr/antlr-4.4-complete.jar -visitor siii.g4
javac *.java
gcc -shared -fPIC library.cpp -o library.so
cd ..
