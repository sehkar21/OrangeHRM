package com.objectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import utils.BaseClass;

public class MyinfoContactPage_OrangeHRM {

	
	BaseClass base;
	
	public MyinfoContactPage_OrangeHRM(BaseClass base)
	{
		this.base=base;
		
	}
	
	
	By MyinfoLeftpanel          = By.xpath("//span[normalize-space()='My Info']");
	By Myinfocontactmenu        = By.xpath("//a[normalize-space()='Contact Details']");
	By Myinfostr1               = By.xpath("//div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']//div[1]//div[1]//div[1]//div[1]//div[2]//input[1]");
	By Myinfostr2               = By.xpath("//div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']//div[1]//div[1]//div[2]//div[1]//div[2]//input[1]");
	By Myinfocity               = By.xpath("//div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']//div[1]//div[1]//div[3]//div[1]//div[2]//input[1]");
	By Myinfostate              = By.xpath("//div[4]//div[1]//div[2]//input[1]");
	By Myinfopostalcode         = By.xpath("//div[5]//div[1]//div[2]//input[1]");
	By Myinfocountrydropdown    = By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow']");
	By Myinfocountry            = By.xpath("//span[normalize-space()='India']");
	By MyinfoHomeTel            = By.xpath("//div[@class='orangehrm-edit-employee-content']//div[2]//div[1]//div[1]//div[1]//div[2]//input[1]");
	By Myinfomobiletel          = By.xpath("//div[@class='orangehrm-edit-employee-content']//div[2]//div[1]//div[2]//div[1]//div[2]//input[1]");
	By Myinfoworktel            = By.xpath("//div[@class='orangehrm-edit-employee-content']//div[2]//div[1]//div[3]//div[1]//div[2]//input[1]");
	By Myinfoworkemail          = By.xpath("//div[3]//div[1]//div[1]//div[1]//div[2]//input[1]");
	By Myinfootheremail         = By.xpath("//div[3]//div[1]//div[2]//div[1]//div[2]//input[1]");
	By Myinfosavebtn            = By.xpath("//button[normalize-space()='Save']");
	
	public void MyinfoLeftpanel()
	{
		base.driver.findElement(MyinfoLeftpanel).click();
	}
	
	public void Myinfocontactmenu()
	{
		base.driver.findElement(Myinfocontactmenu).click();
	}
	
	public void Myinfostr1()
	{
		base.driver.findElement(Myinfostr1).sendKeys(Keys.CONTROL + "a");
		base.driver.findElement(Myinfostr1).sendKeys(Keys.DELETE);
		base.driver.findElement(Myinfostr1).sendKeys("no.124 lakeview apartment");
	}
	
	public void Myinfostr2()
	{
		base.driver.findElement(Myinfostr2).sendKeys(Keys.CONTROL + "a");
		base.driver.findElement(Myinfostr2).sendKeys(Keys.DELETE);
		base.driver.findElement(Myinfostr2).sendKeys("no.124 lakeview apartment");
	}
	
	public void Myinfocity()
	{	
		base.driver.findElement(Myinfocity).sendKeys(Keys.CONTROL + "a");
		base.driver.findElement(Myinfocity).sendKeys(Keys.DELETE);
		base.driver.findElement(Myinfocity).sendKeys("delhi");
	}
	
	public void Myinfostate()
	{
		base.driver.findElement(Myinfostate).sendKeys(Keys.CONTROL + "a");
		base.driver.findElement(Myinfostate).sendKeys(Keys.DELETE);
		base.driver.findElement(Myinfostate).sendKeys("delhi");
	}
	
	public void Myinfopostalcode()
	{
		base.driver.findElement(Myinfopostalcode).sendKeys(Keys.CONTROL + "a");
		base.driver.findElement(Myinfopostalcode).sendKeys(Keys.DELETE);
		base.driver.findElement(Myinfopostalcode).sendKeys("110050");
	}
	
	public void Myinfocountrydropdown()
	{
		base.driver.findElement(Myinfocountrydropdown).click();
	}
	
	public void Myinfocountry()
	{
		base.driver.findElement(Myinfocountry).click();
	}
	
	public void MyinfoHomeTel()
	{
		base.driver.findElement(Myinfoworktel).sendKeys(Keys.CONTROL + "a");
		base.driver.findElement(Myinfoworktel).sendKeys(Keys.DELETE);
		base.driver.findElement(MyinfoHomeTel).sendKeys("98020010030");
	}
	
	public void Myinfomobiletel()
	{
		base.driver.findElement(Myinfomobiletel).sendKeys(Keys.CONTROL + "a");
		base.driver.findElement(Myinfomobiletel).sendKeys(Keys.DELETE);
		base.driver.findElement(Myinfomobiletel).sendKeys("98020010030");
	}
	
	public void Myinfoworktel()
	{
		base.driver.findElement(Myinfoworktel).sendKeys(Keys.CONTROL + "a");
		base.driver.findElement(Myinfoworktel).sendKeys(Keys.DELETE);
		base.driver.findElement(Myinfoworktel).sendKeys("98020010030");
	}
	
	public void Myinfoworkemail()
	{
		base.driver.findElement(Myinfoworkemail).sendKeys(Keys.CONTROL + "a");
		base.driver.findElement(Myinfoworkemail).sendKeys(Keys.DELETE);
		base.driver.findElement(Myinfoworkemail).sendKeys("erangal@testmail.com");
	}
	
	public void Myinfootheremail()
	{
		base.driver.findElement(Myinfootheremail).sendKeys(Keys.CONTROL + "a");
		base.driver.findElement(Myinfootheremail).sendKeys(Keys.DELETE);
		base.driver.findElement(Myinfootheremail).sendKeys("erangal1@testmail.com");
	}
	
	public void Myinfosavebtn()
	{
		base.driver.findElement(Myinfosavebtn).click();
	}
	
	
}
