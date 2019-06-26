package testrunner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.mylibrary.testframework.driver.Browser;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/features", 
		glue= {"stepdefinitions"},
//		plugin = {"junit:target/cucumber-results.xml"}
		plugin = {"json:target/cucumber-report/cucumber.json"}
		)
public class TestRunner {
	
	@BeforeClass
	public static void openBrowser() {
		Browser.init();
	}
	
	@AfterClass
	public static void closeBrowser() {
		Browser.quit();
	}
}
