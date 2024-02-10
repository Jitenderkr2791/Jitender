package TestNgAnnotation;
import org.testng.annotations.*;
	public class Annotation2
	{	
		@Test
		public void test3()
		{
			System.out.println("test3");
		}
		@Test
		public void test4()
		{
			System.out.println("test4");
		}

		
		@BeforeMethod
		public void BeforeMethod()
		{
			System.out.println("BeforeMethod");
		}
		@AfterMethod
		public void AfterMethod()
		{
			System.out.println("AfterMethod");
		}
		
		
		@BeforeClass
		public void Beforeclass()
		{
			System.out.println("Beforeclass");
		}
		@AfterClass
		public void afterclass()
		{
			System.out.println("Afterclass");
		}
		
		@BeforeSuite
		public void BeforeSuit()
		{
			System.out.println("Beforesuit");
		}
		@AfterSuite
		public void Aftersuit()
		{
			System.out.println("AfterSuit");
		}
	}


