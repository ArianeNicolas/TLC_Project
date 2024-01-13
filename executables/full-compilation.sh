#!/bin/bash

# Set the path to your JAR file relative to the script
JAR_FILE="$(dirname "$0")/compilateur-while-runner.jar"

# Run the Java JAR file with the provided arguments
java -jar "$JAR_FILE" "$@"

#todo compiling c code

#todo temp for seeing the output
sleep 5000