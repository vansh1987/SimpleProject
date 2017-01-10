package interface_concept;

public class Interface_2a_childclass implements Interface_2
/*
A child class has to implements(not override) all the methods of an interface.
(word "implements" is used rather than override because child class is just implementing
the standards define by interface, not extending its functionality.
*/
{
	public void eat()
	{
		System.out.println("eat");
	}
	
	public void walk()
	{
		System.out.println("walk");
	}
	
	public static void main(String[] args) 
	{
		new Interface_2a_childclass(). eat();
		new Interface_2a_childclass().walk();

	}

}
