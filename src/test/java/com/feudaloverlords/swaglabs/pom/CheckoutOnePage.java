package com.feudaloverlords.swaglabs.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutOnePage extends Page {

    public enum Links implements LinksInterface {
        CART {
            @Override
            public Page getPage(WebDriver driver) {
                driver.findElement(By.xpath("//*[@id=\"cancel\"]")).click();
                return new CartPage(driver);
            }
        },
        CHECKOUT_TWO {
            @Override
            public Page getPage(WebDriver driver) {
                driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
                return new CheckoutTwoPage(driver);
            }
        },


    }

    public CheckoutOnePage(WebDriver driver) {
        super(driver, "https://www.saucedemo.com/checkout-step-one.html");
    }
}
