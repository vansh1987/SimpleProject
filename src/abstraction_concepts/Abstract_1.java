package abstraction_concepts;

//import java.io.Serializable;

public abstract class Abstract_1 
{
	public Abstract_1 a(String id)
	{
		if(id == null)
		{
			System.out.println("Null Value");
		}
		return new Byid(id);
	}

public int aa(String aa)
{
	return 0;
}

/*
public List<WebElement> findElements(SearchContext context)
{
  if ((context instanceof FindsById)) {
    return ((FindsById)context).findElementsById(this.id);
  }
  return ((FindsByXPath)context).findElementsByXPath(".//*[@id = '" + this.id + "']");
}
*/
/*
public WebElement findElement(SearchContext context)
{
  if ((context instanceof FindsById)) {
    return ((FindsById)context).findElementById(this.id);
  }
  return ((FindsByXPath)context).findElementByXPath(".//*[@id = '" + this.id + "']");
}

public String toString()
{
  return "By.id: " + this.id;
}
*/
}