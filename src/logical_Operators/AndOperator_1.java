package logical_Operators;

public class AndOperator_1 
{
	public static void main(String[] args) 
	{
		int num1 = 10;
		int num2 = 20;
		/*Let's say you wanted your program to output "You Win!" 
		 * when num1 is equal to 10 and num2 is equal to 20.
		
		if(num1 == 10)
		{
		if(num2 == 20)
		{
		System.out.println("You win");
		*/

		// Or you can use AND Operator &&
		
		if(num1 ==10 && num2 == 20)
		{
			System.out.println("You win");
		}
		else
			System.out.println("You Lose");
	}

}