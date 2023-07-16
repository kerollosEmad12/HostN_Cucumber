@regression
  Feature: Test Automation Functionality

    Background:
      Given User Navigate To home page
      And user click on login Btn

   Scenario Outline: user could Login with invalid data (phone number)
      And user enter phone number "<number>"
      And user enter valid password "12345678"
      Then login is successfully "<result>"
     Examples:
       |      number    | result  |
       |                | failure |
       | 1234           | failure |
       | 01024556845    | failure |
       | 1033584776     | failure |
       | test@gmail.com | failure |
       | 0103358!4776   | failure |
       | 01033584778    | failure |

    Scenario Outline: user could Login with invalid data (password)
      And user input phone number "01033584776"
      And user input valid password "<password>"
      Then The login is passed
      Examples:
        | password |
        |          |
        | 1        |
        | 1235     |
        | 12348428 |
        | 123@asda |