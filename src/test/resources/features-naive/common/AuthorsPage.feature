@AuthorsPageTest
Feature: Authors Page Test
  I want to test if the Authors page works correctly

  @Scenario1
  Scenario: Author details test
    Given MyLibrary Authors page
    When I click on "Author One" view details link
    Then I should be redirected to "Author One" detail page

  @Scenario2
	Scenario Outline: Author search test
    Given MyLibrary Authors page
    When I enter author name <searchName> to the search field
    And Click on search form button
    Then I will get a result with <authorName> name

	Examples:
	|searchName		|authorName		|
	|one					|Author One		|
	|three				|Author Three	|