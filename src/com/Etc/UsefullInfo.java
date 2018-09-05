package com.Etc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.BaseSetup.BaseSetUp;
import com.CommonActions.LoginToAccount;

public class UsefullInfo extends BaseSetUp{
	
	
	By menuBtn = By.xpath("//button[@id='open-button']");
	
	By etc = By.xpath("//*[@class='menu-group']//a[4]");
	
	By usefullInfo = By.xpath("//span[contains(text(),'Useful Info')]");
	
	By select1stInfo = By.xpath("//ul[@id='accordion']//li[1]//div[1]//div[1]");
	
	By infoDetails = By.xpath("//div[@class='wrap active']//div[@class='content']//div//div[@class='white-bg editor-css usefull-info-hld editor-margin-0']/div/div");
	
	By popUpClose = By.xpath("//div[@class='wrap active']//div[@class='content']//div//a[@class='close-popup']");
	

	public UsefullInfo(WebDriver driver) {
		super(driver);
		
	}
	
//	Useful Info Method
	
	public UsefullInfo verifyUsefulInfo(String userName,String password) throws InterruptedException{
		
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
		
		System.out.println("Clicking on Useful Info");

		waitForClickabilityOf(usefullInfo);
		
		driver.findElement(usefullInfo).click();
		
		Thread.sleep(2000);
		
		System.out.println("Selecting Usefull info");

		waitForClickabilityOf(select1stInfo);

		driver.findElement(select1stInfo).click();
		
		Thread.sleep(2000);
		
		System.out.println("Getting the Useful Info");

		waitForClickabilityOf(infoDetails);
		
		String details = driver.findElement(infoDetails).getText();
		
		System.out.println("Info Details : "+details);
		
		Thread.sleep(2000);
		
		System.out.println("Clicking On Close Useful Info");

		waitForClickabilityOf(popUpClose);
		
		driver.findElement(popUpClose).click();
		
		Thread.sleep(2000);
		
		System.out.println("Successfully Displayed Useful Info");
		
		
		return new UsefullInfo(driver);
		
	}
	
	

}
