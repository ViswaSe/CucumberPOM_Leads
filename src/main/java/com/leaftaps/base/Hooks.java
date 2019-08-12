package com.leaftaps.base;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

	@Before
	public void beforeScenario(Scenario sc)
	{
		System.out.println("Running testcase: "+sc.getName());
		System.out.println("Data execution line# : "+sc.getId());
		System.out.println("Status before testcase run: "+sc.getStatus());
	}
	@After
	public void afterScenario(Scenario sc)
	{
		System.out.println("Status after testcase run: "+sc.getStatus());
	}
}
