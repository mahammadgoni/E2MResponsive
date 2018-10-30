package com.Live;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.BaseSetup.BaseSetUp;
import com.CommonActions.LoginToAccount;

public class Announcements extends BaseSetUp{
	
	By menuBtn = By.xpath("//button[@id='open-button']");
	
	By liveOption = By.xpath("//*[@class='menu-group']//a[2]");
	
	By announcemnet = By.xpath("//span[contains(text(),'Announcements')]");
	
	By notification1 = By.xpath("//ul[@id='accordion']/li[1]");
	
	By notification2 = By.xpath("//ul[@id='accordion']/li[2]");
	
	By notification3 = By.xpath("//ul[@id='accordion']/li[3]");

	public Announcements(WebDriver driver) {
		super(driver);
		
	}
	
	public Announcements verifyAnnouncement(String userName,String password) throws InterruptedException{
				
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
		
		System.out.println("Clicking on Announcements ");

		waitForClickabilityOf(announcemnet);

		driver.findElement(announcemnet).click();
		
		Thread.sleep(2000);
		
		boolean NT1 = driver.findElement(notification1).isDisplayed();
		
		Thread.sleep(2000);
		
		if (NT1==true) {
			
			System.out.println("Successfully Verified Announcement details");
			
		} else {
			
			System.out.println("Failed to Verify Announcement details");

		}
		
		
		
		
		
		return new Announcements(driver);
	}

}
