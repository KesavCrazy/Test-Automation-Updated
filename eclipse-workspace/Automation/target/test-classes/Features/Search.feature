Feature: Search and place order for Vegetables
@SeleniumTest
Scenario: Seach for items and validation results
Given User is n greencart landing page
When User Searched for "Cucumber" vegetables
Then "Cucumber" results are displayed

@SeleniumTes
Scenario Outline: Seach for items and validation results
Given User is n greencart landing page
When User Searched for <Name> vegetables
And Added items to cart
And user needs to proceded to checkout page for purchase
Then verify selected <Name> item are displayed

Examples:
|Name		|
|Brinjal	|
|Beetroot	|