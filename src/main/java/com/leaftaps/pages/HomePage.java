package com.leaftaps.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.leaftaps.base.ProjectSpecificMethods;

import cucumber.api.java.en.And;

public class HomePage extends ProjectSpecificMethods{
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText="CRM/SFA")
	WebElement eleCRMSFALink;
	@And("Click on crmsfa Link")
	public MyHomePage clickCrmsfa()
	{
		click(eleCRMSFALink);
		return new MyHomePage();
	}
	
	
}
