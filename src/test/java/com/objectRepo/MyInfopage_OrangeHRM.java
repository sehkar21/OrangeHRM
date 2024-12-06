package com.objectRepo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

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
	
	By MYInfoFirstname = By.xpath("//input[@placeholder='First Name']");
    By MYInfoMiddlename = By.xpath("//input[@placeholder='Middle Name']");
    By MYInfoLastname = By.xpath("//input[@placeholder='Last Name']");
    By MYInfoEmp_ID = By.xpath("//div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']//div[2]//div[1]//div[1]//div[1]//div[2]//input[1]");
    By MyInfoOther_ID = By.xpath("//body/div[@id='app']/div[@class='oxd-layout orangehrm-upgrade-layout']/div[@class='oxd-layout-container']/div[@class='oxd-layout-context']/div[@class='orangehrm-background-container']/div[@class='orangehrm-card-container']/div[@class='orangehrm-edit-employee']/div[@class='orangehrm-edit-employee-content']/div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']/form[@class='oxd-form']/div[@class='oxd-form-row']/div[1]/div[2]/div[1]/div[2]/input[1]");
    By Myinfo_savebtn = By.xpath("//div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']//button[@type='submit'][normalize-space()='Save']");
	
	
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
	
	
	
	
	 public void MYInfoFirstname(String firstname) throws InterruptedException
	    {
		    JavascriptExecutor js = (JavascriptExecutor)base.driver;
		    js.executeScript("window.scrollBy(0,-250)", "");

		   
		      Actions actions = new Actions(base.driver);
		      actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL);
		        actions.perform();
		        actions.sendKeys(Keys.DELETE);
		        actions.perform();
		     
		     
		    // JavascriptExecutor js = (JavascriptExecutor) base.driver;
		     //js.executeScript("arguments[0].value='firstname';", MYInfoFirstname);
			  	     
		     Thread.sleep(2000);
		     base.driver.findElement(MYInfoFirstname).clear();
		     base.driver.findElement(MYInfoFirstname).sendKeys(firstname);  
	    
	    }
	    
	 public void MYInfoMiddlename(String middlename) throws InterruptedException
	    {


		  Actions acc = new Actions(base.driver);
		     acc.doubleClick(base.driver.findElement(MYInfoMiddlename)).keyDown(Keys.CONTROL)
		     .sendKeys("a")
		     .keyUp(Keys.CONTROL)
		     .sendKeys(Keys.BACK_SPACE)
		     .build()
		     .perform();
		    
		     
		    // JavascriptExecutor js = (JavascriptExecutor) base.driver;
			 // 	js.executeScript("arguments[0].clear;", MYInfoMiddlename);
			  	
			  	// Thread.sleep(2000);
		 base.driver.findElement(MYInfoMiddlename).clear();
			  	 
	  	base.driver.findElement(MYInfoMiddlename).sendKeys(middlename);  
	  	
	  	
	    }
	    
	 public void MYInfoLastname(String lastname) throws InterruptedException
	    {

		  Actions acc = new Actions(base.driver);
		     acc.doubleClick(base.driver.findElement(MYInfoLastname)).keyDown(Keys.CONTROL)
		     .sendKeys("a")
		     .keyUp(Keys.CONTROL)
		     .sendKeys(Keys.BACK_SPACE)
		     .build()
		     .perform();
		     Thread.sleep(2000);
		 
	  	base.driver.findElement(MYInfoLastname).sendKeys(lastname);  
	    }
	    
	 public void MYInfoEmp_ID(String Employee_ID) throws InterruptedException
	    {


		  Actions acc = new Actions(base.driver);
		     acc.doubleClick(base.driver.findElement(MYInfoEmp_ID)).keyDown(Keys.CONTROL)
		     .sendKeys("a")
		     .keyUp(Keys.CONTROL)
		     .sendKeys(Keys.BACK_SPACE)
		     .build()
		     .perform();
		     Thread.sleep(2000);
	  	base.driver.findElement(MYInfoEmp_ID).sendKeys(Employee_ID);  
	    }
	    
	 public void MyInfoOther_ID(String Other_ID) throws InterruptedException
	    {

		      Actions acc = new Actions(base.driver);
		      acc.doubleClick(base.driver.findElement(MyInfoOther_ID)).keyDown(Keys.CONTROL)
		     .sendKeys("a")
		     .keyUp(Keys.CONTROL)
		     .sendKeys(Keys.BACK_SPACE)
		     .build()
		     .perform();
		     Thread.sleep(2000);
	  	base.driver.findElement(MyInfoOther_ID).sendKeys(Other_ID);  
	    }
	    
	 public void Myinfo_savebtn()
	    {
	  	base.driver.findElement(Myinfo_savebtn).click();
	    }
	    
	
	
}
