//2. WAP to find biggest of given three numbers using conditional operator (?)

import java.util.Scanner;
public class BiggestThreeNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter three numbers: ");
		int n1 = s.nextInt();
		int n2 = s.nextInt();
		int n3 = s.nextInt();
		
		int largest = (n1>n2)?((n1>n3)?n1:n3):((n2>n3)?n2:n3);
		System.out.println("Largest number is: "+ largest);
		
		s.close();
	}

}
