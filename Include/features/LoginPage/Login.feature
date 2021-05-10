@regression
Feature: Verify the login functionality

Scenario: Verify the login functionality with valid user name and password.
Given I login the application
When I click on hamburger menu icon
Then I veirfy the logout link
