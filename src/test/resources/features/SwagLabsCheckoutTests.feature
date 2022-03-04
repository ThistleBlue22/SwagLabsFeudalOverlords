Feature: The ability for a user to check out

  Background:
    Given I have a web driver
    Given I am a logged in as a standard user

  @UserCanEnterTheirDetails
  Scenario: I enter my details on the checkout page
    Given that I am on step one of the checkout process
    When I enter "Jack" "Gilbride" and "IP14 2HB"
    Then the page url should be "https://www.saucedemo.com/checkout-step-two.html"

  @UserCanViewTheOrderPrice
  Scenario: I have entered my checkout details and need to view the order price
    Given that I am on step two of the checkout process
    Then the summary total should be equal to the summary subtotal plus tax

  @UserCanCompleteThePurchase
  Scenario: I want to complete the purchase
    Given that I am on step two of the checkout process
    Then click the Finish button
    Then the page url should be "https://www.saucedemo.com/checkout-complete.html"