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
   |title				|isbn					|coverPhotoUrl																							|rating	|description																																																																			|pageNumber	|publicationYear|publicatedBy			|author							|
   |Hamlet			|9789636450519|https://marvin.bline.hu/product_images/540/B32520.JPG			|3.5		|The Tragedy of Hamlet, Prince of Denmark, often shortened to Hamlet, is a tragedy written by William Shakespeare sometime between 1599 and 1602.	|346				|2006						|Akkord Records		|William Shakespeare|
   |5 hozzávaló	|9789631196702|https://marvin.bline.hu/product_images/281/ID22-306332.JPG	|4.5		|Hihetetlen, de igaz: az 5 HOZZÁVALÓ Jamie Oliver 15. szakácskönyve magyarul!																																		 	|320				|2018						|Park Kiadó				|Jamie Oliver				|
