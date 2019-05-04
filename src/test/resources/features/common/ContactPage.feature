@tag
Feature: Contact page test
  I want know if I can go to contact page and if I can send a message to page administrators

  @tag1
  Scenario: Go to Contact page
    Given MyLibrary homepage
    When I click on Contact us link at the menubar
    Then I should be redirected to contact page

#  @tag2
#  Scenario: Send a contact message
#    Given I want to write a step with <name>
#    When I check for the <value> in step
#    Then I verify the <status> in step

