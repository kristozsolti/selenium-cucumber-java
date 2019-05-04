package com.mylibrary.pageobjects.common;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;

import com.mylibrary.driver.Browser;
import com.mylibrary.helper.UrlCollection;
import com.mylibrary.pages.Page;

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
		List<WebElement> bookDetailsLinkList= Browser.findAllByXpath("//a[@class='card-link']");
		
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
		WebElement searchInput = Browser.findById("book-title-search");
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

}
