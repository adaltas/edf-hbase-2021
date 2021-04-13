# TP Hbase

Cloner le repository et l'ouvrir le projet dans votre IDE (par exemple, IntelliJ IDEA). 

Nous utilisons la version 8 de Java (version standard de l'écosystème Hadoop).

**Objectif**: Créer l'API d'un serveur de chat simplifié.

## Packager l'application


1. Adapter le fichier `pom.xml` aux versions du cluster. Ce fichier contient toutes les dépendences de notre application. Actuellement, il est compatible avec un cluster HDP 2.6.4. 

2. Créer un dossier conf à côté du dossier `src`

3. Y placer les fichiers `hbase-site.xml` et le `core-site.xml` que vous trouverez sur votre noeud edge.
Tip: utiliser la commande `scp` qui récupère ces fichiers via ssh:

```
scp username@edge.node:/etc/hbase/conf/hbase-site.xml .
scp username@edge.node:/etc/hadoop/conf/core-site.xml .
```

Cela permet à votre application de connaitre la topologie de votre cluster HBase ainsi que les informations relatives à Kerberos.

4. Build
```
mvn clean package -DskipTests
```

5. Pour lancer la fonction `main` de la class `App`:
```
java -classpath target/hbaseproject-1.0-SNAPSHOT.jar com.adaltas.examples.App
```

Vous devriez voir le message "My App !" s'afficher.

6. Pour créer une table `mytable` dans le namespace `mynamespace` dans HBase, appelez la classe CreateTable comme ceci:
```
java -classpath target/hbaseproject-1.0-SNAPSHOT.jar com.adaltas.examples.CreateTable mynamespace:mytable
```


## Lancer les tests

Pour lancer les tests de votre application, nous devons compléter la classe `TestMessages` comportant des tests JUnit.

La première étape est de lancer un cluster HBase dans la JVM de votre application. Cette étape doit être exécutée avant les les tests. Elle est donc inclue dans cette section de code:
```java
@Before
public void setup() throws Exception {
    utility = new HBaseTestingUtility();
    utility.startMiniCluster();
}
```
Le mot clé `@Before` de JUnit implique que cette fonction sera appelée avant les tests ( `@Test` ). **Il faudra également y créer une table.**


Pour lancer les tests:
```
mvn test
```

**Attention**: Avant de lancer les tests, déplacer ou renommez votre dossier `conf`. Le minicluster tente sinon de lire cette configuration.


## Compléter le code

Compléter les différentes partie du code. Avant de lancer votre application sur le cluster, prenez l'habitutde d'écrire les tests et de lancer la commande `mvn test`.

Il faut compléter la classe `Messages` contient le code qui communique avec HBase.


Pour exécuter du code sur le cluster, vous pouvez compléter la classe `App`. Dans un second temps, vous pouvez également compléter la classe `cli` afin de pouvoir envoyer des messages de manière plus dynamique:

```
java -classpath target/hbaseproject-1.0-SNAPSHOT.jar com.adaltas.examples.cli -s Jean -r Marie Thomas -m "Bonjour, je suis Jean."
```
Cette commande envoit un message de la part de Jean à Marie et Thomas. 

