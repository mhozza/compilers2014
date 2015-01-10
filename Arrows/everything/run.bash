#!/bin/bash
javac *.java
java Compiler < graf > vystup.ll
lli-3.5 -load=./library.so vystup.ll