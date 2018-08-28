package com.Live;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.BaseSetup.BaseSetUp;


public class PlayCenter extends BaseSetUp{
	
	By emailId = By.xpath("//*[@id='txtUsername']");
	
	By proceedBtn = By.xpath("//*[@id='spnLogin']");
	
	By pass = By.xpath("//*[@name='password_']");
	
	By signInBtn = By.xpath("//*[@id='spnPassword']");
	
	By menuBtn = By.xpath("//button[@id='open-button']");
	
	By liveOption = By.xpath("//*[@class='menu-group']//a[2]");
	
	By playCenter = By.xpath("//span[contains(text(),'Play Center')]");
	
	By locationMap = By.xpath("//div[@id='exhibitors-view']/div[1]");
	
	By enterCode = By.xpath("//textarea[@id='txtcode']");
	
	By btnSubmit = By.xpath("//input[@value='Submit']");
	
	By quizMap = By.xpath("//div[@id='exhibitors-view']/div[2]");
	
	By selectQuiz = By.xpath("//div[@class='track-list-hld sessionlistcontainer gami-qstnlist-hld']/ul/li[1]");
	
	By select1stOption = By.xpath("//ul[@class='gamiqstn-opt-hld']/li[1]");
	
	By select2ndOption = By.xpath("//ul[@class='gamiqstn-opt-hld']/li[2]");
	
	By submitBtn = By.xpath("//button[@id='btnSubmit']");
	
	By message = By.xpath("//h2[@class='text-congrats']");
	
	By radioBtnChkd = By.xpath("//i[@class='icon-pullright themeiconbg icon-gami-tick']");
	
	By submittedGame = By.xpath("//a[@class='cursor-dflt']");
	
	
	

	public PlayCenter(WebDriver driver) {
		super(driver);
		
	}
	
//	Common Login Method
	
	public void commonActivity(String userName,String password) throws InterruptedException{
		
		System.out.println("Entering Email id  is : "+userName);
		
		waitForClickabilityOf(emailId);
		
		driver.findElement(emailId).clear();
		
		driver.findElement(emailId).sendKeys(userName);
		
		Thread.sleep(1000);
		
		System.out.println("Clicking on Proceed Button");
		
		waitForClickabilityOf(proceedBtn);
		
		driver.findElement(proceedBtn).click();
		
		Thread.sleep(1000);
				
		System.out.println("Entering Password  is : "+password);
		
		waitForClickabilityOf(pass);
		
		driver.findElement(pass).clear();
		
		driver.findElement(pass).sendKeys(password);
		
		Thread.sleep(1000);
		
		System.out.println("Clicking on Sign in Button");
		
		waitForClickabilityOf(signInBtn);
		
		driver.findElement(signInBtn).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Menu Option ");

		waitForClickabilityOf(menuBtn);

		driver.findElement(menuBtn).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Live ");

		waitForClickabilityOf(liveOption);

		driver.findElement(liveOption).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Play Center ");

		waitForClickabilityOf(playCenter);

		driver.findElement(playCenter).click();
		
	}
	
//	Play Quiz Method 
	
	public PlayCenter quizMap(String userName,String password) throws InterruptedException{
		
		commonActivity(userName, password);
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Quiz Map");

		waitForClickabilityOf(quizMap);

		driver.findElement(quizMap).click();
		
		Thread.sleep(2000);
				
		System.out.println("Clicking on First Quiz");

		waitForClickabilityOf(selectQuiz);

		driver.findElement(selectQuiz).click();
		
		Thread.sleep(2000);
		
		System.out.println("Selecting the option");

		waitForClickabilityOf(select1stOption);

		driver.findElement(select1stOption).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Submit Button");

		waitForClickabilityOf(submitBtn);

		driver.findElement(submitBtn).click();
		
//      Verifying Condition 
		
		String ModuleStatus = driver.findElement(message).getText();
		
		if (ModuleStatus.equals(" Congratulations, you have answered correctly! You have earned 100 points! WOW")) {
			
			System.out.println("Successfully Verified the Quiz Map");
			
		} else {
			
			System.out.println("Failed to Verify the Quiz Map");

		}
			
		
		return new PlayCenter(driver);
		
	}
	
//	Location Map
	
	public PlayCenter locationMap(String userName,String password) throws InterruptedException{
		
		commonActivity(userName, password);
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Location Map");

		waitForClickabilityOf(locationMap);

		driver.findElement(locationMap).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on First Location");

		waitForClickabilityOf(selectQuiz);

		driver.findElement(selectQuiz).click();
		
		Thread.sleep(2000);
		
		System.out.println("Selecting the option");

		waitForClickabilityOf(enterCode);

		driver.findElement(enterCode).sendKeys("244182");
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Submit Button");

		waitForClickabilityOf(btnSubmit);

		driver.findElement(btnSubmit).click();
		
//      Verifying Condition 
		
		boolean ModuleStatus = driver.findElement(message).isDisplayed();
		
		if (ModuleStatus==true) {
			
			System.out.println("Successfully Verified the Location Map");
			
		} else {
			
			System.out.println("Failed to Verify the Location Map");

		}
				
		
		
		return new PlayCenter(driver);
		
	}

}
