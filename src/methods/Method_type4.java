package methods;

public class Method_type4 
{
	public static void main(String[] args) 
	{
		int sum = add(4,5,6);
		// catching the returning value from method add
		System.out.println(sum);
		 // OR
		
		int result = sum + 10;
		// performing operation on sum.
		System.out.println(result);
		System.out.println("The result is " + result);
		
	}
	
	public static int add(int a,int b, int c)
	{
		return(a+b+c);
		//returning value from the function.
	}

}
