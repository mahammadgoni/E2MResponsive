package com.E2M.TestCases;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Agenda.Survey;
import com.CommonActions.LoginToAccount;
import com.Live.Attendees;
import com.Live.EventQA;
import com.Live.OneToOneMessage;
import com.Live.PhotoWall;
import com.Live.PlayCenter;
import com.Live.SocialWall;
import com.Live.VideoWall;
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

//	 @Test(priority = 1,alwaysRun=true)
//	 public void loginToAccountTest() throws InterruptedException, InvalidFormatException, IOException {
//	
//	 String EmailId = "brucewills@yopmail.com";
//	
//	 String Password = "#e2m321";
//	
//	 System.out.println("Executing : Login To Account Test");
//	
//	 new LoginToAccount(driver).loginToAccount(EmailId, Password);
//	
//	 }
//	 
//	 @Test(priority = 2,alwaysRun=true)
//	 public void socialWallPostTest() throws InterruptedException, InvalidFormatException, IOException {
//	
//	 String EmailId = "brucewills@yopmail.com";
//	
//	 String Password = "#e2m321";
//	
//	 System.out.println("Executing : Social Wall Post Test");
//	
//	 new SocialWall(driver).socialWall(EmailId, Password, "Load Testing Base");
//	
//	 }
//	 
//	 @Test(priority = 3,alwaysRun=true)
//	 public void eventQAPostTest() throws InterruptedException, InvalidFormatException, IOException {
//	
//	 String EmailId = "brucewills@yopmail.com";
//	
//	 String Password = "#e2m321";
//	
//	 System.out.println("Executing : Event QA Post Test");
//	
//	 new EventQA(driver).eventQA(EmailId, Password, "Event Load Testing Base");
//	
//	 }
//	 
//	 @Test(priority = 4,alwaysRun=true)
//	 public void oneToOneMessageTest() throws InterruptedException, InvalidFormatException, IOException {
//	
//	 String EmailId = "brucewills@yopmail.com";
//	
//	 String Password = "#e2m321";
//	
//	 System.out.println("Executing : One To One Message Test");
//	
//	 new OneToOneMessage(driver).oneToOneMsg(EmailId, Password, "Event Load Testing Base");
//	
//	 }
//	 
//	 @Test(priority = 5,alwaysRun=true)
//	 public void photoWallTest() throws InterruptedException, InvalidFormatException, IOException {
//	
//	 String EmailId = "brucewills@yopmail.com";
//	
//	 String Password = "#e2m321";
//	
//	 System.out.println("Executing : Photo Wall Test");
//	
//	 new PhotoWall(driver).photoUpload(EmailId, Password,home+"/Test Data/PhotoWall.jpg", "Responsive Photo Wall Test","This is Bullet, New Classic");
//	
//	 }
//	 
//	 @Test(priority = 6,alwaysRun=true)
//	 public void videoWallTest() throws InterruptedException, InvalidFormatException, IOException {
//	
//	 String EmailId = "brucewills@yopmail.com";
//	
//	 String Password = "#e2m321";
//	
//	 System.out.println("Executing : Video Wall Test");
//	
//	 new VideoWall(driver).videoUpload(EmailId, Password,home+"/Test Data/VideoWall.mp4", "Responsive Video Wall Test");
//	
//	 }
//	 
//	 @Test(priority = 7,alwaysRun=true)
//	 public void attendeeDetailsTest() throws InterruptedException, InvalidFormatException, IOException {
//	
//	 String EmailId = "brucewills@yopmail.com";
//	
//	 String Password = "#e2m321";
//	
//	 System.out.println("Executing : Attendee Details Test");
//	
//	 new Attendees(driver).attendeeDetails(EmailId, Password, "Responsive Attendee Details Test");
//	
//	 }
//	  
//	 @Test(priority = 8,alwaysRun=true)
//	 public void dropdownPollTest() throws InterruptedException, InvalidFormatException, IOException {
//	
//	 String EmailId = "brucewills@yopmail.com";
//	
//	 String Password = "#e2m321";
//	
//	 System.out.println("Executing : Drop Down Poll Test");
//	
//	 new Survey(driver).dropdownPoll(EmailId, Password);
//	
//	 }
//	 
//	 @Test(priority = 9,alwaysRun=true)
//	 public void freeTextPollTest() throws InterruptedException, InvalidFormatException, IOException {
//	
//	 String EmailId = "brucewills@yopmail.com";
//	
//	 String Password = "#e2m321";
//	
//	 System.out.println("Executing : Free Text Poll Test");
//	
//	 new Survey(driver).freeTextPoll(EmailId, Password);
//	
//	 }
//	 
//	 @Test(priority = 10,alwaysRun=true)
//	 public void multiplePollTest() throws InterruptedException, InvalidFormatException, IOException {
//	
//	 String EmailId = "brucewills@yopmail.com";
//	
//	 String Password = "#e2m321";
//	
//	 System.out.println("Executing : Multiple Choice Poll Test");
//	
//	 new Survey(driver).multiplePoll(EmailId, Password);
//	
//	 }
//	 
//	 @Test(priority = 11,alwaysRun=true)
//	 public void singlePollTest() throws InterruptedException, InvalidFormatException, IOException {
//	
//	 String EmailId = "brucewills@yopmail.com";
//	
//	 String Password = "#e2m321";
//	
//	 System.out.println("Executing : Single Poll Test");
//	
//	 new Survey(driver).singlePoll(EmailId, Password);
//	
//	 }
	 
	 @Test(priority = 12,alwaysRun=true)
	 public void quizMapTest() throws InterruptedException, InvalidFormatException, IOException {
	
	 String EmailId = "brucewills@yopmail.com";
	
	 String Password = "#e2m321";
	
	 System.out.println("Executing : Quiz Map Test");
	
	 new PlayCenter(driver).quizMap(EmailId, Password);
	
	 }
	 
	 @Test(priority = 13,alwaysRun=true)
	 public void locationMapTest() throws InterruptedException, InvalidFormatException, IOException {
	
	 String EmailId = "brucewills@yopmail.com";
	
	 String Password = "#e2m321";
	
	 System.out.println("Executing : Location Map Test");
	
	 new PlayCenter(driver).locationMap(EmailId, Password);
	
	 }
	
	

}
