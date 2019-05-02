package stepdefinitions.common;

import static org.junit.Assert.assertTrue;

import com.mylibrary.driver.Browser;
import com.mylibrary.helper.UrlCollection;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

public class HomePageStepDefinition {
	
  @Given("^A web browser$")
  public void given() throws Throwable {
  }

  @When("^I enter the webapplication address to the address bar$")
  public void when() throws Throwable {
	  Browser.goTo(UrlCollection.HOME_PAPGE_URL);
  }

  @Then("^I should be redirected to MyLibrary homepage$")
  public void then() throws Throwable {
	  Boolean isBrowserAtHomepage = Browser.isAtUrl(UrlCollection.HOME_PAPGE_URL);
	  assertTrue(isBrowserAtHomepage);
	  
//	  Browser.close();
  }

}
