package com.objectRepo;

import org.openqa.selenium.By;

import utils.BaseClass;

public class TimeAddProjectPage_OrangeHRM {

	
	
	BaseClass base;
	
	public TimeAddProjectPage_OrangeHRM(BaseClass base)
	{
		this.base=base;
	}
	
	By Timeleftpanel = By.xpath("//span[normalize-space()='Time']");
	By TimeprojectinfoTab = By.xpath("//span[normalize-space()='Project Info']");
	By Timedropdownprojectmenu = By.xpath("//body[1]/div[1]/div[1]/div[1]/header[1]/div[2]/nav[1]/ul[1]/li[4]/ul[1]/li[2]");
	By Timeplusaddbutton = By.xpath("//button[normalize-space()='Add']");
	By Timeaddprojectname = By.xpath("//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']");
	By Timeaddcustomerplus = By.xpath("//button[normalize-space()='Add Customer']");
	By Timeaddcustomername = By.xpath("//div[@class='oxd-form-row']//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']");
	By Timeaddcustomerdescription = By.xpath("//div[@role='document']//form[@class='oxd-form']//div[@class='oxd-form-row']//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//textarea[@placeholder='Type description here']");
	By Timeaddcustomersavebtn = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']");
	By Timeaddprojectdescription = By.xpath("//textarea[@placeholder='Type description here']");
	By Timeaddprojectadmin = By.xpath("//div[@class='orangehrm-project-admin-input']//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@placeholder='Type for hints...']");
	By Timeaddprojectdropdown = By.cssSelector("div[role='listbox'] div:nth-child(1)");
	By Timeaddprojectsavebtn = By.xpath("//button[normalize-space()='Save']");
	
	
	
	
	public void Timeleftpanel()
	{
		base.driver.findElement(Timeleftpanel).click();
	}
	
	public void TimeprojectinfoTab()
	{
		base.driver.findElement(TimeprojectinfoTab).click();
	}
	
	public void Timedropdownprojectmenu()
	{
		base.driver.findElement(Timedropdownprojectmenu).click();
	}
	
	public void Timeplusaddbutton()
	{
		base.driver.findElement(Timeplusaddbutton).click();
	}
	
	public void Timeaddprojectname()
	{
		base.driver.findElement(Timeaddprojectname).sendKeys("albert raino");
	}
	
	public void Timeaddcustomerplus()
	{
		base.driver.findElement(Timeaddcustomerplus).click();
	}
	
	public void Timeaddcustomername()
	{
		base.driver.findElement(Timeaddcustomername).sendKeys("mars3");
	}
	
	public void Timeaddcustomerdescription()
	{
		base.driver.findElement(Timeaddcustomerdescription).sendKeys("new project");
	}
	
	public void Timeaddcustomersavebtn()
	{
		base.driver.findElement(Timeaddcustomersavebtn).click();
	}
	
	public void Timeaddprojectdescription()
	{
		base.driver.findElement(Timeaddprojectdescription).sendKeys("new project");
	}
	
	public void Timeaddprojectadmin()
	{
		base.driver.findElement(Timeaddprojectadmin).sendKeys("a");
	}
	
	public void Timeaddprojectdropdown()
	{
		base.driver.findElement(Timeaddprojectdropdown).click();
	}
	
	public void Timeaddprojectsavebtn()
	{
		base.driver.findElement(Timeaddprojectsavebtn).click();
	}
	
	
	
}
