package com.feudaloverlords.swaglabs.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutTwoPage extends Page {

    public enum Links implements LinksInterface {
        CHECKOUT_ONE {
            @Override
            public Page getPage(WebDriver driver) {
                driver.findElement(By.xpath("//*[@id=\"cancel\"]")).click();
                return new CheckoutOnePage(driver);
            }
        },
        CHECKOUT_THREE {
            @Override
            public Page getPage(WebDriver driver) {
                driver.findElement(By.xpath("//*[@id=\"finish\"]")).click();
                return new CheckoutThreePage(driver);
            }
        },
        CART {
            @Override
            public Page getPage(WebDriver driver) {
                driver.findElement(By.xpath("//*[@id=\"cancel\"]")).click();
                return new CartPage(driver);
            }
        },


    }


    public CheckoutTwoPage(WebDriver driver) {
        super(driver, "https://www.saucedemo.com/checkout-step-two.html");
    }
}
