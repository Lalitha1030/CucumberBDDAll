Feature: User Registration
	
	
Scenario: Register a User with minimal password combinations
	Given User is taken to Login Page
	When User enters the "lalithakolla@gmail.com" and "Similacpublix1"
#	When User enters the <username> and <password> 
#	|lalithakolla@gmail.com|Similacpublix1|
	Then User click the login button
	And User should see the home page

	
#Feature: Publix Login Feature

#Scenario: Publix login Test Scenario
#	Given User is already on login page
#	When Title of login page is from publix
#	Then user enters "lalithakolla@gmail.com" and "Similacpublix1"
#	Then user clicks on login button
#	Then user is on home page
#	Then user moves to savings page to check weekly ad
#	Then user closes the browser

# with example
#Scenario Outline: Publix login Test Scenario	
#	Given User is already on login page
#	When Title of login page is from publix
#	Then user enters "<username>" and "<password>"
#	Then user clicks on login button
#	Then user is on home page
#	Then user moves to savings page to check weekly ad
#	Then user closes the browser	
#Examples:
#	| username				  | password|      |firstname|lastname|position|
#	| lalithakolla@gmail.com  | Similacpublix1|
#	| lalitha_kolla@yahoo.com | Simmipub01|