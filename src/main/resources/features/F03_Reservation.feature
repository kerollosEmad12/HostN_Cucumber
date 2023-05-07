Feature: User Reservations

  Scenario: user could create new reservation (Positive scenario)
    Given user go to home page
    And user click on login button
    And user enter phone number
    And user enter password
    And user click on signup btn
    And user choose district
    And user choose compound
    When user choose date from-to
    And user click on search button
    And user choose unit
    And user click on I Agree To Cancellation Policy
    Then checkout is successfully

    Scenario: user could create new reservation (choose date for one day) (Positive scenario)
      Given User go to home page
      And User click on login button
      And User enter phone number
      And User enter password
      And User click on signup btn
      And User choose district
      And User choose compound
      When user choose one day date from-to
      And User click on search button
      And User choose unit
      And User click on I Agree To Cancellation Policy
      Then Checkout is successfully

      Scenario: user could create new reservation (choose the same date) (Navigate scenario)
        Given User Go to home page
        And User Click on login button
        And User Enter phone number
        And User Enter password
        And User Click on signup btn
        And User Choose district
        And User Choose compound
        When user choose the same date from-to
        And User Click on search button
        And User Choose unit
        And User Click on I Agree To Cancellation Policy
        Then Checkout Is successfully