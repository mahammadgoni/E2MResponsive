package com.CommonActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.BaseSetup.BaseSetUp;

public class LoginToAccount extends BaseSetUp{
	
	By emailId = By.xpath("//*[@id='txtUsername']");
	
	By proceedBtn = By.xpath("//*[@id='spnLogin']");
	
	By pass = By.xpath("//*[@name='password_']");
	
	By signInBtn = By.xpath("//*[@id='spnPassword']");
	
	By menuBtn = By.xpath("//button[@id='open-button']");
	
	By logoutBtn = By.xpath("//*[@class='icon-logout']");
	

	public LoginToAccount(WebDriver driver) {
		super(driver);
		
	}
	
//	This method will be used for Login action for all classes
	
	public void commonLogin(String Email,String Pass) throws InterruptedException{
		
		System.out.println("Entering Email id  is : "+Email);
		
		waitForClickabilityOf(emailId);
		
		driver.findElement(emailId).clear();
		
		driver.findElement(emailId).sendKeys(Email);
		
		Thread.sleep(1000);
		
		System.out.println("Clicking on Proceed Button");
		
		waitForClickabilityOf(proceedBtn);
		
		driver.findElement(proceedBtn).click();
		
		Thread.sleep(1000);
				
		System.out.println("Entering Password  is : "+Pass);
		
		waitForClickabilityOf(pass);
		
		driver.findElement(pass).clear();
		
		driver.findElement(pass).sendKeys(Pass);
		
		Thread.sleep(1000);
		
		System.out.println("Clicking on Sign in Button");
		
		waitForClickabilityOf(signInBtn);
		
		driver.findElement(signInBtn).click();
		
		Thread.sleep(1000);
		
	}
	
	public LoginToAccount loginToAccount(String EmailId,String Password) throws InterruptedException{

		commonLogin(EmailId, Password);
		
//		Verifying the condition 
		
		waitForClickabilityOf(menuBtn);
				
		if (driver.findElement(menuBtn).isDisplayed()==true) {
			
			System.out.println("Successfully Logged in to your Account");
			
		} else {
			
			System.out.println("Failed to Login to your Account");

		}
		
//		driver.findElement(logoutBtn).click();
				
		return new LoginToAccount(driver);
		
	}

}
