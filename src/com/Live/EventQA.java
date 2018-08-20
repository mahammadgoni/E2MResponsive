package com.Live;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.BaseSetup.BaseSetUp;
import com.CommonActions.LoginToAccount;

public class EventQA extends BaseSetUp{
	
	
	By menuBtn = By.xpath("//button[@id='open-button']");
	
//	Event QA Elements
	
	By liveOption = By.xpath("//*[@class='menu-group']//a[2]");
	
	By socialWall = By.xpath("//span[contains(text(),'Social Wall')]");
	
	By clickOnEventQA = By.xpath("//span[contains(text(),'Event QA')]");
	
	By typeAQuestion = By.xpath("//textarea[@id='txtQuestion']");
	
	By btnSubmit = By.xpath("//*[@id='btnQuestionPost']");
	

	public EventQA(WebDriver driver) {
		super(driver);

	}
	
	
	public EventQA eventQA(String userName,String password,String Question) throws InterruptedException{
		
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
		
		System.out.println("Clicking on Event QA");

		waitForClickabilityOf(clickOnEventQA);

		driver.findElement(clickOnEventQA).click();
				
		Thread.sleep(2000);
		
		System.out.println("Entering the Question");

		waitForClickabilityOf(typeAQuestion);

		driver.findElement(typeAQuestion).clear();
		
		driver.findElement(typeAQuestion).sendKeys(Question);
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Submit Button");

		waitForClickabilityOf(btnSubmit);

		driver.findElement(btnSubmit).click();
		
		Thread.sleep(2000);
		
		System.out.println("Successfully Posted the Question");
		
		
		
		return new EventQA(driver);
	}

}
