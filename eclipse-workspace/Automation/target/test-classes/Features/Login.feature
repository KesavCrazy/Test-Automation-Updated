Feature: Application Login

#Background:
#Given validate the browser
#When Browser is triggered
#Then check if browser is started

@WebTest
Scenario: Home page default login
Given User is on Netbanking landing page
When User login into application with username "lin" and password "72364"
Then Home page is populated
And Cards displayed are "true"

@MobileTest
Scenario: Home page default login
Given User is on Netbanking landing page
When User login into application with username "john" and password "27382"
Then Home page is populated
And Cards displayed are "false"

@SmokeTest
Scenario: Home page default login
Given User is on Netbanking landing page
When User login into application with username "john" and password "27382"
Then Home page is populated
And Cards displayed are "false"

@MobileTest
Scenario: Home page default login
Given User is on Netbanking landing page
When User signUp with following login details
|jenn|abcd|jenn@abcd.com|Australia|3242544|
Then Home page is populated
And Cards displayed are "false"

@WebTest
Scenario Outline: Home page default login
Given User is on Netbanking landing page
When User login into application with <username>  and <password>
Then Home page is populated
And Cards displayed are "true"

Examples:
|username |password |
|user1 	  |pass1    |
|user2 	  |pass2    |
|user3 	  |pass3    |
|user4 	  |pass4    |