package forgotPassword;

import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class forgotPassword {
	AppiumDriver<MobileElement>driver;
	
	@AndroidFindBy(xpath="//android.widget.Button[@resource-id='com.imfootball:id/btnLogin']")
	MobileElement loginLink;
	@AndroidFindBy(xpath="//android.widget.TextView[@resource-id='com.imfootball:id/tvForgotPassword']")
	MobileElement forgotPasswordLink;
	@AndroidFindBy(xpath="//android.widget.EditText[@resource-id='com.imfootball:id/edusername']")
	MobileElement emailAddress;
	@AndroidFindBy(xpath="//android.widget.EditText[@resource-id='com.imfootball:id/edmobile']")
	MobileElement mobileNumber;
	@AndroidFindBy(xpath="//android.widget.Button[@resource-id='com.imfootball:id/btnLogin']")
	MobileElement resetButton;
	@AndroidFindBy(xpath="//android.widget.EditText[@resource-id='com.imfootball:id/ednewpassword']")
	MobileElement newPassword;
	@AndroidFindBy(xpath="//android.widget.EditText[@resource-id='com.imfootball:id/edconfirmpassword']")
	MobileElement confirmPassword;
	@AndroidFindBy(xpath="//android.widget.Button[@resource-id='com.imfootball:id/btnchangelogin']")
	MobileElement changeButton;
	@AndroidFindBy(xpath="//android.widget.ImageView[@resource-id='com.imfootball:id/iv_InfoDialog']")
	MobileElement informationIcon;
	@AndroidFindBy(xpath="//android.widget.ImageView[@resource-id='com.imfootball:id/ivCross']")
	MobileElement crossIcon;
	
	
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
	
	
	public forgotPassword(AppiumDriver<MobileElement>driver)
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	public void clickOnForgotPassword()
	{
		utility.waitHelper.clickOn(driver, forgotPasswordLink, 5, null);
		
	}
	
	public void clickOnLoginLink()
	{
		utility.waitHelper.clickOn(driver, loginLink, 5, null);
		
	}

	public void clickOnResetPasswordButton()
	{
		utility.waitHelper.clickOn(driver, resetButton, 5, null);
		
		
	}
	public void enterInvaidEmail()
	{
		utility.waitHelper.sendKeys(driver, emailAddress, 5, "nmmdnf.co");
		
		
	}
	
	public void entervalidMobile()
	{
		utility.waitHelper.sendKeys(driver, mobileNumber, 5, "9999999998");
		
		
	}
	
	public void clearmobile()
	{
		mobileNumber.clear();
		
	}
	public void emailClear()
	{
		emailAddress.clear();
		
	}

	public void enterValidEmail()
	{
		utility.waitHelper.sendKeys(driver, emailAddress, 5, "reset1@test.com");
		
	}
	
	
	public void enterInvalidPin()
	{
		
		utility.waitHelper.sendKeys(driver, edtbox1, 5, "1");
		utility.waitHelper.sendKeys(driver, edtbox2, 5, "2");
		utility.waitHelper.sendKeys(driver, edtbox3, 5, "3");
		utility.waitHelper.sendKeys(driver, edtbox4, 5, "4");
	
	}
	public void enterValidPin()
	{
		utility.waitHelper.sendKeys(driver, edtbox1, 5, "1");
		utility.waitHelper.sendKeys(driver, edtbox2, 5, "4");
		utility.waitHelper.sendKeys(driver, edtbox3, 5, "7");
		utility.waitHelper.sendKeys(driver, edtbox4, 5, "1");
			
	}
	public void clearInvalidPin()
	{
		edtbox1.clear();
		edtbox2.clear();
		edtbox3.clear();
	    edtbox4.clear();
	
	}
	public void closePopup()
	{
		utility.waitHelper.clickOn(driver, popup, 5, null);
		
	}
	public void clickOnInformationIcon()
	{
		utility.waitHelper.clickOn(driver, informationIcon, 5, null);
		
	}
	public void enterConfirmPassword()
	{
		utility.waitHelper.sendKeys(driver, confirmPassword, 3, "Kabir123");
			
	}
	
	public void clickOnChangeAndLogin()
	{
		utility.waitHelper.clickOn(driver, changeButton, 5, null);
			
	}
	public void enterNewPassword()
	{
		utility.waitHelper.clickOn(driver, newPassword, 5, null);
			
	}
	public void clickOnCrossIcon()
	{
		utility.waitHelper.clickOn(driver, crossIcon, 5, null);
		
	}
	public void clearConfirmPassword()
	{
		utility.waitHelper.clickOn(driver, crossIcon, 5, null);
		
	}
	
	public void enterInvalidPass()
	{
		utility.waitHelper.clickOn(driver, confirmPassword, 5, null);
		
	}
	public void enterValidNewPass()
	{
		utility.waitHelper.sendKeys(driver, newPassword, 3, "Kabir123");
		
	}	
	public void enterVaidConfirm()
	{ 
		utility.waitHelper.clickOn(driver, confirmPassword, 5, null);
		
	}
	
}
