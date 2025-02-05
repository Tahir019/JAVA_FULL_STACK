/*WAP to find the factorial of a given number

	n = 5

	5! = 5 * 4 * 3 * 2 * 1 = 120

	f = 1
*/
import java.util.Scanner;
public class Factorial {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int n = s.nextInt();
		int f = fact(n);
		System.out.println("Factorial ="+f);
		
		s.close();
	}
	
	static int fact(int n) // n is an argument/ parameter
	{
		int f = 1;
		for(int i=n;i>=1;i--)
			f = f * i;
		return f;
	}
}
