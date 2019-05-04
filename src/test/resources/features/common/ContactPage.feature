@tag
Feature: Contact page test
  I want know if I can go to contact page and if I can send a message to page administrators

  @tag1
  Scenario: Go to Contact page
    Given MyLibrary homepage
    When I click on Contact us link at the menubar
    Then I should be redirected to contact page

 @tag2
 Scenario: Send a contact message
   Given MyLibrary contact page
   When I enter name, email and message to the corresponding fields
   And Click on Send Message button
   Then My message should be sent successfully

