package futuready.pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
public class myprofile_page {
WebDriver driver;
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

}
