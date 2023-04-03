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
import org.testng.*;
public class sign_up_account_page_2 {
WebDriver driver;	
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
	private By bank_account_scan_image_file_button = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/form[1]/div[8]/div[1]/div[1]/div[1]/input[1]");
	private By national_id_scan_label = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/form[1]/div[9]/div[1]/div[1]/label[1]");
	private By national_id_field = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[1]/div[2]/div[1]/input[1]");
	private By national_id_scan_file_button = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/form[1]/div[9]/div[1]/div[1]/div[1]/input[1]");
	private By referrer_selected_label = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/form[1]/div[10]/div[1]/div[1]/label[1]");
	private By referrer_selected_dropdown = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/form[1]/div[10]/div[1]/div[1]/div[1]/span[1]/select[1]");
	private By referrer_selected = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/form[1]/div[10]/div[1]/div[1]/div[1]/span[1]/select[1]/option[2]");
	private By confirmation_text_1 = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/form[1]/div[11]/div[1]/div[1]/label[1]/span[2]/p[1]");
	private By confirmation_text_2 = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/form[1]/div[11]/div[2]/div[1]/label[1]/span[2]/p[1]");
	private By checkbox_1 = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/form[1]/div[11]/div[1]/div[1]/label[1]/span[1]");
	private By checkbox_2 = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/form[1]/div[11]/div[2]/div[1]/label[1]/span[1]");
	private By agreeText = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/form[1]/div[11]/div[3]/div[1]");
	private By next_button = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/form[1]/div[12]/p[1]/button[1]");

	//Functions
	public void setup_driver (WebDriver driver) throws Exception {
		this.driver = driver;
	}
	
	public void verify_elements () throws Exception {
		
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
		emailAddressField.sendKeys(emailAddInput);
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
		
	}
	
	public void input_bank_account_name () throws Exception {
		
	}
	
	public void input_bank_branch_name () throws Exception {
		
	}
	
	public void input_brank_branch_code () throws Exception {
		
	}
	
	public void upload_bank_account_image () throws Exception {
		
	}
	
	public void upload_national_id_scan_image () throws Exception {
		
	}
	
	public void select_referrer_dropdown_box () throws Exception {
		
	}
	
	public void click_on_next_button () throws Exception {
		
	}
}
