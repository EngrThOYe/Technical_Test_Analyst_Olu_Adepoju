Feature: Food and drinks rating

  Scenario Outline: Selecting food rating as Worst, Bad or Neutral
    Given I navigate to How would you rate us page
    When I select Food rating as "<Food_Rating>"
    And I select Drink rating as "<Drink_Rating>"
    And I click the next arrow button
    And How likely are you to recommend us to your friends and family? page is displayed
    And I select slider for How likely are you to recommend us to your friends and family? as "<Slider_Score>"
    And I click the next arrow button
    And Drill Down Plus Question: What was wrong with your Food? page is displayed
    And I select an answer to Drill Down Plus Question as "<Drill_Ans1>"
    And I select an answer to Drill Down Plus Question as "<Drill_Ans2>"
    And I select an answer to Drill Down Plus Question as "<Drill_Ans3>"
    And I select Add your comments textbox
    And I enter comments as "<Comments>"
    And I click the next arrow button
    Then Menu Insight Question page is displayed

    Examples:
      | Food_Rating | Drink_Rating    | Slider_Score | Drill_Ans1                    | Drill_Ans2           | Drill_Ans3       | Comments |
      | Worst       | Worst          | 0            | Food: I didnt like the staff | It was too expensive | Food: It was dry | Abc 123  |
      | Bad         | Bad            | 2            |                               | It was too expensive |                  |          |
      | Neutral     | Neutral        | 8            | Food: I didnt like the staff |                      | Food: It was dry |          |
      | Bad         | Good           | 10           | Food: I didnt like the staff |                      |                  | 12 @ #   |
      | Neutral     | Perfect        | 5            |                               |                      | Food: It was dry | 123 456  |
      | Worst       | Not Applicable | 7            | Food: I didnt like the staff | It was too expensive |                  | abd efg  |

  Scenario Outline: Selecting food rating as Good or Perfect
    Given I navigate to How would you rate us page
    When I select Food rating as "<Food_Rating>"
    And I select Drink rating as "<Drink_Rating>"
    And I click the next arrow button
    And How likely are you to recommend us to your friends and family? page is displayed
    And I select slider for How likely are you to recommend us to your friends and family? as "<Slider_Score>"
    And I click the next arrow button
    Then Menu Insight Question page is displayed

    Examples:
      | Food_Rating | Drink_Rating   | Slider_Score |
      | Good        | Worst          | 0            |
      | Good        | Bad            | 2            |
      | Perfect     | Neutral        | 8            |
      | Perfect     | Good           | 10           |
      | Good        | Perfect        | 5            |
      | Perfect     | Not Applicable | 7            |
