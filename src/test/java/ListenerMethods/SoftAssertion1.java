 package ListenerMethods;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;
public class SoftAssertion1 
{	
	@Test
	public void assertion()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		SoftAssert softVerify = new SoftAssert();
		
		System.out.println("verify the webPage title");
		String ExpectedTitle = "Automation Testing Practice1";
		String Actualtitle = driver.getTitle();
		softVerify.assertEquals(Actualtitle,ExpectedTitle);
		
		System.out.println("Verify the wikipedia logo");
		WebElement icon = driver.findElement(By.className("wikipedia-icon"));
		softVerify.assertTrue(icon.isDisplayed());
		
		System.out.println("Verify the Search icon");
		WebElement searchicon = driver.findElement(By.className("wikipedia-search-button"));
		softVerify.assertTrue(searchicon.isDisplayed());
			
		}
}