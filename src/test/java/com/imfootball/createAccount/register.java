package com.imfootball.createAccount;

import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class register {
	AppiumDriver<MobileElement>driver;
	
	@AndroidFindBy(xpath="//android.widget.Button[@resource-id='com.imfootball:id/btnRegister']")
	MobileElement registerButton;
	@AndroidFindBy(xpath="//android.widget.EditText[@resource-id='com.imfootball:id/textInputFirstname']")
	MobileElement firstNameField;
	@AndroidFindBy(xpath="//android.widget.EditText[@resource-id='com.imfootball:id/textInputLastname']")
	MobileElement lastNameField;
	@AndroidFindBy(xpath="//android.widget.Button[@resource-id='android:id/button1']")
	MobileElement popupR;
	@AndroidFindBy(xpath="//android.widget.EditText[@resource-id='com.imfootball:id/textInputEmail']")
	MobileElement EmailField;
	@AndroidFindBy(xpath="//android.widget.EditText[@resource-id='com.imfootball:id/textInputDob']")
	MobileElement DOBField;
	@AndroidFindBy(xpath="//android.widget.Button[@resource-id='android:id/button1']")
	MobileElement DOBpopup;
	@AndroidFindBy(xpath="//android.widget.EditText[@resource-id='com.imfootball:id/textInputPassword']")
	MobileElement passwordField;
	@AndroidFindBy(xpath="//android.widget.ImageView[@resource-id='com.imfootball:id/iv_InfoDialog']")
	MobileElement InformationIcon;
	
	
	public register(AppiumDriver<MobileElement>driver)
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	public void clickRegiterButton() throws InterruptedException
	{
		utility.waitHelper.clickOn(driver, registerButton, 5, null);

	}
	
	public void enterFirstName() throws Exception
	{ 
		utility.waitHelper.clickOn(driver, popupR, 5, null);
        utility.waitHelper.sendKeys(driver, firstNameField, 5, null);
	
	}
	
	public void enterLastName()
	{  utility.waitHelper.clickOn(driver, popupR, 5, null);
	   utility.waitHelper.sendKeys(driver, lastNameField, 5, "Dev.");
	   utility.waitHelper.clickOn(driver, popupR, 5, null);
	}
	
	public void enterInvalidEmail()
	{ 
		utility.waitHelper.sendKeys(driver, popupR, 5, null);
		utility.waitHelper.sendKeys(driver, EmailField, 5, "meritesting");	
	}
	
    public void enterValidEmail()
    {
     utility.waitHelper.clickOn(driver, popupR, 5, null);	
     EmailField.clear();
     utility.waitHelper.sendKeys(driver, EmailField, 5, "aaa@test.com");
     
	}
    
    public void selectDOB()
    {  
      utility.waitHelper.clickOn(driver, popupR, 5, null);
       utility.waitHelper.clickOn(driver, DOBField, 5, null);
       utility.waitHelper.clickOn(driver, DOBpopup, 5, null);
     }
    
    public void enterInvalidPassword1()
    {  
    	utility.waitHelper.clickOn(driver, popupR, 5, null);
    	utility.waitHelper.sendKeys(driver, passwordField, 5, "kabir123");
    	
    }
    
    public void enterInvalidPassword2()
    {
    	utility.waitHelper.clickOn(driver, popupR, 5, null);
    	utility.waitHelper.sendKeys(driver, passwordField, 5, "kabir");
    	
    }
    
    public void enterInvalidPassword3()
    { 
    	utility.waitHelper.clickOn(driver, popupR, 5, null);
    	utility.waitHelper.sendKeys(driver, passwordField, 5, "Kabir12");
    	
    }
    
    public void clickOnInformationIcon()
    {  
    	utility.waitHelper.clickOn(driver, popupR, 5, null);
    	utility.waitHelper.clickOn(driver, InformationIcon, 5, null);
    	
    	
    }

}
