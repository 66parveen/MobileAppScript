package navigation;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class navigationFlow {
	AppiumDriver<MobileElement>driver;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@bounds='[102,1733][166,1782]']")
	MobileElement live;
	@AndroidFindBy(xpath="//android.widget.TextView[@bounds='[363,1733][447,1782]']")
	MobileElement stat;	
	
	@AndroidFindBy(xpath="//android.widget.TextView[@bounds='[637,1733][712,1782]']")
	MobileElement chat;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@bounds='[899,1733][990,1782]']")
	MobileElement news;
	@AndroidFindBy(xpath="//android.widget.Button[@resource-id='com.imfootball:id/btnGetChat']")
	MobileElement getChat;
	
	@AndroidFindBy(xpath="//android.widget.Button[@resource-id='com.imfootball:id/btnLogin']")
	MobileElement login;
	@AndroidFindBy(xpath="//android.widget.EditText[@resource-id='com.imfootball:id/edusername']")
	MobileElement email;
	@AndroidFindBy(xpath="//android.widget.EditText[@resource-id='com.imfootball:id/edpassword']")
	MobileElement password;
	@AndroidFindBy(xpath="//android.widget.Button[@resource-id='com.imfootball:id/btnLogin']")
	MobileElement Login;
	
	
	@AndroidFindBy(xpath="//android.widget.Button[@resource-id='android:id/button2']")
	MobileElement popup;
	
	@AndroidFindBy(xpath="//android.widget.ImageView[@bounds='[48,120][120,192]']")
	MobileElement menu;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@bounds='[75,945][1065,1095]']")
	MobileElement myFriends;
	
	@AndroidFindBy(xpath="//android.widget.ImageView[@bounds='[30,117][120,207]']")
	MobileElement back;
	
	@AndroidFindBy(xpath="//android.widget.ImageView[@bounds='[48,94][171,217]']") 
	MobileElement back1;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@bounds='[75,1095][1065,1245]']")
	MobileElement getFriends;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@bounds='[75,1275][1065,1415]']")
	MobileElement footballGifs;
	

	@AndroidFindBy(xpath="//android.widget.Button[@resource-id='com.android.packageinstaller:id/permission_allow_button']")
	MobileElement popup1;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@bounds='[75,1415][1065,1555]']")
	MobileElement myAccount;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@bounds='[75,1555][1065,1695]']")
	MobileElement changeTeam;
	
	
	@AndroidFindBy(xpath="//android.widget.ImageButton[@bounds='[0,72][168,240]']")
	MobileElement back2;
	
	//Using=xpath, value=//android.widget.TextView[@bounds='[338,117][693,194]']
	
	public navigationFlow(AppiumDriver<MobileElement>driver)
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	
	public void login()
	{
		login.click();
		email.sendKeys("football@test.com");
		password.sendKeys("Kabir123");
		Login.click();
		
	}
	
   public void clickOnLive()
   {
	live.click();
   }
  public void clickOnStat()
  {
	stat.click();
	
  }
  
  public void clickOnChat()
  {
	chat.click();
  }
 public void clickOnNews()
 {
	news.click();
 }
 
 public void clickOnGetChat()
 {
	getChat.click();
 }
 
 
 public void clickOnPoppup()
 {popup.click();
 }
 
 public void clickOnMenu()
 {
	 menu.click();
	 
	 
 }
 
 public void clickOnMyFriends()
 {
	 myFriends.click();
	 }
 
 public void clickOnBack()
 {
	 back.click();
	 
 }
 public void clickOnBack1()
 {
 back1.click();
	 
 }
 public void clickOnBack2()
 {
 back2.click();
	 
 }
 
 
 public void clickOnPopup1()
 {
	 popup1.click();
	 
	 
 }

 public void clickOnGetFriends()
 {
	getFriends.click();
	 
 }
 
 public void clickOnFootballGifs()
 {
	footballGifs.click();
	 
 }
 
 public void clickOnMyAccount()
 {
	 
	 myAccount.click();
	 
	 
 }
 
 public void changeTeam()
 {
	 
	 changeTeam.click();
	 
	 
 }
 
 

 }