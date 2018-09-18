package com.E2M.TestCases;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Agenda.Exhibitors;
import com.Agenda.Schedule;
import com.Agenda.Speakers;
import com.Agenda.Sponsors;
import com.Agenda.Survey;
import com.CommonActions.LoginToAccount;
import com.Etc.AllEvents;
import com.Etc.FloorMap;
import com.Etc.Home;
import com.Etc.UsefullInfo;
import com.Live.Attendees;
import com.Live.EventQA;
import com.Live.OneToOneMessage;
import com.Live.PhotoWall;
import com.Live.PlayCenter;
import com.Live.SocialWall;
import com.Live.VideoWall;
import com.Me.BusinessCard;
import com.Me.Logout;
import com.Me.MyProfile;
import com.Utils.BrowserSetup;
import com.Utils.GetScreenShot;


@Listeners({ GetScreenShot.class })

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
	
	 String EmailId = getCellData(1, 5);
			
	 String Password = getCellData(1, 6);
	
	 System.out.println("Executing : Login To Account Test");
	
	 new LoginToAccount(driver).loginToAccount(EmailId, Password);
	
	 }
	 
	 @Test(priority = 2,alwaysRun=true)
	 public void socialWallPostTest() throws InterruptedException, InvalidFormatException, IOException {
	
	 String EmailId = getCellData(1, 5);
			
	 String Password = getCellData(1, 6);
	
	 System.out.println("Executing : Social Wall Post Test");
	
	 new SocialWall(driver).socialWall(EmailId, Password, "Load Testing Base");
	
	 }
	 
	 @Test(priority = 3,alwaysRun=true)
	 public void eventQAPostTest() throws InterruptedException, InvalidFormatException, IOException {
	
	 String EmailId = getCellData(1, 5);
			
	 String Password = getCellData(1, 6);
	
	 System.out.println("Executing : Event QA Post Test");
	
	 new EventQA(driver).eventQA(EmailId, Password, "Event Load Testing Base");
	
	 }
	 
	 @Test(priority = 4,alwaysRun=true)
	 public void oneToOneMessageTest() throws InterruptedException, InvalidFormatException, IOException {
	
	 String EmailId = getCellData(1, 5);
			
	 String Password = getCellData(1, 6);

	
	 System.out.println("Executing : One To One Message Test");
	
	 new OneToOneMessage(driver).oneToOneMsg(EmailId, Password, "Event Load Testing Base");
	
	 }
	 
	 @Test(priority = 5,alwaysRun=true)
	 public void photoWallTest() throws InterruptedException, InvalidFormatException, IOException {
	
	 String EmailId = getCellData(1, 5);
			
	 String Password = getCellData(1, 6);
	
	 System.out.println("Executing : Photo Wall Test");
	
	 new PhotoWall(driver).photoUpload(EmailId, Password,home+"/Test Data/PhotoWall.jpg", "Responsive Photo Wall Test","This is Bullet, New Classic");
	
	 }
	 
	 @Test(priority = 6,alwaysRun=true)
	 public void videoWallTest() throws InterruptedException, InvalidFormatException, IOException {
	
	 String EmailId = getCellData(1, 5);
		
	 String Password = getCellData(1, 6);
	
	 System.out.println("Executing : Video Wall Test");
	
	 new VideoWall(driver).videoUpload(EmailId, Password,home+"/Test Data/VideoWall.mp4", "Responsive Video Wall Test");
	
	 }
	 
	 @Test(priority = 7,alwaysRun=true)
	 public void attendeeDetailsTest() throws InterruptedException, InvalidFormatException, IOException {
	
	 String EmailId = getCellData(1, 5);
			
	 String Password = getCellData(1, 6);
	
	 System.out.println("Executing : Attendee Details Test");
	
	 new Attendees(driver).attendeeDetails(EmailId, Password, "Responsive Attendee Details Test");
	
	 }
	  
	 @Test(priority = 8,alwaysRun=true)
	 public void dropdownPollTest() throws InterruptedException, InvalidFormatException, IOException {
	
	 String EmailId = getCellData(1, 5);
			
	 String Password = getCellData(1, 6);
	
	 System.out.println("Executing : Drop Down Poll Test");
	
	 new Survey(driver).dropdownPoll(EmailId, Password);
	
	 }
	 
	 @Test(priority = 9,alwaysRun=true)
	 public void freeTextPollTest() throws InterruptedException, InvalidFormatException, IOException {
	
	 String EmailId = getCellData(1, 5);
			
	 String Password = getCellData(1, 6);
	
	 System.out.println("Executing : Free Text Poll Test");
	
	 new Survey(driver).freeTextPoll(EmailId, Password);
	
	 }
	 
	 @Test(priority = 10,alwaysRun=true)
	 public void multiplePollTest() throws InterruptedException, InvalidFormatException, IOException {
	
	 String EmailId = getCellData(1, 5);
			
	 String Password = getCellData(1, 6);
	
	 System.out.println("Executing : Multiple Choice Poll Test");
	
	 new Survey(driver).multiplePoll(EmailId, Password);
	
	 }
	 
	 @Test(priority = 11,alwaysRun=true)
	 public void singlePollTest() throws InterruptedException, InvalidFormatException, IOException {
	
	 String EmailId = getCellData(1, 5);
			
	 String Password = getCellData(1, 6);
	
	 System.out.println("Executing : Single Poll Test");
	
	 new Survey(driver).singlePoll(EmailId, Password);
	
	 }
	 
	 @Test(priority = 12,alwaysRun=true)
	 public void quizMapTest() throws InterruptedException, InvalidFormatException, IOException {
	
	 String EmailId = getCellData(1, 5);
			
	 String Password = getCellData(1, 6);
	
	 System.out.println("Executing : Quiz Map Test");
	
	 new PlayCenter(driver).quizMap(EmailId, Password);
	
	 }
	 
	 @Test(priority = 13,alwaysRun=true)
	 public void locationMapTest() throws InterruptedException, InvalidFormatException, IOException {
	
	 String EmailId = getCellData(1, 5);
			
	 String Password = getCellData(1, 6);
	
	 System.out.println("Executing : Location Map Test");
	
	 new PlayCenter(driver).locationMap(EmailId, Password);
	
	 }
	 
	 @Test(priority = 14,alwaysRun=true)
	 public void sessionListVerifyTest() throws InterruptedException, InvalidFormatException, IOException {
	
	 String EmailId = getCellData(1, 5);
			
	 String Password = getCellData(1, 6);
	
	 System.out.println("Executing : Session List Verify Test");
	
	 new Schedule(driver).time(EmailId, Password);
	
	 }
	 
	 @Test(priority = 15,alwaysRun=true)
	 public void sessionBookmarkVerifyTest() throws InterruptedException, InvalidFormatException, IOException {
	
	 String EmailId = getCellData(1, 5);
			
	 String Password = getCellData(1, 6);
	
	 System.out.println("Executing : Session Bookmark Verify Test");
	
	 new Schedule(driver).sessionBookmark(EmailId, Password);
	
	 }
	 
	 @Test(priority = 16,alwaysRun=true)
	 public void sessionTakeNotesVerifyTest() throws InterruptedException, InvalidFormatException, IOException {
	
	 String EmailId = getCellData(1, 5);
			
	 String Password = getCellData(1, 6);
	
	 System.out.println("Executing : Session Take Notes Verify Test");
	
	 new Schedule(driver).sessionTakeNotes(EmailId, Password,"Tonight is the Night");
	
	 }
	 
	 @Test(priority = 17,alwaysRun=true)
	 public void askAQuestionAndAddCommentVerifyTest() throws InterruptedException, InvalidFormatException, IOException {
	
	 String EmailId = getCellData(1, 5);
			
	 String Password = getCellData(1, 6);
	
	 System.out.println("Executing : Ask A Question and Add Comment Verify Test");
	
	 new Schedule(driver).askAQuestion(EmailId, Password,"Is it Summer there?","is the Day?");
	
	 }
	 
	 @Test(priority = 18,alwaysRun=true)
	 public void updateMyProfileInfoTest() throws InterruptedException, InvalidFormatException, IOException {
	
	 String EmailId = getCellData(1, 5);
			
	 String Password = getCellData(1, 6);
	
	 System.out.println("Executing : Update My Profile Info Test");
	
	 new MyProfile(driver).updateDetails(EmailId, Password, "Health Executive", "Stay Fit Crop");
	
	 }
	 
	 @Test(priority = 19,alwaysRun=true)
	 public void verifyBusinessCardTest() throws InterruptedException, InvalidFormatException, IOException {
	
	 String EmailId = getCellData(1, 5);
			
	 String Password = getCellData(1, 6);
	
	 System.out.println("Executing : Verify Business Card Image Test");
	
	 new BusinessCard(driver).verifyBusinessCard(EmailId, Password);
	
	 }
	 
	 @Test(priority = 20,alwaysRun=true)
	 public void logoutTest() throws InterruptedException, InvalidFormatException, IOException {
	
	 String EmailId = getCellData(1, 5);
			
	 String Password = getCellData(1, 6);
	
	 System.out.println("Executing : Logout Test");
	
	 new Logout(driver).logout(EmailId, Password);
	
	 }
	 
	 @Test(priority = 21,alwaysRun=true)
	 public void allEventsTest() throws InterruptedException, InvalidFormatException, IOException {
	
	 String EmailId = getCellData(1, 5);
			
	 String Password = getCellData(1, 6);
	
	 System.out.println("Executing : All Events Test");
	
	 new AllEvents(driver).verifyAllEvent(EmailId, Password);
	
	 }
	 
	 @Test(priority = 22,alwaysRun=true)
	 public void verifyUsefulInfoTest() throws InterruptedException, InvalidFormatException, IOException {
	
	 String EmailId = getCellData(1, 5);
			
	 String Password = getCellData(1, 6);
	
	 System.out.println("Executing : Verify Useful Info Test");
	
	 new UsefullInfo(driver).verifyUsefulInfo(EmailId, Password);
	
	 }
	 
	 @Test(priority = 23,alwaysRun=true)
	 public void verifyFloorMapTest() throws InterruptedException, InvalidFormatException, IOException {
	
	 String EmailId = getCellData(1, 5);
			
	 String Password = getCellData(1, 6);
	
	 System.out.println("Executing : Verify Floor Map Test");
	
	 new FloorMap(driver).floorMapDetails(EmailId, Password);
	
	 }
	 
	 @Test(priority = 24,alwaysRun=true)
	 public void verifyWayFinderTest() throws InterruptedException, InvalidFormatException, IOException {
	
	 String EmailId = getCellData(1, 5);
			
	 String Password = getCellData(1, 6);
	
	 System.out.println("Executing : Verify Way Finder Test");
	
	 new FloorMap(driver).wayfinder(EmailId, Password);
	
	 }
	  
	 @Test(priority = 25,alwaysRun=true)
	 public void verifyHomeIconsTest() throws InterruptedException, InvalidFormatException, IOException {
	
	 String EmailId = getCellData(1, 5);
			
	 String Password = getCellData(1, 6);
	
	 System.out.println("Executing : Verify Home Icons Test");
	
	 new Home(driver).verifyHome(EmailId, Password);
	
	 }
	 
	 @Test(priority = 26,alwaysRun=true)
	 public void verifySpeakersTest() throws InterruptedException, InvalidFormatException, IOException {
	
	 String EmailId = getCellData(1, 5);
			
	 String Password = getCellData(1, 6);
	
	 System.out.println("Executing : Verify Speakers Test");
	
	 new Speakers(driver).verifySpeakers(EmailId, Password);
	
	 }
	 
	 @Test(priority = 27,alwaysRun=true)
	 public void verifyExhibitorsTest() throws InterruptedException, InvalidFormatException, IOException {
	
	 String EmailId = getCellData(1, 5);
			
	 String Password = getCellData(1, 6);
	
	 System.out.println("Executing : Verify Exhibitors Test");
	
	 new Exhibitors(driver).verifyExhibitors(EmailId, Password);
	
	 }
	 
	 @Test(priority = 28,alwaysRun=true)
	 public void verifySponsorsTest() throws InterruptedException, InvalidFormatException, IOException {
	
	 String EmailId = getCellData(1, 5);
			
	 String Password = getCellData(1, 6);
	
	 System.out.println("Executing : Verify Sponsors Test");
	
	 new Sponsors(driver).verifySponsors(EmailId, Password);
	
	 }
	
	

}
