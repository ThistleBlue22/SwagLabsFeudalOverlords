package com.feudaloverlords.swaglabs.pom;

import org.openqa.selenium.WebDriver;

public class CartPage extends Page {

    public enum Links {
    }

    public CartPage(WebDriver driver) {
        super(driver, "https://www.saucedemo.com/cart.html");
    }
}
