package staticblockconcept;

public class Static_block 

/*
 * Static Block:
	1. Static blocks are used to write functionality of project that functionality is executed during .class file loading time.
	2. In java .class file is loaded only one time hence static blocks are executed once per class.
*/
{
	static
	{
		System.out.println("static block-1");
	} //static block

	static
	{
		System.out.println("static block-2");
	} //static block

	{
		System.out.println("instance block-1");
	} //instance block

	{
		System.out.println("instance block-2");
	} //instance block
	
	Static_block()
	{ 
		System.out.println("0-arg constructor");
	} //0-arg constructor

	Static_block(int a)
	{
		System.out.println("1-arg constructor");
	}//1-arg constructor
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Static_block s = new Static_block();
		Static_block s1 = new Static_block(10);
	}
}