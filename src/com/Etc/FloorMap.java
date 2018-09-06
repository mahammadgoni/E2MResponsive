package com.Etc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.BaseSetup.BaseSetUp;
import com.CommonActions.LoginToAccount;

public class FloorMap extends BaseSetUp{
	
	
	By menuBtn = By.xpath("//button[@id='open-button']");
	
	By etc = By.xpath("//*[@class='menu-group']//a[4]");
	
//	Floor Map Elements
	
	By floorMap = By.xpath("//span[contains(text(),'Floor Map')]");
	
	By floorMap1st = By.xpath("//div[@id='exhibitors-view']/div[1]");
	
	By wayFinder = By.xpath("//i[@class='no-fllormap']");
	
	By source = By.xpath("//button[@title='Please select source ...']");
	
	By destination = By.xpath("//button[@title='Please select a destination ...']");
	
	By selectSource = By.xpath("//li[@data-original-index='2']");
	
	By selectDestination = By.xpath("//div[@class='btn-group bootstrap-select start open']//li[@data-original-index='2']");
	
	By getDirection = By.xpath("//button[@class='gt-drctn']");
	
	By detailRoute = By.xpath("//i[@class='dtl-rt-icon']");
	
	By route1 = By.xpath("//ul[@class='rut-dtl-lstng']/li[2]");
	
	By route2 = By.xpath("//ul[@class='rut-dtl-lstng']/li[3]");
	
	By route3 = By.xpath("//ul[@class='rut-dtl-lstng']/li[4]");
	
//	Way Finder Elements 
	
	By finder = By.xpath("//a[@class='open-exhibitor-details mobile-edit icon icon-bg floop-map-icon']");
	
	By chooseFLMap = By.xpath("//button[@title='Please select a floormap']");
	
	By selectFLMap = By.xpath("//div[@class='btn-group bootstrap-select open']/div[1]/ul[1]");
	
	By selectDestns = By.xpath("//div[@class='btn-group bootstrap-select start open']//li[@data-original-index='1']");
	
	By get_Direction = By.xpath("//input[@id='btnSubmit']");
	
	
	
	
	

	public FloorMap(WebDriver driver) {
		super(driver);
		
	}
	
	public void commonAction(String userName,String password) throws InterruptedException{
		
//		Initiating LoginToAccount Class
		
		LoginToAccount login = new LoginToAccount(driver);
		
		login.commonLogin(userName, password);
				
		Thread.sleep(2000);
		
		System.out.println("Clicking on Menu Option ");

		waitForClickabilityOf(menuBtn);

		driver.findElement(menuBtn).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Etc ");

		waitForClickabilityOf(etc);

		driver.findElement(etc).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on FloorMap");

		waitForClickabilityOf(floorMap);
		
		driver.findElement(floorMap).click();
		
	}
	
//	Floor Map
	
	public FloorMap floorMapDetails(String userName,String password) throws InterruptedException{
		
		commonAction(userName, password);
		
		Thread.sleep(2000);
		
		System.out.println("Selecting Floor Map");

		waitForClickabilityOf(floorMap1st);
		
		driver.findElement(floorMap1st).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking On Way Finder");

		waitForClickabilityOf(wayFinder);
		
		driver.findElement(wayFinder).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking On Source");

		waitForClickabilityOf(source);
		
		driver.findElement(source).click();
		
		Thread.sleep(2000);
		
		System.out.println("Selecting Source from the Drop Down");

		waitForClickabilityOf(selectSource);
		
		driver.findElement(selectSource).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking On Destination");

		waitForClickabilityOf(source);
		
		driver.findElement(source).click();
		
		Thread.sleep(2000);
		
		System.out.println("Selecting Destination from the Drop Down");

		waitForClickabilityOf(selectDestination);
		
		driver.findElement(selectDestination).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking On Get Direction to Get the Direction");

		waitForClickabilityOf(getDirection);
		
		driver.findElement(getDirection).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking On Detail Route to See the Direction");

		waitForClickabilityOf(detailRoute);
		
		driver.findElement(detailRoute).click();
		
		Thread.sleep(2000);
		
		try {
			
			System.out.println("Getting Navigations");

			String nav1 = driver.findElement(route1).getText();
			
			String nav2 = driver.findElement(route2).getText();
			
			String nav3 = driver.findElement(route3).getText();
			
			Thread.sleep(2000);
			
			System.out.println("First Go "+nav1+" Then "+nav2+" And "+nav3);
			
		} catch (Exception e) {
			
		}
		
		Thread.sleep(2000);
		
		boolean Nav1 = driver.findElement(route1).isDisplayed();
		
		Thread.sleep(2000);
		
		if (Nav1==true) {
			
			System.out.println("Successfully Verified Floor Map Option");
			
		} else {
			
			System.out.println("Failed to verify Floor Map");

		}
		
		
		return new FloorMap(driver);
		
	}
	
//	Way Finder Method
	
	public FloorMap wayfinder(String userName,String password) throws InterruptedException{
		
		commonAction(userName, password);
		
		Thread.sleep(2000);
		
		System.out.println("Clicking On Way Finder");

		waitForClickabilityOf(finder);
		
		driver.findElement(finder).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking On Choose Floor Map");

		waitForClickabilityOf(chooseFLMap);
		
		driver.findElement(chooseFLMap).click();
		
		Thread.sleep(2000);
		
		System.out.println("Selecting Floor Map From Dropdown Menu");

		waitForClickabilityOf(selectFLMap);
		
		driver.findElement(selectFLMap).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking On Choose Start Point");

		waitForClickabilityOf(source);
		
		driver.findElement(source).click();
		
		Thread.sleep(2000);
		
		System.out.println("Selecting Start Point");

		waitForClickabilityOf(selectSource);
		
		driver.findElement(selectSource).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking On Choose End Point");

		waitForClickabilityOf(source);
		
		driver.findElement(source).click();
		
		Thread.sleep(2000);
		
		System.out.println("Selecting End Point");

		waitForClickabilityOf(selectDestns);
		
		driver.findElement(selectDestns).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking On Get Direction");

		waitForClickabilityOf(get_Direction);
		
		driver.findElement(get_Direction).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking On Detail Route to See the Direction");

		waitForClickabilityOf(detailRoute);
		
		driver.findElement(detailRoute).click();
		
		Thread.sleep(2000);
		
		try {
			
			System.out.println("Getting Navigations");

			String nav1 = driver.findElement(route1).getText();
			
			String nav2 = driver.findElement(route2).getText();
			
			String nav3 = driver.findElement(route3).getText();
			
			Thread.sleep(2000);
			
			System.out.println("First Go "+nav1+" Then "+nav2+" And "+nav3);
			
		} catch (Exception e) {
			
		}
		
		Thread.sleep(2000);
		
		boolean Nav1 = driver.findElement(route1).isDisplayed();
		
		Thread.sleep(2000);
		
		if (Nav1==true) {
			
			System.out.println("Successfully Verified Way Finder Option");
			
		} else {
			
			System.out.println("Failed to verify Way Finder");

		}
		
		
		
		
		
		return new FloorMap(driver);
		
	}

}
