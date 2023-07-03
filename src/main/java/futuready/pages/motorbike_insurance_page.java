package futuready.pages;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
public class motorbike_insurance_page {
	WebDriver driver;
	//Locator
	private By motorbike_insurance_label = By.xpath("//*[@id=\"__layout\"]/div/div/div/div/main/div/section/div/h3");
	private By search_for_branch_field = By.xpath("//*[@id=\"__layout\"]/div/div/div/div/main/div/section/div/div/div[2]/form/div[1]/div/div[11]/div/div/div/div/div[1]/input");
	//Setup Driver
	public void setup_driver (WebDriver driver) throws Exception {
		this.driver = driver;
	}
	//Function
	public void verify_elements () throws Exception {
		WebElement motorbikeInsuranceLabel = driver.findElement(motorbike_insurance_label);
		motorbikeInsuranceLabel.isDisplayed();
		WebElement branchSearchField = driver.findElement(search_for_branch_field);
		branchSearchField.isDisplayed();
		Thread.sleep(3000);
	}
	
	public void click_on_search_branch_field () throws Exception {
		WebElement branchSearchField = driver.findElement(search_for_branch_field);
		branchSearchField.click();
		Thread.sleep(2000);
	}
	
	public void input_search_keys () throws Exception {
		WebElement branchSearchField = driver.findElement(search_for_branch_field);
		branchSearchField.sendKeys("Honda");
		Thread.sleep(2000);
	}
}
