package com.leaftaps.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.leaftaps.base.ProjectSpecificMethods;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class ViewLeadPage extends ProjectSpecificMethods{
	
	public ViewLeadPage()
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="viewLead_firstName_sp")
	WebElement eleFirstName;
	@Then("Lead should be created with the name as (.*)")
	public ViewLeadPage verifyFirstName(String expectedText)
	{
		verifyExactText(eleFirstName, expectedText);
		return this;
	}
	
	@FindBy(linkText="Edit")
	WebElement eleEditButton;
	@And("Click on the Edit button")
	public EditLeadPage clickEditButton()
	{
		click(eleEditButton);
		return new EditLeadPage();
	}
	
	@FindBy(linkText="Delete")
	WebElement eleDeleteButton;
	@And("Click on the Delete button")
	public MyLeadsPage clickDeleteButton()
	{
		click(eleDeleteButton);
		return new MyLeadsPage();
	}
	
	@FindBy(linkText="Find Leads")
	WebElement eleFindLeads;
	@And("Click on the FindLeads")
	public FindLeadsPage clickFindLeads()
	{
		click(eleFindLeads);
		return new FindLeadsPage();
	}
	
}
