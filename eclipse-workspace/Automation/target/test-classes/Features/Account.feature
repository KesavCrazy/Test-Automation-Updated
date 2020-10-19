Feature: Application Login

@SmokeTest
Scenario: Home page default login
Given User is on Netbanking landing page
When User login into application with username "lin" and password "72364"
Then Home page is populated
And Cards displayed are "true"