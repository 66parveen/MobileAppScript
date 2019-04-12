package testForgotPassword;

import org.testng.annotations.Test;
import org.testng.Assert;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import forgotPassword.forgotPassword;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class testForgotPassword {
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
			caps.setCapability("unicodeKeyboard", true);
			caps.setCapability("resetKeyboard", true);
			
		    driver =new AppiumDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"),caps);
		}
		
		@Test(priority=0,description="This test will verify that forgot password link is working.")
		public void testForgotPasswordLinkWorking() throws InterruptedException
		{
			forgotPassword forgot=new forgotPassword(driver);
            forgot.clickOnLoginLink();
			forgot.clickOnForgotPassword();
			
			boolean actual=driver.findElementByXPath("//android.widget.TextView[@resource-id='com.imfootball:id/tvToolBarTitleCenter']").isDisplayed();
			Assert.assertTrue(actual);
	   }

		@Test(priority=1,description="This test will verify that user is not able to reset password without email and mobile number.")
		public void testResetPasswordWithoutEmailAndMobile() throws InterruptedException
		{
			forgotPassword forgot=new forgotPassword(driver);
			forgot.clickOnResetPasswordButton();
			
			boolean actual=driver.findElementByXPath("//android.widget.TextView[@resource-id='com.imfootball:id/textinput_error']").isDisplayed();
	       Assert.assertTrue(actual);}
			
			
		@Test(priority=2,description="This test will verify that user is not able to reset password with invalid email.")
		public void testResetPasswordWithInvaidEmail() throws InterruptedException
		{
			forgotPassword forgot=new forgotPassword(driver);
			forgot.enterInvaidEmail();
			forgot.entervalidMobile();
			forgot.clickOnResetPasswordButton();
			
			boolean actual=driver.findElementByXPath("//android.widget.TextView[@resource-id='com.imfootball:id/textinput_error']").isDisplayed();
			Assert.assertTrue(actual);
			}
		
		@Test(priority=3,description="This test will verify that user is not able to reset password without password.")
		public void testResetPasswordWithoutPassword() throws InterruptedException
		{
			forgotPassword forgot=new forgotPassword(driver);
			forgot.clearmobile();
			forgot.emailClear();
			forgot.enterValidEmail();
			forgot.clickOnResetPasswordButton();
			
			boolean actual=driver.findElementByXPath("//android.widget.TextView[@resource-id='com.imfootball:id/textinput_error']").isDisplayed();
			Assert.assertTrue(actual);
			}
		
		@Test(priority=4,description="This test will verify that user is able to redirect to new password screen entring valid email and mobile number.")
		public void testResetPasswordWithValidEmailAndMobile() throws InterruptedException
		{
			forgotPassword forgot=new forgotPassword(driver);
	        forgot.entervalidMobile();
			forgot.clickOnResetPasswordButton();
			
			boolean actual=driver.findElementByXPath("//android.widget.TextView[@bounds='[216,117][1080,194]']").isDisplayed();
			Assert.assertTrue(actual);
	   }
		
		@Test(priority=5, description="This test will verify that user is not able to redirect to new password screen on entering invalid pin.")
		public void testResetPasswordWithInvalidPin() throws InterruptedException
		{
			forgotPassword forgot=new forgotPassword(driver);
	        forgot.enterInvalidPin();
	        
	        boolean actual=driver.findElementByXPath("//android.widget.Button[@resource-id='android:id/button1']").isDisplayed();
	        Assert.assertTrue(actual);
			
		}
		@Test(priority=6, description="This test will verify that user is  able to redirect to new password screen on entering invalid pin.")
		public void testResetPasswordWithValidPin() throws InterruptedException
		{
			forgotPassword forgot=new forgotPassword(driver);
			forgot.closePopup();
			forgot.clearInvalidPin();
	        forgot.enterValidPin();
	    
	        boolean actual=driver.findElementByXPath("//android.widget.Button[@resource-id='com.imfootball:id/btnchangelogin']").isDisplayed();
			 Assert.assertTrue(actual);
}


@Test(priority=7, description="This test will verify that information iocn is working.")
public void testInformationIconWorking() throws InterruptedException
{
	forgotPassword forgot=new forgotPassword(driver);
    forgot.clickOnInformationIcon();
    
    boolean actual=driver.findElementByXPath("//android.widget.ImageView[@resource-id='com.imfootball:id/ivCross']").isDisplayed();
	Assert.assertTrue(actual);
}


@Test(priority=8, description="This test will verify that user is not able to reset password without new password.")
public void testResetPasswordWithoutNewPassword() throws InterruptedException
{
	forgotPassword forgot=new forgotPassword(driver);
	forgot.clickOnCrossIcon();
    forgot.enterConfirmPassword();
    forgot.clickOnChangeAndLogin();
    
    boolean actual=driver.findElementByXPath("//android.widget.TextView[@resource-id='com.imfootball:id/textinput_error']").isDisplayed();
	Assert.assertTrue(actual);
}

@Test(priority=9, description="This test will verify that user is not able to reset password without confirm password.")
public void testResetPasswordWithoutConfirmPassword() throws InterruptedException
{
	forgotPassword forgot=new forgotPassword(driver);
	forgot.clearConfirmPassword();
    forgot.enterNewPassword();
    forgot.clickOnChangeAndLogin();
    
    boolean actual=driver.findElementByXPath("//android.widget.TextView[@resource-id='com.imfootball:id/textinput_error']").isDisplayed();
	Assert.assertTrue(actual);
}

@Test(priority=10, description="This test will verify that user is not able to reset password when new password and confirm password is not matched.")
public void testResetPasswordNewAndConfirmNotMatch() throws InterruptedException
{
	forgotPassword forgot=new forgotPassword(driver);
    forgot.enterInvalidPass();
    forgot.clickOnChangeAndLogin();
    
    boolean actual=driver.findElementByXPath("//android.widget.TextView[@resource-id='com.imfootball:id/textinput_error']").isDisplayed();
	Assert.assertTrue(actual);
}

@Test(priority=11, description="This test will verify that user is able to reset password when new password and confirm password is  matched.")
public void testResetPasswordNewAndConfirmMatch() throws InterruptedException
{
	forgotPassword forgot=new forgotPassword(driver);
    forgot.enterValidNewPass();
    forgot.enterVaidConfirm();
    forgot.clickOnChangeAndLogin();
  
    boolean actual=driver.findElementByXPath("//android.widget.ImageView[@resource-id='com.imfootball:id/ivAddFriend']").isDisplayed();
	Assert.assertTrue(actual);}
}


