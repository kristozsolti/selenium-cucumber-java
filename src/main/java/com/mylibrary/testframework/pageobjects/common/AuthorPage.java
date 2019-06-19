package com.mylibrary.testframework.pageobjects.common;

import org.openqa.selenium.WebElement;

import com.mylibrary.testframework.driver.Browser;
import com.mylibrary.testframework.helper.UrlCollection;
import com.mylibrary.testframework.pages.Page;

public class AuthorPage extends Page {

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

	public void goToJamieOliverDetailsPage() {
		WebElement jamieOliverDetailsLink = Browser.findByXpathWait("//*[text()[contains(.,'Jamie Oliver')]]/../../../..//a");
		jamieOliverDetailsLink.click();
	}

	public boolean isAtJamieOliverPage(String authorName) {
		String jamieOliver = Browser.findById("author-name").getText();
		return jamieOliver.equals(authorName);
	}

	public boolean isAuthorPresent(String authorName) {
		WebElement newAuthorContainer = Browser.findByXpath("//*[text()[contains(.,'Jamie Oliver')]]");
		return newAuthorContainer != null;
	}

}