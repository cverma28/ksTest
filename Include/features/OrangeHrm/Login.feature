Feature: Verify the functionality of login page

  Scenario: Verify that user is able to login the application with valid credentials.
    Given Navigate to the login page
    When Enter user name and password
    And Click on login button
    Then Verify that user should be navigate to home page

   