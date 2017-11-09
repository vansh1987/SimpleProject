package inheritance;

// Using the Inheritance concept with user defined classes.

public class Inheritance_2 
{
	Maths m;		// Reference Variable or Lazy object creation approach.
	Rectangle r;	// Reference Variable or Lazy object creation approach.
	Polygon p;		// Reference Variable or Lazy object creation approach.
	
	{
		System.out.println("Run before the object creation");
	}
		
	public Inheritance_2() 		// Default Constructor
	{
		this(new Polygon(),new Maths(), new Rectangle());		
		// Calling the parameterized constructor via this() from default constructor and achieving constructor chaining approach
		
		System.out.println("Inside Default Constructor");
	}

	public Inheritance_2(Polygon p, Maths m, Rectangle r)		// Parameterized Constructor
	{
		this.p = p;		// Passing reference to the instance variable.
		this.m = m;		// Passing reference to the instance variable.
		this.r = r;		// Passing reference to the instance variable.
		System.out.println("Inside the Parameterized Constructor");
	}

	public void show() 	// Calling the function of different classes in show().
	{
		System.out.println("Inside the show function");
		System.out.println(m.add(10, 20));
		System.out.println(m.subt(10, 30));
	}
	
	public static void main(String[] args) 
	{
		new Inheritance_2().show();		// Nameless or anonymous object creation approach.
	}
}
