#!/bin/bash
cd src
java Compiler < $1 > $1.ll
opt -S -std-compile-opts $1.ll > $2
rm -f $1.ll
cd ..
