#!/bin/bash
java -jar antlr-4.1-complete.jar kebab.g4 -visitor 
gcc -shared -fPIC -std=c99 library.c -o library.so
javac *.java 
