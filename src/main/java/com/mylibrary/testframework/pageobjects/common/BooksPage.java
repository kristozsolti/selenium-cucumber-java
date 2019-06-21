package com.mylibrary.testframework.pageobjects.common;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;

import com.mylibrary.testframework.driver.Browser;
import com.mylibrary.testframework.helper.UrlCollection;
import com.mylibrary.testframework.pages.Page;

public class BooksPage extends Page {
	private static final String ADD_NEW_BOOK_BUTTON_ID = "add-new-book";
	private static final String SEARCH_BUTTON_ID = "search-button";
	private static final String SEARCH_BOOK_FIELD_ID = "book-title-search";
	private static final String BOOK_DETAILS_LINK_XPATH = "//a[@class='card-link']";

	@Override
	public void goTo() {
		Browser.goTo(pagePath());
	}

	@Override
	public String pagePath() {
		return UrlCollection.BOOKS_PAPGE_URL;
	}

	public void clickToFirstBookDetailLink() {
		List<WebElement> bookDetailsLinkList = Browser.findAllByXpath(BOOK_DETAILS_LINK_XPATH);

		WebElement firstBookLink = bookDetailsLinkList.get(0);
		firstBookLink.click();
	}

	public Boolean isAtFirstBookPage(String url) {
		return url.equals(getFirstBookUrl());
	}

	private String getFirstBookUrl() {
		return UrlCollection.BOOKS_PAPGE_URL + "/1";
	}

	public void fillSearchInput(String bookTitle) {
		super.fillInputFieldById(SEARCH_BOOK_FIELD_ID, bookTitle);
	}

	public void clickToSearchButton() {
		super.clickOnElementById(SEARCH_BUTTON_ID);
	}

	public Boolean isBookPresentAfterSearch(String bookTitle) {
		List<WebElement> foundBooks = Browser.findAllById("book-title");
		List<String> foundBooksTitles = new ArrayList<>();

		for (WebElement titleElement : foundBooks) {
			foundBooksTitles.add(titleElement.getText());
		}

		return foundBooksTitles.contains(bookTitle);
	}

	public boolean isAddNewBookButtonPresent() {
		WebElement addNewBookButton = Browser.findById(ADD_NEW_BOOK_BUTTON_ID);

		return addNewBookButton != null;
	}

	public void clickToAddNewBookButton() {
		super.clickOnElementById(ADD_NEW_BOOK_BUTTON_ID);
	}

}
