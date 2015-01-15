#!/bin/bash
cd src
lli -load=./library.so $1
cd ..
