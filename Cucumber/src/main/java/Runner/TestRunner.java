package Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "/Users/juwel/Desktop/Automation 2021/Cucumber/src/main/java/Features"
        ,glue = {"stepDefinition"},
        dryRun = true

)

public class TestRunner
{
}
