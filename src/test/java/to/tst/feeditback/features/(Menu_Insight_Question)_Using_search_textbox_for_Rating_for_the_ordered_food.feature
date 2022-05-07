Feature: (Menu Insight Question) Using search textbox for Rating for the ordered food

  Scenario Outline: Using search textbox For Bad rating
    Given I navigate to Menu Insight Question page
    When I click on textbox Search for a dish here
    And I enter valid dish name as "<Dish_Name>"
    And the dish name is displayed
    And I click on the dish name
    And the dish name page is displayed
    And I click on bad smiles
    And Why didnt you like it? question is displayed
    And I select an answer to Why didnt you like it? as "<Why_not_Ans1>"
    And I select an answer to Why didnt you like it? as "<Why_not_Ans2>"
    And I select an answer to Why didnt you like it? as "<Why_not_Ans3>"
    And I select Add your comments textbox
    And I enter comments as "<Comments>"
    And I click the Done button
    And the Menu Insight Question page is displayed
    And I click the next arrow button
    Then Other Multiline or Single Line Question page is displayed

    Examples:
      | Dish_Name       | Why_not_Ans1 | Why_not_Ans2         | Why_not_Ans3        | Comments |
      | Seabass         | It was dry   | It was too expensive | It was poor tasting | Abc 123  |
      | Ramen Seafood   |              | It was too expensive |                     |          |
      | Roti Pancakes   | It was dry   |                      | It was poor tasting |          |
      | Coconut Fondant | It was dry   |                      |                     | 12 @ #   |
      | Laksa Soup      |              |                      | It was poor tasting | 123 456  |
      | Caserecce       | It was dry   | It was too expensive |                     | abd efg  |

  Scenario Outline: Using search textbox For Neutral rating
    Given I navigate to Menu Insight Question page
    When I click on textbox Search for a dish here
    And I enter valid dish name as "<Dish_Name>"
    And the dish name is displayed
    And I click on the dish name
    And the dish name page is displayed
    And I click on Neutral smiles
    And Add your comments textbox is displayed
    And I select Add your comments textbox
    And I enter comments as "<Comments>"
    And I click the Done button
    And the Menu Insight Question page is displayed
    And I click the next arrow button
    Then Other Multiline or Single Line Question page is displayed

    Examples:
      | Dish_Name       | Comments |
      | Seabass         | Abc 123  |
      | Ramen Seafood   |          |
      | Roti Pancakes   |          |
      | Coconut Fondant | 12 @ #   |
      | Laksa Soup      | 123 456  |
      | Caserecce       | abd efg  |

  Scenario Outline: Using search textbox For Good rating
    Given I navigate to Menu Insight Question page
    When I click on textbox Search for a dish here
    And I enter valid dish name as "<Dish_Name>"
    And the dish name is displayed
    And I click on the dish name
    And the dish name page is displayed
    And I click on Good smiles
    And What did you like about it? question is displayed
    And I select an answer to What did you like about it? as "<What_Ans1>"
    And I select an answer to What did you like about it? as "<What_Ans2>"
    And I select an answer to What did you like about it? as "<What_Ans3>"
    And I select Add your comments textbox
    And I enter comments as "<Comments>"
    And I click the Done button
    And the Menu Insight Question page is displayed
    And I click the next arrow button
    Then Other Multiline or Single Line Question page is displayed

    Examples:
      | Dish_Name       | What_Ans1        | What_Ans2           | What_Ans3         | Comments |
      | Seabass         | It was succulent | It was a good price | I loved the taste | Abc 123  |
      | Ramen Seafood   |                  | It was a good price |                   |          |
      | Roti Pancakes   | It was succulent |                     | I loved the taste |          |
      | Coconut Fondant | It was succulent |                     |                   | 12 @ #   |
      | Laksa Soup      |                  |                     | I loved the taste | 123 456  |
      | Caserecce       | It was succulent | It was a good price |                   | abd efg  |