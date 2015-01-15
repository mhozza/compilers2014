#!/bin/bash
cd src
java -jar /opt/antlr/antlr-4.4-complete.jar -visitor Omnomnom.g4
javac *.java
g++ -shared -fPIC library.cpp -o library.so
cd ..
