package TestNgAnnotation;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
public class DataProviders
{
	@Test(dataProvider = "Searchdataset")
	public void Testcasegooglesearch(String Country, String Monument) throws Throwable 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		 
		WebElement Searchbox = driver.findElement(By.name("q"));
		Searchbox.sendKeys(Country + " " + Monument);
		
		Assert.assertEquals(Country + " " +Monument,Searchbox.getAttribute("value"));
		
		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		driver.quit();
	}
	
	
				@DataProvider(name= "Searchdataset")
				public Object[][] searchdata() 
				{
					Object[][] searchkeyword = new Object[3][2];
					searchkeyword[0][0] = "India";
					searchkeyword[0][1] = "Qutub Minar";
					
					searchkeyword[1][0] = "Agra";
					searchkeyword[1][1] = "Taj-mahal";
					
					searchkeyword[2][0] = "Hyderabad";
					searchkeyword[2][1] = "Charminar";
					
					return searchkeyword;
				}
}
