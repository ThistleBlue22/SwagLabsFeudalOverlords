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
        CHECKOUT_THREE {
            @Override
            public Page getPage(WebDriver driver) {
                driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
                return new CheckoutTwoPage(driver);
            }
        },
        INVENTORY {
            @Override
            public Page getPage(WebDriver driver) {
                driver.findElement(By.xpath("//*[@id=\"react-burger-menu-btn\"]")).click();
                driver.findElement(By.xpath("//*[@id=\"inventory_sidebar_link\"]")).click();
                return new InventoryPage(driver);
            }
        },
        HOMEPAGE {
            @Override
            public Page getPage(WebDriver driver) {
                driver.findElement(By.xpath("//*[@id=\"react-burger-menu-btn\"]")).click();
                driver.findElement(By.xpath("//*[@id=\"logout_sidebar_link\"]")).click();
                return new HomePage(driver);
            }
        }

    }

    public CheckoutOnePage(WebDriver driver) {
        super(driver, "https://www.saucedemo.com/checkout-step-one.html");
    }
}
