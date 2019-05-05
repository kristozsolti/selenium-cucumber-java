@AddNewAuthorPageTest
Feature: Add New Author Page Test
  I want to test if the admin can add a new author to the system 

  @Scenario1
  Scenario: Can go to add new author page
    Given MyLibrary homepage
    When I am logged in as admin
    And I go to authors page
    Then Add new author button should be there 
    And If i click to add new author button
    Then I should be redirected to add new author page