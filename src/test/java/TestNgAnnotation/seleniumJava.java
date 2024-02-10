package TestNgAnnotation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
public class seleniumJava 
{
	@Test
	@Parameters({"keyword"})
	public void googlesearch(String search) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		 
		WebElement Searchbox = driver.findElement(By.name("q"));
		Searchbox.sendKeys(search);
		
		Assert.assertEquals(search,Searchbox.getAttribute("value"));
		driver.quit();
	}
}
