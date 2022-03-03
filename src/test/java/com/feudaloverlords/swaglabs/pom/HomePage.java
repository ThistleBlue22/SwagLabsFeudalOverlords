package com.feudaloverlords.swaglabs.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends Page {

    public enum Links implements LinksInterface {
        LOGIN {
            @Override
            public Page getPage(WebDriver driver) {
                driver.findElement(BY_LOGIN).click();
                return new InventoryPage(driver);
            }
        };
        private static final By BY_LOGIN = new By.ById("login-button");
    }

    private static final By BY_USERNAME = new By.ById("user-name"),
                            BY_PASSWORD = new By.ById("password");


    public HomePage(WebDriver driver) {
        super(driver, "https://www.saucedemo.com/");
        driver.get(url);
    }

    public InventoryPage login(User u) {
        driver.findElement(BY_USERNAME).sendKeys(u.USERNAME);
        driver.findElement(BY_PASSWORD).sendKeys(u.PASSWORD);
        return (InventoryPage) Links.LOGIN.getPage(driver);
    }
}
