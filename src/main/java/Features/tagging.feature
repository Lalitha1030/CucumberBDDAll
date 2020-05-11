@FunctionalTest
Feature: Free CRM Application Testing

@SmokeTest @RegressionTest
Scenario: Login with correct username and password
Given This is a valid login test

@RegressionTest
Scenario: Login with incorrect username and correct password
Given This is a invalid login test

@SmokeTest
Scenario: Creat a contact
Given This is a contact test case

@SmokeTest @RegressionTest
Scenario: Creat a deal
Given This is a dealtest case

@RegressionTest
Scenario: Creat a task
Given This is a task test case

@SmokeTest 
Scenario: Creat a case
Given This is a case test case

@SmokeTest @RegressionTest
Scenario: Verify left panel link
Given Clicking on left panel link

@SmokeTest 
Scenario: Search a deal
Given This is search deal test case

@SmokeTest
Scenario: search a contact
Given This is a search contact test case

@SmokeTest @RegressionTest
Scenario: search a case
Given This is a search case test case

@SmokeTest @RegressionTest
Scenario: search a task
Given This is a search task test case

@SmokeTest @End2End
Scenario: search a call
Given This is a search call test case

@SmokeTest @End2End
Scenario: search an email
Given This is a search email test case

@SmokeTest @End2End
Scenario: search a docs
Given This is a search docs test case

@SmokeTest @End2End
Scenario: search a forms
Given This is a search forms test case

@End2End
Scenario: validate a report
Given This is a report test case

@End2End
Scenario: Application logout
Given This is a logout test case