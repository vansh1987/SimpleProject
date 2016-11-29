/*In this program we initialize the number.
 * we have to find biggest number among that three number
 * */

package exercises;

public class Exercise3 
{
	public static void main(String ar[])
	{
		Exercise3 e = new Exercise3();
		e.big_number();
	}
	
	public void big_number()
	{
		int a = 40;
		int b = 20;
		int c = 30;
		 if(a > b && a>c)
		 {
			 System.out.println("A is biggest number");
		 }
			 else if (b>a && b>c)
		 {
			 System.out.println("B is biggest number");
		 }
			 else if(c>a && c>b)
		 {
			 System.out.println("C is biggest number");
		 }
		 else
			 System.out.println("Result is nuetral");
	}
	
}
