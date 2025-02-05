/*
 * WAP to display multiplication table for given number 
 * n = 5
 * 
 * 5 * 1 = 5
 * 5 * 2 = 10
 * 
 */
import java.util.Scanner;
public class Table {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = s.nextInt();
		mtable(n);
//		for(int i=1; i<=10; i++) {
//			int p = n*i;
//			System.out.println(n+"*"+i+"="+n*i);
//		}
		s.close();
	}
	
	static void mtable(int n)
	{
		for(int i=1; i<=10; i++) {
			int p = n*i;
			System.out.println(n+"*"+i+"="+p);
		
		}
	}

}