Feature: Test Automation Functionality

  Scenario: user could Create new account with valid data (Positive scenario)
    Given user navigate to home page
    And user click on signup button
    And user enter valid last name and first name
    And user enter valid number
    And user enter valid email
    And user enter valid password and confirm password
    Then new account is created successfully

  Scenario: user could Create new account with invalid data (first name is an empty) (Negative scenario)
    Given User navigate to home page
    And User click on signup button
    And user enter valid last name an empty first name
    And User enter valid number
    And User enter valid email
    And User enter valid password and confirm password
    Then New account is created successfully

  Scenario: User could Create new account with invalid data (first name with one character) (Negative scenario)
    Given User Navigate to home page
    And User Click on signup button
    And user enter valid last name with one character first name
    And User Enter valid number
    And User Enter valid email
    And User Enter valid password and confirm password
    Then New Account is created successfully

  Scenario: User could Create new account with invalid data (Invalid phone number ) (Negative scenario)
    Given StepA User Navigate to home page
    And StepB User Click on signup button
    And StepC user enter valid last name first name
    And StepE User Enter phone number missing number
    And StepF User Enter valid email
    And StepG User Enter valid password and confirm password
    Then StepH New Account is created successfully

  Scenario: User could Create new account with invalid data (Empty phone number ) (Negative scenario)
    Given stepA User Navigate to home page
    And stepB User Click on signup button
    And stepC user enter valid last name first name
    And stepE User Enter number an empty
    And stepF User Enter valid email
    And stepG User Enter valid password and confirm password
    Then stepH New Account is created successfully