//WAP to find biggest of given 10 numbers


import java.util.Scanner;
public class BiggestNo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int big=0;
		for(int i=0; i<=10; i++) {
		System.out.println("Enter no.: ");
		int n = s.nextInt();
		if(n>big)
			big = n;
		}
		System.out.println("Biggest No. is "+ big);
		
		s.close();
	}

}

// here is a correct code

class BigNo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int big = Integer.MIN_VALUE; // Initialize with the smallest possible integer

        for (int i = 0; i < 10; i++) { // Loop runs exactly 10 times
            System.out.print("Enter no.: ");
            int n = s.nextInt();
            if (n > big) {
                big = n;
            }
        }

        System.out.println("Biggest No. is " + big);
        s.close();
    }
}

