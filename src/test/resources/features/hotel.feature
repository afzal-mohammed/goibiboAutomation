Feature: validating hotel search feature

Scenario: Verify that user is able to search hotels
Given user launches goibibo website for hotel
When When enters where location
Then rooms should be displayed