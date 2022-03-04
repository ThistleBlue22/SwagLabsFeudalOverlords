package com.feudaloverlords.swaglabs.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class InventoryPage extends ShopPage{

    private static final By BY_IMG = new By.ByClassName("inventory_item_img");
    private static final String IMG_SOURCE_DOG = "/static/media/sl-404.168b1cce.jpg";

    public InventoryPage(WebDriver driver) {
        super(driver, "https://www.saucedemo.com/inventory.html");
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
