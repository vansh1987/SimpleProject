package inheritance;

//Using the Inheritance Concept via predefined classes.

public class Inheritance_3 
{
	String str;		// Reference variable of String type.
	System s;		// Reference variable of Integer type.
	Math m;			// Reference variable of Math Type.
	
	{
		System.out.println("Run before the object creation");
	}
	
	public Inheritance_3() 
	{
		this("Deepanshu");
	}

	public Inheritance_3(String str) 
	{
		super();
		this.str = str;
	}

	public Inheritance_3(String str, System s, Math m) 
	{
		this.str = str;
		this.s = s;
		this.m = m;
	}
	public void show()
	{
		System.out.println("Length of the string = " + str.length());
		System.out.println(m.toString());
		System.out.println(str.isEmpty());
	}
	
	public static void main(String[] args) 
	{
		new Inheritance_3().show();
		
	}

}
