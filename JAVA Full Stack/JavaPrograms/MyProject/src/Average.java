//WAP to accept roll number, name and marks in three subjects. Find total and average.
//Display roll number, name, total and average



import java.util.Scanner;
public class Average {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter Students Roll no. : ");
		int rollNo = s.nextInt();
		
		System.out.println("Enter Student Name: ");
		String studentName = s.next();
		
		System.out.println("Enter marks in three subjects: ");
		Double m1 = s.nextDouble();
		Double m2 = s.nextDouble();
		Double m3 = s.nextDouble();
		Double total = m1 + m2 + m3;
		Double average = total/3;
		
		System.out.println("Roll Number: "+ rollNo);
		System.out.println("Name: "+ studentName);
		System.out.println("Total Marks: "+ total);
		System.out.println("Average: "+ average);
		
		s.close();
		
	}

}
