/*  Write Java program to allow the user to input his/her age.
 *  Then the program will show if the person is eligible to vote.
 *  A person who is eligible to vote must be older than or equal to 18 years old.

	Enter your age: 18

	You are eligible to vote.
*/
package exercises;

import java.util.Scanner;

public class Exercise6 
{
	int age;
	public static void main(String[] args) 
	{
		Exercise6 k = new Exercise6();
		k.checkeligiblity();
	}
	
	public void checkeligiblity()
	{
		System.out.print("Enter your age = ");
		Scanner sc = new Scanner(System.in);
	     age = sc.nextInt();
	     sc.close();
	     
	     if(age >=18)
	    	 System.out.println("You are eligible to vote");
	     else
	    	 System.out.println("You are not eligible to vote");
	}

}
