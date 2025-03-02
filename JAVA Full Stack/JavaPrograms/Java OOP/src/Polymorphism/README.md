# Polymorphism
Polymorphism means many forms  

		Types  
		-------  
		- Compile Time  
				- Method overloading  
		- Runtime polymorphism  
				- Method overriding  
## Method overloading
- Method name is same but the signature is different
	signature => number of argument/type of arguments  
	
	Ex: 
		int area(int, int, int){.....}
		int area(int, int){......}
		float area(float, float){.....}
- Applicable within the same class as well as subclasses  

## Method overriding
- Method name is same and signature is also same
- Applicable only in subclasses
	
	Ex: 
		class Vehicle
		{
			void drive(){....}
		}
		class Car extends Vehicle
		{
			void drive(int speed){.....}// overload method  
			void drive(){....}// overridden method
		}
		
		Car c = new Car();
		c.drive();// invokes drive() of car
- If a subclass object invokes the overridden method then it can invoke the method present in subclass
	
	Refer program InheritanceDemo2.java
	
## super reference
- It is invoke the Base class members from derived class method
	
	Refer program InheritanceDemo2.java
	

		
		
		
		
		
		