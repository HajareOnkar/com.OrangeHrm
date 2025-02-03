#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@smoke
Feature: verify Login functionality

Scenario: Login with valid credential
Given User navigate to Login screen
When User enter vlid username and valid password
And User click on Login button
Then User navigate to home screen

Scenario: User login with invalid username
Given User navigate to Login screen
When User enter invalid username "omi" and valid password "admin123"
And User click on Login button
Then User gives error


Scenario: User login with invalid username
Given User navigate to Login screen
When User enter username and password
|hh|pass|
|ooo|passdd|
And User click on Login button
Then User gives error
