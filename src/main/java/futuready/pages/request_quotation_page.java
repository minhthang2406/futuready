package futuready.pages;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import io.github.bonigarcia.*;
import io.github.bonigarcia.wdm.*;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import futuready.pages.*;
import futuready.base.*;
import org.openqa.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.edge.*;
import org.openqa.selenium.firefox.*;
import org.testng.*;
import org.testng.Assert;
public class request_quotation_page {
	WebDriver driver;
	//Locators
	private By label_text = By.xpath("//*[@id=\"__layout\"]/div/div/div/div/main/div/div[2]/div[2]/div/div/div/center");
	private By first_name_label = By.xpath("//*[@id=\"__layout\"]/div/div/div/div/main/div/div[2]/div[2]/div/div/div/div/div/div[1]/label");
	private By first_name_field = By.xpath("//*[@id=\"__layout\"]/div/div/div/div/main/div/div[2]/div[2]/div/div/div/div/div/div[1]/div/input");
	private By last_name_label = By.xpath("//*[@id=\"__layout\"]/div/div/div/div/main/div/div[2]/div[2]/div/div/div/div/div/div[2]/label");
	private By last_name_field = By.xpath("//*[@id=\"__layout\"]/div/div/div/div/main/div/div[2]/div[2]/div/div/div/div/div/div[2]/div/input");
	private By mobile_phone_label = By.xpath("//*[@id=\"__layout\"]/div/div/div/div/main/div/div[2]/div[2]/div/div/div/div/div/div[3]/label");
	private By mobile_phone_field = By.xpath("//*[@id=\"idPhone\"]");
	private By mobile_phone_region_code = By.xpath("//*[@id=\"__layout\"]/div/div/div/div/main/div/div[2]/div[2]/div/div/div/div/div/div[3]/div/span");
	private By email_address_label = By.xpath("//*[@id=\"__layout\"]/div/div/div/div/main/div/div[2]/div[2]/div/div/div/div/div/div[4]/label");
	private By email_address_field = By.xpath("//*[@id=\"__layout\"]/div/div/div/div/main/div/div[2]/div[2]/div/div/div/div/div/div[4]/div/input");
	private By line_id_label = By.xpath("//*[@id=\"__layout\"]/div/div/div/div/main/div/div[2]/div[2]/div/div/div/div/div/div[5]/label");
	private By line_id_field = By.xpath("//*[@id=\"__layout\"]/div/div/div/div/main/div/div[2]/div[2]/div/div/div/div/div/div[5]/div/input");
	private By line_display_name = By.xpath("//*[@id=\"__layout\"]/div/div/div/div/main/div/div[2]/div[2]/div/div/div/div/div/div[6]/label");
	private By line_display_name_field = By.xpath("//*[@id=\"__layout\"]/div/div/div/div/main/div/div[2]/div[2]/div/div/div/div/div/div[6]/div/input");
	private By request_for_quotation_button = By.xpath("//*[@id=\"__layout\"]/div/div/div/div/main/div/div[2]/div[2]/div/div/div/div/div/button");
	private By back_button = By.xpath("");
	//Setup Function
	public void setup_driver(WebDriver driver) throws Exception {
		this.driver = driver;
	}
	
	public void verify_elements () throws Exception {
		WebElement labelText = driver.findElement(label_text);
		labelText.isDisplayed();
		WebElement firstNameLabel = driver.findElement(first_name_label);
		firstNameLabel.isDisplayed();
		WebElement firstNameField = driver.findElement(first_name_field);
		firstNameField.isDisplayed();
		WebElement lastNameLabel = driver.findElement(last_name_label);
		lastNameLabel.isDisplayed();
		WebElement lastNameField = driver.findElement(last_name_field);
		lastNameField.isDisplayed();
		WebElement mobileLabel = driver.findElement(mobile_phone_label);
		mobileLabel.isDisplayed();
		WebElement mobileField = driver.findElement(mobile_phone_field);
		mobileField.isDisplayed();
		WebElement mobileRegionalCode = driver.findElement(mobile_phone_region_code);
		mobileRegionalCode.isDisplayed();
		WebElement emailAddressLabel = driver.findElement(email_address_label);
		emailAddressLabel.isDisplayed();
		WebElement emailAddressField = driver.findElement(email_address_field);
		emailAddressField.isDisplayed();
		WebElement lineIdLabel = driver.findElement(line_id_label);
		lineIdLabel.isDisplayed();
		WebElement lineIdField = driver.findElement(line_id_field);
		lineIdField.isDisplayed();
		WebElement lineDisplayNameLabel = driver.findElement(line_display_name);
		lineDisplayNameLabel.isDisplayed();
		WebElement lineDisplayNameField = driver.findElement(line_display_name_field);
		lineDisplayNameField.isDisplayed();
		WebElement requestForQuotationButton = driver.findElement(request_for_quotation_button);
		requestForQuotationButton.isDisplayed();
		Thread.sleep(4000);
	}
	
