package TestNgAnnotation;
import org.testng.annotations.Test;

public class Groups 
{
	@Test(groups = "Software company")
	public void infosys()
	{
		System.out.println("infosys");
	}
	
	@Test(groups = "Software company")
	public void Accenture()
	{
		System.out.println("Accenture");
	}
	
	@Test(groups = "automobile company")
	public void honda()
	{
		System.out.println("Honda");
	}
	
	@Test(groups = "automobile company")
	public void tata()
	{
		System.out.println("Tata");
	}
	
	@Test(groups = "automobile company")
	public void Maruti()
	{
		System.out.println("Maruti");
	}
}
