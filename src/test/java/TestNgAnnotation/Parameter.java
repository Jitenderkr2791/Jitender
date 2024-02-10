package TestNgAnnotation;
import org.testng.annotations.*;
public class Parameter
	{
		@Test(description = "addition")
	    @Parameters({"i","j"})
	    public void Addition(int a, int b)
	    {
	        System.out.println(a+b);
	    }
		
	    @Test(description = "Subtraction")
	    @Parameters({"x" ,"y"})
	    public void Subtraction(int c, int d)
	    {
	        System.out.println(c-d);
	    }
	    
	    @Test(description = "Multiplication")
	    @Parameters({"r","s"})
	    public void Multiplication(int e, int f)
	    {
	        System.out.println(e*f);
	    }
}