	public void input_first_name () throws Exception {
		WebElement firstNameField = driver.findElement(first_name_field);
		firstNameField.click();
		//firstNameField.clear();
		Robot rb = new Robot ();
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_A);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_A);
		Thread.sleep(2000);
		firstNameField.sendKeys("My First Name");
		Thread.sleep(1000);
	}
	
	public void input_last_name () throws Exception {
		WebElement lastNameField = driver.findElement(last_name_field);
		lastNameField.click();
		lastNameField.clear();
		lastNameField.sendKeys("My Last Name");
		Thread.sleep(1000);
	}
	
	public void input_mobile_number () throws Exception {
		WebElement mobileField = driver.findElement(mobile_phone_field);
		mobileField.click();
		mobileField.clear();
		mobileField.sendKeys("0929999399");
		Thread.sleep(1000);
	}
	
	public void input_email_address () throws Exception {
		WebElement emailAddressField = driver.findElement(email_address_field);
		emailAddressField.click();
		emailAddressField.clear();
		emailAddressField.sendKeys("testmail@gmail.com");
		Thread.sleep(1000);
	}
	
	public void input_line_id () throws Exception {
		WebElement lineIdField = driver.findElement(line_id_field);
		lineIdField.clear();
		lineIdField.sendKeys("1234");
		Thread.sleep(1000);
	}
	
	public void input_line_display_name () throws Exception {
		WebElement lineDisplayNameField = driver.findElement(line_display_name_field);
		lineDisplayNameField.clear();
		lineDisplayNameField.sendKeys("Name");
		Thread.sleep(1000);
	}
	
	public void click_on_request_for_quotation_btn () throws Exception {
		WebElement requestForQuotationButton = driver.findElement(request_for_quotation_button);
		requestForQuotationButton.click();
		Thread.sleep(1000);
	}
	
	public void reload_page () throws Exception {
		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_F5);
		rb.keyRelease(KeyEvent.VK_F5);
		//driver.navigate().refresh();
		Thread.sleep(3000);
	}
	
	public void clear_first_name () throws Exception {
		WebElement firstNameField = driver.findElement(first_name_field);
		firstNameField.click();
		firstNameField.clear();
		Thread.sleep(1000);
	}
	
	public void clear_last_name () throws Exception {
		WebElement lastNameField = driver.findElement(last_name_field);
		lastNameField.click();
		lastNameField.clear();
		Thread.sleep(1000);
	}
	
	public void clear_mobile_number () throws Exception {
		WebElement mobileField = driver.findElement(mobile_phone_field);
		mobileField.click();
		mobileField.clear();
		Thread.sleep(1000);
	}
	
	public void clear_email_address () throws Exception {
		WebElement emailAddressField = driver.findElement(email_address_field);
		emailAddressField.click();
		emailAddressField.clear();
		Thread.sleep(1000);
	}
	
	public void clear_line_id () throws Exception {
		WebElement lineIdField = driver.findElement(line_id_field);
		lineIdField.click();
		lineIdField.clear();
		Thread.sleep(1000);
	}
	
	public void clear_line_display_name () throws Exception {
		WebElement lineDisplayNameField = driver.findElement(line_display_name_field);
		lineDisplayNameField.click();
		lineDisplayNameField.clear();
		Thread.sleep(1000);
	}
	
}
