# Creational Design Patterns — Car Manufacturing Sample (Java)

Author: Usurelu Cosmin

This sample project demonstrates creational design patterns in a simple Car Manufacturing domain. It includes implementations of:

- Singleton (`singleton.Logger`)
- Builder (`builder.CarBuilder`, `builder.SportCarBuilder`, `builder.Director`)
- Factory Method / Simple Factory (`factory.CarFactory`, `factory.Sedan`, `factory.SUV`, `factory.Truck`)

Project structure (key packages):

- `client` : contains `Main` demo runner
- `builder` : Builder pattern implementation for constructing complex `Car` objects
- `factory` : Factory implementation for creating different `Car` types
- `domain` : main models (`Car`, `Engine`, `Option`)
- `singleton` : Singleton `Logger`

How to build and run

1. Compile with Maven:

```powershell
mvn -q -DskipTests=true package
```

2. Run the demo (after packaging):

```powershell
java -cp target/classes client.Main
```

Expected output (example):

[LOG] Built via Builder: Car{make='Ferrari', model='F8 Tributo', type='Sports', horsepower=710, seats=2}
[LOG] Built via Factory: Car{make='Toyota', model='Camry', type='Sedan', horsepower=203, seats=5}
[LOG] Built via Factory: Car{make='Ford', model='F-150', type='Truck', horsepower=400, seats=3}

Notes

- The repo already includes at least three creational patterns as required. You can extend the project with Prototype or Abstract Factory if you want more variety.
- The demo `client.Main` demonstrates usage of Builder, Factory and Singleton patterns.
