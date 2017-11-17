package inheritance;

public class Inheritance_1 extends Maths 
{

	public static void main(String[] args) 
	{
	/*Maths m = new Maths();
	int sum = m.add(5, 10);
	System.out.println("The sum of the two numbers = " + sum);
	
	float sub = m.subt(10, 7);
	System.out.println("The subtraction of the value = " + sub);
	*/
	
	/*
		System.out.println(new Maths().add(10, 5));
	*/
		
		Inheritance_1 i = new Inheritance_1();
		int sum = i.add(10, 9);
		System.out.println(sum);
	}
	
	public void eat()
	{
		System.out.println("Eating");
	}

	public void walk()
	{
		System.out.println("Walking");
	}

}
