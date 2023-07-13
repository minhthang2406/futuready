package futuready.pages;
import futuready.base.*;
import futuready.pages.*;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class prospect_detail_page {
WebDriver driver;
private String firstNameEngInput = "Auto";
private String lastNameEngInput = "Test";
private String firstNameThaiInput = "ผม";
private String lastNameThaiInput = "ผม";
private String mobifoneInput = "949999399";
private String emailInput = "agencytester22@gmail.com";
		//Locator
		private By prospect_detail_label = By.xpath("//*[@id=\"__layout\"]/div/div/div/div/main/div/section/div/div[2]/div[2]/h2");
		private By insurer_information_section = By.xpath("//*[@id=\"__layout\"]/div/div/div/div/main/div/section/div/div[2]/div[1]/div/div/div[1]");
		private By price_number = By.xpath("//*[@id=\"__layout\"]/div/div/div/div/main/div/section/div/div[2]/div[1]/div/div/div[2]/div[1]/div/p[2]");
		private By sum_insured_label = By.xpath("//*[@id=\"__layout\"]/div/div/div/div/main/div/section/div/div[2]/div[1]/div/div/div[2]/div[2]/div/span[1]");
		private By first_name_eng_label = By.xpath("//*[@id=\"__layout\"]/div/div/div/div/main/div/section/div/div[2]/div[2]/div[1]/div[1]/div/label");
		private By first_name_eng_field = By.xpath("//*[@id=\"__layout\"]/div/div/div/div/main/div/section/div/div[2]/div[2]/div[1]/div[1]/div/div");
		private By last_name_eng_label = By.xpath("//*[@id=\"__layout\"]/div/div/div/div/main/div/section/div/div[2]/div[2]/div[1]/div[2]/div/label");
		private By last_name_eng_field = By.xpath("//*[@id=\"__layout\"]/div/div/div/div/main/div/section/div/div[2]/div[2]/div[1]/div[2]/div/div");
		private By first_name_thai_label = By.xpath("//*[@id=\"__layout\"]/div/div/div/div/main/div/section/div/div[2]/div[2]/div[2]/div[1]/div/label");
		private By first_name_thai_field = By.xpath("//*[@id=\"__layout\"]/div/div/div/div/main/div/section/div/div[2]/div[2]/div[2]/div[1]/div/div/input");
		private By last_name_thai_label = By.xpath("//*[@id=\"__layout\"]/div/div/div/div/main/div/section/div/div[2]/div[2]/div[2]/div[2]/div/label");
		private By last_name_thai_field = By.xpath("//*[@id=\"__layout\"]/div/div/div/div/main/div/section/div/div[2]/div[2]/div[2]/div[2]/div/div");
		private By mobifone_label = By.xpath("//*[@id=\"__layout\"]/div/div/div/div/main/div/section/div/div[2]/div[2]/div[3]/div[1]/div/label");
		private By mobifone_field = By.xpath("//*[@id=\"__layout\"]/div/div/div/div/main/div/section/div/div[2]/div[2]/div[3]/div[1]/div/div/div");
		private By email_address_label = By.xpath("//*[@id=\"__layout\"]/div/div/div/div/main/div/section/div/div[2]/div[2]/div[3]/div[2]/div/label");
		private By email_address_field = By.xpath("//*[@id=\"__layout\"]/div/div/div/div/main/div/section/div/div[2]/div[2]/div[3]/div[2]/div/div");
		private By discount_text_label = By.xpath("//*[@id=\"__layout\"]/div/div/div/div/main/div/section/div/div[2]/div[2]/div[4]/div/div[1]/label");
		private By discount_text_dropdownbox = By.xpath("//*[@id=\"__layout\"]/div/div/div/div/main/div/section/div/div[2]/div[2]/div[4]/div/div[1]/div");
		private By clear_discount_button = By.xpath("//*[@id=\"__layout\"]/div/div/div/div/main/div/section/div/div[2]/div[2]/div[4]/div/div[1]/div");
		private By confirmation_text_section = By.xpath("//*[@id=\"__layout\"]/div/div/div/div/main/div/section/div/div[2]/div[2]/div[5]");
		private By submit_prospect_button = By.xpath("//*[@id=\"__layout\"]/div/div/div/div/main/div/section/div/div[2]/div[2]/div[6]");
		private By detail_btn = By.xpath("//*[@id=\"__layout\"]/div/div/div/div/main/div/section/div/div[2]/div[1]/div/div/div[3]");
		private By thank_you_icon = By.xpath("//*[@id=\"__layout\"]/div/div/div/div/main/div/section/div/div[2]/div[2]/div/div[1]/i");
		private By thank_you_form = By.xpath("//*[@id=\"__layout\"]/div/div/div/div/main/div/section/div/div[2]/div[2]/div");
		private By back_to_home_btn = By.xpath("//*[@id=\"__layout\"]/div/div/div/div/main/div/section/div/div[2]/div[2]/div/div[2]");
		private By link_for_customer = By.xpath("//*[@id=\"__layout\"]/div/div/div/div/main/div/section/div/div[2]/div[2]/div/p[3]/a");
		//Function
		public void setup_driver (WebDriver driver) throws Exception {
			this.driver = driver;
		}
		
		public void verify_elements_of_prospect_page () throws Exception {
			WebElement prospectDetailLabel = driver.findElement(prospect_detail_label);
			prospectDetailLabel.isDisplayed();
			Assert.assertEquals(prospectDetailLabel.getText(), "Prospect Detail");
			WebElement insurerInformationSection = driver.findElement(insurer_information_section);
			insurerInformationSection.isDisplayed();
			WebElement priceNumber = driver.findElement(price_number);
			priceNumber.isDisplayed();
			WebElement sumInsuredLabel = driver.findElement(sum_insured_label);
			sumInsuredLabel.isDisplayed();
			Assert.assertEquals(sumInsuredLabel.getText(), "Sum Insured");
			WebElement firstNameEngLabel = driver.findElement(first_name_eng_label);
			Assert.assertEquals(firstNameEngLabel.getText(), "First Name (in English)");
			firstNameEngLabel.isDisplayed();
			WebElement firstNameEngField = driver.findElement(first_name_eng_field);
			firstNameEngField.isDisplayed();
			WebElement lastNameEngLabel = driver.findElement(last_name_eng_label);
			lastNameEngLabel.isDisplayed();
			Assert.assertEquals(lastNameEngLabel.getText(), "Last Name (in English)");
			WebElement lastNameEngField = driver.findElement(last_name_eng_field);
			lastNameEngField.isDisplayed();
			WebElement firstNameThaiLabel = driver.findElement(first_name_thai_label);
			firstNameThaiLabel.isDisplayed();
			Assert.assertEquals(firstNameThaiLabel.getText(), "First Name (in Thai)");
			WebElement firstNameThaiField = driver.findElement(first_name_thai_field);
			firstNameThaiField.isDisplayed();
			WebElement lastNameThaiLabel = driver.findElement(last_name_thai_label);
			lastNameThaiLabel.isDisplayed();
			Assert.assertEquals(lastNameThaiLabel.getText(), "Last Name (in Thai)");
			WebElement lastNameThaiField = driver.findElement(last_name_thai_field);
			lastNameThaiField.isDisplayed();
			WebElement mobifoneLabel = driver.findElement(mobifone_label);
			mobifoneLabel.isDisplayed();
			Assert.assertEquals(mobifoneLabel.getText(), "Mobile Phone");
			WebElement mobifoneField = driver.findElement(mobifone_field);
			mobifoneField.isDisplayed();
			WebElement emailAddressLabel = driver.findElement(email_address_label);
			emailAddressLabel.isDisplayed();
			Assert.assertEquals(emailAddressLabel.getText(), "Email Address");
			WebElement emailAddressField = driver.findElement(email_address_field);
			emailAddressField.isDisplayed();
			WebElement discountTextLabel = driver.findElement(discount_text_label);
			discountTextLabel.isDisplayed();
			Assert.assertEquals(discountTextLabel.getText(), "Select discount for customer");
			WebElement discountTextDropdownBox = driver.findElement(discount_text_dropdownbox);
			discountTextDropdownBox.isDisplayed();
			WebElement clearDiscountButton = driver.findElement(clear_discount_button);
			clearDiscountButton.isDisplayed();
			WebElement confirmationTextSection = driver.findElement(confirmation_text_section);
			confirmationTextSection.isDisplayed();
			WebElement submitProspectBtn = driver.findElement(submit_prospect_button);
			submitProspectBtn.isDisplayed();
			WebElement detailButton = driver.findElement(detail_btn);
			detailButton.isDisplayed();
			Thread.sleep(3000);
		}		
		
		public void input_information () throws Exception {
			WebElement firstNameEngField = driver.findElement(first_name_eng_field);
			firstNameEngField.sendKeys(firstNameEngInput);
			WebElement lastNameEngField = driver.findElement(last_name_eng_field);
			lastNameEngField.sendKeys(lastNameEngInput);
			WebElement firstNameThaiField = driver.findElement(first_name_thai_field);
			firstNameThaiField.sendKeys(firstNameThaiInput);
			WebElement lastNameThaiField = driver.findElement(last_name_thai_field);
			lastNameThaiField.sendKeys(lastNameThaiInput);
			WebElement mobifoneField = driver.findElement(mobifone_field);
			mobifoneField.sendKeys(mobifoneInput);
			WebElement emailAddressField = driver.findElement(email_address_field);
			emailAddressField.sendKeys(emailInput);
			Thread.sleep(3000);
			WebElement submitProspectBtn = driver.findElement(submit_prospect_button);
			submitProspectBtn.click();
			Thread.sleep(5000);
		}
		
		public void verify_message_after_submit_prospect () throws Exception {
			WebElement thankYouIcon = driver.findElement(thank_you_icon);
			thankYouIcon.isDisplayed();
			WebElement thankYouForm = driver.findElement(thank_you_form);
			thankYouForm.isDisplayed();
			WebElement linkToCustomer = driver.findElement(link_for_customer);
			linkToCustomer.isDisplayed();
			WebElement backToHomeButton = driver.findElement(back_to_home_btn);
			backToHomeButton.isDisplayed();
			Thread.sleep(3000);
		}
		
		public void navigate_to_plan_detail_input_information_page () throws Exception {
			WebElement linkToCustomer = driver.findElement(link_for_customer);
			linkToCustomer.click();
		}
		
		public void fill_application_step () throws Exception {
			
		}
}
