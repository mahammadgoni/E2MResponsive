package com.Me;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.BaseSetup.BaseSetUp;
import com.CommonActions.LoginToAccount;

public class MyProfile extends BaseSetUp{
	
	
	By menuBtn = By.xpath("//button[@id='open-button']");
	
	By meOption = By.xpath("//*[@class='menu-group']//a[3]");
	
	By myProfile = By.xpath("//*[contains(text(),'My Profile')]");
	
	By general = By.xpath("//a[@href='/Account/UpdateUserPersonalInfo']");
	
	By tag = By.xpath("//a[@href='/Account/UpdateTag']");
	
	By clickOnEdit = By.xpath("//a[@class='mobile-edit icon icon-bg icon-edit-myprofile']");
	
	By addMorePhoto = By.xpath("//figure[@class='addmore-icon-hld tbl-group']");
	
	By firstName = By.xpath("//*[@id='FirstName']");
	
	By lastName = By.xpath("//*[@id='LastName']");
	
	By jobTitle = By.xpath("//*[@id='Designation']");
	
	By company = By.xpath("//*[@id='Company']");
	
	By contactNo = By.xpath("//*[@id='ContactNumber']");
	
	By profileCheckBox = By.xpath("//*[@id='mCSB_2_container']//div[@class='skin ckbox ckbox-theme']");
	
	By updateInfoBtn = By.xpath("//*[@id='btnSubmit']");
	

	public MyProfile(WebDriver driver) {
		super(driver);
		
	}
	
//	Update User Details 
	
	public MyProfile updateDetails(String userName,String password,String JobTitle,String CompanyName) throws InterruptedException{
		
//		Initiating LoginToAccount Class
		
		LoginToAccount login = new LoginToAccount(driver);
		
		login.commonLogin(userName, password);
				
		Thread.sleep(2000);
		
		System.out.println("Clicking on Menu Option ");

		waitForClickabilityOf(menuBtn);

		driver.findElement(menuBtn).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Me ");

		waitForClickabilityOf(meOption);

		driver.findElement(meOption).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on My Profile ");

		waitForClickabilityOf(myProfile);

		driver.findElement(myProfile).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Edit to Update User Info ");

		waitForClickabilityOf(clickOnEdit);

		driver.findElement(clickOnEdit).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Tag Tab");

		waitForClickabilityOf(tag);

		driver.findElement(tag).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Profle Check Box ");

		waitForClickabilityOf(profileCheckBox);
		
		Thread.sleep(2000);
		
		boolean checkBox = driver.findElement(profileCheckBox).isSelected();
		
		Thread.sleep(2000);
		
		if (checkBox==true) {
			
			System.out.println("Profle Check Box is Already Selected");
			
		} else {
			
			System.out.println("Selecting Profle Check Box");
			
			driver.findElement(profileCheckBox).click();

		}
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on General Tab ");

		waitForClickabilityOf(general);

		driver.findElement(general).click();
		
		Thread.sleep(2000);
		
		System.out.println("Entering New Job Tile :"+JobTitle);

		waitForClickabilityOf(jobTitle);
		
		String OldJobTitle = driver.findElement(jobTitle).getText();
		
		System.out.println("Old Job Title : "+OldJobTitle);
		
		Thread.sleep(2000);
		
		driver.findElement(jobTitle).clear();
		
		Thread.sleep(2000);

		driver.findElement(jobTitle).sendKeys(JobTitle);
		
		Thread.sleep(2000);
		
		System.out.println("Entering New Company Name :"+CompanyName);

		waitForClickabilityOf(company);
		
		String OldCompanyName = driver.findElement(company).getText();
		
		Thread.sleep(2000);
		
		driver.findElement(company).clear();
		
		Thread.sleep(2000);

		driver.findElement(company).sendKeys(CompanyName);
				
		Thread.sleep(2000);
		
		System.out.println("Clicking on Update Button to Submit Details ");

		waitForClickabilityOf(updateInfoBtn);

		driver.findElement(updateInfoBtn).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Edit to Verify Details");

		waitForClickabilityOf(clickOnEdit);

		driver.findElement(clickOnEdit).click();
		
		Thread.sleep(2000);
		
		System.out.println("Getting the new Job Title");

		waitForClickabilityOf(jobTitle);
		
		String NewJobTitle = driver.findElement(jobTitle).getText();
		
		System.out.println("New Job Title : "+NewJobTitle);
		
		Thread.sleep(2000);
		
		if (OldJobTitle.equals(NewJobTitle)) {
			
			System.out.println("Failed to Update Job Title");
			
		} else {
			
			System.out.println("Successfully Updated Job Title");

		}
				
		Thread.sleep(2000);
		
		System.out.println("Getting the New Company Name ");

		waitForClickabilityOf(company);
		
		String NewCompanyName = driver.findElement(company).getText();
		
		Thread.sleep(2000);
		
		if (OldCompanyName.equals(NewCompanyName)) {
			
			System.out.println("Successfully Updated Company Name");
			
		} else {
			
			System.out.println("Failed to Update Company Name");

		}
				
		
		
		return new MyProfile(driver);
	}

}
