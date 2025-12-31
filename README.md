# SOLID Design Principles – Java

This repository contains practical, runnable Java examples demonstrating
the SOLID design principles through **bad vs good implementations**.

Each principle includes:
- A **bad implementation** that violates the principle
- A **good implementation** that refactors the design correctly
- Minimal, focused examples to highlight design intent

The goal of this repository is to understand **why each principle exists**
and how it improves **real-world code maintainability, extensibility,
and safety**.

---

## Principles Covered

### 1. Single Responsibility Principle (SRP)
**A class should have only one reason to change.**

**Notes:**
- SRP is about **reasons to change**, not number of methods
- Violations create “change magnets” where unrelated changes collide
- Fix SRP by separating responsibilities, not by over-abstracting

---

### 2. Open–Closed Principle (OCP)
**Software entities should be open for extension but closed for modification.**

**Notes:**
- If adding a new requirement forces modification of existing logic, OCP is likely violated
- Prefer extending behavior via new classes rather than editing stable code
- Interfaces and polymorphism are tools, not goals

---

### 3. Liskov Substitution Principle (LSP)
**Subtypes must be substitutable for their base types without breaking behavior.**

**Notes:**
- LSP is about **behavioral contracts**, not compiler rules
- If a subclass needs special handling or throws unsupported exceptions, inheritance is wrong
- Many LSP violations indicate a flawed abstraction, not a coding mistake

---

### 4. Interface Segregation Principle (ISP)
**Clients should not be forced to depend on methods they do not use.**

**Notes:**
- Fat interfaces lead to fake implementations and runtime failures
- Split interfaces by responsibility, not by convenience
- `UnsupportedOperationException` is a strong ISP smell

---

### 5. Dependency Inversion Principle (DIP)
**High-level modules should not depend on low-level modules. Both should depend on abstractions.**

**Notes:**
- Business logic should depend on behavior, not concrete implementations
- DIP improves testability and flexibility
- Frameworks like Spring implement DIP, but the principle exists independently of them

---

## How to Use This Repository

- Navigate to each principle folder
- Run the **bad** example to observe design issues
- Run the **good** example to see the corrected design
- Compare structure, responsibilities, and dependencies

This repository is intended as a **learning reference and interview-ready
demonstration** of clean object-oriented design.
