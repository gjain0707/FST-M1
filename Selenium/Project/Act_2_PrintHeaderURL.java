import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Act_2_PrintHeaderURL 
{
WebDriver driver;
WebElement element;

@Test
public void verifyHeaderURL()
{
	driver= new FirefoxDriver();
	driver.get("http://alchemy.hguy.co/orangehrm");
	WebElement url=driver.findElement(By.tagName("img"));
	String src = url.getAttribute("src");
	System.out.println("The URL of the Header Image is" + src);
	driver.close();
	
}
	
}
