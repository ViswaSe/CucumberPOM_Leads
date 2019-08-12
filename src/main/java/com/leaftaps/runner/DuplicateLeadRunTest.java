package com.leaftaps.runner;

import org.testng.annotations.BeforeTest;

import com.leaftaps.base.ProjectSpecificMethods;

import cucumber.api.CucumberOptions;

@CucumberOptions(features="src/main/java/features/LeadsLeafTaps.feature",
		glue="com.leaftaps",monochrome=true,tags="@DuplicateLead")
public class DuplicateLeadRunTest extends ProjectSpecificMethods{

	@BeforeTest
	public void setData()
	{
		testcaseName="TC_003_DuplicateLeadInLeafTaps";
		testcaseDec="Duplicate the available lead in the leaftaps application";
		browser="chrome";
		author="Vishveshwar";
		category="SIT";
	}

}
