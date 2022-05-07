package to.tst.feeditback.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/to/tst/feeditback/SampleFeature"},
        glue = {"to/tst/feeditback/hooks", "to/tst/feeditback/stepDefinitions"},
        publish = true
)


public class TestRunner {
}
