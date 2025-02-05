/* WAP to accept two numbers and display the following options/menu
	
	1.Add
	2.Subtract
	3.Multiply
	4.Divide

	Display result based on the user choice

	n1=10, n2=5, ch=1 => Result = 15
	n1=10, n2=5, ch=3 => Result = 50
	n1=10, n2=5, ch=7 => Invalid Choice
*/
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("1. Add");
		System.out.println("2. Substract");
		System.out.println("3. Multiply");
		System.out.println("4. Divide");
		System.out.println("Enter Choice: ");
		int ch = s.nextInt();
		
		System.out.println("Enter two Number: ");
		int n1 = s.nextInt();
		int n2 = s.nextInt();
		
		
		switch(ch) {
		case 1: System.out.println(n1+n2);
		break;
		case 2: System.out.println("n1-n2");
		break;
		case 3: System.out.println(n1*n2);
		break;
		case 4: System.out.println(n1/n2);
		break;
		default: System.out.println("Invalid Choice");
		}
		
		s.close();
		
	}

}
