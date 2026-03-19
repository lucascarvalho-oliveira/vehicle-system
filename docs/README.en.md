<p align="center">
  <a href="../README.md">
    <img src="https://img.shields.io/badge/Language-Português-green?style=for-the-badge">
  </a>
</p>

# Vehicle System

## Description

Vehicle System is a simple system developed in Java with the objective of applying fundamental concepts of Object-Oriented Programming (OOP).

The project simulates basic vehicle management, allowing the creation and manipulation of different types, such as cars and motorcycles.

## Project Objectives

This project was developed with a focus on learning, covering:

- Inheritance
- Polymorphism
- Encapsulation
- Use of constructors
- Package organization
- User interaction via terminal

## Project Structure
```
├── src/
│   ├── app/
│   │   └── Main.java
│   │
│   ├── model/
│   │   ├── Veiculo.java
│   │   ├── Carro.java
│   │   └── Moto.java
```
## Technologies Used

- Java
- Object-Oriented Programming (OOP)

## Features

- Create vehicles (Car and Motorcycle)
- Define attributes such as:
  - License plate
  - Type
  - Other specific characteristics
- Display vehicle information

## How to Run the Project

1. Clone the repository:  
`git clone https://github.com/lucascarvalho-oliveira/vehicle-system.git`

2. Access the project folder:  
`cd vehicle-system`

3. Compile the project:  
`javac src/app/Main.java`

4. Run  
`java src.app.Main`

## Applied Concepts

### Inheritance

The Veiculo class is used as a base for other classes, such as Carro and Moto.

### Polymorphism

Allows handling different types of vehicles in a generic way.

### Encapsulation

Attributes are protected and accessed through getters and setters.

## Author

Developed by Lucas Carvalho
