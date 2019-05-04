package stepdefinitions.common;

import static org.junit.Assert.assertTrue;

import com.mylibrary.driver.Browser;
import com.mylibrary.helper.UrlCollection;
import com.mylibrary.pages.Pages;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomePageStepDefinition {
	
//Scenario 1
	@Given("^A web browser$")
	public void openTheBrowser() throws Throwable {
	}

	@When("^I enter the webapplication address to the address bar$")
	public void iEnterTheApplicationUrl() throws Throwable {
		Browser.goTo(UrlCollection.HOME_PAPGE_URL);
	}

	@Then("^I should be redirected to MyLibrary homepage$")
	public void iShouldBeRedirectedToMyLibraryHomepage() throws Throwable {
		Boolean isBrowserAtHomepage = Browser.isAtUrl(UrlCollection.HOME_PAPGE_URL);
		assertTrue(isBrowserAtHomepage);
	}

//  Scenario 2
	@Given("The MyLibrary application homepage")
	public void the_MyLibrary_application_homepage() {
		Pages.homePage().goTo();
	}

	@When("I click on View details at Top Rated Books section")
	public void i_click_on_View_details_at_Top_Rated_Books_section() {
		Pages.homePage().clickOnTopRatedBook();
	}

	@Then("I should be redirected to the book detail page")
	public void i_should_be_redirected_to_the_book_detail_page() {
		String topRatedBookUrl = Pages.bookPage().getTopRatedBookUrl();

		assertTrue(Pages.bookPage().isAtTopRatedBookPage(topRatedBookUrl));
	}

// Scenario 3
	@When("I click on View details at Top Rated Authors section")
	public void i_click_on_View_details_at_Top_Rated_Authors_section() {
		Pages.homePage().clickOnTopRatedAuthor();
	}

	@Then("I should be redirected to the author detail page")
	public void i_should_be_redirected_to_the_author_detail_page() {
		String topRatedAuthorUrl = Pages.authorPage().getTopRatedAuthorUrl();

		assertTrue(Pages.authorPage().isAtTopRatedAuthorPage(topRatedAuthorUrl));
	}

}
