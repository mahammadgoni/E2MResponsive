package com.Agenda;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

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
	
//	Rate Elements
	
	By rate = By.xpath("//div[@class='ac-iconinlie-hld']/ul/li[3]");
	
	By rateGroup = By.xpath("//div[@class='track-list-hld']");
	
	By rating1st = By.xpath("//div[@id='ratingPopup']//ul//li[1]/select");
	
	By rating2nd = By.xpath("//div[@id='ratingPopup']//ul//li[2]/select");
	
	By rateComment = By.xpath("//textarea[@id='txtRateComment']");
	
	By rateSubmitBtn = By.xpath("//input[@value='Submit']");
	
	By message = By.xpath("//div[@class='alrt-msg']");
	
	
	
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
	
	By listOfPoll = By.xpath("//iframe[@id='zino_iframe']");
	
	By dropdownPoll = By.xpath("//*[@id='gvSurvey_lnkBtn_0']");
	
//	By dropdownPoll = By.xpath("//*[contains(text(),'Automation Dropdown Poll Testing')]");
	
	By selectAnOption = By.xpath("//*[@id='DropDownList1']");
	
	By optionOne = By.xpath("//*[@id='DropDownList1']/option[1]");
	
	By selectAnOption1 = By.xpath("//*[@id='DropDownList2']");
	
	By btnSubmit = By.id("BtnSave");
	
	By thanksMsg = By.id("tv_thanks");
	
	By morePolls = By.id("BtnBack");
	
	
	
	By checkIn = By.xpath("//div[@class='ac-iconinlie-hld']/ul/li[8]");
	
//	My Agenda Verify
	
	By addToAgenda = By.xpath("//a[@title='Add To Agenda']");
	
	By removeFromAgenda = By.xpath("//a[@title='Remove from Agenda']");
	
	By myAgenda = By.xpath("//a[@href='/Sessions/MyAgenda/']");
	
	
	
	By trackTab = By.xpath("//a[@href='/Sessions/Tracks/']");
	


	
	
	

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
	
//	Session Bookmark Method
	
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
	
