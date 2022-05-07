Feature: checkout page

  Scenario Outline: filling Sorry to hear that checkout page
    Given I navigate to Sorry to hear that checkout page
    When I click on textbox Email address
    And I enter a valid Email address as "<Email_address>"
    And I click on textbox Title
    And I enter a valid Title as "<Title>"
    And I click on textbox First name
    And I enter a valid First name as "<First_name>"
    And I click on textbox Last name
    And I enter a valid Last name as "<Last_name>"
    And I click on textbox Postcode
    And I enter a valid Postcode as "<Postcode>"
    And I click on textbox Mobile phone
    And I enter a valid Mobile phone as "<Mobile_phone>"
    And I click on textbox Full Address
    And I enter a valid Full Address as "<Full_Address>"
    And I select check box for Claim my voucher: instant
    And I select check box for Sign up to our newsletter for news and offers
    And I enter a valid Date of birth as "<Date_of_birth>"
    And I enter a valid Birthday as "<Birthday>"
    And I click the Finish button
    Then Thank you for your valuable feedback page is displayed

    Examples:
      | Email_address | Title | First_name | Last_name | Postcode | Mobile_phone | Full_Address      | Date_of_birth | Birthday |
      | adb@mail.com  | Mr    | Abc        | Xyz       | AB01 2CD | +44754545454 | NO 1, 2ND STRT UK | 18/05/2015    | 0205     |
      | adb@mail.com  |       |            | Xyz       | 2CD      | +44754545454 | NO 1, 2ND STRT UK | 24111974      | 05/13    |

  Scenario Outline: filling Thanks for your feedback checkout page without Signing up to our newsletter for news and offers
    Given I navigate to Thanks for your feedback checkout page
    When I click on textbox Email
    And I enter a valid Email as "<Email>"
    And I click the Finish button
    Then Thank you for your valuable feedback page is displayed

    Examples:
      | Email           |
      | lice@feedit.co  |
      | feedit@lice.com |

  Scenario Outline: filling Thanks for your feedback checkout page with Signing up to our newsletter for news and offers
    Given I navigate to Thanks for your feedback checkout page
    When I click on textbox Email
    And I enter a valid Email as "<Email>"
    And I select check box for Sign up to our newsletter for news and offers
    And I click on textbox Title
    And I enter a valid Title as "<Title>"
    And I click on textbox First name
    And I enter a valid First name as "<First_name>"
    And I click on textbox Last name
    And I enter a valid Last name as "<Last_name>"
    And I click on textbox Postcode
    And I enter a valid Postcode as "<Postcode>"
    And I click on textbox Mobile phone
    And I enter a valid Mobile phone as "<Mobile_phone>"
    And I enter a valid Date of birth as "<Date_of_birth>"
    And I enter a valid Birthday as "<Birthday>"
    And I select check box for I accept the privacy policy
    And I click the Finish button
    Then Thank you for your valuable feedback page is displayed

    Examples:
      | Email        | Title | First_name | Last_name | Postcode | Mobile_phone | Date_of_birth | Birthday |
      | adb@mail.com | Mr    | Abc        | Xyz       | AB01 2CD | +44754545454 | 18/05/2015    | 0205     |
      | adb@mail.com |       |            | Xyz       | 2CD      | +44754545454 | 24111974      | 05/13    |


  Scenario: Not filling checkout page
    Given I navigate to checkout Thanks for your feedback or Sorry to hear that page
    When I click on No thanks
    Then Thank you for your valuable feedback page is displayed
