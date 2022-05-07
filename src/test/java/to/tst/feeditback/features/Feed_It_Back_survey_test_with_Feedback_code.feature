Feature: Feed It Back survey test with Feedback code

  Background:
    Given I navigate to feeditback test homepage
    And I click on textbox Enter your feedback code

  Scenario Outline: Using invalid feedback code
    Given I enter feedback code as "<Invalid_Feedback_Code>"
    When I click on Next button
    Then I should see an error message An invalid PIN was supplied

    Examples:
      | Invalid_Feedback_Code |
      | AAA-B@2-CCC           |
      | XYZ-BBB-CCC           |
      | abC-XYZ-123           |

  Scenario Outline: Using Valid feedback code
    Given I enter feedback code as "<Valid Feedback Code>"
    When I click on Next button
    Then Search for venue page is displayed

    Examples:
      | Valid Feedback Code |
      | 125-BaB-324         |
      | 525-584-446         |
      | 410-225-123         |

  Scenario Outline: Using incomplete or null feedback code
    Given I enter feedback code as "<Incomplete Feedback Code>"
    When I click on Next button
    Then the Next button should not be responsive

    Examples:
      | Incomplete Feedback Code |
      | 125-BBB-3                |
      |                          |
      | 410-225-12               |

  Scenario Outline: Using more than six characters long feedback code
    Given I enter feedback code as "<Above six characters Feedback Code>"
    When I click on Next button
    Then the Next button should not be responsive

    Examples:
      | Above six characters Feedback Code |
      | 125-BBB-320-321                    |
      | 525-4ED-446-@r                     |
      | 410-2AS-25-12                      |

  Scenario Outline: Checking the textbox for autocomplete of hyphen - with Valid feedback code
    Given I enter feedback code as "<Valid Feedback Code>"
    When I click on Next button
    Then Search for venue page is displayed

    Examples:
      | Valid Feedback Code |
      | 125BaB324           |
      | 525 584 446         |
      | 410 225123          |
