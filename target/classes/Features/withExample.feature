Feature: User Loging in to Publix Accounts
	
	
Scenario Outline: Login as a User with minimal logining credentials
	Given User is on the Login Page
	When User enters  "<username>" and "<password>" 
	Then User clicks the login button
	And User should be on the home page
	And Close the browser
Examples:
|username              |password|
|lalithakolla@gmail.com|Similacpublix1|
#|lalitha_kolla@yahoo.com|Simmipublix01|