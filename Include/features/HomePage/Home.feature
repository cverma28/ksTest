@regression
Feature: Home page content and CSS value verification

  @smoke, @P1
  Scenario: Verify the availability of contents on home page
    Given I navigated to the home page
    When I wait till the page load
    Then I verify the controls on home page

  @smoke, @P1
  Scenario: Verify the css of controls displayed on home page
    Given I navigated to the home page
    When I wait till the page load
		Then I verify the css value of the controls on home page
		
#		
#		Given Access the application
#		When I click on dashboard icon
#		Then User should able to navigate to dashboard page