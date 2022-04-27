import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Act_4_AddAnEmployee 
{
	 WebDriver driver;
	   String First_name;
	   String Last_name;
	   String ExpectedName;
	   String actual_dashboard_url = "http://alchemy.hguy.co:8080/orangehrm/symfony/web/index.php/dashboard";
	   
	   Act_3_LoginIntoHRM login = new Act_3_LoginIntoHRM ();
	   
	   
	@Test(dependsOnMethods="LoginIntoApplication")
	public void addAnEmployee() throws InterruptedException
	{
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("btnAdd")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("firstName")).sendKeys("Jasleen");
		First_name=driver.findElement(By.id("firstName")).getAttribute("value");
		 driver.findElement(By.id("lastName")).sendKeys("Kaur");
		 Last_name= driver.findElement(By.id("lastName")).getAttribute("value");
		Thread.sleep(2000);
		driver.findElement(By.id("btnSave")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("menu_pim_viewEmployeeList")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("empsearch_employee_name_empName")).sendKeys(First_name);
		Thread.sleep(2000);
		driver.findElement(By.id("empsearch_employee_name_empName")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.id("searchBtn")).click();
		Thread.sleep(2000);
		ExpectedName= driver.findElement(By.xpath("//tr[contains(@class,'odd')]")).getText();
		System.out.println(ExpectedName);
		driver.close();
	
	}
}
