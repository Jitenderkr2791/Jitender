package TestNgAnnotation;
import org.testng.annotations.*;
public class Annotation 
{	
	@Test
	public void test1()
	{
		System.out.println("test1");
	}
	@Test
	public void test2()
	{
		System.out.println("test2");
	}
	
	@BeforeTest
	public void BeforeTest()
	{
		System.out.println("Beforetest");
	}
	@AfterTest
	public void AfterTest()
	{
		System.out.println("Aftertest");
	}
	
}
