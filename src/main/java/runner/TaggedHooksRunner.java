package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "/Users/kollas/workspace1/CucumberBDD1/src/main/java/Features/taggedHooks.feature",
		glue = ("stepdefinition"),
		format = {"pretty", "html:taggedhooks_output"},
		monochrome = true,
		strict = true,
		dryRun = false
		
		
		)
public class TaggedHooksRunner {

}
