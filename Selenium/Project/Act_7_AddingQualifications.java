import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Act_7_AddingQualifications 
{
	WebDriver driver;
	@Test(dependsOnMethods="LoginIntoApplication")
	public void addEmployeeQualification() throws InterruptedException
	{
		driver.findElement(By.id("menu_pim_viewMyDetails")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[contains(text(),'Qualifications')])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("addWorkExperience")).click();
		System.out.println("Successfully clicked on Add Button");
	    driver.findElement(By.id("experience_employer")).click();
	    driver.findElement(By.id("experience_employer")).sendKeys("IBM India Pvt Ltd");
	    driver.findElement(By.id("experience_jobtitle")).click();
	    driver.findElement(By.id("experience_jobtitle")).sendKeys("Advisory Technical Services Specialist");
	    driver.findElement(By.id("experience_from_date")).click();
	    Select year = new Select(driver.findElement(By.className("ui-datepicker-year")));
		year.selectByValue("2021");
		Thread.sleep(1000);
		Select month = new Select(driver.findElement(By.className("ui-datepicker-month")));
		month.selectByVisibleText("Jan");
		driver.findElement(By.xpath("//a[contains(text(),'28')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("btnWorkExpSave")).click();
		System.out.println("Work Experience added succesfully");
		driver.close();
	    
	}
	
}
