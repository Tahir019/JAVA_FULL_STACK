# Java Object Creation 

## 📌 How Objects are Created in Java?

When we run a Java program, an object goes through several steps before it is fully created. Let's break it down **step-by-step** with a **real-world example** of an **Animal class**.

### 🔹 Step 1: Compilation

When we compile the program using:
```bash
javac AnimalMain.java
```
- The **compiler** checks for syntax errors.
- If there are no errors, it generates `.class` files.
- The number of `.class` files generated depends on the number of classes in the program.

### 🔹 Step 2: Running the Program

When we execute:
```bash
java AnimalMain
```
The following steps happen in sequence:

#### 🔹 Step 2.1: Class Loading
- `AnimalMain.class` file is loaded into the **Method Area** of the JVM.
- A **java.lang.Class object** is created in the **Heap Area** to store metadata about the class.

#### 🔹 Step 2.2: Main Method Execution
- The JVM creates a new **main thread**.
- A **stack memory** is allocated to this thread.
- The first line in `main` executes:
```java
Animal ob = new Animal();
```

#### 🔹 Step 2.3: Object Creation in Heap
1. **JVM asks the Heap Manager** to create an object of `Animal`.
2. **Heap Manager calculates the object size** based on instance variables in the `Animal` class.
3. **Heap Manager allocates memory** and creates an object in the **Heap Area**.

#### 🔹 Step 2.4: Assigning a Unique Identifier
- The object is assigned a **unique integer value** called `hashcode`.
- JVM **converts it into hexadecimal format** (known as a **reference value**).
- This **reference value is assigned to the reference variable** (`ob`).

#### 🔹 Step 2.5: Object Initialization
- All **instance variables** are assigned their default values (or original values if provided).

---

## 🏠 Real-World Example: House Object Creation

Think of object creation like **building a house**:
1. **Blueprint is ready** (`Animal.class` is loaded into Method Area).
2. **Construction starts** (Memory allocation in Heap).
3. **House is assigned an address** (Hexadecimal reference value).
4. **Rooms are furnished** (Instance variables get values).
5. **House key is given** (Reference variable stores address of object).

---

## 🔥 Important Java Concepts

### 📌 `java.lang.Class`
- Represents a **class or interface** in Java.
- Stores metadata about the class.

### 📌 `java.lang.Object`
- **Parent class of all Java classes**.
- Every class in Java **implicitly inherits `Object` class**.

### 📌 Reflection API
- **`java.lang.reflect.Method`** → Allows access to class methods at runtime.
- **`java.lang.reflect.Constructor`** → Allows access to class constructors at runtime.

---

## 🔥 VVI Interview Questions & Answers

### ❓ Q1: What is the purpose of the `new` keyword in Java?
✅ **Answer:** The `new` keyword is used to **create objects** in Java. It allocates memory for the object in the **Heap Area** and returns a **reference to that memory location**.

### ❓ Q2: What happens when you run a Java program?
✅ **Answer:**
1. The **JVM loads the class** into memory.
2. The **`main` method is executed**.
3. If objects are created, **memory is allocated in the Heap**.
4. JVM **assigns a reference value** to the object.

### ❓ Q3: What is `hashcode` in Java?
✅ **Answer:**
- A **unique integer value** assigned to an object.
- JVM **converts it into hexadecimal format** to create a reference value.

### ❓ Q4: Why is Java not 100% Object-Oriented?
✅ **Answer:** Java is not fully object-oriented because it **uses primitive data types** (`int`, `char`, etc.), which are **not objects**.

---

## 📌 Understanding Java Memory Areas (Beginner-Friendly)

> **🔷 Quick Guide to Java Memory Areas**

📌 **Heap Memory (Big Storage Room):** Stores objects. Garbage Collector cleans unused objects.
📌 **Stack Memory (Small Temporary Desk):** Stores local variables & method calls. Cleared after method execution.
📌 **Method Area (Instruction Manual):** Stores class definitions and method data.
📌 **Reference Variable (Parking Ticket 🎫):** Stores address of object in Heap.

**🚀 Super Easy Real-World Examples:**

✅ **Heap = Warehouse 🏢:** Objects stored permanently until no longer needed.
✅ **Stack = Desk 📝:** Temporary data storage that is removed after use.
✅ **Method Area = Recipe Book 📖:** Stores program instructions but not actual objects.
✅ **Reference Variable = Parking Ticket 🎫:** Holds the memory address of objects in Heap.

**🔥 Important Question:** What is the difference between Heap & Stack?

| Feature  | Stack  | Heap  |
|----------|--------|--------|
| **Used For** | Temporary variables & method calls | Stores objects & instances |
| **Size** | Small | Large |
| **Speed** | Fast | Slow |
| **Cleanup** | Automatic (when method ends) | Garbage Collector cleans unused objects |
