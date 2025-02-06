/*2. WAP to accept item number, item name, rate and quantity. Find amount (rate * qty).
   Display item number, item name and amount
*/

import java.util.Scanner;
public class DisplayItemAmount {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Item Number: ");
		int itmNumber = s.nextInt();
		s.nextLine();
		
		System.out.println("Item Name: ");
		String itmName = s.nextLine();
		
		System.out.println("Rate: ");
		double rate = s.nextDouble();
		
		System.out.println("Quantity: ");
		int qty = s.nextInt();
		
		double amount = (rate*qty);
		
		System.out.println("Item Number: "+itmNumber +"\nItem Name: "+itmName +"\nAmount:" +amount);
		
		s.close();
		

	}

}
