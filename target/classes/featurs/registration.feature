Feature: Test Automation Functionality

  Scenario: user could Create new account with valid data (Positive scenario)
    Given user navigate to home page
    And user click on signup button
    And user enter valid last name and first name
    And user enter valid number
    And user enter valid email
    And user enter valid password and confirm password
    Then new account is created successfully