package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
//import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\Rupa Acharya\\eclipse-workspace\\EcommerceBDDFramework\\src\\main\\java\\featuers\\CreateAccount.feature",// path of the features file
		glue ={"StepsDefinition"}, // flue means path of step definitions file
		format= {"pretty","html:test-output","json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"},
		monochrome = true,  // display the console output proper readable format
		strict = true, // when strict make true and dryRun false then it will falied if any step is not define inside step definition
		dryRun= true//  to check maping is proper between feature file and steps definition file 
		)

public class TestRunner {

}
