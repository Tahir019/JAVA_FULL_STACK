//WAP to find biggest of given three numbers
//	n1, n2, n3

public class BigThree {

	public static void main(String[] args) {
		int n1 = 15;
		int n2 = 16;
		int n3 = 8;
		
		if (n1>n2) {
			if(n1>n3) {
				System.out.println(n1+" is greater than "+n2 +" and "+n3 );
			}
			else {
				System.out.println(n3+" is grater than "+n1 +" and "+ n2);
			}
		}
		else {
			if(n2>n3) {
				System.out.println(n2+" is grater tha "+n1 +" and "+ n3);
			}
			else {
				System.out.println(n3+" is grater than "+n1 +" and "+ n2);
			}
		}
		
		
	}

}
