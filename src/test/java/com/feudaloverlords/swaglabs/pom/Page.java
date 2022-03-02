package com.feudaloverlords.swaglabs.pom;

import org.openqa.selenium.WebDriver;

public abstract class Page {
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

    public Page getPage(LinksInterface l) {
        return l.getPage(driver);
    }
}
