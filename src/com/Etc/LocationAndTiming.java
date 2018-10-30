package com.Etc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.BaseSetup.BaseSetUp;
import com.CommonActions.LoginToAccount;

public class LocationAndTiming extends BaseSetUp{
	
	
	By menuBtn = By.xpath("//button[@id='open-button']");
	
	By etc = By.xpath("//*[@class='menu-group']//a[4]");
	
//	Location And Timings Elements
	
	By locationAndTiming = By.xpath("//span[contains(text(),'Location & Timing')]");
	
	By eventLocDropDown = By.xpath("//a[@id='venueAccordian']");
	
	By location1 = By.xpath("//ul[@class='map-area']//li[1]");
	
	By location2 = By.xpath("//ul[@class='map-area']//li[2]");
	
	By backToMap = By.xpath("//a[@id='back-map']");
	
	By opendLocName = By.xpath("//div[@class='location-name']/h2[1]");
	
	By opendLocAdrs = By.xpath("//div[@class='location-name']/h2[2]");
	
	By localTime = By.xpath("//div[@class='time-show']");
	
	
	
	
	

	public LocationAndTiming(WebDriver driver) {
		super(driver);
		
	}
	
	public LocationAndTiming verifyLocationAndTiming(String userName,String password) throws InterruptedException{
		
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
		
		System.out.println("Clicking on Location And Timing ");

		waitForClickabilityOf(locationAndTiming);

		driver.findElement(locationAndTiming).click();	
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Event Location Drop Down");

		waitForClickabilityOf(eventLocDropDown);

		driver.findElement(eventLocDropDown).click();	
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Event Location from Drop Down");

		waitForClickabilityOf(location1);

		driver.findElement(location1).click();	
		
		Thread.sleep(2000);
		
		String OpenLocNm = driver.findElement(opendLocName).getText();
		
		Thread.sleep(2000);
		
		String OpenLocAd = driver.findElement(opendLocAdrs).getText();
		
		Thread.sleep(2000);
		
		String OpenLocTm = driver.findElement(localTime).getText();
		
		Thread.sleep(2000);
		
		System.out.println("Event Location Name is : "+OpenLocNm+"\n" + "Event Location Address is : "+OpenLocAd+"\n" +" Event Time is : "+OpenLocTm);
		
		
		
		return new LocationAndTiming(driver);
	}

}