package com.Agenda;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.BaseSetup.BaseSetUp;
import com.CommonActions.LoginToAccount;


public class Schedule extends BaseSetUp{
	
	
	
	By menuBtn = By.xpath("//button[@id='open-button']");
	
	By agendaOption = By.xpath("//*[@class='menu-group']//a[1]");
	
	By meOption = By.xpath("//*[@class='menu-group']//a[3]");
	
	By bookmark = By.xpath("//span[contains(text(),'Bookmarks')]");
	
	By schedule = By.xpath("//a[@href='/Sessions/ConfigureTabs']//span[@class='submenu-title'][contains(text(),'Schedule')]");
	
//	Time Tab Bookmarks Elements
	
	By timeTab = By.xpath("//a[@href='/Sessions/Index/']");
	
	By sessionList = By.xpath("//div[@class='accordion-hld sessionlistcontainer']//ul[1]");
	
	By session1st = By.xpath("//div[@class='accordion-hld sessionlistcontainer']//ul[1]/li[1]");
	
	By session2nd = By.xpath("//div[@class='accordion-hld sessionlistcontainer']//ul[1]/li[2]");
	
	By sessionTitle = By.xpath("//a[@class='collapsableItem']//div[@class='ac-title-hld']");
	
//	By bookmarkSession = By.xpath("//li[@class='icon-bookmark1-hld']");
	
	By bookmarkSession = By.xpath("//*[@class='icon-bookmark1 bmark-pupupbtn no-bookmark1 add-bookmark1']");
	
	By unBookmarkSession = By.xpath("//*[@class='icon-bookmark1 bmark-pupupbtn no-bookmark1']");
	
	By educationalPrgm = By.xpath("//a[@href='/Bookmark/Bookmarked_Session']//div[@class='exhibitors-block clearfix']");
	
	
	
	By rate = By.xpath("//div[@class='ac-iconinlie-hld']/ul/li[3]");
	
	By resources = By.xpath("//div[@class='ac-iconinlie-hld']/ul/li[4]");
	
//	Time Tab Take Notes Elements
	
	By takeNote = By.xpath("//div[@class='ac-iconinlie-hld']/ul/li[5]");
	
	By notePlusSymbol = By.xpath("//*[@class='add-note']");
	
	By addNote = By.xpath("//*[@class='ac-title-hld']");
	
	By writeNote = By.xpath("//textarea[@id='txtnotes']");
	
	By saveNoteBtn = By.xpath("//input[@value='SAVE']");
	
//	Time Tab Ask A Question
	
	By askAQuestion = By.xpath("//div[@class='ac-iconinlie-hld']/ul/li[6]");
	
	By clickOnGeneral = By.xpath("//*[contains(text(),'General')]");
	
	By typeUrQuestion = By.xpath("//*[@class='cstm-input-group input-group full-txtarea']//textarea[@id='txtQuestion']");
	
	By postQuestion = By.xpath("//*[@id='btnQuestionPost']");
	
	By upVote = By.xpath("//a[@class='upvt']");
	
	By comntQuestion = By.xpath("//textarea[@id='txtComment']");
	
//	Time Tab Vote Elements
	
	By vote = By.xpath("//div[@class='ac-iconinlie-hld']/ul/li[7]");
	
	By checkIn = By.xpath("//div[@class='ac-iconinlie-hld']/ul/li[8]");
	
	By addToAgenda = By.xpath("//div[@class='ac-iconinlie-hld']/ul/li[9]");
	
	
	
	By trackTab = By.xpath("//a[@href='/Sessions/Tracks/']");
	
	By myAgenda = By.xpath("//a[@href='/Sessions/MyAgenda/']");

	
	
	

	public Schedule(WebDriver driver) {
		super(driver);
		
	}
	
//	 Common Method 
	
	public void commonSchedule(String userName,String password) throws InterruptedException{
		
//		Initiating LoginToAccount Class
		
		LoginToAccount login = new LoginToAccount(driver);
		
		login.commonLogin(userName, password);

		Thread.sleep(2000);
		
		System.out.println("Clicking on Menu Option ");

		waitForClickabilityOf(menuBtn);

		driver.findElement(menuBtn).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on My Agenda ");

		waitForClickabilityOf(agendaOption);

		driver.findElement(agendaOption).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Schedule Option");

		waitForClickabilityOf(schedule);

		driver.findElement(schedule).click();
		
		Thread.sleep(2000);
		
		
	}
	
//	Checking Time Method

