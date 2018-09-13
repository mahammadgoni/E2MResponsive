package com.Agenda;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.BaseSetup.BaseSetUp;
import com.CommonActions.LoginToAccount;

public class Exhibitors extends BaseSetUp{
	
	
	By menuBtn = By.xpath("//button[@id='open-button']");
	
	By agendaOption = By.xpath("//*[@class='menu-group']//a[1]");
	
	By exhibitors = By.xpath("//span[contains(text(),'Exhibitors')]");
	
	By noOfExhibitors = By.xpath("//div[@id='exhibitors-view']/div/div");
	
	By initExhibitorName1 = By.xpath("//div[@id='exhibitors-view']/div/div[1]/a[2]/div/div/h3");
	
	By initExhibitorName2 = By.xpath("//div[@id='exhibitors-view']/div/div[2]/a/div/div/h3");
	
	By exhibitor1 = By.xpath("//div[@id='exhibitors-view']/div/div[1]");
	
	By exhibitor2 = By.xpath("//div[@id='exhibitors-view']/div/div[2]");
	
	By exhibitorName = By.xpath("//div[@class='right-attendence-hld']/h2");
	
	By bookmarkExbtr = By.xpath("//*[@class='no-bookmark']");
	
	By unBookmarkExbtr = By.xpath("//*[@class='no-bookmark add-bookmark']");
	
	By exbtrWebsite = By.xpath("//i[@class='icon-web']");
	
	By exbtrAddress = By.xpath("//ul[@class='exhi-contlist-hld']/li[1]/span");
	
	By exbtrEmail = By.xpath("//ul[@class='exhi-contlist-hld']/li[2]/span");
	
	By exbtrPhone = By.xpath("//ul[@class='exhi-contlist-hld']/li[3]/span");
	
	By exbtrResources = By.xpath("//div[@id='accordion-hld']");
	
	By resourcesCategory = By.xpath("//li[@id='lipanel1']//div[@class='ac-header-hld clearfix']");
	
	By resourceData = By.xpath("//div[@id='collapseOne1']//div[@class='media']");
	
	

	public Exhibitors(WebDriver driver) {
		super(driver);
		
	}
	
//	Exhibitors Method
	
	public Exhibitors verifyExhibitors(String userName,String password) throws InterruptedException{
		
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
		
		System.out.println("Clicking on Exhibitors Option");

		waitForClickabilityOf(exhibitors);

		driver.findElement(exhibitors).click();
		
		Thread.sleep(2000);
		
//		Storing the Number of Exhibitors Available

		waitForClickabilityOf(noOfExhibitors);
		
		List<WebElement> NoOfExbtrs = driver.findElements(noOfExhibitors);
		
		int Exbtrs = NoOfExbtrs.size();	
		
		System.out.println("No of Available Exhibitors: "+Exbtrs);
		
		Thread.sleep(2000);
		
//		Getting Initial Exhibitors Name
		
		String InitExbtrsNm = driver.findElement(initExhibitorName1).getText();
		
		Thread.sleep(2000);
		
//		Clicking On Exhibitors

		System.out.println("Clicking on Exhibitors Name "+InitExbtrsNm+" to Verify Details");

		waitForClickabilityOf(initExhibitorName1);

		driver.findElement(initExhibitorName1).click();
		
		Thread.sleep(2000);
		
//		Getting Speakers Name
		
		String InitExbtrsNm1 = driver.findElement(exhibitorName).getText();
				
		Thread.sleep(2000);
		
		if (InitExbtrsNm1.equals(InitExbtrsNm)) {
			
			System.out.println("Clicked on right Exhibitors");
			
		} else {
			
			System.out.println("Clickied on Wrong Exhibitors");

		}
		
		Thread.sleep(2000);
		
//		Checking the Bookmark 
		
		try {
			
			boolean Bkmrk = driver.findElement(bookmarkExbtr).isDisplayed();
			
			System.out.println(Bkmrk);
			
			if (Bkmrk==true) {
				
				System.out.println("Clicking On Bookmark to Add Bookmark");
				
				waitForClickabilityOf(bookmarkExbtr);

				driver.findElement(bookmarkExbtr).click();
				
			} else {

			}
			
		} catch (Exception e) {
			
			System.out.println("This Exhibitor is Already Bookmarked");
			
		}
		
//		Thread.sleep(2000);
//		
//		System.out.println("Clicking On Website Icon");
//		
//		waitForClickabilityOf(exbtrWebsite);
//
//		driver.findElement(exbtrWebsite).click();
//		
//		Thread.sleep(2000);
//		
//		System.out.println("Closing this Website");
//
//		driver.close();
		
		Thread.sleep(2000);
		
		String Address = driver.findElement(exbtrAddress).getText();
		
		System.out.println("Current Exhibitor Address :"+Address);
		
		Thread.sleep(2000);
		
		String Email = driver.findElement(exbtrEmail).getText();
		
		System.out.println("Current Exhibitor Email :"+Email);
		
		Thread.sleep(2000);
		
		String Mobile = driver.findElement(exbtrPhone).getText();
		
		System.out.println("Current Exhibitor Mobile No :"+Mobile);
	
		Thread.sleep(2000);
		
//		Clicking On Expand to see No of Resources
		
		System.out.println("Clicking On Expand to see Resources");
		
		waitForClickabilityOf(exbtrResources);

		driver.findElement(exbtrResources).click();
		
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
		
		Thread.sleep(2000);
		
			
		return new Exhibitors(driver);
	}

}
