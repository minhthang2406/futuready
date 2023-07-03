package futuready.testcases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

import futuready.base.baseSetup;
import futuready.pages.*;
import org.openqa.selenium.WebDriver;
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
	  loginWithUserAndPass.input_username(loginWithUserAndPass.username_input);
	  loginWithUserAndPass.input_password(loginWithUserAndPass.password_input);
	  loginWithUserAndPass.click_login_btn();
	  dashboard.click_on_life_insurance_box();
	  lifeInsurancePage.verify_element();
  }

  @AfterTest
  public void afterTest()throws Exception {
	  login.quit();
  }

}
