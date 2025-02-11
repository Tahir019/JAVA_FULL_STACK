class Account {
    long accountNo; 
    String accountType;
    int accountBalance;

    // Method to set account details
    void setAccountDetails(long accountNo, String accountType, int accountBalance) {
        this.accountNo = accountNo;
        this.accountType = accountType;
        this.accountBalance = accountBalance;
    }

    // Method to withdraw money
    void withdraw(int amount) {
        if (amount > accountBalance) {
            System.out.println("❌ Sorry, Insufficient Balance.");
        } else {
            accountBalance -= amount;
            System.out.println("✅ Successfully Withdrawn Rs. " + amount);
            System.out.println("💰 Available Balance: Rs. " + accountBalance);
        }
        System.out.println("----------------------------------");
    }

    // Method to deposit money
    void deposit(int amount) {
        accountBalance += amount;
        System.out.println("✅ Successfully Deposited Rs. " + amount);
        System.out.println("💰 New Available Balance: Rs. " + accountBalance);
        System.out.println("----------------------------------");
    }

    // Method to display account details
    void dispAccountDetails() {
        System.out.println("🏦 Account Details");
        System.out.println("📌 Account Number: " + accountNo);
        System.out.println("📌 Account Type: " + accountType);
        System.out.println("💰 Account Balance: Rs. " + accountBalance);
        System.out.println("----------------------------------");
    }
}

public class Main1 {
    public static void main(String[] args) {
        // Creating an Account object
        Account a1 = new Account();
        a1.setAccountDetails(981067000152346L, "Savings", 23000);
        a1.dispAccountDetails();

        // Performing transactions
        a1.withdraw(3000);
        a1.deposit(80000);

        // Display final account details
        a1.dispAccountDetails();
    }
}
