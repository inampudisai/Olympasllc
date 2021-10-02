package com.energysolutions.runner;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberSerenityRunner;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty", "json:target/serenity-reports/cucumber_report.json"},
        features = "src/test/resources/features/",
        glue = "com.energysolutions",
        tags = "@test"
)
public class TestRunner {
}
