package stepdefinitions.common;

import static org.junit.Assert.assertTrue;

import com.mylibrary.testframework.pages.Pages;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AuthorsPageStepDefinition {
	
//	Scenario1
	@Given("MyLibrary Authors page")
	public void mylibrary_Authors_page() {
	    Pages.authorPage().goTo();
	}

	@When("I click on {string} view details link")
	public void i_click_on_view_details_link(String authorName) {
	    Pages.authorPage().goToAuthorsDetailsPageByName(authorName);
	}

	@Then("I should be redirected to {string} detail page")
	public void i_should_be_redirected_to_his_detail_page(String authorName) {
	    assertTrue(Pages.authorPage().isAtAuthorPage(authorName));
	}
	
//	Scenario2
	@When("^I enter author name (.*) to the search field$")
	public void i_enter_search_name_to_search_field(String searchName) throws Throwable {
	    Pages.authorsPage().fillSearchInput(searchName);
	}

	@When("Click on search form button")
	public void click_on_search_button() {
	    Pages.authorsPage().clickToSearchButton();
	}

	@Then("^I will get a result with (.*) name$")
	public void i_should_get_a_result_with_author_name(String authorName) throws Throwable {
	    assertTrue(Pages.authorsPage().isAuthorPresentAfterSearch(authorName));
	}
	
}
