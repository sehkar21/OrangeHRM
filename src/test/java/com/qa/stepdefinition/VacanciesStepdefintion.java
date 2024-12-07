package com.qa.stepdefinition;

import com.objectRepo.VacanciesPage_OrangeHRM;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utils.BaseClass;

public class VacanciesStepdefintion {

	BaseClass base;
	public VacanciesStepdefintion(BaseClass base)
	{
		this.base=base;
	}
	
	@Given("user clicks on the Recruitment Leftpanel")
	public void user_clicks_on_the_recruitment_leftpanel() {

		VacanciesPage_OrangeHRM VacanciesPage_OrangeHRM = new VacanciesPage_OrangeHRM(base);
		VacanciesPage_OrangeHRM.RecruitmentLeftPanel();

		
	}
	@Then("user clicks on the vacancies tab")
	public void user_clicks_on_the_vacancies_tab() {

		VacanciesPage_OrangeHRM VacanciesPage_OrangeHRM = new VacanciesPage_OrangeHRM(base);
		VacanciesPage_OrangeHRM.Vacancies_Tab();
	}
	@Then("user cliks on the jobtitle vacancies")
	public void user_cliks_on_the_jobtitle_vacancies() {

		VacanciesPage_OrangeHRM VacanciesPage_OrangeHRM = new VacanciesPage_OrangeHRM(base);
		VacanciesPage_OrangeHRM.JobTitle_dropdown();
		VacanciesPage_OrangeHRM.JobTitle();
		VacanciesPage_OrangeHRM.vacancy_dropdown();
		VacanciesPage_OrangeHRM.vacancy();
		VacanciesPage_OrangeHRM.Hiringmanager_dropdown();
		VacanciesPage_OrangeHRM.Hiringmanager();
		VacanciesPage_OrangeHRM.status_dropdown();
		VacanciesPage_OrangeHRM.status();
		
		
	}
	@Then("uses clicks on the search button")
	public void uses_clicks_on_the_search_button() {
		VacanciesPage_OrangeHRM VacanciesPage_OrangeHRM = new VacanciesPage_OrangeHRM(base);
		VacanciesPage_OrangeHRM.searchbtn();
		VacanciesPage_OrangeHRM.results_checkbox();
		System.out.println(VacanciesPage_OrangeHRM.search_results());
		
		
		
		
		
		
	}

	
}
