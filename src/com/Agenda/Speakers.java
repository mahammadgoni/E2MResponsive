package com.Agenda;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.BaseSetup.BaseSetUp;
import com.CommonActions.LoginToAccount;

public class Speakers extends BaseSetUp{
	
	
	By menuBtn = By.xpath("//button[@id='open-button']");
	
	By agendaOption = By.xpath("//*[@class='menu-group']//a[1]");
	
	By speakers = By.xpath("//span[contains(text(),'Speakers')]");
	
	By noOfSpeakers = By.xpath("//div[@id='speaker-view']/div");
	
	By initSpeakerName1 = By.xpath("//div[@id='speaker-view']/div[1]/a[2]/div/div");
	
	By initSpeakerName2 = By.xpath("//div[@id='speaker-view']/div[2]/a[2]/div/div");
	
	By speaker1 = By.xpath("//div[@id='speaker-view']/div[1]");
	
	By speaker2 = By.xpath("//div[@id='speaker-view']/div[2]");
	
	By speakerName = By.xpath("//div[@class='right-attendence-hld']");
	
	By bookmarkSpkr = By.xpath("//*[@class='no-bookmark']");
	
	By unBookmarkSpkr = By.xpath("//*[@class='no-bookmark add-bookmark']");
	
	By speakerSessions = By.xpath("//div[@class='white-block']//div[@class='ac-header-hld clearfix']");	
	
	By noOfSession = By.xpath("//div[@id='session-panel1']/div");
	
	By speakerResources = By.xpath("//a[@class='collapsed spk-resouce-hdr']");
	
	By resourcesCategory = By.xpath("//li[@id='lipanel1']//div[@class='ac-header-hld clearfix']");
	
	By resourceData = By.xpath("//div[@id='collapseOne1']//div[@class='media']");
	

	public Speakers(WebDriver driver) {
		super(driver);
		
	}
	
//	Speakers Method
	
	public Speakers verifySpeakers(String userName,String password) throws InterruptedException{
		
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
		
		System.out.println("Clicking on Speakers Option");

		waitForClickabilityOf(speakers);

		driver.findElement(speakers).click();
		
		Thread.sleep(2000);
		
//		Storing the Number of Speakers Available

		waitForClickabilityOf(noOfSpeakers);
		
		List<WebElement> NoOfSpkrs = driver.findElements(noOfSpeakers);
		
		int Spkrs = NoOfSpkrs.size();	
		
		System.out.println("No of Available Speakers: "+Spkrs);
		
		Thread.sleep(2000);
		
//		Getting Initial Speakers Name
		
		String InitSpkrsNm = driver.findElement(initSpeakerName1).getText();
		
		Thread.sleep(2000);
		
//		Clicking On Speaker

		System.out.println("Clicking on Speakers Name "+InitSpkrsNm+" to Verify Details");

		waitForClickabilityOf(initSpeakerName1);

		driver.findElement(initSpeakerName1).click();
		
		Thread.sleep(2000);
		
//		Getting Speakers Name
		
		String InitSpkrsNm1 = driver.findElement(speakerName).getText();
				
		Thread.sleep(2000);
		
		if (InitSpkrsNm1.equals(InitSpkrsNm)) {
			
			System.out.println("Clicked on right Speakers");
			
		} else {
			
			System.out.println("Clickied on Wrong Speakers");

		}
		
		Thread.sleep(2000);
		
//		Checking the Bookmark 
		
		try {
			
			boolean Bkmrk = driver.findElement(bookmarkSpkr).isDisplayed();
			
			System.out.println(Bkmrk);
			
			if (Bkmrk==true) {
				
				System.out.println("Clicking On Bookmark to Add Bookmark");
				
				waitForClickabilityOf(bookmarkSpkr);

				driver.findElement(bookmarkSpkr).click();
				
			} else {

			}
			
		} catch (Exception e) {
			
			System.out.println("This Speaker is Already Bookmarked");
			
		}
		

		
		Thread.sleep(2000);
		
//		Clicking On Expand to see No of Session
		
		System.out.println("Clicking On Expand to see No of Sessions");
		
		waitForClickabilityOf(speakerSessions);

		driver.findElement(speakerSessions).click();
		
		Thread.sleep(2000);
		
//		Storing the Number of Session Mapped

		waitForClickabilityOf(noOfSession);
		
		List<WebElement> NoOfSesns = driver.findElements(noOfSession);
		
		int Sesns = NoOfSesns.size();
		
		System.out.println("No Of Sessions are Mapped with Speakers : "+Sesns);
		
		Thread.sleep(2000);
		
//		Clicking On Expand to see No of Resources
		
		System.out.println("Clicking On Expand to see Resources");
		
		waitForClickabilityOf(speakerResources);

		driver.findElement(speakerResources).click();
		
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
	
		
		
		
		return new Speakers(driver);
		
	}

}
