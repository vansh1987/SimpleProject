package abstraction_concepts;

public abstract class CompleteAbstractionConcept 	
//class become abstract if it contains abstract method.
{

	public CompleteAbstractionConcept() // Abstract class constructor
	{
		super();
		System.out.println("Constructor of abstract class");
	}
	
	public abstract void show();		// Abstract Method
	public abstract void drink();		// Abstract Method
	
	public void eat()		// Abstract class can have normal method.
	{
		System.out.println("Eating in abstract class");
	}

	public void walk()		// Abstract class can have normal method.
	{
		System.out.println("Walking in abstract class");
	}
	
	// Abstract class can also have zero abstract method.
}
