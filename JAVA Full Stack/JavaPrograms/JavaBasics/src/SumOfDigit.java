/*3. WAP to find sum of digits of a given number
		n = 525 (5+2+5 = 12)
*/
import java.util.Scanner;
public class SumOfDigit {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any No: ");
		int n = s.nextInt();
		int sumOfDigit=0;
		while(n>0) {
			sumOfDigit += n % 10;
			n = n/10;
		}
		System.out.println("Sum of digit: "+ sumOfDigit);
		s.close();
	}
}
