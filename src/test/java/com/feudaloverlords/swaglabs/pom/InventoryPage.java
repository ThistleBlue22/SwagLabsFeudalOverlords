package com.feudaloverlords.swaglabs.pom;

import org.openqa.selenium.WebDriver;

public class InventoryPage extends Page{

    public InventoryPage(WebDriver driver) {
        super(driver, "https://www.saucedemo.com/inventory.html");
    }

    public void addItemToCart(Item i) {
        driver.findElement(i.BY).click();
    }
}
