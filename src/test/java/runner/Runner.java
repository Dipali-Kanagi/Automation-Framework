package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/java/testcases",
		glue="stepdef",
		tags= {"@home"},
		monochrome=true,
		dryRun=false // it 
		)

public class Runner {

}
