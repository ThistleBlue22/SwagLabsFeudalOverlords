package com.feudaloverlords.swaglabs.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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

    public enum Error {
        LOCKED_OUT("Epic sadface: Sorry, this user has been locked out."),
        INVALID_LOGIN("Epic sadface: Username and password do not match any user in this service");

        final String MESSAGE;
        Error(String message) {
            MESSAGE = message;
        }
    }

    private static final By
            BY_USERNAME = new By.ById("user-name"),
            BY_PASSWORD = new By.ById("password"),
            BY_ERROR_MESSAGE_CONTAINER = new By.ByClassName("error-message-container"),
            BY_H3 = new By.ByTagName("h3");


    public HomePage(WebDriver driver) {
        super(driver, "https://www.saucedemo.com/");
        driver.get(URL);
    }

    /**
     * Logs in as the given user.
     * @param u The user to log in as.
     * @return The inventory page the site navigates to after logging in.
            */
    public InventoryPage login(User u) {
        driver.findElement(BY_USERNAME).sendKeys(u.USERNAME);
        driver.findElement(BY_PASSWORD).sendKeys(u.PASSWORD);
        return (InventoryPage) Links.LOGIN.getPage(driver);
    }

    /**
     * Checks if the given error message is present.
     * @param error The error to check for.
     * @return true if the given message is present, otherwise false.
     */
    public static boolean isErrorMessagePresent(Error error) {
        boolean messagePresent = false;
        try {
            messagePresent = driver.findElement(BY_ERROR_MESSAGE_CONTAINER).findElement(BY_H3).getText().equals(error.MESSAGE);
        } catch(NoSuchElementException e) {
        } finally {
            return messagePresent;
        }
    }
}
