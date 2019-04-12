package com.imfootball.createAccount;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class selectDomesticTeam {
	AppiumDriver<MobileElement>driver;
	
	@AndroidFindBy(xpath="//android.widget.ImageView[@resource-id='com.imfootball:id/ivToolBarSearchIcon']")
	MobileElement searchIcon;
	@AndroidFindBy(xpath="//android.widget.EditText[@resource-id='com.imfootball:id/etToolBarSearch']")
	MobileElement domesticTeamName;
	@AndroidFindBy(xpath="//android.widget.TextView[@resource-id='com.imfootball:id/tvUserData']")
	MobileElement searchResult;
	
	public selectDomesticTeam(AppiumDriver<MobileElement>driver)
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	public void clickOnSearchIcon() throws InterruptedException
	{
		utility.waitHelper.clickOn(driver, searchIcon, 5, null);
		
	}
	
	public void typeDomesticTeamName() throws InterruptedException
	{
		utility.waitHelper.sendKeys(driver, domesticTeamName, 5, null);
	
	}
	
	public void clickOnSearchResult() throws InterruptedException
	{
		utility.waitHelper.clickOn(driver, searchResult, 5, null);
		
	}
	
}
