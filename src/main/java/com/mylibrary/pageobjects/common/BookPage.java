package com.mylibrary.pageobjects.common;

import com.mylibrary.driver.Browser;
import com.mylibrary.helper.UrlCollection;
import com.mylibrary.pages.Page;

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
