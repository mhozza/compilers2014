#!/bin/bash
javac *.java
java Compiler < test > vystup.ll
lli-3.5 -load=./library.so vystup.ll