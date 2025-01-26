/*Write a program (WAP) to find area of a rectangle
	area = length * breadth

*/
import java.util.*;
public class Rectange {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		System.out.println("Enter length and breadth of Rectangle: ");
		float length = s.nextFloat();
		float breadth = s.nextFloat();
		float area = length*breadth;
		System.out.println("Area of Rectangle is : "+area);
		
		s.close();
	}

}
