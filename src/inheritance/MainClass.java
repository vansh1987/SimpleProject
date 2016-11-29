package inheritance;

public class MainClass {		// It is the main class

	public static void main(String[] args) 
	{
	Rectangle r = new Rectangle();		// Creating object of rectangle class
	Triangle t = new Triangle();		// Creating object of triangle class
	
	r.set_values(5, 5);			//passing value to set_value method via rectangle 
	t.set_values(3, 3);
	
	System.out.println("Area of rectangle = " + r.rectangle_area());
	System.out.println("Area of triangle = " + t.triangle_area());
	}

}
