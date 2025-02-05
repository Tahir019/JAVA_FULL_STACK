//WAP to check whether the given number is even or odd

import java.util.Scanner;
public class EvenOdd {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any Number: ");
		int num = s.nextInt();
		
		if(num%2==0) {
			System.out.println("Even Number");
		}
		else {
			System.out.println("Odd Number");
		}
		
		s.close();
	}

}
