package futuready.testcases;

import futuready.base.baseSetup;
import futuready.pages.login_page;
import futuready.pages.login_with_user_name_and_password_page;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import futuready.pages.*;
public class TC_FU_001_Login_To_Friends_System {
baseSetup setup = new baseSetup();
login_page login = new login_page();
login_with_user_name_and_password_page loginWithUserAndPass = new login_with_user_name_and_password_page(); 
forgot_password_page forgotPasswordPage = new forgot_password_page();
dashboard_page dashboard = new dashboard_page(); 
@BeforeTest
  public void beforeTest() throws Exception {
	  setup.wellcome();
	  setup.select_test_server();
	  setup.select_test_browser();
	  System.out.println("[Start Testing]");
	  System.out.println("[Test Scenario] : TC-FU-001-Login-To-Friends-System");
	  login.setup_driver(baseSetup.driver);
	  loginWithUserAndPass.setup_driver(baseSetup.driver);
	  forgotPasswordPage.setup(baseSetup.driver);
	  dashboard.setup(baseSetup.driver);
  }
  
  @Test
  public void TC_FU_001_LGI_01_User_can_navigate_to_friends_login_page() throws Exception {
	  System.out.print("TC_FU_001_LGI_01_User_can_navigate_to_friends_login_page");
	  login.verify_displayed_elements();
	  System.out.println(" -> DONE");
  }
  
  @Test
  public void TC_FU_001_LGI_02_User_can_change_language_between_eng_and_thai_in_login_page () throws Exception{
	  System.out.print("TC_FU_001_LGI_02_User_can_change_language_between_eng_and_thai_in_login_page");
	  login.click_on_language_btn_from_eng_to_thai();
	  login.click_on_language_btn_from_thai_to_eng();
	  System.out.println(" -> DONE");
  }
  
  @Test
  public void TC_FU_001_LGI_03_User_can_navigate_to_login_with_username_and_password_page () throws Exception {
	  System.out.print("TC_FU_001_LGI_03_User_can_navigate_to_login_with_username_and_password_page");
	  login.click_on_button_to_login_with_username_and_password();
	  loginWithUserAndPass.verify_elements();
	  System.out.println(" -> DONE");
	  
  }
  
  @Test
  public void TC_FU_001_LGI_04_User_can_login_with_username_and_password () throws Exception {
	  System.out.print("TC_FU_001_LGI_04_User_can_login_with_username_and_password");
	  loginWithUserAndPass.input_username(login_with_user_name_and_password_page.username_input);
	  loginWithUserAndPass.input_password(login_with_user_name_and_password_page.password_input);
	  loginWithUserAndPass.click_login_btn();
	  dashboard.verify_elements();
	  System.out.println(" -> DONE");
  }
  
  @Test
  public void TC_FU_001_LGI_05_System_shows_notification_when_detecting_wrong_username_or_password () throws Exception {
	  System.out.print("TC_FU_001_LGI_05_System_shows_notification_when_detecting_wrong_username_or_password");
	  dashboard.logout_account();
	  login.click_on_button_to_login_with_username_and_password();
	  loginWithUserAndPass.clear_username_field();
	  loginWithUserAndPass.clear_password_field();
	  loginWithUserAndPass.input_username(login_with_user_name_and_password_page.wrong_username_input);
	  loginWithUserAndPass.input_password(login_with_user_name_and_password_page.wrong_password_input);
	  loginWithUserAndPass.click_login_btn();
	  loginWithUserAndPass.verify_wrong_login_info_message_display();
	  System.out.println(" -> DONE");
  }
  
  @Test
  public void TC_FU_001_LGI_06_User_can_create_a_new_password_in_case_of_forgot_password () throws Exception {
	  System.out.print("TC_FU_001_LGI_06_User_can_create_a_new_password_in_case_of_forgot_password");
	  loginWithUserAndPass.click_on_forgot_password_button();
	  forgotPasswordPage.verify_elements();
	  forgotPasswordPage.input_username_into_field();
	  forgotPasswordPage.click_next_btn();
	  Thread.sleep(3000);
	  forgotPasswordPage.verify_verification_code_and_new_password_label();
	  forgotPasswordPage.input_verification_code();
	  forgotPasswordPage.input_new_password();
	  forgotPasswordPage.input_confirm_password();
	  forgotPasswordPage.hide_unhide_password_in_new_and_confirm_password_fields();
	  forgotPasswordPage.click_next_btn_2();
	  System.out.println(" -> DONE");
  }
  
  @Test ( enabled=false )
  public void TC_FU_001_LGI_07_System_verifies_username_field_of_forgot_password_page () throws Exception {
	  System.out.print("TC_FU_001_LGI_07_System_verifies_username_field_of_forgot_password_page");
	  forgotPasswordPage.click_back_btn();
	  forgotPasswordPage.clear_username_field();
	  forgotPasswordPage.click_next_btn();
	  forgotPasswordPage.verify_required_message_for_usernam_field();
	  System.out.println(" -> DONE");
  }
  
  @Test ( enabled=false )
  public void TC_FU_001_LGI_08_System_verifies_verificationcode_newpass_confirmpass_fields_of_forgot_password_page () throws Exception {
	  System.out.print("TC_FU_001_LGI_08_System_verifies_verificationcode_newpass_confirmpass_fields_of_forgot_password_page");
	  forgotPasswordPage.input_username_into_field();
	  forgotPasswordPage.click_next_btn();
	  System.out.println(" -> DONE");
  }
  
  @Test ( enabled=false )
  public void TC_FU_001_LGI_09_System_verifies_new_password_field () throws Exception {
	  System.out.print("TC_FU_001_LGI_09_System_verifies_new_password_field");
	  forgotPasswordPage.input_username_into_field();
	  forgotPasswordPage.click_next_btn();
	  System.out.println(" -> DONE");
  }
  
  @Test
  public void TC_FU_001_LGI_10_User_can_login_with_line_usernameand_password () throws Exception {
	  System.out.print("TC_FU_001_LGI_10_User_can_login_with_line_usernameand_password");
	  login.navigate_to_login_page();
	  login.click_on_login_with_line_btn();
	  login.login_line_account();
	  dashboard.verify_elements();
	  System.out.println(" -> DONE");
  }
  
  @Test
  public void TC_FU_001_LGI_11_User_can_login_with_line_by_qrcode () throws Exception {
	  System.out.print("TC_FU_001_LGI_10_User_can_login_with_line_usernameand_password");
	  login.navigate_to_login_page();
	  login.click_on_login_with_line_btn();
	  login.login_line_account();
	  dashboard.verify_elements();
	  System.out.println(" -> DONE");
  }
  

  @AfterTest
  public void afterTest() throws Exception {
	  System.out.println("[Test Completed]");
	  Thread.sleep(2000);
	  login.quit();
  }

}
