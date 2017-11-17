package this_concept;

public class This_2 
{
	String name;
	int age;
	
	public This_2(String name, int age) 
	{
		super();
		this.name = name;
		this.age = age;
	}

	public static void main(String[] args) 
	{
		This_2 t = new This_2("Rohit", 25);
		t.display();
	}

	private void display() 
	{
	System.out.println("Simple display method");
	System.out.println(name);
	System.out.println(age);	
	}
	
}
