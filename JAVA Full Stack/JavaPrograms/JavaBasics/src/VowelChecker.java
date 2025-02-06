//4. WAP to check whether the given character is vowel or consonant (switch)

import java.util.Scanner;

public class VowelChecker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Character: ");
		char ch = sc.next().charAt(0);

		if (Character.isLetter(ch)) {
			switch (Character.toUpperCase(ch)) {
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
				System.out.println("Vowel");
				break;
			default:
				System.out.println("Consonant");
			}
		} else {
			System.out.println("Invalid Input! Please enter an alphabet");
		}

		sc.close();
	}

}
