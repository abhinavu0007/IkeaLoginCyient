package com.cyient.test;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.cyient.base.WebDriverWrapper;
import com.cyient.pages.LoginPage;
import com.cyient.utilities.DataProviderExcel;

import net.bytebuddy.implementation.bind.annotation.BindingPriority;

public class LoginTest extends WebDriverWrapper {
	
	
	
	@Test(dataProvider = "validCredentialExcel" , dataProviderClass = DataProviderExcel.class)
	public void validCredentialTest(String number, String message) throws InterruptedException
	{   
		Thread.sleep(1000);
		LoginPage login = new LoginPage(driver);
	
		
		 login.signIn();
		 Thread.sleep(2000);
		login.enterNumber(number);
		login.clickContinue();
		String actualvalue = login.errorMessage();
		System.out.println(actualvalue);
		Assert.assertEquals(actualvalue, "Please enter a valid email or verified mobile number");
		
	}
	
	
	@Test(dataProvider = "validPasswordExcel" , dataProviderClass = DataProviderExcel.class)
	public void validPasswordTest(String name, String password, String message) throws InterruptedException
	{
		LoginPage login = new LoginPage(driver);
		 login.signIn();
		 Thread.sleep(2000);
		login.enterNumber("Abhinav");
		
		login.enterPassword("12");
		
		login.clickContinue();
		
		String actualvalue = login.passwordErrorMessage();
		System.out.println(actualvalue);
		Assert.assertEquals(actualvalue, "Passwords must have 8 characters or more.");
		
	}
	
	@Test
	public void navigationTest() throws InterruptedException
	{
		driver.findElement(By.id("onetrust-accept-btn-handler")).click();
		driver.findElement(By.linkText("Products")).click();
		Thread.sleep(2000);
	driver.findElement(By.xpath("//a[contains(text(),'New lower price')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[normalize-space()='799']")).click();
		
		driver.findElement(By.xpath("//span[@class='range-revamp-btn__label']")).click();
		
		
	}
	
	
	

}
