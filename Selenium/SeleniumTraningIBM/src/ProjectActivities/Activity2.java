package ProjectActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Activity2 {
  @Test
  public void getHeader() {
	
	  WebDriver driver = new FirefoxDriver();
	  
	  driver.get("http://alchemy.hguy.co/orangehrm");
	  driver.findElement(By.xpath("//*[@id='divLogin']/div/img"));
  }
}
