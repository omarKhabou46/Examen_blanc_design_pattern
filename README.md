# Examen Blanc — Design Patterns & AOP (Réseau de Neurones)

Implémentation en **Java 21** d'un framework simplifié de **Réseau de Neurones Artificiels** mettant en œuvre plusieurs **Design Patterns** ainsi que la **Programmation Orientée Aspect (AOP)** avec AspectJ.

---

## Architecture & Design Patterns

- **Strategy (`com.enset.models.strategy`)** : Encapsule les fonctions d'activation des neurones via l'interface `IFActivation` (`Sigmoid`, `SoftMax`).
- **Adapter (`com.enset.models.adapter`)** : Permet d'adapter une ancienne implémentation d'activation (`IOldActivation` / `OldActivation`) à l'interface standard `IFActivation` via la classe `Adapter`.
- **Observer (`com.enset.models.observerP`)** : Notifie les observateurs (`Observer`, ex: `DashBoard`) des changements d'état du réseau de neurones (`Observable` / `NeuralNetwork`).
- **Decorator (`com.enset.models.decorator`)** : Permet d'enrichir dynamiquement les couches du réseau via `LayerDecorator`.
- **Gestion d'état (`com.enset.models.enumiration`)** : Cycle de vie du réseau géré via l'énumération `State` (`CONSTRUCTION`, `TRAINING`, `TRAINED`).
- **AOP (`com.enset.aspect`)** : Journalisation automatique (`LogAspect`) avant l'exécution de chaque méthode grâce à **AspectJ**.

---

## Structure du Projet

```text
examen-blanc/
├── pom.xml
└── src/main/java/com/enset/
    ├── Main.java
    ├── aspect/
    │   └── LogAspect.java
    └── models/
        ├── NeuralNetwork.java
        ├── Layer.java
        ├── InputLayer.java
        ├── HiddenLayer.java
        ├── OutputLayer.java
        ├── Neurone.java
        ├── Connexion.java
        ├── adapter/
        │   ├── Adapter.java
        │   ├── IOldActivation.java
        │   └── OldActivation.java
        ├── decorator/
        │   └── LayerDecorator.java
        ├── enumiration/
        │   └── State.java
        ├── observerP/
        │   ├── DashBoard.java
        │   ├── Observable.java
        │   └── Observer.java
        └── strategy/
            ├── IFActivation.java
            ├── Sigmoid.java
            └── SoftMax.java
```

---

## Prérequis & Exécution

- **Java** : 21
- **Maven** : 3.8+
- **AspectJ** : 1.9.22

```bash
cd examen-blanc
mvn clean compile exec:java -Dexec.mainClass="com.enset.Main"
```
