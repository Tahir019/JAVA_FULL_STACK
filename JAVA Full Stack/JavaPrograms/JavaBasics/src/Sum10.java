import java.util.Scanner;
public class Sum10{
	public static void main(String[] args) {
		int sum=0;
		for(int i=1; i<=10; i++) {
			sum = sum+i;
		}
		System.out.println("Sum = "+sum);
	}
}
class SumOfGiven10Num{
	public static void main(String[] args) {
		Scanner s  = new Scanner(System.in);
		
		int sum = 0;
		for(int i=0; i<=10; i++) {
			System.out.println("Enter no.: ");
			int n = s.nextInt();
			sum = sum+n;
			System.out.println("Sum Of given no. is "+ sum);
		}
		s.close();
	}
}

class SumTen {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n, i=1, sum=0;
		while (i <= 10)
		{
			System.out.println("Enter a Number");
			n = s.nextInt();
			sum = sum + n;//sum += n;
			i++;//i=11
		}
		System.out.println("Sum = "+sum);
		
		s.close();
	}

}
