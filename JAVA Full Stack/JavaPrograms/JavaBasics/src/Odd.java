//WAP to display odd numbers from 1 to 100
public class Odd {

	public static void main(String[] args) {
		for(int i=1; i<=100; i++) {
			if(i%2!=0) {
				System.out.println(i);
			}
		}
	}

}
// Optimized Version

class Odd2 {
		public static void main(String[] args) {
	        for(int i = 1; i <= 100; i += 2) {  // Increment by 2 to directly go to odd numbers
	            System.out.println(i);
	        }
	        System.out.println("Optimized Code");
	    }

}
