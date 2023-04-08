Feature: Freee CRM Page

#Scenario: Free CRM Test Scenario
#Given user on login page 
#When The title of the page "#1 Free CRM Software for every business"
#Then user enters user name and password
#And user is on home page

#Scenario Outline: Free CRM Test Scenario
#Given user on login page 
#When The title of the page "<title>"
#Then user enters user name and password
#And user is on home page
#
#Examples:
#	| title |
#	| #1 Free CRM Software for every business |
#	| Test |


Scenario: Free CRM Test Scenario
Given user on login page 
When The title of the page pageTitle

| userName | Password |
| #1 Free CRM Software for every business | Test 2 |
| Final Test23 | Test 44 |
 

Then user enters user name and password
And user is on home page

