package com.mylibrary.pageobjects.common;

import com.mylibrary.driver.Browser;
import com.mylibrary.helper.UrlCollection;
import com.mylibrary.pages.Page;

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

}
