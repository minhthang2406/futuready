package futuready.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.Random;
import futuready.pages.*;
import futuready.base.*;
import org.openqa.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.edge.*;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.*;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
public class sign_up_account_page {
	public static WebDriver driver;
	private String email_address = "agencytester22@mailsac.com";
	//Locators
	private By signup_label = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/h2[1]");
	private By first_name_label = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[1]/div[1]/label[1]");
	private By last_name_label = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[1]/div[2]/label[1]");
	private By first_name_field = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/input[1]");
	private By last_name_field = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[1]/div[2]/div[1]/input[1]");
	private By title_label = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/form[1]/div[2]/div[1]/div[1]/label[1]");
	private By title_dropdown_box = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/span[1]/select[1]");
	private By title_dropdown_box_option_ms = By.xpath("//option[contains(text(),'Ms.')]");
	private By title_dropdown_box_option_mr = By.xpath("//option[contains(text(),'Mr.')]");
	private By title_dropdown_box_option_mrs = By.xpath("//option[contains(text(),'Mrs.')]");
	private By nick_name_label = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/form[1]/div[2]/div[1]/div[2]/label[1]");
	private By nick_name_field = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/form[1]/div[2]/div[1]/div[2]/div[1]/input[1]");
	private By email_address_label = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/form[1]/div[3]/div[1]/div[1]/label[1]");
	private By email_address_field = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/form[1]/div[3]/div[1]/div[1]/div[1]/input[1]");
	private By phone_label = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/form[1]/div[3]/div[1]/div[2]/label[1]");
	private By phone_field = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/form[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/input[1]");
	private By line_id_label = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/form[1]/div[4]/div[1]/div[1]/label[1]");
	private By line_id_field = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/form[1]/div[4]/div[1]/div[1]/div[1]/input[1]");
	private By line_display_name_label = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/form[1]/div[4]/div[1]/div[2]/label[1]");
	private By line_display_name_field = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/form[1]/div[4]/div[1]/div[2]/div[1]/input[1]");
	private By company_definition_text = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/form[1]/div[5]/div[1]/div[1]/span[1]");
	private By confirmation_text_1 = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/form[1]/div[5]/div[2]/div[1]/label[1]/span[2]/p[1]");
	private By confirmation_text_2 = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/form[1]/div[5]/div[3]/div[1]/label[1]/span[2]/p[1]");
	private By confirmation_checkbox_1 = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/form[1]/div[5]/div[2]/div[1]/label[1]/span[1]");
	private By confirmation_checkbox_2 = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/form[1]/div[5]/div[3]/div[1]/label[1]/span[1]");
	private By confirmation_text_3 = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/form[1]/div[5]/div[4]/div[1]/span[1]");
	private By agree_and_next_button = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/form[1]/div[6]/p[1]/button[1]");
	private By language_button = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/a[1]");
	//Error messages
	private By error_message_first_name_field = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[1]/div[1]/p[1]/div[1]");
	private By error_message_last_name_field = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[1]/div[2]/p[1]/div[1]");
	private By error_message_nick_name_field = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/form[1]/div[2]/div[1]/div[2]/p[1]/div[1]");
	private By error_message_email_address_field = By.xpath("//*[@id=\"__layout\"]/div/div/section/div/div[3]/div/form/div[3]/div/div[1]/p/div");
	private By error_message_phone_field = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/form[1]/div[3]/div[1]/div[2]/p[1]/div[1]");
	private By error_message_line_id_field = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/form[1]/div[4]/div[1]/div[1]/p[1]/div[1]");
	private By error_message_line_display_name_field = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/form[1]/div[4]/div[1]/div[2]/p[1]/div[1]");
	
	//Functions
	public void setup_driver (WebDriver driver) throws Exception {
		this.driver = driver;
	}
	
	public void verify_elements () throws Exception {
		WebElement signUpLabel = driver.findElement(signup_label);
		signUpLabel.isDisplayed();
		WebElement titleLabel = driver.findElement(title_label);
		titleLabel.isDisplayed();
		WebElement titleDropDownBox = driver.findElement(title_dropdown_box);
		titleDropDownBox.isDisplayed();
		WebElement firstNameLabel = driver.findElement(first_name_label);
		firstNameLabel.isDisplayed();
		WebElement lastNameLabel = driver.findElement(last_name_label);
		lastNameLabel.isDisplayed();
		WebElement nickNameLabel = driver.findElement(nick_name_label);
		nickNameLabel.isDisplayed();
		WebElement nickNameField = driver.findElement(nick_name_field);
		nickNameField.isDisplayed();
		WebElement firstNameField = driver.findElement(first_name_field);
		firstNameField.isDisplayed();
		WebElement lastNameField = driver.findElement(last_name_field);
		lastNameField.isDisplayed();
		WebElement emailAddressLabel = driver.findElement(email_address_label);
		emailAddressLabel.isDisplayed();
		WebElement emailAddressField = driver.findElement(email_address_field);
		emailAddressField.isDisplayed();
		WebElement phoneLabel = driver.findElement(phone_label);
		phoneLabel.isDisplayed();
		WebElement phoneField = driver.findElement(phone_field);
		phoneField.isDisplayed();
		WebElement lineIdLabel = driver.findElement(line_id_label);
		lineIdLabel.isDisplayed();
		WebElement lineDisplayNameLabel = driver.findElement(line_display_name_label);
		lineDisplayNameLabel.isDisplayed();
		WebElement lineDisplayNameField = driver.findElement(line_display_name_field);
		lineDisplayNameField.isDisplayed();
		scroll_down_to_bottom();
		WebElement companyDefinitionText = driver.findElement(company_definition_text);
		companyDefinitionText.isDisplayed();
		WebElement comfirmationText1 = driver.findElement(confirmation_text_1);
		comfirmationText1.isDisplayed();
		WebElement comfirmationText2 = driver.findElement(confirmation_text_2);
		comfirmationText2.isDisplayed();
		WebElement comfirmationText3 = driver.findElement(confirmation_text_3);
		comfirmationText3.isDisplayed();
		WebElement confirmationCheckBox1 = driver.findElement(confirmation_checkbox_1);
		confirmationCheckBox1.isDisplayed();
		WebElement confirmationCheckBox2 = driver.findElement(confirmation_checkbox_2);
		confirmationCheckBox2.isDisplayed();
		Thread.sleep(2000);
	}
	
	public void input_first_name () throws Exception {
		WebElement inputFirstNameField = driver.findElement(first_name_field);
		inputFirstNameField.sendKeys("Thng");
		Thread.sleep(2000);
	}
	
	public void input_last_name () throws Exception {
		WebElement inputLastNameField = driver.findElement(last_name_field);
		inputLastNameField.sendKeys("Tran");
		Thread.sleep(2000);
	}
	
	public void select_title () throws Exception {
		WebElement selectTitleDropdownBox = driver.findElement(title_dropdown_box);
		selectTitleDropdownBox.click();
		Thread.sleep(1000);
		WebElement selectMs = driver.findElement(title_dropdown_box_option_ms);
		selectMs.click();
		Thread.sleep(1000);
	}
	
	public void input_nick_name () throws Exception {
		WebElement inputNickName = driver.findElement(nick_name_field);
		inputNickName.sendKeys("Nick Name");
		Thread.sleep(1000);
	}
	
	public void input_email_address () throws Exception {
		WebElement inputEmailAddress = driver.findElement(email_address_field);
		inputEmailAddress.sendKeys(email_address);
		Thread.sleep(1000);
	}
	
	public void input_phone_number () throws Exception {
		Random rand = new Random();
		int phone = rand.nextInt(111111111,999999999);
		String phone_string = Integer.toString(phone);
		WebElement phoneField = driver.findElement(phone_field);
		phoneField.sendKeys(phone_string);
		Thread.sleep(1000);
	}
	
	public void select_checkbox_1 () throws Exception {
		WebElement checkBox1 = driver.findElement(confirmation_checkbox_1);
		checkBox1.click();
		Thread.sleep(1000);
	}
	
	public void select_checkbox_2 () throws Exception {
		WebElement checkBox2 = driver.findElement(confirmation_checkbox_2);
		checkBox2.click();
		Thread.sleep(1000);
	}
	
	public void click_on_agree_and_next_button () throws Exception {
		WebElement agreeNextButton = driver.findElement(agree_and_next_button);
		agreeNextButton.click();
		Thread.sleep(3000);
	}
	
	public void input_line_id () throws Exception {
		WebElement lineIdField = driver.findElement(line_id_field);
		lineIdField.sendKeys("thang1234");
		Thread.sleep(1000);
	}
	
	public void input_line_display_name () throws Exception {
		WebElement lineDisplayNameField = driver.findElement(line_display_name_field);
		lineDisplayNameField.sendKeys("Minh Thang");
		Thread.sleep(1000);
	}
	
	public void scroll_down_to_bottom() throws Exception {
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.END);
		Thread.sleep(2000);
	}
	
