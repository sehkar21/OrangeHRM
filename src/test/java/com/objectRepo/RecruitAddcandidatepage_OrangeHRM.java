package com.objectRepo;

import org.openqa.selenium.By;

import utils.BaseClass;

public class RecruitAddcandidatepage_OrangeHRM {

	BaseClass base;
	
	public RecruitAddcandidatepage_OrangeHRM(BaseClass base)
	{
		this.base=base;
		
	}
	
	By plusaddcandidatebutton = By.xpath("//button[normalize-space()='Add']");
	By addcandidatefirstname = By.xpath("//input[@placeholder='First Name']");
	By addcandidatesecondname = By.xpath("//input[@placeholder='Middle Name']");
	By addcandidatethirdname = By.xpath("//input[@placeholder='Last Name']");
	By addcandidatedrpdown= By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow']");
	By addcandidatevacanydropdwn = By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow']");
	By addcandidatevacanyposition = By.xpath("//span[normalize-space()='Software Engineer']");
	By addcandidateemail = By.xpath("(//input[@placeholder='Type here'])[1]");
	By addcandidatecontactnumber = By.xpath("(//input[@placeholder='Type here'])[2]");
	By addcandidatebrowseresume = By.xpath("//div[@class='oxd-file-button']");
	By addcandidatekeywords = By.xpath("//input[@placeholder='Enter comma seperated words...']");
	By addcandidatedoadropdwn = By.xpath("//i[@class='oxd-icon bi-calendar oxd-date-input-icon']");
	By addcandidatedoadate = By.xpath("//div[contains(text(),'14')]");
	By addcandidatesavebutton = By.xpath("//button[normalize-space()='Save']");
	
	
	
	public void plusaddcandidatebutton()
	{
		base.driver.findElement(plusaddcandidatebutton).click();
	}
	
	public void addcandidatefirstname()
	{
		base.driver.findElement(addcandidatefirstname).sendKeys("albert");
	}
	public void addcandidatesecondname()
	{
		base.driver.findElement(addcandidatesecondname).sendKeys("mars");
	}
	public void addcandidatethirdname()
	{
		base.driver.findElement(addcandidatethirdname).sendKeys("raino");
	}
	public void addcandidatedrpdown()
	{
		base.driver.findElement(addcandidatedrpdown).click();
	}
	public void addcandidatevacanydropdwn()
	{
		base.driver.findElement(addcandidatevacanydropdwn).click();
	}
	public void addcandidatevacanyposition()
	{
		base.driver.findElement(addcandidatevacanyposition).click();
	}
	public void addcandidateemail()
	{
		base.driver.findElement(addcandidateemail).sendKeys("Test@gmail.com");
	}
	public void addcandidatecontactnumber()
	{
		base.driver.findElement(addcandidatecontactnumber).sendKeys("6547893120");
	}
	public void addcandidatebrowseresume()
	{
		base.driver.findElement(addcandidatebrowseresume).click();
	}
	public void addcandidatekeywords()
	{
		base.driver.findElement(addcandidatekeywords).sendKeys("java,selenium,BDD");
	}
	public void addcandidatedoadropdwn()
	{
		base.driver.findElement(addcandidatedoadropdwn).click();
	}
	public void addcandidatedoadate()
	{
		base.driver.findElement(addcandidatedoadate).click();
	}
	public void addcandidatesavebutton()
	{
		base.driver.findElement(addcandidatesavebutton).click();
	}
	
	
}
