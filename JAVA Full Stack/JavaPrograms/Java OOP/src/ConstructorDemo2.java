class Book
{
	int bookID;
	String bookName;
	Book(int bookID, String bookName)
	{
		this.bookID = bookID;
		this.bookName = bookName;
	}
	Book(){}	// default constructor
	void display()
	{
		System.out.println("Book ID : "+bookID);
		System.out.println("Book Name : "+bookName);
	}
}
public class ConstructorDemo2 {

	public static void main(String[] args) {
		Book b1 = new Book(101, "JAVABOOK");
		b1.display();
		Book b2 = new Book();
		b2.display();
	}

}
