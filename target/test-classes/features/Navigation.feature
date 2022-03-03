Feature: Navigation
  Navigation through the website

  @ProductAccess
  Scenario: I click on first product
    Given I have access to the SwagLabs website
    And I have a valid username and password
    And I enter the details
    And I login
    And I hover over the first product
    When I click on the product name
    Then I should be directed to the product page

  @ProductAccessAndBackToAllProducts
  Scenario: I click on first product
    Given I have access to the SwagLabs website
    And I have a valid username and password
    And I enter the details
    And I login
    And I hover over the first product
    And I click on the product name
    And I should be directed to the product page
    When I click on the "Back to Products" button
    Then I should be back at the main products page

  @SideBarAccess
  Scenario: I click on the sidebar
    Given I have access to the SwagLabs website
    And I have a valid username and password
    And I enter the details
    And I login
    When I click the sidebar icon
    Then I should be able to see the sidebar

  @Logout
  Scenario: I log out of the website
    Given I have a "<username>" and a "<password>"
    And I use the details to login
    And I click the sidebar icon
    When I click the logout button
    Then The user cookie should be missing

  @ShoppingCart
  Scenario: I click on the shopping cart
    Given I have access to the SwagLabs website
    And I have valid username and password
    And I enter the details
    And I login
    When I click on the shopping cart icon
    Then I should be redirected to the shopping cart page

  @SortingDescendingAlphabetically
  Scenario: I want to sort the products alphabetically descending
    Given I have access to the SwagLabs website
    And I have valid username and password
    And I enter the details
    And I login
    And I click the sorting dropdown menu
    When I click the Name(Z to A) sorting
    Then I should see "Test.allTheThings() T-Shirt (Red)" as the first entry

  @SortingPriceLowToHigh
  Scenario: I want to sort the produces from the cheapest to the most expensive
    Given I have access to the SwagLabs website
    And I have valid username and password
    And I enter the details
    And I login
    And I click the sorting dropdown menu
    When I click the Price (low to high) option
    Then I should see "Sauce Labs Onesie" as the first option

  @SortingPriceHighToLow
  Scenario: I want to sort the produces from the most expensive to the cheapest
    Given I have access to the SwagLabs website
    And I have valid username and password
    And I enter the details
    And I login
    And I click the sorting dropdown menu
    When I click the Price (high to low) option
    Then I should see "Sauce Labs Fleece Jacket" as the first option