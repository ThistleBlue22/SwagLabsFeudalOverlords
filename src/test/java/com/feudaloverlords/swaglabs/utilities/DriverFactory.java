package com.feudaloverlords.swaglabs.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.io.File;
import java.io.IOException;

public class DriverFactory {
    // singleton pattern

    private static WebDriver driver;

    private DriverFactory() {
    }

    private static ChromeOptions maximizedOptions() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        return options;
    }

    private static ChromeDriverService service() {
        ChromeDriverService service = new ChromeDriverService
                .Builder()
                .usingDriverExecutable(new File("chromedriver.exe"))
                .usingAnyFreePort()
                .build();
        try {
            service.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return service;
    }

    public static WebDriver get() {


        if (driver == null) {
            // you will write which browser with options you want to use in configuration.properties file
            // that needs to be put under the project (main) folder
            // more browsers can be added later on like Edge, Firefox etc.
            String browser = ConfigurationReader.get("browser");
            switch (browser.toLowerCase()) {
                case "chrome-headless" -> {
                    System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
                    driver = new ChromeDriver(new ChromeOptions().setHeadless(true));
                }
                case "chrome" -> {
                    System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
                    driver = new ChromeDriver(maximizedOptions());
                }
                case "firefox-headless" -> {
                    System.setProperty("webdriver.gecko.driver","src/test/resources/geckodriver.exe");
                    driver = new FirefoxDriver(new FirefoxOptions().setHeadless(true));
                }
                case "firefox" -> {
                    System.setProperty("webdriver.gecko.driver","src/test/resources/geckodriver.exe");
                    driver = new FirefoxDriver();
                    driver.manage().window().maximize();
                }
                case "edge-headless" -> {
                    System.setProperty("webdriver.edge.driver","src/test/resources/msedgedriver.exe");
                    driver = new EdgeDriver(new EdgeOptions().setHeadless(true));
                }
                case "edge" -> {
                    System.setProperty("webdriver.edge.driver","src/test/resources/msedgedriver.exe");
                    driver = new EdgeDriver();
                    driver.manage().window().maximize();
                }
            }
        }
        return driver;
    }

    public static void closeDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
