package com.imfootball.createAccount;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class verifyMobileNumber {
	AppiumDriver<MobileElement>driver;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@resource-id='com.imfootball:id/otp_one_edit_text']")
	MobileElement edtbox1;
	@AndroidFindBy(xpath="//android.widget.EditText[@resource-id='com.imfootball:id/otp_two_edit_text']")
	MobileElement edtbox2;
	@AndroidFindBy(xpath="//android.widget.EditText[@resource-id='com.imfootball:id/otp_three_edit_text']")
	MobileElement edtbox3;
	@AndroidFindBy(xpath="//android.widget.EditText[@resource-id='com.imfootball:id/otp_four_edit_text']")
	MobileElement edtbox4;
	
	@AndroidFindBy(xpath="//android.widget.Button[@resource-id='android:id/button1']")
	MobileElement popup;
	
	
	public verifyMobileNumber(AppiumDriver<MobileElement>driver)
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	public void enterInvalidPin()
	{ 
		utility.waitHelper.sendKeys(driver, edtbox1, 3, "1");
		utility.waitHelper.sendKeys(driver, edtbox2, 3, "1");
		utility.waitHelper.sendKeys(driver, edtbox3, 3, "1");
		utility.waitHelper.sendKeys(driver, edtbox4, 3, "1");
	
	}
	
	public void enterValidPin() throws InterruptedException
	{
		utility.waitHelper.clickOn(driver, popup, 5, null);
		
		edtbox1.clear();
		edtbox2.clear();
		edtbox3.clear();
		edtbox4.clear();
		
		utility.waitHelper.sendKeys(driver, edtbox1, 3, "1");
		utility.waitHelper.sendKeys(driver, edtbox2, 3, "4");
		utility.waitHelper.sendKeys(driver, edtbox3, 3, "7");
		utility.waitHelper.sendKeys(driver, edtbox4, 3, "1");
	
		
	}
	

}
