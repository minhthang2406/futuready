package futuready.testcases;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;    
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
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
  reported_email_sending reported_mail = new reported_email_sending(); 
  login_with_user_name_and_password_page loginWithUserAndPass = new login_with_user_name_and_password_page(); 
  forgot_password_page forgotPasswordPage = new forgot_password_page();
  sign_up_account_page signupAccountPage = new sign_up_account_page();
  sign_up_account_page_2 signupAccountPage2 = new sign_up_account_page_2();
  String reported_email_subject = "📺 [Test Report] | Scenario TC-FU-002-SGN-Sign Up New Account In Friends Page ";
  String scenario_name = "📔 TC-FU-002-SGN-Sign Up New Account In Friends Page";
  
  @BeforeTest
  public void beforeTest() throws Exception {
	  baseSetup.wellcome();
	  setup.get_root_directory();
	  setup.get_directory_of_testing_files();
	  baseSetup.select_test_server();
	  setup.select_test_browser();
	  System.out.println("[Start Testing]");
	  System.out.println("[Test Scenario] : TC_FU_002_SGN_Sign_Up_New_Account_In_Friends_Page");
	  login.setup_driver(baseSetup.driver);
	  loginWithUserAndPass.setup_driver(baseSetup.driver);
	  forgotPasswordPage.setup(baseSetup.driver);
	  
	  dashboard.setup(baseSetup.driver);
	  signupAccountPage.setup_driver(baseSetup.driver);
	  signupAccountPage2.setup_driver(baseSetup.driver);
  }
  
  @Test (enabled=true)
  public void TC_FU_002_SGN_01_User_can_navigate_to_sign_up_a_new_account_page () throws Exception {
	  System.out.print("TC_FU_002_SGN_01_User_can_navigate_to_sign_up_a_new_account_page");
	  login.click_on_signup_btn();
	  signupAccountPage.verify_elements();
	  System.out.println(" -> DONE");
  }
  
  @Test (enabled=true)
  public void TC_FU_002_SGN_02_User_can_sign_up_a_new_account () throws Exception {
	  System.out.print("TC_FU_002_SGN_01_User_can_sign_up_a_new_account_page");
	  signupAccountPage.input_first_name();
	  signupAccountPage.input_last_name();
	  signupAccountPage.select_title();
	  signupAccountPage.input_nick_name();
	  signupAccountPage.input_email_address(signupAccountPage.email_address);
	  signupAccountPage.input_phone_number();
	  signupAccountPage.input_line_id();
	  signupAccountPage.input_line_display_name();
	  signupAccountPage.scroll_down_to_bottom();
	  signupAccountPage.select_checkbox_1();
	  signupAccountPage.select_checkbox_2();
	  signupAccountPage.click_on_agree_and_next_button();
	  //Next Page
	  signupAccountPage2.input_national_id_number();
	  signupAccountPage2.select_date_of_birth();
	  signupAccountPage.scroll_down_to_bottom();
	  signupAccountPage2.select_province();
	  signupAccountPage2.select_district();
	  signupAccountPage2.select_sub_district();
	  signupAccountPage2.input_zip_code();
	  signupAccountPage2.input_mailling_address();
	  signupAccountPage2.input_bank_name();
	  signupAccountPage2.input_bank_account_number();
	  signupAccountPage2.input_bank_account_name();
	  signupAccountPage2.input_bank_branch_name();
	  signupAccountPage2.input_brank_branch_code();
	  signupAccountPage2.upload_bank_account_image();
	  signupAccountPage2.upload_national_id_scan_image();
	  signupAccountPage2.select_referrer_dropdown_box();
	  signupAccountPage2.click_on_checkbox_1();
	  signupAccountPage2.click_on_next_button();
	  signupAccountPage2.open_new_tab();
	  signupAccountPage2.verify_email();
	  //signupAccountPage2.click_on_submit_button();
	  System.out.println(" -> DONE");
  }
  

  
  @Test(enabled=true)
  public void TC_FU_002_SGN_03_System_verifies_02_confirmation_checked_boxes_in_the_first_sign_up_page  () throws Exception {
	  System.out.println("TC_FU_002_SGN_03_System_verifies_02_confirmation_checked_boxes_in_the_first_sign_up_page");
	  login.navigate_to_login_page();
	  login.click_on_signup_btn();
	  signupAccountPage.input_first_name();
	  signupAccountPage.input_last_name();
	  signupAccountPage.select_title();
	  signupAccountPage.input_nick_name();
	  signupAccountPage.input_email_address(signupAccountPage.email_address);
	  signupAccountPage.input_phone_number();
	  signupAccountPage.input_line_id();
	  signupAccountPage.input_line_display_name();
	  signupAccountPage.scroll_down_to_bottom();
	  signupAccountPage.click_on_agree_and_next_button();
	  signupAccountPage.handle_constrain_validation_message();
	  System.out.println(" -> DONE");
  }
  
  @Test(enabled=true)
  public void TC_FU_002_SGN_04_System_verifies_required_fields_in_the_first_signup_page  () throws Exception {
	  System.out.print("TC_FU_002_SGN_04_System_verifies_required_fields_in_the_first_signup_page");
	  login.navigate_to_login_page();
	  login.click_on_signup_btn();
	  signupAccountPage.scroll_down_to_bottom();
	  signupAccountPage.select_checkbox_1();
	  //signupAccountPage.select_checkbox_2();
	  signupAccountPage.click_on_agree_and_next_button();
	  signupAccountPage.verify_blank_fields(); 
	  System.out.println(" -> DONE");
  }
  
  @Test (enabled=true)
  public void TC_FU_002_SGN_05_System_verifies_02_confirmation_checked_boxes_in_the_second_sign_up_page () throws Exception {
	  System.out.print("TC_FU_002_SGN_05_System_verifies_02_confirmation_checked_boxes_in_the_second_sign_up_page");
	  signupAccountPage.input_first_name();
	  signupAccountPage.input_last_name();
	  signupAccountPage.select_title();
	  signupAccountPage.input_nick_name();
	  signupAccountPage.input_email_address(signupAccountPage.email_address);
	  signupAccountPage.input_phone_number();
	  signupAccountPage.input_line_id();
	  signupAccountPage.input_line_display_name();
	  signupAccountPage.scroll_down_to_bottom();
	  signupAccountPage.click_on_agree_and_next_button();
	  signupAccountPage2.input_national_id_number();
	  signupAccountPage2.select_date_of_birth();
	  signupAccountPage.scroll_down_to_bottom();
	  signupAccountPage2.select_province();
	  signupAccountPage2.select_district();
	  signupAccountPage2.select_sub_district();
	  signupAccountPage2.input_zip_code();
	  signupAccountPage2.input_mailling_address();
	  signupAccountPage2.input_bank_name();
	  signupAccountPage2.input_bank_account_number();
	  signupAccountPage2.input_bank_account_name();
	  signupAccountPage2.input_bank_branch_name();
	  signupAccountPage2.input_brank_branch_code();
	  signupAccountPage2.upload_bank_account_image();
	  signupAccountPage2.upload_national_id_scan_image();
	  signupAccountPage2.select_referrer_dropdown_box();
	  signupAccountPage2.click_on_next_button_for_checking_alert_message();
	  signupAccountPage2.handle_constrain_validation_message();
	  System.out.println(" -> DONE");
  }
  
  @Test (enabled=true)
  public void TC_FU_002_SGN_06_Sytem_verifies_required_fields_in_the_second_sign_up_page () throws Exception {
	  System.out.println("TC_FU_002_SGN_06_Sytem_verifies_required_fields_in_the_second_sign_up_page");
	  signupAccountPage2.verify_elements();
	  System.out.println(" -> DONE");
  }
  
  @Test (enabled=true)
  public void TC_FU_002_SGN_07_System_verifies_the_email_address_from_user () throws Exception {
	  System.out.println("TC_FU_002_SGN_07_System_verifies_the_email_address_from_user");
	  login.navigate_to_login_page();
	  login.click_on_signup_btn();
	  signupAccountPage.input_first_name();
	  signupAccountPage.input_last_name();
	  signupAccountPage.select_title();
	  signupAccountPage.input_nick_name();
	  signupAccountPage.input_email_address(signupAccountPage.wrong_email_address);
	  signupAccountPage.input_phone_number();
	  signupAccountPage.input_line_id();
	  signupAccountPage.input_line_display_name();
	  signupAccountPage.scroll_down_to_bottom();
	  signupAccountPage.click_on_agree_and_next_button();
	  signupAccountPage.display_wrong_message_of_invalid_email();
	  signupAccountPage.handle_constrain_validation_email_message();
	  System.out.println(" -> DONE");
  }
  
  @Test (enabled=true)
  public void TC_FU_002_SGN_08_System_verifies_the_phone_number_from_user () throws Exception {
	  System.out.println("TC_FU_002_SGN_08_System_verifies_the_phone_number_from_user");
	  login.navigate_to_login_page();
	  login.click_on_signup_btn();
	  signupAccountPage.input_first_name();
	  signupAccountPage.input_last_name();
	  signupAccountPage.select_title();
	  signupAccountPage.input_nick_name();
	  signupAccountPage.input_email_address(signupAccountPage.email_address);
	  signupAccountPage.input_wrong_phone_number();
	  signupAccountPage.input_line_id();
	  signupAccountPage.input_line_display_name();
	  signupAccountPage.scroll_down_to_bottom();
	  signupAccountPage.click_on_agree_and_next_button();
	  signupAccountPage.validate_phone_message();
	  System.out.println(" -> DONE");
  }
  
  @Test(enabled=true)
  public void TC_FU_002_SGN_09_User_can_sign_up_a_new_account_by_thai_language () throws Exception {
	  login.navigate_to_login_page();
	  login.click_on_signup_btn();
	  signupAccountPage.input_first_name_thai();
	  signupAccountPage.input_last_name_thai();
	  signupAccountPage.select_title();
	  signupAccountPage.input_nick_name_thai();
	  signupAccountPage.input_email_address(signupAccountPage.email_address);
	  signupAccountPage.input_phone_number();
	  signupAccountPage.input_line_id();
	  signupAccountPage.input_line_display_name();
	  signupAccountPage.scroll_down_to_bottom();
	  signupAccountPage.select_checkbox_1();
	  signupAccountPage.select_checkbox_2();
	  signupAccountPage.click_on_agree_and_next_button();
	  signupAccountPage2.verify_elements();
  }

  @AfterTest
  public void afterTest() throws Exception  {
	  reported_mail.sending_reported_email(reported_email_subject,reported_mail.report_email_body(scenario_name));
	  Thread.sleep(5000);
	  login.quit();
  }

}
