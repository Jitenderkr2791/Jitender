package TestNgAnnotation;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameters2
{   @Test(description = "addition")
    @Parameters({"i","j"})
    public void Addition(int a, int b)
    {
        System.out.println(a+b);
    }

    @Test(description = "Subtraction")
    @Parameters({"i" ,"j"})
    public void Subtraction(int c, int d)
    {
        System.out.println(c-d);
    }

    @Test(description = "Multiplication")
    @Parameters({"i","j"})
    public void Multiplication(int e, int f)
    {
        System.out.println(e*f);
    }

}
