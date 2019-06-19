package stepdefinitions.admin;

import static org.junit.Assert.assertTrue;

import com.mylibrary.testframework.helper.UrlCollection;
import com.mylibrary.testframework.pageobjects.common.MenuBar;
import com.mylibrary.testframework.pages.Pages;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddNewBookPageStepDefinition {
	 private String bookTitle = "";
	 
//	Scenario1
	@And("I go to books page")
	public void i_go_to_books_page() {
		Pages.booksPage().goTo();
	}

	@Then("Add new book button should be there")
	public void add_new_book_button_should_be_there() {
		assertTrue(Pages.booksPage().isAddNewBookButtonPresent());
	}

	@Then("If i click to add new book button")
	public void if_i_click_to_add_new_book_button() throws Throwable {
		Pages.booksPage().clickToAddNewBookButton();
	}

	@Then("I should be redirected to add new book page")
	public void i_should_be_redirected_to_add_new_book_page() {
		assertTrue(Pages.addNewBookPage().isAt(UrlCollection.ADD_NEW_BOOK_PAGE));
		MenuBar.performSignOut();
	}

//	Scenario2
	@When("I go to add new book page")
	public void i_go_to_add_new_book_page() {
		Pages.addNewBookPage().goTo();
	}

	@And("^Enter the book title (.*)$")
	public void enter_the_book_title(String title) {
		Pages.addNewBookPage().fillBookTitleField(title);
		this.bookTitle = title;
	}

	@And("^Enter the book isbn (.*)$")
	public void enter_the_book_isbn(String isbn) {
		Pages.addNewBookPage().fillBookIsbnField(isbn);
	}

	@And("^Enter the book cover photo url (.*)$")
	public void enter_the_book_cover_photo_url(String coverPhotoUrl) {
		Pages.addNewBookPage().fillBookCoverPhotoUrlField(coverPhotoUrl);
	}

	@And("Enter the book rating {double}")
	public void enter_the_book_rating(Double rating) {
		Pages.addNewBookPage().fillBookRatingField(rating);
	}

	@And("^Enter the book description (.*)$")
	public void enter_the_book_desc(String description) {
		Pages.addNewBookPage().fillBookDescritpionField(description);
	}

	@And("Enter the book page number {int}")
	public void enter_the_book_page_number(Integer pageNumber) {
		Pages.addNewBookPage().fillBookPageNumberField(pageNumber);
	}

	@And("Enter the book publication year {int}")
	public void enter_the_book_publication_year(Integer publicationYear) {
		Pages.addNewBookPage().fillBookPublicationYearField(publicationYear);
	}

	@And("^Enter the book publisher (.*)$")
	public void enter_the_book_publisher(String publisher) {
		Pages.addNewBookPage().fillBookPublisherField(publisher);
	}

	@And("^Select the book author (.*)$")
	public void select_the_book_author(String authorName) throws Throwable {
		Pages.addNewBookPage().selectBookAuthor(authorName);
	}

	@And("Click on Save book button")
	public void click_on_save_book_button() {
		Pages.addNewBookPage().clickOnSaveBookButton();
	}

	@Then("The new book should appear on the book list")
	public void the_new_book_should_appear_on_the_book_list() {
		assertTrue(Pages.booksPage().isBookPresentAfterSearch(this.bookTitle));
		MenuBar.performSignOut();
	}

}
