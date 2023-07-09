package futuready.testcases;
import java.io.File;
import org.testng.ITestResult;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

import futuready.base.baseSetup;
import futuready.pages.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
public class TC_FU_009_Life_Insurance {
WebDriver driver;
baseSetup setup = new baseSetup();
login_page login = new login_page();
dashboard_page dashboard = new dashboard_page ();
login_with_user_name_and_password_page loginWithUserAndPass = new login_with_user_name_and_password_page(); 
life_insurance_page lifeInsurancePage = new life_insurance_page(); 
  @BeforeTest
  public void beforeTest() throws Exception {
	  baseSetup.wellcome();
	  setup.get_root_directory();
	  setup.get_directory_of_testing_files();
	  baseSetup.select_test_server();
	  setup.select_test_browser();
	  System.out.println("[Start Testing]");
	  System.out.println("[Test Scenario] : TC_FU_009_MOT_Motorbike_Insurance");
	  login.setup_driver(baseSetup.driver);
	  loginWithUserAndPass.setup_driver(baseSetup.driver);
	  dashboard.setup(baseSetup.driver);
	  lifeInsurancePage.setup_driver(baseSetup.driver);
  }
  
  @Test (enabled = true)
  public void TC_FU_009_LI_01_User_can_navigate_to_life_insurance_page () throws Exception {
	  login.navigate_to_login_page();
	  login.click_on_button_to_login_with_username_and_password();
	  loginWithUserAndPass.input_username(login_with_user_name_and_password_page.username_input);
	  loginWithUserAndPass.input_password(login_with_user_name_and_password_page.password_input);
	  loginWithUserAndPass.click_login_btn();
	  dashboard.click_on_life_insurance_box();
	  lifeInsurancePage.verify_element();
	  
	  this.driver = baseSetup.driver;
	  //Tao tham chieu cua takescreenshot voi driver hien tai
	  TakesScreenshot ts = (TakesScreenshot) driver;
	  
	  // Goi ham capture screenshot
	  File source = ts.getScreenshotAs(OutputType.FILE);
	  
	  //Kiem tra folder ton tai
	  File theDir = new File("./Screenshots/");
	  if(!theDir.exists()) {
		  theDir.mkdirs();
	  }
	  
	  FileHandler.copy(source, new File ("./Screenshots/"+ "Screenshot Test" + ".png"));
	  System.out.println("Screenshot taken : " );
	  
  }
  
  @Test (enabled = false)
  public void TC_FU_009_LI_02_User_can_search_plan_of_life_insurance () throws Exception {
	  
  }

  @AfterTest
  public void afterTest()throws Exception {
	  login.quit();
  }

}
