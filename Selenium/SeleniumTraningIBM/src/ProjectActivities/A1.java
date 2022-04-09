package ProjectActivities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class A1 {

	public WebDriver driver = new FirefoxDriver();
	public String t;
	public String eT = "OrangeHRM";

	@Test
	public void launch() {
		driver.get("http://alchemy.hguy.co/orangehrm");
		t = driver.getTitle();
	}

	@Test
	public void validateTitle() {
		Assert.assertTrue(eT.contentEquals(t));
		System.out.println("matching");
		driver.close();
	}
	
	@Test
	public void closebrowser() {
		driver.close();
	}
}
