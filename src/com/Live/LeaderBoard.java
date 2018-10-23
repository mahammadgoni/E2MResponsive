package com.Live;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.BaseSetup.BaseSetUp;
import com.CommonActions.LoginToAccount;

public class LeaderBoard extends BaseSetUp{
	
	By menuBtn = By.xpath("//button[@id='open-button']");
	
	By liveOption = By.xpath("//*[@class='menu-group']//a[2]");
	
	By leaderBoard = By.xpath("//span[contains(text(),'Leaderboard')]");
	
	By userTab = By.xpath("//a[@href='/LeaderBoard/Index']");
	
	By user1stPoint = By.xpath("//ul[@class='row']//li[1]//div[1]//div[2]//p[1]");
	
	By groupTab = By.xpath("//a[@href='/LeaderBoard/Group']");
	
	By group1stPoint = By.xpath("//ul[@class='row']//li[1]//div[1]//div[2]//p[1]");
	
	By myAchieveTab = By.xpath("//a[@href='/LeaderBoard/Myachievement']");
	
	By myPoints = By.xpath("//ul[@class='points-hld']//li[1]/span");
	

	
	

	public LeaderBoard(WebDriver driver) {
		super(driver);
		
	}
	
//  Leader Board Method
	
	public LeaderBoard leaderBoardPoints(String userName,String password) throws InterruptedException,NumberFormatException{
		
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
		
		System.out.println("Clicking on Leader Board ");

		waitForClickabilityOf(leaderBoard);

		driver.findElement(leaderBoard).click();
		
		Thread.sleep(2000);
		
		String UserPoints = driver.findElement(user1stPoint).getText();
		
		int Up = Integer.parseInt(UserPoints.replaceAll("[^0-9]", ""));
		
		System.out.println("Total User Score is  "+Up);
		
		Thread.sleep(2000);
		
		System.out.println("Clicking On Group Tab");

		waitForClickabilityOf(groupTab);

		driver.findElement(groupTab).click();
		
		Thread.sleep(2000);
		
		String GroupPoints = driver.findElement(group1stPoint).getText();
		
		System.out.println("Total Group Score is  "+GroupPoints);
		
		Thread.sleep(2000);
		
		System.out.println("Clicking On My Achievements Tab");

		waitForClickabilityOf(myAchieveTab);

		driver.findElement(myAchieveTab).click();
		
		Thread.sleep(2000);
		
		String UserScore = driver.findElement(myPoints).getText();
		
		int Up1 = Integer.parseInt(UserScore.replaceAll("[^0-9]", ""));
		
		System.out.println("Total User Score is  "+Up1);
		
		Thread.sleep(2000);
		
		if (Up==Up1) {
			
			System.out.println("Successfully Verified Leader Board");
			
		} else {
			
			System.out.println("Failed to Verify Leader Board");

		}
		
		
		
		
		return new LeaderBoard(driver);
		
	}

}
