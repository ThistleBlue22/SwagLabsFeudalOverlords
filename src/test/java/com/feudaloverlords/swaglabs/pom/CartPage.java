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
        CHECKOUT_ONE {
            @Override
            public Page getPage(WebDriver driver) {
                driver.findElement(By.xpath("//*[@id=\"checkout\"]")).click();
                return new CheckoutOnePage(driver);
            }
        },
        HOMEPAGE {
            @Override
            public Page getPage(WebDriver driver) {
                driver.findElement(By.xpath("//*[@id=\"react-burger-menu-btn\"]")).click();
                driver.findElement(By.linkText(LinksInterface.LINKTEXT_LOGOUT)).click();
                return new HomePage(driver);
            }
        },
        ABOUT {
            @Override
            public Page getPage(WebDriver driver) {
                driver.findElement(By.xpath("//*[@id=\"react-burger-menu-btn\"]")).click();
                driver.findElement(By.linkText(LinksInterface.LINKTEXT_ABOUT)).click();
                return new Page(driver, LinksInterface.URL_ABOUT);
            }
        },
        TWITTER {
            @Override
            public Page getPage(WebDriver driver) {
                driver.findElement(By.linkText(LinksInterface.LINKTEXT_TWITTER)).click();
                return new Page(driver, LinksInterface.URL_TWITTER);
            }
        },
        FACEBOOK {
            @Override
            public Page getPage(WebDriver driver) {
                driver.findElement(By.linkText(LinksInterface.LINKTEXT_FACEBOOK)).click();
                return new Page(driver, LinksInterface.URL_FACEBOOK);
            }
        },
        LINKEDIN {
            @Override
            public Page getPage(WebDriver driver) {
                driver.findElement(By.linkText(LinksInterface.LINKTEXT_LINKEDIN)).click();
                return new Page(driver, LinksInterface.URL_LINKEDIN);
            }
        }
    }

    public CartPage(WebDriver driver) {
        super(driver, "https://www.saucedemo.com/cart.html");
    }
}
