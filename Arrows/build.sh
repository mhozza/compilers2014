#!/bin/bash
DIR=$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )
javac $DIR/everything/*.java
gcc -shared -fPIC -std=c99 "$DIR/everything/iolib.c" -o library.so