package futuready.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class plan_detail_input_information_page {
WebDriver driver ;

	//Locators
	private By insurer_information_section = By.xpath("//*[@id=\"__layout\"]/div/div/div/div[2]/main/div/section[1]/div/div/div/div/div/article");
	private By insurer_logo_icon = By.xpath("//*[@id=\"__layout\"]/div/div/div/div[2]/main/div/section[1]/div/div/div/div/div/article/div[1]");
	private By plan_detail_btn = By.xpath("//*[@id=\"__layout\"]/div/div/div/div[2]/main/div/section[1]/div/div/div/div/div/article/div[2]/div/div[2]/button/span");
	private By steps_item_bar = By.xpath("//*[@id=\"__layout\"]/div/div/div/div[2]/main/div/section[2]/div[1]/div/div/div[1]/nav/ul");
	private By personal_detail_label = By.xpath("//*[@id=\"scrollToTop\"]/div[1]/div/div/div/form/h2[1]");
	private By title_label = By.xpath("//*[@id=\"scrollToTop\"]/div[1]/div/div/div/form/div[1]/label");
	private By title_dropdownbox = By.xpath("//*[@id=\"scrollToTop\"]/div[1]/div/div/div/form/div[1]/div");
	private By first_name_label = By.xpath("//*[@id=\"scrollToTop\"]/div[1]/div/div/div/form/div[2]/label");
	private By first_name_field = By.xpath("//*[@id=\"scrollToTop\"]/div[1]/div/div/div/form/div[2]/div");
	private By last_name_label = By.xpath("//*[@id=\"scrollToTop\"]/div[1]/div/div/div/form/div[3]/label");
	private By last_name_field = By.xpath("//*[@id=\"scrollToTop\"]/div[1]/div/div/div/form/div[3]/div");
}
