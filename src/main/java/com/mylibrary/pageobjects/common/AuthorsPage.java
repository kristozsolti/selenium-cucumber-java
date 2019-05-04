package com.mylibrary.pageobjects.common;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;

import com.mylibrary.driver.Browser;
import com.mylibrary.helper.UrlCollection;
import com.mylibrary.pages.Page;

public class AuthorsPage extends Page {

	public void fillSearchInput(String searchName) {
		WebElement searchInput = Browser.findByIdWait("author-name-search");
		searchInput.sendKeys(searchName);
	}

	public void clickToSearchButton() {
		WebElement searchButton = Browser.findById("search-button");
		searchButton.click();
	}

	public boolean isAuthorPresentAfterSearch(String authorName) {
		List<WebElement> foundAuthors = Browser.findAllById("author-name");
		List<String> foundAuthorNames = new ArrayList<>();
		
		for (WebElement titleElement : foundAuthors) {
			foundAuthorNames.add(titleElement.getText());
		}
		
		return foundAuthorNames.contains(authorName);
	}

	@Override
	public void goTo() {
		Browser.goTo(pagePath());
	}

	@Override
	public String pagePath() {
		return UrlCollection.AUTHORS_PAPGE_URL;
	}

}
