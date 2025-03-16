# Java Constructors

## What is a Constructor?
A **constructor** is a special method that:
- Has the same name as the class.
- Does not have any return type (not even `void`).
- Is automatically called when an object is created.

### Example:
```java
class Animal {
    Animal() {
        // Constructor body
    }
}
```

## Use of Constructors
- **Constructors are used to initialize an object**, but **not for object creation**.
- They are **executed exactly at the time of object creation**, neither before nor after.
- They **execute automatically** when an object is created.

## Syntax of Constructor:
```java
access-modifiers ClassName(list of parameters) throws Exception1, Exception2, ... {
    // Initialization code
}
```
- **Access modifiers**: `public`, `protected`, `private`, or **default** (package-private).
- **Cannot** use keywords like `abstract`, `final`, `static`, or `synchronized`.

## Types of Constructors:
1. **Default Constructor** (Created by Compiler)
2. **Zero-Argument Constructor** (Created by Programmer)
3. **Parameterized Constructor** (Created by Programmer)

---

### 1️⃣ Default Constructor
- When **no constructor is defined**, the compiler automatically creates a **default constructor**.
- Default constructors provide default values (e.g., `0`, `null`, `false`).
- If a programmer defines any constructor, **the compiler does not generate a default constructor**.

#### Default Constructor Prototype:
- Access modifier is the **same** as the class access modifier.
- Cannot be `private` or `protected`.
- Contains only `super();`.

#### Example:
```java
class Test {
    Test() {
        super();
    }
}
```

---

### 2️⃣ Zero-Argument Constructor
- Created by the programmer.
- Does **not** take any parameters.

#### Example:
```java
class Test {
    Test() {
        // Initialization code
    }
}
```

---

### 3️⃣ Parameterized Constructor
- Created by the programmer.
- Accepts parameters for **custom initialization**.

#### Example:
```java
class Test {
    Test(int a, int b) {
        // Initialization using parameters
    }
}
```

---

## 🔍 Difference Between Method and Constructor

| Feature            | Method | Constructor |
|--------------------|--------|-------------|
| Return Type       | Has a return type | No return type (not even `void`) |
| Name              | Any valid name | Must have the same name as the class |
| Purpose          | Performs a specific task | Initializes an object |
| Invocation       | Must be explicitly called | Called automatically when an object is created |
| Compiler Action  | Not auto-generated | Auto-generated if no constructor is defined |

---

## 🔗 Related Topics
1. **Constructors with Inheritance**
2. **Constructor Overloading and Overriding**
3. **Constructor Chaining (using `this` keyword)**
4. **Use of `super` Keyword in Constructor**
5. **Constructors with Abstract Classes & Interfaces**
6. **Constructors and Exception Handling**
7. **Copy Constructor**

---

## 📌 Additional Notes
- `Constructor` is a predefined class in the **`java.lang.reflect` package**.
- It is used to get **constructor-related information** at runtime.

---

