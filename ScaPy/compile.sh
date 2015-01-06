#!/bin/bash
java -cp out:lib/antlr-4.4.1-dev-complete.jar Compiler $1 > $1.ll
opt -S -std-compile-opts $1.ll > $2
rm $1.ll
