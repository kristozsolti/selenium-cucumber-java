package testrunner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.mylibrary.testframework.driver.Browser;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/features", 
		glue= {"stepdefinitions"},
		plugin = {"junit:target/cucumber-results.xml"}
		)
public class TestRunner {
	@AfterClass
	public static void closeBrowser() {
		Browser.quit();
	}
}
