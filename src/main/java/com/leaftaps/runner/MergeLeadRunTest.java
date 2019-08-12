package com.leaftaps.runner;

import org.testng.annotations.BeforeTest;

import com.leaftaps.base.ProjectSpecificMethods;

import cucumber.api.CucumberOptions;

@CucumberOptions(features="src/main/java/features/LeadsLeafTaps.feature",
		glue="com.leaftaps",monochrome=true,tags="@MergeLead")
public class MergeLeadRunTest extends ProjectSpecificMethods{

	@BeforeTest
	public void setData()
	{
		testcaseName="TC_005_MergeLeadInLeafTaps";
		testcaseDec="Merge the two leads in the leaftaps application";
		browser="chrome";
		author="Vishveshwar";
		category="SIT";
	}

}
