package abstraction_concepts;

public class Child_Main2 extends Child_Main1 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Child_Main2 c = new Child_Main2();
		c.eat();
		c.show();
		c.drink();
	}

	@Override
	public void drink() 
	{
		// TODO Auto-generated method stub
		System.out.println("Drink in Child-Main2 class");
	}
	
	public void walk()
	{
		System.out.println("Overriding method walk in  child-main2 class");
	}

}

