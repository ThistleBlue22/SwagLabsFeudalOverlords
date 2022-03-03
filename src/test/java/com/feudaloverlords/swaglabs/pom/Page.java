package com.feudaloverlords.swaglabs.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * The base Page that other Page classes extend. Anonymous subclasses are also sometimes returned.
 */
public class Page {
    protected WebDriver driver;
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
}
