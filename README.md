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
├── TD5/           # Practical Work Session 5
├── TD6/           # Practical Work Session 6
├── TD7/           # Practical Work Session 7
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

### TD5 - Deeper Inheritance and Object Hierarchies
- **Library System**: Multi-level hierarchy for library management
  - **Ouvrage**: Base class for all library items
  - **Livre**: Book subclass of Ouvrage
  - **CD**: CD subclass of Ouvrage
  - **Periodique**: Periodical subclass of Ouvrage
  - **Bibliotheque**: Library container managing a collection of Ouvrages
- **Extended Shapes**: Enriching existing shape hierarchy
  - **ColoredPoint**: Colored point extending Point from TD1
  - **Carre** / **Rectangle**: Further refinement of shape classes
- **Vehicle Hierarchy**: Revisiting and extending the vehicle system (Vehicule, Voiture, Avion, GestionVehicules)
- **Topics**: Multi-level inheritance, `toString()` / `equals()` overrides, heterogeneous collections, code reuse

### TD6 - Abstract Classes and Interfaces
- **Abstract Vehicle Hierarchy**: Abstract base class with mandatory override
  - **Vehicule** (abstract): Declares abstract `calculePrix()` method
  - **Voiture** / **Avion**: Concrete implementations with price calculation
- **Extended Vehicle System** (ex2): Mixed abstract/concrete hierarchy
  - **Vehicule**: Base class
  - **Amoteur** (abstract): Motorized vehicles
  - **SansMoteur**: Non-motorized vehicles
  - **Voiture** / **Camion**: Extend Amoteur
  - **Velo**: Extends SansMoteur
- **Enterprise Payroll System**: Complex hierarchy with interfaces
  - **Employe** (abstract): Declares abstract `calculerSalaire()`
  - **Technicien** / **Manutentionnaire**: Concrete employee types
  - **Commercial** (abstract): Abstract commercial employee
  - **Vendeur** / **Representant**: Extend Commercial
  - **ARisque** (interface): Hazard risk interface
  - **TechARisque** / **ManutARisque**: Multiple inheritance via interface
  - **Salaires**: Payroll management and reporting
- **Topics**: Abstract classes, interfaces, multiple inheritance with interfaces, polymorphic method dispatch

### TD7 - Generics, Collections, and Ordering
- **Generic Objects and Messaging** (`boite`): Practice with parameterized classes and typed content
  - **Objet<T>**: Generic object model with color state handling
  - **Balle<T>** / **Mail<T>**: Specialized generic objects and message containers
- **Parking Management** (`parking`): Vehicle placement using associative collections
  - **Parking**: Slot-based parking management using `HashMap`
  - **Vehicule** / **Voiture**: Vehicle model integrated with parking operations (`garer`, `liberer`, `chercher`)
- **People Sorting** (`personnes`): Ordering with natural and custom comparators
  - **Personne**: Abstract base class implementing `Comparable<Personne>`
  - **Etudiant** / **Enseignant**: Concrete person types
  - **CompAge**: `Comparator<Personne>` for age-based sorting
- **Topics**: Generics, Java collections (`List`, `HashMap`), sorting (`Comparable`, `Comparator`), polymorphism in collections

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
  cd TD1  # or TD2, TD3, TD4, TD5, TD6, TD7, etc.
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
   java -cp bin bibliotheque.Main       # TD5
   java -cp bin entreprise.Salaires     # TD6
  java -cp bin boite.Main              # TD7 (generics)
  java -cp bin parking.Main            # TD7 (parking)
  java -cp bin personnes.Main          # TD7 (sorting)
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
- **Advanced OOP**: Method overriding, abstract classes, interfaces, vehicle and shape modeling
- **Interfaces**: Defining contracts, implementing multiple interfaces, polymorphic dispatch
- **Design Patterns**: Heterogeneous collections, payroll systems, library management
- **Generics & Collections**: Type-safe reusable classes, lists, maps, and custom ordering with comparators

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
