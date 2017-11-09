package concept_clearance;

public class Test 
{
	Abc a;
	Abc2 b;

	public void m5(Abc a, Abc2 b)
	{
		System.out.println("m5");
	}
	
	public void m6()
	{
		System.out.println("m6");
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Test t = new Test();
		Abc a = new Abc();
		Abc2 b = new Abc2();
		t.m5(a,b);
		
		
	}

}
