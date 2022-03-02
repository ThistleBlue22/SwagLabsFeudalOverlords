package com.feudaloverlords.swaglabs.pom;

import org.openqa.selenium.WebDriver;

public interface LinksInterface {
    String URL_ABOUT = "https://saucelabs.com";
    String URL_TWITTER = "https://saucelabs.com";
    String URL_FACEBOOK = "https://saucelabs.com";
    String URL_LINKEDIN = "https://saucelabs.com";
    String LINKTEXT_LOGOUT = "Logout";
    String LINKTEXT_ABOUT = "About";
    String LINKTEXT_TWITTER = "Twitter";
    String LINKTEXT_FACEBOOK = "Facebook";
    String LINKTEXT_LINKEDIN = "About";

    Page getPage(WebDriver driver);
}
