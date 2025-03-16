# 📌 Object-Oriented Programming (OOP) in Java

## 📖 Introduction
**Object-Oriented Programming (OOP)** is a programming paradigm based on the concept of **objects** that contain data (**fields/variables**) and behavior (**methods**). It is widely used in programming languages like **Java, Python, and C++**.

### 🔥 **Key Features of OOP**
1. **Class, Objects & Methods**
2. **Message Passing**
3. **Inheritance & Composition**
4. **Polymorphism**
5. **Encapsulation**
6. **Abstraction**

---
## 🏛️ **Class in Java**
### 📌 **What is a Class?**
A **Class** is a blueprint or prototype used to create objects. It defines the **attributes (properties/variables)** and **behaviors (methods)** that an object will have.

💡 **Key Points:**
- A class is a **logical entity** (not a real-world entity).
- It groups **common properties and behaviors** of similar objects.
- Examples: `Animal`, `Bird`, `Vehicle`, `Fruit`.

### 📜 **Syntax of a Class**
```java
// Simple Class Declaration
class ClassName {
    // Variables
    // Methods
}
```

### 🎯 **Example**
```java
class Animal {
    int age = 10;
    String color = "black";
}
```

---
## 🔥 **Methods in Java**
### 📌 **What is a Method?**
A **Method** is a block of code that performs a specific task.

🎯 **Advantages:**
✅ Code **reusability**  
✅ Code **optimization**

### 📜 **Syntax of a Method**
```java
access-modifier return-type methodName(parameters) {
    // Method body (statements)
}
```

### 🎯 **Example**
```java
void eat() {  // Method Declaration
    System.out.println("I'm eating");  // Method Definition
}
```

---
## 🎭 **Objects in Java**
### 📌 **What is an Object?**
An **Object** is an instance of a class. It is a **real-world entity** that has **state, behavior, and identity**.

### 🔹 **Characteristics of an Object**
1. **State** → Represents data (values of an object)
2. **Behavior** → Defines functionality (methods)
3. **Identity** → Unique ID (automatically created by JVM)

### 📜 **Creating an Object**
```java
// Syntax
ClassName objectName = new ClassName();

// Example
Animal buzo = new Animal();
```

### 🛠 **Accessing Variables & Methods from an Object**
```java
// Accessing Variable
System.out.println(buzo.age);

// Calling Method
buzo.eat();
```

---
## 📌 **Important Points to Remember**
✔ We can use **public** or **default** access modifiers for outer classes but **not** private or protected.  
✔ For **inner classes**, all access modifiers (**public, protected, default, private**) can be used.

---
### 📌 **Quick Recap**
| Concept | Description |
|---------|------------|
| **Class** | A blueprint for objects |
| **Object** | An instance of a class |
| **Method** | A block of code performing a task |
| **State** | Data of an object |
| **Behavior** | Functionality of an object |
| **Identity** | Unique identifier for an object |

---
✅ **Study well and keep coding! 🚀**
