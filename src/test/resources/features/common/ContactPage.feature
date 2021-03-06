@ContactPageTest
Feature: Contact page test
  I want know if I can go to contact page and if I can send a message to page administrators

  @Scenario1
  Scenario: Go to Contact page
    Given MyLibrary homepage
    When I click on Contact us link at the menubar
    Then I should be redirected to contact page

 	@Scenario2
 	Scenario Outline: Send a contact message
   	Given MyLibrary contact page
   	When I enter name <name>, email <email> and message <message> to the corresponding fields
   	And Click on Send Message button
   	Then My message should be sent successfully

	Examples:
	|name								|email								|message																																							|
	|Contact Form Tester|contactform@test.com	|Hello. With this message I would like to test if the contact form is really working.	|