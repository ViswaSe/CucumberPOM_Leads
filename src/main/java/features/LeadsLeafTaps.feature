Feature: Leaftaps Leads Interactions

@CreateLead
Scenario Outline: TC_001_CreateLead_TestCase

	Given Enter the username as <username>
	And Enter the password as <password>
	And Click on Login Button
	And Click on crmsfa Link
	And Click on Leads Link
	And Click on CreateLead Link
	And Enter the companyname as <cname>
	And Enter the firstname as <fname>
	And Enter the lastname as <lname>
	
	When Click on CreateLead Button
	Then Lead should be created with the name as <fname>
	
	Examples:
	|username|password|cname|fname|lname|
	|DemoSalesManager|crmsfa|AspireSystems|Vishveshwar|Duraiswamy|
	|DemoCSR|crmsfa|AspireSystems|Vishveshwar|Duraiswamy|
	
@EditLead	
Scenario Outline: TC_002_EditLead_TestCase

	Given Enter the username as <username>
	And Enter the password as <password>
	And Click on Login Button
	And Click on crmsfa Link
	And Click on Leads Link
	And Click on FindLeads Link
	And Enter the firstname in the findlead as <fname> 
	And Click the FindLeads button
	And capture the FirstResultingLeadId
	And Click on the FirstResultingLead
	And Click on the Edit button
	And Update the lead firstname as <updatefname>
	
	When click on update button
	Then Lead should be created with the name as <updatefname>
	
	Examples:
	|username|password|fname|updatefname|
	|DemoSalesManager|crmsfa|Vishveshwar|VishveshwarD|

@DuplicateLead	
Scenario Outline: TC_003_DuplicateLead_TestCase

	Given Enter the username as <username>
	And Enter the password as <password>
	And Click on Login Button
	And Click on crmsfa Link
	And Click on Leads Link
	And Click on FindLeads Link
	And Enter the firstname in the findlead as <fname> 
	And Click the FindLeads button
	And capture the FirstResultingLeadName
	And Click on the FirstResultingLead
	And Click on the Edit button
	
	When click on update button
	Then Lead should be created with the name as <fname>
	
	Examples:
	|username|password|fname|
	|DemoSalesManager|crmsfa|Vishveshwar|
	
@DeleteLead	
Scenario Outline: TC_004_DeleteLead_TestCase

	Given Enter the username as <username>
	And Enter the password as <password>
	And Click on Login Button
	And Click on crmsfa Link
	And Click on Leads Link
	And Click on FindLeads Link
	And Enter the firstname in the findlead as <fname> 
	And Click the FindLeads button
	And capture the FirstResultingLeadId
	And Click on the FirstResultingLead
	And Click on the Delete button
	And Click on FindLeads Link
	And Enter the CapturedFirstResultingLeadId
	
	When Click the FindLeads button
	Then Verify the exceptional message
	
	Examples:
	|username|password|fname|
	|DemoSalesManager|crmsfa|Vishveshwar|

@MergeLead	
Scenario Outline: TC_005_MergeLead_TestCase

	Given Enter the username as <username>
	And Enter the password as <password>
	And Click on Login Button
	And Click on crmsfa Link
	And Click on Leads Link
	And Click on MergeLeads Link
	And Click on the firstIcon
	And Switch to the Child window <index>
	And Enter the firstname in the findlead child window as <fname>
	And Click the FindLeads button in the child window
	And capture the FirstResultingLeadId in the child window
	And Click on the FirstResultingLead in the child window
	And Switch to the Parent window
	And Click on the secondIcon
	And Switch to the Child window <index>
	And Enter the firstname in the findlead child window as <fname>
	And Click the FindLeads button in the child window
	And capture the secondResultingLeadId in the child window
	And Click on the secondResultingLead in the child window
	And Switch to the Parent window
	And Click on the Merge Button
	And Accept the mergeAlert
	And Click on the FindLeads
	And Enter the CapturedFirstResultingLeadId
	
	When Click the FindLeads button
	Then Verify the exceptional message
	
	Examples:
	|username|password|index|fname|
	|DemoSalesManager|crmsfa|1|Vishveshwar|
