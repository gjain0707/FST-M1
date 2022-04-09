package ProjectActivities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Activity1 {
  private static final String OrangeHRM = null;

@Test
  public void validateTitle() {
	
	String eT = "OrangeHRM";
	  WebDriver driver = new FirefoxDriver();
	  
	  driver.get("http://alchemy.hguy.co/orangehrm");
	  String t  = driver.getTitle();
	  
Assert.assertTrue(eT.contentEquals(t));
System.out.println("matching");
driver.close();
	  
  }
}
