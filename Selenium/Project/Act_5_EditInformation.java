import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Act_5_EditInformation 
{
	   WebDriver driver;
	   String First_name;
	   String Last_name;
	   
	@Test(dependsOnMethods="LoginIntoApplication")
	public void editInformation() throws InterruptedException
	{
		driver.findElement(By.id("menu_pim_viewMyDetails")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@value,'Edit')]")).click();
		Thread.sleep(2000);
		WebElement First_name = driver.findElement(By.id("personal_txtEmpFirstName"));
		First_name.click();
		First_name.clear();
		First_name.sendKeys("Jasleen");
		WebElement Last_name= driver.findElement(By.id("personal_txtEmpLastName"));
		Last_name.click();
		Last_name.clear();
		Last_name.sendKeys("Kaur");
		Thread.sleep(2000);
		driver.findElement(By.id("personal_optGender_2")).click();
		Thread.sleep(2000);
		Select nationality= new Select(driver.findElement(By.id("personal_cmbNation")));
		nationality.selectByVisibleText("Indian");
		Thread.sleep(2000);
		driver.findElement(By.id("personal_DOB")).click();
		Select year = new Select(driver.findElement(By.className("ui-datepicker-year")));
		year.selectByValue("1992");
		Thread.sleep(1000);
		Select month = new Select(driver.findElement(By.className("ui-datepicker-month")));
		month.selectByVisibleText("Dec");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(text(),'28')]")).click();
		System.out.println("DOB is selected and changed");
		Thread.sleep(2000);
		driver.findElement(By.id("btnSave")).click();
		System.out.println("Edited user information successfully and saved it");
		driver.close();
		
	}
	
}
