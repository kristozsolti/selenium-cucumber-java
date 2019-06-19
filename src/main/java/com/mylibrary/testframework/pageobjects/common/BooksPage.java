package com.mylibrary.testframework.pageobjects.common;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;

import com.mylibrary.testframework.driver.Browser;
import com.mylibrary.testframework.helper.UrlCollection;
import com.mylibrary.testframework.pages.Page;

public class BooksPage extends Page {

	@Override
	public void goTo() {
		Browser.goTo(pagePath());
	}

	@Override
	public String pagePath() {
		return UrlCollection.BOOKS_PAPGE_URL;
	}

	public void clickToFirstBookDetailLink() {
		List<WebElement> bookDetailsLinkList = Browser.findAllByXpath("//a[@class='card-link']");

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
		WebElement searchInput = Browser.findByIdWait("book-title-search");
		searchInput.sendKeys(bookTitle);
	}

	public void clickToSearchButton() {
		WebElement searchButton = Browser.findById("search-button");
		searchButton.click();
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
		WebElement addNewBookButton = Browser.findByXpath("//a[@href='/books/add-new']");

		return addNewBookButton != null;
	}

	public void clickToAddNewBookButton() {
		WebElement addNewBookButton = Browser.findByXpath("//a[@href='/books/add-new']");
		addNewBookButton.click();
	}

}
