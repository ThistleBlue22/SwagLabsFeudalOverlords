package com.feudaloverlords.swaglabs.pom;

import org.openqa.selenium.WebDriver;

public abstract class Page {
    private WebDriver driver;
    private final String url;

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
}
