import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Act_9_EmergencyContacts
{
	WebDriver driver;
	@Test(dependsOnMethods="LoginIntoApplication")
	public void emergencyContact() throws InterruptedException
	{
		driver.findElement(By.id("menu_pim_viewMyDetails")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(text(),'Emergency Contacts')]")).click();
		driver.findElement(By.id("emgcontact_list"));
		System.out.println("Table is located");
	    List<WebElement>	rows = driver.findElements(By.xpath("/html/body/div[1]/div[3]/div/div[3]/div[2]/form/table/tbody/tr"));
		int number= rows.size();
		System.out.println("Number of rows in Contact table are " + number);
		for(int i=0;i<number;i++)
		{
		List<WebElement>columns=rows.get(i).findElements(By.tagName("td"));
		int colCount = columns.size();
		for(int j = 0;j<colCount;j++)
		{
		String textofTable= columns.get(j).getText();
		System.out.println("The cell text is " + textofTable);
		}
		}
		driver.close();
	}
}
