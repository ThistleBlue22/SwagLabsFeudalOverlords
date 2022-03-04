Feature: Add/Remove items
  Add and Remove items from cart

  @StandardUserAddItemThroughInventoryPage
  Scenario: I click on the Add to Cart Button
    Given I am in the inventory page
    When I click on the Add to cart button for an item
    Then The shopping cart badge should increase
    And Cart page should contain the item

  @StandardUserAddItemThroughItemPage
  Scenario: I click on the Add to Cart Button
    Given I am in an item's page
    When I click on the Add to cart button for that item
    Then The shopping cart badge should increase
    And Cart page should contain the item

  @StandardUserRemoveItemThroughInventoryPage
  Scenario: I click on the Remove Button
    Given I am in the inventory page
    And I have clicked on the Add to Cart Button for an item
    When I click on the remove button
    Then The shopping cart badge should decrease
    And Cart page should not contain that item

  @StandardUserRemoveItemThoughItemPage
  Scenario: I click on the Remove Button
    Given I am in an item's page
    And I have clicked on the Add to Cart Button
    When I click on the remove button
    Then The shopping cart badge should decrease
    And Cart page should not contain that item

  @StandardUserRemoveItemThoughCartPage
  Scenario: I click on the Remove Button
    Given I am in the cart page
    And I have clicked on the Add to Cart Button
    When I click on the remove button
    Then The shopping cart badge should decrease
    And Cart page should not contain that item


  @ProblemUserAddItemThroughInventoryPageWorks
  Scenario: I click on the Add to Cart Button
    Given I am in the inventory page
    When I click on the Add to cart button for 1st, 2nd or 5th item
    Then The shopping cart badge should increase
    And Cart page should contain the item

  @ProblemUserAddItemThroughInventoryPageNotWorking
  Scenario: I click on the Add to Cart Button
    Given I am in the inventory page
    When I click on the Add to cart button for 3rd, 4th or 6th item
    Then The shopping cart badge should not increase
    And Cart page should not contain the item

  @ProblemUserRemoveItemThroughInventoryPage
  Scenario: I click on the Add to Cart Button
    Given I am in the inventory page
    When I click on the Add to cart button for 1st, 2nd or 5th item
    And I click on the remove button
    Then The shopping cart badge should not decrease
    And Cart page should contain the item

  @ProblemUserRemoveItemThroughCartPage
  Scenario: I click on the Add to Cart Button
    Given I am in the inventory page
    And I click on the Add to cart button for 1st, 2nd or 5th item
    And I go to the cart page
    When I click on the remove button for an item
    Then The shopping cart badge should decrease
    And Cart page should not contain the item
















