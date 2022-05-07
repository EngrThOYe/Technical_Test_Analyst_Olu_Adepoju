Feature: Answering Other Single Line or Multiline Question

  Scenario Outline: Answering Other Single Line Question (What was your favourite food that you ordered?)
    Given I navigate to Other Single Line Question page
    When I click on textbox Enter your text here
    And I enter the single line answer as "<Single_line_Ans>"
    And I click the next arrow button
    Then Other Multiline Question or applaud a member of our team or checkout (Thanks for your feedback or Sorry to hear that) page is displayed

    Examples:
      | Single_line_Ans |
      | Okay            |
      |                 |
      | Thank You       |

  Scenario Outline: Answering Other Multiline Question (What could we do better?)
    Given I navigate to Other Multiline Question page
    When I click on textbox Add your comments
    And I enter the multiline answer as "<Multiline_Ans>"
    And I click the next arrow button
    Then Other Single Line Question or applaud a member of our team or checkout page is displayed

    Examples:
      | Multiline_Ans |
      | Okay          |
      |               |
      | Thank You     |