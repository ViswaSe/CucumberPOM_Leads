package com.leaftaps.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.leaftaps.base.ProjectSpecificMethods;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

public class CreateLeadPage extends ProjectSpecificMethods{
	
	public CreateLeadPage()
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="createLeadForm_companyName")
	WebElement eleCompanyName;
	@And("Enter the companyname as (.*)")
	public CreateLeadPage enterCompanyName(String cname)
	{
		clearAndType(eleCompanyName, cname);
		return this;
	}
	
	@FindBy(id="createLeadForm_firstName")
	WebElement eleFirstName;
	@And("Enter the firstname as (.*)")
	public CreateLeadPage enterFirstName(String fname)
	{
		clearAndType(eleFirstName, fname);
		return this;
	}
	
	@FindBy(id="createLeadForm_lastName")
	WebElement eleLastName;
	@And("Enter the lastname as (.*)")
	public CreateLeadPage enterLastName(String lname)
	{
		clearAndType(eleLastName, lname);
		return this;
	}
	
	@FindBy(id="createLeadForm_dataSourceId")
	WebElement eleSourceDropdown;
	public CreateLeadPage selectSourceDropDown(int index)
	{
		selectDropDownUsingIndex(eleSourceDropdown, 2);
		return this;
	}
	
	@FindBy(name="submitButton")
	WebElement eleSubmit;
	@When("Click on CreateLead Button")
	public ViewLeadPage clickSubmit()
	{
		click(eleSubmit);
		return new ViewLeadPage();
	}
}
