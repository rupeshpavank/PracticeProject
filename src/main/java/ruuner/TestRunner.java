package ruuner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\hi\\MVCExm\\Practice\\src\\main\\java\\cucumberPractice\\FinalTest.feature",//path of feature files
glue= {"stepDefinition"},//path of step definition
plugin = {"pretty", "html:test-output","json:json_output/cucumber.json"},
dryRun=false,
monochrome=true,
publish = false
)

public class TestRunner {
	
	

}
