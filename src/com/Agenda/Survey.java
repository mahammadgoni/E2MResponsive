package com.Agenda;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.BaseSetup.BaseSetUp;

public class Survey extends BaseSetUp{
	
	By emailId = By.xpath("//*[@id='txtUsername']");
	
	By proceedBtn = By.xpath("//*[@id='spnLogin']");
	
	By pass = By.xpath("//*[@name='password_']");
	
	By signInBtn = By.xpath("//*[@id='spnPassword']");
	
	By menuBtn = By.xpath("//button[@id='open-button']");
	
	By agendaOption = By.xpath("//*[@class='menu-group']//a[1]");
	
	By survey = By.xpath("//span[contains(text(),'Survey')]");
	
	
//	Drop down Poll Elements
	
	By dropdownPoll = By.xpath("//*[@id='gvSurvey_lnkBtn_0']");
	
//	By dropdownPoll = By.xpath("//*[contains(text(),'Automation Dropdown Poll Testing')]");
	
	By selectAnOption = By.xpath("//*[@id='DropDownList1']");
	
	By optionOne = By.xpath("//*[@id='DropDownList1']/option[1]");
	
	By selectAnOption1 = By.xpath("//*[@id='DropDownList2']");
	
//	By nextQuestion = By.xpath("//*[@text='Next Question']");
//	
//	By optionOne = By.xpath("//android.widget.ListView/android.widget.TextView[1]");
//	
//	By optionTwo = By.xpath("//android.widget.ListView/android.widget.TextView[2]");
//	
//	By optionThree = By.xpath("//android.widget.ListView/android.widget.TextView[3]");
	
//	By okBtn = By.xpath("//*[@text='OK']");
	
//	By previousBtn = By.id("btn_prev_button");
	
	By btnSubmit = By.id("BtnSave");
	
	By thanksMsg = By.id("tv_thanks");
	
	By morePolls = By.id("BtnBack");
	
//	Free Text Poll Elements
	
	By freeTextPoll = By.xpath("//*[@id='gvSurvey_lnkBtn_1']");
	
	By textBox1 = By.xpath("//*[@id='TextBox1']");
	
	By textBox2 = By.xpath("//*[@id='TextBox2']");
	
//	Multiple Poll Elements
		
	By multiplePoll = By.xpath("//*[@id='gvSurvey_lnkBtn_2']");
	
	By mulOptionOne = By.xpath("//*[@name='CheckBox1']");
	
	By mulOptionTwo = By.xpath("//*[@name='CheckBox2']");
	
	By mulOptionFive = By.xpath("//*[@name='CheckBox5']");
	
//	Single Poll Elements
	
	By singlePoll = By.xpath("//*[@id='gvSurvey_lnkBtn_3']");
	
	By singlePollOne = By.xpath("//*[@name='RadioButton1']");
	
	By singlePollTwo = By.xpath("//*[@name='RadioButton3']");


	
	public Survey(WebDriver driver) {
		super(driver);
		
	}
	
//	Common Login Method
	
	public void commonActivity(String userName,String password) throws InterruptedException{
		
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
		
		Thread.sleep(1000);
		
		System.out.println("Clicking on Menu Option ");

		waitForClickabilityOf(menuBtn);

		driver.findElement(menuBtn).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on My Agenda ");

		waitForClickabilityOf(agendaOption);

		driver.findElement(agendaOption).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Survey ");

		waitForClickabilityOf(survey);

		driver.findElement(survey).click();
		
	}
	
//	Drop Down Survey Method
	
	public Survey dropdownPoll(String userName,String password) throws InterruptedException{
		
		commonActivity(userName, password);
		
		Thread.sleep(2000);
		
		driver.switchTo().frame(0);
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Drop Down Poll Survey ");

		waitForClickabilityOf(dropdownPoll);

		driver.findElement(dropdownPoll).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Select An Option ");

		waitForClickabilityOf(selectAnOption);
		
		WebElement option = driver.findElement(selectAnOption);
		
		option.clear();

//		Select option = new Select(driver.findElement(selectAnOption));
//		
//		option.selectByValue("German");
				
		Thread.sleep(2000);
		
		System.out.println("Clicking on Select An Option ");

		waitForClickabilityOf(selectAnOption1);

		Select option1 = new Select(driver.findElement(selectAnOption1));
		
		option1.selectByIndex(2);
				
		Thread.sleep(2000);
		
		System.out.println("Clicking on Submit Button ");

		waitForClickabilityOf(btnSubmit);

		driver.findElement(btnSubmit).click();
		
		Thread.sleep(4000);
		
		String Msg = driver.findElement(morePolls).getText();
		
//		Verifying Condition
		
		Thread.sleep(4000);
		
		if (Msg.equals("More Polls")) {
			
			System.out.println("Successfully Verified the Dropdown Polls/Surveys");
			
		} else {
			
			System.out.println("Failed to Verify the Dropdown Polls/Surveys");

		}
		
	
		
		return new Survey(driver);
	}
	
//	Free Text Survey Method
	
