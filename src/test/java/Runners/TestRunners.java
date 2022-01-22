package Runners;

import org.junit.runner.RunWith;
import cucumber.api.junit.*;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features ="src/test/java/features",
		glue="stepDefination"
		)
public class TestRunners {
	// System.out.println("test ...");



}
