# Java OOPs - Programming Paradigms

## **What is a Programming Paradigm?**  
A **Programming Paradigm** is a way or style of writing programs. It defines **how we write, structure, and organize code**. Different paradigms have different rules and styles to solve problems in programming.  

---

## **Types of Programming Paradigms**  
There are mainly **four types** of programming paradigms:  

### 1️⃣ **Imperative Programming** (Focus on "How to do")  
- In **Imperative Programming**, we give step-by-step instructions to the computer.  
- It focuses on **how the task should be performed**, using statements and control flows like loops and conditions.  

🔹 **Real-World Example:**  
Imagine you are cooking **Maggi noodles** by following step-by-step instructions on the packet.  

🔹 **Example in Java (Imperative Style)**  
```java
public class ImperativeExample {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 5; i++) { // Step-by-step process
            sum += i;
        }
        System.out.println("Sum: " + sum);
    }
}
```
---

### 2️⃣ **Declarative Programming** (Focus on "What to do")  
- In **Declarative Programming**, we focus on **what** the result should be, not **how** to achieve it.  
- We use **expressions** and **functions** instead of step-by-step instructions.  

🔹 **Real-World Example:**  
Instead of giving **step-by-step** cooking instructions, you just **order food from Zomato/Swiggy** and get the **final result (food delivered)**.  

🔹 **Example in Java (Declarative Style using Streams API)**  
```java
import java.util.stream.IntStream;

public class DeclarativeExample {
    public static void main(String[] args) {
        int sum = IntStream.rangeClosed(1, 5).sum(); // Directly get sum
        System.out.println("Sum: " + sum);
    }
}
```
---

### 3️⃣ **Procedural Programming** (A subset of Imperative)  
- **Procedural Programming** follows the **step-by-step approach**, but organizes code into **functions/methods**.  
- It makes code **modular** and **reusable** by breaking it into **procedures (functions)**.  

🔹 **Real-World Example:**  
When making a **sandwich**, you break the process into **steps like cutting bread, adding butter, putting veggies**, and then combining them into a sandwich.  

🔹 **Example in Java (Procedural Style)**  
```java
public class ProceduralExample {
    public static int addNumbers(int a, int b) { // Function
        return a + b;
    }

    public static void main(String[] args) {
        int sum = addNumbers(5, 10); // Reusing function
        System.out.println("Sum: " + sum);
    }
}
```
---

### 4️⃣ **Object-Oriented Programming (OOP)** (Focus on Objects)  
- **OOP focuses on objects**, where everything is represented as **real-world entities** (like Car, Bank, Student).  
- It uses **classes and objects** to model real-world things.  
- **Encapsulation, Inheritance, Polymorphism, and Abstraction** are the main concepts.  

🔹 **Real-World Example:**  
A **Car** has properties (color, brand, speed) and behaviors (drive, brake). **OOP models real-world things in the same way**.  

🔹 **Example in Java (OOP Style)**  
```java
class Car {
    String brand;
    int speed;

    void drive() {
        System.out.println(brand + " is driving at " + speed + " km/h");
    }
}

public class OOPExample {
    public static void main(String[] args) {
        Car myCar = new Car(); // Creating Object
        myCar.brand = "Tesla";
        myCar.speed = 80;
        myCar.drive();
    }
}
```
---
> ## 📌 What is a Real-World Entity?  
> A **real-world entity** is anything that **exists** and has:  
> 1️⃣ **A Name (Identity)**  
> 2️⃣ **Some Properties (Attributes/Characteristics)**  
> 3️⃣ **Some Behaviors (Actions/Functions)**  

---

### 🔹 **Examples of Real-World Entities**  

📦 **Car 🚗**  
> - **Properties:** Color, Brand, Speed, Model  
> - **Behaviors:** Start, Stop, Accelerate, Brake  

📦 **Student 🎓**  
> - **Properties:** Name, Age, Roll Number, Grade  
> - **Behaviors:** Study, Attend Class, Submit Homework  

📦 **Bank Account 🏦**  
> - **Properties:** Account Number, Balance, Account Type  
> - **Behaviors:** Deposit Money, Withdraw Money, Check Balance  

---

## **Final Comparison Table**  

