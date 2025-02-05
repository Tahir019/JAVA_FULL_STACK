/*1. WAP to find sum of even numbers and odd numbers from 1 to 100
	int sumEven=0, sumOdd=0;
*/

public class SumEvOdd {

	public static void main(String[] args) {
		int sumEven = 0;
		int sumOdd = 0;
		
		for(int i = 1; i <= 100; i++) {
			if(i%2 == 0)
				sumEven = sumEven + i;
			else
				sumOdd = sumOdd + i;
		}
		System.out.println("Sum of Even Numbers are "+ sumEven);
		System.out.println("Sum of Odd Numbers are "+ sumOdd);
	}

}
