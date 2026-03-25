# ☕ 3rd Semester — Java Fundamentals

> Core Java programming exercises from my 3rd semester CS coursework — covering math operations, physics calculations, and string manipulation.

[![Java](https://img.shields.io/badge/Java-11+-ED8B00?logo=openjdk&logoColor=white)](https://github.com/WaseefUllahh/3rd-Semester)

---

## 📋 Overview

This repository contains Java programs written during 3rd semester. These exercises establish the foundation of Java programming — from basic arithmetic to applied physics formulas, and working with the String class.

---

## 📂 Programs

### ➕ DoMath.java / DoMath2.java
Basic arithmetic operations in Java — addition, subtraction, multiplication, division. Two versions exploring different approaches to implementing math logic.

**Concepts:** Operators, variables, data types, method calls

```bash
javac DoMath.java
java DoMath
```

---

### 🌍 GravityCalculator.java
Calculates gravitational force or velocity of a falling object using physics formulas.

**Formula used:** `F = m × g` or free-fall kinematics

**Concepts:** Double/float precision, formula implementation, console output

```bash
javac GravityCalculator.java
java GravityCalculator
```

---

### 🔭 Gravity.java / Gravity_formula.java
Related gravity programs — likely exploring the universal gravitation formula or implementing multiple gravity-related calculations.

**Formula:** `F = G × (m1 × m2) / r²`

```bash
javac Gravity.java
java Gravity
```

---

### 👋 Hello3.java
Early Java syntax practice — printing to console, understanding `System.out.println`, and basic program structure.

```bash
javac Hello3.java
java Hello3
```

---

### 🔤 Letters.java
Working with characters and the alphabet in Java — likely using char data type, ASCII values, or character iteration.

**Concepts:** `char`, ASCII values, loops over characters

---

### 📝 String1.java
String class methods — length, substring, concatenation, comparison, and manipulation.

**Concepts:** `String` methods, immutability, `StringBuilder`

---

## 🛠️ Setup & Run

### Prerequisites
- Java JDK 11+ installed
- VS Code with Java Extension Pack (or any Java IDE)

### Compile & Run Any File
```bash
# Compile
javac FileName.java

# Run
java ClassName
```

### VS Code Setup
This project was developed in VS Code with the standard Java workspace structure:
- `src/` — source files
- `lib/` — dependencies
- `bin/` — compiled `.class` files (auto-generated)

---

## 📊 Learning Progress Demonstrated

| Topic | Program |
|-------|---------|
| Basic I/O | Hello3.java |
| Arithmetic | DoMath.java, DoMath2.java |
| Physics formulas | GravityCalculator, Gravity_formula |
| Characters | Letters.java |
| Strings | String1.java |

---

## 🔧 Improvements

- [ ] Organize files into packages (e.g., `com.waseef.math`, `com.waseef.physics`)
- [ ] Add user input via `Scanner` class
- [ ] Write unit tests with JUnit
- [ ] Add JavaDoc comments to each class and method
- [ ] Create a single `Main.java` menu to run all programs

---

## 📄 License

Educational use. © 2024 Waseef Ullah.

---

*Built by [Waseef Ullah](https://github.com/WaseefUllahh) — CS Student | 3rd Semester Java*
