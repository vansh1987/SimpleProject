package polymorphism;

public class Polymorphism_2 
{

	public static void main(String[] args) 
	{
		Polymorphism_2 p = new Polymorphism_2();
		p.walk(10l,15);
		//System.out.println(p.walk(24,15l));
		

	}
	
	public void walk(int i, long l)
	{
		System.out.println("First Integer and then long"+" "+i+" "+l);
	}
	
	public void walk(long l, int i)
	{
		System.out.println("First Long and then integer "+" "+l+" "+i);
	}

}