	public Schedule time(String userName,String password) throws InterruptedException{
		
		commonSchedule(userName, password);
				
		System.out.println("Clicking on Time Tab");

		waitForClickabilityOf(timeTab);

		driver.findElement(timeTab).click();
		
		Thread.sleep(2000);
		
		System.out.println("Opening the Session");

		waitForClickabilityOf(session1st);

		driver.findElement(session1st).click();
				
		Thread.sleep(2000);
		
		boolean Bookmark = driver.findElement(bookmarkSession).isDisplayed();
		
//		Verifying the Condition 
		
		if (Bookmark==true) {
			
			System.out.println("Successfully Verified Schedule Time Session");
			
		} else {
			
			System.out.println("Failed to Verify Schedule Time Session");

		}
				
				
		return new Schedule(driver);
		
	}
	
//	    Session Bookmark Method
	
	public Schedule sessionBookmark(String userName,String password) throws InterruptedException{
			
			commonSchedule(userName, password);
			
			System.out.println("Clicking on Time Tab");

			waitForClickabilityOf(timeTab);

			driver.findElement(timeTab).click();
			
			Thread.sleep(2000);
			
			System.out.println("Opening the Session");

			waitForClickabilityOf(session1st);

			driver.findElement(session1st).click();
			
			Thread.sleep(2000);
			
//			Storing the Session Name
			
			System.out.println("Storing the Session Name");

			waitForClickabilityOf(sessionTitle);

			String SessionName = driver.findElement(sessionTitle).getText();
						
			Thread.sleep(2000);
			
			System.out.println("Opening This Session");
			
			Thread.sleep(2000);
			
//			Storing the Message
			
			boolean bkmrk = driver.findElement(bookmarkSession).isDisplayed();
			
			Thread.sleep(2000);
			
			if (bkmrk==true) {
				
				System.out.println("Session is already Bookmarked");
								
				
			} else {
				
				waitForClickabilityOf(bookmark);

				driver.findElement(bookmark).click();
				

			}
			
			Thread.sleep(2000);
			
			System.out.println("Clicking on Menu Option ");

			waitForClickabilityOf(menuBtn);

			driver.findElement(menuBtn).click();
			
			Thread.sleep(2000);
			
			System.out.println("Clicking on Me ");

			waitForClickabilityOf(meOption);

			driver.findElement(meOption).click();
			
			Thread.sleep(2000);
			
			System.out.println("Clicking on Bookmark Option");

			waitForClickabilityOf(bookmark);

			driver.findElement(bookmark).click();
			
			Thread.sleep(2000);
			
			System.out.println("Clicking on Educational Program");

			waitForClickabilityOf(educationalPrgm);

			driver.findElement(educationalPrgm).click();
			
			Thread.sleep(2000);
			
//			Verifying the Bookmark Session
			
			boolean sessionName = driver.findElement(By.xpath("//*[contains(text(),'"+SessionName+"')]")).isDisplayed();
			
			Thread.sleep(2000);
			
			if (sessionName==true) {
				
				System.out.println("Succesfully Verified Session Bookmark ");
				
				
			} else {
				
				
				System.out.println("Failed To Verify Session Bookmark");
				

			}
			

		return new Schedule(driver);

}
	
//  	Session Rate Method
	
	public Schedule sessionRate(String userName,String password){
		
		
	
	
	  return new Schedule(driver);
	
   }
	
	
//	Session Take Notes
	
