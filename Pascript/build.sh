#!/bin/bash

java -jar src/antlr-4.4-complete.jar src/pascript/grammar/Pascript.g4 -visitor
javac -d bin/ -classpath src/antlr-4.4-complete.jar  $(find ./src/* | grep .java)
g++ -std=c++0x -shared -fPIC src/library.cpp -o bin/library.so