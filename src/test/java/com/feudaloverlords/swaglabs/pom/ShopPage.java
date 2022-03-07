package com.feudaloverlords.swaglabs.pom;

import org.openqa.selenium.WebDriver;

public abstract class ShopPage extends Page{
    protected ShopPage(WebDriver driver, String url) {
        super(driver, url);
    }

    /**
     * Adds the given item to the cart.
     * @param i the item to add.
     */
    public void addItemToCart(Item i) {
        driver.findElement(i.BY_ADD).click();
    }

    /**
     * Removes the given item from the cart.
     * @param i the item to remove.
     */
    public void removeItem(Item i) {
        driver.findElement(i.BY_REMOVE).click();
    }
}
