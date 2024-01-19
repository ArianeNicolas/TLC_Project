#!/bin/bash
#Make dir to compile C
#mkdir generated_code

# Path to the JAR file
JAR_FILE="compilateur-while-runner.jar"

# Run the Java JAR file with the provided arguments
java -jar "$JAR_FILE" "$@"

#compiling the output.c file
gcc generated_code/*.c -o while_exec