package com.Live;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.BaseSetup.BaseSetUp;
import com.CommonActions.LoginToAccount;

public class Attendees extends BaseSetUp{
	
	
	By menuBtn = By.xpath("//button[@id='open-button']");
	
	By liveOption = By.xpath("//*[@class='menu-group']//a[2]");
	
	By attendees = By.xpath("//span[contains(text(),'Attendees')]");
	
	By selectAttendee = By.xpath("//div[@id='exhibitors-view']/div[1]");
	
	By clickOnChat = By.xpath("//ul[@class='ulHeaderSection']/li[1]");
	
	By attendeeBookmark = By.xpath("//a[@title='Bookmark']");
	
	By attendeeUnbookmark = By.xpath("//a[@title='Unbookmark']");
	
	By writeHere = By.xpath("//textarea[@id='txtComment']");
	
	By sendBtn = By.xpath("//input[@value='Send']");
	

	public Attendees(WebDriver driver) {
		super(driver);
		
	}
	
	public Attendees attendeeDetails(String userName,String password,String Message) throws InterruptedException{
		
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
		
		System.out.println("Clicking on Attendees ");

		waitForClickabilityOf(attendees);

		driver.findElement(attendees).click();
		
		Thread.sleep(2000);
		
		System.out.println("Selecting 1st Attendee ");

		waitForClickabilityOf(selectAttendee);

		driver.findElement(selectAttendee).click();
		
		Thread.sleep(2000);
		
		try {
			
			boolean unBookmark = driver.findElement(attendeeUnbookmark).isDisplayed();
			
			if (unBookmark==true) {
				
				System.out.println("Attendee is already Bookmarked");
				
			} else {
				
				System.out.println("Bookmark this Attendee ");

				waitForClickabilityOf(attendeeBookmark);

				driver.findElement(attendeeBookmark).click();

			}
			
		} catch (Exception e) {
			
		}
		
		Thread.sleep(2000);
		
		System.out.println("Clicking On Attendee Chat option ");

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
			
			System.out.println("Successfully Verified Attendee details");
			
		} else {
			
			System.out.println("Failed to Verify Attendee details");

		}
		
		
		
		return new Attendees(driver);
	}

}
