package TestNgAnnotation;
import org.testng.annotations.Test;
public class Timeout
{
		@Test(timeOut = 200) // it takes too much time to execute then expected therefore it failed this testcase.
		public void test1()
		{
			try{
				Thread.sleep(400);
				System.out.println("Test 1");
				}
			catch(InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
		
		@Test(description = "this is test 2")
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
