package this_concept;

import java.util.Scanner;

// program is regarding the while validation check.

public class This_1 {

	public static void main(String[] args) 
	{
	System.out.print("Enter the number = ");
	Scanner sc = new Scanner(System.in);
	int input = sc.nextInt();
	/*
	do
	{
		System.out.println("Numeric value only");
	}
	while(sc.hasNextInt());
	
	sc.close();
	*/
	
	//System.out.println(input);
	
	/*
	   while (sc.hasNextInt())
       {
           // Read an int value
           int num = sc.nextInt();
          System.out.println("Checked" + num);
       }
	*/
	if (input == (int)input)
	{
	   // Number is integer
		int sum = input + 100;
		System.out.println("Enter if block");
		System.out.println(sum);
		
	}
	else
	{
		System.out.println("U have enter wrong value");
	}
	
	}

}
