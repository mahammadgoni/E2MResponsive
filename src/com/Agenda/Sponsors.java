package com.Agenda;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.BaseSetup.BaseSetUp;
import com.CommonActions.LoginToAccount;

public class Sponsors extends BaseSetUp{
	
	
	By menuBtn = By.xpath("//button[@id='open-button']");
	
	By agendaOption = By.xpath("//*[@class='menu-group']//a[1]");
	
	By sponsors = By.xpath("//span[contains(text(),'Sponsors')]");
	
	By noOfSponsors = By.xpath("//div[@id='exhibitors-view']/div/div");
	
	By initSponsorsName1 = By.xpath("//div[@id='exhibitors-view']/div/div[1]/a[2]/div/div/h3");
	
	By initSponsorsName2 = By.xpath("//div[@id='exhibitors-view']/div/div[2]/a/div/div/h3");
	
	By sponsors1 = By.xpath("//div[@id='exhibitors-view']/div/div[1]");
	
	By sponsors2 = By.xpath("//div[@id='exhibitors-view']/div/div[2]");
	
	By sponsorsName = By.xpath("//div[@class='right-attendence-hld']/h2");
	
	By bookmarkSpnsr = By.xpath("//*[@class='no-bookmark']");
	
	By unBookmarkSpnsr = By.xpath("//*[@class='no-bookmark add-bookmark']");
	
	By spnsrWebsite = By.xpath("//i[@class='icon-web']");
	
	By spnsrAddress = By.xpath("//ul[@class='exhi-contlist-hld']/li[1]/span");
	
	By spnsrEmail = By.xpath("//ul[@class='exhi-contlist-hld']/li[2]/span");
	
	By spnsrPhone = By.xpath("//ul[@class='exhi-contlist-hld']/li[3]/span");
	
	By spnsrResources = By.xpath("//div[@id='accordion-hld']");
	
	By resourcesCategory = By.xpath("//li[@id='lipanel1']//div[@class='ac-header-hld clearfix']");
	
	By resourceData = By.xpath("//div[@id='collapseOne1']//div[@class='media']");
	
	

	public Sponsors(WebDriver driver) {
		super(driver);
		
	}
	
	public Sponsors verifySponsors(String userName,String password) throws InterruptedException{
		
//		Initiating LoginToAccount Class
		
		LoginToAccount login = new LoginToAccount(driver);
		
		login.commonLogin(userName, password);

		Thread.sleep(2000);
		
		System.out.println("Clicking on Menu Option ");

		waitForClickabilityOf(menuBtn);

		driver.findElement(menuBtn).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on My Agenda ");

		waitForClickabilityOf(agendaOption);

		driver.findElement(agendaOption).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Sponsors Option");

		waitForClickabilityOf(sponsors);

		driver.findElement(sponsors).click();
		
		Thread.sleep(2000);
		
//		Storing the Number of Sponsors Available

		waitForClickabilityOf(noOfSponsors);
		
		List<WebElement> NoOfExbtrs = driver.findElements(noOfSponsors);
		
		int Exbtrs = NoOfExbtrs.size();	
		
		System.out.println("No of Available Sponsors: "+Exbtrs);
		
		Thread.sleep(2000);
		
//		Getting Initial Sponsors Name
		
		String InitExbtrsNm = driver.findElement(initSponsorsName1).getText();
		
		Thread.sleep(2000);
		
//		Clicking On Sponsors

		System.out.println("Clicking on Sponsors Name "+InitExbtrsNm+" to Verify Details");

		waitForClickabilityOf(initSponsorsName1);

		driver.findElement(initSponsorsName1).click();
		
		Thread.sleep(2000);
		
//		Getting Sponsors Name
		
		String InitExbtrsNm1 = driver.findElement(sponsorsName).getText();
				
		Thread.sleep(2000);
		
		if (InitExbtrsNm1.equals(InitExbtrsNm)) {
			
			System.out.println("Clicked on right Sponsors");
			
		} else {
			
			System.out.println("Clickied on Wrong Sponsors");

		}
		
		Thread.sleep(2000);
		
//		Checking the Bookmark 
		
		try {
			
			boolean Bkmrk = driver.findElement(bookmarkSpnsr).isDisplayed();
			
			System.out.println(Bkmrk);
			
			if (Bkmrk==true) {
				
				System.out.println("Clicking On Bookmark to Add Bookmark");
				
				waitForClickabilityOf(bookmarkSpnsr);

				driver.findElement(bookmarkSpnsr).click();
				
			} else {

			}
			
		} catch (Exception e) {
			
			System.out.println("This Sponsors is Already Bookmarked");
			
		}
		
		Thread.sleep(2000);
		
		String Address = driver.findElement(spnsrAddress).getText();
		
		System.out.println("Current Sponsors Address :"+Address);
		
		Thread.sleep(2000);
		
		String Email = driver.findElement(spnsrEmail).getText();
		
		System.out.println("Current Sponsors Email :"+Email);
		
		Thread.sleep(2000);
		
		String Mobile = driver.findElement(spnsrPhone).getText();
		
		System.out.println("Current Sponsors Mobile No :"+Mobile);
		
//		Clicking On Expand to see No of Resources
		
		System.out.println("Clicking On Expand to see Resources");
		
		waitForClickabilityOf(spnsrResources);

		driver.findElement(spnsrResources).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking On Resource Category to see Resources");
		
		waitForClickabilityOf(resourcesCategory);

		driver.findElement(resourcesCategory).click();
		
		Thread.sleep(2000);
		
		boolean Resrs = driver.findElement(resourceData).isDisplayed();
		
		if (Resrs==true) {
			
			System.out.println("Resource Data is Visible Successfull");
			
		} else {
			
			System.out.println("There is No Resource Data");
			
		}
//		
//		System.out.println("Clicking On Website Icon");
//		
//		waitForClickabilityOf(spnsrWebsite);
//
//		driver.findElement(spnsrWebsite).click();
		
		
		return new Sponsors(driver);
	}

}
