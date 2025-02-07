package Selenium_TestNG_Activities;

import org.testng.annotations.Test;

import junit.framework.Assert;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class Activity3 {
	WebDriver driver;
  @Test
  public void Login() {
	  
	//Find the username and password fields
      WebElement username = driver.findElement(By.id("username"));
      WebElement password = driver.findElement(By.id("password"));
      
      //Enter credentials
      username.sendKeys("admin");
      password.sendKeys("password");
      
      //Click login
      driver.findElement(By.xpath("//button[text()='Log in']")).click();
      
      //Read login message
      String loginMessage = driver.findElement(By.id("action-confirmation")).getText();
      Assert.assertEquals("Welcome Back, admin", loginMessage);
  }
  @BeforeMethod
  public void beforeMethod() {
	  driver = new FirefoxDriver();
	  
      //Open browser
      driver.get("https://www.training-support.net/selenium/login-form");
  }

  @AfterMethod
  public void afterMethod() {
	//Close browser
      driver.close();
  }

}
