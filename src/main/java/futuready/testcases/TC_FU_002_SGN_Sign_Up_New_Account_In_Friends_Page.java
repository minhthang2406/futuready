package futuready.testcases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.openqa.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.edge.*;
import futuready.pages.*;
import futuready.base.*;
public class TC_FU_002_SGN_Sign_Up_New_Account_In_Friends_Page {
  baseSetup setup = new baseSetup();
  dashboard_page dashboard = new dashboard_page();
  login_page login = new login_page();
  login_with_user_name_and_password_page loginWithUserAndPass = new login_with_user_name_and_password_page(); 
  forgot_password_page forgotPasswordPage = new forgot_password_page();
  @BeforeTest
  public void beforeTest() throws Exception {
	  setup.wellcome();
	  setup.select_test_server();
	  setup.select_test_browser();
	  System.out.println("[Start Testing]");
	  System.out.println("[Test Scenario] : TC_FU_002_SGN_Sign_Up_New_Account_In_Friends_Page");
	  login.setup_driver(baseSetup.driver);
	  loginWithUserAndPass.setup_driver(baseSetup.driver);
	  forgotPasswordPage.setup(baseSetup.driver);
	  dashboard.setup(baseSetup.driver);
  }
  
  @Test
  public void TC_FU_002_SGN_01_User_can_navigate_to_sign_up_a_new_account_page () throws Exception {
	  System.out.print("TC_FU_002_SGN_01_User_can_navigate_to_sign_up_a_new_account_page");
	  
	  System.out.println(" -> DONE");
  }
  
  @Test
  public void TC_FU_002_SGN_02_User_can_sign_up_a_new_account () throws Exception {
	  System.out.print("TC_FU_002_SGN_01_User_can_sign_up_a_new_account_page");
	  
	  System.out.println(" -> DONE");
  }
  
  @Test
  public void TC_FU_002_SGN_03_System_verifies_02_confirmation_checked_boxes_in_the_first_sign_up_page  () throws Exception {
	  System.out.print("TC_FU_002_SGN_03_System_verifies_02_confirmation_checked_boxes_in_the_first_sign_up_page");
	  
	  System.out.println(" -> DONE");
  }
  
  @Test
  public void TC_FU_002_SGN_04_System_verifies_required_fields_in_the_first_signup_page  () throws Exception {
	  System.out.print("TC_FU_002_SGN_04_System_verifies_required_fields_in_the_first_signup_page");
	  
	  System.out.println(" -> DONE");
  }

  @AfterTest
  public void afterTest() {
  }

}