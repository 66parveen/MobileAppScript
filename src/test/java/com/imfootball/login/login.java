package com.imfootball.login;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class login {
AppiumDriver<MobileElement>driver;
	
	@AndroidFindBy(xpath="//android.widget.Button[@resource-id='com.imfootball:id/btnLogin']")
	MobileElement loginLink;
	@AndroidFindBy(xpath="//android.widget.EditText[@resource-id='com.imfootball:id/edusername']")
	MobileElement emailField;
	@AndroidFindBy(xpath="//android.widget.EditText[@resource-id='com.imfootball:id/edpassword']")
	MobileElement passwordField;
	@AndroidFindBy(xpath="//android.widget.Button[@resource-id='com.imfootball:id/btnLogin']")
	MobileElement loginButton;
	
	
	public login(AppiumDriver<MobileElement>driver)
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	
    public void clickOnLoginLink() 
    {
     utility.waitHelper.clickOn(driver, loginLink, 5, null);
	
    }
    
    
    public void clickOnLoginButton() 
    {
    	utility.waitHelper.clickOn(driver, loginButton, 5, null);
	    
    }
    
   public void enterEmail()
   {
	   utility.waitHelper.sendKeys(driver, emailField, 5, "pap@test.com");
	  
    }
   
   public void enterInvalidEmail()
   {
	  utility.waitHelper.sendKeys(driver, emailField, 2, "paptest.com");
	  
   }
   
   public void enterInvalidPassword()
   {
	   utility.waitHelper.sendKeys(driver, passwordField, 2, "ios");
	   
   }
   
   public void enterPassword()
   {
	   utility.waitHelper.sendKeys(driver, passwordField, 5, "Kabir123");
	  passwordField.sendKeys("Ios@1234");
   }
   
   
   public void clearPassword()
   {
	 passwordField.clear();  
	      
   }
  
   public void blankEmail()
   {
	 emailField.clear();
   }

   }
