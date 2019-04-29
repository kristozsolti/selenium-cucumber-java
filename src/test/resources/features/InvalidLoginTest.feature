Feature: LoginTest
  Test Login screen functionality

  Scenario: Invalid Login Testing
    Given Application Login screen when invalid
    When I enter wrong credentials
    And Click to login button when invalid
    Then I Should not be authenticated and get error message
