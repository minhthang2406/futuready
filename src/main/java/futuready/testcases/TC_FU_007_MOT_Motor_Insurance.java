package futuready.testcases;

import org.testng.annotations.Test;

import futuready.base.baseSetup;
import futuready.base.reported_email_sending;
import futuready.pages.claim_page;
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

public class TC_FU_007_MOT_Motor_Insurance {
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
	  motor_insurance_page motorInsurancePage = new motor_insurance_page();
	  request_quotation_page requestQuotationPage = new request_quotation_page(); 
	  prospect_detail_page prospectDetailPage = new prospect_detail_page();
	  private String reported_email_subject = "📺 [Test Report] | Scenario TC-FU-007-MOT-Motor-Insurance";
	  private String scenario_name = "📔 TC-FU-007-MOT-Motor-Insurance";
  @BeforeTest
  public void beforeTest() throws Exception {
	  baseSetup.wellcome();
	  setup.get_root_directory();
	  setup.get_directory_of_testing_files();
	  baseSetup.select_test_server();
	  setup.select_test_browser();
	  System.out.println("[Start Testing]");
	  System.out.println("[Test Scenario] : TC_FU_007_MOT_Motor_Insurance");
	  login.setup_driver(baseSetup.driver); 
	  profilePage.setup_driver(baseSetup.driver);
	  loginWithUserAndPass.setup_driver(baseSetup.driver);
	  motorInsurancePage.setup(baseSetup.driver);
	  dashboard.setup(baseSetup.driver);
	  requestQuotationPage.setup_driver(baseSetup.driver);
	  prospectDetailPage.setup_driver(baseSetup.driver);
  }
  
  @Test (enabled=true)
  public void TC_FU_007_MOT_001_User_can_navigate_to_motor_insurance_page () throws Exception {
	  login.navigate_to_login_page();
	  login.click_on_button_to_login_with_username_and_password();
	  loginWithUserAndPass.input_username(login_with_user_name_and_password_page.username_input);
	  loginWithUserAndPass.input_password(login_with_user_name_and_password_page.password_input);
	  loginWithUserAndPass.click_login_btn();
	  dashboard.click_on_motor_box_btn();
	  motorInsurancePage.verify_elements();  
  }
  @Test (enabled=true)
  public void TC_FU_007_MOT_002_User_can_search_motor_brand () throws Exception {
	  motorInsurancePage.click_on_toyota();
	  motorInsurancePage.verify_toyota_selected_box();
  }
  @Test (enabled=true)
  public void TC_FU_007_MOT_003_User_can_select_year () throws Exception {
	  motorInsurancePage.select_year_field();
  }
  @Test (enabled=true)
  public void TC_FU_007_MOT_004_User_can_select_vehicle_model () throws Exception {
	  motorInsurancePage.select_model_field();
  }
  @Test (enabled=true)
  public void TC_FU_007_MOT_005_User_can_select_vehicle_sub_model () throws Exception {
	  motorInsurancePage.select_sub_model_field();
  }
  @Test (enabled=true)
  public void TC_FU_007_MOT_006_User_can_select_additional_search_plan_option () throws Exception {
	  motorInsurancePage.addtional_options();
  }
  @Test (enabled=true)
  public void TC_FU_007_MOT_007_User_can_search_insurer_plan () throws Exception {
	  motorInsurancePage.click_on_search_plan_btn();
	  motorInsurancePage.verify_details_plan_label();
  }
  
  @Test (enabled=true)
  public void TC_FU_007_MOT_008_User_can_filter_plans_search_result () throws Exception {
	  motorInsurancePage.refresh_page();
	  motorInsurancePage.handle_filter_section();
	  motorInsurancePage.click_on_apply_filter_button();
  }
  
  @Test (enabled = true)
  public void TC_FU_007_MOT_009_User_can_request_a_quotation () throws Exception {
	  motorInsurancePage.uncheck_insurer_in_filter_section();
	  //motorInsurancePage.click_on_apply_filter_button();
	  Thread.sleep(6000);
	  requestQuotationPage.verify_elements();
	  requestQuotationPage.input_first_name();
	  requestQuotationPage.input_last_name();
	  //requestQuotationPage.input_mobile_number();
	  //requestQuotationPage.input_email_address();
	  requestQuotationPage.input_line_id();
	  requestQuotationPage.input_line_display_name();
	  requestQuotationPage.click_on_request_for_quotation_btn();
  }
  
  @Test (enabled = true)
  public void TC_FU_007_MOT_010_System_verifies_blank_fields_of_quotation () throws Exception {
	  requestQuotationPage.reload_page();
	  motorInsurancePage.uncheck_insurer_in_filter_section();
	  requestQuotationPage.clear_first_name();
	  requestQuotationPage.clear_last_name();
	  requestQuotationPage.clear_mobile_number();
	  requestQuotationPage.clear_email_address();
	  requestQuotationPage.clear_line_display_name();
	  requestQuotationPage.clear_line_id();
	  requestQuotationPage.click_on_request_for_quotation_btn();
  }
  
  @Test (enabled = true)
  public void TC_FU_007_MOT_011_User_can_view_plan_detail () throws Exception {
	  requestQuotationPage.reload_page();
	  motorInsurancePage.click_on_view_plan_detail();
	  motorInsurancePage.verify_plan_detail_view();
	  Thread.sleep(3000);
  }
  
  @Test (enabled = true)
  public void TC_FU_007_MOT_012_User_can_submit_prospect_detail_page () throws Exception {
	  motorInsurancePage.plan_detail_view_card_click_on_select_plan_btn();
	  motorInsurancePage.click_on_proceed_btn();
	  prospectDetailPage.verify_elements_of_prospect_page();
  }

  @AfterTest
  public void afterTest() throws Exception {
	  Thread.sleep(2000);
	  login.quit();
  }

}
