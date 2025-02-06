/*
 * WAP to check whether the given number is prime or not
 */
import java.util.Scanner; // Import Scanner for input

public class PrimeOrNot { // Class definition
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner object
        System.out.print("Enter a number: ");
        int n = sc.nextInt(); // Take input from the user
        sc.close(); // Close the Scanner to prevent memory leaks

        // Step 1: Handle edge cases
        if (n <= 1) { 
            System.out.println(n + " is NOT a prime number."); // Numbers <= 1 are not prime
            return; // Exit early
        }

        boolean isPrime = true; // Assume number is prime

        // Step 2: Loop from 2 to √n to check for factors
        for (int i = 2; i * i <= n; i++) { 
            if (n % i == 0) { // If n is divisible by i, it's not prime
                isPrime = false; // Mark it as not prime
                break; // Stop checking further
            }
        }

        // Step 3: Print the result
        if (isPrime) {
            System.out.println(n + " is a Prime number.");
        } else {
            System.out.println(n + " is NOT a Prime number.");
        }
    }
}
