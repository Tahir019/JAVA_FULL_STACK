
/*1. WAP to find area of a Circle
	
	double PI = 3.14;
	area = PI * radius * radius;
*/

import java.util.*;
public class areaCircle {
	
	
	public static void main(String[] args) {
		final double PI = 3.14;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter radius of circle: ");
		double radius = s.nextDouble();
		
		double area = PI*radius*radius;
		System.out.println("Area of circle: "+ area);
		
		s.close(); //release the scanner resources
	}

}
