@AuthorsPageTest
Feature: Authors Page Test
  I want to test if the Authors page works correctly

  @Scenario1
  Scenario: Author details test
    Given MyLibrary Authors page
    When I click on "Jamie Oliver" view details link
    Then I should be redirected to "Jamie Oliver" detail page

  @Scenario2
	Scenario Outline: Author search test
    Given MyLibrary Authors page
    When I enter author name <searchName> to the search field
    And Click on search form button
    Then I will get a result with <authorName> name

	Examples:
	|searchName		|authorName				|
	|rob					|Robert C. Martin	|
	|jamie				|Jamie Oliver			|