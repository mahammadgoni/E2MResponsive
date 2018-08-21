package com.Live;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.BaseSetup.BaseSetUp;
import com.CommonActions.LoginToAccount;

public class PhotoWall extends BaseSetUp{
	
	
	By menuBtn = By.xpath("//button[@id='open-button']");
	
	By liveOption = By.xpath("//*[@class='menu-group']//a[2]");
	
	By photoWall = By.xpath("//span[contains(text(),'PhotoWall')]");
	
	By clickOnAddPhoto = By.xpath("//a[@class='icon ico-add-photo icon-bg open-add-photo']");
	
	By uploadPhoto = By.xpath("//input[@id='PhotowallImage']");
	
	By clickOnCategory = By.xpath("//div[@class='cs-select cs-skin-elastic']");
	
	By addCaption = By.xpath("//*[@id='txtTitle']");
	
	By submitBtn = By.xpath("//*[@id='btnAddTopic']");
	
	By selectUploadedImage = By.xpath("//div[@id='photowall']/div[1]");
	
	By clickOnLike = By.xpath("//*[@class='photowall-like']/a/span");
		
	By addComment = By.xpath("//*[@placeholder='Add a comment']");
	
	By postComment = By.xpath("//*[@id='postcommentbtn']");
	
	By postedComment = By.xpath("//div[@id='dvphotoCmnt']");
	
	

	public PhotoWall(WebDriver driver) {
		super(driver);
		
	}
	
	
	public PhotoWall photoUpload(String userName,String password,String PhotoPath,String Caption,String Comment) throws InterruptedException{
		
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
		
		System.out.println("Clicking on PhotoWall ");

		waitForClickabilityOf(photoWall);

		driver.findElement(photoWall).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Add Image Symbol");

		waitForClickabilityOf(clickOnAddPhoto);

		driver.findElement(clickOnAddPhoto).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Upload Photo Option");

		waitForClickabilityOf(uploadPhoto);

		driver.findElement(uploadPhoto).sendKeys(PhotoPath);
				
		Thread.sleep(2000);
		
		System.out.println("Clicking On All Category Drop Down");

		waitForClickabilityOf(clickOnCategory);

		driver.findElement(clickOnCategory).click();
		
		Thread.sleep(2000);
		
		System.out.println("Entering Caption for Image");

		waitForClickabilityOf(addCaption);

		driver.findElement(addCaption).sendKeys(Caption);
		
		Thread.sleep(2000);
		
		System.out.println("Clicking On Submit Button");

		waitForClickabilityOf(submitBtn);

		driver.findElement(submitBtn).click();
			
		Thread.sleep(4000);
		
		System.out.println("Selcting 1st Uploaded Image");

		waitForClickabilityOf(selectUploadedImage);

		driver.findElement(selectUploadedImage).click();
		
		Thread.sleep(2000);
		
		try {
			
			System.out.println("Clicking On Like button to Like the post");

			waitForClickabilityOf(clickOnLike);

			driver.findElement(clickOnLike).click();
			
		} catch (Exception e) {
			
		}
		
		Thread.sleep(2000);
		
		System.out.println("Adding Comment On Uploaded Image");

		waitForClickabilityOf(addComment);

		driver.findElement(addComment).sendKeys(Comment);
		
		Thread.sleep(2000);
		
		System.out.println("Posting the Comment");

		waitForClickabilityOf(postComment);

		driver.findElement(postComment).click();
		
		Thread.sleep(4000);
		
//		Getting the Added comment
		
		waitForClickabilityOf(postComment);
		
		boolean comment = driver.findElement(postComment).isDisplayed();
		
		Thread.sleep(2000);
				
		if (comment==true) {
			
			System.out.println("Successfully Uploaded the Photo");
			
		} else {
			
			System.out.println("Failed to Upload the Photo");

		}
		
		
		return new PhotoWall(driver);
	}

}
