package futuready.testcases;

import org.testng.annotations.Test;

import futuready.base.baseSetup;
import futuready.base.reported_email_sending;
import futuready.pages.dashboard_page;
import futuready.pages.forgot_password_page;
import futuready.pages.login_page;
import futuready.pages.login_with_user_name_and_password_page;
import futuready.pages.myprofile_page;
import futuready.pages.sign_up_account_page;
import futuready.pages.sign_up_account_page_2;
import futuready.pages.*;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class TC_FU_006_CLA_Claim {
	  baseSetup setup = new baseSetup();
	  dashboard_page dashboard = new dashboard_page();
	  login_page login = new login_page();
	  reported_email_sending reported_mail = new reported_email_sending(); 
	  login_with_user_name_and_password_page loginWithUserAndPass = new login_with_user_name_and_password_page(); 
	  forgot_password_page forgotPasswordPage = new forgot_password_page();
	  sign_up_account_page signupAccountPage = new sign_up_account_page();
	  sign_up_account_page_2 signupAccountPage2 = new sign_up_account_page_2();
	  myprofile_page profilePage = new myprofile_page();
	  reported_email_sending reportedMail = new reported_email_sending();
	  claim_page claimPage = new claim_page();
	  private String reported_email_subject = "📺 [Test Report] | Scenario TC-FU-005-NOF-Notification";
	  private String scenario_name = "📔 TC-FU-005-NOF-Notification";
  @BeforeTest
  public void beforeTest() throws Exception {
	  baseSetup.wellcome();
	  setup.get_root_directory();
	  setup.get_directory_of_testing_files();
	  baseSetup.select_test_server();
	  setup.select_test_browser();
	  System.out.println("[Start Testing]");
	  System.out.println("[Test Scenario] : TC_FU_005_NOF_Notification");
	  login.setup_driver(baseSetup.driver); 
	  profilePage.setup_driver(baseSetup.driver);
	  loginWithUserAndPass.setup_driver(baseSetup.driver);
	  dashboard.setup(baseSetup.driver);
	  claimPage.setup(baseSetup.driver);
  }
  
  @Test (enabled=true)
  public void TC_FU_006_CLA_01_User_can_navigate_to_claim_page () throws Exception {
	  login.navigate_to_login_page();
	  login.click_on_button_to_login_with_username_and_password();
	  loginWithUserAndPass.input_username(login_with_user_name_and_password_page.username_input);
	  loginWithUserAndPass.input_password(login_with_user_name_and_password_page.password_input);
	  loginWithUserAndPass.click_login_btn();
	  dashboard.click_on_claim_button();
	  claimPage.verify_elements();
  }

  @AfterTest
  public void afterTest() throws Exception {
	  Thread.sleep(2000);
	  login.quit();
  }

}
