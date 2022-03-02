package com.feudaloverlords.swaglabs.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.function.Function;

public class CartPage extends Page {

    public enum Links implements LinksInterface {
        INVENTORY {
            @Override
            public Page getPage(WebDriver driver) {
                driver.findElement(By.xpath("//*[@id=\"continue-shopping\"]")).click();
                return new InventoryPage(driver);
            }
        },
        CHECKOUT {
            @Override
            public Page getPage(WebDriver driver) {
                driver.findElement(By.xpath("")).click();
                return new CheckoutStepOnePage(driver);
            }
        },
        HOMEPAGE {
            @Override
            public Page getPage(WebDriver driver) {
                driver.findElement(By.xpath("")).click();
                driver.findElement(By.xpath("")).click();
                return new HomePage(driver);
            }
        };

    }

    public CartPage(WebDriver driver) {
        super(driver, "https://www.saucedemo.com/cart.html");
    }
}
