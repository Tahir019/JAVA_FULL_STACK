package Inheritance;

class Base
{
	int i;
	int j;
	void inputIJ(int i, int j)
	{
		this.i = i;
		this.j = j;
	}
	void displayIJ()
	{
		System.out.println("i="+i+"j="+j);
	}
}
class Derived extends Base
{
	int k;
	void inputK(int k)
	{
		this.k = k;
	}
	void displayK()
	{
		System.out.println("k="+k);
	}
}

public class InheritanceDemo1 {

	public static void main(String[] args) {
		Base b = new Base(); //b.i=0, b.j=0
		b.inputIJ(45, 5); //b.i=45, b.j=5
		b.displayIJ(); // i=45, j=5
		Derived d = new Derived(); //d.i=0, d.j=0, d.k=0
		d.inputIJ(98, 78); //d.i=98, d.j=78
		d.displayIJ(); // i=98, j=78
		d.inputK(50); //d.k=50
		d.displayK(); // k=50
	}

}
