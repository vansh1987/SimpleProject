package interface_concept;

public class Interface_5b_childclass implements Interface_5,Interface_5a
{
 public int Method_1()
 {
	 int sum = 1;
	 return sum;
 }
 
 public void Method_2()
 {
	 System.out.println("Method 2");
 }
	public static void main(String[] args) 
	{
		Interface_5 i = new Interface_5b_childclass();
		i.Method_1();

		
		Interface_5a ii = new Interface_5b_childclass();
		ii.Method_2();

	}

}
