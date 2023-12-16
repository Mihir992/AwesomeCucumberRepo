package awesomecucumber.runners;
import static io.cucumber.testng.CucumberOptions.SnippetType.CAMELCASE;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

 @CucumberOptions(
		 plugin = {"pretty","html:target/cucumber-reports.html","summary"},
		 //plugin= {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		 snippets = CAMELCASE,
		 dryRun = true,
		 glue = {"awesomecucumber.factory","awesomecucumber.hooks"}
		 //features = "src/test/resources/feature"
		 )
 public class TestNGRunnerTest extends AbstractTestNGCucumberTests{  }