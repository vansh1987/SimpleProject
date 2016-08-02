package methods;

public class Method_type3 
{
	public static void main(String[] args) 
	{
	sayHello();
	show("Parameterized method");
	add(2,5);
	show("Changes are going on");
	add(15,15);
	show("New Parameterized method");
	add(27,35);
	}
	
	public static void sayHello()
	{
		System.out.println("Say Hello");
	}
	
	public static void show(String name)
	{
		System.out.println("String name = " + name);
	}
	
	public static void add(int a, int b)
	{
		System.out.println("Addition value is = " + (a+b));
	}
}
