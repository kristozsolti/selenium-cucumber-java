# encoding: iso-8859-1

@AddNewBookPageTest
Feature: Add New Book Page Test
  I want to test if the admin can add a new book to the system 

  @Scenario1
  Scenario: Can go to add new book page
    Given MyLibrary homepage
    When I log in as admin
    And I go to books page
    Then Add new book button should be there 
    And If i click to add new book button
    Then I should be redirected to add new book page
    
  @Scenario2
  Scenario Outline: Add new book
    Given I log in as admin
    When I go to add new book page
    And Enter the book title <title>
    And Enter the book isbn <isbn>
    And Enter the book cover photo url <coverPhotoUrl>
    And Enter the book rating <rating>
    And Enter the book description <description>
    And Enter the book page number <pageNumber>
    And Enter the book publication year <publicationYear>
    And Enter the book publisher <publicatedBy>
    And Select the book author <author>
    And Click on Save book button
    Then The new book should appear on the book list
    
   Examples:
   |title				|isbn					|coverPhotoUrl					|rating	|description																																																					|pageNumber	|publicationYear|publicatedBy			|author				|
   |Book Nine		|111222333449	|/img/books/book9.png		|3.5		|Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas efficitur rutrum ante, eu mattis diam congue non.	|346				|2006						|Publisher Six		|Author Three	|
   |Book Ten		|111222333410	|/img/books/book10.png	|4.5		|Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas efficitur rutrum ante, eu mattis diam congue non.	|320				|2018						|Publisher Two		|Author Four	|
