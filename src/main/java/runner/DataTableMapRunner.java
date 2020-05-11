package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
	features = "/Users/kollas/workspace1/CucumberBDD1/src/main/java/Features/dataTableMaps.feature",
	glue = ("stepdefinition"),
	format = {"pretty", "html:datatablemap_output"},
	monochrome = true,
	strict = true,
	dryRun = false
		
		
		
		)
public class DataTableMapRunner {

}
