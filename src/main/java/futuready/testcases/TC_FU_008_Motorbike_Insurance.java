package futuready.testcases;
import futuready.base.*;
import futuready.pages.*;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

public class TC_FU_008_Motorbike_Insurance {
baseSetup setup = new baseSetup();
login_page login = new login_page();
dashboard_page dashboard = new dashboard_page ();
login_with_user_name_and_password_page loginWithUserAndPass = new login_with_user_name_and_password_page(); 
motorbike_insurance_page motorBikeInsurancePage = new motorbike_insurance_page();
  @BeforeTest
  public void beforeTest() throws Exception {
	  baseSetup.wellcome();
	  setup.get_root_directory();
	  setup.get_directory_of_testing_files();
	  baseSetup.select_test_server();
	  setup.select_test_browser();
	  System.out.println("[Start Testing]");
	  System.out.println("[Test Scenario] : TC_FU_008_MOT_Motorbike_Insurance");
	  login.setup_driver(baseSetup.driver);
	  loginWithUserAndPass.setup_driver(baseSetup.driver);
	  dashboard.setup(baseSetup.driver);
	  motorBikeInsurancePage.setup_driver(baseSetup.driver);
  }  
  @Test (enabled=true)
  public void TC_FU_008_MTB_01_User_can_navigate_to_Motorbike_Insurance_Page () throws Exception {
	  login.navigate_to_login_page();
	  login.click_on_button_to_login_with_username_and_password();
	  loginWithUserAndPass.input_username(login_with_user_name_and_password_page.username_input);
	  loginWithUserAndPass.input_password(login_with_user_name_and_password_page.password_input);
	  loginWithUserAndPass.click_login_btn();
	  dashboard.click_on_motorbike_box_btn();
	  motorBikeInsurancePage.verify_elements();
  }
  
  @Test (enabled = true)
  public void TC_FU_008_MTB_02_User_can_search_motorbike_insurance_plan () throws Exception {
	  motorBikeInsurancePage.click_on_search_branch_field();
	  motorBikeInsurancePage.input_search_keys();
  }
  
  @AfterTest
  public void afterTest() throws Exception {
	  login.quit();
  }

}
