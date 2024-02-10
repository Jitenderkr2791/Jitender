package TestNgAnnotation;
import org.testng.annotations.Test;
public class Priority 
{
	@Test(description = "this is test 1", priority = 4)
	public void test1()
	{
			System.out.println("Test 1");
	}
	
	@Test(description = "this is test 2", priority = 3)
	public void test2()
	{
		System.out.println("Test 2");
	}
	
	@Test(description = "this is test 3")
	public void test3()
	{
		System.out.println("Test 3");
	}
	
	@Test(description = "this is test 4")
	public void test4()
	{
		System.out.println("Test 4");
	}
}
