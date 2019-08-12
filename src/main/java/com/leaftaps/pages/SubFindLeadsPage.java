package com.leaftaps.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.leaftaps.base.ProjectSpecificMethods;

import cucumber.api.java.en.And;

public class SubFindLeadsPage extends ProjectSpecificMethods{
	
	public SubFindLeadsPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//label[contains(text(),'First name')]/following::input[1])")
	WebElement eleFirstName;
	@And("Enter the firstname in the findlead child window as (.*)")
	public SubFindLeadsPage enterFirstNameInChildWindow(String fname)
	{
		clearAndType(eleFirstName, fname);
		return this;
	}
	
	@FindBy(xpath="//button[text()='Find Leads']")
	WebElement eleFindLeadsButton;
	@And("Click the FindLeads button in the child window")
	public SubFindLeadsPage clickFindLeadsButtonInChildWindow()
	{
		click(eleFindLeadsButton);
		return this;
	}
	
	@FindBy(xpath="//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[1]")
	WebElement eleFirstResultingLeadId;
	@And("capture the FirstResultingLeadId in the child window")
	public SubFindLeadsPage captureFirstResultingLeadIdInChildWindow()
	{
		firstResultingLeadId=getElementText(eleFirstResultingLeadId);
		return this;
	}
	
	@And("Click on the FirstResultingLead in the child window")
	public SubFindLeadsPage clickFirstResultingLeadId()
	{
		clickWithNoSnap(eleFirstResultingLeadId);
		return this;
	}
	@And("Switch to the Parent window")
	public MergeLeadsPage switchToParentWindow()
	{
		switchToWindow(0);
		return new MergeLeadsPage();
	}
	
	@FindBy(xpath="(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[2]/a[1]")
	WebElement eleSecondResultingLeadId;
	@And("capture the secondResultingLeadId in the child window")
	public SubFindLeadsPage captureSecondResultingLeadIdInChildWindow()
	{
		secondResultingLeadId=getElementText(eleSecondResultingLeadId);
		return this;
	}
	
	@And("Click on the secondResultingLead in the child window")
	public SubFindLeadsPage clickSecondResultingLeadIdInChildWindow()
	{
		clickWithNoSnap(eleSecondResultingLeadId);
		return this;
	}

}
