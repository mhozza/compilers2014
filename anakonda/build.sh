#!/bin/bash
java -jar /opt/antlr/antlr-4.4-complete.jar -visitor anakonda.g4
javac *.java
g++ -shared -fPIC library.c -o library.so
