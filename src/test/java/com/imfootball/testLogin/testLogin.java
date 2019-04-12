package com.imfootball.testLogin;

import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import com.imfootball.login.login;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class testLogin {
	 AppiumDriver<MobileElement>driver;
	    
	
		@BeforeTest
		public void setUp() throws MalformedURLException
		{
			DesiredCapabilities caps=new DesiredCapabilities();
			caps.setCapability("deviceName","LGK53521d14829");
			caps.setCapability("platformName","Android");
			caps.setCapability("platformVersion","6.0.1");
			caps.setCapability("appPackage","com.imfootball");
			caps.setCapability("appActivity","com.imfootball.ui.activities.SplashActivity");
			//caps.setCapability("unicodeKeyboard", true);
			//caps.setCapability("resetKeyboard", true);
			
		    driver =new AppiumDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"),caps);
		}

@Test(priority=0,description="this test willl verify the login flow without username and password")
public void testloginWithoutEmailAndPassword()
{
	login log=new login(driver);
	log.clickOnLoginLink();
	log.clickOnLoginButton();
	
	boolean actual=driver.findElementByXPath("//android.widget.TextView[@resource-id='com.imfootball:id/textinput_error']").isDisplayed();
	Assert.assertTrue(actual);
}

@Test(priority=1,description="this test willl verify the login flow with email only.")
public void testloginWithEmailOnly()
{
	login log=new login(driver);
	log.enterEmail();
	log.clickOnLoginButton();
	
	boolean actual=driver.findElementByXPath("//android.widget.TextView[@resource-id='com.imfootball:id/textinput_error']").isDisplayed();
	Assert.assertTrue(actual);
}

@Test(priority=2,description="this test willl verify the login flow with password only.")
public void testloginWithPasswordOnly()
{
	login log=new login(driver);
    log.enterPassword();
    log.blankEmail();
	log.clickOnLoginButton();
	
	boolean actual=driver.findElementByXPath("//android.widget.TextView[@resource-id='com.imfootball:id/textinput_error']").isDisplayed();
	Assert.assertTrue(actual);
}

@Test(priority=3,description="this test willl verify the login flow with invalid email")
public void testloginWithInvalidEmail()
{
	login log=new login(driver);
	log.enterInvalidEmail();
    log.enterPassword();
	log.clickOnLoginButton();
	
	boolean actual=driver.findElementByXPath("//android.widget.TextView[@resource-id='com.imfootball:id/textinput_error']").isDisplayed();
	Assert.assertTrue(actual);
}

@Test(priority=4,description="this test willl verify the login flow with invalid password")
public void testloginWithInvalidPassword()
{
	login log=new login(driver);
	log.blankEmail();
	log.enterEmail();
    log.enterInvalidPassword();
	log.clickOnLoginButton();
	
	boolean actual=driver.findElementByXPath("//android.widget.TextView[@resource-id='com.imfootball:id/textinput_error']").isDisplayed();
	Assert.assertTrue(actual);
}

@Test(priority=5,description="this test willl verify the login flow with valid username and password.")
public void testloginWithValidUsernameAndPassword() throws InterruptedException
{
	login log=new login(driver);
	log.clearPassword();
	log.enterPassword();
	log.clickOnLoginButton();
	
	
	boolean actual=driver.findElementByXPath("//android.widget.ImageView[@resource-id='com.imfootball:id/ivAddFriend']").isDisplayed();
	Assert.assertTrue(actual);
}

}
