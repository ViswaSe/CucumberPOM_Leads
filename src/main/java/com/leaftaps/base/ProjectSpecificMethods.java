package com.leaftaps.base;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ProjectSpecificMethods extends SeMethods{

	@BeforeMethod
	public void beforeMethod()
	{
		node=test.createNode(testcaseName);
		startApp(browser,url);
	}
	
	@AfterMethod
	public void afterMethod()
	{
		quit();
	}
}
