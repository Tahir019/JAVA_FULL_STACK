/*WAP to accept the current balance and display the following options/menu

	1.Deposit
	2.Withdraw
	3.Display Balance
	4.Exit

	The menu should display repeatedly when the condition is true
*/
import java.util.Scanner;

public class Bank {
    
    // Method to display the menu
    static void starter() {
        System.out.println("\nWelcome to Banking Page!");
        System.out.println("_____________________________");
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Display Balance");
        System.out.println("4. Exit");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double currBalance = 0; // Current balance initialized to 0

        while (true) { // Infinite loop to repeatedly show menu
            starter(); // Call the function to show the menu
            System.out.print("Choose any option: ");
            int ch = sc.nextInt();

            switch (ch) {
                case 1: // Deposit
                    System.out.print("Enter Deposit Amount: ");
                    double depAmount = sc.nextDouble();
                    currBalance += depAmount; // Increase balance
                    System.out.println("Amount Deposited Successfully!");
                    break;

                case 2: // Withdraw
                    System.out.print("Enter Withdrawal Amount: ");
                    double withdrawAmount = sc.nextDouble();
                    if (withdrawAmount > currBalance) {
                        System.out.println("Insufficient Balance!");
                    } else {
                        currBalance -= withdrawAmount;
                        System.out.println("Amount Withdrawn Successfully!");
                    }
                    break;

                case 3: // Display Balance
                    System.out.println("Current Balance: ₹" + currBalance);
                    break;

                case 4: // Exit
                    System.out.println("Thank you for using our banking system!");
                    sc.close();
                    System.exit(0); // Terminate program

                default:
                    System.out.println("Invalid Choice! Please try again.");
            }
        }
    }
}
