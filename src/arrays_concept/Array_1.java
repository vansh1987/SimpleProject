package arrays_concept;

public class Array_1 
{
	public static void arrayDeclaraction()
	{
//		Different type of array declaration
		
		String $name[];		// Array Declaration type 1.
		String[] $names;		// Array Declaration type 2.
		String []$namess;	// Array Declaration type 3.
		
//		Different Approaches
		
		int a[] = {1,2,3};		// Approach 1: Declaring, instantiation and initialization in single line.
		
		int b[] = new int[3];	// Approach 2: Declaring,instantiation
		
		b[0] = 5;				// Initialization.
		b[1] = 6;
		b[2] = 7;
		
		for (int i = 0; i < b.length; i++) 
		{
			System.out.println(a[i]);
			System.out.println(b[i]);
		}	
	}
	
	public static void main(String[] args) 
	{
		Array_1 ar = new Array_1();
		ar.arrayDeclaraction();
	}
}	
