package com.leaftaps.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.leaftaps.base.ProjectSpecificMethods;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class LoginPage extends ProjectSpecificMethods{
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="username")
	WebElement eleUserName;
	@Given("Enter the username as (.*)")
	public LoginPage enterUserName(String username)
	{
		clearAndType(eleUserName, username);
		return this;
	}
	
	@FindBy(id="password")
	WebElement elePassword;
	@And("Enter the password as (.*)")
	public LoginPage enterPassword(String password)
	{
		clearAndType(elePassword, password);
		return this;
	}
	
	@FindBy(className="decorativeSubmit")
	WebElement eleLoginButton;
	@And("Click on Login Button")
	public HomePage clickLogin()
	{
		click(eleLoginButton);
		return new HomePage();
	}

}
