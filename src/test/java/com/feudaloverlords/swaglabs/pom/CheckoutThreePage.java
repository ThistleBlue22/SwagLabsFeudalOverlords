package com.feudaloverlords.swaglabs.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutThreePage extends Page {

    public enum Links implements LinksInterface {
        INVENTORY {
            @Override
            public Page getPage(WebDriver driver) {
                driver.findElement(By.xpath("//*[@id=\"back-to-products\"]")).click();
                return new InventoryPage(driver);
            }
        },


    }

    public CheckoutThreePage(WebDriver driver) {
        super(driver, "https://www.saucedemo.com/checkout-step-three.html");
    }
}
