@regression
Feature: Test Automation Functionality

  Background:
    Given user navigate to home page
    And user click on signup button

 Scenario Outline: user could Create new account with invalid data (first name and last name)
    And user enter valid last name "<first_name>" and first name "<last_name>"
    And user enter valid number
    And user enter valid email
    And user enter valid password "123456789" and confirm password "123456789"
    Then new account is created successfully
   Examples:
   | first_name  | last_name |
   |             | DEV       |
   | f           | DEV       |
   | fa          | DEV       |
   | fabrica     |           |
   | fabrica     | D         |
   | fabrica     | De        |

  Scenario Outline: user could Create new account with invalid data (phone number)
    And user could enter valid last name "fabrica" and first name "DEV"
    And user could enter valid number "<phone_number>"
    And user could enter valid email
    And user could enter valid password "123456789" and confirm password "123456789"
    Then user could created new account successfully "<result>"
    Examples:
      | phone_number | result |
      |              | failure|
      | 0125489355   | failure|
      | 656587566882 | failure|
      | 0103358asd97 | failure|
      | 0103358477 5 | failure|
      | 01033584776  | failure|

  Scenario Outline: user could Create new account with invalid data (email)
    And Register should be possible if enter valid last name "fabrica" and first name "DEV"
    And Register should be possible if enter valid number
    And Register should be possible if enter valid email "<email>"
    And Register should be possible if enter valid password "123456789" and confirm password "123456789"
    Then Register should be possible if user created new account successfully "<result>"
    Examples:
      |          email          | result |
      |                         | failure|
      | m.elzoghbi24gmail.com   | failure|
      | m.elzoghbi24@gmail      | failure|
      | @gmail.com              | failure|
      | m.elzoghbi24@@gmail.com | failure|
      | m.elzoghbi24@-gmail.com | failure|
      | m.elzoghbi24@ gmail.com | failure|
      | m.elzoghbi24@gmail.com  | failure|

  Scenario Outline: user could Create new account with invalid data (password and confirm password)
    And user could input valid last name "fabrica" and first name "DEV"
    And user could input valid number
    And user could input valid email
    And user could input invalid password "<password>" and confirm password "<confirm_password>"
    Then user could created new account submitted
    Examples:
      | password | confirm_password |
      |          | 123456789        |
      | 1        | 123456789        |
      | 12       | 123456789        |
      | !#@$^*&^*| 123465789        |
      | 1234567  | 123456789        |
      | 123456789|                  |
      | 123456789| 2548768          |
      | 123456789| 12345678!        |
      | 123456789| 123456721        |