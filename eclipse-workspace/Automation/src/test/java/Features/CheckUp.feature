Feature: CheckUp Application Login

@CheckTest
Scenario: CheckUp Home page default login
Given User is on landing page
When check User login into application with
Then check page is populated
And Cards displayed are "true"

