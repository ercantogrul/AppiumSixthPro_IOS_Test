package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/Features",
        glue = {"stepdefinitions", "utilities"},
        tags = "@Swaglabs",
        dryRun = false,
        plugin = {
                "pretty",
                "summary",
                "html:target/reports/Yusuf/iOS/cucumber-report.html"
        }
)
public class TestRunner extends AbstractTestNGCucumberTests {
}
