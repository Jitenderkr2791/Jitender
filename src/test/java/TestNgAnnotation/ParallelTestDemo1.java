package TestNgAnnotation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
public class ParallelTestDemo1 
{
	@Test
	public void VerifyTitle()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		Assert.assertEquals(driver.getTitle(),"Swag Labs");
		driver.quit();
		
	}
	
	@Test
	public void Verifylogo()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		WebElement logo = driver.findElement(By.xpath("//div[@class='login_logo']"));
		Assert.assertTrue(logo.isDisplayed(), "Logo is displayed");
		driver.quit();
		
	}
	
	@Test
	public void VerifyLoginButton()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		WebElement loginButton = driver.findElement(By.name("login-button"));
		Assert.assertTrue(loginButton.isDisplayed(), "Login Button is displayed");
		driver.quit();
		
	}
}



