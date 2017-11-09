package loops.if_else_loops;

public class If_1
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

	}
	
	public int show(int paramInt1, int paramInt2)
	  {
	    if (paramInt1 < 0) {
	      throw new StringIndexOutOfBoundsException(paramInt1);
	    }
	    if (paramInt2 <= 0)
	    {
	      if (paramInt2 < 0) 
	      {
	        throw new StringIndexOutOfBoundsException(paramInt2);
	      }
	      /*if (paramInt1 <= paramArrayOfInt.length)
	      {
	        this.value = "".value;
	        return;
	      }*/
	    }
		return paramInt2;
	  }
}
