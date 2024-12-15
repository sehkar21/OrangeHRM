package com.qa.stepdefinition;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import com.objectRepo.RecruitAddcandidatepage_OrangeHRM;

import io.cucumber.java.en.Then;
import utils.BaseClass;

public class RecruitAddcandidateStepdefinition {

	BaseClass base;
	
	public RecruitAddcandidateStepdefinition(BaseClass base)
	{
		this.base=base;
		
	}
	
	
	@Then("user clicks on the plus Add button in the candidate tab")
	public void user_clicks_on_the_plus_add_button_in_the_candidate_tab() {

		RecruitAddcandidatepage_OrangeHRM RecruitAddcandidatepage_OrangeHRM = new RecruitAddcandidatepage_OrangeHRM(base);
		RecruitAddcandidatepage_OrangeHRM.plusaddcandidatebutton();
	}
	@Then("user fills up the candidate data")
	public void user_fills_up_the_candidate_data() {
			
		RecruitAddcandidatepage_OrangeHRM RecruitAddcandidatepage_OrangeHRM = new RecruitAddcandidatepage_OrangeHRM(base);
		RecruitAddcandidatepage_OrangeHRM.addcandidatefirstname();
		RecruitAddcandidatepage_OrangeHRM.addcandidatesecondname();
		RecruitAddcandidatepage_OrangeHRM.addcandidatethirdname();
		RecruitAddcandidatepage_OrangeHRM.addcandidatevacanydropdwn();
		RecruitAddcandidatepage_OrangeHRM.addcandidatevacanyposition();
		RecruitAddcandidatepage_OrangeHRM.addcandidateemail();
		RecruitAddcandidatepage_OrangeHRM.addcandidatecontactnumber();
		

		
	}
	@Then("user uploads the resume of the candidate")
	public void user_uploads_the_resume_of_the_candidate() throws AWTException {
		RecruitAddcandidatepage_OrangeHRM RecruitAddcandidatepage_OrangeHRM = new RecruitAddcandidatepage_OrangeHRM(base);
		RecruitAddcandidatepage_OrangeHRM.addcandidatebrowseresume();
		
		Robot r = new Robot();
		r.delay(2000);
		
		StringSelection ss = new StringSelection("C:\\Users\\sehka\\OneDrive\\Documents\\sample-resumes.docx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		
	}
	@Then("user enters the keyword and date of application")
	public void user_enters_the_keyword_and_date_of_application() {

		RecruitAddcandidatepage_OrangeHRM RecruitAddcandidatepage_OrangeHRM = new RecruitAddcandidatepage_OrangeHRM(base);
		RecruitAddcandidatepage_OrangeHRM.addcandidatekeywords();
		RecruitAddcandidatepage_OrangeHRM.addcandidatedoadropdwn();
		RecruitAddcandidatepage_OrangeHRM.addcandidatedoadate();
		
	}
	@Then("user clicks on the save button to add new candidate")
	public void user_clicks_on_the_save_button_to_add_new_candidate() {
		RecruitAddcandidatepage_OrangeHRM RecruitAddcandidatepage_OrangeHRM = new RecruitAddcandidatepage_OrangeHRM(base);
		RecruitAddcandidatepage_OrangeHRM.addcandidatesavebutton();
		
	}

}
