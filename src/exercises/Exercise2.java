/*Write a Java program to declare two integer variables, 
 * one float variable, and one string variable and 
 * assign 10, 12.5, and "Java programming" to them respectively.
 * Then display their values on the screen.
*/
package exercises;

public class Exercise2 
{

	public static void main(String[] args) 
	{
	show();
	}
	
	public static void show()
	{
		int a = 15,b = 10;
		float f = 12.5f;
		String s = "Java Programming";
		
		System.out.println("First integer value = " + a);
		System.out.println("Second integer value = " + b);
		System.out.println("Floadt value = " + f);
		System.out.println("String value = " + s);
	}

}
