package abstraction_concepts;

public abstract class Abstract_2 
{
	abstract public void eat();				// public modifier
	abstract void drink();					// default modifier
	//private abstract void drink();		// Abstract method cannot be private because its execution is handled from 											 											   outside the class
	
	public String speak()					// normal method in abstract class
	{
		return "I m Speaking";
	}
}
