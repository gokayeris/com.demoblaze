@homepage
Feature: User sings up demoblaze

  @signup
  Scenario: User signs up demoblaze with valid credential
    Given User gets the url
    Then User clicks on singup button
    And User verifies on singup page
    When User enters username "user_goka"
    And User enters password "secret_blaze"
    And User clicks on signup button for regsiter
    Then User verifies sings up successfully

#  @login
#  Scenario Outline: User signs up demoblaze with valid credential
#    Given User gets the url
#    Then User clicks on singup button
#    And User verifies on singup page
#    When User enters username "<username>"
#    And User enters password "<password>"
#    And User clicks on login button
#    Then User verifies sings up successfully
#    @login
#    Examples:
#      | username                | password     |
#      | user_go                 | secret_blaze |
#      | problem_user            | secret_sauce |
#      | performance_glitch_user | secret_sauce |
