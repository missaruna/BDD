package testRunners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
							features="features/loginPage.feature", 
							glue="stepDefinations"
				)
public class TestRunner_Pilot_Project {
	
	public static void main(String arg[]) {
		
	}
}
