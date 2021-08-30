package CucumberOptions;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

// აქ გვინდა feature და StepDefinitions ფათი
@RunWith(Cucumber.class)
@CucumberOptions
        (
        features = "src/test/java/Features",
        glue = "StepDefinitions"
        )

public class TestRunner {



}
