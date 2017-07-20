package methods;

//Types of Methods in java

public class Type_Of_Methods 
{

	// RETURN TYPE DOES NOT PLAY ANY ROLE IN THE FUNCTION OVERLOADING, FUNCTION OVERLOADING ALWAYS ACHEIVED BY THE CHANGE IN THE ARGUMENTS ONLY. 

	public void Method1()
	{
		// NO RETURN TYPE OR RETURNING NO VALUE.
	}

	public int Method2()
	{
		return 1;	// RETURNING INTERGER VALUE ONLY.
	}

	public char Method3()
	{
		return 'c';	// RETURNING CHARACTER VALUE ONLY.
	}

	public String Method4()
	{
		return "Hello";	// RETURNING STRING VALUE ONLY.
	}
	
	public boolean Method5()
	{
		return true;	// RETURNING BOOLEAN VALUE ONLY.
	}
	
	public float Method6()
	{
		return 1.5f;	// RETURNING FLOAT VALUE ONLY.
	}
	
	public double Method7()
	{
		return 100000.0D;	// RETURNING DOUBLE VALUE ONLY.
	}
	
	public long Method8()
	{
		return 10214587549875423L;	// RETURNING LONG VALUE ONLY.
	}
	
	public int[] Method9()	// RETURNING ARRAY OF INTEGER. 
	{
		int names[] = {1,2};
		return names;
	}
	
	public String[] Method10()	// RETURNING ARRAY OF STRING.
	{
		String name[] = {"Hello","World"};
		return name;
	}
	
	public int Method11(int number_1, int number_2)	// METHOD WITH PARAMETER & RETURNING INTEGER 
	{
		return number_1 + number_2;
	}
}