//  Session Rate Method
	
	public Schedule sessionRate(String userName,String password,String RateComment) throws InterruptedException{
		
		commonSchedule(userName, password);
		
		System.out.println("Clicking on Time Tab");

		waitForClickabilityOf(timeTab);

		driver.findElement(timeTab).click();
		
		Thread.sleep(2000);
		
		System.out.println("Opening the Session");

		waitForClickabilityOf(session1st);

		driver.findElement(session1st).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Rate");

		waitForClickabilityOf(rate);

		driver.findElement(rate).click();
		
		Thread.sleep(5000);
		
		System.out.println("Clicking on Rate Group");

		waitForClickabilityOf(rateGroup);

		driver.findElement(rateGroup).click();
		
		Thread.sleep(5000);
		
//		Checking for 1st Rating
		
		boolean Rating1st = driver.findElement(rating1st).isDisplayed();
		
		Thread.sleep(5000);
		
		if (Rating1st==true) {
			
			System.out.println("Giving 1st Section Rating");
			
			Select option = new Select(driver.findElement(rating1st));
			
			option.selectByIndex(4);
			
		} else {
			
			System.out.println("No Rating Section");

		}
		
		Thread.sleep(5000);
		
		try {
			
			
//			Checking for 2nd Rating
			
			boolean Rating2nd = driver.findElement(rating2nd).isDisplayed();
			
			Thread.sleep(5000);
			
			if (Rating2nd==true) {
				
				System.out.println("Giving 2nd Section Rating");
				
				Select option = new Select(driver.findElement(rating2nd));
				
				option.selectByIndex(4);
				
			} else {
				
				System.out.println("No Rating Section");

			}
			
		} catch (Exception e) {
			
		}
		
		Thread.sleep(5000);
		
		System.out.println("Entering Rating Comment ");

		waitForClickabilityOf(rateComment);
		
		driver.findElement(rateComment).clear();

		driver.findElement(rateComment).sendKeys(RateComment);
		
		Thread.sleep(5000);
		
		System.out.println("Clicking on Rate Submit Button");

		waitForClickabilityOf(rateSubmitBtn);

		driver.findElement(rateSubmitBtn).click();
				
//		Verifying the Rate Submission
		
		String rateName = driver.findElement(message).getText();
		
		System.out.println(rateName);
		
		Thread.sleep(5000);
		
		if (rateName.equals("Rate submitted successfully")) {
			
			System.out.println("Succesfully Verified Session Rating ");
			
			
		} else {
			
			
			System.out.println("Failed To Verify Session rating");
			

		}
		
		
	
	
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
		
//	Ask a question Method 
	
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
		
//	Vote Submit
	
	public Schedule voteSubmit(String userName,String password) throws InterruptedException{
		
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
		
		Thread.sleep(5000);
		
		driver.switchTo().frame("zino_iframe");
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Drop Down Poll Survey ");

		waitForClickabilityOf(dropdownPoll);

		driver.findElement(dropdownPoll).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Select An Option ");

		waitForClickabilityOf(selectAnOption);
		
		WebElement option = driver.findElement(selectAnOption);
		
		option.click();

		Select option1 = new Select(driver.findElement(selectAnOption));
		
		option1.selectByIndex(1);
				
		Thread.sleep(2000);
		
		System.out.println("Clicking on Select An Option ");

		waitForClickabilityOf(selectAnOption1);

		Select option2 = new Select(driver.findElement(selectAnOption1));
		
		option2.selectByIndex(2);
				
		Thread.sleep(2000);
		
		System.out.println("Clicking on Submit Button ");

		waitForClickabilityOf(btnSubmit);

		driver.findElement(btnSubmit).click();
		
		Thread.sleep(4000);
		
		String Msg = driver.findElement(morePolls).getText();
		
//		Verifying Condition
		
		Thread.sleep(4000);
		
		if (Msg.equals("More Polls")) {
			
			System.out.println("Successfully Verified the Vote Option");
			
		} else {
			
			System.out.println("Failed to Verify the Vote Option");

		}
		
		
	
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
	
//	Verify My Agenda
	
	public Schedule myAgenda(String userName,String password) throws InterruptedException{
		
		commonSchedule(userName, password);
		
		System.out.println("Clicking on Time Tab");

		waitForClickabilityOf(timeTab);

		driver.findElement(timeTab).click();
		
		Thread.sleep(2000);
		
		System.out.println("Opening the Session");

		waitForClickabilityOf(session1st);

		driver.findElement(session1st).click();
		
		Thread.sleep(2000);
		
//		Storing the Session Name
		
		System.out.println("Storing the Session Name");

		waitForClickabilityOf(sessionTitle);

		String SessionTitle = driver.findElement(sessionTitle).getText();
					
		Thread.sleep(2000);
		
		System.out.println("Opening This Session");
		
		Thread.sleep(2000);
		
//		Storing the Message
		
		boolean Agenda = driver.findElement(addToAgenda).isDisplayed();
		
		System.out.println(Agenda);
		
		if (Agenda==true) {
			
			System.out.println("Clicked on Add To Agenda");

			driver.findElement(addToAgenda).click();
							
			
		} else {
			
			System.out.println("It's Already Added to Agenda");
			

		}
		
		Thread.sleep(5000);
		
		System.out.println("Clicking On My Agenda Tab");

		waitForClickabilityOf(myAgenda);

		driver.findElement(myAgenda).click();
		
		Thread.sleep(5000);
		
		boolean sessionName = driver.findElement(By.xpath("//*[contains(text(),'"+SessionTitle+"')]")).isDisplayed();
		
		Thread.sleep(2000);
		
		if (sessionName==true) {
			
			System.out.println("Succesfully Verified My Agenda ");
			
			
		} else {
			
			
			System.out.println("Failed To Verify My Agenda");
			

		}
		
		
		return new Schedule(driver);
		
		
	}
	
	
	
		

}
