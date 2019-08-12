package com.leaftaps.runner;

import org.testng.annotations.BeforeTest;

import com.leaftaps.base.ProjectSpecificMethods;

import cucumber.api.CucumberOptions;

@CucumberOptions(features="src/main/java/features/LeadsLeafTaps.feature",
		glue="com.leaftaps",monochrome=true,tags="@CreateLead")
public class CreateLeadRunTest extends ProjectSpecificMethods{

	@BeforeTest
	public void setData()
	{
		testcaseName="TC_001_CreateLeadInLeafTaps";
		testcaseDec="Creating a Lead in the leaftaps application";
		browser="chrome";
		author="Vishveshwar";
		category="SIT";
	}

}
