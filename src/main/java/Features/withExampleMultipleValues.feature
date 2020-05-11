Feature: Free CRM Create Contacts	
	
Scenario Outline: Free CRM Create a new contact Scenario
	Given User is already on Login Page
	When title of login page is free CRM
	Then User able to enter "<username>" and "<password>" 
	Then User able to click the login button
	Then User is on home page
	Then user is in new contact page
	Then user enters the contact details "<firstname>" and "<lastname>" and "<company>"
#	Then Close the browser
Examples:
|username        |password  |firstname|lastname|company |
|batchautomation |Test@12345|Tom      |peter   |Amazon |
|batchautomation |Test@12345|David    |Disouza |HP|