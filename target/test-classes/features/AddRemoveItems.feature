Feature: Add/Remove items
  Add and Remove items from cart

  @StandardAddItemThroughInventoryPage
  Scenario: I click on the Add to Cart Button
    Given I am in the inventory page
    When I click on the Add to cart button for an item
    Then The shopping cart badge should increase
#    And Cart page should include the item

#
#  @StandardAddItemThroughItemPage
#  Scenario: I click on the Add to Cart Button
#    Given I am in an item's page
#    When I click on the Add to cart button for that item
#    Then The shopping cart badge should increase
#    And Cart page should include the item
#
#  @StandardRemoveItemFromCart
#  Scenario: I click on the Remove Button
#    Given I am in the inventory page
#    And I have clicked on the Add to Cart Button
#    When I click on the remove button
#    Then The shopping cart badge should decrease
#    And Cart page should not contain that item
#
#  @StandardRemoveItemThoughItemPage
#  Scenario: I click on the Remove Button
#    Given I am in an item's page
#    And I have clicked on the Add to Cart Button
#    When I click on the remove button
#    Then The shopping cart badge should decrease
#    And Cart page should not contain that item










