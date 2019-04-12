package com.imfootball.createAccount;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class completeYourReg {
	AppiumDriver<MobileElement>driver;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@resource-id='com.imfootball:id/tvManual']")
	MobileElement link;
	
	
	public completeYourReg(AppiumDriver<MobileElement>driver)
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}



public void clickManualRegisterLink()
{
    utility.waitHelper.clickOn(driver,link, 5, null);
}
}