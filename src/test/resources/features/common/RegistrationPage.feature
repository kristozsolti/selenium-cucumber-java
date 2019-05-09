@RegistrationPageTest
Feature: Registration Page Test
  I want to test if the registration page works correctly

  @Scenario1
  Scenario: Can go to Registration Page
    Given Application Login screen 
    When I Click on Register here! link
    Then I should be redirected to the registration page
    
  @Scenario2
  Scenario: Can register a new user
    Given Registration page
    When I enter "newuser@example.com" to the email field
    And I enter "password" to the password fields
    And I click on register button
    Then I should be registered and get a success message
    
  @Scenario3
  Scenario: Can register the same user twice
    Given Registration page
    When I enter "sameuser@example.com" to the email field
    And I enter "password" to the password fields
    And I click on register button
    And I should be registered and get a success message
    And Registration page
    But I enter "sameuser@example.com" to the email field
    And I enter "password" to the password fields
    And I click on register button
    Then I should get an error message
