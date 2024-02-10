package New;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Testng1Test 
{
  @Test
  public void verifyPageTitleTest()
  {
	  	 WebDriverManager.chromedriver().setup();
	     WebDriver driver = new ChromeDriver();
	     driver.get("https://www.google.com/");
	     String expectedTitle = "Google";
	     String actualtitle = driver.getTitle();
	     AssertJUnit.assertEquals(actualtitle, expectedTitle);
	     driver.close();
	     
	     //throw new RuntimeException("Test not implemented");
	 }
}
 
