package com.leaftaps.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.leaftaps.base.ProjectSpecificMethods;

import cucumber.api.java.en.And;

public class MergeLeadsPage extends ProjectSpecificMethods{
	
	public MergeLeadsPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//img[@alt='Lookup']")
	WebElement eleFirstIcon;
	@And("Click on the firstIcon")
	public MergeLeadsPage clickFirstIcon()
	{
		click(eleFirstIcon);
		return this;
	}
	
	@And("Switch to the Child window (.*)")
	public SubFindLeadsPage switchToChildWindow(int windowIndex)
	{
		switchToWindow(windowIndex);
		return new SubFindLeadsPage();
	}
	
	@FindBy(xpath="(//img[@alt='Lookup'])[2]")
	WebElement eleSecondIcon;
	@And("Click on the secondIcon")
	public MergeLeadsPage clickSecondIcon()
	{
		click(eleSecondIcon);
		return this;
	}
	
	@FindBy(linkText="Merge")
	WebElement eleMergeButton;
	@And("Click on the Merge Button")
	public MergeLeadsPage clickMergeButton()
	{
		clickWithNoSnap(eleMergeButton);
		return this;
	}
	@And("Accept the mergeAlert")
	public ViewLeadPage acceptAlertInMergeWindow()
	{
		acceptAlert();
		return new ViewLeadPage();
	}

}
