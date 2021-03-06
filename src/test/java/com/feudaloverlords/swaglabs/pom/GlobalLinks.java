package com.feudaloverlords.swaglabs.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * The links that are available on multiple pages in exactly the same way.
 */
public enum GlobalLinks implements LinksInterface{
    LOGOUT {
        @Override
        public Page getPage(WebDriver driver) {
            driver.findElement(BY_BURGER_MENU).click();
            driver.findElement(BY_LOGOUT).click();
            return new HomePage(driver);
        }
    },
    ALL_ITEMS {
        @Override
        public Page getPage(WebDriver driver) {
            driver.findElement(BY_BURGER_MENU).click();
            driver.findElement(BY_ALL_ITEMS).click();
            return new InventoryPage(driver);
        }
    },
    ABOUT {
        @Override
        public Page getPage(WebDriver driver) {
            driver.findElement(BY_BURGER_MENU).click();
            driver.findElement(BY_ABOUT).click();
            return new Page(driver, URL_ABOUT);
        }
    },
    CART {
        @Override
        public Page getPage(WebDriver driver) {
            driver.findElement(BY_CART).click();
            return new CartPage(driver);
        }
    },
    TWITTER {
        @Override
        public Page getPage(WebDriver driver) {
            driver.findElement(BY_TWITTER).click();
            return new Page(driver, URL_TWITTER);
        }
    },
    FACEBOOK {
        @Override
        public Page getPage(WebDriver driver) {
            driver.findElement(BY_FACEBOOK).click();
            return new Page(driver, URL_FACEBOOK);
        }
    },
    LINKEDIN {
        @Override
        public Page getPage(WebDriver driver) {
            driver.findElement(BY_LINKEDIN).click();
            return new Page(driver, URL_LINKEDIN);
        }
    };

    private static final String
            URL_ABOUT = "https://saucelabs.com",
            URL_TWITTER = "https://twitter.com/saucelabs",
            URL_FACEBOOK = "https://www.facebook.com/saucelabs",
            URL_LINKEDIN = "https://www.linkedin.com/company/sauce-labs/";
    private static final By
            BY_BURGER_MENU = new By.ByXPath("//*[@id=\"react-burger-menu-btn\"]"),
            BY_ALL_ITEMS = new By.ByLinkText("All Items"),
            BY_ABOUT = new By.ByLinkText("About"),
            BY_LOGOUT = new By.ByLinkText("Logout"),
            BY_CART = new By.ByClassName("shopping_cart_link"),
            BY_TWITTER = new By.ByLinkText("Twitter"),
            BY_FACEBOOK = new By.ByLinkText("Facebook"),
            BY_LINKEDIN = new By.ByLinkText("LinkedIn");
}
