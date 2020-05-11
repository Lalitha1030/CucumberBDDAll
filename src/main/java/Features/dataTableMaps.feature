Feature: Deal data creation using map

Scenario: Free CRM Creata a new deal using map and data table scenario
Given user should be on CRM login page
When Verify title of login page
Then user enters the user credentials
|username|password|
|batchautomation|Test@12345|
Then click login button in login page 
Then Verify home page title
Then user able to move to new deal page
Then user will enter deal details
|title		   |company|amount   |probability|commission|
|new test deal1| HP1   |3000	 |40		 |	10		|
|new test deal2| HP2   |2000	 |50		 |	15		|
|new test deal3| HP3   |1000	 |60		 |	20		|
Then after saving the deal details close the browser 
 