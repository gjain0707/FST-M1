package ProjectActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Activity4 {
	
	Activity3 a = new Activity3();
	WebDriver driver = new FirefoxDriver();
  @Test
  public void add_emp() throws InterruptedException {
	  a.login();
	  Thread.sleep(4000);
	  driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']/b")).click();
	  driver.findElement(By.xpath("//input[@id='btnAdd']")).click();
	  driver.findElement(By.id("firstName")).sendKeys("Gaurav");
	  driver.findElement(By.id("lastName")).sendKeys("Jain");
	  driver.findElement(By.id("btnSave")).click();
	  driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']/b")).click();
	  
	int  rowcount =  driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr")).size();
	String fname;
	String lname;
	String efname = "Gaurav";
	String elname = "Jain";
	
	for(int i=0; i<=rowcount; i++) {
		 fname = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr/td[3]")).get(i).getText();
		 lname = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr/td[4]")).get(i).getText();
		 System.out.println(fname);
	}
	
	
		
		
	}
	
	
	  
	  
	  
  
}
