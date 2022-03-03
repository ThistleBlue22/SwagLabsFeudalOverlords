package com.feudaloverlords.swaglabs.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutTwoPage extends Page {

    public enum Links implements LinksInterface {
        CANCEL {
            @Override
            public Page getPage(WebDriver driver) {
                driver.findElement(BY_CANCEL).click();
                return new InventoryPage(driver);
            }
        },
        FINISH {
            @Override
            public Page getPage(WebDriver driver) {
                driver.findElement(BY_FINISH).click();
                return new CheckoutThreePage(driver);
            }
        };
        private static final By BY_CANCEL = new By.ByXPath("//*[@id=\"cancel\"]"),
                BY_FINISH = new By.ByXPath("//*[@id=\"finish\"]");
    }


    public CheckoutTwoPage(WebDriver driver) {
        super(driver, "https://www.saucedemo.com/checkout-step-two.html");
    }
}
