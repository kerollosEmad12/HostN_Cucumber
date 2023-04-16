Feature: Test Automation Functionality

  Scenario: user could Create new account with valid data (Positive scenario)
    Given user navigate to home page
    And user click on signup button
    And user enter valid last name and first name
    And user enter valid number
    And user enter valid email
    And user enter valid password and confirm password
    Then new account is created successfully

    Scenario: user could Create new account with invalid data (first name with one character) (Negative scenario)
      Given User navigate to home page
      And User click on signup button
      And user enter last name an empty character and first name
      And User enter valid number
      And User enter valid email
      And User enter valid password and confirm password
      Then New account is created successfully