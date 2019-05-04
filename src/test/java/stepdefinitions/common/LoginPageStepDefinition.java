package stepdefinitions.common;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.mylibrary.pages.Pages;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPageStepDefinition {
	
//	Scenario1
	@Given("^Application Login screen$")
	public void application_Login_screen() throws Throwable {
		Pages.loginPage().goTo();
	}

	@When("^I enter wrong credentials$")
	public void iEnterMyInvalidCredentials() throws Throwable {
		String username = "invalid_email@ex.com";
		String password = "randompassword";
		
		Pages.loginPage().setUsernameField(username);
		Pages.loginPage().setPasswordField(password);
	}

	@And("^Click to login button$")
	public void click_to_login_button() throws Throwable {
		Pages.loginPage().clickToLoginButton();
	}

	@Then("^I Should not be authenticated and get error message$")
	public void iShouldNotBeAuthenticatedAndGetErrorMessage() throws Throwable {
		String error_msg = "Check your username and password and try again.";
		String errorMessage = Pages.loginPage().wrongCredentialsError();
		assertEquals(errorMessage, error_msg);
	}

//	Scenario 2
	private static String USERNAME = "";

	@When("^I enter my ([^\"]*) and ([^\"]*)$")
	public void iEnterMyValidCredentials(String username, String password) throws Throwable {
		Pages.loginPage().setUsernameField(username);
		Pages.loginPage().setPasswordField(password);
		USERNAME = username;
	}

	@Then("^I Should be authenticated$")
	public void iShouldBeAuthenticated() throws Throwable {
		Boolean isUserAuthenticated = Pages.loginPage().isUserAuthenticated(USERNAME);
		assertTrue(isUserAuthenticated);
	}
	
}
