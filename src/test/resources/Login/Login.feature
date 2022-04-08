Feature: OrangeHRM
Scenario: Validate Login
Given I should be in the Login page of orangeHRM
When Enter Name
And Enter Password
And Click on LoginButton
Then Login Sucessfully
