import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Act_6_DirectoryItem 
{
	WebDriver driver;
	String actual_directoryName = "Search Directory";
	String expected_directoryName;
	   
	@Test(dependsOnMethods="LoginIntoApplication")
	public void verifyDirectory() throws InterruptedException
	{
		boolean directory;
		directory= driver.findElement(By.id("menu_directory_viewDirectory")).isDisplayed();
		if(directory)
		{
			System.out.println("Directory Menu is visible");
			driver.findElement(By.id("menu_directory_viewDirectory")).click();
			
		}
		else
		{
			System.out.println("Directory Menu is not visible");		
		}
	
		expected_directoryName = driver.findElement(By.xpath("//h1[contains(text(),'Search Directory')]")).getText();	
		System.out.println(expected_directoryName);
		Assert.assertEquals(actual_directoryName, expected_directoryName);
		System.out.println("The actual and expected matches");
		driver.close();
		
	}

}
