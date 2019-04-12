package com.imfootball.createAccount;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class enterYourNumber {
	  AppiumDriver<MobileElement>driver;
		
		@AndroidFindBy(xpath="//android.widget.Button[@resource-id='com.imfootball:id/btnNext']")
		MobileElement next;
		@AndroidFindBy(xpath="//android.widget.EditText[@resource-id='com.imfootball:id/editTextPhoneNo']")
		MobileElement editbox1;
		@AndroidFindBy(xpath="//android.widget.Button[@resource-id='android:id/button1']")
		MobileElement popup;
		
		
		
		public enterYourNumber(AppiumDriver<MobileElement>driver)
		{
			PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		}
		
		public void clickOnNext() throws InterruptedException
		{
			utility.waitHelper.clickOn(driver, next, 5, null);
		}
	
		public void enterValidMobileNumber()
		{
			utility.waitHelper.clickOn(driver, popup, 5, null);
			utility.waitHelper.sendKeys(driver, editbox1, 5, "8352888633");
			
		}
}
