package com.feudaloverlords.swaglabs.stepdefs;

import com.feudaloverlords.swaglabs.pom.*;
import com.feudaloverlords.swaglabs.utilities.DriverFactory;
import io.cucumber.java.en.*;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

public class AddRemoveItems {

    String cartBadgeBefore;
    String cartBadgeAfter;

    @Given("I am in the inventory page")
    public void i_am_in_the_inventory_page() {
        DriverFactory.get().navigate().to("https://www.saucedemo.com/inventory.html");
        String expectedURL = "https://www.saucedemo.com/inventory.html";
        Assertions.assertEquals(expectedURL, DriverFactory.get().getCurrentUrl());
    }

    @Given("My shopping cart is empty")
    public void my_shopping_cart_is_empty() {
        String shopping_cart_container = DriverFactory.get().findElement(new By.ById("shopping_cart_container")).getText();
        cartBadgeBefore = shopping_cart_container;
        Assertions.assertEquals("", shopping_cart_container);
    }

    @When("I click on the Add to cart button for an item")
    public void i_click_on_the_add_to_cart_button_for_an_item() {
        new InventoryPage(DriverFactory.get()).addItemToCart(Item.BACKPACK);
    }

    @Then("The shopping cart badge should show {int}")
    public void the_shopping_cart_badge_should_show(Integer int1) {
        String shoppping_cart_container = DriverFactory.get().findElement(new By.ById("shopping_cart_container")).getText();
        Assertions.assertEquals(int1, Integer.parseInt(shoppping_cart_container));
    }

    @Then("Cart page should include the item")
    public void cart_page_should_include_the_item() {
        Assertions.assertTrue(new CartPage(DriverFactory.get()).isItemInCart(Item.BACKPACK));
    }

    @Given("My shopping cart is not empty")
    public void my_shopping_cart_is_not_empty() {
        String shopping_cart_container = DriverFactory.get().findElement(new By.ById("shopping_cart_container")).getText();
        cartBadgeBefore = shopping_cart_container;
        Assertions.assertFalse(shopping_cart_container.equals(""));
    }

    @Then("The shopping cart badge should increase")
    public void the_shopping_cart_badge_should_increase() {
        String shopping_cart_container = DriverFactory.get().findElement(new By.ById("shopping_cart_container")).getText();
        cartBadgeAfter = shopping_cart_container;
        if (cartBadgeBefore.equals("")) {
            Assertions.assertTrue(Integer.parseInt(cartBadgeAfter) > 0);
        } else {
            Assertions.assertTrue(Integer.parseInt(cartBadgeAfter) > Integer.parseInt(cartBadgeBefore));
        }
    }

    @Given("I am in an item's page")
    public void i_am_in_an_item_s_page() {
    }

    @When("I click on the Add to cart button for that item")
    public void i_click_on_the_add_to_cart_button_for_that_item() {
        //  new InventoryPage(DriverFactory.get()).addItemToCart(Item.BIKE_LIGHT);
        new InventoryItemPage(DriverFactory.get()).addItemToCart(Item.BIKE_LIGHT);
    }

    @Given("I have clicked on the Add to Cart Button")
    public void i_have_clicked_on_the_add_to_cart_button() {
        new InventoryPage(DriverFactory.get()).addItemToCart(Item.ONESIE);
        cartBadgeBefore = DriverFactory.get().findElement(new By.ById("shopping_cart_container")).getText();
    }

    @When("I click on the remove button")
    public void i_click_on_the_remove_button() {
        new InventoryPage(DriverFactory.get()).removeItem(Item.ONESIE);
        cartBadgeAfter = DriverFactory.get().findElement(new By.ById("shopping_cart_container")).getText();
        System.out.println("cartBadgeAfter = " + cartBadgeAfter);
    }

    @Then("The shopping cart badge should decrease")
    public void the_shopping_cart_badge_should_decrease() {
        if (cartBadgeAfter.equals("")) {
            Assertions.assertTrue(Integer.parseInt(cartBadgeBefore) > 0);
        } else {
            Assertions.assertTrue(Integer.parseInt(cartBadgeAfter) < Integer.parseInt(cartBadgeBefore));

        }

    }

    @Then("Cart page should not contain that item")
    public void cart_page_should_not_contain_that_item() throws InterruptedException {
        //      Thread.sleep(3);
        //    Assertions.assertFalse(new CartPage(DriverFactory.get()).isItemInCart(Item.ONESIE));
        System.out.println("Item.ONESIE.name() = " + Item.ONESIE.name());
        Assertions.assertFalse(DriverFactory.get().findElement(new By.ByClassName("inventory_item_name")).getText().contains(Item.ONESIE.name()));
    }

    @And("Cart page should include that item")
    public void cartPageShouldIncludeThatItem() {
        Assertions.assertTrue(new CartPage(DriverFactory.get()).isItemInCart(Item.BIKE_LIGHT));
    }

    @When("I click on the remove button from item page")
    public void iClickOnTheRemoveButtonFromItemPage() {
        new InventoryItemPage(DriverFactory.get()).removeItem(Item.ONESIE);
        cartBadgeAfter = DriverFactory.get().findElement(new By.ById("shopping_cart_container")).getText();
    }
}
