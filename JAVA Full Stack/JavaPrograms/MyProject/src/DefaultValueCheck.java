// Checking Default value of data member and local variable in java
public class DefaultValueCheck {

	int m; // data member
	
	void pppp() // method
	{
		int n; // local variable
		//System.out.println(n); //Error - local variable n should be initialized
	}
	public static void main(String[] args) {
		DefaultValueCheck obj = new DefaultValueCheck();
		System.out.println(obj.m);
		obj.pppp();

	}

}
