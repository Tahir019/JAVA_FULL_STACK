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

        // Taking input
        System.out.print("Enter Item Number: ");
        int itmNumber = s.nextInt();
        s.nextLine(); // Consume the newline character

        System.out.print("Enter Item Name: ");
        String itmName = s.nextLine(); // Reads full line for item name

        System.out.print("Enter Item Rate: ");
        int rate = s.nextInt();

        System.out.print("Enter Quantity: ");
        int qty = s.nextInt();

        // Calculate Amount
        float amount = rate * qty;
        float discount = 0.0f; // Initialize discount variable

        // Determine Discount Percentage
        if (amount >= 1000 && amount < 2000) {
            discount = 0.10f * amount;
        } else if (amount >= 2000 && amount < 3000) {
            discount = 0.15f * amount;
        } else if (amount >= 3000 && amount < 5000) {
            discount = 0.20f * amount;
        } else if (amount >= 5000) {
            discount = 0.25f * amount;
        }

        // Calculate Net Amount
        float netAmount = amount - discount;

        // Display the Output
        System.out.println("\n--- Bill Details ---");
        System.out.println("Item Number : " + itmNumber);
        System.out.println("Item Name   : " + itmName);
        System.out.println("Amount      : " + amount);
        System.out.println("Discount    : " + discount);
        System.out.println("Net Amount  : " + netAmount);

        s.close();
    }
}
