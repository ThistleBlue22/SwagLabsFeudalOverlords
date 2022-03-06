@add, @all
Feature: Add/Remove items
  Add and Remove items from cart

  Background: Login
    Given I have access to the SwagLabs website
    And I have a normal username and password
    When I initiate a login

  @AddIFirstItemToCart
  Scenario: I click on the Add to Cart Button 1
    Given I am in the inventory page
    And My shopping cart is empty
    When I click on the Add to cart button for an item
    Then The shopping cart badge should show 1
    And Cart page should include the item

  @AddMoreItemsToCart
  Scenario: I click on the Add to Cart Button 2
    Given I am in the inventory page
    When I click on the Add to cart button for an item
    And My shopping cart is not empty
    When I click on the Add to cart button for that item
    Then The shopping cart badge should increase
    And Cart page should include the item


  @AddItemThroughItemPage
  Scenario: I click on the Add to Cart Button
    When My shopping cart is empty
    When I click on the Add to cart button for that item
    Then The shopping cart badge should increase
    And Cart page should include that item

  @RemoveItemFromCart
  Scenario: I click on the Remove Button 1
    Given I am in the inventory page
    And I have clicked on the Add to Cart Button
    When I click on the remove button
    Then The shopping cart badge should decrease
    And Cart page should not contain that item

  @RemoveItemThoughItemPage
  Scenario: I click on the Remove Button 2
    And I have clicked on the Add to Cart Button
    When I click on the remove button from item page
    Then The shopping cart badge should decrease
    And Cart page should not contain that item










