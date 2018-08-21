package com.Live;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.BaseSetup.BaseSetUp;
import com.CommonActions.LoginToAccount;

public class VideoWall extends BaseSetUp{
	
	
	By menuBtn = By.xpath("//button[@id='open-button']");
	
	By liveOption = By.xpath("//*[@class='menu-group']//a[2]");
	
	By videoWall = By.xpath("//span[contains(text(),'VideoWall')]");
	
	By clickOnAddVideo = By.xpath("//a[@class='icon ico-video icon-bg open-add-photo']");
	
	By uploadVideo = By.xpath("//*[@id='Videowall']");
	
	By clickOnCategory = By.xpath("//div[@class='cs-select cs-skin-elastic']");
	
	By addCaption = By.xpath("//*[@id='txtTitle']");
	
	By submitBtn = By.xpath("//*[@id='btnAddTopic']");
	
	By selectUploadedVideo = By.xpath("//div[@id='photowall']/div/div[1]");
	

	public VideoWall(WebDriver driver) {
		super(driver);
		
	}
	
	public VideoWall videoUpload(String userName,String password,String VideoPath,String Caption) throws InterruptedException{
		
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
		
		System.out.println("Clicking on VideoWall ");

		waitForClickabilityOf(videoWall);

		driver.findElement(videoWall).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Add Video Symbol");

		waitForClickabilityOf(clickOnAddVideo);

		driver.findElement(clickOnAddVideo).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Upload Video Option");

		waitForClickabilityOf(uploadVideo);

		driver.findElement(uploadVideo).sendKeys(VideoPath);
				
		Thread.sleep(2000);
		
		System.out.println("Clicking On All Category Drop Down");

		waitForClickabilityOf(clickOnCategory);

		driver.findElement(clickOnCategory).click();
		
		Thread.sleep(2000);
		
		System.out.println("Entering Caption for Video");

		waitForClickabilityOf(addCaption);

		driver.findElement(addCaption).sendKeys(Caption);
		
		Thread.sleep(2000);
		
		System.out.println("Clicking On Submit Button");

		waitForClickabilityOf(submitBtn);

		driver.findElement(submitBtn).click();
			
		Thread.sleep(4000);
		
		System.out.println("Selecting the Uploaded Video");

		waitForClickabilityOf(selectUploadedVideo);

		driver.findElement(selectUploadedVideo).click();
		
		Thread.sleep(4000);
		
		System.out.println("Verifying the Uploaded Video");

		waitForClickabilityOf(By.xpath("//h2[contains(text(),'"+Caption+"')]"));

		String VideoText = driver.findElement(By.xpath("//h2[contains(text(),'"+Caption+"')]")).getText();
		
		Thread.sleep(4000);
		
		if (VideoText.equals(Caption)) {
			
			System.out.println("Successfully Uploaded the Video");
			
		} else {
			
			System.out.println("Failed to Upload the Video");

		}
		
		
		
		
		return new VideoWall(driver);
		
	}

}
