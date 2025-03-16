class Birds
{
	void fly()
	{
		System.out.println("I'm flying");
	}
}

class Animal
{
	int age = 10;
	String color = "black";

	void eat(){
		System.out.println("I'm eating");
	}

  public static void main(String[] args){
	Animal obj = new Animal();
	
	System.out.println("Age :" +obj.age);
	System.out.println("Color :" +obj.color);

	obj.eat();
	
	Birds crow = new Birds();
	crow.fly();
  }
}
