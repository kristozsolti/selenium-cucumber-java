
@AdminContactMessagesPageTest
Feature: Admin Contact Messages Page Test
  I want to test if the admin can manage the contact messages

  @Scenario1
  Scenario: Can go to contact messages page
    Given I log in as admin
    When I go to contact messages page
    Then I should be redirected to the contact messages inbox page
    
  @Scenario2
  Scenario: Can read the first message
    Given I log in as admin
    When I go to contact messages page
    And I click on Open Message button at the first message
    Then I should be redirected to the message page
    
  @Scenario3
  Scenario: Can delete the first message
    Given I log in as admin
    When I go to contact messages page
    And I click on Open Message button at the first message
    And Click on delete button
    Then The message should be deleted
    And I should be redirected to the messages inbox page

