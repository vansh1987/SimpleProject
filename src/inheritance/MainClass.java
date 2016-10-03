package inheritance;

public class MainClass {

	public static void main(String[] args) 
	{
	Rectangle r = new Rectangle();
	Triangle t = new Triangle();
	
	r.set_values(5, 5);
	t.set_values(3, 3);
	
	System.out.println("Area of rectangle = " + r.rectangle_area());
	System.out.println("Area of triangle = " + t.triangle_area());
	}

}
