package futuready.pages;
import static org.testng.Assert.assertEquals;

import org.openqa.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class forgot_password_page {
static WebDriver driver;
static String username = "287051";
//Locator
	private By logo_fu = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[2]/div[1]/div[1]/figure[1]/img[1]");
	private By forgot_password_label = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/h2[1]");
	private By username_label = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[1]/div[1]/label[1]");
	private By username_field = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/input[1]");
	private By next_button = By.xpath("//button[contains(text(),'Next')]");
	private By next_button_2 = By.xpath("//button[contains(text(),'Next')]");
	private By verification_code_label = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/form[1]/div[2]/div[1]/div[1]/label[1]");
	private By verification_code_field = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/input[1]");
	private By new_password_label = By.xpath("//label[contains(text(),'New Password')]");
	private By new_password_field = By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/form[1]/div[3]/div[1]/div[1]/div[1]/input[1]");
	private By confirm_password_label = By.xpath("//label[contains(text(),'Confirm Password')]");
	private By confirm_password_field = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/form[1]/div[4]/div[1]/div[1]/div[1]/input[1]");
	private By required_message_for_username_field = By.xpath("//div[contains(text(),'This field is required')]");
	//private By next_btn = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/form[1]/div[5]/p[1]/button[1]");
	private By eye_icon_to_hide_new_password = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/form[1]/div[3]/div[1]/div[1]/div[1]/span[1]/i[1]");
	private By eye_icon_to_hide_confirm_password = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/form[1]/div[4]/div[1]/div[1]/div[1]/span[1]/i[1]");
	private By back_btn = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/span[1]");
//Function
	public void setup(WebDriver driver) throws Exception {
		this.driver = driver;
	}
	
	public void verify_elements () {
		WebElement logo = driver.findElement(logo_fu);
		WebElement forgotPassLabel = driver.findElement(forgot_password_label);
		WebElement usernameLabel = driver.findElement(username_label);
		WebElement usernameField = driver.findElement(username_field);
		WebElement nextBtn = driver.findElement(next_button);
		logo.isDisplayed();
		forgotPassLabel.isDisplayed();
		usernameLabel.isDisplayed();
		usernameField.isDisplayed();
		nextBtn.isDisplayed();
	}
	
	public void input_username_into_field () throws Exception {
		WebElement usernameField = driver.findElement(username_field);
		usernameField.sendKeys(username);
		Thread.sleep(2000);
	}
	
	public void clear_username_field () throws Exception {
		WebElement usernameField = driver.findElement(username_field);
		usernameField.clear();
		driver.navigate().refresh();
		Thread.sleep(2000);
	}
	
	public void click_next_btn () throws Exception {
		WebElement clickNextBtn = driver.findElement(next_button);
		clickNextBtn.click();
		Thread.sleep(2000);
	}
	
	public void click_next_btn_2 () throws Exception {
		WebElement clickNextBtn2 = driver.findElement(next_button_2);
		clickNextBtn2.click();
		Thread.sleep(2000);
	}
	
	public void  verify_verification_code_and_new_password_label () throws Exception {
		WebElement verificationCodeLabel = driver.findElement(verification_code_label);
		WebElement newPasswordLabel = driver.findElement(new_password_label);
		WebElement confirmPasswordLabel = driver.findElement(confirm_password_label);
		verificationCodeLabel.isDisplayed();
		newPasswordLabel.isDisplayed();
		confirmPasswordLabel.isDisplayed();
		assertEquals(verificationCodeLabel.getText(),"Verification Code");
		assertEquals(newPasswordLabel.getText(), "New Password");
		assertEquals(confirmPasswordLabel.getText(), "Confirm Password");
		Thread.sleep(1000);
	}
	
	public void hide_unhide_password_in_new_and_confirm_password_fields ()  throws Exception {
		WebElement hideNewPasswordIcon = driver.findElement(eye_icon_to_hide_new_password);
		WebElement hideConfirmPasswordIcon = driver.findElement(eye_icon_to_hide_confirm_password);
		hideNewPasswordIcon.click();
		Thread.sleep(1000);
		hideNewPasswordIcon.click();
		Thread.sleep(1000);
		hideConfirmPasswordIcon.click();
		Thread.sleep(1000);
		hideConfirmPasswordIcon.click();
		Thread.sleep(1000);
	}
	
	public void input_verification_code () throws Exception {
		WebElement verificationCodeField = driver.findElement(verification_code_field);
		verificationCodeField.sendKeys("11111");
		Thread.sleep(1000);
	}
	
	public void input_new_password () throws Exception {
		WebElement newPasswordField = driver.findElement(new_password_field);
		newPasswordField.sendKeys("123456");
		Thread.sleep(1000);
	}
	
	public void input_confirm_password () throws Exception {
		WebElement confirmPasswordField = driver.findElement(confirm_password_field);
		confirmPasswordField.sendKeys("123456");
		Thread.sleep(1000);
	}
	
	public void click_back_btn () throws Exception {
		WebElement backBtn = driver.findElement(back_btn);
		backBtn.click();
		Thread.sleep(1000);
	}
	
	public void verify_required_message_for_usernam_field () throws Exception {
		WebElement required_message = driver.findElement(required_message_for_username_field);
		required_message.isDisplayed();
		assertEquals(required_message.getText(), "This field is required");
		Thread.sleep(1000);
		
	}
	
	public void verify_verificationcode_newpass_confirmpass_fields () throws Exception {
		WebElement required_message = driver.findElement(required_message_for_username_field);
		required_message.isDisplayed();
		assertEquals(required_message.getText(), "This field is required");
		Thread.sleep(1000);
		
	}
}
