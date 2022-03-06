package com.feudaloverlords.swaglabs.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
//@CucumberOptions(dryRun=true) check if all feature file steps have corresponding step definitions
//@CucumberOptions(monochrome=true) console output from Cucumber in a readable format,
@CucumberOptions(
        //dryRun = true,
        features = "src/test/resources/features",
        glue = {"com/feudaloverlords/swaglabs/stepdefs"},
        //summary, message, pretty
        plugin = {"pretty", "html:target/testReport.html", "json:target/jsonReport.json"},
        //tags=" add tag, preferably epics",
        publish = true,
        tags = "@all"
)

public class TestDriver {
}
