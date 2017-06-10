package amazonTestOne;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(tags=".",features=".",dryRun = false)
public class CucumberRunner {
}
