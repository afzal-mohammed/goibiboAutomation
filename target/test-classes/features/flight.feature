Feature: validating flight search feature 

Scenario: Verify that for one way trip from and to location should not be same 
	Given user launches goibibo website 
	When user enters same location for from and to field for flight 
	Then error message should be displayed for same location 
	
	
	
	
