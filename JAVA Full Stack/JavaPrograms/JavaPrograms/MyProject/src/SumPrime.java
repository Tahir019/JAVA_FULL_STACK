//4. WAP to find sum of prime numbers from 2 to 100

public class SumPrime {
    
    // Function to check if a number is prime
    public static boolean isPrime(int n) {
        if (n < 2) return false; // Numbers less than 2 are not prime
        for (int i = 2; i * i <= n; i++) { // Check divisibility up to √n
            if (n % i == 0) return false; // If divisible, not prime
        }
        return true; // If no divisor found, it's prime
    }

    public static void main(String[] args) {
        int sum = 0; // Initialize sum variable

        for (int i = 2; i <= 100; i++) { // Loop from 2 to 100
            if (isPrime(i)) { // Check if i is prime
                sum += i; // Add prime number to sum
            }
        }

        System.out.println("Sum of prime numbers from 2 to 100: " + sum);
    }
}
