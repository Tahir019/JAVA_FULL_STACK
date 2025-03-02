//Polymorphism - Method overloading and Method overriding
package Polymorphism;

class Base
{
	int i;
	int j;
	void input(int i, int j)
	{
		this.i = i;
		this.j = j;
	}
	void display()
	{
		System.out.println("i="+i+"j="+j);
	}
}
class Derived extends Base
{
	int k;
	void input(int k) //overloaded method
	{
		this.k = k;
	}
	void display() //overridden method
	{	
		super.display();
		System.out.println("k="+k);
	}
}

public class InheritanceDemo2 {

	public static void main(String[] args) {
		Base b = new Base(); //b.i=0, b.j=0
		b.input(45, 5); //b.i=45, b.j=5
		b.display(); // i=45, j=5
		Derived d = new Derived(); //d.i=0, d.j=0, d.k=0
		d.input(98, 78); //d.i=98, d.j=78
		d.display(); // i=98 j=78 k=0
		d.input(50); //d.k=50
		d.display(); // i=98 j=78 k=50
	}

}
