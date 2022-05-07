Feature: Sample_1 Journey to Question and Rating page

  Scenario Outline: Rating Food and Drink on question page
    Given I navigate to feeditback test homepage
    And I click on Not got a code
    And Search for venue page is displayed
    And I click on textbox Enter location
    And I enter location as "<Address>"
    And the venue is displayed
    And I click on the venue
    And When did you visit page is displayed
    And I click on day of visit as today
    And I click on drop hour selector
    And I select the active hour
    And I click on drop Min selector
    And I select the active min
    And I click on drop am or pm selector
    And I select the active am or pm
    And the date and time is displayed
    And I click on start button
    And How would you rate us page is displayed
    And I select Food rating as "<Food_Rating>"
    And I select Drink rating as "<Drink_Rating>"
    Then the food and drink rating are selected

    Examples:
      | Address                     | Food_Rating | Drink_Rating   |
      | 71 HIGH STREE ESHER, SURREY | Good        | Not Applicable |
