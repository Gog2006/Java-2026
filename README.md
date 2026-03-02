# Java-2026

Java coursework and practical assignments completed at Université Côte d'Azur in 2026.

## Educational Purpose

This repository contains academic projects created for learning Java programming fundamentals. The code is shared publicly for educational benefit and portfolio demonstration.

## Repository Structure

```
Java-2026/
├── TD1/           # Practical Work Session 1
├── TD2/           # Practical Work Session 2
├── TD3/           # Practical Work Session 3
├── TD4/           # Practical Work Session 4
├── LICENSE        # Educational license
└── README.md      # This file
```

## Practical Sessions (TD)

### TD1 - Object-Oriented Programming Basics
- **Point Class**: Implementation of 2D point with distance calculations
- **Basic OOP**: Constructors, methods, and user interaction
- **Topics**: Classes, objects, encapsulation, basic I/O

### TD2 - Data Structures 
- **EnsembleEntierBorne**: Bounded integer set implementation
- **Boolean Arrays**: Set operations using boolean arrays
- **Mystere**: Prime number sieve algorithm implementation (Sieve of Eratosthenes)
- **Topics**: Arrays, boolean logic, set operations, algorithmic thinking

### TD3 - Object Composition and Aggregation
- **Segment Class**: Geometric segment implementation with point endpoints
- **Car System**: Complete car modeling with composition
  - **Voiture**: Car class with engine and wheels
  - **Moteur**: Engine component with specifications
  - **Roue**: Wheel component with properties
  - **Garage**: Car management and operations
- **Topics**: Object composition, aggregation, has-a relationships, complex object modeling

### TD4 - Inheritance and Polymorphism
- **Geometric Forms**: Shape hierarchy implementation
  - **Rectangle**: Rectangle class with dimensions
  - **Carre**: Square class inheriting from Rectangle
- **Vehicle Hierarchy**: Transportation system with inheritance
  - **Vehicule**: Base vehicle class
  - **Voiture**: Car implementation (different from TD3)
  - **Avion**: Airplane implementation
  - **GestionVehicules**: Vehicle management system
- **Topics**: Inheritance, polymorphism, is-a relationships, method overriding

## How to Use

### Prerequisites
- Java JDK 8 or higher
- Any Java IDE (Eclipse, IntelliJ, VS Code)

### Running the Code

1. **Clone the repository:**
   ```bash
   git clone https://github.com/Gog2006/Java-2026.git
   cd Java-2026
   ```

2. **Navigate to a TD directory:**
   ```bash
   cd TD1  # or TD2, TD3, TD4, etc.
   ```

3. **Compile and run:**
   ```bash
   # Compile all Java files
   javac -d bin src/**/*.java
   
   # Run specific main classes (examples)
   java -cp bin point.Main              # TD1
   java -cp bin ensembleentierborne.TestEnsemble  # TD2
   java -cp bin segment.TestSegment     # TD3
   java -cp bin formes.Main             # TD4
   ```

### IDE Setup
- Import each TD as a separate Java project
- Source folder: `src/`
- Output folder: `bin/`

## Learning Objectives

- **Object-Oriented Programming**: Classes, inheritance, encapsulation, polymorphism
- **Object Relationships**: Composition, aggregation, has-a and is-a relationships
- **Data Structures**: Arrays, collections, custom implementations
- **Java Fundamentals**: Syntax, types, control structures
- **Software Design**: Package organization, method design, class hierarchies
- **Testing**: Unit testing and validation
- **Advanced OOP**: Method overriding, abstract concepts, vehicle and shape modeling

## TD Template Structure

Each TD follows this consistent structure:
```
TDX/
├── src/
│   └── packagename/
│       ├── MainClass.java
│       └── HelperClass.java
└── bin/ (generated, not in git)
```

## Academic Context

- **University**: Université Côte d'Azur
- **Year**: 2026
- **Course**: Java Programming
- **Type**: Practical work sessions (Travaux Dirigés)

## License & Academic Integrity

This project is licensed under an Educational License (based on MIT). See [LICENSE](LICENSE) for details.

**For students**: This code is for educational reference. Ensure compliance with your institution's academic integrity policies when using this code.

## Contributing

This is an educational repository for personal coursework. However, suggestions and discussions about the implementations are welcome through issues.

## Contact

- **Author**: Dzhafarov Oleksandr
- **GitHub**: [@Gog2006](https://github.com/Gog2006)

---
*This repository serves as a learning portfolio and educational resource for Java programming concepts.*
