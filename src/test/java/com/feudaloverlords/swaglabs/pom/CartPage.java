package com.feudaloverlords.swaglabs.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.function.Function;

public class CartPage extends Page {

    public enum Links {
        INVENTORY {
            @Override
            Page getPage(WebDriver driver) {
                driver.findElement(By.xpath("//*[@id=\"continue-shopping\"]")).click();
                return new InventoryPage(driver);
            }
        },
        CHECKOUT {
            @Override
            Page getPage(WebDriver driver) {
                return null;
            }
        },
        HOMEPAGE {
            @Override
            Page getPage(WebDriver driver) {
                return null;
            }
        };

        abstract Page getPage(WebDriver driver);

    }

    public CartPage(WebDriver driver) {
        super(driver, "https://www.saucedemo.com/cart.html");
    }

    public Page getPage(Links l) {
        return l.getPage(driver);
    }
}
