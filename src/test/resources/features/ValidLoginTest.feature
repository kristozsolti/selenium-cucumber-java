Feature: LoginTest
  Test Login screen functionality

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
		