| Paradigm  | Focus | Example |
|-----------|---------|---------|
| **Imperative** | "How to do it" (step by step) | Cooking Maggi step by step |
| **Declarative** | "What to do" (final result) | Ordering food from Zomato |
| **Procedural** | Code divided into functions | Making a sandwich step by step |
| **OOP** | Objects and real-world modeling | Car (brand, speed, drive function) |

---

## **Conclusion**  
- **Imperative** is like giving detailed cooking steps.  
- **Declarative** is like ordering food without worrying about steps.  
- **Procedural** is like dividing cooking into smaller tasks.  
- **OOP** is like treating everything as an object (Car, Bank, etc.).  

In **Java, OOP is the most important paradigm** because it helps in creating **real-world models, reusability, and modular programming**.  

---
# Interview Ques....


### 📌 **What is a Programming Paradigm?**  
A **programming paradigm** is a style or way of programming that defines how code is structured and executed. It sets the rules and guidelines for writing and organizing code in a particular manner.

---

### 📌 **How many types of programming paradigms are there?**  
There are **two major types** of programming paradigms:  
1️⃣ **Imperative Paradigm** (Focuses on **how** to achieve a task, step by step).  
2️⃣ **Declarative Paradigm** (Focuses on **what** to achieve without describing how).  

---

### 📌 **What is the difference between Imperative and Declarative programming paradigms?**  
- **Imperative Programming** describes **how** a task is performed using a sequence of instructions. Example: Java, C, Python.  
- **Declarative Programming** describes **what** needs to be done without specifying control flow. Example: SQL, HTML, Prolog.  

---

### 📌 **What are the key features of Imperative Programming?**  
✅ Uses **step-by-step** instructions.  
✅ Follows a **sequence of statements** for execution.  
✅ Includes paradigms like **Unstructured, Structured, Procedural, and OOP**.  

---

### 📌 **Explain the concept of Declarative Programming with an example.**  
Declarative programming focuses on **logic without describing the control flow**.  

🔹 **Example**: SQL Query  
```sql
SELECT name FROM students WHERE age > 18;
```
Here, we specify **what** data we need, not **how** to retrieve it.

---

### 📌 **How does Structured Programming differ from Unstructured Programming?**  
- **Structured Programming** uses loops, functions, and conditionals to control flow (Example: Java, C).  
- **Unstructured Programming** relies on `goto` statements, making code harder to read and maintain.  

---

### 📌 **What is Procedural Programming (POP)?**  
Procedural programming organizes code into **functions (procedures)** that perform tasks. It follows a **top-down approach** where execution happens step by step.  

🔹 **Example in Java**  
```java
public class ProceduralExample {
    public static int multiply(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        int result = multiply(5, 3);
        System.out.println("Result: " + result);
    }
}
```

---

### 📌 **How does Functional Programming differ from Procedural Programming?**  
- **Functional Programming**: Uses **pure functions** and avoids changing state. Example: Haskell, JavaScript (Functional Style).  
- **Procedural Programming**: Uses **functions and procedures** with step-by-step execution. Example: C, Java (Procedural Style).  

---

### 📌 **Why is Object-Oriented Programming preferred in Java over other paradigms?**  
✔ **Code Reusability** (Using Inheritance).  
✔ **Data Security** (Encapsulation).  
✔ **Better Real-World Modeling** (Objects represent real-world entities).  
✔ **Scalability & Maintainability** (Organized structure).  

---

### 📌 **What are the key differences between Procedural Programming and OOP?**  
✅ **Procedural Programming (POP)**  
- Uses **functions (procedures)** to execute step by step.  
- Follows a **top-down approach**.  
- Example: C, Pascal.  

✅ **Object-Oriented Programming (OOP)**  
- Uses **objects and classes** to structure code.  
- Follows a **bottom-up approach**.  
- Example: Java, Python, C++.  

---

### 📌 **What is the difference between Object-Oriented Programming (OOP) and Object-Based Programming?**  
✅ **Object-Oriented Programming (OOP)**  
- **Supports classes and objects**.  
- **Allows inheritance**.  
- Example: Java, C++, Python.  

✅ **Object-Based Programming**  
- **Only supports objects, no classes**.  
- **Does not allow inheritance**.  
- Example: JavaScript (before ES6), VBScript.  

---


