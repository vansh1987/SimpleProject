/*
If emp. Location is Punjab he/she got 10% bonus
If emp. Gender is male and age is greater than 50 he/she will get 15% bonus
If emp. Salary is greater than 1 lakh he/she will pay 50% tax from his salary
1)	Calculate total income for 1 year
2)	Calculate tax for 1 year
3)	Calculate bonus for 1 year
*/


package narayan;

public class Employee 
{
	static int salary = 20000;
	int age;
	static char gender = 'm';
	static String location = "Punjab";
	
	public static void main(String s[])
	{
		Employee e = new Employee();
		if(gender == 'm'&& salary >= 20000 && location == "Punjab")
		{
			e.increment_15(salary);
		}
		else if(gender == 'f' && salary >= 20000 && location == "Punjab")
		{
			System.out.println("");
		}
		else if (gender == 'm' && salary < 20000)
			System.out.println("Salary is not greater than 20000");
	}
	
	/*public void increment()
	{
		
	}*/
	
	public void increment_15(int salary)
	{
		int i = salary*15/100;
		int sum = salary + i;
		System.out.print("You got 15% increment in salary,Total Salary = " + sum);
	}
	
	public void increment_10(int salary)
	{
		int i = salary*10/100;
		int sum = salary + i;
		System.out.print("You got 15% increment in salary,Total Salary = " + sum);
	}
	
	
}
