@homepage
Feature: User sings up demoblaze

#  @signup
#  Scenario: User signs up demoblaze with valid credential
#    Given User gets the url
#    Then User clicks on singup button on home page
#    And User verifies on singup popup appeared
#    When User enters username "user_goka" on signup
#    And User enters password "secret_blaze" on signup
#    And User clicks on signup button for regsiter
#    Then User verifies sings up successfully

  @login
  Scenario : User signs up demoblaze with valid credential
    Given User gets the url
    Then User clicks on login button  on home page
    And User verifies on login popup appeared
    When User enters username "user_goka" on login.
    And User enters password "secret_blaze" on login.
    And User clicks on login button on login popup
    Then User verifies logged in successfully


