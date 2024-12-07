package com.objectRepo;

import org.openqa.selenium.By;

import utils.BaseClass;

public class PIMaddEmployee_OrangeHRM {

	
	BaseClass base;
	
	public PIMaddEmployee_OrangeHRM(BaseClass base)
	{
		this.base=base;
	}
	
	
	
	By PIMLeftpanel       = By.xpath("//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'][normalize-space()='PIM']");
	By PIMAddEmployee_Tab = By.xpath("//header[@class='oxd-topbar']//li[3]");
	By PIMfirstname       = By.xpath("//input[@placeholder='First Name']");
	By PIMmiddlename      = By.xpath("//input[@placeholder='Middle Name']");
	By PIMlastname        = By.xpath("//input[@placeholder='Last Name']");
	By PIMEmployeeID      = By.xpath("//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']");
	By PIMprofilepic      = By.xpath("//button[@class='oxd-icon-button oxd-icon-button--solid-main employee-image-action']");
	By PIMsavebtn         = By.xpath("//button[normalize-space()='Save']");
	
	public void PIMLeftpanel()
	{
		base.driver.findElement(PIMLeftpanel).click();
	}
	
	public void PIMAddEmployee_Tab()
	{
		base.driver.findElement(PIMAddEmployee_Tab).click();
	}
	
	public void PIMfirstname(String firstname)
	{
		base.driver.findElement(PIMfirstname).sendKeys(firstname);
	}
	
	public void PIMmiddlename(String middlename)
	{
		base.driver.findElement(PIMmiddlename).sendKeys(middlename);
	}
	
	public void PIMlastname(String lastname)
	{
		base.driver.findElement(PIMlastname).sendKeys(lastname);
	}
	
	public void PIMEmployeeID(String EmployeeID)
	{
		base.driver.findElement(PIMEmployeeID).sendKeys(EmployeeID);
	}
	
	public void PIMprofilepic()
	{
		base.driver.findElement(PIMprofilepic).click();
	}
	
	public void PIMsavebtn()
	{
		base.driver.findElement(PIMsavebtn).click();
	}
	
	
}
