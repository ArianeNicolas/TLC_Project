# TLC-Projet

## Hiérarchisation des répertoires

### 📁 Documentation

Ce dossier contient les différents documents et rapports relatifs au projet.

- 📄 Rapport de projet

Rapport du déroulement et des résultats du projet au format pdf.

- 📄 Documentation utilisateur

Documentation utilisateur au format pdf.

- 📁 Conception

schemas???????

- 📁 Javadoc

Documentation automatiquement générée à partir des commentaires du code source. Elle est mise à jour lors du build du projet.

### 📁 Executables

- 📦 Jar

Jar exécutable du compilateur, généré lors du build du projet.


- 📜 Script

todo: 	Un script réalisant la compilation depuis le code source WHILE vers un programme exécutable

### 📁 Generated code

Code de la librairie runtime WHILE dans le langage cible.

### 📁 Src

Ce dossier contient le code source du compilateur (sous dossier main).

Il contient également les tests unitaires du compilateur (sous dossier test). Ces derniers sont réalisés pendant le build du projet.

### 📁 (Target)

Ce dossier est créé si vous exécutez le build du projet. Il contient les fichiers classes générés lors du build du projet, ainsi que le jar non exécutable du compilateur et les différents rapports de tests.

## Installation

Pour vous assurer de disposer de la dernière version du jar du compilateur, vous pouvez exécuter son build avec la commande `mvn clean install` .


## Utilisation

### Du compilateur

Pour le moment : `java -jar target/compilateur-while-runner.jar "<fichier1>" "<fichier2>" ...`

L'argument -v ou --verbose permet d'afficher les détails de la compilation.