  #!/bin/bash
  java -jar /opt/antlr/antlr-4.4-complete.jar -visitor teetee.g4
  javac *.java
  g++ -shared -fPIC library.cpp -o library.so
