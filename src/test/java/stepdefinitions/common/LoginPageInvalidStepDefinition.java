package stepdefinitions.common;

import static org.junit.Assert.assertEquals;

import com.mylibrary.pages.Pages;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPageInvalidStepDefinition {
	private static final String USERNAME = "invalid_email@ex.com";
	private static final String PASSWORD = "randompassword";
	private static final String ERROR_MSG = "Check your username and password and try again.";

	@Given("^Application Login screen when invalid$")
	public void applicationLoginScreen() throws Throwable {
		Pages.loginPage().goTo();
	}

	@When("^I enter wrong credentials$")
	public void iEnterMyInvalidCredentials() throws Throwable {
		Pages.loginPage().setUsernameField(USERNAME);
		Pages.loginPage().setPasswordField(PASSWORD);
	}

	@And("^Click to login button when invalid$")
	public void clickToLoginButton() throws Throwable {
		Pages.loginPage().clickToLoginButton();
	}

	@Then("^I Should not be authenticated and get error message$")
	public void iShouldNotBeAuthenticatedAndGetErrorMessage() throws Throwable {
		String errorMessage = Pages.loginPage().wrongCredentialsError();
		assertEquals(errorMessage, ERROR_MSG);
	}
	
}
