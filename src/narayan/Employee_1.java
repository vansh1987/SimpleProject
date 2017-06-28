/*
If emp. Location is Punjab he/she got 10% bonus
If emp. Gender is male and age is greater than 50 he will get 15% bonus
If emp. Salary is greater than 1 lakh he/she will pay 50% tax from his salary
1)	Calculate total income for 1 year
2)	Calculate tax for 1 year
3)	Calculate bonus for 1 year
*/

package narayan;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Demo
 *
 */
public class Employee_1
{
	//static int salary = 200000;
	static int age = 60;
	static char gender = 'm';
	static String location = "Punjab";
	
	
	public static void main(String s[])
		{
		int salary = 0;
		int age;
				
		//Employee_1 e = new Employee_1();
		Scanner a = new Scanner(System.in);
		a.close();
		try
		{
		salary = a.nextInt();
		System.out.println("Enter the salary = " + salary);
		}		
		catch(Exception E)
		{
		System.out.println("Enter integer value only");	
		}
		
		try
		{
			age = a.nextInt();
			System.out.println("Enter the age = " + age);
		}
		catch(InputMismatchException E)
		{
			System.out.println("Enter integer value only");
		}
		if (salary >= 10000)
		{
			System.out.println("Your salary is  = " + salary);
		}
		
		}
	public void Totalsalary(int salary)
	{
		int s = salary*12;
		System.out.println("Total Salary of Year = " + s);
	}
	public int tax(int salary)
	{ 
		int i = salary*50/100;
		int value = salary - i;
		return value;
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