	public Schedule sessionTakeNotes(String userName,String password,String AddNote) throws InterruptedException{
		
		commonSchedule(userName, password);
		
		System.out.println("Clicking on Time Tab");

		waitForClickabilityOf(timeTab);

		driver.findElement(timeTab).click();
		
		Thread.sleep(2000);
		
		System.out.println("Opening the Session");

		waitForClickabilityOf(session1st);

		driver.findElement(session1st).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Take Notes");

		waitForClickabilityOf(takeNote);

		driver.findElement(takeNote).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Add Notes");

		waitForClickabilityOf(addNote);

		driver.findElement(addNote).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking Plus Symbol to Add Notes");

		waitForClickabilityOf(notePlusSymbol);

		driver.findElement(notePlusSymbol).click();
		
		Thread.sleep(2000);
		
		System.out.println("Entering Notes");

		waitForClickabilityOf(writeNote);

		driver.findElement(writeNote).sendKeys(AddNote);		
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Save Button");

		waitForClickabilityOf(saveNoteBtn);

		driver.findElement(saveNoteBtn).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Add Notes");

		waitForClickabilityOf(addNote);

		driver.findElement(addNote).click();
		
		Thread.sleep(2000);
		
		String SessionName = driver.findElement(By.xpath("//*[contains(text(),'"+AddNote+"')]")).getText();
		
		Thread.sleep(2000);
		
//		Verifying the Added Notes
		
		if (SessionName.equals(AddNote)) {
			
			System.out.println("Succesfully Added Session Notes ");
			
			
		} else {
			
			
			System.out.println("Failed To Add Session Notes");
			

		}		
		
    	return new Schedule(driver);
		
	   }
		
//		Ask a question Method 
	
	public Schedule askAQuestion(String userName,String password,String Question,String Comment) throws InterruptedException{
		
		commonSchedule(userName, password);
		
		System.out.println("Clicking on Time Tab");

		waitForClickabilityOf(timeTab);

		driver.findElement(timeTab).click();
		
		Thread.sleep(2000);
		
		System.out.println("Opening the Session");

		waitForClickabilityOf(session1st);

		driver.findElement(session1st).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Ask A Question");

		waitForClickabilityOf(askAQuestion);

		driver.findElement(askAQuestion).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on General Category");

		waitForClickabilityOf(clickOnGeneral);

		driver.findElement(clickOnGeneral).click();
		
		Thread.sleep(2000);
		
		System.out.println("Entering Question ");

		waitForClickabilityOf(typeUrQuestion);

		driver.findElement(typeUrQuestion).sendKeys(Question);		
		
		Thread.sleep(2000);
		
		System.out.println("Posting the Question ");

		waitForClickabilityOf(postQuestion);

		driver.findElement(postQuestion).click();
		
		Thread.sleep(2000);
		
		System.out.println("Cicking on Posted Question ");

		waitForClickabilityOf(By.xpath("//*[contains(text(),'"+Question+"')]"));
		
		Thread.sleep(2000);
		
		String QuestionName = driver.findElement(By.xpath("//*[contains(text(),'"+Question+"')]")).getText();
		
		Thread.sleep(2000);
		
//		Verifying the Added Notes
		
		if (QuestionName.equals(Question)) {
			
			System.out.println("Succesfully Asked A Question ");
			
			
		} else {
			
			
			System.out.println("Failed To Ask A Question");
			

		}
		

		driver.findElement(By.xpath("//a[contains(text(),'"+Question+"')]")).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking On Upvote the Question ");

		waitForClickabilityOf(upVote);

		driver.findElement(upVote).click();
		
		Thread.sleep(2000);
		
		System.out.println("Entering Comment on Question ");

		waitForClickabilityOf(comntQuestion);

		driver.findElement(comntQuestion).sendKeys(Comment);
		
		Thread.sleep(2000);
		
		System.out.println("Posting the Comment ");

		waitForClickabilityOf(postQuestion);

		driver.findElement(postQuestion).click();
		
		Thread.sleep(2000);
		
		String CommentName = driver.findElement(By.xpath("//*[contains(text(),'"+Comment+"')]")).getText();
		
		Thread.sleep(2000);
		
//		Verifying the Added Notes
		
		if (CommentName.equals(Comment)) {
			
			System.out.println("Succesfully Added A Comment ");
			
			
		} else {
			
			
			System.out.println("Failed To Add Comment");
			

		}
		
		
		
		
		return new Schedule(driver);
	}
		
//	 Vote Submit
	
	public Schedule voteSubmit(String userName,String password,String Question,String Comment) throws InterruptedException{
		
		commonSchedule(userName, password);
		
		System.out.println("Clicking on Time Tab");

		waitForClickabilityOf(timeTab);

		driver.findElement(timeTab).click();
		
		Thread.sleep(2000);
		
		System.out.println("Opening the Session");

		waitForClickabilityOf(session1st);

		driver.findElement(session1st).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Vote");

		waitForClickabilityOf(vote);

		driver.findElement(vote).click();
		
		Thread.sleep(2000);
		
		
	
		return new Schedule(driver);
	}
	
//	Resource Method
	
