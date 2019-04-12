package com.imfootball.createAccount;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class selectInternationalTeam {
    
	AppiumDriver<MobileElement>driver;
	
	@AndroidFindBy(xpath="//android.widget.ImageView[@resource-id='com.imfootball:id/ivToolBarSearchIcon']")
	MobileElement searchIcon;
	@AndroidFindBy(xpath="//android.widget.EditText[@resource-id='com.imfootball:id/etToolBarSearch']")
	MobileElement internationaTeamName;
	@AndroidFindBy(xpath="//android.widget.TextView[@resource-id='com.imfootball:id/tvUserData']")
	MobileElement searchResult;
	
	
	
	public selectInternationalTeam(AppiumDriver<MobileElement>driver)
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	
	public void clickSearchIcon() throws InterruptedException
	{   
		utility.waitHelper.clickOn(driver, searchIcon, 5, null);
	
	}
	
	
	public void searchInternationalTeam() throws InterruptedException
	{
		utility.waitHelper.clickOn(driver, internationaTeamName, 5, null);
		
	}
	
	
	public void clickSearchResult() throws InterruptedException
	{
		utility.waitHelper.clickOn(driver, searchResult, 5, null);
		
	}
	

}
