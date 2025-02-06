/*1. WAP to display the following output

	-------------------
	 Number  Factorial
	-------------------
	   1        1
	   2        2
	   3        6
	   4       24
	   5      120
	--------------------
	    Sum = 153
	---------------------
*/
import java.util.Scanner;
public class FactorialAssgn {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = s.nextInt();
		fact(n);
		s.close();
	}
	
	static void fact(int n)
	{	
		System.out.println("-----------------------");
		System.out.println("Number Factorial");
		System.out.println("-----------------------");
		int f = 1, sum = 0;
		for(int i=1; i<=n; i++) 
		{
			f = f*i;
			sum = sum + f;
			System.out.println(i +"     "+ f);
		}
		System.out.println("-----------------------");
		System.out.println("Sum = "+sum);
		System.out.println("-----------------------");
	}

}
