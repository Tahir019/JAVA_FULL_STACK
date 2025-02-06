/*1.WAP to check whether the given age is major (>=18) or minor
	  Note: If the given age is < 0, then display "Invalid Age"
*/
import java.util.Scanner;
public class AgeChecker {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter your age: ");
		int age = s.nextInt();
		
		if(age>=18) {
			System.out.println("Major");
		}
		else if(age<0) {
			System.out.println("Invalid age");
		}
		else{
			System.out.println("Minor");
		}
		
		s.close();
	}

}
