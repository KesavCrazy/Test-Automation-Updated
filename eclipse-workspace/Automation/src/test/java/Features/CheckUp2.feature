Feature: CheckUp Application Login

@KesavTest
Scenario: CheckUp Seach for items and validation results
Given CheckUp User is n greencart landing page
When CheckUp User Searched for vegetables
And CheckUp Added items to cart
And CheckUp user needs to proceded to checkout page for purchase
Then CheckUp verify selected item are displayed