	public void  verify_blank_fields () throws Exception {
		Thread.sleep(2000);
		WebElement errorMessMailAddress = driver.findElement(error_message_email_address_field);
		errorMessMailAddress.isDisplayed();
		Assert.assertEquals(errorMessMailAddress.getText(),"This field is required");
		WebElement errorMessFirstName = driver.findElement(error_message_first_name_field);
		errorMessFirstName.isDisplayed();
		Assert.assertEquals(errorMessFirstName.getText(), "This field is required");
		WebElement errorMessLastName = driver.findElement(error_message_last_name_field);
		errorMessLastName.isDisplayed();
		Assert.assertEquals(errorMessLastName.getText(), "This field is required");
		WebElement errorMessDisplayName = driver.findElement(error_message_line_display_name_field);
		errorMessDisplayName.isDisplayed();
		Assert.assertEquals(errorMessDisplayName.getText(), "This field is required");
		WebElement errorMessLineId = driver.findElement(error_message_line_id_field);
		errorMessLineId.isDisplayed();
		Assert.assertEquals(errorMessLineId.getText(), "This field is required");
		WebElement errorMessNickName = driver.findElement(error_message_nick_name_field);
		errorMessNickName.isDisplayed();
		Assert.assertEquals(errorMessNickName.getText(), "This field is required");
		WebElement errorMessPhoneField = driver.findElement(error_message_phone_field);
		errorMessPhoneField.isDisplayed();
		Assert.assertEquals(errorMessPhoneField.getText(), "This field is required");
		Thread.sleep(2000);
	}
	
	public void handle_constrain_validation_message () throws Exception {
		//Steps to Handle the Constrain Validation Message
		//1. Get the nearest xpath of an element such as input field, radio button, checkboxes
		// 2. Get Attribute of it and compare to the result message
		String message = driver.findElement(By.xpath("//*[@id=\"consent\"]/div[2]/div/label/input")).getAttribute("validationMessage");
		Thread.sleep(2000);
		System.out.println("Message is : "+ message);
		Assert.assertEquals(message, "Please check this box if you want to proceed.");
	}
	
	
}
