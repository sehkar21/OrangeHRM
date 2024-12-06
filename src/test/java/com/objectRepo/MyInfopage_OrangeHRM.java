package com.objectRepo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;

import utils.BaseClass;

public class MyInfopage_OrangeHRM {

	
	BaseClass base;
	
	public MyInfopage_OrangeHRM(BaseClass base)
	{
		this.base=base;
	}
	
	By Loginusername = By.xpath("//input[@placeholder='Username']");
    By LoginPasword = By.xpath("//input[@placeholder='Password']");
    By Loginbutton = By.xpath("//button[normalize-space()='Login']");
	
	By Myinfoleftpanel = By.xpath("//span[normalize-space()='My Info']");
	By Myinfoprofilepicture = By.xpath("//img[@class='employee-image']");
	By Myinfoplusicon = By.xpath("//i[@class='oxd-icon bi-plus']");
	By Myinfosavebtn = By.xpath("//button[normalize-space()='Save']");
	
	
    public void Loginusername(String username)
    {
  	base.driver.findElement(Loginusername).sendKeys(username);  
    }
    
    public void LoginPasword(String password)
    {
  	base.driver.findElement(LoginPasword).sendKeys(password);  
    }
    
    public void Loginbutton()
    {
  	base.driver.findElement(Loginbutton).click();
    }
	
	public void Myinfoleftpanel()
	{
		this.base.driver.findElement(Myinfoleftpanel).click();
	}
	
	public void Myinfoprofilepicture()
	{
		this.base.driver.findElement(Myinfoprofilepicture).click();
	}
	
	public void Myinfoplusicon() throws AWTException
	{
		this.base.driver.findElement(Myinfoplusicon).click();
		
	
		
		
		//this.base.driver.findElement(Myinfoplusicon).sendKeys("C:\Users\sehka\OneDrive\Pictures\Saved Pictures\flowers.png");
	}
	
	public void Myinfosavebtn()
	{
		this.base.driver.findElement(Myinfosavebtn).click();
	}
	
}
