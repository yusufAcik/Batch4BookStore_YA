package com.bookstore.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features ="src/test/resources/features",
        glue = "com/bookstore/step_defs",
        dryRun = false,
        tags = "@wip-1"
)
public class CukesRunner {
}
