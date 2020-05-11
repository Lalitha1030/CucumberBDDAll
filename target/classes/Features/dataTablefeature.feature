Feature: Deal data creation

Scenario: Free CRM Creata a new deal scenario
Given user is on CRM login page
When Verify the title of login page
Then enter the user credentials
|batchautomation|Test@12345|
Then Click the login button in login page of CRM
Then Verify title of the home page
Then user moves to new deal page
Then user enters deal details
|new test deal| 1000|50|10|
Then close the opened browser
 

