package TestNgAnnotation;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Parameter5 
{ 	
	@Test
	@Parameters({"searchword"})
	public void searchdata( String searchword) throws Throwable 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		WebElement searchplaceholder=driver.findElement(By.name("q"));
		searchplaceholder.sendKeys(searchword);
		
		Assert.assertEquals(searchword,searchplaceholder.getAttribute("value"));
		 Robot rb = new Robot();
		 rb.keyPress(KeyEvent.VK_ENTER);
		 rb.keyRelease(KeyEvent.VK_ENTER);	
		 Thread.sleep(3000);
		 driver.close();
	}
}
