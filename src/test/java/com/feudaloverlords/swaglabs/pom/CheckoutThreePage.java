package com.feudaloverlords.swaglabs.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutThreePage extends Page {

    public enum Links implements LinksInterface {
        BACK_HOME {
            @Override
            public Page getPage(WebDriver driver) {
                driver.findElement(BY_BACK_HOME).click();
                return new InventoryPage(driver);
            }
        };
        private static final By BY_BACK_HOME = new By.ByXPath("//*[@id=\"back-to-products\"]");


    }

    public CheckoutThreePage(WebDriver driver) {
        super(driver, "https://www.saucedemo.com/checkout-step-three.html");
    }
}
