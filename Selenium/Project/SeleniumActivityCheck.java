import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SeleniumActivityCheck 
{

	WebDriver driver;
	WebElement element ;
	String actualTitleName="OrangeHRM";
	WebDriverWait wait = new WebDriverWait(driver,20);
	
	@Test
	public void login() throws InterruptedException
	{
	
	driver= new FirefoxDriver();
	driver.get("http://alchemy.hguy.co/orangehrm");
	String titleName=driver.getTitle();
	System.out.println(titleName);
	Assert.assertEquals(actualTitleName, titleName);
	
	driver.findElement(By.id("txtUsername")).sendKeys("​orange");
	Thread.sleep(1000);
	driver.findElement(By.id("txtPassword")).sendKeys("orangepassword123");
	Thread.sleep(1000);
	driver.findElement(By.id("btnLogin")).click();
	Thread.sleep(2000);
	
	
	
	}
	
}
