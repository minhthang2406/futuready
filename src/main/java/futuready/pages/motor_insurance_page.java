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
public class motor_insurance_page {
	WebDriver driver;
	//Locators
	private By motor_insurance_label = By.xpath("//*[@id=\"__layout\"]/div/div/div/div/main/div/section/div/h3");
	private By toyota_box = By.xpath("//*[@id=\"__layout\"]/div/div/div/div/main/div/section/div/div/div[2]/form/div[1]/div/div[1]/div");
	private By honda_box = By.xpath("//*[@id=\"__layout\"]/div/div/div/div/main/div/section/div/div/div[2]/form/div[1]/div/div[2]");
	private By mazda_box = By.xpath("//*[@id=\"__layout\"]/div/div/div/div/main/div/section/div/div/div[2]/form/div[1]/div/div[3]/div");
	private By nissan_box = By.xpath("//*[@id=\"__layout\"]/div/div/div/div/main/div/section/div/div/div[2]/form/div[1]/div/div[4]/div");
	private By mitsubishi_box = By.xpath("//*[@id=\"__layout\"]/div/div/div/div/main/div/section/div/div/div[2]/form/div[1]/div/div[5]/div");
	private By suzuki_box = By.xpath("//*[@id=\"__layout\"]/div/div/div/div/main/div/section/div/div/div[2]/form/div[1]/div/div[6]/div");
	private By chevrolet_box = By.xpath("//*[@id=\"__layout\"]/div/div/div/div/main/div/section/div/div/div[2]/form/div[1]/div/div[7]");
	private By isuzu_box = By.xpath("//*[@id=\"__layout\"]/div/div/div/div/main/div/section/div/div/div[2]/form/div[1]/div/div[8]/div");
	private By mercedes_box = By.xpath("//*[@id=\"__layout\"]/div/div/div/div/main/div/section/div/div/div[2]/form/div[1]/div/div[9]");
	private By bmw_box = By.xpath("//*[@id=\"__layout\"]/div/div/div/div/main/div/section/div/div/div[2]/form/div[1]/div/div[10]/div");
	private By brand_label = By.xpath("//*[@id=\"__layout\"]/div/div/div/div/main/div/section/div/div/div[2]/form/div[1]/div/div[11]/div/div/div/label");
	private By search_brand_field = By.xpath("//*[@id=\"__layout\"]/div/div/div/div/main/div/section/div/div/div[2]/form/div[1]/div/div[11]/div/div/div/div/div[1]/input");
	private By toyota_selected_box = By.xpath("//*[@id=\"__layout\"]/div/div/div/div/main/div/section/div/div/div[2]/div/div/div/div/span");
	private By year_label = By.xpath("//*[@id=\"__layout\"]/div/div/div/div/main/div/section/div/div/div[2]/form/div[2]/div/div/div/label");
	private By year_field = By.xpath("//*[@id=\"__layout\"]/div/div/div/div/main/div/section/div/div/div[2]/form/div[2]/div/div/div/div/div[1]/input");
	private By year_selected_box = By.xpath("//*[@id=\"__layout\"]/div/div/div/div/main/div/section/div/div/div[2]/div/div/div/div[2]");
	private By model_label = By.xpath("//*[@id=\"__layout\"]/div/div/div/div/main/div/section/div/div/div[2]/form/div[3]/div/div/div/label");
	private By model_field = By.xpath("//*[@id=\"__layout\"]/div/div/div/div/main/div/section/div/div/div[2]/form/div[3]/div/div/div/div/div[1]/input");
	private By selected_model_box = By.xpath("//*[@id=\"__layout\"]/div/div/div/div/main/div/section/div/div/div[2]/div/div/div/div[3]/span");
	private By sub_model_label = By.xpath("//*[@id=\"__layout\"]/div/div/div/div/main/div/section/div/div/div[2]/form/div[4]/div/div/div/label");
	private By sub_model_field = By.xpath("//*[@id=\"__layout\"]/div/div/div/div/main/div/section/div/div/div[2]/form/div[4]/div/div/div/div/div[1]/input");
	private By selected_sub_model = By.xpath("//*[@id=\"__layout\"]/div/div/div/div/main/div/section/div/div/div[2]/form/div[4]/div/div/div/div/div[2]/div/a[1]");
	private By selected_sub_model_box = By.xpath("//*[@id=\"__layout\"]/div/div/div/div/main/div/section/div/div/div[2]/div/div/div/div[4]/span");
	//Additional options
	private By option_1 = By.xpath("//*[@id=\"__layout\"]/div/div/div/div/main/div/section/div/div/div[2]/form/div[5]/div[1]/div/div/div[1]");
	private By option_2plus = By.xpath("//*[@id=\"__layout\"]/div/div/div/div/main/div/section/div/div/div[2]/form/div[5]/div[1]/div/div/div[2]");
	private By option_2 = By.xpath("//*[@id=\"__layout\"]/div/div/div/div/main/div/section/div/div/div[2]/form/div[5]/div[1]/div/div/div[3]");
	private By option_3plus = By.xpath("//*[@id=\"__layout\"]/div/div/div/div/main/div/section/div/div/div[2]/form/div[5]/div[1]/div/div/div[4]");
	private By option_3 = By.xpath("//*[@id=\"__layout\"]/div/div/div/div/main/div/section/div/div/div[2]/form/div[5]/div[1]/div/div/div[5]");
	private By option_CMI = By.xpath("//*[@id=\"__layout\"]/div/div/div/div/main/div/section/div/div/div[2]/form/div[5]/div[1]/div/div/div[6]");
	private By search_plan_button = By.xpath("//*[@id=\"__layout\"]/div/div/div/div/main/div/section/div/div/div[2]/form/div[5]/div[2]/div/button");
	//Search result page
	private By details_plan_label = By.xpath("//*[@id=\"__layout\"]/div/div/div/div/main/div/div[1]/div/div/div");
	private By first_plan_box = By.xpath("//*[@id=\"__layout\"]/div/div/div/div/main/div/div[2]/div[2]/div[2]/div[2]/div[1]/div");
	private By first_plan_box_label = By.xpath("//*[@id=\"__layout\"]/div/div/div/div/main/div/div[2]/div[2]/div[2]/div[2]/div[1]/div/div/div[1]/span");
	private By first_plan_box_logo = By.xpath("//*[@id=\"__layout\"]/div/div/div/div/main/div/div[2]/div[2]/div[2]/div[2]/div[1]/div/div/div[2]/div[1]/figure/img");
	private By first_plan_box_title = By.xpath("//*[@id=\"__layout\"]/div/div/div/div/main/div/div[2]/div[2]/div[2]/div[2]/div[1]/div/div/div[2]/div[2]");
	private By first_plan_box_sum_insurer_label = By.xpath("//*[@id=\"__layout\"]/div/div/div/div/main/div/div[2]/div[2]/div[2]/div[2]/div[1]/div/div/div[3]/div/div/span[1]");
	private By first_plan_box_sum_insurer_number = By.xpath("//*[@id=\"__layout\"]/div/div/div/div/main/div/div[2]/div[2]/div[2]/div[2]/div[1]/div/div/div[3]/div/div/span[2]");
	private By first_plan_box_view_button = By.xpath("//*[@id=\"__layout\"]/div/div/div/div/main/div/div[2]/div[2]/div[2]/div[2]/div[1]/div/div/div[4]/div[1]");
	private By first_plan_box_compare_checkbox = By.xpath("//*[@id=\"__layout\"]/div/div/div/div/main/div/div[2]/div[2]/div[2]/div[2]/div[1]/div/div/div[4]/div[2]/label/span[1]");
	private By first_plan_box_select_plan_button = By.xpath("//*[@id=\"__layout\"]/div/div/div/div/main/div/div[2]/div[2]/div[2]/div[2]/div[1]/div/div/div[5]/div/button");
	private By filter_section = By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/div[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[2]/div[1]/div[1]");
	private By filter_section_filter_label = By.xpath("//h5[contains(text(),'Filter')]");
	private By filter_section_class_label = By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/div[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[2]/div[1]/div[1]/p[1]");
	private By filter_section_class_01_checkbox = By.xpath("//*[@id=\"__layout\"]/div/div/div/div/main/div/div[2]/div[2]/div[1]/div/div[1]/div[1]/div/label");
	private By filter_section_class_02plus_checkbox = By.xpath("//*[@id=\"__layout\"]/div/div/div/div/main/div/div[2]/div[2]/div[1]/div/div[1]/div[2]/div/label");
	private By filter_section_class_02_checkbox = By.xpath("//*[@id=\"__layout\"]/div/div/div/div/main/div/div[2]/div[2]/div[1]/div/div[1]/div[3]/div/label");
	private By filter_section_class_03plus_checkbox = By.xpath("//*[@id=\"__layout\"]/div/div/div/div/main/div/div[2]/div[2]/div[1]/div/div[1]/div[4]/div/label");
	private By filter_section_class_03_checkbox = By.xpath("//*[@id=\"__layout\"]/div/div/div/div/main/div/div[2]/div[2]/div[1]/div/div[1]/div[5]/div/label");
	private By filter_section_class_CMI_checkbox = By.xpath("//*[@id=\"__layout\"]/div/div/div/div/main/div/div[2]/div[2]/div[1]/div/div[1]/div[6]/div/label");
	private By filter_section_repair_type_label = By.xpath("//*[@id=\"__layout\"]/div/div/div/div/main/div/div[2]/div[2]/div[1]/div/p[2]");
	private By filter_section_repair_type_garage_checkbox = By.xpath("//*[@id=\"__layout\"]/div/div/div/div/main/div/div[2]/div[2]/div[1]/div/div[2]/div[1]/div/label");
	private By filter_section_repair_type_dealer_checkbox = By.xpath("//*[@id=\"__layout\"]/div/div/div/div/main/div/div[2]/div[2]/div[1]/div/div[2]/div[2]/div/label");
	private By filter_section_insurer_label = By.xpath("//*[@id=\"__layout\"]/div/div/div/div/main/div/div[2]/div[2]/div[1]/div/p[3]");
	private By filter_section_thaisiri_insurance_checkbox = By.xpath("//*[@id=\"__layout\"]/div/div/div/div/main/div/div[2]/div[2]/div[1]/div/div[3]/div[1]/div/label");
	private By filter_section_thanachart_insurance_checkbox = By.xpath("//*[@id=\"__layout\"]/div/div/div/div/main/div/div[2]/div[2]/div[1]/div/div[3]/div[2]/div/label");
	private By filter_section_sum_insured_label = By.xpath("//*[@id=\"__layout\"]/div/div/div/div/main/div/div[2]/div[2]/div[1]/div/p[4]");
	private By filter_section_sum_insured_slider = By.xpath("//*[@id=\"__layout\"]/div/div/div/div/main/div/div[2]/div[2]/div[1]/div/div[4]/div[1]/div/div/div[1]");
	private By filter_section_sum_insured_minimum_field = By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/div[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[4]/div[2]/div[1]/div[1]/div[1]/input[1]");
	private By filter_section_sum_insured_maximum_field = By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/div[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[4]/div[2]/div[3]/div[1]/div[1]/input[1]");
	private By filter_section_apply_filter_button = By.xpath("//*[@id=\"__layout\"]/div/div/div/div/main/div/div[2]/div[2]/div[1]/div/div[5]/div/button[2]");
	private By filter_section_reset_filter_button = By.xpath("//*[@id=\"__layout\"]/div/div/div/div/main/div/div[2]/div[2]/div[1]/div/div[5]/div/button[1]");
	//Setup 
	public void setup (WebDriver driver) throws Exception {
		this.driver = driver;
	}
	
	//Functions
	public void verify_elements () throws Exception {
		WebElement motorInsuranceLabel = driver.findElement(motor_insurance_label);
		motorInsuranceLabel.isDisplayed();
		Thread.sleep(2000);
	}
	
	public void click_on_toyota () throws Exception {
		WebElement toyotaBox = driver.findElement(toyota_box);
		toyotaBox.click();
		Thread.sleep(2000);
	}
	
	public void verify_toyota_selected_box () throws Exception {
		WebElement toyotaSelectedBox = driver.findElement(toyota_selected_box);
		toyotaSelectedBox.isDisplayed();
	}
	
	public void select_year_field () throws Exception {
		WebElement yearField = driver.findElement(year_field);
		yearField.click();
		Thread.sleep(1000);
		WebElement selected_year = driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div/div/div/main/div/section/div/div/div[2]/form/div[2]/div/div/div/div/div[2]/div/a[2]"));
		selected_year.click();
		Thread.sleep(1000);
		WebElement yearSelectedBox = driver.findElement(year_selected_box);
		yearSelectedBox.isDisplayed();
		Thread.sleep(1000);
	}
	
	public void select_model_field () throws Exception {
		WebElement modelLabel = driver.findElement(model_label);
		modelLabel.isDisplayed();
		WebElement modelField = driver.findElement(model_field);
		modelField.click();
		Thread.sleep(1000);
		WebElement selectedModel = driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div/div/div/main/div/section/div/div/div[2]/form/div[3]/div/div/div/div/div[2]/div/a[3]"));
		selectedModel.click();
		Thread.sleep(1000);
		WebElement selectedModelBox = driver.findElement(selected_model_box);
		selectedModelBox.isDisplayed();
		Thread.sleep(1000);
	}
	
	public void select_sub_model_field () throws Exception {
		WebElement subModelLabel = driver.findElement(sub_model_label);
		subModelLabel.isDisplayed();
		Thread.sleep(1000);
		WebElement subModelField = driver.findElement(sub_model_field);
		subModelField.click();
		Thread.sleep(1000);
		WebElement selectedSubModel = driver.findElement(selected_sub_model);
		selectedSubModel.click();
		Thread.sleep(1000);
		WebElement selectedSubModelBox = driver.findElement(selected_sub_model_box);
		selectedSubModelBox.isDisplayed();
		Thread.sleep(2000);
	}
	
	public void click_on_search_plan_btn () throws Exception {
		WebElement searchPlanBtn = driver.findElement(search_plan_button);
		searchPlanBtn.click();
		Thread.sleep(6000);
	}
	
	public void verify_details_plan_label () throws Exception {
		WebElement detailsPlanLabel = driver.findElement(details_plan_label);
		detailsPlanLabel.isDisplayed();
		Thread.sleep(1000);
	}
	
	public void  verify_first_plan_box () throws Exception {
		WebElement firstPlanBox = driver.findElement(first_plan_box);
		firstPlanBox.isDisplayed();
		WebElement firstPlanBoxLabel = driver.findElement(first_plan_box_label);
		firstPlanBoxLabel.isDisplayed();
		WebElement firstPlanBoxLogo = driver.findElement(first_plan_box_logo);
		firstPlanBoxLogo.isDisplayed();
		WebElement firstPlanBoxTitle = driver.findElement(first_plan_box_title);
		firstPlanBoxTitle.isDisplayed();
		WebElement sumInsurerLabel = driver.findElement(first_plan_box_sum_insurer_label);
		sumInsurerLabel.isDisplayed();
		WebElement sumInsurerNumber = driver.findElement(first_plan_box_sum_insurer_number);
		sumInsurerNumber.isDisplayed();
		WebElement viewBtn = driver.findElement(first_plan_box_view_button);
		viewBtn.isDisplayed();
		//viewBtn.click();
		//Thread.sleep(2000);
		WebElement compareCheckbox = driver.findElement(first_plan_box_compare_checkbox);
		compareCheckbox.isDisplayed();
		WebElement selectPlanBtn = driver.findElement(first_plan_box_select_plan_button);
		selectPlanBtn.isDisplayed();
	}
	
	public void addtional_options () throws Exception {
		WebElement option1 = driver.findElement(option_1);
		option1.isDisplayed();
		option1.click();
		option1.click();
		Thread.sleep(500);
		WebElement option2plus = driver.findElement(option_2plus);
		option2plus.isDisplayed();
		option2plus.click();
		option2plus.click();
		Thread.sleep(500);
		WebElement option2 = driver.findElement(option_2);
		option2.isDisplayed();
		option2.click();
		option2.click();
		Thread.sleep(500);
		WebElement option3 = driver.findElement(option_3);
		option3.isDisplayed();
		option3.click();
		option3.click();
		Thread.sleep(500);
		WebElement option3plus = driver.findElement(option_3plus);
		option3plus.isDisplayed();
		option3plus.click();
		option3plus.click();
		Thread.sleep(500);
		WebElement optionCMI = driver.findElement(option_CMI);
		optionCMI.isDisplayed();
		optionCMI.click();
		optionCMI.click();
		Thread.sleep(2000);
	}
	
	public void handle_filter_section () throws Exception {
		WebElement filterSection = driver.findElement(filter_section);
		filterSection.isDisplayed();
		WebElement fiterSectionLabel = driver.findElement(filter_section_filter_label);
		fiterSectionLabel.isDisplayed();
		WebElement filterSectionClassLabel = driver.findElement(filter_section_class_label);
		filterSectionClassLabel.isDisplayed();
		WebElement filterSectionClass1 = driver.findElement(filter_section_class_01_checkbox);
		filterSectionClass1.isDisplayed();
		filterSectionClass1.click();
		filterSectionClass1.click();
		WebElement filterSectionClass2Plus = driver.findElement(filter_section_class_02plus_checkbox);
		filterSectionClass2Plus.isDisplayed();
		WebElement filterSectionClass2 = driver.findElement(filter_section_class_02_checkbox);
		filterSectionClass2.isDisplayed();
		filterSectionClass2.click();
		WebElement filterSectionClass3Plus = driver.findElement(filter_section_class_03plus_checkbox);
		filterSectionClass3Plus.isDisplayed();
		filterSectionClass3Plus.click();
		WebElement filterSectionClass3 = driver.findElement(filter_section_class_03_checkbox);
		filterSectionClass3.isDisplayed();
		WebElement filterSectionClassCMI = driver.findElement(filter_section_class_CMI_checkbox);
		filterSectionClassCMI.isDisplayed();
		WebElement filterSectionRepairTypeLabel = driver.findElement(filter_section_repair_type_label);
		filterSectionRepairTypeLabel.isDisplayed();
		WebElement filterSectionRepairTypeGarageCheckbox = driver.findElement(filter_section_repair_type_garage_checkbox);
		filterSectionRepairTypeGarageCheckbox.isDisplayed();
		WebElement filterSectionRepairTypedealerCheckbox = driver.findElement(filter_section_repair_type_dealer_checkbox);
		filterSectionRepairTypedealerCheckbox.isDisplayed();
		WebElement filterSectionInsurerLabel = driver.findElement(filter_section_insurer_label);
		filterSectionInsurerLabel.isDisplayed();
		WebElement filterSectionInsurerThaisiriCheckbox = driver.findElement(filter_section_thaisiri_insurance_checkbox);
		filterSectionInsurerThaisiriCheckbox.isDisplayed();
		WebElement filterSectionInsurerThanachartCheckbox = driver.findElement(filter_section_thanachart_insurance_checkbox);
		filterSectionInsurerThanachartCheckbox.isDisplayed();
		WebElement filterSectionSumInsuredLabel = driver.findElement(filter_section_sum_insured_label);
		filterSectionSumInsuredLabel.isDisplayed();
		WebElement filterSectionSumInsuredSlider = driver.findElement(filter_section_sum_insured_slider);
		filterSectionSumInsuredSlider.isDisplayed();
		scroll_page();
		Robot rb = new Robot();
		WebElement filterSectionSumInsuredSliderMinimumField = driver.findElement(filter_section_sum_insured_minimum_field);
		filterSectionSumInsuredSliderMinimumField.isDisplayed();
		filterSectionSumInsuredSliderMinimumField.click();
		filterSectionSumInsuredSliderMinimumField.sendKeys(Keys.BACK_SPACE);
		
		filterSectionSumInsuredSliderMinimumField.clear();
		Thread.sleep(1000);
		filterSectionSumInsuredSliderMinimumField.sendKeys("120000");
		WebElement filterSectionSumInsuredSliderMaximumField = driver.findElement(filter_section_sum_insured_maximum_field);
		filterSectionSumInsuredSliderMaximumField.isDisplayed();
		filterSectionSumInsuredSliderMaximumField.click();
		filterSectionSumInsuredSliderMaximumField.clear();
		Thread.sleep(1000);
		filterSectionSumInsuredSliderMaximumField.sendKeys("300000");
	}
	
	public void click_on_apply_filter_button () throws Exception {
		WebElement applyFilterBtn = driver.findElement(filter_section_apply_filter_button);
		applyFilterBtn.click();
		Thread.sleep(2000);
	}
	
	public void click_on_reset_button () throws Exception {
		WebElement resetFilterBtn = driver.findElement(filter_section_reset_filter_button);
		resetFilterBtn.click();
		Thread.sleep(2000);
	}
	
	public void refresh_page () throws Exception {
		Thread.sleep(5000);
		driver.navigate().refresh();
		Thread.sleep(2000);
	}
	
	public void scroll_page () throws Exception {
		Robot rb = new Robot ();
		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyRelease(KeyEvent.VK_DOWN);
	}
}
