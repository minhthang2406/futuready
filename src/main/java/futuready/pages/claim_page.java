package futuready.pages;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import io.github.bonigarcia.*;
import io.github.bonigarcia.wdm.*;
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
import org.testng.Assert;
public class claim_page {
	WebDriver driver;
	//Locator
	private By how_to_claim_label = By.xpath("//*[@id=\"__layout\"]/div/div/nav/div/div[1]/span");
	private By first_box = By.xpath("//*[@id=\"__layout\"]/div/div/div/div/div[1]/div/figure");
	private By muang_thai_box = By.xpath("//*[@id=\"__layout\"]/div/div/div/div/div[2]/div");
	private By third_box = By.xpath("//*[@id=\"__layout\"]/div/div/div/div/div[3]/div");
	private By tune_box = By.xpath("//*[@id=\"__layout\"]/div/div/div/div/div[4]/div");
	private By viriyah_box = By.xpath("//*[@id=\"__layout\"]/div/div/div/div/div[4]/div");
	private By the_one_box = By.xpath("//*[@id=\"__layout\"]/div/div/div/div/div[6]/div");

	//Setup Function
	public void setup(WebDriver driver) throws Exception {
		this.driver = driver;	
	}
	
	//Functions
	public void verify_elements () throws Exception {
		WebElement howToClaimLabel = driver.findElement(how_to_claim_label);
		howToClaimLabel.isDisplayed();
		Assert.assertEquals(howToClaimLabel.getText(), "How to claim");
		WebElement firstBox = driver.findElement(first_box);
		firstBox.isDisplayed();
		WebElement muangThaiBox = driver.findElement(muang_thai_box);
		muangThaiBox.isDisplayed();
		WebElement thirdBox = driver.findElement(third_box);
		thirdBox.isDisplayed();
		WebElement tuneBox = driver.findElement(tune_box);
		tuneBox.isDisplayed();
		WebElement theOneBox = driver.findElement(the_one_box);
		theOneBox.isDisplayed();
		WebElement viriyahBox = driver.findElement(viriyah_box);
		viriyahBox.isDisplayed();
		Thread.sleep(2000);
	}
}
