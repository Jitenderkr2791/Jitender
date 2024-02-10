package TestNgAnnotation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
public class ParallelTestDemo2 
{
	@Test
	public void VerifyUsername()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		WebElement Username = driver.findElement(By.name("user-name"));
		Username.sendKeys("standard_user");
		Assert.assertEquals("standard_user",Username.getAttribute("value"));
		driver.quit();
		
	}
	
	@Test
	public void VerifyPassword()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		WebElement Password = driver.findElement(By.name("password"));
		Password.sendKeys("secret_sauce");
		Assert.assertEquals("secret_sauce",Password.getAttribute("value"));
		driver.quit();
	}
	
	@Test
	public void VerifyLoginButton()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		WebElement loginButton = driver.findElement(By.name("login-button"));
		Assert.assertTrue(loginButton.isEnabled(), "Login Button is displayed");
		driver.quit();
		
	}
}



