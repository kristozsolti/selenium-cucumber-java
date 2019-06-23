@AdminDashboardPageFeature
Feature: Admin Dashboard Page Feature
  I want to use this to test if the admin can visit his dashboard page

  @Scenario1
  Scenario: Can go to admin dashboard page
    Given I log in as admin
    When I click on admin dashboard button on the menubar
    Then I should be redirected to the admin dashboard page

