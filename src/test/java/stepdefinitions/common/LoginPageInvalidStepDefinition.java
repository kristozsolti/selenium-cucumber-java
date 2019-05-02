package stepdefinitions.common;

import static org.junit.Assert.assertEquals;

import com.mylibrary.pageobjects.common.LoginPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPageInvalidStepDefinition {
	private static final String USERNAME = "invalid_email@ex.com";
	private static final String PASSWORD = "randompassword";
	private static final String ERROR_MSG = "Check your username and password and try again.";

	@Given("^Application Login screen when invalid$")
	public void application_login_screen() throws Throwable {
		LoginPage.goTo();
	}

	@When("^I enter wrong credentials$")
	public void i_enter_wrong_credentials() throws Throwable {
		LoginPage.setUsernameField(USERNAME);
		LoginPage.setPasswordField(PASSWORD);
	}

	@And("^Click to login button when invalid$")
	public void click_to_login_button() throws Throwable {
		LoginPage.clickToLoginButton();
	}

	@Then("^I Should not be authenticated and get error message$")
	public void i_should_not_be_authenticated_and_get_error() throws Throwable {
		String errorMessage = LoginPage.wrongCredentialsError();
		assertEquals(errorMessage, ERROR_MSG);
	}
	
}
