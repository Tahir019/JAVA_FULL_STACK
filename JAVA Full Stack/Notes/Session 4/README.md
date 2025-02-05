📌 Full Stack Java - Lecture 4

📅 Date: 29th October 2024


---

☕ Java Introduction

🔹 What is Java?

Java is an Object-Oriented Programming Language.

It follows the Write Once, Run Anywhere (WORA) principle.

Java applications are compiled into bytecode, which runs on any system with a Java Virtual Machine (JVM).



---

🔹 Object-Oriented Concepts in Java


---

1️⃣ Objects and Classes

🔹 Object

An object has:
✅ Identity – Unique reference name.
✅ State – Data (attributes/variables).
✅ Behavior – Actions it can perform (methods/functions).

🔹 Class

A class is a blueprint for objects.

📌 Example: Java Class Person

class Person {
    // Data members (attributes)
    int age;
    String name;
    float height;
    
    // Methods (behaviors)
    void eat() {
        System.out.println(name + " is eating.");
    }
    
    void walk() {
        System.out.println(name + " is walking.");
    }
}

📌 Creating an Object in Java

Person p = new Person();  
p.age = 25;  
p.name = "John";  
p.height = 5.4f;  
p.walk();  
p.eat();

✔ p is an object of class Person.
✔ Using . (dot operator), we can access variables and methods.


---

🔹 Platform Independence in Java

Why is Java Platform Independent?

Java compiles source code into bytecode (.class file).

Bytecode runs on any operating system with a JVM (Java Virtual Machine).


📌 Diagram Reference: Platform Independent.png (Use a diagram to illustrate).


---

🔹 Downloading and Installing Java 23

📌 Steps to Download Java 23:
1️⃣ Open Google and search: "Java 23 download"
2️⃣ Go to the official Oracle website:
🔗 https://www.oracle.com/in/java/technologies/downloads/
3️⃣ Download and install JDK 23.

📌 Java Installation Path:

C:\Program Files\Java\jdk-23

📌 Setting JAVA_HOME Environment Variable

JAVA_HOME = C:\Program Files\Java\jdk-23

📌 Java Commands Location:

java.exe and javac.exe are inside JAVA_HOME\bin folder.


---

🔹 Setting Up Java Path in Command Prompt

📌 To use Java from any location in CMD, set the path:

C:\>set path = C:\Program Files\Java\jdk-23\bin;%path%;

✔ This allows you to run Java commands from anywhere in the terminal.


---

🔹 Developing a Java Application in CMD

1️⃣ Open Command Prompt

Press Win + R, type cmd, and press Enter.

You will see:

C:\>


2️⃣ Create a Project Directory

Use md (make directory) to create a folder named JavaPrograms:

C:\>md JavaPrograms

Navigate to the folder using cd (change directory):

C:\>cd JavaPrograms
C:\JavaPrograms>


3️⃣ Create a Java File (HelloWorld.java)

Open Notepad and create a Java file:

C:\JavaPrograms>notepad HelloWorld.java

Type the following Java code:


// Display "Hello World" message on the screen
class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}

Save the file (Ctrl + S).


4️⃣ Compile the Java Program

Run the following command:

C:\JavaPrograms>javac HelloWorld.java


✔ This creates HelloWorld.class, which contains the bytecode.

5️⃣ Run the Java Program

Execute the Java class file:

C:\JavaPrograms>java HelloWorld


✔ Output:

Hello World


---

🔹 Important Java Rules

📌 1️⃣ Every statement should end with a semicolon (;)
📌 2️⃣ Java is case-sensitive
✔ System is different from system.


---

🔹 System.out.println() in Java

📌 What is System.out.println()?

Used to display messages, variable values, or both.

System – A predefined Java class.

out – Represents the standard output stream.

println() – Prints text with a newline.


📌 Example: Displaying a String

System.out.println("Welcome");

✔ Output:

Welcome

📌 Example: Displaying a Variable

int age = 20;
System.out.println(age);

✔ Output:

20

📌 Example: Displaying Text and Variables Together

int netSalary = 50000;
System.out.println("Net Salary = " + netSalary);

✔ Output:

Net Salary = 50000


---

🎯 Summary of Lecture 4

🔹 Java is an Object-Oriented Programming Language.
🔹 Java is platform independent due to bytecode and JVM.
🔹 Java follows OOP concepts like Objects, Classes, Abstraction, Encapsulation, Inheritance, and Polymorphism.
🔹 To install Java, download JDK 23 from Oracle's website.
🔹 Set Java Path using set path = C:\Program Files\Java\jdk-23\bin;%path%.
🔹 Developing a Java Program:
1️⃣ Create a Java file (HelloWorld.java).
2️⃣ Compile using javac HelloWorld.java.
3️⃣ Run using java HelloWorld.
🔹 System.out.println() is used to print messages and variables.


---

📌 Interview Questions & Answers

1️⃣ What is Java?

Java is an Object-Oriented Programming Language that follows the Write Once, Run Anywhere (WORA) principle.

2️⃣ What is Platform Independence in Java?

Java code is compiled into bytecode, which runs on any JVM (Java Virtual Machine), making it platform independent.

3️⃣ How do you install Java on Windows?

1️⃣ Download JDK 23 from Oracle's website.
2️⃣ Install Java and set JAVA_HOME environment variable.
3️⃣ Add Java's bin folder to the system path.

4️⃣ How do you print output in Java?

Using System.out.println(), which prints a message to the console.
📌 Example:

System.out.println("Hello, Java!");


---

📢 Next Step: Share your 5th lecture notes, and I'll format them professionally! 🚀

