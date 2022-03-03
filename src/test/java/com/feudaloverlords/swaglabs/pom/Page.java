package com.feudaloverlords.swaglabs.pom;

import org.openqa.selenium.WebDriver;

/**
 * The base Page that other Page classes extend. Anonymous subclasses are also sometimes returned.
 */
public class Page {
    protected WebDriver driver;
    protected final String url;

    protected Page(WebDriver driver, String url) {
        this.driver = driver;
        this.url = url;
    }

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

    public String getUrl() {
        return url;
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
