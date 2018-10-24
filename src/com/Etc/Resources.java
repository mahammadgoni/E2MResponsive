package com.Etc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.BaseSetup.BaseSetUp;
import com.CommonActions.LoginToAccount;

public class Resources extends BaseSetUp{
	
	By menuBtn = By.xpath("//button[@id='open-button']");
	
	By etc = By.xpath("//*[@class='menu-group']//a[4]");
	
//	Resources Map Elements
	
	By resource = By.xpath("//span[contains(text(),'Resources')]");
	
	By resourceFl1 = By.xpath("//ul[@id='accordion']/li[1]");
	
	By resource1 = By.xpath("//div[@id='collapseOne1']//li[@class='resourceitem']");
	
	By resourceFL2 = By.xpath("//ul[@id='accordion']/li[2]");
	
	By resource2 = By.xpath("//div[@id='collapseOne2']//li[@class='resourceitem']");
	

	public Resources(WebDriver driver) {
		super(driver);
		
	}  
	
//	Verify Resources Method
	
	public Resources verifyResources(String userName,String password) throws InterruptedException{
		
//		Initiating LoginToAccount Class
		
		LoginToAccount login = new LoginToAccount(driver);
		
		login.commonLogin(userName, password);
				
		Thread.sleep(2000);
		
		System.out.println("Clicking on Menu Option ");

		waitForClickabilityOf(menuBtn);

		driver.findElement(menuBtn).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Etc ");

		waitForClickabilityOf(etc);

		driver.findElement(etc).click();	
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Resources");

		waitForClickabilityOf(resource);
		
		driver.findElement(resource).click();
		
		Thread.sleep(2000);
		
		boolean ApFl = driver.findElement(resourceFl1).isDisplayed();
		
		Thread.sleep(2000);
		
		if (ApFl==true) {
			
			System.out.println("Clicking on Resources Folder");
			
			driver.findElement(resourceFl1).click();
			
		} else {
			
			System.out.println("No Resources Folder");

		}
		
		Thread.sleep(2000);
		
		boolean RS = driver.findElement(resource1).isDisplayed();
		
		Thread.sleep(2000);
		
		if (RS==true) {
			
			System.out.println("Successfully Verified Resources option");
			
		} else {
			
			System.out.println("Failed to verify Resources");

		}
		
		
		
		return new Resources(driver);
	}
	
	

}
