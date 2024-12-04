package com.qa.stepdefinition;

import java.io.IOException;

import com.objectRepo.LoginPage_OrangeHRM;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import junit.framework.Assert;
import utils.BaseClass;

public class LoginStepdefinitions {

	BaseClass base;
	
	public LoginStepdefinitions(BaseClass base)
	{
		this.base=base;
	}
	
	
	
	@Given("i launch the browser and enter into orangeHRM site")
	public void i_launch_the_browser_and_enter_into_orange_hrm_site() throws InterruptedException, IOException {

		BaseClass.getbrowser();
		
	}
	@Given("user enters {string} and {string}")
	public void user_enters_and(String username, String password) {
			
		LoginPage_OrangeHRM LoginPage_OrangeHRM = new LoginPage_OrangeHRM(base);
		LoginPage_OrangeHRM.Loginusername(username);
		LoginPage_OrangeHRM.LoginPasword(password);
		
	}
	@Given("click on the login button")
	public void click_on_the_login_button() {

		LoginPage_OrangeHRM LoginPage_OrangeHRM = new LoginPage_OrangeHRM(base);
		LoginPage_OrangeHRM.Loginbutton();
		
	}
	@Then("verify the homepage")
	public void verify_the_homepage() {

		String currenturl = base.driver.getCurrentUrl();
		System.out.println(currenturl);
		
		Assert.assertEquals(currenturl, "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
		
		
	}

	
}
