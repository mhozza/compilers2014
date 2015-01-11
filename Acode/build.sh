#!/bin/bash
java -jar /opt/antlr/antlr-4.4-complete.jar -visitor Acode.g4
javac *java
gcc -shared -fPIC -std=c99 library.c -o library.so

