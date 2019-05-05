package com.mylibrary.pageobjects.admin;

import com.mylibrary.driver.Browser;
import com.mylibrary.helper.UrlCollection;
import com.mylibrary.pages.Page;

public class AddNewAuthorPage extends Page {

	@Override
	public void goTo() {
		Browser.goTo(pagePath());
	}

	@Override
	public String pagePath() {
		return UrlCollection.ADD_NEW_AUTHOR_PAGE;
	}

}
