import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Act_8_ApplyingLeave 
{
	 WebDriver driver;
	@Test(dependsOnMethods="LoginIntoApplication")
	public void leaveApplication() throws InterruptedException
	{
		driver.findElement(By.id("menu_dashboard_index")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(text(),'Apply Leave')]")).click();
		Thread.sleep(2000);
		Select leaveType = new Select(driver.findElement(By.id("applyleave_txtLeaveType")));
		leaveType.selectByIndex(1);
		Thread.sleep(1000);
		driver.findElement(By.id("applyleave_txtFromDate")).click();
		Select year = new Select(driver.findElement(By.className("ui-datepicker-year")));
		year.selectByValue("2021");
		Thread.sleep(1000);
		Select month = new Select(driver.findElement(By.className("ui-datepicker-month")));
		month.selectByVisibleText("Sep");
		driver.findElement(By.xpath("//a[contains(text(),'7')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("applyleave_txtToDate")).click();
		Select year1 = new Select(driver.findElement(By.className("ui-datepicker-year")));
		year1.selectByValue("2021");
		Thread.sleep(1000);
		Select month1 = new Select(driver.findElement(By.className("ui-datepicker-month")));
		month1.selectByVisibleText("Sep");
		driver.findElement(By.xpath("//a[contains(text(),'20')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("applyBtn")).click();
		System.out.println("Successfully Applied for leaves");
		Thread.sleep(2000);
		driver.findElement(By.id("menu_leave_viewMyLeaveList")).click();
		driver.close();
	}
	
}
