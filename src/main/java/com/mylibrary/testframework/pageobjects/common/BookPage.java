package com.mylibrary.testframework.pageobjects.common;

import com.mylibrary.testframework.driver.Browser;
import com.mylibrary.testframework.helper.UrlCollection;
import com.mylibrary.testframework.pages.Page;

public class BookPage extends Page {

	@Override
	public void goTo() {
		Browser.goTo(pagePath());
	}
	
	public String getTopRatedBookUrl() {
		return UrlCollection.BOOKS_PAPGE_URL + "/1";
	}
	
	public Boolean isAtTopRatedBookPage(String url) {
		return url.equals(getTopRatedBookUrl());
	}
	
	@Override
	public String pagePath() {
		return UrlCollection.BOOKS_PAPGE_URL;
	}

}
