class Student
{
	int rollNum;
	String studName;
	int mark1;
	int mark2;
	int mark3;
	int totalMarks;
	
	void setStudDetails(int rollNum, String studName, int mark1, int mark2, int mark3)
	{
		this.rollNum = rollNum;
		this.studName = studName;
		this.mark1 = mark1;
		this.mark2 = mark2;
		this.mark3 = mark3;
	}
	void calculateTotal()
	{
		totalMarks = mark1+mark2+mark3;
		
	}
	void displayStudDetails()
	{
		System.out.println("Roll Number: "+rollNum);
		System.out.println("Student Name: "+studName);
		System.out.println("Total Marks: "+totalMarks);
		System.out.println("---------------------------");
	}
	
}
public class StudentDemo {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setStudDetails(4, "Tahir", 98, 99, 100);
		s1.calculateTotal();
		s1.displayStudDetails();
		
		Student s2 = new Student();
		s2.setStudDetails(3, "Amir", 96, 97, 98);
		s2.calculateTotal();
		s2.displayStudDetails();
		
		Student s3 = new Student();
		s3.setStudDetails(5, "Sarwar", 94, 95, 96);
		s3.calculateTotal();
		s3.displayStudDetails();
	}

}
