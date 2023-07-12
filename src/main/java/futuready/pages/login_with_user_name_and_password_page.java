package futuready.pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
public class login_with_user_name_and_password_page {
	WebDriver driver;
	public static String username_input = "287051";
	public static String password_input = "Init123456";
	public static String wrong_username_input = "minhthangtran";
	public static String wrong_password_input = "123456";
	//Locator
	By logo_label = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/h2[1]");
	By username_label = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[1]/div[1]/label[1]");
	By password_label = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/form[1]/div[2]/div[1]/div[1]/label[1]");
	By user_name_field = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/input[1]");
	By password_field = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/input[1]");
	By login_btn = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/form[1]/div[3]/p[1]/button[1]");
	By wrong_login_info_message = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/form[1]/div[4]");
	By forgot_password_button = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/form[1]/div[2]/div[1]/div[1]/p[1]/div[1]/span[1]");
	
	//Function
	public void setup_driver (WebDriver driver) throws Exception {
		this.driver = driver;
	}
	
	public void verify_elements () throws Exception {
		WebElement logo = driver.findElement(logo_label);
		WebElement userLabel = driver.findElement(username_label);
		WebElement userField = driver.findElement(user_name_field);
		WebElement passLabel = driver.findElement(password_label);
		WebElement passField = driver.findElement(password_field);
		WebElement loginBtn = driver.findElement(login_btn);
		logo.isDisplayed();
		userLabel.isDisplayed();
		String userlabel = userLabel.getText();
		assertEquals(userlabel, "Username");
		userField.isDisplayed();
		passLabel.isDisplayed();
		assertEquals(passLabel.getText(), "Password");
		passField.isDisplayed();
		loginBtn.isDisplayed();	
	}
	
	public void input_username (String name) throws Exception {
		WebElement userNameField = driver.findElement(user_name_field);
		userNameField.sendKeys(name);
		Thread.sleep(1000);
	}
	
	public void input_password (String pass) throws Exception {
		WebElement passwordField = driver.findElement(password_field);
		passwordField.sendKeys(pass);
		Thread.sleep(1000);
	}
	
	public void click_login_btn () throws Exception {
		WebElement loginBtn = driver.findElement(login_btn);
		loginBtn.click();
		Thread.sleep(8000);
	}
	
	public void verify_wrong_login_info_message_display () throws Exception {
		WebElement wrongLoginMessage = driver.findElement(wrong_login_info_message);
		wrongLoginMessage.isDisplayed();
		assertEquals(wrongLoginMessage.getText(), "Incorrect username or password."); 
	}
	
	public void clear_username_field () throws Exception {
		WebElement userNameField = driver.findElement(user_name_field);
		userNameField.clear();
		Thread.sleep(1000);
	}
	
	public void clear_password_field () throws Exception {
		WebElement passwordField = driver.findElement(password_field);
		passwordField.clear();
		Thread.sleep(1000);
	}
	
	public void click_on_forgot_password_button () throws Exception {
		WebElement forgotPasswordBtn = driver.findElement(forgot_password_button);
		forgotPasswordBtn.click();
		Thread.sleep(3000);
	}
	
	
}
