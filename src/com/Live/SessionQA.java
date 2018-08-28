package com.Live;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.BaseSetup.BaseSetUp;

public class SessionQA extends BaseSetUp{
	
	
	
	By emailId = By.xpath("//*[@id='txtUsername']");
	
	By proceedBtn = By.xpath("//*[@id='spnLogin']");
	
	By pass = By.xpath("//*[@name='password_']");
	
	By signInBtn = By.xpath("//*[@id='spnPassword']");
	
	By menuBtn = By.xpath("//button[@id='open-button']");
	
	By liveOption = By.xpath("//*[@class='menu-group']//a[2]");
	
	By sessionQA = By.xpath("//span[contains(text(),'Session QA')]");
	
	By select1stSession = By.xpath("//div[@class='accordion-hld sessionlistcontainer']//ul[1]/li[1]");
	
	By clickOnGeneral = By.xpath("//ul[@class='accordion']");
	
	By typeYourQuestion = By.xpath("//div[@class='cstm-input-group input-group full-txtarea']//textarea[@id='txtQuestion']");
	
	By submitBtn = By.xpath("//*[@id='btnQuestionPost']");

	
	

	public SessionQA(WebDriver driver) {
		super(driver);
		
	}
	
	public SessionQA sessioQA(String userName,String password,String SessionQA) throws InterruptedException{
		
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
		
		Thread.sleep(1000);
		
		System.out.println("Clicking on Menu Option ");

		waitForClickabilityOf(menuBtn);

		driver.findElement(menuBtn).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Live ");

		waitForClickabilityOf(liveOption);

		driver.findElement(liveOption).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Session QA");

		waitForClickabilityOf(sessionQA);

		driver.findElement(sessionQA).click();
				
		Thread.sleep(2000);
		
		System.out.println("Selecting the Session");

		waitForClickabilityOf(select1stSession);

		driver.findElement(select1stSession).click();
				
		Thread.sleep(2000);
		
		System.out.println("Clicking On General to ask the Question");

		waitForClickabilityOf(clickOnGeneral);

		driver.findElement(clickOnGeneral).click();
				
		Thread.sleep(2000);
		
		System.out.println("Entering the Question for this Session?");

		waitForClickabilityOf(typeYourQuestion);

		driver.findElement(typeYourQuestion).sendKeys(SessionQA);
				
		Thread.sleep(2000);
		
		System.out.println("Clicking On Submit Button to Submit the Question ");

		waitForClickabilityOf(submitBtn);

		driver.findElement(submitBtn).click();

		Thread.sleep(2000);
		
		System.out.println("Successfully Submitted the Question");
		
		
		
		return new SessionQA(driver);
	}

}
