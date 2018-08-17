package com.E2M.TestCases;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.CommonActions.LoginToAccount;
import com.Live.EventQA;
import com.Live.SocialWall;
import com.Utils.BrowserSetup;

public class E2MTestCases extends BrowserSetup{
	
	
//	 Browser Set Up Method
	
	@BeforeClass
	public void setUp() throws InterruptedException, InvalidFormatException, IOException {

		openBrowser();

	}

//	 Browser Close Method
	
	@AfterClass
	public void tearDown() {

		quitAllBrowser();

	}

//	 Logout Method
	
	@AfterMethod
	public void afterMethod() throws IOException, InvalidFormatException {

		logOut();

		methodSeparation();

	}
	
//	 Test Cases Methods

	 @Test(priority = 1,alwaysRun=true)
	 public void loginToAccountTest() throws InterruptedException, InvalidFormatException, IOException {
	
	 String EmailId = "brucewills@yopmail.com";
	
	 String Password = "#e2m321";
	
	 System.out.println("Executing : Login To Account Test");
	
	 new LoginToAccount(driver).loginToAccount(EmailId, Password);
	
	 }
	 
	 @Test(priority = 2,alwaysRun=true)
	 public void socialWallPostTest() throws InterruptedException, InvalidFormatException, IOException {
	
	 String EmailId = "brucewills@yopmail.com";
	
	 String Password = "#e2m321";
	
	 System.out.println("Executing : Social Wall Post Test");
	
	 new SocialWall(driver).socialWall(EmailId, Password, "Load Testing Base");
	
	 }
	 
	 @Test(priority = 3,alwaysRun=true)
	 public void eventQAPostTest() throws InterruptedException, InvalidFormatException, IOException {
	
	 String EmailId = "brucewills@yopmail.com";
	
	 String Password = "#e2m321";
	
	 System.out.println("Executing : Event QA Post Test");
	
	 new EventQA(driver).eventQA(EmailId, Password, "Event Load Testing Base");
	
	 }
	
	

}
