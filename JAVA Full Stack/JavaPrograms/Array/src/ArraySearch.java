import java.util.Scanner;
public class ArraySearch {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] arr = new int[5];
		System.out.println("Enter 5 values");
		for(int i=0;i<arr.length;i++)
			arr[i] = s.nextInt();
		
		System.out.println("Enter value to search: ");
		int key = s.nextInt();
		
		boolean isFound = false;
		for(int i=0; i<arr.length; i++)
		{
			if(key == arr[i])
			{
				isFound = true;
				break;
			}
		}
		if(isFound)
			System.out.println(key+" is found");
		else
			System.out.println(key+" is not found");
		
		
		s.close();
	}

}
