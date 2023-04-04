@laptops
  Feature: User navigate to Laptops page
    Scenario: User adds a laptop to cart
      Given User gets the url
      Then User clicks on login button  on home page
      And User verifies on login popup appeared
      When User enters username "second_user" on login.
      And User enters password "secret_blaze" on login.
      And User clicks on login button on login popup
      Then User verifies logged in successfully
      When User clicks on Laptops button
      And User chooses a laptop
      And User adds it to cart
      Then User clicks on Cart menu
      And User verifies the laptop added to cart
      When User logs out
      Then User verifies logged out successfully
