package com.imfootball.testCreateAccount;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.Assert;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import com.imfootball.createAccount.completeYourReg;
import com.imfootball.createAccount.enterYourNumber;
import com.imfootball.createAccount.landingScreen;
import com.imfootball.createAccount.register;
import com.imfootball.createAccount.selectDomesticTeam;
import com.imfootball.createAccount.selectInternationalTeam;
import com.imfootball.createAccount.selectLeague;
import com.imfootball.createAccount.terms;
import com.imfootball.createAccount.verifyMobileNumber;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class VerifyCreateAccount {
	
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
		
	@Test(priority=0, description="This test will verify CreateAccount button is working.")
	public void testCreateAccountButtonWorking()
	{
		landingScreen screen=new landingScreen(driver);
		screen.clickCreateAccount();
		boolean actual= driver.findElementByXPath("//android.widget.TextView[@resource-id='com.imfootball:id/tvToolBarTitle']").isDisplayed();
		Assert.assertTrue(actual);
    }
	
	@Test(priority=1, description="This test will verify that user is able to select the international team.")
	public void testInternationalTeamSelected() throws InterruptedException
	{
	  selectInternationalTeam internationalteam =new selectInternationalTeam(driver);
	  internationalteam.clickSearchIcon();
	  internationalteam.searchInternationalTeam();
	  internationalteam.clickSearchResult();
	  
	  boolean actual= driver.findElementByXPath("//android.widget.TextView[@resource-id='com.imfootball:id/tvHeaderTitle']").isDisplayed();
	  Assert.assertTrue(actual);
	}
	
	@Test(priority=2, description="This test will verify that user is able to select the league.")
	public void testLeagueSelected() throws InterruptedException
	{ 
	  selectLeague league=new selectLeague(driver);
	  league.clickOnLeagueName();
	  
	  boolean actual= driver.findElementByXPath("//android.widget.TextView[@resource-id='com.imfootball:id/tvleagueName']").isDisplayed();
	  Assert.assertTrue(actual);
	}
	
	
	@Test(priority=3, description="This test will verify that user is able to select the domestic team.")
	public void testDomesticTeamSelected() throws InterruptedException
	{ 
		 
		selectDomesticTeam domestic=new selectDomesticTeam(driver);
		domestic.clickOnSearchIcon();
		domestic.typeDomesticTeamName();
		domestic.clickOnSearchResult();
	  
	    boolean actual= driver.findElementByXPath("//android.widget.Button[@resource-id='com.imfootball:id/btnAgreeContinue']").isDisplayed();
	    Assert.assertTrue(actual);
	}
	
	@Test(priority=4, description="This test will verify that user is able to accept the terms and conditions.")
	public void testTermsCondAccpeted() throws InterruptedException
	{ 
	    terms term=new terms(driver);
	    term.clickContinue1();
	    term.clickContinue2();
		 
		boolean actual= driver.findElementByXPath("//android.widget.TextView[@bounds='[216,117][1080,194]']").isDisplayed();
	    Assert.assertTrue(actual);
	}
	
	@Test(priority=5, description="This test will verify user is not able to create account without mobile number")
	public void testCreateAccountWithoutMobileNumber() throws InterruptedException
	{  
	  
	    enterYourNumber number=new enterYourNumber(driver);
		number.clickOnNext();
		
		boolean actual=driver.findElementByXPath("//android.widget.Button[@resource-id='android:id/button1']").isDisplayed();
		Assert.assertTrue(actual);
	}
	
	@Test(priority=6, description="This test will verify user is able to move forward with valid mobile number")
	public void testCreateAccountWithValidMobileNumber() throws InterruptedException
	{  
	  
	    enterYourNumber number=new enterYourNumber(driver);
		number.enterValidMobileNumber();
		number.clickOnNext();
		
		boolean actual=driver.findElementByXPath("//android.widget.TextView[@bounds='[216,117][1080,194]']").isDisplayed();
		Assert.assertTrue(actual);
	}

	@Test(priority=7, description="This test will verify user is able to move forward with invalid pin")
	public void testCreateAccountWithInvalidPin() throws InterruptedException
	{  
	  verifyMobileNumber verifynum=new verifyMobileNumber(driver);
	  verifynum.enterInvalidPin();
	  
	   boolean actual=driver.findElementByXPath("//android.widget.TextView[@bounds='[75,790][1005,969]']").isDisplayed();
	   Assert.assertTrue(actual);
	}
	
	
	@Test(priority=8, description="This test will verify user is able to move forward with valid pin")
	public void testCreateAccountWithValidPin() throws InterruptedException
	{    
	  verifyMobileNumber verifynum=new verifyMobileNumber(driver);
	  verifynum.enterValidPin();
	  
	  boolean actual=driver.findElementByXPath("//android.widget.LinearLayout[@bounds='[82,540][997,690]']").isDisplayed();
	  Assert.assertTrue(actual);
	}
	
	@Test(priority=9, description="This test will verify manualRegiter link working.")
	public void testManualRegiterLinkWorking() throws InterruptedException
	{    
	 completeYourReg reg=new completeYourReg(driver);
	 reg.clickManualRegisterLink();
	 
	  boolean actual=driver.findElementByXPath("//android.widget.Button[@resource-id='com.imfootball:id/btnRegister']").isDisplayed();
	  Assert.assertTrue(actual);
	}
	
	@Test(priority=10, description="This test will verify user is not able to create Accouont without details")
	public void testCreateAccountWithoutDetails() throws InterruptedException
	{    
	 register reg=new register(driver);
	 reg.clickRegiterButton();
	 
	
	  boolean actual=driver.findElementByXPath("//android.widget.Button[@resource-id='android:id/button1']").isDisplayed();
	  Assert.assertTrue(actual);
	}
	
	
	@Test(priority=11, description="This test will verify user is not able to create Accouont with only firstname")
	public void testCreateAccountWithFirstNameOnly() throws Exception
	{    
		
	 register reg=new register(driver);
	 reg.enterFirstName();
	 reg.clickRegiterButton();
	
	  
	  boolean actual=driver.findElementByXPath("//android.widget.Button[@resource-id='android:id/button1']").isDisplayed();
	  Assert.assertTrue(actual);
	}
	
	@Test(priority=12, description="This test will verify user is not able to create Accouont with first and last name")
	public void testCreateAccountWithFirstAndLastNameOnly() throws InterruptedException
	{    

     register reg=new register(driver);
	 reg.enterLastName();
	 reg.clickRegiterButton();
	  
	 boolean actual=driver.findElementByXPath("//android.widget.Button[@resource-id='android:id/button1']").isDisplayed();
	  Assert.assertTrue(actual);
	}
	
	@Test(priority=13, description="This test will verify user is not able to create Accouont without email")
	public void testCreateAccountWithoutEmail() throws InterruptedException
	{    

		 register reg=new register(driver);
		 reg.clickRegiterButton();
	  
	 boolean actual=driver.findElementByXPath("//android.widget.Button[@resource-id='android:id/button1']").isDisplayed();
	 Assert.assertTrue(actual);
	}
	
	@Test(priority=14, description="This test will verify user is not able to create Accouont with invalid email")
	public void testCreateAccountWithInvalidEmail() throws InterruptedException
	{    
     register reg=new register(driver);
	 reg.enterInvalidEmail();
	 reg.clickRegiterButton();
	  
	 boolean actual=driver.findElementByXPath("//android.widget.Button[@resource-id='android:id/button1']").isDisplayed();
	 Assert.assertTrue(actual);
	}
	

	@Test(priority=15, description="This test will verify user is not able to create Accouont without DOB")
	public void testCreateAccountWithoutDOB() throws InterruptedException
	{    

	 register reg=new register(driver);
	 reg.enterValidEmail();
	 reg.clickRegiterButton();
	  
	 boolean actual=driver.findElementByXPath("//android.widget.Button[@resource-id='android:id/button1']").isDisplayed();
	 Assert.assertTrue(actual);
	}
	
	
	@Test(priority=16, description="This test will verify user is not able to create Accouont without password.")
	public void testCreateAccountWithoutPassword() throws InterruptedException
	{    
     register reg=new register(driver);
	 reg.selectDOB();
	 reg.clickRegiterButton();
	 
	 boolean actual=driver.findElementByXPath("//android.widget.Button[@resource-id='android:id/button1']").isDisplayed();
	 Assert.assertTrue(actual);
	}
	
	
	@Test(priority=17, description="This test will verify user is not able to create Accouont with first invalid password criteria.")
	public void testCreateAccountWithInvaidPasswordCriteria() throws InterruptedException
	{    
     register reg=new register(driver);
	reg.enterInvalidPassword1();
    reg.clickRegiterButton();
	 
	 boolean actual=driver.findElementByXPath("//android.widget.Button[@resource-id='android:id/button1']").isDisplayed();
	 Assert.assertTrue(actual);
	}
	
	
	@Test(priority=18, description="This test will verify user is not able to create Accouont with second invalid password criteria.")
	public void testCreateAccountWith2ndInvaidPasswordCriteria() throws InterruptedException
	{    
     register reg=new register(driver);
	reg.enterInvalidPassword2();
    reg.clickRegiterButton();
	 
	 boolean actual=driver.findElementByXPath("//android.widget.Button[@resource-id='android:id/button1']").isDisplayed();
	 Assert.assertTrue(actual);
	}
	
	
	@Test(priority=19, description="This test will verify user is not able to create Accouont with third invalid password criteria.")
	public void testCreateAccountWith3rdInvaidPasswordCriteria() throws InterruptedException
	{    
     register reg=new register(driver);
	reg.enterInvalidPassword3();
    reg.clickRegiterButton();
	 
	 boolean actual=driver.findElementByXPath("//android.widget.Button[@resource-id='android:id/button1']").isDisplayed();
	 Assert.assertTrue(actual);
	}
	
	
	@Test(priority=20, description="This test will verify that information icon is working.")
	public void testInformationIconWorking() throws InterruptedException
	{    
     register reg=new register(driver);
     reg.clickOnInformationIcon();
     
	 boolean actual=driver.findElementByXPath("//android.widget.ImageView[@resource-id='com.imfootball:id/ivCross']").isDisplayed();
	 Assert.assertTrue(actual);
	}
	

}

