package com.Agenda;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.BaseSetup.BaseSetUp;

public class Schedule extends BaseSetUp{
	
	
	
	By menuBtn = By.xpath("//button[@id='open-button']");
	
	By agendaOption = By.xpath("//*[@class='menu-group']//a[1]");
	
	By schedule = By.xpath("//a[@class='active']//span[@class='submenu-title'][contains(text(),'Schedule')]");
	
//	Time Tab Elements
	
	By timeTab = By.xpath("//a[@href='/Sessions/Index/']");
	
	By session1st = By.xpath("//div[@class='accordion-hld sessionlistcontainer']//ul[1]/li[1]");
	
	By bookmark = By.xpath("//li[@class='icon-bookmark1-hld']");
	
	By rate = By.xpath("//div[@class='ac-iconinlie-hld']/ul/li[3]");
	
	By resources = By.xpath("//div[@class='ac-iconinlie-hld']/ul/li[4]");
	
	By takeNote = By.xpath("//div[@class='ac-iconinlie-hld']/ul/li[5]");
	
	By askAQuestion = By.xpath("//div[@class='ac-iconinlie-hld']/ul/li[6]");
	
	By vote = By.xpath("//div[@class='ac-iconinlie-hld']/ul/li[7]");
	
	By checkIn = By.xpath("//div[@class='ac-iconinlie-hld']/ul/li[8]");
	
	By addToAgenda = By.xpath("//div[@class='ac-iconinlie-hld']/ul/li[9]");
	
	
	
	By trackTab = By.xpath("//a[@href='/Sessions/Tracks/']");
	
	By myAgenda = By.xpath("//a[@href='/Sessions/MyAgenda/']");

	
	
	

	public Schedule(WebDriver driver) {
		super(driver);
		
	}
	

}
