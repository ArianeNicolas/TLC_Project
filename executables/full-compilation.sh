#!/bin/bash

# Check if any parameter starts with "-o"
for arg in "$@"; do
    if [[ "$arg" == "-o"* ]]; then
        echo "Error: The parameter '$arg' is not allowed."
        exit 1
    fi
done

# Set the path to the JAR file relative to the script
JAR_FILE="$(dirname "$0")/compilateur-while-runner.jar"

# Run the Java JAR file with the provided arguments
java -jar "$JAR_FILE" "$@" "-o" "$(dirname "$0")/outputs/output.c"

#compiling the output.c file
# TODO : le mieux ca serait d'appeler un script à part -> comme ca on peut aussi l'appeler indépendamment

#todo temp for seeing the output
sleep 5000