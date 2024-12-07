package com.objectRepo;

import org.openqa.selenium.By;

import utils.BaseClass;

public class VacanciesPage_OrangeHRM {

	BaseClass base;
	
	public VacanciesPage_OrangeHRM(BaseClass base)
	{
		this.base=base;
	}
	
	
	By RecruitmentLeftPanel  = By.xpath("//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'][normalize-space()='Recruitment']");
	By Vacancies_Tab = By.xpath("//a[normalize-space()='Vacancies']");
	By JobTitle_dropdown = By.cssSelector("div[class='oxd-grid-4 orangehrm-full-width-grid'] div:nth-child(1) div:nth-child(1) div:nth-child(2) div:nth-child(1) div:nth-child(1) div:nth-child(2) i:nth-child(1)");
	By JobTitle = By.xpath("//span[normalize-space()='Payroll Administrator']");
	By vacancy_dropdown = By.xpath("//div[@class='oxd-table-filter-area']//div[2]//div[1]//div[2]//div[1]//div[1]//div[2]//i[1]");
	By vacancy = By.xpath("//span[normalize-space()='Payroll Administrator']");
	By Hiringmanager_dropdown = By.xpath("//div[3]//div[1]//div[2]//div[1]//div[1]//div[2]//i[1]");
	By Hiringmanager = By.cssSelector("div[class='oxd-select-option'] span");
	By status_dropdown = By.xpath("//div[4]//div[1]//div[2]//div[1]//div[1]//div[2]//i[1]");
	By status = By.xpath("//span[normalize-space()='Active']");
	By searchbtn = By.xpath("//button[normalize-space()='Search']");
	By results_checkbox= By.xpath("//div[@class='oxd-table-card-cell-checkbox']//span[@class='oxd-checkbox-input oxd-checkbox-input--active --label-right oxd-checkbox-input']");
	By search_results = By.xpath("//div[@class='oxd-table-card']//div[@role='row']");
	
	
	
	public void  RecruitmentLeftPanel()
	{
		base.driver.findElement(RecruitmentLeftPanel).click();
	}
	
	
	public void  Vacancies_Tab()
	{
		base.driver.findElement(Vacancies_Tab).click();
	}
	
	public void  JobTitle_dropdown()
	{
		base.driver.findElement(JobTitle_dropdown).click();
	}
	
	public void  JobTitle()
	{
		base.driver.findElement(JobTitle).click();
	}
	
	public void  vacancy_dropdown()
	{
		base.driver.findElement(vacancy_dropdown).click();
	}
	
	public void  vacancy()
	{
		base.driver.findElement(vacancy).click();
	}
	
	public void  Hiringmanager_dropdown()
	{
		base.driver.findElement(Hiringmanager_dropdown).click();
	}
	
	public void  Hiringmanager()
	{
		base.driver.findElement(Hiringmanager).click();
	}
	
	public void  status_dropdown()
	{
		base.driver.findElement(status_dropdown).click();
	}
	
	public void  status()
	{
		base.driver.findElement(status).click();
	}
	
	public void  searchbtn()
	{
		base.driver.findElement(searchbtn).click();
	}
	
	public void  results_checkbox()
	{
		base.driver.findElement(results_checkbox).click();
	}
	
	public String  search_results()
	{
		
		base.driver.findElement(search_results).getText();
		return null;
		
	}
	
	
	
}
