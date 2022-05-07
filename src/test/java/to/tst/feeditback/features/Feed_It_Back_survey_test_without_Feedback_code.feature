Feature: Feed It Back survey test without Feedback code

  Scenario: Opening Search for venue page without feedback code
    Given I navigate to feeditback test homepage
    When I click on Not got a code
    Then Search for venue page is displayed