Feature: (Menu Insight Question) Using selection method for Rating for the ordered food

  Scenario Outline: Selecting the menu
    Given I navigate to Menu Insight Question page
    When I click on Course type as "<Course_type>"
    And the Courses page is displayed
    And I select the menu type as "<Menu_type>"
    And I select the Dish name as "<Dish_name>"
    And the dish name is displayed
    Then the dish name page is displayed

    Examples:
      | Course_type  | Menu_type         | Dish_name       |
      | Desserts     | Asian Desserts    | Churros         |
      | Desserts     | Asian Desserts    | Banana Fritters |
      | Desserts     | Asian Desserts    | Roti Pancakes   |
      | Main Courses | Italian Pizza     | Adult Buffet    |
      | Main Courses | RS Salads & Mains | Cod & Chips     |
      | Main Courses | Asian Soups       | Ramen Seafood   |
      | Staters      | Italian Staters   | Antipasto Parma |
      | Staters      | Italian Staters   | Bruschetta      |

  Scenario Outline: Using selection method For Bad rating
    Given I navigate to dish name page
    When I click on bad smiles
    And Why didnt you like it? question is displayed
    And I select an answer to Why didnt you like it? as "<Why_not_Ans1>"
    And I select an answer to Why didnt you like it? as "<Why_not_Ans2>"
    And I select an answer to Why didnt you like it? as "<Why_not_Ans3>"
    And I select Add your comments textbox
    And I enter comments as "<Comments>"
    And I click the Done button
    And the Courses page is displayed
    And I click the Save & Continue button
    And the Menu Insight Question page is displayed
    And I click the next arrow button
    Then Other Multiline or Single Line Question page is displayed

    Examples:
      | Why_not_Ans1 | Why_not_Ans2         | Why_not_Ans3        | Comments |
      | It was dry   | It was too expensive | It was poor tasting | Abc 123  |
      |              | It was too expensive |                     |          |
      | It was dry   |                      | It was poor tasting |          |
      | It was dry   |                      |                     | 12 @ #   |
      |              |                      | It was poor tasting | 123 456  |
      | It was dry   | It was too expensive |                     | abd efg  |

  Scenario Outline: Using selection method For Neutral rating
    Given I navigate to dish name page
    And I click on Neutral smiles
    And Add your comments textbox is displayed
    And I select Add your comments textbox
    And I enter comments as "<Comments>"
    And I click the Done button
    And the Courses page is displayed
    And I click the Save & Continue button
    And the Menu Insight Question page is displayed
    And I click the next arrow button
    Then Other Multiline or Single Line Question page is displayed

    Examples:
      | Comments |
      | Abc 123  |
      |          |
      |          |
      | 12 @ #   |
      | 123 456  |
      | abd efg  |

  Scenario Outline: Using selection method For Good rating
    Given I navigate to dish name page
    And I click on Good smiles
    And What did you like about it? question is displayed
    And I select an answer to What did you like about it? as "<What_Ans1>"
    And I select an answer to What did you like about it? as "<What_Ans2>"
    And I select an answer to What did you like about it? as "<What_Ans3>"
    And I select Add your comments textbox
    And I enter comments as "<Comments>"
    And I click the Done button
    And the Courses page is displayed
    And I click the Save & Continue button
    And the Menu Insight Question page is displayed
    And I click the next arrow button
    Then Other Multiline or Single Line Question page is displayed

    Examples:
      | What_Ans1        | What_Ans2           | What_Ans3         | Comments |
      | It was succulent | It was a good price | I loved the taste | Abc 123  |
      |                  | It was a good price |                   |          |
      | It was succulent |                     | I loved the taste |          |
      | It was succulent |                     |                   | 12 @ #   |
      |                  |                     | I loved the taste | 123 456  |
      | It was succulent | It was a good price |                   | abd efg  |
