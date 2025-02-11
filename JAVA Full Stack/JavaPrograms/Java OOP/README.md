### JAVA OOP (Object Oriented Programming)
- Classes
- Objects
- this reference
- constructor
- static keyword
- packages
- inheritance
- polymorphism
- super reference
- final keyword
- inner classes
- access modifiers
- abstract classes
- interfaces

#### Class
A class is a collection of data members and methods.  

```
	Ex: class Employee
		{
			//Data members
			int empNum;
			String empName;
			double empSalary;
			
			//Methods
			void setEmpDetails()
			{
				....
			}
			void dispEmpDetails()
			{
				....
			}
		}
		
		empName = "Ramu";//error
```
#### Object
An instance of a class is called as object  
 
**Syntax:**  

ClassName objName = new ClassName();  

```
	Ex:  
			Employee e = new Employee(); // e is an object of class Employee
	  
```
- The members(data members/ methods) of class are accessed using objects with dot(.) operator  

```
Ex:		
		e.empNum = 101;
		e.empName = "Ramu";
		e.setEmpDetails();
```
When a new object is created for a class than it allocates new memory for all data members of the class and the values in data members are default values

###### Default Values  
byte, short, int, long => 0  
float, double => 0.0  
char => ' '  
boolean => false  
Reference type (ex-String) => null

	Refer program EmployeeTest.java
##### this reference  
- this reference to the current object  
- this reference is generally used to differentiate data members of a class and arguments of a method when the names are same  
 
		Refer program EmployeeTest.java
	
#### Constructor  
- A constructor is a special method whose name is same as the class name which is used to initialize the object and does not return anything not even void  
- In java objects are created using constructors  

```
	Ex: 
		class Sample
		{
			int m;
			int n;
			Sample() // constructor
			{
				m = 10;
				n = 20;
			}
			void Sample() {} // not a constructor, an ordinary 									method
		} 

		Sample s = new Sample(); //constructor
		SOP(s.m+" "+s.n); //10 20
		
	Refer program ConstructorDemo.java
```
##### Points on Constructors  
- If a class does not contain a constructor, Java creates a default constructor (no argument constructor)
	
	Ex: class Sample
	{
		Sample(){} // default constructor - added implicitly
	}

- If a class contains a parameterized constructor then it is responsibility to a programmer to create default constructor in the class  

	 Refer Program ConstructorDemo2.java
	 
#### Java OOP Assignments
	Refer document Java OIOP Assignment.pdf

To write all the lines in the same manner under an `#####` heading in Markdown format, you can structure it like this:  

##### AQ1. Write a program which creates a class “Student” with the following

**Data Members**  
- rollNum  
- studName  
- mark1  
- mark2  
- mark3  
- totalMarks  

**Methods**  
- `setStudDetails()` – which sets the values to all the data members except `totalMarks`.  
- `calculateTotal()` - which calculates the `totalMarks`.  
- `displayStudDetails()` – which displays `rollNum`, `studName`, and `totalMarks`.  

Create a class `StudentDemo` to test the functionality of `Student` class.  


	Refer program StudentDemo.java


##### AQ2. Create a class `Account` with the following attributes and methods  

**Attributes:**  
- `accountNo` – int  
- `accountType` – String  
- `accountBalance` – int  

**Methods:**  
- `setAccountDetails()` – sets values to `accountNo`, `accountType`, and `accountBalance`.  
- `withdraw(amount)` – subtracts the given `amount` from the available balance.  
- `deposit(amount)` – adds the given `amount` to the available balance.  
- `dispAccountDetails()` – displays `accountNo`, `accountType`, and `accountBalance`.  

Create a class `Main1` which contains the `main()` method to test the functionality of the `Account` class.  

	Refer program Main1.java









