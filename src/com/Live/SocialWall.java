package com.Live;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.BaseSetup.BaseSetUp;

public class SocialWall extends BaseSetUp{
	
	
	By emailId = By.id("txtUsername");
	
	By pass = By.xpath("//*[@placeholder='Enter Password']");
	
	By proceedBtn1 = By.xpath("//a[@id='spnLogin']//span[contains(text(),'Proceed')]");
	
	By proceedBtn2 = By.xpath("//*[@id='spnPassword']");
	
	By liveOption = By.xpath("//div[@class='menu-group']//a[2]");
	
	By menu = By.xpath("//*[@id='open-button']");
	
	By socialWall = By.xpath("//span[contains(text(),'Social Wall')]");
	
	By enterComment = By.xpath("//textarea[@id='txtTitle']");
	
	By postComment = By.xpath("//*[@id='btnAddTopic']");
	
	By postedComment = By.xpath("//article[@class='white-panel item r1 list-blog-item c0']//p//span[1]");
	

	public SocialWall(WebDriver driver) {
		super(driver);

	}
	
//	This Login Method will perform Login actions,Just need to call it in Method
	
	public void Login(String userName,String password) throws InterruptedException{
		
		System.out.println("Clicking on Your Email ");

		waitForClickabilityOf(emailId);

		driver.findElement(emailId).clear();

		System.out.println("Entering the Email  :" + userName);

		driver.findElement(emailId).sendKeys(userName);
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Proceed Button ");

		waitForClickabilityOf(proceedBtn1);

		driver.findElement(proceedBtn1).click();
		
		Thread.sleep(2000);

		System.out.println("Entering the Pin  :" + password);

		waitForClickabilityOf(pass);
		
		driver.findElement(pass).clear();

		driver.findElement(pass).sendKeys(password);
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Proceed Button ");

		waitForClickabilityOf(proceedBtn2);

		driver.findElement(proceedBtn2).click();
		
	}
	
	public SocialWall socialWall(String userName,String password,String Comment) throws InterruptedException{
		
		Login(userName, password);
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Menu to Expand Options");
		
		waitForClickabilityOf(menu);

		driver.findElement(menu).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Live Option");
		
		waitForClickabilityOf(liveOption);

		driver.findElement(liveOption).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Social Wall");
		
		waitForClickabilityOf(socialWall);

		driver.findElement(socialWall).click();
				
		Thread.sleep(2000);
		
		System.out.println("Entering Status Comment"+Comment);
		
		waitForClickabilityOf(enterComment);

		driver.findElement(enterComment).sendKeys(Comment);
		
		Thread.sleep(2000);
		
		System.out.println("Clicking On Submit to Add  Status Comment");
		
		waitForClickabilityOf(postComment);

		driver.findElement(postComment).click();
		
		Thread.sleep(4000);
		
		waitForClickabilityOf(postedComment);
		
		String PostedComment = driver.findElement(postedComment).getText();
		
		Thread.sleep(2000);
			
		if (Comment.equals(PostedComment)) {
			
			System.out.println("Successfully Posted the Comment");
			
		} else {
			
			System.out.println("Failed to Post the Comment");

		}
	
		
		return new SocialWall(driver);
		
	}
	

}
