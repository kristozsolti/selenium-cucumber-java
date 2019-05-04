package stepdefinitions.common;

import static org.junit.Assert.assertTrue;

import com.mylibrary.pages.Pages;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AuthorsPageStepDefinition {
	
	@Given("MyLibrary Authors page")
	public void mylibrary_Authors_page() {
	    Pages.authorPage().goTo();
	}

	@When("I click on {string} view details link")
	public void i_click_on_view_details_link(String authorName) {
	    Pages.authorPage().goToJamieOliverDetailsPage();
	}

	@Then("I should be redirected to {string} detail page")
	public void i_should_be_redirected_to_his_detail_page(String authorName) {
	    assertTrue(Pages.authorPage().isAtJamieOliverPage(authorName));
	}
}
