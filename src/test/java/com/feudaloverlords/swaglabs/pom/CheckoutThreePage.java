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

    public CheckoutThreePage(WebDriver driver) {
        super(driver, "https://www.saucedemo.com/checkout-step-three.html");
    }
}
