package ListenerMethods;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

@Listeners(ListenerClass.class)                  //its optional if not using testNG.xml to run
public class Listenerdemo 
{	@Test
	public void login() 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		
		WebElement Username= driver.findElement(By.xpath("//input[@placeholder='Username']"));
		Username.sendKeys("Admin");
		
		WebElement Password= driver.findElement(By.xpath("//input[@placeholder='Password']"));
		Password.sendKeys("admin123");
		
		WebElement Loginbutton = driver.findElement(By.tagName("button"));
		Loginbutton.click();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertEquals(driver.getTitle(),"OrangeHRM");	
		
		driver.close();
	}
	@Test
	public void testfail()
	{
		System.out.println("Failed Test Case ");
		Assert.assertTrue(false);
	}
	
	@Test
	public void testskipped()
	{
		System.out.println("Skipped Test Case");
		throw new SkipException("Skip exception throw");
	}
	
}
