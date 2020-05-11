package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "/Users/kollas/workspace1/CucumberBDD1/src/main/java/Features/tagging.feature",
		glue = ("stepdefinition"),
		format = {"pretty", "html:tag_output"},
		//snippets = SnippetType.CAMELCASE, // to change code snippets without underscore then use this option 
		monochrome = true,
		strict = true,
		dryRun = false,
		//tags = {"@SmokeTest", "~@RegressionTest", "~@End2End"}
//		tags = {"@SmokeTest", "@RegressionTest", "@End2End"}
				tags = {"@SmokeTest, @RegressionTest, @End2End"}
		)
public class TaggingRunner {

}
//OR-----Tags ={"@SmokeTest, @RegressionTest"}--- Executed all tests tagged as @SmokeTest OR @RegressionTest
//AND-----Tags = {"@SmokeTest", "@RegressionTest"}--- Executed all tests tagged as @SmokeTest And  @RegressionTest
//Ingnore one type of test  ----tags = {"~@SmokeTest","~@RegresionTest", "@End2End"} ----to ingnore running the particular tagged test

//By default code snippets are in underscore style(SnippetType.UNDERSCORE) ,