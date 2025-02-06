/*WAP to check whether the given number is positive or negative or zero
*/
import java.util.Scanner;
public class CheckNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a  Number: ");
		int num = s.nextInt();
		
		if (num==0) {
			System.out.println("Number is Zero");
		}
		else if(num>0) {
			System.out.println("Number is Positive");
		}
		else {
			System.out.println("Number is Negative");
		}
		
		s.close();
	}

}
