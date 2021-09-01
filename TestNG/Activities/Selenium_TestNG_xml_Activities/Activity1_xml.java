package Selenium_TestNG_xml_Activities;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameters;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;

public class Activity1 {
	WebDriver driver;
	WebDriverWait wait;
	
  @Test
@Parameters ({"username", "password"})
  
  public void loginTestCase(String username, String password) {
      //Find username and pasword fields
      WebElement usernameField = driver.findElement(By.id("username"));
      WebElement passwordField = driver.findElement(By.id("password"));
      
      //Enter values
      usernameField.sendKeys(username);
      passwordField.sendKeys(password);
      
      //Click Log in
      driver.findElement(By.cssSelector("button[type='submit']")).click();
      
      //Assert Message
      String loginMessage = driver.findElement(By.id("action-confirmation")).getText();
      AssertJUnit.assertEquals(loginMessage, "Welcome Back, admin");}
  @BeforeMethod
  public void beforeMethod() {
	  driver = new FirefoxDriver();
      wait = new WebDriverWait(driver, 10);
      
      //Open browser
      driver.get("https://www.training-support.net/selenium/login-form");
  }

  @AfterMethod
  public void afterMethod() {
	//Close browser
      driver.close();
  }

}
