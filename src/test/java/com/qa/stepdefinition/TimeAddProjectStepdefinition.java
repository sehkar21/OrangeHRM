package com.qa.stepdefinition;

import com.objectRepo.TimeAddProjectPage_OrangeHRM;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utils.BaseClass;

public class TimeAddProjectStepdefinition {
	
	BaseClass base;
	
	public TimeAddProjectStepdefinition(BaseClass base) //Constructor in java is used to create the instance of the class
	{
		this.base=base; // initialize the class level variable to local variable
	}

	@Given("user clicks on the Time Left panel")
	public void user_clicks_on_the_time_left_panel() {

		TimeAddProjectPage_OrangeHRM TimeAddProjectPage_OrangeHRM = new TimeAddProjectPage_OrangeHRM(base);
				TimeAddProjectPage_OrangeHRM.Timeleftpanel();
		
	}
	@Then("user clicks on the projectinfo tab and project menu")
	public void user_clicks_on_the_projectinfo_tab_and_project_menu() {
		TimeAddProjectPage_OrangeHRM TimeAddProjectPage_OrangeHRM = new TimeAddProjectPage_OrangeHRM(base);
		TimeAddProjectPage_OrangeHRM.TimeprojectinfoTab();
		TimeAddProjectPage_OrangeHRM.Timedropdownprojectmenu();

		
	}
	@Then("user clicks on the add button")
	public void user_clicks_on_the_add_button() {

		TimeAddProjectPage_OrangeHRM TimeAddProjectPage_OrangeHRM = new TimeAddProjectPage_OrangeHRM(base);
		TimeAddProjectPage_OrangeHRM.Timeplusaddbutton();
		
	}
	@Then("user enter the details")
	public void user_enter_the_details() throws InterruptedException {
		TimeAddProjectPage_OrangeHRM TimeAddProjectPage_OrangeHRM = new TimeAddProjectPage_OrangeHRM(base);
		TimeAddProjectPage_OrangeHRM.Timeaddprojectname();
		TimeAddProjectPage_OrangeHRM.Timeaddcustomerplus();
		TimeAddProjectPage_OrangeHRM.Timeaddcustomername();
		TimeAddProjectPage_OrangeHRM.Timeaddcustomerdescription();
		TimeAddProjectPage_OrangeHRM.Timeaddcustomersavebtn();
		TimeAddProjectPage_OrangeHRM.Timeaddprojectdescription();
		TimeAddProjectPage_OrangeHRM.Timeaddprojectadmin();
		Thread.sleep(3000);
		TimeAddProjectPage_OrangeHRM.Timeaddprojectdropdown();
		
	}	
	@Then("user clicks on the button in the project info tab")
	public void user_clicks_on_the_button_in_the_project_info_tab() {

		TimeAddProjectPage_OrangeHRM TimeAddProjectPage_OrangeHRM = new TimeAddProjectPage_OrangeHRM(base);
		TimeAddProjectPage_OrangeHRM.Timeaddprojectsavebtn();
		
	}


	
	
}
