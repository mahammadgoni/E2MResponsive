package com.Me;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.BaseSetup.BaseSetUp;
import com.CommonActions.LoginToAccount;

public class BusinessCard extends BaseSetUp{
	
	
	By menuBtn = By.xpath("//button[@id='open-button']");
	
	By meOption = By.xpath("//*[@class='menu-group']//a[3]");
	
	By businessCard = By.xpath("//span[contains(text(),'Business Card')]");
	
	By cardImage = By.xpath("//img[@class='img-resp-cstm']");
	

	public BusinessCard(WebDriver driver) {
		super(driver);
		
	}
	
//	Verify Business Card
	
	public BusinessCard verifyBusinessCard(String userName,String password) throws InterruptedException{
		
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
		
		System.out.println("Clicking on My Profile ");

		waitForClickabilityOf(businessCard);
		
		driver.findElement(businessCard).click();
	
		Thread.sleep(2000);
		
		boolean image = driver.findElement(cardImage).isDisplayed();
		
		Thread.sleep(2000);
		
		if (image==true) {
			
			System.out.println("Successfully Displayed Business Card Image");
			
		} else {
			
			System.out.println("Failed to View Business Card Image");

		}
		
		
		return new BusinessCard(driver);
	}

}
