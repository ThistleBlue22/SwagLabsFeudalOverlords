package com.feudaloverlords.swaglabs.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InventoryItemPage extends Page{

    public enum Links implements LinksInterface {
        BACK_TO_PRODUCTS {
            @Override
            public Page getPage(WebDriver driver) {
                driver.findElement(BY_BACK_TO_PRODUCTS).click();
                return new InventoryPage(driver);
            }
        };
        private static final By BY_BACK_TO_PRODUCTS = new By.ByXPath("//*[@id=\"back-to-products\"]"),
                BY_ADD_TO_CART = new By.ByXPath("///*[@id=\"add-to-cart-sauce-labs-bike-light\"]"),
                BY_REMOVE = new By.ByXPath("//*[@id=\"remove-sauce-labs-bike-light\"]");
    }



    public InventoryItemPage(WebDriver driver) {
        super(driver, "https://www.saucedemo.com/inventory-item.html?id=");
    }
}
