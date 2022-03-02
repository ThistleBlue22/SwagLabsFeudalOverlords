package com.feudaloverlords.swaglabs.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends Page {

    public enum Links implements LinksInterface {
        INVENTORY {
            @Override
            public Page getPage(WebDriver driver) {
                driver.findElement(By.xpath("//*[@id=\"continue-shopping\"]")).click();
                return new InventoryPage(driver);
            }
        },
        CHECKOUT_ONE {
            @Override
            public Page getPage(WebDriver driver) {
                driver.findElement(By.xpath("//*[@id=\"checkout\"]")).click();
                return new CheckoutOnePage(driver);
            }
        };
    }

    public CartPage(WebDriver driver) {
        super(driver, "https://www.saucedemo.com/cart.html");
    }
}
