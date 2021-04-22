package support;

import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features",
        glue = "src/test/java/step_definitions",
        plugin = {"pretty", "html:target/cucumber-html-report"}
)
public class TestRunner {
}
