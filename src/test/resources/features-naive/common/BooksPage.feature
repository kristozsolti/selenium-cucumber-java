# encoding: iso-8859-1

@BooksPageTest
Feature: Books Page Test
  I want to test if the Books page works correctly

  @Scenario1
  Scenario: Book details test
    Given MyLibrary Books page
    When I click on the first Book view details link
    Then I should be redirected to that book detail page

  @Scenario2
	Scenario Outline: Book search test
    Given MyLibrary Books page
    When I enter <searchTitle> to search field
    And Click on search button
    Then I should get a result with <bookTitle>

	Examples:
	|searchTitle	|bookTitle	|
	|one					|Book One		|
	|two					|Book Two		|
	|six					|Book Six		|