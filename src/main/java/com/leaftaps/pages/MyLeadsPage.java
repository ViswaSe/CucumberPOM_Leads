package com.leaftaps.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.leaftaps.base.ProjectSpecificMethods;

import cucumber.api.java.en.And;

public class MyLeadsPage extends ProjectSpecificMethods{
	
	public MyLeadsPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="Create Lead")
	WebElement eleCreateLead;
	@And("Click on CreateLead Link")
	public CreateLeadPage clickCreateLead()
	{
		click(eleCreateLead);
		return new CreateLeadPage();
	}
	
	@FindBy(linkText="Find Leads")
	WebElement eleFindLeads;
	@And("Click on FindLeads Link")
	public FindLeadsPage clickFindLeads()
	{
		click(eleFindLeads);
		return new FindLeadsPage();
	}

	@FindBy(linkText="Merge Leads")
	WebElement eleMergeLeads;
	@And("Click on MergeLeads Link")
	public MergeLeadsPage clickMergeLeads()
	{
		click(eleMergeLeads);
		return new MergeLeadsPage();
	}
}
