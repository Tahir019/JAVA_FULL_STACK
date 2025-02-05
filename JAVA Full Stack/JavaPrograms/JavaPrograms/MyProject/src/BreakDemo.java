/*
 * Write a program to accept numbers from user until the user enters zero (0)
 * and find the sum of these numbers.
 */
import java.util.Scanner;
public class BreakDemo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n, sum = 0;
		while(true) // infinite loop
		{
			System.out.println("Enter a Number to stop enter zero(0)");
			n = s.nextInt();
			if(n==0)
				break;
			sum = sum + n; 
		}
		System.out.println("Sum ="+sum);
		
		s.close();
		
	}

}
