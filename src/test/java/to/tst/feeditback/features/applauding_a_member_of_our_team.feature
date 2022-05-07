Feature: applauding a member of our team

  Scenario Outline: applauding a member of our team using textbox search method
    Given I navigate to applaud a member of our team page
    When I click on textbox Search for a team member by their name
    And I enter a valid team member name as "<Team_member_name>"
    And I click the next arrow button
    Then checkout page is displayed

    Examples:
      | Team_member_name |
      | Alice            |
      |                  |
      | Julia            |


  Scenario Outline: applauding a member of our team using selection method
    Given I navigate to applaud a member of our team page
    When I select a team member name or image as "<Team_member_name>"
    And I click the next arrow button
    Then checkout page is displayed

    Examples:
      | Team_member_name |
      | Alice            |
      |                  |
      | Julia            |
