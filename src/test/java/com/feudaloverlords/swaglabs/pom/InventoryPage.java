package com.feudaloverlords.swaglabs.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class InventoryPage extends Page{

    private static final By BY_IMG = new By.ByClassName("inventory_item_img");
    private static final String IMG_SOURCE_DOG = "/static/media/sl-404.168b1cce.jpg";

    public InventoryPage(WebDriver driver) {
        super(driver, "https://www.saucedemo.com/inventory.html");
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

    /**
     * Retrieves the number on the cart badge.
     * @return the number on the cart badge, or 0 if there isn't one.
     */
    public int getCartBadgeNumber() {
        int cartBadgeNumber = 0;
        try {
            cartBadgeNumber = Integer.parseInt(driver.findElement(BY_CART_BADGE).getText());
        } catch(NoSuchElementException e) {
        } finally {
            return cartBadgeNumber;
        }
    }

    /**
     * Checks if all item images are the dog.
     * @return true if all images are the dog, otherwise false.
     */
    public boolean areAllImagesTheDog() {
        return driver.findElements(BY_IMG).stream()
                .allMatch(w -> w.getAttribute("src").equals(IMG_SOURCE_DOG));
    }
}
