package com.Live;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.BaseSetup.BaseSetUp;

public class SocialWall extends BaseSetUp{
	
	By emailId = By.xpath("//*[@id='txtUsername']");
	
	By proceedBtn = By.xpath("//*[@id='spnLogin']");
	
	By pass = By.xpath("//*[@name='password_']");
	
	By signInBtn = By.xpath("//*[@id='spnPassword']");
	
	By menuBtn = By.xpath("//button[@id='open-button']");
	
	By liveOption = By.xpath("//*[@class='menu-group']//a[2]");
	
	By socialWall = By.xpath("//span[contains(text(),'Social Wall')]");
	
	By enterComment = By.xpath("//textarea[@id='txtTitle']");
	
	By postComment = By.xpath("//*[@id='btnAddTopic']");
	
	By postedComment = By.xpath("//article[@class='white-panel item r1 list-blog-item c0']//p//span[1]");
	

	public SocialWall(WebDriver driver) {
		super(driver);

	}
	
	
	public SocialWall socialWall(String userName,String password,String Comment) throws InterruptedException{
		
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
		
		System.out.println("Clicking on Menu to Expand Options");
		
		waitForClickabilityOf(menuBtn);

		driver.findElement(menuBtn).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Live Option");
		
		waitForClickabilityOf(liveOption);

		driver.findElement(liveOption).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Social Wall");
		
		waitForClickabilityOf(socialWall);

		driver.findElement(socialWall).click();
				
		Thread.sleep(2000);
		
		System.out.println("Entering Status Comment "+Comment);
		
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
