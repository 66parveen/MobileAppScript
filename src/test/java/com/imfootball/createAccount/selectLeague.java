package com.imfootball.createAccount;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class selectLeague{
	
    AppiumDriver<MobileElement>driver;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@bounds='[60,629][1050,778]']")
	MobileElement leagueName;
	
	public selectLeague(AppiumDriver<MobileElement>driver)
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	public void clickOnLeagueName() throws InterruptedException
	{
		utility.waitHelper.clickOn(driver, leagueName, 5, null);
		
	}
	
	
	

}
