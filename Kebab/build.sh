#!/bin/bash
java -jar /opt/antlr/antlr-4.4-complete.jar kebab.g4 -visitor
gcc -shared -fPIC -std=c99 library.c -o library.so
javac *.java
