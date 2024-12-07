package com.qa.stepdefinition;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import com.objectRepo.PIMaddEmployee_OrangeHRM;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utils.BaseClass;

public class PIM_addEmployeeStepdefinition {

	BaseClass base;
	
	public PIM_addEmployeeStepdefinition(BaseClass base)
	{
		this.base=base;
	}
	
	
	
	@Given("user clicks on the PIM leftpanel")
	public void user_clicks_on_the_pim_leftpanel() {
			
		PIMaddEmployee_OrangeHRM PIMaddEmployee_OrangeHRM = new PIMaddEmployee_OrangeHRM(base);
		PIMaddEmployee_OrangeHRM.PIMLeftpanel();
		
	}
	@Then("user clicks on the AddEmployee tab")
	public void user_clicks_on_the_add_employee_tab() {
		PIMaddEmployee_OrangeHRM PIMaddEmployee_OrangeHRM = new PIMaddEmployee_OrangeHRM(base);
		PIMaddEmployee_OrangeHRM.PIMAddEmployee_Tab();
		

		
	}
	@Then("user enter the {string} {string} {string} and {string}")
	public void user_enter_the_and(String firsname, String middlename, String lastname, String EmployeeID) {
		PIMaddEmployee_OrangeHRM PIMaddEmployee_OrangeHRM = new PIMaddEmployee_OrangeHRM(base);
		PIMaddEmployee_OrangeHRM.PIMfirstname(firsname);
		PIMaddEmployee_OrangeHRM.PIMmiddlename(middlename);
		PIMaddEmployee_OrangeHRM.PIMlastname(lastname);
		PIMaddEmployee_OrangeHRM.PIMEmployeeID(EmployeeID);

		
	}
	@Then("user adds the profile picture")
	public void user_adds_the_profile_picture() throws AWTException {
		
		PIMaddEmployee_OrangeHRM PIMaddEmployee_OrangeHRM = new PIMaddEmployee_OrangeHRM(base);
		PIMaddEmployee_OrangeHRM.PIMprofilepic();
		
		Robot r = new Robot();
		r.delay(2000);
		
		StringSelection ss = new StringSelection("C:\\Users\\sehka\\OneDrive\\Pictures\\Saved Pictures\\flowers.png");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
	}
	@Then("user clicks on the save button")
	public void user_clicks_on_the_save_button() {
		PIMaddEmployee_OrangeHRM PIMaddEmployee_OrangeHRM = new PIMaddEmployee_OrangeHRM(base);
		PIMaddEmployee_OrangeHRM.PIMsavebtn();

		
	}

}
