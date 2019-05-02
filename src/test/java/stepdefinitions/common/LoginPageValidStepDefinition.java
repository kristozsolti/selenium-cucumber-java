package stepdefinitions.common;

import static org.junit.Assert.assertTrue;

import com.mylibrary.pageobjects.common.LoginPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPageValidStepDefinition {

	private static String USERNAME = "";

	@Given("^Application Login screen$")
	public void application_login_screen() throws Throwable {
		LoginPage.goTo();
	}

	@When("^I enter my ([^\"]*) and ([^\"]*)$")
	public void i_enter_my_credentials(String username, String password) throws Throwable {
		LoginPage.setUsernameField(username);
		LoginPage.setPasswordField(password);
		USERNAME = username;
	}

	@And("^Click to login button$")
	public void click_to_login_button() throws Throwable {
		LoginPage.clickToLoginButton();
	}

	@Then("^I Should be authenticated$")
	public void i_should_be_authenticated() throws Throwable {
		Boolean isUserAuthenticated = LoginPage.isUserAuthenticated(USERNAME);
		assertTrue(isUserAuthenticated);
	}
	
}
