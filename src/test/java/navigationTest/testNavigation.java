package navigationTest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import navigation.navigationFlow;

public class testNavigation {
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
	
	@Test(priority=0, description="this will verify the stat pillar is working.")
	public void testStatPillarWorking() throws InterruptedException
	{
		navigationFlow navigation=new navigationFlow(driver);
		navigation.login();
		Thread.sleep(20000);
		navigation.clickOnStat();
	
		boolean actual=driver.findElementByXPath("//android.widget.TextView[@bounds='[258,117][774,194]']").isDisplayed();
		Assert.assertTrue(actual);
	
			}
	@Test(priority=1, description="this will verify the live pillar is working.")
	public void testLivePillarWorking() throws InterruptedException
	{
		
	navigationFlow navigation=new navigationFlow(driver);
		navigation.clickOnLive();
		boolean actual=driver.findElementByXPath("//android.widget.ImageView[@resource-id='com.imfootball:id/ivAddFriend']").isDisplayed();
		Assert.assertTrue(actual);
	}
	
	@Test(priority=2, description="this will verify the chat pillar is working.")
	public void testChatPillarWorking() throws InterruptedException
	{
		navigationFlow navigation=new navigationFlow(driver);
		navigation.clickOnChat();
		Thread.sleep(3000);
		
		boolean actual=driver.findElementByXPath("//android.widget.ImageButton[@resource-id='com.imfootball:id/fbStartConversation']").isDisplayed();
		Assert.assertTrue(actual);
	}
	@Test(priority=3, description="this will verify the news pillar is working.")
	public void testNewsPillarWorking() throws InterruptedException
	{
		navigationFlow navigation=new navigationFlow(driver);
		navigation.clickOnNews();
		Thread.sleep(3000);
		
		boolean actual=driver.findElementByXPath("//android.widget.TextView[@bounds='[497,117][630,194]']").isDisplayed();
		Assert.assertTrue(actual);
	}
	
	@Test(priority=4, description="this will verify the Get Chatting button is working.")
	public void testGetChattingWorking() throws InterruptedException
	{
		navigationFlow navigation=new navigationFlow(driver);
		navigation.clickOnLive();
		navigation.clickOnGetChat();
		navigation.clickOnPoppup();
		
		Thread.sleep(3000);
		
		boolean actual=driver.findElementByXPath("//android.widget.TextView[@resource-id='com.imfootball:id/tvAddFriend']").isDisplayed();
		Assert.assertTrue(actual);
	}

	
	@Test(priority=5, description="this will verify the my friends option is working, on menu screen.")
	public void myFriendsWorking() throws InterruptedException
	{
		navigationFlow navigation=new navigationFlow(driver);
		navigation.clickOnBack();
		navigation.clickOnMenu();
		Thread.sleep(5000);
		navigation.clickOnMyFriends();
		navigation.clickOnPoppup();
		
		
		Thread.sleep(3000);
		
		boolean actual=driver.findElementByXPath("//android.widget.TextView[@resource-id='com.imfootball:id/tvAddFriend']").isDisplayed();
		Assert.assertTrue(actual);
	}
	
	
	@Test(priority=6, description="this will verify the Get Friends is option is working,on menu.")
	public void getFriendsWorking() throws InterruptedException
	{
		navigationFlow navigation=new navigationFlow(driver);
		navigation.clickOnBack1();
		
		navigation.clickOnGetFriends();

		
		Thread.sleep(3000);
		
		boolean actual=driver.findElementByXPath("//android.widget.TextView[@resource-id='com.imfootball:id/tvToolBarSave']").isDisplayed();
		Assert.assertTrue(actual);
	}
	
	@Test(priority=7, description="this will verify the Football Gifs option is working,on menu.")
	public void footbalGifsWorking() throws InterruptedException
	{
		navigationFlow navigation=new navigationFlow(driver);
		navigation.clickOnBack1();
		
		navigation.clickOnFootballGifs();
		navigation.clickOnPopup1();
		
		
		boolean actual=driver.findElementByXPath("//android.widget.TextView[@bounds='[399,121][681,191]']").isDisplayed();
		Assert.assertTrue(actual);
	}
	
	
	@Test(priority=8, description="this will verify My Account option is working,on menu.")
	public void myAccountWorking() throws InterruptedException
	{
		navigationFlow navigation=new navigationFlow(driver);
		navigation.clickOnBack2();
		
		navigation.clickOnMyAccount();
		//navigation.clickOnPopup1();
		
		
		boolean actual=driver.findElementByXPath("//android.widget.TextView[@bounds='[446,117][682,194]']").isDisplayed();
		Assert.assertTrue(actual);
	}
	
	
	
	@Test(priority=9, description="this will verify Change Team option is working,on menu.")
	public void changeTeamWorking() throws InterruptedException
	{
		navigationFlow navigation=new navigationFlow(driver);
		navigation.clickOnBack1();
		navigation.changeTeam();
		//navigation.clickOnPopup1();
		
		boolean actual=driver.findElementByXPath("//android.widget.TextView[@bounds='[396,117][732,194]']").isDisplayed();
		Assert.assertTrue(actual);
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
