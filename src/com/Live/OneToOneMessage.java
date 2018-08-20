package com.Live;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.BaseSetup.BaseSetUp;
import com.CommonActions.LoginToAccount;

public class OneToOneMessage extends BaseSetUp{
	
	
	
	By menuBtn = By.xpath("//button[@id='open-button']");
	
//	One To One Message Elements
	
	By liveOption = By.xpath("//*[@class='menu-group']//a[2]");
	
	By clickOnOneToOneMsg = By.xpath("//span[contains(text(),'One to one message')]");
	
	By clickOnEditMsg = By.xpath("//img[@src='/images/edit-icon.png']");
	
	By select1stAttendee = By.xpath("//div[@id='exhibitors-view']//div[1]//a[2]");
	
	By clickOnChat = By.xpath("//ul[@class='ulHeaderSection']/li[1]");
	
	By writeHere = By.xpath("//textarea[@id='txtComment']");
	
	By sendBtn = By.xpath("//input[@value='Send']");
	
	

	public OneToOneMessage(WebDriver driver) {
		super(driver);
		
	}
	
	
	public OneToOneMessage oneToOneMsg(String userName,String password,String Message) throws InterruptedException{
		
//		Initiating LoginToAccount Class
		
		LoginToAccount login = new LoginToAccount(driver);
		
		login.commonLogin(userName, password);
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Menu Option ");

		waitForClickabilityOf(menuBtn);

		driver.findElement(menuBtn).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Live ");

		waitForClickabilityOf(liveOption);

		driver.findElement(liveOption).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on One To One Message ");

		waitForClickabilityOf(clickOnOneToOneMsg);

		driver.findElement(clickOnOneToOneMsg).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Write Message Button ");

		waitForClickabilityOf(clickOnEditMsg);

		driver.findElement(clickOnEditMsg).click();
		
		Thread.sleep(2000);
		
		System.out.println("Selecting Attendee to Send the Message");

		waitForClickabilityOf(select1stAttendee);

		driver.findElement(select1stAttendee).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking On Attendee Chat to Send the Message");

		waitForClickabilityOf(clickOnChat);

		driver.findElement(clickOnChat).click();
		
		Thread.sleep(2000);
		
		System.out.println("Entering the Message");

		waitForClickabilityOf(writeHere);

		driver.findElement(writeHere).clear();
		
		driver.findElement(writeHere).sendKeys(Message);
		
		Thread.sleep(2000);
		
		System.out.println("Clicking On Send Button ");

		waitForClickabilityOf(sendBtn);

		driver.findElement(sendBtn).click();
		
		Thread.sleep(4000);
		
//      Verifying Condition 
		
		String SentMsg = driver.findElement(By.xpath("//*[contains(text(),'"+Message+"')]")).getText();
		
		if (SentMsg.equals(Message)) {
			
			System.out.println("Successfully Sent the One To One Message");
			
		} else {
			
			System.out.println("Failed to Send the One To One Message");

		}
		
		
		
		
		return new OneToOneMessage(driver);
		
	}

}
