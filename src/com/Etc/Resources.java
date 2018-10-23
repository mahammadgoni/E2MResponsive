package com.Etc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.BaseSetup.BaseSetUp;

public class Resources extends BaseSetUp{
	
	By menuBtn = By.xpath("//button[@id='open-button']");
	
	By etc = By.xpath("//*[@class='menu-group']//a[4]");
	
//	Floor Map Elements
	
	By floorMap = By.xpath("//span[contains(text(),'Floor Map')]");
	

	public Resources(WebDriver driver) {
		super(driver);
		
	}

}
