package com.objectRepo;

import org.openqa.selenium.By;

import utils.BaseClass;

public class LeavePage_OrangeHRM {

	BaseClass base;
	
	public LeavePage_OrangeHRM(BaseClass base)
	{
		this.base=base;
	}
	
	
	By Leave_leftpanel = By.xpath("//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'][normalize-space()='Leave']");
	By Apply_tab = By.xpath("//a[normalize-space()='Apply']");
	By LeaveType_dropdown = By.xpath("//div[@class='oxd-select-text-input']");
	By LeaveType_selection = By.xpath("//span[normalize-space()='CAN - FMLA']");
	By Leave_fromdropdown = By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/i[1]");
	By Leave_from = By.xpath("//div[contains(text(),'17')]");
	By Leave_todropdown = By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/i[1]");
	By Leave_to = By.xpath("//div[contains(text(),'31')]");
	By Duration_dropdown = By.xpath("//div[@class='oxd-grid-4 orangehrm-full-width-grid']//div[@class='oxd-grid-item oxd-grid-item--gutters']//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow']");
	By Duration_type = By.xpath("//span[normalize-space()='Full Day']");
	By LeaveApplyBtn = By.xpath("//button[normalize-space()='Apply']");
	
	public void Leave_leftpanel()
	{
		base.driver.findElement(Leave_leftpanel).click();
	}
	
	public void Apply_tab()
	{
		base.driver.findElement(Apply_tab).click();
	}
	
	public void LeaveType_dropdown()
	{
		base.driver.findElement(LeaveType_dropdown).click();
	}
	
	public void LeaveType_selection()
	{
		base.driver.findElement(LeaveType_selection).click();
	}
	
	public void Leave_fromdropdown()
	{
		base.driver.findElement(Leave_fromdropdown).click();
	}
	
	public void Leave_from()
	{
		base.driver.findElement(Leave_from).click();
	}
	
	public void Leave_todropdown()
	{
		base.driver.findElement(Leave_todropdown).click();
	}
	
	public void Leave_to()
	{
		base.driver.findElement(Leave_to).click();
	}
	
	public void Duration_dropdown()
	{
		base.driver.findElement(Duration_dropdown).click();
	}
	
	public void Duration_type()
	{
		base.driver.findElement(Duration_type).click();
	}
	
	public void LeaveApplyBtn()
	{
		base.driver.findElement(LeaveApplyBtn).click();
	}
	
	
	
	
}
