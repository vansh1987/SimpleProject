package final_concept;

public class Final_2 
{
	
	final static String name = "final variable 2";
	//Static data member must be initialize before making final because after that value cannot be changed.
	
	//final String names;
	// Non-static data member is made blank final and that must be initialize via constructor.
	
	/*public Final_2(String names) 
	{
		super();
		this.names = names;
	}*/

	public static final void finalmethod2()		
	//Static method can be final (it deals with function hiding not the override)
	{
		System.out.println("Final Method 2");
	}
	
	public final boolean finalmethod3()		
	// Non-Static method can be final now this method cannot be inherited by the child class
	{
		System.out.println("Final Method 3");
		return true;
	}
}
