package stepdefinitions.common;

import static org.junit.Assert.assertTrue;

import com.mylibrary.testframework.pageobjects.common.MenuBar;
import com.mylibrary.testframework.pages.Pages;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ContactPageStepDefinition {

//	Scenario 1
	@Given("MyLibrary homepage")
	public void myLibraryHomePage() throws Throwable {
		Pages.homePage().goTo();
	}

	@When("^I click on Contact us link at the menubar$")
	public void iClickOnContactUsLink() throws Throwable {
		MenuBar.clickOnContactLink();
	}

	@Then("^I should be redirected to contact page$")
	public void iShouldBeRedirectedToContactPage() throws Throwable {
		assertTrue(Pages.contactPage().isAt());
	}

//	Scenario2
	@Given("^MyLibrary contact page$")
	public void as_MyLibrary_webpage_user() {
		Pages.contactPage().goTo();
	}

	@When("^I enter name (.*), email (.*) and message (.*) to the corresponding fields$")
	public void enter_my_name_email_and_message_to_the_corresponding_fields(String name, String email, String message) {		
		Pages.contactPage().fillContactForm(name, email, message);
	}

	@And("^Click on Send Message button$")
	public void click_on_Send_Message_button() {
		Pages.contactPage().submitContactForm();
	}

	@Then("^My message should be sent successfully$")
	public void my_message_should_be_sent_successfully() {
		assertTrue(Pages.contactPage().isContactMessageSentSuccessfully());
	}
}
