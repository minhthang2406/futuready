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
}
