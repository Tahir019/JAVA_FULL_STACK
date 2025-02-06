//WAP to create an int array of given size 
//and display the elements of the array.
import java.util.Scanner;
public class ArrayCreate {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter array size");
		int size = s.nextInt();
		int [] n = new int[size];
		System.out.println("Enter "+size+" values");
		for(int i = 0; i < n.length; i++) 
			n[i] = s.nextInt();
		System.out.println("Given array Elements");
		for(int i = 0; i< n.length; i++)
			System.out.println(n[i]);
		
		//Enhanced for loop (foreach) - added in java 5 version
		System.out.println("Given Array Elements - foreach");
		for(int x : n)
			System.out.println(x);
		
		s.close();
	}

}
