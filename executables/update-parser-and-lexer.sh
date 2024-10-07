#!/bin/bash

# Move files to the destination
cp $(dirname "$0")/../while_grammarAST/output/while_astLexer.java $(dirname "$0")/../src/main/java/antlrworks/
cp $(dirname "$0")/../while_grammarAST/output/while_astParser.java $(dirname "$0")/../src/main/java/antlrworks/

# Add the 'package antlrworks;' line at the beginning of each file
sed -i '1i\package antlrworks;' $(dirname "$0")/../src/main/java/antlrworks/while_astLexer.java
sed -i '1i\package antlrworks;' $(dirname "$0")/../src/main/java/antlrworks/while_astParser.java
