# encoding: iso-8859-1

@AddNewAuthorPageTest
Feature: Add New Author Page Test
  I want to test if the admin can add a new author to the system 

  @Scenario1
  Scenario: Can go to add new author page
    Given MyLibrary homepage
    When I log in as admin
    And I go to authors page
    Then Add new author button should be there 
    And If i click to add new author button
    Then I should be redirected to add new author page
    
  @Scenario2
  Scenario Outline: Add new author
    Given I log in as admin
    When I go to add new author page
    And Enter the author name <name>
    And Enter the author birth date <birthDate>
    And Enter the author photo url <photoUrl>
    And Enter the author rating <rating>
    And Enter the author biography <bio>
    And Click on Save author button
    Then The new author should appear on the author list
    
  Examples:
  |name								|birthDate	|rating	|bio																																																							|photoUrl																																														|
  |Arany János				|02/03/1817	|4.6		|He was born in Nagyszalonta, Bihar county, Kingdom of Hungary, Austrian Empire.																	|https://upload.wikimedia.org/wikipedia/commons/thumb/0/0a/Barabas-arany.jpg/240px-Barabas-arany.jpg|
  |William Shakespeare|23/04/1564	|4.7		|Shakespeare was born and raised in Stratford-upon-Avon, Warwickshire. At the age of 18, he married Anne Hathaway.|https://upload.wikimedia.org/wikipedia/commons/thumb/a/a2/Shakespeare.jpg/220px-Shakespeare.jpg		|