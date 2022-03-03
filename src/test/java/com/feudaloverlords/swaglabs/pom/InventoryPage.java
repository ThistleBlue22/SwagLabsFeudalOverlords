package com.feudaloverlords.swaglabs.pom;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class InventoryPage extends Page{

    public InventoryPage(WebDriver driver) {
        super(driver, "https://www.saucedemo.com/inventory.html");
    }

    public void addItemToCart(Item i) {
        driver.findElement(i.BY).click();
    }

    public int getCartBadgeNumber() {
        int cartBadgeNumber = 0;
        try {
            cartBadgeNumber = Integer.parseInt(driver.findElement(BY_CART_BADGE).getText());
        } catch(NoSuchElementException e) {
        } finally {
            return cartBadgeNumber;
        }
    }
}
