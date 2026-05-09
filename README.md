# Java Singleton and Immutable Class Patterns

<p align="center">
  <img src="https://img.shields.io/badge/Java-Design%20Patterns-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white" alt="Java" />
  <img src="https://img.shields.io/badge/Singleton-Thread%20Safety-7C3AED?style=for-the-badge" alt="Singleton" />
  <img src="https://img.shields.io/badge/Immutable-Class%20Design-16A34A?style=for-the-badge" alt="Immutable" />
</p>

This repository is a Java revision notebook for Singleton implementations and immutable class design. It compares multiple Singleton approaches and includes a simple immutable class example.

## What It Covers

- Eager initialization Singleton.
- Lazy initialization Singleton.
- Synchronized Singleton.
- Double-checked locking Singleton.
- Bill Pugh Singleton pattern.
- Enum-based Singleton.
- Immutable class construction.

## Repository Map

```text
DBConnection.java                                Basic Singleton example
DBConnectionLazyInitialization.java              Lazy Singleton
DBConnectionSynchronized.java                    Synchronized Singleton
DBConnectionSynchronizedDoubleLockingSystem.java Double-checked locking
BillPughDatabaseConnection.java                  Bill Pugh Singleton
DBConnectionEnum.java                            Enum Singleton
MyImmutableClass.java                            Immutable class design
MyImmutableClassMain.java                        Immutable class demo
```

## Pattern Comparison

```mermaid
flowchart TD
    A[Singleton Need] --> B[Eager]
    A --> C[Lazy]
    A --> D[Synchronized]
    A --> E[Double Checked Locking]
    A --> F[Bill Pugh]
    A --> G[Enum]
    H[Immutable Class] --> I[Final Fields]
    H --> J[No Setters]
    H --> K[Defensive Copies]
    classDef singleton fill:#ede9fe,stroke:#7c3aed,color:#4c1d95,stroke-width:2px
    classDef immutable fill:#dcfce7,stroke:#16a34a,color:#14532d,stroke-width:2px
    class A,B,C,D,E,F,G singleton
    class H,I,J,K immutable
```

## Run Locally

```powershell
javac *.java
java MyImmutableClassMain
```

## Revision Notes

- Singleton controls object creation when only one instance should exist.
- Lazy Singleton needs thread-safety care.
- Enum Singleton is concise and serialization-safe.
- Immutable classes should use final fields, no setters, and defensive copies for mutable inputs.

## Interview Talking Points

```text
This repo helps compare Singleton implementations by tradeoff: simplicity, lazy loading,
thread safety, and serialization safety. It also connects object creation patterns with
immutability and safe object design.
```
