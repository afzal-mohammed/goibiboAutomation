Feature: validating flight search feature 

#Scenario: Verify that for one way trip from and to location should not be same 
#	Given user launches goibibo website 
#	When user enters same location for from and to field for flight 
#	Then error message should be displayed for same location 
#	
#	Scenario: Verify that for one way trip from and to location is different for armed forces
#	Given user launches goibibo website
#	When user selects armed forces button
#	And enters from and to location
#	Then flights results should be dispayed
#
#Scenario: Verify that for armed forces from and to location should not be same
#Given user launches goibibo website
#When user selects armed forces button
#And entere same location in from and to fields
#Then error message should be displayed
#
#Scenario: Verify that for senior citizen from and to location should not be same
#Given user launches goibibo website
#When user selects senior citizen button
#And enters same location in from and to fields
#Then error message should be displayed

#Scenario: Verify that for students from and to location should not be same
#Given user launches goibibo website
#When user selects student button
#And enters same location in from and to fields for student
#Then error message should be displayed for student

#Scenario: Verify that for doctors & nurses from and to location should not be same
#Given user launches goibibo website
#When user selects doctor & nurses
#And enters same location in from and to fields for doctor & nurses
#Then error message should be displayed for doctor & nurses

#Scenario: Verify that flight results are displayed for one way trip
#Given user launches goibibo website
#When user selects different location in from and to fields
#Then flight results should be displayed

#Scenario: Verify that for one way trip from and to location is different for senior citizen
#Given user launches goibibo website
#When user selects senior citizen button
#And user enters different location in from and to fields
#Then flight results should be displayed for senior citizen

#Scenario: Verify that for one way trip from and to location is different for student
#Given user launches goibibo website
#When user selects student button
#And enters different locaton in from and to fields
#Then flights results should be displayed for students

#Scenario: Verify that for one way trip from and to location is different for doctor & nurses
#Given user launches goibibo website
#When user selects doctor & nurses
#And enters same different location in from and to fields for doctor & nurses
#Then flights results should be displayed for doctor & nurses

#Scenario: Verify that for round trip same departure and return date is selected
#Given user launches goibibo website
#When enters different location in from and to field
#And selects same departure and return date
#Then flights results should be displayed

#Scenario: Verify that user should not be able to select back dated booking date
#Given user launches goibibo website
#When user enters different location in from and to fields for back dated
#Then user should not able to select back dated dates

#Scenario: Verify that user should able to swap from and to fields
#Given user launches goibibo website
#When user enters different location in from and to fields for swap
#And click swap button
#Then from and to location should be swapped

Scenario: Verify that user should not able  to search flight for children and infants without pre selected adult
Given user launches goibibo website
When user enters different location in from and to fields for children
And selects children and infant as travellers 
Then adult deselect button should be disabled
