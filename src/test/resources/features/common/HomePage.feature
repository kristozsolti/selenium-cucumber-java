@tag
Feature: Home Page Test
  I want to test if the home page is working correctly.

  @tag1
  Scenario: Can Go To Homepage
    Given A web browser
    When I enter the webapplication address to the address bar
    Then I should be redirected to MyLibrary homepage
    
  @tag2
  Scenario: Can Go To a book details from homepage
    Given The MyLibrary application homepage
    When I click on View details at Top Rated Books section
    Then I should be redirected to the book detail page
