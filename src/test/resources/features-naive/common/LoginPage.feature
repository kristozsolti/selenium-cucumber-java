@LoginPageFeature
Feature: Login Page Test
  I want to test if the authentication functionality is working correctly.

	@Scenario1
  Scenario: Invalid Login Testing
    Given Application Login screen
    When I enter wrong credentials
    And Click to login button
    Then I Should not be authenticated and get error message

  @Scenario2
  Scenario Outline: Valid Login Testing
    Given Application Login screen
    When I enter my <username> and <password>
    And Click to login button
    Then I Should be authenticated

	Examples:
	|username							|password	|
	|admin@test.com				|admin		|
	|user@testgmail.com		|user			|
	|gyula@testgmail.com	|user			|
