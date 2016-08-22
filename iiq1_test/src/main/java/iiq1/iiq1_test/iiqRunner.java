package iiq1.iiq1_test;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:/Users/sreemitha/workspace/iiq1_test/src/test/resources/features",
		plugin = {"pretty", "html:target/myreport"},
		tags = {}
		)
public class iiqRunner {

}