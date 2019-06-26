package com.mylibrary.testframework.pageobjects.common;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;

import com.mylibrary.testframework.driver.Browser;
import com.mylibrary.testframework.helper.UrlCollection;
import com.mylibrary.testframework.pages.Page;

public class AuthorPage extends Page {
	private static final String AUTHOR_NAME_ID = "author-name";

	public String getTopRatedAuthorUrl() {
		return UrlCollection.AUTHORS_PAPGE_URL + "/1";
	}

	@Override
	public void goTo() {
		Browser.goTo(pagePath());
	}

	@Override
	public String pagePath() {
		return UrlCollection.AUTHORS_PAPGE_URL;
	}

	public boolean isAtTopRatedAuthorPage(String url) {
		return url.equals(getTopRatedAuthorUrl());
	}

	public void goToAuthorsDetailsPageByName(String authorName) {
		WebElement authorDetailsLink = Browser.findById(authorName);
		authorDetailsLink.click();
	}

	public boolean isAtAuthorPage(String authorName) {
		String specificAuthorName = super.getElementTextById(AUTHOR_NAME_ID);
		return specificAuthorName.equals(authorName);
	}

	public boolean isAuthorPresent(String authorName) {
		List<WebElement> foundAuthors = Browser.findAllById(AUTHOR_NAME_ID);
		List<String> foundAuthorNames = new ArrayList<>();

		for (WebElement nameElement : foundAuthors) {
			foundAuthorNames.add(nameElement.getText());
		}

		return foundAuthorNames.contains(authorName);
	}

}
