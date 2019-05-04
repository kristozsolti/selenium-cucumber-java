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
	|searchTitle	|bookTitle																						|
	|tiszta				|Tiszta k�d - Az agilis szoftverfejleszt�s k�zik�nyve	|
	|j�nos				|J�nos vit�z																					|
	|h�h�r				|A h�h�r k�tele																				|