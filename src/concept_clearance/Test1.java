package concept_clearance;

public class Test1 
{
	Person m1()						// Java class is able to return user defined class as a return value.
	{
		System.out.println("m1 from person");
		return new Person();		// Returning the object of the class
	}
	
	Emp m2()						//  Java class is able to return user defined class as a return value.
	{
		System.out.println("m2 from Emp");
		return new Emp();			// Returning the object of the class
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Test1 t = new Test1();
		
		Person i = t.m1();			// Putting reference of one object to another.
		i.eat();

		Emp e = t.m2();				// Putting reference of one object to another.
		e.eat();
	}
}
