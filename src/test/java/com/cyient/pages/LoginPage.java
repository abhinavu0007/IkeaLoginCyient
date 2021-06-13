package com.cyient.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	 
	private WebDriver driver;
	
	private By signInLocator = By.xpath("//a[@title='My Profile']//span[@class='hnf-btn__inner']");
	private By userNumberLocator = By.xpath("//input[@id='username']");

	private By clickContinueLocator = By.xpath("//button[@type='submit']");
	
	
	private By errorLocator =By.xpath("//div[@class='inline-text'] ");
	
	private By passwordLocator = By.id("Password");
	
	private By passwordErrorLocator = By.xpath("//span[normalize-space()='Passwords must have 8 characters or more.']");
	
	
	public LoginPage(WebDriver driver)
	{
		this.driver= driver;
	}
	
	public void signIn() 
	{
		driver.findElement(signInLocator).click();
	}
	
	public void enterNumber(String number)
	{
		driver.findElement(userNumberLocator).sendKeys(number);
	}
	
	
	public void clickContinue()
	{
		driver.findElement(clickContinueLocator).click();
	}
	
	public String  errorMessage()
	{String actualpath=
		 driver.findElement(errorLocator).getText().trim();
		return actualpath;
	}
	
	public void enterPassword(String password)
	{
		
		driver.findElement(passwordLocator).sendKeys(password);
		
	}
	
	public String passwordErrorMessage()
	{
		return driver.findElement(passwordErrorLocator).getText().trim();
	}
	
	
	
	

}
