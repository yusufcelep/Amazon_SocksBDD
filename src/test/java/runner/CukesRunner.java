package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",
                "json:target/cucumber.json",
                "html:target/cucumber-reports.html",
                "junit:target/junit/junit-report.xml",
                "rerun:target/rerun.txt"
        },
        features = "src/test/resources/features",
        glue = "stepDefs",
        tags = "@smoke",
        dryRun = false
       // publish = true
)
public class CukesRunner {
}
