package com.leaftaps.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.leaftaps.base.ProjectSpecificMethods;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

public class EditLeadPage extends ProjectSpecificMethods {
	
	public EditLeadPage()
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="updateLeadForm_firstName")
	WebElement eleFirstName;
	@And("Update the lead firstname as (.*)")
	public EditLeadPage updateFirstName(String fname)
	{
		clearAndType(eleFirstName, fname);
		return this;
	}
	
	@FindBy(name="submitButton")
	WebElement eleUpdateButton;
	@When("click on update button")
	public ViewLeadPage clickUpdateButton()
	{
		click(eleUpdateButton);
		return new ViewLeadPage();
	}
	
	
}
