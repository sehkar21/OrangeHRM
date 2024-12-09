package com.qa.stepdefinition;

import com.objectRepo.MyinfoContactPage_OrangeHRM;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import junit.framework.Assert;
import utils.BaseClass;

public class MyinfocontactStepdefinitions {

	BaseClass base;
	 public MyinfocontactStepdefinitions(BaseClass base)
	 {
		 this.base=base;
	 }
	
	
	
	@Given("user clicks on the My info leftpanel")
	public void user_clicks_on_the_my_info_leftpanel() {
		
		MyinfoContactPage_OrangeHRM MyinfoContactPage_OrangeHRM = new MyinfoContactPage_OrangeHRM(base);
		MyinfoContactPage_OrangeHRM.MyinfoLeftpanel();

		
	}
	@Then("user clicks on the contact details menu")
	public void user_clicks_on_the_contact_details_menu() {
		MyinfoContactPage_OrangeHRM MyinfoContactPage_OrangeHRM = new MyinfoContactPage_OrangeHRM(base);
		MyinfoContactPage_OrangeHRM.Myinfocontactmenu();


		
	}
	@Then("user updates the Address")
	public void user_updates_the_address() {
		MyinfoContactPage_OrangeHRM MyinfoContactPage_OrangeHRM = new MyinfoContactPage_OrangeHRM(base);
		MyinfoContactPage_OrangeHRM.Myinfostr1();
		MyinfoContactPage_OrangeHRM.Myinfostr2();
		MyinfoContactPage_OrangeHRM.Myinfocity();
		MyinfoContactPage_OrangeHRM.Myinfostate();
		MyinfoContactPage_OrangeHRM.Myinfopostalcode();
		MyinfoContactPage_OrangeHRM.Myinfocountrydropdown();
		MyinfoContactPage_OrangeHRM.Myinfocountry();

		
	}
	@Then("user updates the Telephone details")
	public void user_updates_the_telephone_details() {

		MyinfoContactPage_OrangeHRM MyinfoContactPage_OrangeHRM = new MyinfoContactPage_OrangeHRM(base);
		MyinfoContactPage_OrangeHRM.MyinfoHomeTel();
		MyinfoContactPage_OrangeHRM.Myinfomobiletel();
		MyinfoContactPage_OrangeHRM.Myinfoworktel();
		
		
	}
	@Then("user updates the Email details")
	public void user_updates_the_email_details() {

		MyinfoContactPage_OrangeHRM MyinfoContactPage_OrangeHRM = new MyinfoContactPage_OrangeHRM(base);
		MyinfoContactPage_OrangeHRM.Myinfoworkemail();
		MyinfoContactPage_OrangeHRM.Myinfootheremail();
		
		
	}
	
	@SuppressWarnings("deprecation")
	@Then("user clicks on the Myinfo conatct update save button")
	public void user_clicks_on_the_myinfo_conatct_update_save_button() throws InterruptedException {

		MyinfoContactPage_OrangeHRM MyinfoContactPage_OrangeHRM = new MyinfoContactPage_OrangeHRM(base);
		MyinfoContactPage_OrangeHRM.Myinfosavebtn();
		Thread.sleep(5000);
		//failing scenario to capture screenshot in extent report
		String currenturl = base.driver.getCurrentUrl();
		System.out.println(currenturl);
		
		Assert.assertEquals(currenturl, "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
		
	}

}
