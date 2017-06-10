package amazonTestOne;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

// This is Cucumber runner class
// This will determine the flow of the feature file and report mechanism

@RunWith(Cucumber.class)
@CucumberOptions(tags=".",features=".",dryRun = false)
public class CucumberRunner {
}
