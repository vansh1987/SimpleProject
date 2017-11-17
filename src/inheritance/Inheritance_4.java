package inheritance;

public class Inheritance_4 extends Inheritance_1 
{
	public int eat(int a)
	{
		return 0;
	}
	
	public void eat()
	{
		System.out.println("Show in inheritance class 4");
	}

	public static void main(String[] args) 
	{
		Inheritance_1 i = new Inheritance_4();
		i.eat();
		i.walk();
	
		Inheritance_4 ii = (Inheritance_4)i;			// Type Casting.
		ii.eat();
		
		/*Inheritance_2 iii = new Inheritance_2();
		iii.show();*/
	}

}
