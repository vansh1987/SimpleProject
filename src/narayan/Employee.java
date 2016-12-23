/*
If emp. Location is Punjab he/she got 10% bonus
If emp. Gender is male and age is greater than 50 he will get 15% bonus
If emp. Salary is greater than 1 lakh he/she will pay 50% tax from his salary
1)	Calculate total income for 1 year
2)	Calculate tax for 1 year
3)	Calculate bonus for 1 year
*/

package narayan;

import java.util.Scanner;

/**
 * @author Demo
 *
 */
public class Employee 
{
	//static int salary = 200000;
	static int age = 60;
	static char gender = 'm';
	static String location = "Punjab";
	
	public static void main(String s[])
	{ 
		Employee e = new Employee();
		Scanner a = new Scanner(System.in);
		System.out.print("Enter the Salary = ");
		int salary = a.nextInt();
		System.out.print("Enter the age = ");
		int age = a.nextInt();
		
		a.close();
		
		if(location == "Punjab")
		{
			int increment = e.increment_10(salary);
			System.out.println("You belongs to punjab so u got 10% increment = " + increment);
		}
		
		else
			System.out.println("You don't belongs to Punjab");
		
		/*
		if(gender == 'm'&& salary >= 20000 && location == "Punjab")
		{
			e.increment_15(salary);
		}
		else if(gender == 'f' && salary >= 20000 && location == "Punjab")
		{
			System.out.println("");
		}*/
		
		if(gender == 'm' && age > 50)
		{
			int sum = e.increment_15(salary);
			System.out.println("You are senior citizen so got 15% increment in salary,Total Salary = " + sum);
		}
		else
			System.out.println("You are not senior citizen");
		
		if(salary >= 100000)
		{
			int value = e.tax(salary);
			System.out.println("50% salary is deducted from your salary, Your salary = " + value);
		}
		else
			System.out.println("No salary deduction");
	
		e.Totalsalary(salary);
	}
	public void Totalsalary(int salary)
	{
		int s = salary*12;
		System.out.println("Total Salary of Year = " + s);
	}
	public int tax(int salary)
		{ 
		return  salary - (salary*50/100);
		}
	
	public int increment_15(int salary)
	{
		int i = salary*15/100;
		int sum = salary + i;
		return sum;
	}
	
	public int increment_10(int salary)
	{
		int i = salary*10/100;
		int sum = salary + i;
		return sum;
	}
	
	
}
