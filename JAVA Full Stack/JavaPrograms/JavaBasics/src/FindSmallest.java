//2. WAP to find smallest of given 10 numbers

import java.util.Scanner;

public class FindSmallest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        // Initialize with a very large value or first input
        System.out.print("Enter No. 1: ");
        int smallestNo = s.nextInt();

        for (int i = 2; i <= 10; i++) {
            System.out.print("Enter No. " + i + ": ");
            int n = s.nextInt();
            if (n < smallestNo) {
                smallestNo = n;
            }
        }

        System.out.println("Smallest Number = " + smallestNo);
        s.close();
    }
}
