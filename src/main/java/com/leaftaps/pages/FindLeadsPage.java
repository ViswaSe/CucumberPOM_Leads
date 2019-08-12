package com.leaftaps.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.leaftaps.base.ProjectSpecificMethods;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FindLeadsPage extends ProjectSpecificMethods{
	
	public FindLeadsPage()
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="(//label[contains(text(),'First name')]/following::input[1])[3]")
	WebElement eleFirstName;
	@And("Enter the firstname in the findlead as (.*)")
	public FindLeadsPage enterFirstNameInFindLeads(String fname)
	{
		clearAndType(eleFirstName, fname);
		return this;
	}
	
	@FindBy(xpath="//button[text()='Find Leads']")
	WebElement eleFindLeadsButton;
	@When("Click the FindLeads button")
	public FindLeadsPage clickFindLeadsButton()
	{
		clickWithNoSnap(eleFindLeadsButton);
		return this;
	}
	
	@FindBy(xpath="//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[1]")
	WebElement eleFirstResultingLeadId;
	@And("capture the FirstResultingLeadId")
	public FindLeadsPage captureFirstResultingLeadId()
	{
		firstResultingLeadId=getElementText(eleFirstResultingLeadId);
		return this;
	}
	
	@And("Click on the FirstResultingLead")
	public ViewLeadPage clickFirstResultingLeadId()
	{
		click(eleFirstResultingLeadId);
		return new ViewLeadPage();
	}
	
	@FindBy(xpath="//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a[1]")
	WebElement eleFirstResultingLeadName;
	@And("capture the FirstResultingLeadName")
	public FindLeadsPage captureFirstResultingLeadName()
	{
		firstResultingLeadName=getElementText(eleFirstResultingLeadName);
		return this;
	}
	
	public ViewLeadPage clickFirstResultingLeadName()
	{
		click(eleFirstResultingLeadName);
		return new ViewLeadPage();
	}
	
	@FindBy(xpath="//label[contains(text(),'Lead ID')]/following::input[1]")
	WebElement eleLeadId;
	@And("Enter the CapturedFirstResultingLeadId")
	public FindLeadsPage enterCapturedFirstResultingLeadId()
	{
		clearAndType(eleLeadId, firstResultingLeadId);
		return this;
	}
	
	@FindBy(xpath="//div[text()='No records to display']")
	WebElement eleExceptionalMessage;
	@Then("Verify the exceptional message")
	public FindLeadsPage VerifyExceptionalMessage()
	{
		verifyPartialText(eleExceptionalMessage,"No records");
		return this;
	}
	
}
