# encoding: iso-8859-1

@AuthorsPageTest
Feature: Authors Page Test
  I want to test if the Authors page works correctly

  @Scenario1
  Scenario: Author details test
    Given MyLibrary Authors page
    When I click on "Jamie Oliver" view details link
    Then I should be redirected to "Jamie Oliver" detail page

  #@Scenario2
	#Scenario Outline: Author search test
  #  Given MyLibrary Books page
  #  When I enter <searchName> to search field
  #  And Click on search button
  #  Then I should get a result with <authorName>

	#Examples:
	#|searchName		|authorName																						|
	#|tiszta				|Tiszta k�d - Az agilis szoftverfejleszt�s k�zik�nyve	|
	#|j�nos				|J�nos vit�z																					|
	#|h�h�r				|A h�h�r k�tele																				|