package variable;

public class Variables1 
{
	static String str_variable  = "Static value";
	// Reference variable of string type with static modifier.
	
	static int i;
	// Variable i of integer type with static modifier.
	
	char c;
	// Instance variable with character type.
	
	
	public static void main(String[] args) 
	{
		System.out.println(str_variable);
		System.out.println(new Variables1().c);
		//System.out.println(this.c);
	}
}
