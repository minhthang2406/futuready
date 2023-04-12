package futuready.testcases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
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
public class TC_FU_003_PRO_My_Profile {
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
	  String reported_email_subject = "📺 [Test Report] | Scenario TC-FU-003-PRO-My Profile";
	  String scenario_name = "📔 TC-FU-003-PRO-My Profile";
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
	  profilePage.setup_driver(baseSetup.driver);
	  loginWithUserAndPass.setup_driver(baseSetup.driver);
	  dashboard.setup(baseSetup.driver);
  }
  
  @Test (enabled=true)
  public void TC_FU_003_PRO_01_User_can_navigate_to_my_profile_page () throws Exception {
	  login.navigate_to_login_page();
	  login.click_on_button_to_login_with_username_and_password();
	  loginWithUserAndPass.input_username(login_with_user_name_and_password_page.username_input);
	  loginWithUserAndPass.input_password(login_with_user_name_and_password_page.password_input);
	  loginWithUserAndPass.click_login_btn();
	  dashboard.navigate_to_profile();
	  profilePage.verify_elements();
	  
  }

  @AfterTest
  public void afterTest() throws Exception {
	  reportedMail.sending_reported_email(reported_email_subject,reportedMail.report_email_body(scenario_name));
	  Thread.sleep(5000);
	  login.quit();
  }

}