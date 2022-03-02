package com.feudaloverlords.swaglabs.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.io.IOException;

public class DriverFactory {
    // singleton pattern

    private static WebDriver driver;

    private DriverFactory() {
    }

    private static ChromeOptions maximizedOptions(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        return options;
    }

    private static ChromeDriverService service(){
        ChromeDriverService service =  new ChromeDriverService
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
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");

        if (driver == null) {
            // you will write which browser with options you want to use in configuration.properties file
            // that needs to be put under the project (main) folder
            // more browsers can be added later on like Edge, Firefox etc.
            String browser = ConfigurationReader.get("browser");
            switch (browser) {
                case "chrome-headless" -> driver = new ChromeDriver(new ChromeOptions().setHeadless(true));
                case "chrome" -> driver = new ChromeDriver(maximizedOptions());
            }
        }
        return driver;
    }

    public static void closeDriver(){
        if(driver != null){
            driver.quit();
            driver = null;
        }
    }
}
