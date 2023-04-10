package futuready.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.Random;
import java.util.Set;
import java.util.ArrayList;
import futuready.pages.*;
import futuready.base.*;
import org.openqa.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.edge.*;
import org.openqa.selenium.firefox.*;
import org.testng.*;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.event.KeyEvent;
import java.sql.Array;
import java.awt.datatransfer.StringSelection;
public class sign_up_account_page_2 {
WebDriver driver;	
private String email_address = "agencytester22@mailsac.com";
	//Locators
	private By date_of_birth_label = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[1]/div[1]/label[1]");
	private By national_id_label = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[1]/div[2]/label[1]");
	private By date_of_birth_field = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]");
	private By date_of_birth_year_dropdown = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/header[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/span[1]/select[1]");
	private By date_of_birth_year_selected = By.xpath("//option[contains(text(),'1989')]");
	private By date_of_birth_selected_date = By.xpath("//span[contains(text(),'24')]");
	private By mailing_address_label = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/form[1]/div[2]/div[1]/div[1]/label[1]");
	private By mailing_address_field = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/textarea[1]");
	private By province_label = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/textarea[1]");
	private By province_dropdown = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/form[1]/div[3]/div[1]/div[1]/div[1]/span[1]/select[1]");
	private By province_selected = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/form[1]/div[3]/div[1]/div[1]/div[1]/span[1]/select[1]/option[3]");
	private By district_label = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/form[1]/div[3]/div[1]/div[2]/label[1]");
	private By district_dropdown = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/form[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/span[1]/select[1]");
	private By district_selected = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/form[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/span[1]/select[1]/option[8]");
	private By sub_district_dropdown = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/form[1]/div[4]/div[1]/div[1]/label[1]");
	private By sub_district_selected = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/form[1]/div[4]/div[1]/div[1]/div[1]/span[1]/select[1]/option[2]");
	private By zip_code = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/form[1]/div[4]/div[1]/div[2]/label[1]");
	private By zip_code_field = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/form[1]/div[4]/div[1]/div[2]/div[1]/input[1]");
	private By bank_name_label = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/form[1]/div[5]/div[1]/div[1]/label[1]");
	private By bank_name_field = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/form[1]/div[5]/div[1]/div[1]/div[1]/input[1]");
	private By bank_account_number = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/form[1]/div[5]/div[1]/div[2]/label[1]");
	private By bank_account_number_field = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/form[1]/div[5]/div[1]/div[2]/div[1]/input[1]");
	private By bank_account_name_in_eng = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/form[1]/div[6]/div[1]/div[1]/label[1]");
	private By bank_account_name_in_eng_field = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/form[1]/div[6]/div[1]/div[1]/div[1]/input[1]");
	private By bank_branch_name_label = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/form[1]/div[7]/div[1]/div[1]/label[1]");
	private By bank_branch_name_field = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/form[1]/div[7]/div[1]/div[1]/div[1]/input[1]");
	private By bank_branch_code_label = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/form[1]/div[7]/div[1]/div[2]/label[1]");
	private By bank_branch_code_field = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/form[1]/div[7]/div[1]/div[2]/div[1]/input[1]");
	private By bank_account_scan_image_label = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/form[1]/div[8]/div[1]/div[1]/label[1]");
	private By bank_account_scan_image_file_button = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/form[1]/div[8]/div[1]/div[1]");
	private By national_id_scan_label = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/form[1]/div[9]/div[1]/div[1]/label[1]");
	private By national_id_field = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[1]/div[2]/div[1]/input[1]");
	private By national_id_scan_file_button = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/form[1]/div[9]/div[1]/div[1]");
	private By referrer_selected_label = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/form[1]/div[10]/div[1]/div[1]/label[1]");
	private By referrer_selected_dropdown = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/form[1]/div[10]/div[1]/div[1]/div[1]/span[1]/select[1]");
	private By referrer_selected = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/form[1]/div[10]/div[1]/div[1]/div[1]/span[1]/select[1]/option[2]");
	private By confirmation_text_1 = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/form[1]/div[11]/div[1]/div[1]/label[1]/span[2]/p[1]");
	private By confirmation_text_2 = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/form[1]/div[11]/div[2]/div[1]/label[1]/span[2]/p[1]");
	private By checkbox_1 = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/form[1]/div[11]/div[1]/div[1]/label[1]/span[1]");
	private By checkbox_2 = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/form[1]/div[11]/div[2]/div[1]/label[1]/span[1]");
	private By agreeText = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/form[1]/div[11]/div[3]/div[1]");
	private By next_button = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/form[1]/div[12]/p[1]/button[1]");
    private By submit_button = By.xpath("//*[@id=\"__layout\"]/div/div/section/div/div[3]/div/div[2]/p/button");
    private By resend_code_button = By.xpath("//*[@id=\"__layout\"]/div/div/section/div/div[3]/div/div[3]/span");
	private By back_button = By.xpath("//*[@id=\"__layout\"]/div/div/section/div/div[1]/div/div[1]");
    //Functions
	public void setup_driver (WebDriver driver) throws Exception {
		this.driver = driver;
	}
	
	public void verify_elements () throws Exception {
		WebElement dateOofBirthLabel = driver.findElement(date_of_birth_label);
		dateOofBirthLabel.isDisplayed();
		WebElement dateOfBirthField = driver.findElement(date_of_birth_field);
		dateOfBirthField.isDisplayed();
		WebElement dateOfBirthYearDropDown = driver.findElement(date_of_birth_year_dropdown);
		dateOfBirthYearDropDown.isDisplayed();
		WebElement nationalIdLabel = driver.findElement(national_id_label);
		nationalIdLabel.isDisplayed();
		WebElement nationalIdField = driver.findElement(national_id_field);
		nationalIdField.isDisplayed();
		WebElement maillingAddressLabel = driver.findElement(mailing_address_label);
		maillingAddressLabel.isDisplayed();
		WebElement maillingAddressField = driver.findElement(mailing_address_field);
		maillingAddressField.isDisplayed();
		WebElement provinceLabel = driver.findElement(province_label);
		provinceLabel.isDisplayed();
		WebElement provinceDropdown = driver.findElement(province_dropdown);
		provinceDropdown.isDisplayed();
		WebElement districtLabel = driver.findElement(district_label);
		districtLabel.isDisplayed();
		WebElement districtField = driver.findElement(district_label);
		districtField.isDisplayed();
		WebElement subDistrictDropdown = driver.findElement(sub_district_dropdown);
		subDistrictDropdown.isDisplayed();
		WebElement zipCode = driver.findElement(zip_code);
		zipCode.isDisplayed();
		WebElement zipCodeField = driver.findElement(zip_code);
		zipCodeField.isDisplayed();
		WebElement bankNameLabel = driver.findElement(bank_name_label);
		bankNameLabel.isDisplayed();
		WebElement bankNameField = driver.findElement(bank_name_field);
		bankNameField.isDisplayed();
	}
	
	public void select_date_of_birth () throws Exception {
		WebElement selectBirthDropdown = driver.findElement(date_of_birth_field);
		selectBirthDropdown.click();
		Thread.sleep(3000);
		WebElement selectYearDropdown = driver.findElement(date_of_birth_year_dropdown);
		selectYearDropdown.click();
		Thread.sleep(3000);
		WebElement selectYear = driver.findElement(date_of_birth_year_selected);
		selectYear.click();
		Thread.sleep(3000);
		WebElement selectDate = driver.findElement(date_of_birth_selected_date);
		selectDate.click();
		Thread.sleep(2000);
	}
	
	public void input_national_id_number () throws Exception {
		Random rand = new Random();
		int nationalId = rand.nextInt(111111111,999999999);
		String nationalIdInput = Integer.toString(nationalId) + "1234";
		WebElement nationalIdField = driver.findElement(national_id_field);
		nationalIdField.sendKeys(nationalIdInput);
		
	}
	
	public void input_mailling_address () throws Exception {
		Random rand = new Random();
		int emailAddress = rand.nextInt(11111,99999);
		String emailAddInput = Integer.toString(emailAddress) + "@gmail.com";
		WebElement emailAddressField = driver.findElement(mailing_address_field);
		emailAddressField.sendKeys(email_address);
		Thread.sleep(2000);
	}
	
	public void select_province () throws Exception {
		WebElement provinceDropdown = driver.findElement(province_dropdown);
		provinceDropdown.click();
		Thread.sleep(1000);
		WebElement provinceSelected = driver.findElement(province_selected);
		provinceSelected.click();
		Thread.sleep(2000);
	}
	
	public void select_district () throws Exception {
		WebElement districtDropdown = driver.findElement(district_dropdown);
		districtDropdown.click();
		Thread.sleep(1000);
		WebElement selectedDistrict = driver.findElement(district_selected);
		selectedDistrict.click();
		Thread.sleep(2000);
	}
	
	public void select_sub_district () throws Exception {
		WebElement subDistrictDropdown = driver.findElement(sub_district_dropdown);
		subDistrictDropdown.click();
		Thread.sleep(1000);
		WebElement selectedSubDistrict = driver.findElement(sub_district_selected);
		selectedSubDistrict.click();
		Thread.sleep(2000);
		
	}
	
	public void input_zip_code () throws Exception {
		Random rand = new Random();
		int randomZipCode = rand.nextInt(1111,9999);
		String inputtedZipCode = Integer.toString(randomZipCode);
		WebElement zipCodeField = driver.findElement(zip_code_field);
		zipCodeField.sendKeys(inputtedZipCode);
	}
	
	public void input_bank_name () throws Exception {
	    	String[] bankName = {"A Chau Bank", "Vietcombank", "BIDV", "An Binh Bank", "Citibank", "Agribank"};
		    int bankNameCount = bankName.length;
		    Random rand = new Random();
		    String selectedBank = null;
	    for (int i =0; i<bankNameCount; i++) {
	    	int randomBankNameCount = rand.nextInt(0,bankNameCount);
	    	selectedBank = bankName[randomBankNameCount];
	    	
	    }
	    
		WebElement inputBankNameField = driver.findElement(bank_name_field);
		inputBankNameField.sendKeys(selectedBank);
		
	}
	
	public void input_bank_account_number () throws Exception {
		WebElement bankAccountNumberField = driver.findElement(bank_account_number_field);
		Random rand = new Random();
		int randomBankAccountNumber = rand.nextInt(111111111,999999999);
		String fullBankAccountNumber = Integer.toString(randomBankAccountNumber) + "1234";
		bankAccountNumberField.sendKeys(fullBankAccountNumber);
		Thread.sleep(1000);
	}
	
	public void input_bank_account_name () throws Exception {
		String[] bankAccountName = {"John", "Peter", "Obama", "Jessy", "Maira", "Daisy"};
	    int bankAccNameCount = bankAccountName.length;
	    Random rand = new Random();
	    String selectedBankAcc = null;
    for (int i =0; i<bankAccNameCount; i++) {
    	int randomBankAccNameCount = rand.nextInt(0,bankAccNameCount);
    	selectedBankAcc = bankAccountName[randomBankAccNameCount];
    	
    }
    
	WebElement inputBankAccNameField = driver.findElement(bank_account_name_in_eng_field);
	inputBankAccNameField.sendKeys(selectedBankAcc);
		
	}
	
	public void input_bank_branch_name () throws Exception {
		WebElement inputBankBranchNameField = driver.findElement(bank_branch_name_field);
		inputBankBranchNameField.sendKeys("Branc 01");	
		Thread.sleep(1000);
	}
	
	public void input_brank_branch_code () throws Exception {
		WebElement inputBankBranchCodeField = driver.findElement(bank_branch_code_field);
		inputBankBranchCodeField.sendKeys("012345");	
		Thread.sleep(4000);
		
	}
	
	public void upload_bank_account_image () throws Exception {
		WebElement uploadButton = driver.findElement(bank_account_scan_image_file_button);
		uploadButton.click();
		Thread.sleep(2000);
		Robot rb = new Robot();
		//Create instance of Clipboard class

		   Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		//Set the String to Enter

		   StringSelection selectedString = new StringSelection("G:\\eclipse new\\futuready\\Images\\aaa.jpg");
		//Copy the String to Clipboard

		   clipboard.setContents(selectedString, null);
		//Use Robot class instance to simulate CTRL+C and CTRL+V key events :

		  rb.keyPress(KeyEvent.VK_CONTROL);
		  rb.keyPress(KeyEvent.VK_V);
		  rb.keyRelease(KeyEvent.VK_V);
		  rb.keyRelease(KeyEvent.VK_CONTROL);
		  Thread.sleep(2000);
		//Simulate Enter key event
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
	}
	
	public void upload_national_id_scan_image () throws Exception {
		WebElement uploadNationalIdButton = driver.findElement(national_id_scan_file_button);
		uploadNationalIdButton.click();
		Thread.sleep(2000);
		Robot rb = new Robot();
		//Create instance of Clipboard class

		   Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		//Set the String to Enter

		   StringSelection selectedString = new StringSelection("G:\\eclipse new\\futuready\\Images\\aaa.jpg");
		//Copy the String to Clipboard

		   clipboard.setContents(selectedString, null);
		//Use Robot class instance to simulate CTRL+C and CTRL+V key events :

		  rb.keyPress(KeyEvent.VK_CONTROL);
		  rb.keyPress(KeyEvent.VK_V);
		  rb.keyRelease(KeyEvent.VK_V);
		  rb.keyRelease(KeyEvent.VK_CONTROL);
		  Thread.sleep(2000);
		//Simulate Enter key event
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
	}
	
	public void select_referrer_dropdown_box () throws Exception {
		WebElement referrerDropdownBox = driver.findElement(referrer_selected_dropdown);
		referrerDropdownBox.click();
		Thread.sleep(2000);
		WebElement selectedReferrer = driver.findElement(referrer_selected);
		selectedReferrer.click();
		Thread.sleep(2000);
	}
	
	public void click_on_checkbox_1 () throws Exception {
		WebElement checkBox1 = driver.findElement(checkbox_1);
		checkBox1.click();
		Thread.sleep(1000);
	}
	
	public void click_on_checkbox_2 () throws Exception {
		WebElement checkBox2 = driver.findElement(checkbox_2);
		checkBox2.click();
		Thread.sleep(1000);
	}
	
	public void click_on_next_button () throws Exception {
		WebElement nextButton = driver.findElement(next_button);
		nextButton.click();
		Thread.sleep(8000);
	}
	
	public void click_on_next_button_for_checking_alert_message () throws Exception {
		WebElement nextButton = driver.findElement(next_button);
		nextButton.click();
		Thread.sleep(1000);
	}
	
	public void open_new_tab () throws Exception {
		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_T);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_T);
		Thread.sleep(2000);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_2);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_2);
		Thread.sleep(2000);
		
		//Switch focus to new tab
		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		Thread.sleep(2000);
		driver.navigate().to("http://mailsac.com");
		Thread.sleep(3000);
		
		
	}
	
	
	public void verify_email () throws Exception {
		
		WebElement email_address = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div[2]/div/input[1]"));
		email_address.sendKeys("agencytester22@mailsac.com");
		WebElement checkMailBtn = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div[2]/div/button"));
		checkMailBtn.click();
		Thread.sleep(3000);
	
		WebElement selectedMail = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div/div[2]/div/table/tbody/tr[2]"));
		selectedMail.click();
		Thread.sleep(3000);
		WebElement bodyOfMail = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div/div[2]/div/table/tbody/tr[2]/td[2]/div[2]"));
		String bodyMailString = bodyOfMail.getText();
		char[] bodyOfMai1Char = bodyMailString.toCharArray();
		
		System.out.println("Body of Mail is : " + bodyMailString);
		System.out.println("Body of Mail To Char is : ");
		System.out.println(bodyOfMai1Char);
		System.out.println(bodyOfMai1Char.length);
		char firstNumber = bodyOfMai1Char[bodyOfMai1Char.length-6];
		char secondNumber = bodyOfMai1Char[bodyOfMai1Char.length-5];
		char thirdNumber = bodyOfMai1Char[bodyOfMai1Char.length-4];
		char fourthNumber = bodyOfMai1Char[bodyOfMai1Char.length-3];
		char fifthNumber = bodyOfMai1Char[bodyOfMai1Char.length-2];
		char sixthNumber = bodyOfMai1Char[bodyOfMai1Char.length-1];
		System.out.println(firstNumber);
		System.out.println(secondNumber);
		System.out.println(thirdNumber);
		System.out.println(fourthNumber);
		System.out.println(fifthNumber);
		System.out.println(sixthNumber);
		Thread.sleep(3000);
		//////
		String firstNumberInput = String.valueOf(firstNumber);
		String secondNumberInput = String.valueOf(secondNumber);
		String thirdNumberInput = String.valueOf(thirdNumber);
		String fourthNumberInput = String.valueOf(fourthNumber);
		String fifthNumberInput = String.valueOf(fifthNumber);
		String sixthNumberInput = String.valueOf(sixthNumber);
		
		
		//Switch focus to Futuready tab
		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(tabs.get(0));
		Thread.sleep(2000);
				
				
				
		WebElement first_input_number = driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div/section/div/div[3]/div/div[1]/span/div[1]/input"));
		WebElement second_input_number = driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div/section/div/div[3]/div/div[1]/span/div[2]/input"));
		WebElement third_input_number = driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div/section/div/div[3]/div/div[1]/span/div[3]/input"));
		WebElement fourth_input_number = driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div/section/div/div[3]/div/div[1]/span/div[4]/input"));
		WebElement fifth_input_number = driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div/section/div/div[3]/div/div[1]/span/div[5]/input"));
		WebElement sixth_input_number = driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div/section/div/div[3]/div/div[1]/span/div[6]/input"));
		System.out.println("Verification Code " +firstNumberInput + " " + secondNumberInput + " " + thirdNumberInput + " " + fourthNumberInput + " " + fifthNumberInput + " " + sixthNumberInput);
		first_input_number.sendKeys(firstNumberInput);
		Thread.sleep(500);
		second_input_number.sendKeys(secondNumberInput);
		Thread.sleep(500);
		third_input_number.sendKeys(thirdNumberInput);
		Thread.sleep(500);
		fourth_input_number.sendKeys(fourthNumberInput);
		Thread.sleep(500);
		fifth_input_number.sendKeys(fifthNumberInput);
		Thread.sleep(500);
		sixth_input_number.sendKeys(sixthNumberInput);
		Thread.sleep(1500);
	}
	
	public void click_on_submit_button () throws Exception {
		WebElement submitBtn = driver.findElement(submit_button);
		submitBtn.click();
		Thread.sleep(4000);
	}
	
	public void click_on_back_btn () throws Exception {
		WebElement backBtn = driver.findElement(back_button);
		backBtn.click();
		Thread.sleep(2000);
	}
	
	public void handle_constrain_validation_message () throws Exception {
		//Steps to Handle the Constrain Validation Message
		//1. Get the nearest xpath of an element such as input field, radio button, checkboxes
		// 2. Get Attribute of it and compare to the result message
		String message = driver.findElement(By.xpath("//*[@id=\"consent\"]/div[1]/div/label/input")).getAttribute("validationMessage");
		Thread.sleep(2000);
		System.out.println("Message is : "+ message);
		Assert.assertEquals(message, "Please check this box if you want to proceed.");
	}
	
}
