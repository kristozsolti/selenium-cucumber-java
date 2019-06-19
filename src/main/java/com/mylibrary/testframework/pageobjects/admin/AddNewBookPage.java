package com.mylibrary.testframework.pageobjects.admin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.mylibrary.testframework.driver.Browser;
import com.mylibrary.testframework.helper.UrlCollection;
import com.mylibrary.testframework.pages.Page;

public class AddNewBookPage extends Page {
	private static final String TITLE_FIELD_ID = "title";
	private static final String ISBN_FIELD_ID = "isbn";
	private static final String COVER_PHOTO_FIELD_ID = "photoUrl";
	private static final String RATING_FIELD_ID = "rating";
	private static final String DESCRIPTION_FIELD_ID = "description";
	private static final String PAGE_NUMBERS_FIELD_ID = "numberOfPages";
	private static final String PUBLICATION_YEAR_FIELD_ID = "publicationYear";
	private static final String PUBLISHER_FIELD_ID = "publicatedBy";
	private static final String AUTHOR_FIELD_ID = "author";

	@Override
	public void goTo() {
		Browser.goTo(pagePath());
	}

	@Override
	public String pagePath() {
		return UrlCollection.ADD_NEW_BOOK_PAGE;
	}

	public void fillBookTitleField(String title) {
		super.fillInputFieldById(TITLE_FIELD_ID, title);
	}

	public void fillBookIsbnField(String isbn) {
		super.fillInputFieldById(ISBN_FIELD_ID, isbn);
	}

	public void fillBookCoverPhotoUrlField(String coverPhotoUrl) {
		super.fillInputFieldById(COVER_PHOTO_FIELD_ID, coverPhotoUrl);
	}

	public void fillBookRatingField(Double rating) {
		super.fillInputFieldById(RATING_FIELD_ID, rating.toString());
	}

	public void fillBookDescritpionField(String description) {
		super.fillInputFieldById(DESCRIPTION_FIELD_ID, description);
	}

	public void fillBookPageNumberField(Integer pageNumber) {
		super.fillInputFieldById(PAGE_NUMBERS_FIELD_ID, pageNumber.toString());
	}

	public void fillBookPublicationYearField(Integer publicationYear) {
		super.fillInputFieldById(PUBLICATION_YEAR_FIELD_ID, publicationYear.toString());
	}

	public void fillBookPublisherField(String publisher) {
		super.fillInputFieldById(PUBLISHER_FIELD_ID, publisher);
	}

	public void selectBookAuthor(String authorName) {
		Select authorSelect = new Select(Browser.findById(AUTHOR_FIELD_ID));
		authorSelect.selectByVisibleText(authorName);
	}

	public void clickOnSaveBookButton() {
		WebElement saveBookButton = Browser.findById("save-book-button");
		saveBookButton.click();
	}
	
	

}
