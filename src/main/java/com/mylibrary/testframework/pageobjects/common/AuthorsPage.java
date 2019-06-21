package com.mylibrary.testframework.pageobjects.common;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;

import com.mylibrary.testframework.driver.Browser;
import com.mylibrary.testframework.helper.UrlCollection;
import com.mylibrary.testframework.pages.Page;

public class AuthorsPage extends Page {
	private static final String AUTHOR_NAME_SEARCH_FIELD_ID = "author-name-search";
	private static final String SEARCH_BUTTON_ID = "search-button";
	private static final String ADD_NEW_AUTHOR_BUTTON_ID = "add-new-author";

	public void fillSearchInput(String searchName) {
		super.fillInputFieldById(AUTHOR_NAME_SEARCH_FIELD_ID, searchName);
	}

	public void clickToSearchButton() {
		super.clickOnElementById(SEARCH_BUTTON_ID);
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

	public Boolean isAddNewAuthorButtonPresent() {
		WebElement addNewAuthorButton = Browser.findById(ADD_NEW_AUTHOR_BUTTON_ID);
		
		return addNewAuthorButton != null;
	}

	public void clickToAddNewAuthorButton() {
		super.clickOnElementById(ADD_NEW_AUTHOR_BUTTON_ID);
	}

}
