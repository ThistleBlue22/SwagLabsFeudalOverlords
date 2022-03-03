package com.feudaloverlords.swaglabs.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutThreePage extends Page {

    public enum Links implements LinksInterface {
        HOMEPAGE_FINAL {
            @Override
            public Page getPage(WebDriver driver) {
                driver.findElement(By.xpath("//*[@id=\"back-to-products\"]")).click();
                return new HomePage(driver);
            }
        },
        

    }

    public CheckoutThreePage(WebDriver driver) {
        super(driver, "https://www.saucedemo.com/checkout-step-three.html");
    }
}
