package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "./src/test/resources/featureFiles/ActitimeLogin.feature",
					glue = "stepdefinition")
public class Test1 extends AbstractTestNGCucumberTests {

}
