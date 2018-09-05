package com.Etc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.BaseSetup.BaseSetUp;
import com.CommonActions.LoginToAccount;

public class AllEvents extends BaseSetUp{
	
	
	By menuBtn = By.xpath("//button[@id='open-button']");
	
	By etc = By.xpath("//*[@class='menu-group']//a[4]");
	
	By allEvents = By.xpath("//span[contains(text(),'All Events')]");
	
	By selectEventsText = By.xpath("//h3[@id='txtcenter']");
	
	By selectEvent = By.xpath("//div[@id='events-view']/a[1]");
	
	

	public AllEvents(WebDriver driver) {
		super(driver);
		
	}
	
//	All Event Method
	
	public AllEvents verifyAllEvent(String userName,String password) throws InterruptedException{
		
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
		
		System.out.println("Clicking on All Events");

		waitForClickabilityOf(allEvents);
		
		driver.findElement(allEvents).click();
	
		Thread.sleep(2000);
		
		String EventText = driver.findElement(selectEventsText).getText();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Event");

		waitForClickabilityOf(selectEvent);
		
		driver.findElement(selectEvent).click();
		
		Thread.sleep(2000);
		
		if (EventText.equals("Please select an event")) {
			
			System.out.println("Successfully Verified All Events");
			
		} else {
			
			System.out.println("Failed to Verify All Events");

		}
		
		
		
		
		
		return new AllEvents(driver);
		
	}

}
