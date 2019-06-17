@UsersPageTest
Feature: Users Page Test
  I want to test if the users page is working as expected

  @Scenario1
  Scenario: Can go to Users page
    Given MyLibrary application homepage after authentication
    When I click on users link
    Then I should be redirected to users page

 @Scenario2
  Scenario: Can search to user by email
    Given MyLibrary Users page
    When I enter "gyula" to the search field
    And Select "email" at Search by dropdown list
    Then The "gyula@testgmail.com", "email" should show up at the results
    
 @Scenario3
  Scenario: Can search to user by name
    Given MyLibrary Users page
    When I enter "jakab" to the search field
    And Select "username" at Search by dropdown list
    Then The "Gipsz Jakab", "username" should show up at the results
    
 @Scenario4
  Scenario: Can go to user details page
    Given MyLibrary Users page
    When I clcik on "gyula@testgmail.com" view details link
    Then I should be redirected to his details page
    
   
    
    
    