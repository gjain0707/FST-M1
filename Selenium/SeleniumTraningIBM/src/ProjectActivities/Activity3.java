package ProjectActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Activity3 {
  @Test
  public void login() {
	  
WebDriver driver = new FirefoxDriver();
	  String e = "Dashboard";
	  driver.get("http://alchemy.hguy.co/orangehrm");
	  driver.findElement(By.xpath("//div[@id='divUsername']/input")).sendKeys("orange");
	  driver.findElement(By.xpath("//div[@id='divPassword']/input")).sendKeys("orangepassword123");
	  driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
	 String page1 =  driver.findElement(By.xpath("//a[@id='menu_dashboard_index']/b")).getText();
	 
	
	 
	 Assert.assertEquals(page1, e);
	 //driver.close();
	 
  }
}
