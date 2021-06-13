package com.cyient.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class WebDriverWrapper {
	
	
	public WebDriver driver;
	
@BeforeMethod	
public void setup()
{
	
  System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver.exe");
  driver = new ChromeDriver();
  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  driver.manage().window().maximize();
  driver.get("https://www.ikea.com/in/en/");
  

}

@AfterMethod
public void teardown()
{
driver.close();	
}

}
