Feature: Search for venue

  Scenario: Using Venues near me locator
    Given I navigate to Search for venue page
    When I click on Venues near me button
    Then list of venues near me is displayed

  Scenario Outline: Using location search textbox with branch name
    Given I navigate to Search for venue page
    When I click on textbox Enter location
    And I enter location as "<Branch_Name>"
    Then the venue is displayed
    And I click on the venue
    And When did you visit page is displayed

    Examples:
      | Branch_Name           |
      | Food And Drink Branch |

  Scenario Outline: Using location search textbox with address
    Given I navigate to Search for venue page
    When I click on textbox Enter location
    And I enter location as "<Address>"
    Then the venue is displayed
    And I click on the venue
    And When did you visit page is displayed

    Examples:
      | Address                     |
      | 71 HIGH STREE ESHER, SURREY |
