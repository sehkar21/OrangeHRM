package com.qa.stepdefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.BaseClass;

public class Hooks {

	BaseClass base;
	public Hooks(BaseClass base)
	{
		this.base=base;
	}
	
	@Before
	public void open()
	{
		System.out.println("----------------Opening browser--------------");
	}
	
	@After
	public void teardown()
	{
		base.driver.close();
		System.err.println("---------------closing browser----------------");
	}
}
