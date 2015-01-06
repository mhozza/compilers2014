#!/bin/bash
java -jar lib/antlr-4.4.1-dev-complete.jar scapy.g4 -o src/ -visitor
gcc -shared -fPIC -std=c++11 lib/library.cpp -o lib/library.so
mkdir -p out
javac -classpath lib/antlr-4.4.1-dev-complete.jar -d out/ src/*.java
