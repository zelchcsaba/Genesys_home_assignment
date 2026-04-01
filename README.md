# Genesys Java Home Assignment - Phone Digit Letter Combinations

## Description

This Java project generates all possible **letter combinations** that a string of digits (2–9) could represent on a phone keypad.

---

## Requirements

- **JDK 21** (or newer)
- **JUnit 5 standalone jar** for running tests

---

## Project Structure

src/assignment/Main.java  
src/assignment/Solver.java  
src/test/assignment/DigitMappingValidation.java  
src/test/assignment/InputValidation.java  
lib/junit-platform-console-standalone-1.13.0-M3.jar  

---

## Compilation (Windows 11 CMD only)

From the **project root folder** (the folder you cloned from GitHub):

Create output folder
```bash
mkdir out
```

Compile all source and test files
```bash
javac -d out -cp lib\junit-platform-console-standalone-1.13.0-M3.jar ^ src\assignment\Main.java ^ src\assignment\Solver.java ^ test\assignment\DigitMappingValidation.java ^ test\assignment\InputValidation.java
```

---

## Running the Program

```bash
java -cp out assignment.Main
```

---

## Running Unit Tests

```bash
java -jar lib\junit-platform-console-standalone-1.13.0-M3.jar ^ --class-path out ^ --select-class assignment.DigitMappingValidation ^ --select-class assignment.InputValidation
```

---