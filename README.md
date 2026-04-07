# Object-Oriented Programming: Inheritance & Management Systems

[cite_start]This project was developed as part of **Assignment 2A** in the Object-Oriented Programming course at the Department of Computer Science[cite: 3, 7]. [cite_start]It focuses on implementing core OOP principles, specifically inheritance, the use of `extends` and `super` keywords, and class hierarchy management[cite: 9, 12].

## 📋 Project Structure
The project consists of two main tasks designed to demonstrate polymorphic behavior and hierarchical data structures.

### Task 1: Library Publication Management
[cite_start]A system to manage different types of library publications[cite: 54].
* [cite_start]**Publication**: The base class containing the title, publisher, quantity, and a unique static ID starting from 10[cite: 56, 57, 58, 59, 60, 61].
* [cite_start]**Book**: Extends Publication to include an `Author` object, an editor, and a publication year[cite: 63, 72].
* [cite_start]**Journal**: Extends Publication to include an issue number and publication year[cite: 64, 73].
* [cite_start]**Encyclopedia**: Extends Publication to include a volume number and editor[cite: 65, 71].
* [cite_start]**Author**: A helper class representing a writer with a name and email[cite: 74, 78].

### Task 2: Workplace Environment Management
[cite_start]A system to manage employee data within an organization[cite: 109].
* [cite_start]**Employee**: The base class managing employee names, salaries, and unique IDs starting from 0[cite: 111, 114, 115, 118].
* [cite_start]**Developer**: A subclass representing software engineers, adding a specific programming language field[cite: 123, 125].
* [cite_start]**Manager**: A subclass representing department heads, adding a department name field[cite: 132, 134].

## 🛠 Technical Principles
* [cite_start]**Inheritance**: Extensive use of the `extends` keyword to reuse code and create specialized classes[cite: 9].
* [cite_start]**Method Overriding**: Implementation of `toString()` for customized object printing and `equals()` for logical object comparison[cite: 55, 120, 121, 130].
* [cite_start]**Access Control**: Proper use of private and protected members to ensure encapsulation[cite: 9, 45].
* [cite_start]**Constants & Statics**: Use of the `final` keyword to prevent ID modifications and static counters for unique identification[cite: 9, 61, 113, 116].
