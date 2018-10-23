package com.Live;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.BaseSetup.BaseSetUp;
import com.CommonActions.LoginToAccount;

public class SocialLink extends BaseSetUp{
	
	By menuBtn = By.xpath("//button[@id='open-button']");
	
	By liveOption = By.xpath("//*[@class='menu-group']//a[2]");
	
	By socialLink = By.xpath("//span[contains(text(),'Social Link')]");
	
	By socialLink1 = By.xpath("//div[@class='track-list-hld']/ul/li[1]");
	
	By socialLink2 = By.xpath("//div[@class='track-list-hld']/ul/li[2]");
	
	

	public SocialLink(WebDriver driver) {
		super(driver);
		
	}
	
	
//	Social Link Verify Method
	
	public SocialLink verifySocialLink(String userName,String password) throws InterruptedException{
		
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
		
		System.out.println("Clicking on Social Link ");

		waitForClickabilityOf(socialLink);

		driver.findElement(socialLink).click();
		
		Thread.sleep(2000);
		
		boolean Sl = driver.findElement(socialLink1).isDisplayed();
		
		Thread.sleep(2000);
		
		if (Sl==true) {
			
			System.out.println("Successfully Verified Social Link");
			
		} else {
			
			System.out.println("Failed to Verify Social Link");

		}
		
		
		
		return new SocialLink(driver);
	}
	
	
	
	

}
