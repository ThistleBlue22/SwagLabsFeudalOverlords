package com.feudaloverlords.swaglabs.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends Page {
    private static final By BY_USERNAME = new By.ById("user-name"),
                            BY_PASSWORD = new By.ById("password"),
                            BY_LOGIN_BUTTON = new By.ById("login-button");

    public HomePage(WebDriver driver) {
        super(driver, "https://www.saucedemo.com/");
    }

    public InventoryPage login(User u) {
        driver.findElement(BY_USERNAME).sendKeys(u.USERNAME);
        driver.findElement(BY_PASSWORD).sendKeys(u.PASSWORD);
        driver.findElement(BY_LOGIN_BUTTON).click();
        return new InventoryPage(driver);
    }
}
