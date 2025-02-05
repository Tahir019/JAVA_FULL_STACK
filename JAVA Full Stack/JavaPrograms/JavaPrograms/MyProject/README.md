### 📌 **Java Basics to Loops**
---
# **Java Programming Basics**
📌 This repository contains fundamental Java concepts covered from **Introduction to Loops**. The notes include **brief explanations, code examples, and key points** to build a strong foundation in Java.  

---

## 🔹 **Introduction to Java**
- Java is a **high-level, object-oriented, platform-independent** programming language.
- It follows the **Write Once, Run Anywhere (WORA)** principle due to the **Java Virtual Machine (JVM)**.
- It is widely used for **web, mobile, and enterprise applications**.

### ✅ **Key Features of Java**
- **Simple & Secure**
- **Object-Oriented**
- **Platform Independent (JVM)**
- **Multi-threaded & High Performance**
- **Rich API & Large Community Support**

---

## 🔹 **Java Basics**
### ✅ **1. Structure of a Java Program**
```java
// Basic Java Program
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, Java!");
    }
}
```
📌 **Explanation:**
- `public class HelloWorld` → Defines a class named **HelloWorld**.
- `public static void main(String[] args)` → The **main method**, the entry point of Java programs.
- `System.out.println("Hello, Java!");` → Prints text to the console.

---

## 🔹 **2. Java Variables & Data Types**
### ✅ **Types of Variables in Java**
| Variable Type  | Scope | Example |
|---------------|-------|---------|
| **Local**     | Inside a method/block | `int x = 10;` |
| **Instance**  | Defined in a class | `String name;` |
| **Static**    | Shared across all instances | `static int count;` |

### ✅ **Primitive Data Types**
| Type | Size | Example |
|------|------|---------|
| `byte` | 1 byte | `byte b = 127;` |
| `short` | 2 bytes | `short s = 32000;` |
| `int` | 4 bytes | `int num = 10;` |
| `long` | 8 bytes | `long bigNum = 100000L;` |
| `float` | 4 bytes | `float pi = 3.14f;` |
| `double` | 8 bytes | `double precise = 3.14159;` |
| `char` | 2 bytes | `char letter = 'A';` |
| `boolean` | 1 bit | `boolean isJavaFun = true;` |

---

## 🔹 **3. Operators in Java**
### ✅ **Types of Operators**
| Operator Type  | Description | Example |
|---------------|-------------|---------|
| **Arithmetic** | `+`, `-`, `*`, `/`, `%` | `int sum = a + b;` |
| **Relational** | `==`, `!=`, `>`, `<`, `>=`, `<=` | `if (x > y)` |
| **Logical** | `&&`, `||`, `!` | `if (a > 10 && b < 5)` |
| **Bitwise** | `&`, `|`, `^`, `~` | `int result = a & b;` |
| **Assignment** | `=`, `+=`, `-=`, `*=`, `/=` | `x += 5;` |
| **Ternary** | `condition ? expr1 : expr2` | `int min = (a < b) ? a : b;` |

---

## 🔹 **4. Conditional Statements**
### ✅ **if-else Statement**
```java
int age = 18;
if (age >= 18) {
    System.out.println("You can vote!");
} else {
    System.out.println("You cannot vote.");
}
```

### ✅ **Switch Case**
```java
int day = 3;
switch (day) {
    case 1: System.out.println("Monday"); break;
    case 2: System.out.println("Tuesday"); break;
    case 3: System.out.println("Wednesday"); break;
    default: System.out.println("Invalid day");
}
```
📌 **Use switch when checking multiple values of a single variable.**

---

## 🔹 **5. Loops in Java**
### ✅ **1. For Loop**
```java
for (int i = 1; i <= 5; i++) {
    System.out.println("Count: " + i);
}
```

### ✅ **2. While Loop**
```java
int i = 1;
while (i <= 5) {
    System.out.println("Iteration: " + i);
    i++;
}
```

### ✅ **3. Do-While Loop**
```java
int i = 1;
do {
    System.out.println("Number: " + i);
    i++;
} while (i <= 5);
```
📌 **Difference between `while` and `do-while`:**  
- `while` → **Condition checked first**, then executes.
- `do-while` → **Executes first**, then checks condition.

---

## 🔹 **6. Programs Covered**
| No. | Program | Description |
|----|---------|-------------|
| 1️⃣ | `PrimeOrNot.java` | Check if a number is prime |
| 2️⃣ | `SumPrime.java` | Find the sum of prime numbers (2 to 100) |
| 3️⃣ | `Factorial.java` | Calculate factorial of a number |
| 4️⃣ | `EvenOdd.java` | Check if a number is even or odd |
| 5️⃣ | `BiggestNumber.java` | Find the largest of three numbers |
| 6️⃣ | `Table.java` | Print multiplication table |
| 7️⃣ | `BreakDemo.java` | Demonstrate `break` in a loop |
| 8️⃣ | `ContinueDemo.java` | Demonstrate `continue` in a loop |

---

## 🚀 **Next Steps: Arrays in Java**
From tomorrow, **we start learning arrays**, including:
- **One-dimensional arrays**
- **Two-dimensional arrays**
- **Array methods**
- **Sorting algorithms (Bubble, Selection, Insertion Sort)**

Stay tuned! 🔥💻

---

### 📌 **How to Run Java Programs**
1. Open **Eclipse** and create a new Java file.
2. Copy and paste any code snippet.
3. Click **Run ▶️** or use `Ctrl + F11`.
4. See the output in the **Console**.

---

## 🤝 **Contributing**
Want to improve or add more notes?  
Feel free to fork this repo and submit a pull request! 🚀

---

## 📜 **License**
This repository is open-source under the **MIT License**. You are free to use, modify, and distribute it.

---

## 🎯 **Conclusion**
Congratulations! 🎉 You have successfully learned **Java basics up to loops**.  
This `.md` file will help you revise and **push your code to GitHub** for future reference.  

Happy Coding! 🚀🔥  

---

