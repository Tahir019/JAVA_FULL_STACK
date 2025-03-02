# Inheritance
- The process of creating new classes from an existing classes is called as inheritance  
- In Java, extend keyword is used to create a new class from an existing class.  
```
	Ex: 
	class Vehicle //Base or Super or Parent class  
	{
		.........
	}
	class Car extend Vehicle //Derived or sub or Child class
	{
		.......
	}
```	
- Through inheritance we can achieve reusability of the code.  
- Java does not support multiple inheritance due to ambiguities means in Java a class extend only one class
```	
	Ex: 
	class A
	{
		..........
	}
	class B
	{
		...............
	}
	class C extends A, B {....} // error - does not support multiple inheritance  
	
	Ex:
		Furniture (Chair, Table)
		Fruit (Mango, Apple, Orange)
		Vehicle (Bike, Car)
		Account (SavingAccount, CurrentAccount)	
```
- Inheritance is "is-a" relationship   
has-a relationship  
------------------------ 
	
	Ex: 
		class Book
		{
		.....
		}
		class Library extends Book{...} // not good
		
		class Library // Library has Book
		{
			Book book;
		}
		
		//Refer Program InheritanceDemo1.java
















