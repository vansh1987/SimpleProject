package inheritance;

public class Maths 
{

	public int add(int number_1, int number_2)
	{
		return number_1 + number_2;
	}
	
	public float subt(int number_1, int number_2)
	{
		if(number_2> number_1)
		{
			System.out.println("Please enter valid number");
			return 0;
		}
		else
		{
		return number_1 - number_2;
		}
	}
	
	public float mult(int number_1, int number_2)
	{
	return number_1 * number_2;	
	}
}
