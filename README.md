# 🧮 BigCalcProg – Custom Programming Language (ANTLR + Java)

This project was developed as part of the **Programming Languages & Compilers** course.  
It implements a **custom programming language** called **BigCalcProg**, designed and built using **ANTLR** and **Java** within Eclipse.

---

## 📚 Project Overview

- Defined a **grammar** for the language using ANTLR (`BigCalcProg.g4`).
- Generated a **lexer, parser, and visitors/listeners** for interpreting the language.
- Implemented **semantic checks** and evaluation in Java.
- Built and tested within **Eclipse**, targeting Java 8+.

---

## ✨ Features

- Custom grammar supporting:
  - Arithmetic expressions (+, -, *, /, power)
  - Boolean logic and comparisons
  - Variable declarations and assignments
  - Control flow (`if`, `while`)
  - Functions with parameters
- Error handling with meaningful feedback
- AST traversal using **ANTLR visitor pattern**


---

## 🚀 Getting Started

### 1️⃣ Prerequisites
- Java 8 or later
- Eclipse IDE (or IntelliJ/VS Code with ANTLR plugin)
- ANTLR 4.7.1 JAR (already included in project)

### 2️⃣ Build & Run
1. Import project into Eclipse (`File → Import → Existing Project`).
2. Ensure the ANTLR JAR is on the build path.
3. Open `BigCalcProg.java` (or main entry point) in `src/`.
4. Run program with sample `.bgc` files (if provided).

Example command-line run:
```bash
java -cp .:antlr-4.7.1-complete.jar BigCalcProg sample.bgc
```

---
## 📖 Documentation
The full project report (Assignment4PLC22WS.pdf) explains:
- Grammar design choices
- Language features
- Example programs
- Limitations and future improvements


---
## 📄 License
This project is provided for educational purposes only and not for production use.
