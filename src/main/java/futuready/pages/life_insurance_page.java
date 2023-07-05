package futuready.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
public class life_insurance_page {
WebDriver driver;
	//Locator
	private By life_insurance_label = By.xpath("//*[@id=\"__layout\"]/div/div/section/div/h3");
	private By date_of_birth_label = By.xpath("//*[@id=\"__layout\"]/div/div/section/div/div/div[2]/form/div[1]/label");
	private By date_of_birth_field = By.xpath("//*[@id=\"__layout\"]/div/div/section/div/div/div[2]/form/div[1]/div/div/div[1]/div/input");
	private By select_year_of_birth = By.xpath("//*[@id=\"__layout\"]/div/div/section/div/div/div[2]/form/div[1]/div/div/div[3]/div/div/div/header/div/div/div/div/div/div[2]/span/select");
	private By select_gender_label = By.xpath("//*[@id=\"__layout\"]/div/div/section/div/div/div[2]/form/label[1]");
	private By select_gender_male = By.xpath("//*[@id=\"__layout\"]/div/div/section/div/div/div[2]/form/div[2]/div/div/div[1]");
	private By select_gender_female = By.xpath("//*[@id=\"__layout\"]/div/div/section/div/div/div[2]/form/div[2]/div/div/div[2]");
	private By select_occupation_label = By.xpath("//*[@id=\"__layout\"]/div/div/section/div/div/div[2]/form/div[3]/label");
	private By select_occupation_dropdown = By.xpath("//*[@id=\"__layout\"]/div/div/section/div/div/div[2]/form/div[3]/div/span/select");
	private By select_sub_occupation_label = By.xpath("//*[@id=\"__layout\"]/div/div/section/div/div/div[2]/form/div[4]/label");
	private By select_sub_occupation_dropdown_box = By.xpath("//*[@id=\"__layout\"]/div/div/section/div/div/div[2]/form/div[4]/div/span/select");
	private By search_by_label = By.xpath("//*[@id=\"__layout\"]/div/div/section/div/div/div[2]/form/label[2]");
	private By search_by_sum_insured_selecte = By.xpath("//*[@id=\"__layout\"]/div/div/section/div/div/div[2]/form/div[5]/div/div/div[1]/label");
	private By search_by_yearly_premium_account = By.xpath("//*[@id=\"__layout\"]/div/div/section/div/div/div[2]/form/div[5]/div/div/div[1]/label");
	private By amount_label = By.xpath("//*[@id=\"__layout\"]/div/div/section/div/div/div[2]/form/div[6]/label");
	private By amount_field = By.xpath("//*[@id=\"__layout\"]/div/div/section/div/div/div[2]/form/div[6]/div/input");
	private By search_plan_button = By.xpath("//*[@id=\"__layout\"]/div/div/section/div/div/div[2]/form/div[7]/div/button");
	
	//functions
	public void setup_driver (WebDriver driver) {
		this.driver = driver;
	}
	
	public void verify_element () {
		WebElement label = driver.findElement(life_insurance_label);
		label.isDisplayed();
		Assert.assertEquals(label.getText(), "Find Your Life Insurance plans");
		WebElement dateOfBirthLabel = driver.findElement(date_of_birth_label);
		dateOfBirthLabel.isDisplayed();
		WebElement dateOfBirthField = driver.findElement(date_of_birth_field);
		dateOfBirthField.isDisplayed();
		WebElement selectGenderLabel = driver.findElement(select_gender_label);
		selectGenderLabel.isDisplayed();
		WebElement selectGenderMale = driver.findElement(select_gender_male);
		selectGenderMale.isDisplayed();
		WebElement selectGenderFemale = driver.findElement(select_gender_female);
		selectGenderFemale.isDisplayed();
		WebElement selectOccupationLabel = driver.findElement(select_occupation_label);
		selectOccupationLabel.isDisplayed();
		WebElement selectOccupationDropdown = driver.findElement(select_occupation_dropdown);
		selectOccupationDropdown.isDisplayed();
		WebElement selectOccupationSubLabel = driver.findElement(select_sub_occupation_label);
		selectOccupationSubLabel.isDisplayed();
		WebElement selectOccupationSubDropdown = driver.findElement(select_sub_occupation_dropdown_box);
		selectOccupationSubDropdown.isDisplayed();
		WebElement searchByLabel = driver.findElement(search_by_label);
		searchByLabel.isDisplayed();
		WebElement searchBySumInsured = driver.findElement(search_by_sum_insured_selecte);
		searchBySumInsured.isDisplayed();
		WebElement searchByYearlyPremiumAmount = driver.findElement(search_by_yearly_premium_account);
		searchByYearlyPremiumAmount.isDisplayed();
		WebElement amountLabel = driver.findElement(amount_label);
		amountLabel.isDisplayed();
		WebElement amountField = driver.findElement(amount_field);
		amountField.isDisplayed();
		WebElement searchPlanButton = driver.findElement(search_plan_button);
		searchPlanButton.isDisplayed();
	}
	
	public void select_date_of_birth () throws Exception {
		WebElement dateOfBirthField = driver.findElement(date_of_birth_field);
		dateOfBirthField.click();
		
	}
}
