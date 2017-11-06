package misc;

//import final_concept.Final_1;
import final_concept.Final_2;

public class Misc_1 
{
	public void method_misc_1(Object obj)
	{
		//passing the object class variable.
		
		System.out.println(obj.toString());
	}
	
	public void method_misc_2(Final_2 fi)
	{
		System.out.println(fi.finalmethod3());
		//in this case fi.finalmethod3() first print the value and after that it will print the return value.
	}
	
	/*public void method_misc_1()
	{
		System.out.print(Final_1.finalmethod());
	}*/
	
	public static void main(String[] args) 
	{
		Misc_1 m = new Misc_1();
		m.method_misc_1(m);
	//	m.method_misc_2(new Final_2("Hello"));
		m.method_misc_2(new Final_2());
	}

}
