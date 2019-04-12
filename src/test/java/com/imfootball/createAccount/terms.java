package com.imfootball.createAccount;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class terms {
	
    AppiumDriver<MobileElement>driver;
	
	@AndroidFindBy(xpath="//android.widget.Button[@resource-id='com.imfootball:id/btnAgreeContinue']")
	MobileElement continue1;
	@AndroidFindBy(xpath="//android.widget.Button[@resource-id='com.imfootball:id/btnAgreeContinue']")
	MobileElement continue2;

	public terms(AppiumDriver<MobileElement>driver)
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	public void clickContinue1() throws InterruptedException
	{
       utility.waitHelper.clickOn(driver, continue1, 3, null);
     
	}
	
	public void clickContinue2() throws InterruptedException
	{
		utility.waitHelper.clickOn(driver, continue2, 3,null);
		
	}

}
