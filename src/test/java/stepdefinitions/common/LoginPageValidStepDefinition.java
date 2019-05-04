package stepdefinitions.common;

import static org.junit.Assert.assertTrue;

import com.mylibrary.pages.Pages;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPageValidStepDefinition {

	private static String USERNAME = "";

	@Given("^Application Login screen$")
	public void applicationLoginScreen() throws Throwable {
		Pages.loginPage().goTo();
	}

	@When("^I enter my ([^\"]*) and ([^\"]*)$")
	public void iEnterMyValidCredentials(String username, String password) throws Throwable {
		Pages.loginPage().setUsernameField(username);
		Pages.loginPage().setPasswordField(password);
		USERNAME = username;
	}

	@And("^Click to login button$")
	public void clickToLoginButton() throws Throwable {
		Pages.loginPage().clickToLoginButton();
	}

	@Then("^I Should be authenticated$")
	public void iShouldBeAuthenticated() throws Throwable {
		Boolean isUserAuthenticated = Pages.loginPage().isUserAuthenticated(USERNAME);
		assertTrue(isUserAuthenticated);
	}
	
}
