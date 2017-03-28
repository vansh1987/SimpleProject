package exception_concept;

public class Try_catch_1 {

	public static void main(String[] args) 
	{
		try
		{
			int number = 0;
			number = number/10;
			System.out.println(number);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
