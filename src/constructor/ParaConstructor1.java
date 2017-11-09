package constructor;

public class ParaConstructor1 
{

	public ParaConstructor1()
	{
		this("Calling from Default Constructor of Parameterized Constructor");
	}
	
	public ParaConstructor1(String str)
	{
		System.out.println(str);
	}
	public static void main(String[] args)
	{
		new ParaConstructor1();

	}

}
