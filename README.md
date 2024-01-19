# TLC-Projet

## Hiérarchisation des répertoires

### 📁 Documentation

Ce dossier contient les différents documents et rapports relatifs au projet.

- 📄 Rapport de projet

Rapport du déroulement et des résultats du projet au format pdf.

- 📄 Documentation utilisateur

Documentation utilisateur au format pdf.

- 📁 Conception

Contient le diagramme de classes de la partie Java du compilateur.

- 📁 Javadoc

Documentation automatiquement générée à partir des commentaires du code source. Elle est mise à jour lors du build du projet.

### 📁 Executables

- 📦 Jar

Jar exécutable du compilateur, généré lors du build du projet.


- 📜 Scripts

Un script réalisant la compilation depuis le code source WHILE vers un programme exécutable

Un second script, permetant de mettre à jour le parser et le lexer, en copiant et modifiant ceux générés par ANTLRWokrs dans le dossier de la grammaire.

### 📁 Generated code

Ce dossier contient : 
- le code de la librairie runtime WHILE dans le langage cible.
- le code cible généré par le compilateur.

Il existe en réalité deux dossiers `generated_code` : un dans le dossier `executables` et l'autre à la racine du projet. 

Dans le cas où le code While est compilé à partir du jar, ou du script de compilation, le code cible est généré dans le dossier `executables/generated_code`.

Dans le cas où le code While est compilé à partir du code Java, depuis l'IDE, le code cible est généré dans le dossier `generated_code` à la racine du projet.


### 📁 Src

Ce dossier contient le code source du compilateur (sous dossier main).

Il contient également les tests unitaires du compilateur (sous dossier test). Ces derniers sont réalisés pendant le build du projet. Le dossier de test contient, de plus, les fichier While utilisés pour les tests.

### 📁 (Target)

Ce dossier est créé si vous exécutez le build du projet. Il contient les fichiers classes générés lors du build du projet, ainsi que le jar non exécutable du compilateur et les différents rapports de tests.

## Installation

Pour vous assurer de disposer de la dernière version du jar du compilateur, vous pouvez exécuter son build avec la commande `mvn clean install` . 

Cela mettra égalmement à jour la documentation javadoc et exécutera la batterie de tests.

## Utilisation

Les fichiers d'exécution du compilateur sont disponibles dans le dossier Executables.

Dans le dossier exécutable, vous pouvez exécuter les commandes suivantes :

- Pour la chaîne de compilation complète : `./full-compilation.sh "<fichierSource1>" "<fichierSource2>" ...`

- Pour générer le code C, sans le compiler : `java -jar executables/compilateur-while-runner.jar "<fichierSource1>" "<fichierSource2>" ...`

Pour les deux options, l'argument -v ou --verbose permet d'afficher les détails de la compilation.

Dans les deux cas, les fichiers obtenus sont dans le dossier `target/generated_code`.

## Manuel utilisateur

Pour utiliser notre compilateur, il vous faudra coder en while, un langage avec certaines spécificités et qui suit des règles précises. En while, vous pouvez créer des fonctions avec la syntaxe suivante :

```
function symbol : 
read I1, ..., In 
% 
	Commandes 
% 
write O1, ..., Om
```

Dans cette définition, symbol est le nom de la fonction I1, …, In sont les paramètres de la fonction et O1, …, Om sont les valeurs de retour de la fonction. Commandes est un bloc de code contenant une succession de commandes que nous détaillerons après. Il est à noter que dans le langage While, le nombre de paramètres d’une fonction peut être 0 (ici, il s’agit d’une fonction renvoyant une valeur constante). Par contre le nombre de valeur de retour est toujours supérieur ou égal à 1. Il ne peut y avoir de fonction sans valeur de retour.

Les différentes commandes utilisables dans le bloc d’une fonction sont :

- nop : Une commande qui ne fait rien. Ceci est utile pour tester la génération de code.  

- C1 ; C2 : Exécute la commande C1 puis la commande C2. Le point-virgule est un opérateur correspondant à l'enchaînement de commandes.  

- if E then C1 fi : Si E est vrai exécute C sinon ne fait rien.

- if E then C1 else C2 fi : Si E est vrai, exécute C1, sinon exécute C2.

- while E do C od : Si E est vrai, exécute C, répète l’opération tant que E est vrai. Cette structure de contrôle peut boucler indéfiniment  

- for E do C od : Répète E fois la commande C. Cette structure de contrôle ne peut pas boucler indéfiniment.  
- foreach X in E do C od : Pour chaque élément X de E, répéter C.

- V1, V2, …, Vn = E1, E2, …, En : Évalue toutes les expressions E1, E2, …, En En puis stocke les résultats dans les variables V1, V2, …, Vn.

- V1, V2, …, Vn = (f E1 E2 … Em) : Évalue la fonction (f E1 E2 … Em) et stocke les valeurs de retour dans V1, V2, …, Vn

A noter que si plusieurs commandes se suivent, un point virgule doit les séparer.


Dans ces commandes, vous pourrez utiliser des expressions :

**nil :** Valeur nulle.X  
**Variables :** Utiliser des variables grâce à leurs noms. R1 = R2;  
**cons :** construction d’arbres binaires
- (cons) = nil construit un arbre vide  
- (cons T) = T retourne l’arbre T   
- (cons A B) construit un arbre binaire ayant A pour fils gauche et B pour fils droit  
- (cons T1 T2 … Tn) = (cons T1 (cons T2 … (cons Tn-1 Tn) …)  
**list :** Construction d’une liste
- (list) = nil construit une list vide  
- (list T) = (cons T nil) construit une liste a un élément  
- (list T1 T2 … Tn) = (cons T1 (cons T2 … (cons Tn nil) …) construit une liste à n éléments    
**(hd T) :** 
- si T = (cons A B) alors retourne A  
- si T = Symb alors retourne nil  
- si T = nil alors retourne nil   
**(tl T) :**  
- si T = (const A B) alors retourne B  
- si T = Symb alors retourne nil  
- si T = nil alors retourne nil   
**(f v1 … vn) :** appel de la fonction f avec les paramètres v1 à vn.  

Dans un programme vous pouvez aussi ajouter des commentaires sur une ligne vide ou la fin d’une ligne de code : // Ceci est un commentaire

**Exemple de code :**
```
// Logical test 
function test : 
read Op1, Op2
% 
	if Op1 then 
		Result := (false) 
	else 
		Result := (true) 
	fi; //Point virgule de séparation
      Result := Op1; 
	for Op2 do 
		Result := ( cons nil Result ) 
      od  
% 
write Result
```
