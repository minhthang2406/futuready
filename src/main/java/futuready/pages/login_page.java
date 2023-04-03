package futuready.pages;
import futuready.base.baseSetup;
//import org.openqa.*;
import org.openqa.selenium.*;
public class login_page {
	baseSetup setup = new baseSetup();
	public String lineUsername_input = "vinhbong54@gmail.com";
	public String lineUserPassword_input = "Thangquan8996@";
	private WebDriver driver;
	//Get Locator
	private By language_btn = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/a[1]");
	private By logo = By.xpath("//div[@class='logo']");
	private By login_label = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/h2[1]");
	private By login_with_line_btn = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[1]/button[1]");
	private By login_with_username_label_text = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/form[1]/div[2]");
	private By signup_label_text = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/form[1]/div[3]");
	private By signup_with_line_btn = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/form[1]/div[4]/span[2]");
	private By click_here_btn = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/form[1]/div[2]/span[1]");
	private By signup_button = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/form[1]/div[3]/span[1]");
	//Line Login Page
	private By line_user_name = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/fieldset[1]/div[1]/input[1]");
	private By line_user_password = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/fieldset[1]/div[2]/input[1]");
	private By login_line_btn = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/fieldset[1]/div[3]/button[1]");
	private By create_qr_code_btn = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/a[1]");
	private By displayed_qr_code = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/p[1]/img[1]");
	public void setup_driver (WebDriver base_driver) throws Exception {
		this.driver = base_driver;
	}
	
	public void click_on_login_with_line_btn () throws Exception {
		WebElement loginWithLineBtn = driver.findElement(login_with_line_btn);
		if (loginWithLineBtn.isDisplayed()) {
			loginWithLineBtn.click();
		}
	}
	
	public void click_on_language_btn_from_eng_to_thai () throws Exception {
		WebElement languageBtn = driver.findElement(language_btn);
		if (languageBtn.isDisplayed()) {
			languageBtn.click();
		}
		Thread.sleep(2000);
	}
	
	public void click_on_language_btn_from_thai_to_eng () throws Exception {
		WebElement languageBtn_thai_to_eng = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/a[1]"));
		if (languageBtn_thai_to_eng.isDisplayed()) {
			languageBtn_thai_to_eng.click();
		}
		Thread.sleep(2000);
	}
	
	public void click_on_button_to_login_with_username_and_password () throws Exception {
		WebElement clickHereBtn = driver.findElement(click_here_btn);
		clickHereBtn.click();
		Thread.sleep(2000);
	}
	
	public void verify_displayed_elements () throws Exception {
		WebElement logo_app = driver.findElement(logo);
		WebElement loginLabel = driver.findElement(login_label);
		WebElement languageBtn = driver.findElement(language_btn);
		WebElement loginWithLineBtn = driver.findElement(login_with_line_btn);
		WebElement loginWithUserNameLabelText = driver.findElement(login_with_username_label_text);
		WebElement signUpLabelText = driver.findElement(signup_label_text);
		WebElement signUpWithLineBtn = driver.findElement(signup_with_line_btn);
		
		logo_app.isDisplayed();
		loginLabel.isDisplayed();
		languageBtn.isDisplayed();
		loginWithLineBtn.isDisplayed();
		loginWithUserNameLabelText.isDisplayed();
		signUpLabelText.isDisplayed();
		signUpWithLineBtn.isDisplayed();
		Thread.sleep(2000);
		
	}
	
	public void navigate_to_login_page () throws Exception {
		driver.navigate().to("https://dev-friends.futuready.co.th/en/login");
		Thread.sleep(3000);
	}
	
	public void login_line_account () throws Exception {
		WebElement lineUsername = driver.findElement(line_user_name);
		WebElement linePassword = driver.findElement(line_user_password);
		WebElement loginLineBtn = driver.findElement(login_line_btn);
		lineUsername.sendKeys(lineUsername_input);
		Thread.sleep(1000);
		linePassword.sendKeys(lineUserPassword_input);
		Thread.sleep(1000);
		loginLineBtn.click();
	}
	
	public void login_line_by_qrcode () throws Exception {
		WebElement createQRcode = driver.findElement(create_qr_code_btn);
		createQRcode.click();
		Thread.sleep(2000);
		WebElement displayedQrCode = driver.findElement(displayed_qr_code);
		displayedQrCode.isDisplayed();
		Thread.sleep(2000);
	}
	
	public void click_on_signup_btn () throws Exception {
		WebElement signupBtn = driver.findElement(signup_button);
		signupBtn.click();
		Thread.sleep(2000);
	}
	
	public void TC_FU_001_LGI_01 () throws Exception {
		Thread.sleep(4000);
		WebElement logo_app = driver.findElement(logo);
		WebElement loginLabel = driver.findElement(login_label);
		WebElement languageBtn = driver.findElement(language_btn);
		WebElement loginWithLineBtn = driver.findElement(login_with_line_btn);
		WebElement loginWithUserNameLabelText = driver.findElement(login_with_username_label_text);
		WebElement signUpLabelText = driver.findElement(signup_label_text);
		WebElement signUpWithLineBtn = driver.findElement(signup_with_line_btn);
		
		logo_app.isDisplayed();
		loginLabel.isDisplayed();
		languageBtn.isDisplayed();
		loginWithLineBtn.isDisplayed();
		loginWithUserNameLabelText.isDisplayed();
		signUpLabelText.isDisplayed();
		signUpWithLineBtn.isDisplayed();
	}
	
	public void TC_FU_001_LGI_02 () throws Exception {
		Thread.sleep(3000);
		WebElement languageBtn = driver.findElement(language_btn);
		languageBtn.click();
		Thread.sleep(2000);
		WebElement languageBtn_after_click = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/a[1]"));
		languageBtn_after_click.click();
	}
	
	public void TC_FU_001_LGI_03 () throws Exception {
		
		
	}
	
	public void TC_FU_001_LGI_04 () throws Exception {
		
	}
	
	public void TC_FU_001_LGI_05 () throws Exception {
		
	}
	
	public void TC_FU_001_LGI_06 () throws Exception {
		
	}
	
	public void TC_FU_001_LGI_07 () throws Exception {
		
	}
	
	public void TC_FU_001_LGI_08 () throws Exception {
		
	}

	public void quit() throws Exception {
		driver.quit();
		
	}
}
