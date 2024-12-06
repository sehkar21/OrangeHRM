package com.qa.stepdefinition;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;

import com.objectRepo.LoginPage_OrangeHRM;
import com.objectRepo.MyInfopage_OrangeHRM;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utils.BaseClass;

public class MyInfoStepdefinition {

	BaseClass base;

	public void MyInfoStepdefinition(BaseClass base)
	{
		this.base=base;
		
	}
	
	@Given("i login into the OrangeHRM site")
	public void i_login_into_the_orange_hrm_site() throws InterruptedException, IOException {
		
		
		BaseClass.getbrowser();
		
	}
	@Then("i enter the usrename and password")
	public void i_enter_the_usrename_and_password() {

		LoginPage_OrangeHRM LoginPage_OrangeHRM = new LoginPage_OrangeHRM(base);
		LoginPage_OrangeHRM.Loginusername("Admin");
		LoginPage_OrangeHRM.LoginPasword("admin123");
		
		
	}
	@Then("i click on the login button")
	public void i_click_on_the_login_button() {
		LoginPage_OrangeHRM LoginPage_OrangeHRM = new LoginPage_OrangeHRM(base);
		LoginPage_OrangeHRM.Loginbutton();
		
	}
	@Given("i click on the Myinfo leftpanel tab")
	public void i_click_on_the_myinfo_leftpanel_tab() {

		MyInfopage_OrangeHRM MyInfopage_OrangeHRM = new MyInfopage_OrangeHRM(base);
		MyInfopage_OrangeHRM.Myinfoleftpanel();
		
	}
	@Then("i click on the profile picture")
	public void i_click_on_the_profile_picture() {

		MyInfopage_OrangeHRM MyInfopage_OrangeHRM = new MyInfopage_OrangeHRM(base);
		MyInfopage_OrangeHRM.Myinfoprofilepicture();
		
	}
	@Then("i click on the plus icon and change the profile picture")
	public void i_click_on_the_plus_icon_and_change_the_profile_picture() throws AWTException {
		MyInfopage_OrangeHRM MyInfopage_OrangeHRM = new MyInfopage_OrangeHRM(base);
		MyInfopage_OrangeHRM.Myinfoplusicon();
		
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
	@Then("i save the page")
	public void i_save_the_page() {
		
		
		MyInfopage_OrangeHRM MyInfopage_OrangeHRM = new MyInfopage_OrangeHRM(base);
		MyInfopage_OrangeHRM.Myinfosavebtn();
	
	}

	
	@Then("i enter the {string} {string} and {string}")
	public void i_enter_the_and(String firstname, String middlename, String lastname) throws InterruptedException {

		MyInfopage_OrangeHRM MyInfopage_OrangeHRM = new MyInfopage_OrangeHRM(base);
		MyInfopage_OrangeHRM.MYInfoFirstname(firstname);
		MyInfopage_OrangeHRM.MYInfoMiddlename(middlename);
		MyInfopage_OrangeHRM.MYInfoLastname(lastname);
		

		
	}
	@Then("i enter the {string} and {string}")
	public void i_enter_the_and(String Employee_ID, String Other_ID) throws InterruptedException {
		MyInfopage_OrangeHRM MyInfopage_OrangeHRM = new MyInfopage_OrangeHRM(base);
		MyInfopage_OrangeHRM.MYInfoEmp_ID(Employee_ID);
		MyInfopage_OrangeHRM.MyInfoOther_ID(Other_ID);
		
		

		
	}
	@Then("i click on the save button")
	public void i_click_on_the_save_button() {
		MyInfopage_OrangeHRM MyInfopage_OrangeHRM = new MyInfopage_OrangeHRM(base);
		MyInfopage_OrangeHRM.Myinfo_savebtn();

		
	}

	
	
	
	
	
}
