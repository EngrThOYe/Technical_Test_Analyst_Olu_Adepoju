Feature: Selecting the date and time of visit

  Scenario Outline: Selecting Today's date and time of visit without calender
    Given I navigate to When did you visit page
    When I click on day of visit as today
    And I click on drop hour selector
    And I select Hour as "<Hour>"
    And I click on drop Min selector
    And I select Min as "<Min>"
    And I click on drop am or pm selector
    And I select am or pm as "<am/pm>"
    Then the date and time is displayed
    And I click on start button
    And How would you rate us page is displayed

    Examples:
      | Hour | Min | am/pm |
      | 01   | 15  | am    |
      | 10   | 30  | pm    |
      | 12   | 00  | am    |
      | 08   | 45  | pm    |

  Scenario Outline: Selecting Yesterday's date and time of visit without calender
    Given I navigate to When did you visit page
    When I click on day of visit as yesterday
    And I click on drop hour selector
    And I select Hour as "<Hour>"
    And I click on drop Min selector
    And I select Min as "<Min>"
    And I click on drop am or pm selector
    And I select am or pm as "<am/pm>"
    Then the date and time is displayed
    And I click on start button
    And How would you rate us page is displayed

    Examples:
      | Hour | Min | am/pm |
      | 01   | 15  | am    |
      | 10   | 30  | pm    |
      | 12   | 00  | am    |
      | 08   | 45  | pm    |

  Scenario Outline: Selecting date and time of visit with calender
    Given I navigate to When did you visit page
    When I click on choose calender button
    And I select month as "<Month>"
    And I select valid date as "<Date>"
    And I select Hour as "<Hour>"
    And I select Min as "<Min>"
    And I select am or pm as "<am/pm>"
    Then the date and time is displayed
    And I click on start button
    And How would you rate us page is displayed

    Examples:
      | Month | Date | Hour | Min | am/pm |
      | May   | 3    | 10   | 30  | pm    |
      | April | 11   | 12   | 00  | am    |
      | May   | 9    | 08   | 45  | pm    |