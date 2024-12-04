package com.objectRepo;


import org.openqa.selenium.By;

import utils.BaseClass;

public class LoginPage_OrangeHRM {

	
          BaseClass base;
          
          public LoginPage_OrangeHRM( BaseClass base)
          {
        	  this.base=base;
          }
	
          By Loginusername = By.xpath("//input[@placeholder='Username']");
          By LoginPasword = By.xpath("//input[@placeholder='Password']");
          By Loginbutton = By.xpath("//button[normalize-space()='Login']");
          
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
	
}
