package exercises;

import inheritance.*;

public class Exercise4 extends Polygon
{
	public static void main(String... s)
	{
		//Exercise4 e = new Exercise4();
		//e.set_values(5,5);
		
		Triangle t = new Triangle();
		t.set_values(5,5);
		
		System.out.println("Triangle value is = " + t.triangle_area());
	}
}
