package com.Me;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.BaseSetup.BaseSetUp;
import com.CommonActions.LoginToAccount;

public class Logout extends BaseSetUp{
	
	
	
	By menuBtn = By.xpath("//button[@id='open-button']");
	
	By meOption = By.xpath("//*[@class='menu-group']//a[3]");
	
	By logout = By.xpath("//span[contains(text(),'Log out')]");
	
	By emailId = By.xpath("//*[@id='txtUsername']");
	
	

	public Logout(WebDriver driver) {
		super(driver);
		
	}
	
//	Logout Method
	
	public Logout logout(String userName,String password) throws InterruptedException{
		
//		Initiating LoginToAccount Class
		
		LoginToAccount login = new LoginToAccount(driver);
		
		login.commonLogin(userName, password);
				
		Thread.sleep(2000);
		
		System.out.println("Clicking on Menu Option ");

		waitForClickabilityOf(menuBtn);

		driver.findElement(menuBtn).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Me ");

		waitForClickabilityOf(meOption);

		driver.findElement(meOption).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Logout");

		waitForClickabilityOf(logout);
		
		driver.findElement(logout).click();
	
		Thread.sleep(2000);
		
		boolean sign = driver.findElement(emailId).isDisplayed();
		
		Thread.sleep(2000);
		
		if (sign==true) {
			
			System.out.println("Successfully Logout from My Account");
			
		} else {
			
			System.out.println("Failed to Logout from My Account");

		}
		
		Thread.sleep(2000);
		
		login.commonLogin(userName, password);
				
		Thread.sleep(2000);
		
		
		
		
		
		return new Logout(driver);
		
	}

}
