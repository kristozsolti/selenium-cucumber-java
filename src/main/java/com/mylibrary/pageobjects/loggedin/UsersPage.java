package com.mylibrary.pageobjects.loggedin;

import com.mylibrary.driver.Browser;
import com.mylibrary.helper.UrlCollection;
import com.mylibrary.pages.Page;

public class UsersPage extends Page {

	@Override
	public void goTo() {
		Browser.goTo(pagePath());
	}

	@Override
	public String pagePath() {
		return UrlCollection.USERS_PAGE;
	}

}
