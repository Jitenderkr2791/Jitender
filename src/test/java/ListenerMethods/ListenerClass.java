package ListenerMethods;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerClass implements ITestListener
{		
	public void onTestStart(ITestResult Result)
	{
		System.out.println("Name of Test Method Started: " + Result.getName());
	}
	
	public void onTestSucess(ITestResult Result)
	{
		System.out.println("Name of Test Method Success: " + Result.getName());
	}
	
	public void onTestFailure(ITestResult Result)
	{
		System.out.println("Name of Test Method failed: " + Result.getName());
	}
	
	public void onTestSkipped(ITestResult Result)
	{
		System.out.println("Name of Test Method Skipped: " + Result.getName());
	}
	
	public void onStart(ITestContext Result)
	{
		System.out.println("on start Method invoked.....");
	}
	
	public void onFinish(ITestContext Result) 
	{
		System.out.println("on Finished Method invoked.....");
	}
	
	public void onTestFailedButWithinSuccessPercentage(ITestResult Result)
	{
		
	}	
}
