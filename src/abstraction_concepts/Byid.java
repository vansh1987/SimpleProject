package abstraction_concepts;

import java.io.Serializable;

public class Byid extends Abstract_1 implements Serializable
	
{
	private static final long serialVersionUID = 5341968046120372169L;
	@SuppressWarnings("unused")
	private final String id;

	public Byid(String id)
	{
	  this.id = id;
	}

}
