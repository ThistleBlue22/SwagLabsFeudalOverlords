package com.feudaloverlords.swaglabs.tests;

import com.feudaloverlords.swaglabs.utilities.DriverFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactoryTest {
    // just a simple example to show how DriverFactory works.
    public WebDriver driver1;
    public WebDriver driver2;
    public WebDriver driver3;
    public WebDriver driver4;
    private static final String URL = "https://www.saucedemo.com";

    // just for encouraging people to use DriverFactory
    @BeforeEach
    public void setupAll(){
        // driver1 and driver2 will not open 2 browsers separately since we are using singleton pattern
        // to make sure that it is working on same browser
        this.driver1 = DriverFactory.get();
        this.driver2 = DriverFactory.get();

        // But driver3 and driver4 will open 2 browsers separately because we are using ChromeDriver class to open
        this.driver3 = new ChromeDriver();
        this.driver4 = new ChromeDriver();
    }

    @Test
    public void goToHomePage(){
        driver1.get(URL);
        driver2.get("https://www.youtube.com");
        driver3.get("https://www.youtube.com");
        driver4.get("https://www.youtube.com");
    }

    @AfterEach
    public void tearDownEach(){
        DriverFactory.closeDriver();
    }
}
