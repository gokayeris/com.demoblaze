@homepage
Feature: User sings up demoblaze

  @signup
  Scenario: User signs up demoblaze with valid credential
    Given User gets the url
    Then User clicks on singup button on home page
    And User verifies on singup popup appeared
    When User enters username "user_gokay" on signup
    And User enters password "secret_blaze" on signup
    And User clicks on signup button for regsiter
    Then User verifies sings up successfully



