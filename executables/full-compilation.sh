#!/bin/bash

# Set the path to the JAR file relative to the script
JAR_FILE="$(dirname "$0")/compilateur-while-runner.jar"

# Run the Java JAR file with the provided arguments
java -jar "$JAR_FILE" "$@"

#compiling the output.c file
# TODO : le mieux ca serait d'appeler un script à part -> comme ca on peut aussi l'appeler indépendamment
