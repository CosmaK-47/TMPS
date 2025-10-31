# Laboratory Work No. 3 — Creational Design Patterns

**Author:** Usurelu Cosmin  
**Supervisor:** Drumea Vasile  
**Language:** Java (no frameworks)

---

## 🎯 Objectives
1. Study and understand Creational Design Patterns.
2. Define a domain and identify where object instantiation is required.
3. Implement at least three Creational Design Patterns.

---

## 🧠 Theoretical Concepts
Creational patterns manage object creation, avoiding direct instantiation and promoting flexibility:
- **Singleton:** ensures only one instance of a class exists.
- **Factory Method:** creates objects without specifying their exact class.
- **Builder:** constructs complex objects step-by-step.

---

## 🚗 Domain — Car Manufacturing System
The system models car creation using different creational patterns.

| Pattern | Role in System |
|----------|----------------|
| Singleton | `Logger` used globally for system messages |
| Factory Method | `CarFactory` creates `Sedan`, `SUV`, `Truck` objects |
| Builder | `SportCarBuilder` and `Director` build customized cars |

---

## 🧩 Structure
src/main/java/
├── builder/
├── client/
├── domain/
├── factory/
└── singleton/
---

## 🧪 Output Example
[LOG] Built via Builder: Car {model='SportCar', engine='V8 Turbo', color='Red', gps=true}
[LOG] Built via Factory: Car {model='Sedan', engine='1.6L', color='Blue', gps=false}
[LOG] Built via Factory: Car {model='Truck', engine='3.0L Diesel', color='White', gps=false}

---

## ✅ Conclusion
Creational design patterns simplify and standardize object creation, improving flexibility, readability, and maintenance in large-scale software.