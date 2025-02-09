## Arrays

*An array is a collection of elements of similar data types and stored in continuous memory locations.*  

##### Declaration
*Syntax:*

```
	datatype[] arrayname;
				or
	datatype arrayname[];
				or
	datatype []arrayname;
	
	[]datatype arrayname; //error
```
```
Ex: 
	int[] n;
	String empNames[];
	double []empSalaries;
	
	int n[5]; //error - In Java arrays are reference data type
```
###### Note - Memory allocation for reference data type is done during runtime using new operator

#### Memory Allocation
---

	int[ ] n = new int[5];

	*Refer diagram Arrays.png*
---

![Array]("Arrays.png")

---  
##### ➡️WAP to create an int array of given size and display the elements of the array.
 
	*Refer program ArrayCreate.java*  
	
	
##### ➡️WAP to find sum of given array elements.

	*Refer Program ArraySum.java*
	
	
###### Note - In Java if we try to access an array element which is out of index then it will throw an exception (runtime error)  

##### ➡️WAP to search an element from the given array 
	
	*Refer program ArraySearch.java
	
###### Note -
```
 int n[5]; //error
 int[] n = new int[]; //error
```

##### Assignment - Arrays

➡️WAP to find biggest, second biggest, smallest and second smallest from the given array.  
int [ ] = {5, 8, 6, 7, 4};

```
output-
Big - 8
Second big = 7
Small = 4
Second small = 5
```


















