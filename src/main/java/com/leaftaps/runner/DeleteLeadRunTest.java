package com.leaftaps.runner;

import org.testng.annotations.BeforeTest;

import com.leaftaps.base.ProjectSpecificMethods;

import cucumber.api.CucumberOptions;

@CucumberOptions(features="src/main/java/features/LeadsLeafTaps.feature",
		glue="com.leaftaps",monochrome=true,tags="@DeleteLead")
public class DeleteLeadRunTest extends ProjectSpecificMethods{

	@BeforeTest
	public void setData()
	{
		testcaseName="TC_004_DeleteLeadInLeafTaps";
		testcaseDec="Delete the available lead from the leaftaps application";
		browser="chrome";
		author="Vishveshwar";
		category="SIT";
	}

}
