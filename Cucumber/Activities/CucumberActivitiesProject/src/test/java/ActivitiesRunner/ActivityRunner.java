package ActivitiesRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

 
@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/java/Features",
    glue = {"stepDefinitions"},
//  tags ="@activity1_5",
//  plugin = {"html:src/test/java/Reports/test-report.html"},
    plugin = {"json:src/test/java/Reports/json-report.json"},
    monochrome = true
)
 

public class ActivityRunner {

}