	public Survey freeTextPoll(String userName,String password) throws InterruptedException{
		
		commonActivity(userName, password);
		
		Thread.sleep(2000);
		
		driver.switchTo().frame(0);
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Free Text Poll Survey ");

		waitForClickabilityOf(freeTextPoll);

		driver.findElement(freeTextPoll).click();
		
		Thread.sleep(2000);
		
		System.out.println("Entering Free Text Answer ");

		waitForClickabilityOf(textBox1);

		driver.findElement(textBox1).clear();
		
		driver.findElement(textBox1).sendKeys("German");
				
		Thread.sleep(2000);
		
		System.out.println("Entering Free Text Answer ");

		waitForClickabilityOf(textBox2);

		driver.findElement(textBox2).clear();
		
		driver.findElement(textBox2).sendKeys("Germany");
				
		Thread.sleep(2000);
		
		System.out.println("Clicking on Submit Button ");

		waitForClickabilityOf(btnSubmit);

		driver.findElement(btnSubmit).click();
		
		Thread.sleep(4000);
		
		String Msg = driver.findElement(morePolls).getText();
		
//		Verifying Condition
		
		Thread.sleep(4000);
		
		if (Msg.equals("More Polls")) {
			
			System.out.println("Successfully Verified the Free Text Polls/Surveys");
			
		} else {
			
			System.out.println("Failed to Verify the Free Text Polls/Surveys");

		}
		
		
		return new Survey(driver);
	}
	
//	Multiple Survey Method
	
	public Survey multiplePoll(String userName,String password) throws InterruptedException{
		
		commonActivity(userName, password);
		
		Thread.sleep(2000);
		
		driver.switchTo().frame(0);
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Multiple Choice Poll Survey ");

		waitForClickabilityOf(multiplePoll);

		driver.findElement(multiplePoll).click();
		
		Thread.sleep(2000);
		
		System.out.println("Selecting An Option ");

		waitForClickabilityOf(mulOptionOne);

		driver.findElement(mulOptionOne).click();
						
		Thread.sleep(2000);
		
		System.out.println("Selecting An Option ");

		waitForClickabilityOf(mulOptionOne);

		driver.findElement(mulOptionOne).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Submit Button ");

		waitForClickabilityOf(btnSubmit);

		driver.findElement(btnSubmit).click();
		
		Thread.sleep(4000);
		
		String Msg = driver.findElement(morePolls).getText();
		
//		Verifying Condition
		
		Thread.sleep(4000);
		
		if (Msg.equals("More Polls")) {
			
			System.out.println("Successfully Verified the Multiple Choice Polls/Surveys");
			
		} else {
			
			System.out.println("Failed to Verify the Multiple Choice Polls/Surveys");

		}
		
		
		return new Survey(driver);
	}
	
//	Single Survey Method
	
	public Survey singlePoll(String userName,String password) throws InterruptedException{
		
		commonActivity(userName, password);
		
		Thread.sleep(2000);
		
		driver.switchTo().frame(0);
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Single Poll Survey ");

		waitForClickabilityOf(singlePoll);

		driver.findElement(singlePoll).click();
				
		Thread.sleep(2000);
		
		System.out.println("Selecting An Option ");

		waitForClickabilityOf(singlePollOne);

		driver.findElement(singlePollOne).click();
				
		Thread.sleep(2000);
		
		System.out.println("Selecting An Option ");

		waitForClickabilityOf(singlePollTwo);

		driver.findElement(singlePollTwo).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Submit Button ");

		waitForClickabilityOf(btnSubmit);

		driver.findElement(btnSubmit).click();
		
		Thread.sleep(4000);
		
		String Msg = driver.findElement(morePolls).getText();
		
//		Verifying Condition
		
		Thread.sleep(4000);
		
		if (Msg.equals("More Polls")) {
			
			System.out.println("Successfully Verified the Single Polls/Surveys");
			
		} else {
			
			System.out.println("Failed to Verify the Single Polls/Surveys");

		}
		
		
		
		return new Survey(driver);
	}

}
