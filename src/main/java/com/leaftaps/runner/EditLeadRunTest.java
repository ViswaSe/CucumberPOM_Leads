package com.leaftaps.runner;

import org.testng.annotations.BeforeTest;

import com.leaftaps.base.ProjectSpecificMethods;

import cucumber.api.CucumberOptions;

@CucumberOptions(features="src/main/java/features/LeadsLeafTaps.feature",
		glue="com.leaftaps",monochrome=true,tags="@EditLead")
public class EditLeadRunTest extends ProjectSpecificMethods{

	@BeforeTest
	public void setData()
	{
		testcaseName="TC_002_EditLeadInLeafTaps";
		testcaseDec="Edit the available lead values in the leaftaps application";
		browser="chrome";
		author="Vishveshwar";
		category="SIT";
	}

}
