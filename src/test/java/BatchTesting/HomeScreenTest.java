package BatchTesting;
import org.testng.annotations.Test;

public class HomeScreenTest
{		 @Test(invocationCount = 7)
		 public void launchApplication() 
		 {
			 System.out.println("launch the Application");
		 }

		 @Test(invocationCount = 7)
		 public void VerifyTitle() 
		 {
			 System.out.println(" Verify the Title");
		 }
		 
		 @Test(invocationCount = 7)
		 public void Verifylogo() 
		 {
			 System.out.println("Verify the Logo");
		 }
}