@regression
  Feature: Test Automation Functionality

    Scenario: user could Login with invalid data (Keep phone number is an empty) (Negative scenario)
      Given User Navigate To home page
      And user click on login Btn
      And user keep phone number is an empty
      And user enter valid password
      Then login is successfully

    Scenario:  user could Login with invalid data (phone number invalid format) (Negative scenario)
      Given User Navigate To Home page
      And User click on login Btn
      And user enter invalid phone number format
      And User enter valid password
      Then Login is successfully

    Scenario:  user could Login with invalid data (phone number Not registered) (Negative scenario)
      Given User[A] Navigate To Home page
      And User[B] click on login Btn
      And user[C] enter phone number not registered
      And User[D] enter valid password
      Then Login[E] is successfully

    Scenario: user could Login with invalid data (password is an empty) (Negative scenario)
      Given User[A] Navigate To Home Page
      And User[B] Click on login Btn
      And user[C] enter valid phone number
      And User[D] enter password is an empty
      Then login[E] is Successfully

    Scenario:  user could Login with invalid data (password without one num) (Negative scenario)
      Given USer[A] Navigate To Home Page
      And USer[B] Click on login Btn
      And User[C] enter valid phone number
      And User[D] enter password without one num
      Then LOgin[E] is Successfully

    Scenario:  user Login with valid data (Positive scenario)
      Given USER[A] Navigate To Home Page
      And USER[B] Click on login Btn
      And USER[C] enter valid phone number
      And USER[D] enter valid password
      Then LOGIN[E] Is Successfully