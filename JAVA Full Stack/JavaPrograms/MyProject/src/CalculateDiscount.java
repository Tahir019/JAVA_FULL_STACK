/*3. WAP to accept item number, item name, rate and quantity. Find amount (rate * qty).
   	Calculate discount as follows

	if (amount >= 1000 and < 2000)
	   discount is 10% on amount
	if (amount >= 2000 and < 3000)
	   discount is 15% on amount
	if (amount >= 3000 and < 5000)
	   discount is 20% on amount
	if (amount >= 5000)
	   discount is 25% on amount

	Calculate net amount (amount - discount).
	Display item number, item name, amount, discount and net amount


	
	Program
	-------
	if (amount >= 1000 && amount < 2000)
	   discount = 0.10 * amount;
*/
import java.util.Scanner;
public class CalculateDiscount {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Item Number: ");
		int itmNumber = s.nextInt();
		System.out.println("Enter Item Name: ");
		String itmName = s.next();
		System.out.println("Enter Item Rate: ");
		int rate = s.nextInt();
		System.out.println("Enter Quantity: ");
		int qty =s.nextInt();
		float amount = (rate*qty);
		
		if(amount>=1000 && amount<2000) {
			float discount = (float)0.10*amount;
			float netAmount = (amount - discount );
			
			System.out.println("Item Number: "+ itmNumber);
			System.out.println("Item Name: "+ itmName);
			System.out.println("Amount: "+ amount);
			System.out.println("Discount: "+ discount);
			System.out.println("Net Amount: "+ netAmount);
		}
		else if(amount>=2000 && amount<3000) {
			float discount = (float)0.15*amount;
			float netAmount = (amount - discount );
			
			System.out.println("Item Number: "+ itmNumber);
			System.out.println("Item Name: "+ itmName);
			System.out.println("Amount: "+ amount);
			System.out.println("Discount: "+ discount);
			System.out.println("Net Amount: "+ netAmount);
		}
		else if(amount>=3000 && amount<5000) {
			float discount = (float)0.20*amount;
			float netAmount = (amount - discount );
			
			System.out.println("Item Number: "+ itmNumber);
			System.out.println("Item Name: "+ itmName);
			System.out.println("Amount: "+ amount);
			System.out.println("Discount: "+ discount);
			System.out.println("Net Amount: "+ netAmount);
		}
		else if(amount>=5000) {
			float discount = (float)0.25*amount;
			float netAmount = (amount - discount );
			
			System.out.println("Item Number: "+ itmNumber);
			System.out.println("Item Name: "+ itmName);
			System.out.println("Amount: "+ amount);
			System.out.println("Discount: "+ discount);
			System.out.println("Net Amount: "+ netAmount);
		}
		
		
		s.close();
		
	}

}
