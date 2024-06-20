Feature: Actitime Login Feature

  Scenario: Login with existing credentials
    Given I navigate to actitime application
    When I enter valid credentials
    And I click on login
    Then I should navigate to actitime home page