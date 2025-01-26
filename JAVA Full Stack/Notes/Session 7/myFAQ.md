
---

### **FAQ Session-7**

---

#### **1. Java: `double` vs `Double`**

| **Feature**            | **`double` (Primitive)**           | **`Double` (Wrapper Class)**    |
|-------------------------|------------------------------------|----------------------------------|
| **Definition**          | Basic data type for decimals      | Object that wraps `double`      |
| **Memory**              | Lightweight                       | Slightly heavier (more memory)  |
| **Extra Features**      | None                              | Has useful methods (e.g., `parseDouble()`) |
| **Can be Null?**        | No                                | Yes (can be `null`)             |
| **Used in Collections?**| No                                | Yes                             |

---

**Why Use `Double`?**
1. Need extra features like `parseDouble()` to convert Strings to numbers.
2. To store decimal numbers in collections like `ArrayList`.

---

**Examples:**
```java
// Using double
double num1 = 3.14;

// Using Double
Double num2 = 3.14;

// Using a Double method
String str = "2.71";
double parsedValue = Double.parseDouble(str); // Converts "2.71" to 2.71

// Double in Collections
ArrayList<Double> list = new ArrayList<>();
list.add(3.14);
System.out.println("List contains: " + list);
```

---

#### **2. Why Write `PI` in Uppercase?**

- **Convention**: Constants (values that don't change) are written in uppercase for easy identification.
- **Example**:
  ```java
  final double PI = 3.14; // PI is constant
  ```

---

#### **3. What is `final` and Why Use It?**

- `final` ensures the variable's value **cannot be changed** after initialization.
- **Example**:
  ```java
  final double PI = 3.14; // PI is constant
  PI = 3.15; // Error: Cannot reassign a final variable
  ```

---

#### **4. Ways to Declare Variables in Java**

1. **Primitive Declaration**:
   ```java
   int number = 10;
   double radius = 2.5;
   char letter = 'A';
   boolean isTrue = true;
   ```

2. **Wrapper Classes**:
   ```java
   Integer number = 10;
   Double radius = 2.5;
   Character letter = 'A';
   Boolean isTrue = true;
   ```

3. **Constants**:
   ```java
   final double PI = 3.14;
   ```

4. **Uninitialized Variables**:
   ```java
   int number; // Declaration
   number = 10; // Initialization
   ```

5. **Using `var` (Java 10+)**:
   ```java
   var name = "John"; // Compiler infers type as String
   var number = 42;   // Compiler infers type as int
   ```

---

#### **5. Why Use `s.close()` (Scanner Closing)?**

- **What it does**: Frees the resources used by the `Scanner`.
- **Why it’s important**:
  1. Prevents resource leaks.
  2. Avoids warnings in IDEs like Eclipse.
- **What happens if you don’t close?**
  - The program runs, but resource leaks can cause issues in larger applications.
- **Example**:
  ```java
  Scanner s = new Scanner(System.in);
  System.out.println("Enter a number:");
  int num = s.nextInt();
  s.close(); // Close the Scanner to release resources
  ```

---

#### **6. Full Example: Calculating Area of a Circle**

```java
import java.util.*; // Import the Scanner class

public class AreaCircle {

    public static void main(String[] args) {
        final double PI = 3.14; // Declare a constant for PI
        Scanner s = new Scanner(System.in); // Create a Scanner object

        System.out.println("Enter radius of circle: ");
        double radius = s.nextDouble(); // Read user input

        double area = PI * radius * radius; // Calculate the area of the circle
        System.out.println("Area of circle: " + area); // Print the area

        s.close(); // Release the Scanner resource
    }
}
```

---

#### **7. Why Java is Case-Sensitive**

- Java treats `Double` and `double` as two different things because it's case-sensitive.
- **Primitive types** like `double` are built-in, while **wrapper classes** like `Double` are objects with extra functionality.

---

#### **8. Summary Notes**

- **`double`**:
  - Primitive type for decimal numbers.
  - Lightweight, fast, no extra methods.
- **`Double`**:
  - Wrapper class for `double`.
  - Provides methods like `parseDouble()` and works with collections.
- **`PI` in Uppercase**:
  - Constants are written in uppercase for clarity.
- **`final`**:
  - Marks a variable as unchangeable.
- **Closing `Scanner`**:
  - Use `s.close()` to release resources and avoid warnings.

---

#### **9. Extra Tips for Eclipse (for Beginners)**

- **Missing Features in Eclipse**:
  - Eclipse doesn’t have `Ctrl + Enter` for new lines. Instead, press `Enter` manually.
  - Use shortcuts like `Ctrl + Shift + F` to format code.

- **Why Some Prefer Eclipse**:
  - More powerful for Java-specific projects.
  - Integrated tools for debugging and project management.
  - It’s widely used in large-scale projects in the industry.

---