package constructor;

public class ParaConstructor 
{

	public static void main(String[] args) 
	{
		ParaConstructor p = new ParaConstructor("Parameterized Constructor", 10);
		//OR
		new ParaConstructor("Hello", 10);
	}

	public ParaConstructor(String str, int i) 
	{
		// Parameterized constructor is nothing but the constructor is able to parameters.
		
		System.out.println("Inside the Para Constructor with values = " + str +" "+ i);
		
	}

}
