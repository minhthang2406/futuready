package futuready.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import futuready.pages.*;
import futuready.base.*;
import org.openqa.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.edge.*;
import org.openqa.selenium.firefox.*;
import org.testng.*;

public class dashboard_page {
	public static WebDriver driver;
	//Locator
	private By logo_futuready = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/div[1]/div[1]/a[1]/img[1]");
	private By dashboard_feature = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/main[1]/section[1]/div[1]/div[1]/div[1]");
	private By category = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/main[1]/section[2]/div[1]/div[1]/div[1]");
	private By navbar_menu = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/div[1]/div[2]");
	private By my_profile_btn = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/div[1]/div[2]/div[1]/a[2]/span[1]/i[1]");
	private By logout_btn = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/main[1]/section[2]/div[1]/div[3]/button[1]/span[1]");
	private By notification_btn = By.xpath("//*[@id=\"__layout\"]/div/div/nav/div/div[2]/div/a[1]/span/i");
	private By claim_btn = By.xpath("//*[@id=\"__layout\"]/div/div/nav/div/div[2]/div/a[3]/span");
	private By motor_box_btn = By.xpath("//*[@id=\"__layout\"]/div/div/main/section[2]/div/div/div/div/div[1]/div");
	private By motorbike_box_btn = By.xpath("//*[@id=\"__layout\"]/div/div/main/section[2]/div/div/div/div/div[2]");
	private By life_insurance_box = By.xpath("//*[@id=\"__layout\"]/div/div/main/section[2]/div/div/div/div/div[3]");
	//Function 
	public void setup (WebDriver driver) throws Exception {
		this.driver = driver;
		//something
	}
	
	public void verify_elements () throws Exception {
		WebElement logo = driver.findElement(logo_futuready);
		WebElement dashboard_feature = driver.findElement(category);
		WebElement navbarMenu = driver.findElement(category);
		logo.isDisplayed();
		dashboard_feature.isDisplayed();
		navbarMenu.isDisplayed();
	}
	
	public void logout_account () throws Exception {
		Thread.sleep(1000);
		WebElement myProfileBtn = driver.findElement(my_profile_btn);
		myProfileBtn.click();
		Thread.sleep(2000);
		WebElement logoutBtn = driver.findElement(logout_btn);
		logoutBtn.click();
		Thread.sleep(2000);
	}
	
	public void navigate_to_profile () throws Exception {
		WebElement myProfileBtn = driver.findElement(my_profile_btn);
		myProfileBtn.click();
		Thread.sleep(4000);
	}
	
	public void click_on_notification_button () throws Exception {
		WebElement notificationBtn = driver.findElement(notification_btn);
		notificationBtn.click();
		Thread.sleep(2000);
	}
	
	public void click_on_claim_button () throws Exception {
		WebElement claimBtn = driver.findElement(claim_btn);
		claimBtn.click();
		Thread.sleep(3000);
	}
	
	public void click_on_motor_box_btn () throws Exception {
		WebElement motorBoxButton = driver.findElement(motor_box_btn);
		motorBoxButton.click();
		Thread.sleep(4000);
	}
	
	public void click_on_motorbike_box_btn () throws Exception {
		WebElement motorBikeBoxButton = driver.findElement(motorbike_box_btn);
		motorBikeBoxButton.click();
		Thread.sleep(4000);
	}
	
	public void click_on_life_insurance_box () throws Exception {
		WebElement lifeInsuranceBox = driver.findElement(life_insurance_box);
		lifeInsuranceBox.click();
		Thread.sleep(3000);
	}
}
