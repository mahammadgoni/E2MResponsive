package com.Etc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.BaseSetup.BaseSetUp;
import com.CommonActions.LoginToAccount;

public class Home extends BaseSetUp{
	
	By menuBtn = By.xpath("//button[@id='open-button']");
	
	By etc = By.xpath("//*[@class='menu-group']//a[4]");
	
//	Home Elements
	
	By home = By.xpath("//span[contains(text(),'Home')]");
	
	By schedule = By.xpath("//a[@href='/Sessions/ConfigureTabs']//span[@class='icon-nm'][contains(text(),'Schedule')]");
	
	By speakers = By.xpath("//span[@class='icon-nm'][contains(text(),'Speakers')]");
	
	By exhibitors = By.xpath("//span[@class='icon-nm'][contains(text(),'Exhibitors')]");
	
	By socialWall = By.xpath("//span[@class='icon-nm'][contains(text(),'Social Wall')]");
	
	By oneToOneMessage = By.xpath("//span[@class='icon-nm'][contains(text(),'One to one message')]");
	
	By announcements = By.xpath("//span[@class='icon-nm'][contains(text(),'Announcements')]");
	
	By photoWall = By.xpath("//span[@class='icon-nm'][contains(text(),'PhotoWall')]");
	
	By videoWall = By.xpath("//span[@class='icon-nm'][contains(text(),'VideoWall')]");
	
	By notes = By.xpath("//span[@class='icon-nm'][contains(text(),'Notes')]");
	
	By logout = By.xpath("//span[@class='icon-nm'][contains(text(),'Log out')]");
	
	

	public Home(WebDriver driver) {
		super(driver);
		
	}
	
	public Home verifyHome(String userName,String password) throws InterruptedException{
		
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
		
		System.out.println("Clicking on Home");

		waitForClickabilityOf(home);
		
		driver.findElement(home).click();
		
		Thread.sleep(2000);
		
//		Schedule option visibility
		
		boolean Schedule = driver.findElement(schedule).isDisplayed();
		
		Thread.sleep(2000);
		
		System.out.println("Schedule icon is Visible :"+Schedule);
		
		if (Schedule==true) {
			
			driver.findElement(schedule).click();
			
			Thread.sleep(2000);
			
			System.out.println("Clicking on Schedule Icon");
			
			Thread.sleep(2000);
			
			driver.navigate().back();
			
		} else {
			
			System.out.println("Schedule Icon is not visible");

		}
		
//		Speaker option visibility
		
		boolean Speaker = driver.findElement(speakers).isDisplayed();
		
		Thread.sleep(2000);
		
		System.out.println("Speaker icon is Visible :"+Speaker);
		
		if (Speaker==true) {
			
			driver.findElement(speakers).click();
			
			Thread.sleep(2000);
			
			System.out.println("Clicking on Speaker Icon");
			
			Thread.sleep(2000);
			
			driver.navigate().back();
			
		} else {
			
			System.out.println("Speaker Icon is not visible");

		}
		
//		Exhibitors option visibility
		
		boolean Exhibitors = driver.findElement(exhibitors).isDisplayed();
		
		Thread.sleep(2000);
		
		System.out.println("Exhibitor icon is Visible :"+Exhibitors);
		
		if (Exhibitors==true) {
			
			driver.findElement(exhibitors).click();
			
			Thread.sleep(2000);
			
			System.out.println("Clicking on Exhibitor Icon");
			
			Thread.sleep(2000);
			
			driver.navigate().back();
			
		} else {
			
			System.out.println("Exhibitors Icon is not visible");

		}
		
//		SocialWall option visibility
		
		boolean SocialWall = driver.findElement(socialWall).isDisplayed();
		
		Thread.sleep(2000);
		
		System.out.println("SocialWall icon is Visible :"+SocialWall);
		
		if (SocialWall==true) {
			
			driver.findElement(socialWall).click();
			
			Thread.sleep(2000);
			
			System.out.println("Clicking on SocialWall Icon");
			
			Thread.sleep(2000);
			
			driver.navigate().back();
			
		} else {
			
			System.out.println("SocialWall Icon is not visible");

		}
		
//		OneToOneMsg option visibility
		
		boolean OneToOneMsg = driver.findElement(oneToOneMessage).isDisplayed();
		
		Thread.sleep(2000);
		
		System.out.println("OneToOneMsg icon is Visible :"+OneToOneMsg);
		
		if (OneToOneMsg==true) {
			
			driver.findElement(oneToOneMessage).click();
			
			Thread.sleep(2000);
			
			System.out.println("Clicking on OneToOneMsg Icon");
			
			Thread.sleep(2000);
			
			driver.navigate().back();
			
		} else {
			
			System.out.println("OneToOneMsg Icon is not visible");

		}
		
//		Announcement option visibility
		
		boolean Announcement = driver.findElement(announcements).isDisplayed();
		
		Thread.sleep(2000);
		
		System.out.println("Announcement icon is Visible :"+Announcement);
		
		if (Announcement==true) {
			
			driver.findElement(announcements).click();
			
			Thread.sleep(2000);
			
			System.out.println("Clicking on Announcement Icon");
			
			Thread.sleep(2000);
			
			driver.navigate().back();
			
		} else {
			
			System.out.println("Announcement Icon is not visible");

		}
		
//		PhotoWall option visibility
		
		boolean PhotoWall = driver.findElement(photoWall).isDisplayed();
		
		Thread.sleep(2000);
		
		System.out.println("PhotoWall icon is Visible :"+PhotoWall);
		
		if (PhotoWall==true) {
			
			driver.findElement(photoWall).click();
			
			Thread.sleep(2000);
			
			System.out.println("Clicking on PhotoWall Icon");
			
			Thread.sleep(2000);
			
			driver.navigate().back();
			
		} else {
			
			System.out.println("PhotoWall Icon is not visible");

		}
		
//		VideoWall option visibility
		
		boolean VideoWall = driver.findElement(videoWall).isDisplayed();
		
		Thread.sleep(2000);
		
		System.out.println("VideoWall icon is Visible :"+VideoWall);
		
		if (VideoWall==true) {
			
			driver.findElement(videoWall).click();
			
			Thread.sleep(2000);
			
			System.out.println("Clicking on VideoWall Icon");
			
			Thread.sleep(2000);
			
			driver.navigate().back();
			
		} else {
			
			System.out.println("VideoWall Icon is not visible");

		}
		
//		Notes option visibility
		
		boolean Notes = driver.findElement(notes).isDisplayed();
		
		Thread.sleep(2000);
		
		System.out.println("Notes icon is Visible :"+Notes);
		
		if (Notes==true) {
			
			driver.findElement(notes).click();
			
			Thread.sleep(2000);
			
			System.out.println("Clicking on Notes Icon");
			
			Thread.sleep(2000);
			
			driver.navigate().back();
			
		} else {
			
			System.out.println("Notes Icon is not visible");

		}
		
		

		
		
		
		return new Home(driver);
	}

}
