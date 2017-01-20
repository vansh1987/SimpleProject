package polymorphism;

public class Polymorphism_1 
{

	public static void main(String[] args) 
	{
		Polymorphism_1 p = new Polymorphism_1();
		p.show();
		p.show("Deepanshu");

	}
	
	public void show()
	{
		System.out.println("Show without parameter");
	}
	
	public void show(int number1)
	{
		System.out.println("Show with integer parameter");
	}
	
	public void show(String name)
	{
		System.out.println("Show with string parameter");
	}
}
