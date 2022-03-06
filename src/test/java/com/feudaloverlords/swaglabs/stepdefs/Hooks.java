package com.feudaloverlords.swaglabs.stepdefs;

import com.feudaloverlords.swaglabs.utilities.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    @Before
    public void setup(){
        DriverFactory.get().get("https://www.saucedemo.com/");
    }

    @After
    public void tearDown(Scenario scenario){
        if(scenario.isFailed()){
            final byte[] screenshot = ((TakesScreenshot) DriverFactory.get()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "my screenshot");
        }
        DriverFactory.closeDriver();
    }
}
