package com.feudaloverlords.swaglabs.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends Page {

    public enum Links implements LinksInterface {
        CONTINUE_SHOPPING {
            @Override
            public Page getPage(WebDriver driver) {
                driver.findElement(BY_CONTINUE_SHOPPING).click();
                return new InventoryPage(driver);
            }
        },
        CHECKOUT {
            @Override
            public Page getPage(WebDriver driver) {
                driver.findElement(BY_CHECKOUT).click();
                return new CheckoutOnePage(driver);
            }
        }
    }

    private static final By
            BY_CONTINUE_SHOPPING = new By.ById("continue-shopping"),
            BY_CHECKOUT = new By.ById("checkout"),
            BY_INVENTORY_ITEM_NAME = new By.ByClassName("inventory_item_name");

    /**
     * Checks if the given item is in the cart.
     * @param i The item to check the presence of.
     * @return true if the item is in the cart, otherwise false.
     */
    public boolean isItemInCart(Item i) {
        return driver.findElements(BY_INVENTORY_ITEM_NAME).stream()
                .anyMatch(w -> w.getText().equals(i.NAME));
    }

    public CartPage(WebDriver driver) {
        super(driver, "https://www.saucedemo.com/cart.html");
    }
}
