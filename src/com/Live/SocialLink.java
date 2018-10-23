package com.Live;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.BaseSetup.BaseSetUp;

public class SocialLink extends BaseSetUp{
	
	By menuBtn = By.xpath("//button[@id='open-button']");
	
	By liveOption = By.xpath("//*[@class='menu-group']//a[2]");
	
	By socialLink = By.xpath("//span[contains(text(),'Social Link')]");
	
	

	public SocialLink(WebDriver driver) {
		super(driver);
		
	}

}
