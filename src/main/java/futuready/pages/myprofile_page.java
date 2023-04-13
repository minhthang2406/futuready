package futuready.pages;

import static org.testng.Assert.assertEquals;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
public class myprofile_page {
public static String newPassWord = "Init12345";
WebDriver driver;
//String public newPassWord = "Init12345";
login_with_user_name_and_password_page loginWithUserAndPass = new login_with_user_name_and_password_page(); 
//Locators
private By personal_info_label = By.xpath("//*[@id=\"__layout\"]/div/div/main/section[2]/div/div[1]/div");
private By username_label = By.xpath("//*[@id=\"__layout\"]/div/div/main/section[2]/div/div[1]/ul/li[1]/p[1]");
private By password_label = By.xpath("//*[@id=\"__layout\"]/div/div/main/section[2]/div/div[1]/ul/li[2]/p");
private By phone_label = By.xpath("//*[@id=\"__layout\"]/div/div/main/section[2]/div/div[1]/ul/li[3]/p");
private By email_label = By.xpath("//*[@id=\"__layout\"]/div/div/main/section[2]/div/div[1]/ul/li[4]/p");
private By username_display = By.xpath("//*[@id=\"__layout\"]/div/div/main/section[2]/div/div[1]/ul/li[1]/p[2]");
private By password_display = By.xpath("//*[@id=\"__layout\"]/div/div/main/section[2]/div/div[1]/ul/li[2]/div/p");
private By phone_display = By.xpath("//*[@id=\"__layout\"]/div/div/main/section[2]/div/div[1]/ul/li[3]/div/p");
private By email_display = By.xpath("//*[@id=\"__layout\"]/div/div/main/section[2]/div/div[1]/ul/li[4]/div/p");
private By app_version_label = By.xpath("//*[@id=\"__layout\"]/div/div/main/section[2]/div/div[2]/ul/li[1]/p[1]");
private By app_version_display = By.xpath("//*[@id=\"__layout\"]/div/div/main/section[2]/div/div[2]/ul/li[1]/p[2]");
private By terms_condition_label = By.xpath("//*[@id=\"__layout\"]/div/div/main/section[2]/div/div[2]/ul/li[2]/p[1]");
private By terms_condition_button = By.xpath("//*[@id=\"__layout\"]/div/div/main/section[2]/div/div[2]/ul/li[2]/p[2]/a");
private By privacy_policy_TH = By.xpath("//*[@id=\"__layout\"]/div/div/main/section[2]/div/div[2]/ul/li[3]/p[1]");
private By privacy_policy_button = By.xpath("//*[@id=\"__layout\"]/div/div/main/section[2]/div/div[2]/ul/li[2]/p[2]/a");
private By logout_button = By.xpath("//*[@id=\"__layout\"]/div/div/main/section[2]/div/div[3]/button");
private By edit_password_button = By.xpath("//*[@id=\"__layout\"]/div/div/main/section[2]/div/div[1]/ul/li[2]/div/a");
private By current_password_label = By.xpath("//*[@id=\"__layout\"]/div/div/main/section[2]/div/div/div[2]/div[2]/div/label");
private By current_password_field = By.xpath("//*[@id=\"__layout\"]/div/div/main/section[2]/div/div/div[2]/div[2]/div/div/input");
private By enter_new_password_label = By.xpath("//*[@id=\"__layout\"]/div/div/main/section[2]/div/div/div[2]/div[3]/div/label");
private By confirm_new_password_label = By.xpath("//*[@id=\"__layout\"]/div/div/main/section[2]/div/div/div[2]/div[4]/div/label");
private By enter_new_password_field = By.xpath("//*[@id=\"__layout\"]/div/div/main/section[2]/div/div/div[2]/div[3]/div/div/input");
private By confirm_new_password_field = By.xpath("//*[@id=\"__layout\"]/div/div/main/section[2]/div/div/div[2]/div[4]/div/div/input");
private By submit_button = By.xpath("//*[@id=\"__layout\"]/div/div/main/section[2]/div/div/div[3]/div/button");
private By popup_change_password_successfully = By.xpath("/div/div[2]/div/section/div[1]");
private By verify_required_field_message = By.xpath("//*[@id=\"__layout\"]/div/div/main/section[2]/div/div/div[2]/div[3]/div/p/div");
private By verify_new_password_inputted = By.xpath("//*[@id=\"__layout\"]/div/div/main/section[2]/div/div/div[2]/div[4]/div/p/div");
private By eye_icon_new_password_field = By.xpath("//*[@id=\"__layout\"]/div/div/main/section[2]/div/div/div[2]/div[3]/div/div/span/i");
private By eye_icon_confirm_password_field = By.xpath("//*[@id=\"__layout\"]/div/div/main/section[2]/div/div/div[2]/div[4]/div/div/span/i");
private By eye_icon_current_password_field = By.xpath("//*[@id=\"__layout\"]/div/div/main/section[2]/div/div/div[2]/div[2]/div/div/span/i");
private By edit_phone_button = By.xpath("//*[@id=\"__layout\"]/div/div/main/section[2]/div/div[1]/ul/li[3]/div/a");
private By edit_phone_number_field = By.xpath("//*[@id=\"idPhone\"]");
//Back button
private By back_btn_from_edit_password_page = By.xpath("//*[@id=\"__layout\"]/div/div/nav/div/div[1]/a/span/i");
//Change phone number
private By submit_button_in_phone_page = By.xpath("//*[@id=\"__layout\"]/div/div/main/section[2]/div/div/div[3]/div/button");
//Functions
public void setup_driver (WebDriver driver) throws  Exception {
	this.driver = driver;	
}

public void verify_elements () throws Exception {
	WebElement personalInformationLabel = driver.findElement(personal_info_label);
	personalInformationLabel.isDisplayed();
	//Assert.assertEquals(personalInformationLabel.getText(),"Personal Information");
	WebElement userNameLabel = driver.findElement(username_label);
	userNameLabel.isDisplayed();
	Assert.assertEquals(userNameLabel.getText(),"Username");
	WebElement passWordLabel = driver.findElement(password_label);
	passWordLabel.isDisplayed();
	Assert.assertEquals(passWordLabel.getText(), "Password");
	WebElement phoneLabel = driver.findElement(phone_label);
	phoneLabel.isDisplayed();
	Assert.assertEquals(phoneLabel.getText(),"Phone");
	WebElement emailLabel = driver.findElement(email_label);
	emailLabel.isDisplayed();
	Assert.assertEquals(emailLabel.getText(),"Email");
	WebElement usernameDisplay = driver.findElement(username_display);
	usernameDisplay.isDisplayed();
	Assert.assertEquals(usernameDisplay.getText(),login_with_user_name_and_password_page.username_input);
	WebElement passWordDisplay = driver.findElement(password_display);
	passWordDisplay.isDisplayed();
	WebElement phoneDisplay = driver.findElement(phone_display);
	phoneDisplay.isDisplayed();
	WebElement emailDisplay = driver.findElement(email_display);
	emailDisplay.isDisplayed();
	WebElement appVersionLabel = driver.findElement(app_version_label);
	appVersionLabel.isDisplayed();
	WebElement appVersionDisplay = driver.findElement(app_version_display);
	appVersionDisplay.isDisplayed();
	WebElement termsConditionLabel = driver.findElement(terms_condition_label);
	termsConditionLabel.isDisplayed();
	WebElement termsConditionBtn = driver.findElement(terms_condition_button);
	termsConditionBtn.isDisplayed();
	WebElement privacyPolicyLabel = driver.findElement(privacy_policy_TH);
	privacyPolicyLabel.isDisplayed();
	WebElement privacyPolicyBtn = driver.findElement(privacy_policy_button);
	privacyPolicyBtn.isDisplayed();
	WebElement logoutBtn = driver.findElement(logout_button);
	logoutBtn.isDisplayed();
	Thread.sleep(2000);
}

public void click_on_edit_password_btn () throws Exception {
	WebElement editPasswordBtn = driver.findElement(edit_password_button);
	editPasswordBtn.click();
	Thread.sleep(2000);
}

public void change_password (String new_password, String current_password) throws Exception {
	WebElement currentPasswordField = driver.findElement(current_password_field);
	currentPasswordField.clear();
	currentPasswordField.sendKeys(current_password);
	WebElement newPassWordField = driver.findElement(enter_new_password_field);
	newPassWordField.sendKeys(new_password);
	WebElement confirmNewPassword = driver.findElement(confirm_new_password_field);
	confirmNewPassword.sendKeys(new_password);
	Thread.sleep(1500);
	WebElement submitButton = driver.findElement(submit_button);
	submitButton.click();
	Thread.sleep(4000);
}

public void input_new_password (String new_password) throws Exception {
	WebElement newPassWordField = driver.findElement(enter_new_password_field);
	newPassWordField.clear();
	newPassWordField.sendKeys(new_password);
}

public void input_confirm_password (String new_password) throws Exception {
	WebElement confirmNewPassword = driver.findElement(confirm_new_password_field);
	confirmNewPassword.clear();
	confirmNewPassword.sendKeys(new_password);
}

public void click_on_submit_button () throws Exception {
	WebElement submitButton = driver.findElement(submit_button);
	submitButton.click();
	Thread.sleep(1000);
}

public void verify_required_field_message () throws Exception {
	WebElement requiredFieldMessage = driver.findElement(verify_required_field_message);
	requiredFieldMessage.isDisplayed();
	Assert.assertEquals(requiredFieldMessage.getText(),"This field is required");
	Thread.sleep(1000);
}

public void verify_new_password_inputted () throws Exception {
	WebElement newPassWordField = driver.findElement(enter_new_password_field);
	newPassWordField.sendKeys("Init1234567");
	WebElement confirmNewPassword = driver.findElement(confirm_new_password_field);
	confirmNewPassword.sendKeys("Init12345");
	Thread.sleep(1500);
	WebElement submitButton = driver.findElement(submit_button);
	submitButton.click();
	Thread.sleep(1000);
	WebElement verifyNewPassword = driver.findElement(verify_new_password_inputted);
	verifyNewPassword.isDisplayed();
	Assert.assertEquals(verifyNewPassword.getText(), "New password is not the same");
	Thread.sleep(1000);
	confirmNewPassword.clear();
	newPassWordField.clear();
	
}

public void hide_or_unhide_the_characters_in_password_editted_field () throws Exception {
	WebElement newPassWordField = driver.findElement(enter_new_password_field);
	WebElement confirmNewPassword = driver.findElement(confirm_new_password_field);
	WebElement eyeIconOnCurrentPasswordField = driver.findElement(eye_icon_current_password_field);
	WebElement eyeIconOnNewPasswordField = driver.findElement(eye_icon_new_password_field);
	WebElement eyeIconOnConfirmPasswordField = driver.findElement(eye_icon_confirm_password_field);
	eyeIconOnCurrentPasswordField.click();
	eyeIconOnNewPasswordField.click();
	Assert.assertNotEquals(newPassWordField.getText(), "***********");
	eyeIconOnConfirmPasswordField.click();
	Assert.assertNotEquals(confirmNewPassword.getText(), "*********");
	Thread.sleep(2000);
	eyeIconOnCurrentPasswordField.click();
	eyeIconOnNewPasswordField.click();
	eyeIconOnConfirmPasswordField.click();
}

public void change_phone_number () throws Exception {
	WebElement backBtnFromEditPasswordPage = driver.findElement(back_btn_from_edit_password_page);
	backBtnFromEditPasswordPage.click();
	WebElement editPhoneBtn = driver.findElement(edit_phone_button);
	editPhoneBtn.click();
	WebElement editPhoneNumberField = driver.findElement(edit_phone_number_field);
	Random rand = new Random();
	int phoneNumber = rand.nextInt(111111111,999999999);
	String phoneNumberString = Integer.toString(phoneNumber);
	editPhoneNumberField.sendKeys(phoneNumberString);
	Thread.sleep(1000);
	WebElement submitBtnInPhonePage = driver.findElement(submit_button_in_phone_page);
	submitBtnInPhonePage.click();
}



}
