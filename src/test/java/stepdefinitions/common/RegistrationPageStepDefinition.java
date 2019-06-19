package stepdefinitions.common;

import static org.junit.Assert.assertTrue;

import com.mylibrary.testframework.helper.UrlCollection;
import com.mylibrary.testframework.pages.Pages;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegistrationPageStepDefinition {

//	Scenario1
	@When("I Click on Register here! link")
	public void i_click_on_register_here_link() throws Throwable {
		Pages.loginPage().clickOnRegistrationLink();
	}

	@Then("I should be redirected to the registration page")
	public void i_should_be_redirected_to_registration_page() throws Throwable {
		assertTrue(Pages.registrationPage().isAt(UrlCollection.REGISTRATION_PAPGE_URL));
	}
	
//	Scenario2
	@Given("Registration page")
	public void registration_page() {
	    Pages.registrationPage().goTo();
	}

	@When("I enter {string} to the email field")
	public void i_enter_to_the_email_field(String email) {
	    Pages.registrationPage().fillEmailField(email);
	}

	@And("I enter {string} to the password fields")
	public void i_enter_to_the_password_fields(String password) {
		Pages.registrationPage().fillPasswordFields(password);
	}

	@And("I click on register button")
	public void i_click_on_register_button() {
		Pages.registrationPage().clickOnRegisterButton();
	}

	@Then("I should be registered and get a success message")
	public void i_should_be_registered_and_get_a_success_message() {
		assertTrue(Pages.registrationPage().userSuccessfullyRegistered());
	}
	
//	Scenario3
	@Then("I should get an error message")
	public void i_should_get_an_error_message() {
		assertTrue(Pages.registrationPage().isUserExists());
	}

}
