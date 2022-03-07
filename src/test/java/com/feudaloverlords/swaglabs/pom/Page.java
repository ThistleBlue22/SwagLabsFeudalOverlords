package com.feudaloverlords.swaglabs.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

/**
 * The base Page that other Page classes extend. Anonymous subclasses are also sometimes returned.
 */
public class Page {
    protected static WebDriver driver;
    protected final String URL;
    protected final By BY_CART_BADGE = new By.ByClassName("shopping_cart_badge");

    protected Page(WebDriver driver, String url) {
        this.driver = driver;
        URL = url;
    }

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

    public String getURL() {
        return URL;
    }

    /**
     * Navigates to the given page.
     * @param l A member of an enum that implements Links (either the calling class's nested Links enum or GlobalLinks as appropriate).
     * @return The page the given link navigates the user to.
     */
    public Page getPage(LinksInterface l) {
        return l.getPage(driver);
    }

    public static boolean isCookieSet(WebDriver webDriver) {
        return (webDriver.manage().getCookieNamed("session-username") != null);
    }

    /**
     * Retrieves the number on the cart badge.
     * @return the number on the cart badge, or 0 if there isn't one.
     */
    public int getCartBadgeNumber() {
        int cartBadgeNumber = 0;
        try {
            cartBadgeNumber = Integer.parseInt(driver.findElement(BY_CART_BADGE).getText());
        } catch(NoSuchElementException e) {
        } finally {
            return cartBadgeNumber;
        }
    }
}
