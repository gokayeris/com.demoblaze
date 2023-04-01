package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@CucumberOptions(
        tags = "@singup",
        glue = "stepDefinitions",
        features = "src/test/resources/features",
        dryRun = false
)
@RunWith(Cucumber.class)
public class Runner {
}
