package com.qa.stepdefinition;

import java.io.IOException;

import com.objectRepo.LeavePage_OrangeHRM;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utils.BaseClass;

public class LeaveApplyStepdefintion {

	
	BaseClass base;
	
	public LeaveApplyStepdefintion(BaseClass base)
	{
		this.base=base;
	}
	
	
	@Given("user clicks on the Leave in the left panel")
	public void user_clicks_on_the_leave_in_the_left_panel() {
		
		LeavePage_OrangeHRM LeavePage_OrangeHRM = new LeavePage_OrangeHRM(base);
		LeavePage_OrangeHRM.Leave_leftpanel();

		
	}
	@Then("user clicks on the Apply tab")
	public void user_clicks_on_the_apply_tab() {
		
		LeavePage_OrangeHRM LeavePage_OrangeHRM = new LeavePage_OrangeHRM(base);
		LeavePage_OrangeHRM.Apply_tab();

		
	}
	@Then("user selects the leave dates")
	public void user_selects_the_leave_dates() {

		LeavePage_OrangeHRM LeavePage_OrangeHRM = new LeavePage_OrangeHRM(base);
		LeavePage_OrangeHRM.LeaveType_dropdown();
		LeavePage_OrangeHRM.LeaveType_selection();
		LeavePage_OrangeHRM.Leave_fromdropdown();
		LeavePage_OrangeHRM.Leave_from();
		LeavePage_OrangeHRM.Leave_todropdown();
		LeavePage_OrangeHRM.Leave_to();
		LeavePage_OrangeHRM.Duration_dropdown();
		LeavePage_OrangeHRM.Duration_type();
		
	}
	@Then("user saves the leave")
	public void user_saves_the_leave() throws IOException {
	try 
		{

			LeavePage_OrangeHRM LeavePage_OrangeHRM = new LeavePage_OrangeHRM(base);
			LeavePage_OrangeHRM.LeaveApplyBtn();
			BaseClass.getscreenshot(base.driver,"Screenshot");
			
		}
	 
	catch (IOException e)
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	}
}
