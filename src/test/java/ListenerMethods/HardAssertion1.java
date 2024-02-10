package ListenerMethods;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
public class HardAssertion1 
{	
	@Test
	public void assertion()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		System.out.println("verify the webPage title");
		String ExpectedTitle = "Automation Testing Practice";
		String Actualtitle = driver.getTitle();
		Assert.assertEquals(Actualtitle,ExpectedTitle);
		
		System.out.println("Verify the wikipedia logo");
		WebElement icon = driver.findElement(By.className("wikipedia-icon"));
		Assert.assertTrue(icon.isDisplayed());
		
		System.out.println("Verify the Search icon");
		WebElement searchicon = driver.findElement(By.className("wikipedia-search-button"));
		Assert.assertTrue(searchicon.isDisplayed());
		
		driver.close();
	}
}
