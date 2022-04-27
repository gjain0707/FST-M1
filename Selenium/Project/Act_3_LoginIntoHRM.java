import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Act_3_LoginIntoHRM 
{
   WebDriver driver;
   String First_name;
   String Last_name;
   String ExpectedName;
   String actual_dashboard_url = "http://alchemy.hguy.co:8080/orangehrm/symfony/web/index.php/dashboard";
   
   
	@Test
	public void LoginIntoApplication() throws InterruptedException
	{
		driver= new FirefoxDriver();
		driver.get("http://alchemy.hguy.co/orangehrm");
		driver.findElement(By.id("txtUsername")).sendKeys("orange");
		Thread.sleep(2000);
		driver.findElement(By.id("txtPassword")).sendKeys("orangepassword123");
		Thread.sleep(2000);
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(3000);
		String expected_dashboard_url= driver.getCurrentUrl();
		Assert.assertEquals(actual_dashboard_url,expected_dashboard_url);
		System.out.println("Successfully logged into the Application and Land on Dashboard");
	}

	
	

	
}
