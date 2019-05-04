@UsersPageTest
Feature: Users Page Test
  I want to test if the users page is working as expected

  @Scenario1
  Scenario: Can go to Users page
    Given MyLibrary application homepage after authentication
    When I click on users link
    Then I should be redirected to users page

