package methodOveridding;

public class MethodOveriddingMain extends MethodOveridding1
{
	public void name()
	{
		System.out.println("Name in Main class");
	}
	
	public static void main(String[] args) 
	{
		/*MethodOveriddingMain m = new MethodOveriddingMain();
		m.name();*/
	
		MethodOveridding1 m = new MethodOveriddingMain();
		m.name();
		m.age();

	}

}
