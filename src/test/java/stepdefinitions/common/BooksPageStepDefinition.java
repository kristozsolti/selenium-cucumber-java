package stepdefinitions.common;

import static org.junit.Assert.assertTrue;

import com.mylibrary.helper.UrlCollection;
import com.mylibrary.pages.Pages;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BooksPageStepDefinition {
//	Scenario1	
	@Given("MyLibrary Books page")
	public void mylibrary_Books_page() {
		Pages.booksPage().goTo();
	}

	@When("I click on the first Book view details link")
	public void i_click_on_the_first_Book_view_details_link() {
		Pages.booksPage().clickToFirstBookDetailLink();
	}

	@Then("I should be redirected to that book detail page")
	public void i_should_be_redirected_to_that_book_detail_page() {
		String firstBookPage = UrlCollection.BOOKS_PAPGE_URL + "/1";
		assertTrue(Pages.booksPage().isAtFirstBookPage(firstBookPage));
	}
	
// Scenario2
	@When("^I enter (.*) to search field$")
	public void i_enter_bookTitle_to_search_field(String searchTitle) throws Throwable {
	    Pages.booksPage().fillSearchInput(searchTitle);
	}

	@When("Click on search button")
	public void click_on_search_button() {
	    Pages.booksPage().clickToSearchButton();
	}

	@Then("^I should get a result with (.*)$")
	public void i_should_get_a_result_with_bookTitle(String bookTitle) throws Throwable {
	    assertTrue(Pages.booksPage().isBookPresentAfterSearch(bookTitle));
	}

}
