import java.util.Scanner;
public class ArraySum {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Size of Array");
		int size = s.nextInt();
		int []arr = new int [size];
		int sum = 0;
		System.out.println("Enter "+size+" Elements");
		for(int i=0; i<arr.length; i++) {
			 arr[i] = s.nextInt();
			 sum = sum+ arr[i];
		}
		System.out.println("Sum of array is "+ sum);
		s.close();
	}

}
