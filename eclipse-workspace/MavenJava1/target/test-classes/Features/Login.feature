Feature: Login into Application

Scenario Outline: Positive test validating login
Given Initialize the browser with chrome
And Navigate to "https://www.amazon.in/" site
And Click on Create account link home page to land on sign up page
When user enters <username> , <mobno> , <email> and <pass> logs in
Then Verify that user is successfully signed up 
And Close the driver

Examples:
|username	|mobno		|email		   		|pass			|
|jsahfjka	|2534564785	|email@gmail.com	|password24		|
|agahsgfyu	|5463562772	|sfaff@gmail.com	|pass348883		|