	public Schedule resourceVerify(String userName,String password,String Question,String Comment) throws InterruptedException{
		
		commonSchedule(userName, password);
		
		System.out.println("Clicking on Time Tab");

		waitForClickabilityOf(timeTab);

		driver.findElement(timeTab).click();
		
		Thread.sleep(2000);
		
		System.out.println("Opening the Session");

		waitForClickabilityOf(session1st);

		driver.findElement(session1st).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Resources");

		waitForClickabilityOf(resources);

		driver.findElement(resources).click();
		
		Thread.sleep(2000);
		
		
	
		return new Schedule(driver);
	}
	
	
	
	
	
		
//		
//		System.out.println("Clicking On Add To Calender");
//
//		waitForClickabilityOf(addToCalender);
//
//		driver.findElement(addToCalender).click();
//		
//		Thread.sleep(2000);
//		
//		System.out.println("Clicking On Rate");
//
//		waitForClickabilityOf(rate);
//
//		driver.findElement(rate).click();
//		
//		Thread.sleep(2000);
//		
//		System.out.println("Clicking On Close Rate Option");
//
//		waitForClickabilityOf(cancleRate);
//
//		driver.findElement(cancleRate).click();
//		
//		Thread.sleep(2000);
//		
//		waitForClickabilityOf(cancleRate);
//
//		driver.findElement(cancleRate).click();
//		
//		Thread.sleep(2000);
//		
//		System.out.println("Clicking On Take Notes");
//
//		waitForClickabilityOf(takeNotes);
//
//		driver.findElement(takeNotes).click();
//		
//		Thread.sleep(2000);
//		
//		System.out.println("Adding Notes");
//
//		waitForClickabilityOf(addNote);
//
//		driver.findElement(addNote).clear();
//		
//		driver.findElement(addNote).sendKeys(Notes);
//		
//		Thread.sleep(2000);
//		
//		System.out.println("Clicking On Right Simbol to Save Note");
//
//		waitForClickabilityOf(saveNote);
//
//		driver.findElement(saveNote).click();
//		
//		Thread.sleep(2000);
//		
//		System.out.println("Clicking On Add to Agenda");
//
//		waitForClickabilityOf(addToAgenda);
//
//		driver.findElement(addToAgenda).click();
//		
//		Thread.sleep(2000);
//		
//		System.out.println("Clicking On Vote");
//
//		waitForClickabilityOf(vote);
//
//		driver.findElement(vote).click();
//		
//		Thread.sleep(2000);
//		
//		System.out.println("Clicking Back Button");
//
//		((AndroidDriver)driver).pressKeyCode(AndroidKeyCode.BACK);
//		
//		Thread.sleep(2000);
//		
//		System.out.println("Clicking On Ask Question");
//
//		waitForClickabilityOf(askAQuestion);
//
//		driver.findElement(askAQuestion).click();
//		
//		Thread.sleep(2000);
//		
//		System.out.println("Addding New Question");
//
//		waitForClickabilityOf(addQuestion);
//
//		driver.findElement(addQuestion).clear();
//		
//		driver.findElement(addQuestion).sendKeys(Question);
//		
//		Thread.sleep(2000);
//		
//		System.out.println("Clicking On Ask to Add Question");
//
//		waitForClickabilityOf(saveQuestion);
//
//		driver.findElement(saveQuestion).click();
//		
//		Thread.sleep(2000);
//		
//		System.out.println("Clicking On Close Rate Option");
//		
//		boolean CancleBtn = driver.findElement(cancleRate).isDisplayed();
//
//		driver.findElement(cancleRate).click();
//		
//		Thread.sleep(2000);		
//		
//		if (CancleBtn==true) {
//			
//			System.out.println("Successfully Verified All Schedule Time Elements");
//			
//		} else {
//			
//			System.out.println("Failed to Verify All Schedule Time Elements");
//
//		}
//			
//		
//		
//		return new Schedule(driver);
//		
//	}
	

}
