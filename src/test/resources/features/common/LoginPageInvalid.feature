@tag
Feature: Login Page Test with invalid credentials
  I want to test if the login page is working correctly.

  @tag1
  Scenario: Invalid Login Testing
    Given Application Login screen when invalid
    When I enter wrong credentials
    And Click to login button when invalid
    Then I Should not be authenticated and get error message
