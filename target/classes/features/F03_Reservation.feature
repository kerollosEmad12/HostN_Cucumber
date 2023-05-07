Feature: User Reservations

  Scenario: user could create new reservation
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